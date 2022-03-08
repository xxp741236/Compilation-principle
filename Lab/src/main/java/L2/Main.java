package L2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

/*public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        String file = args[0];
        is = new FileInputStream(file);
        CharStream input = CharStreams.fromStream(is);

        CmmLexer lexer = new CmmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        CmmSemanticListener listen = new CmmSemanticListener();
        //MyTreeListener listen = new MyTreeListener();
        walker.walk(listen, tree);
    }
}

class CmmSemanticListener extends CmmParserBaseListener {
    public HashTable hashtable = new HashTable();
    public boolean isstructure = false;//判断是否是structure
    ParseTreeProperty<Type> values = new ParseTreeProperty<>();
    ParseTreeProperty<String> names = new ParseTreeProperty<>();
    public CmmSemanticListener(){
        hashtable.set("read",new Function(new Int(Kind.INT),null));
        FieldList fieldList = new FieldList("wirteval",new Int(Kind.INT));
        hashtable.set("write",new Function(new Int(Kind.INT),fieldList));
    }

    @Override public void enterExtDecList(CmmParser.ExtDecListContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
    }
    @Override public void exitExtDecList(CmmParser.ExtDecListContext ctx) {
        if(values.get(ctx)==null) return;
        for(int i=0;i<ctx.varDec().size();i++){
            CmmParser.VarDecContext varDecContext = ctx.varDec(i);
            String name = names.get(varDecContext);
            Type type = values.get(varDecContext);
            if(type==null) continue;
            if(hashtable.get(name)!=null){
                System.err.println("Error type 3 at Line " + ctx.start.getLine() + ": Redefined variable.");
                return;
            }
            hashtable.set(name,type);
        }
    }
    @Override public void exitNormspf(CmmParser.NormspfContext ctx) {
        Type type;
        if(ctx.getText().equals("int")){
            type = new Int(Kind.INT);
        }else{
            type = new Float(Kind.FLOAT);
        }
        values.put(ctx.parent, type);
    }
    @Override public void exitStructspf(CmmParser.StructspfContext ctx) {
        Type type = values.get(ctx);
        values.put(ctx.parent,type);
    }
    @Override public void enterStructspf1(CmmParser.Structspf1Context ctx) {
        isstructure = true;
        if(ctx.optTag()!=null){
            String name = ctx.optTag().getText();
            if(name.length()==0) return;
            if(hashtable.get(name)!=null){
                values.put(ctx,new Structure("810975",null));
                System.err.println("Error type 16 at Line " + ctx.start.getLine() + ": Duplicated structure name." + name);
                return;
            }
        }
    }//如果结构体重名，就先建立一个空的struct的type在exit的时候删除，不然就在exit的建立
    @Override public void exitStructspf1(CmmParser.Structspf1Context ctx) {//struct初始化的情况
        isstructure = false;
        if(values.get(ctx)!=null){
            values.put(ctx,null);
            values.put(ctx.parent,null);
            return;
        }
        Type type;
        String name = "";
        List<CmmParser.DefContext> defctxs = ctx.defList().def();
        FieldList fieldList = new FieldList("",null);
        for(CmmParser.DefContext defContext:defctxs){
            List<CmmParser.DecContext> decctxs = defContext.decList().dec();
            for(CmmParser.DecContext decContext:decctxs){
                String decname = names.get(decContext);
                Type dectype = values.get(decContext);
                if(dectype==null) continue;
                if(decContext.ASSIGNOP()!=null){
                    System.err.println("Error type 15 at Line " + decContext.start.getLine() + ": Redefined field.");
                    continue;
                }//struct里面定义的field应该在哪里添加进入符号表,在哪里处理就在哪里加
                if(fieldList.getType()==null){//但是struct的fieldlist就在struct的声明处处理
                    fieldList = new FieldList(decname,dectype);
                }else{
                    fieldList.setNext(new FieldList(decname,dectype));
                }
            }
        }
        if(ctx.optTag()!=null){
            name = ctx.optTag().getText();
            type = new Structure(name,fieldList);
            hashtable.set(name,type);//如果struct有名字就需要设置符号表
        }else{
            type = new Structure(name,fieldList);
        }
        values.put(ctx.parent,type);
    }
    @Override public void exitStructspf0(CmmParser.Structspf0Context ctx) {//struct赋值的情况
        String name = ctx.tag().getText();
        if(hashtable.get(name)==null){
            System.err.println("Error type 17 at Line " + ctx.start.getLine() + ": Undefined structure.");
            return;
        }else if(hashtable.get(name).type.k!=Kind.STRUCTURE){
            System.err.println("Error type 17 at Line " + ctx.start.getLine() + ": Undefined structure.");
            return;
        }
        Structure type = (Structure)hashtable.get(name).type;
        values.put(ctx.parent,type);
    }

    @Override public void exitVarDec(CmmParser.VarDecContext ctx) {
        Type type = values.get(ctx.parent);
        String name = ctx.ID().getText();
        names.put(ctx,name);
        if(type==null) return;
        if(ctx.getText().contains("[")){
            type = new Array(type,ctx.LB().size());
        }
        values.put(ctx,type);
    }
    @Override public void enterFundec1(CmmParser.Fundec1Context ctx) {
        isstructure = false;
        String name = ctx.ID().getText();
        if(hashtable.get(name)!=null){//如果函数出现重名
            values.put(ctx.parent,null);
            System.err.println("Error type 4 at Line " + ctx.start.getLine() + ": Redefined.");
        }
    }
    @Override public void exitFundec1(CmmParser.Fundec1Context ctx) {
        Type returntype = values.get(ctx.parent);
        if(returntype==null) return;
        FieldList fieldList = new FieldList("",null);
        //递归设置函数参数
        List<CmmParser.ParamDecContext> paramDecContexts = ctx.varList().paramDec();
        for(CmmParser.ParamDecContext paramDecContext:paramDecContexts){
            Type type = values.get(paramDecContext);
            if(type==null) continue;
            String name = names.get(paramDecContext);
            if(fieldList.getType()==null){
                fieldList = new FieldList(name,type);
            }else{
                fieldList.setNext(new FieldList(name,type));
            }
        }
        Type functype = new Function(returntype,fieldList);
        hashtable.set(ctx.ID().getText(),functype);
    }
    @Override public void enterFundec0(CmmParser.Fundec0Context ctx) {
        isstructure = false;
        String name = ctx.ID().getText();
        if(hashtable.get(name)!=null){//如果函数出现重名
            values.put(ctx.parent,null);
            System.err.println("Error type 4 at Line " + ctx.start.getLine() + ": Redefined.");
        }
    }
    @Override public void exitFundec0(CmmParser.Fundec0Context ctx) {
        if(values.get(ctx.parent)==null) return;
        Type functype = new Function(values.get(ctx.parent),null);
        hashtable.set(ctx.ID().getText(),functype);
    }
    @Override public void exitParamDec(CmmParser.ParamDecContext ctx) {
        Type type = values.get(ctx.varDec());
        values.put(ctx,type);
        String name = names.get(ctx.varDec());
        names.put(ctx,name);
        if(hashtable.get(name)!=null){
            System.err.println("Error type 3 at Line " + ctx.start.getLine() + ": Redefined variable.");
            return;
        }
        hashtable.set(name,type);
    }
    @Override public void enterCompSt(CmmParser.CompStContext ctx) {
        if(values.get(ctx.parent)==null){
            ctx.children=null;
            return;
        }
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
        //System.err.println(type);
    }
    @Override public void enterStmtList(CmmParser.StmtListContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
    }
    @Override public void enterStmts(CmmParser.StmtsContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
    }
    @Override public void exitStmtret(CmmParser.StmtretContext ctx) {
        Type type = values.get(ctx.parent);//函数返回值应该有的type
        Type exptype = values.get(ctx.exp());
        if(type==null || exptype==null) return;
        if(type.k!=exptype.k){
            System.err.println("Error type 8 at Line " + ctx.start.getLine() + ": Type mismatched for return.");
        }else if(type.k==Kind.STRUCTURE){
            if(!((Structure)type).getName().equals(((Structure)exptype).getName())){
                FieldList fieldList1 = ((Structure)type).getMemberList();
                FieldList fieldList2 = ((Structure)exptype).getMemberList();
                if(fieldList1.getsize()!=fieldList2.getsize()){
                    System.err.println("Error type 8 at Line " + ctx.start.getLine() + ": Type mismatched for return.");
                }else if(fieldList1.getsize()>0){//field数量相同，具体判断内容是否相同
                    if(!fieldList1.isequal(fieldList2)){
                        System.err.println("Error type 8 at Line " + ctx.start.getLine() + ": Type mismatched for return.");
                    }
                }
            }
        }
    }
    @Override public void enterStmtjug(CmmParser.StmtjugContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
        Type exptype = values.get(ctx.exp());
        if(exptype==null) return;
        if(exptype.k!=Kind.INT){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
        }
    }

    @Override public void enterDefList(CmmParser.DefListContext ctx) {
        if(values.get(ctx.parent)!=null && values.get(ctx.parent).k==Kind.STRUCTURE){
            Structure type = (Structure)values.get(ctx.parent);
            if(type.getName().equals("810975")){
                ctx.children=null;
            }
        }
    }
    @Override public void enterDecList(CmmParser.DecListContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
    }
    @Override public void enterDec(CmmParser.DecContext ctx) {
        Type type = values.get(ctx.parent);
        values.put(ctx,type);
    }
    @Override public void exitDec(CmmParser.DecContext ctx) {
        Type type = values.get(ctx.varDec());
        if(type==null) return;
        values.put(ctx,type);
        String name = names.get(ctx.varDec());
        names.put(ctx,name);
        if(!isstructure){
            if(hashtable.get(name)!=null){
                values.put(ctx,null);
                System.err.println("Error type 3 at Line " + ctx.start.getLine() + ": Redefined variable.");
                return;
            }
            if(ctx.ASSIGNOP()!=null) {
                Type exptype = values.get(ctx.exp());
                if (exptype == null) return;
                if (type.k != exptype.k) {
                    System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                    return;
                }
                if(type.k==Kind.ARRAY){
                    Array lefttype = ((Array)type);
                    Array righttype = ((Array)exptype);
                    if(lefttype.arraytype.k!=righttype.arraytype.k){
                        System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                        values.put(ctx,null);
                        return;
                    }else if(lefttype.dim!=righttype.dim){
                        System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                        values.put(ctx,null);
                        return;
                    }
                }
                if(type.k==Kind.STRUCTURE){
                    if(!((Structure)type).getName().equals(((Structure)exptype).getName())){
                        FieldList member_left = ((Structure)type).getMemberList();
                        FieldList member_right = ((Structure)exptype).getMemberList();
                        if(member_left.getsize()!=member_right.getsize()){
                            System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                            values.put(ctx,null);
                            return;
                        }else if(member_left.getsize()>0){//field数量相同，具体判断内容是否相同
                            if(!member_left.isequal(member_right)){
                                System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                                values.put(ctx,null);
                                return;
                            }
                        }
                    }
                }
            }
            hashtable.set(name,type);
        }else {
            if(hashtable.get(name)!=null){
                values.put(ctx,null);
                System.err.println("Error type 15 at Line " + ctx.start.getLine() + ": Redefined variable.");
                return;
            }
            hashtable.set(name,type);
        }
    }
    //只有在做完vardec之后在exit高层规则的时候才能设置全局符号表，因为需要判断是不是数组的类型
    @Override public void exitExpfunc(CmmParser.ExpfuncContext ctx) {
        String name = ctx.ID().getText();
        Hashnode hashnode = hashtable.get(name);
        if(hashnode==null){
            System.err.println("Error type 2 at Line " + ctx.start.getLine() + ": Undefined variable.");
            return;
        }else{
            boolean iswrong = false;
            Type type = hashnode.type;
            if(type.k!=Kind.FUNCTION){
                System.err.println("Error type 11 at Line " + ctx.start.getLine() + ": is not a function.");
                return;
            }
            if(ctx.args()!=null && ((Function)type).getParamList()!=null){
                FieldList paramlist = ((Function)type).getParamList();
                List<CmmParser.ExpContext> expctxs = ctx.args().exp();
                if(paramlist.getsize()!=expctxs.size()){
                    System.err.println("Error type 9 at Line " + ctx.start.getLine() + ": wrong arguments.");
                    return;
                }
                for(int i=0;i<expctxs.size();i++){
                    if(values.get(ctx.args().exp(i))!=null){
                        if(paramlist==null || !paramlist.getType().isequal(values.get(ctx.args().exp(i)))){
                            iswrong = true;
                        }
                        paramlist = paramlist.getNext();
                    }
                }
            }else if(ctx.args()==null && ((Function)type).getParamList()==null){
                //没有参数，正常继续
            }else{
                System.err.println("Error type 9 at Line " + ctx.start.getLine() + ": wrong arguments.");
                return;
            }
            if(iswrong){
                System.err.println("Error type 9 at Line " + ctx.start.getLine() + ": wrong arguments.");
            }
            Type returntype = ((Function)type).getReturnType();
            values.put(ctx,returntype);
        }
    }
    @Override public void exitExparr(CmmParser.ExparrContext ctx) {
        Type type0 = values.get(ctx.exp(0));//在expid的时候已经访问过符号表，添加过类型
        Type type1 = values.get(ctx.exp(1));
        if(type0==null||type1==null) return;
        if(type0.k!=Kind.ARRAY){
            System.err.println("Error type 10 at Line "+ ctx.start.getLine() + ": not an array.");
        }else if(type1.k!=Kind.INT){
            System.err.println("Error type 12 at Line "+ ctx.start.getLine() + ": not an integer.");
        }else{//这段代码是为了修正数组嵌套的问题，给每一层的数组降维
            Array arraytype = ((Array)type0);
            if(arraytype.dim-1==0){
                values.put(ctx,arraytype.getArraytype());
            }else{
                values.put(ctx,new Array(arraytype.getArraytype(),arraytype.dim-1));
            }
        }
    }
    @Override public void exitExpstruct(CmmParser.ExpstructContext ctx) {
        String name = ctx.exp().getText();
        Type type = values.get(ctx.exp());
        if(type==null) return;
        if(type.k!=Kind.STRUCTURE){
            System.err.println("Error type 13 at Line " + ctx.start.getLine() + ": Illegal use of \".\"");
            return;
        }
        String membername = ctx.ID().getText();
        if(((Structure)type).getMemberList().find(membername)==null){
            System.err.println("Error type 14 at Line " + ctx.start.getLine() + ": Non-existent field.");
            return;
        }
        values.put(ctx,((Structure)type).getMemberList().find(membername));
    }
    @Override public void exitExpequ(CmmParser.ExpequContext ctx) {
        Type left = values.get(ctx.exp(0));
        Type right = values.get(ctx.exp(1));
        if(left==null||right==null) return;
        if(!left.leftval){
            System.err.println("Error type 6 at Line " + ctx.start.getLine() + ": The left-hand side of an assignment must be a variable.");
            return;
        }
        if(left.k!=right.k){
            System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
            values.put(ctx,null);
            return;
        }
        if(left.k==Kind.ARRAY){
            Array lefttype = ((Array)left);
            Array righttype = ((Array)right);
            if(lefttype.arraytype.k!=righttype.arraytype.k){
                System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                values.put(ctx,null);
                return;
            }else if(lefttype.dim!=righttype.dim){
                System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                values.put(ctx,null);
                return;
            }
        }
        if(left.k==Kind.STRUCTURE){
            if(!((Structure)left).getName().equals(((Structure)right).getName())){
                FieldList member_left = ((Structure)left).getMemberList();
                FieldList member_right = ((Structure)right).getMemberList();
                if(member_left.getsize()!=member_right.getsize()){
                    System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                    values.put(ctx,null);
                    return;
                }else if(member_left.getsize()>0){//field数量相同，具体判断内容是否相同
                    if(!member_left.isequal(member_right)){
                        System.err.println("Error type 5 at Line " + ctx.start.getLine() + ": Type mismatched for assignment.");
                        values.put(ctx,null);
                        return;
                    }
                }
            }
        }
        values.put(ctx,left);
    }
    @Override public void exitExpopt(CmmParser.ExpoptContext ctx) {
        Type fir = values.get(ctx.exp(0));
        Type sec = values.get(ctx.exp(1));
        if(fir==null||sec==null) return;
        if(fir.k!=Kind.INT && fir.k!=Kind.FLOAT){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
            return;
        }
        if(sec.k!=Kind.INT && sec.k!=Kind.FLOAT){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
            return;
        }
        if(fir.k!=sec.k){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
            return;
        }
        if(ctx.RELOP()==null){
            values.put(ctx,fir);
        }else{
            values.put(ctx,new Int(Kind.INT));
        }
    }
    @Override public void exitExpnot(CmmParser.ExpnotContext ctx) {
        Type type = values.get(ctx.exp());
        if(type==null) return;
        if(ctx.MINUS()!=null){
            if(type.k!=Kind.INT && type.k!=Kind.FLOAT){
                System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
                return;
            }
            values.put(ctx,type);
        }else{
            if(type.k!=Kind.INT){
                System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
                return;
            }
            values.put(ctx,type);
        }
    }
    @Override public void exitExpbin(CmmParser.ExpbinContext ctx) {
        Type fir = values.get(ctx.exp(0));
        Type sec = values.get(ctx.exp(1));
        if(fir==null||sec==null) return;
        if(fir.k!=Kind.INT){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
            return;
        }
        if(sec.k!=Kind.INT){
            System.err.println("Error type 7 at Line " + ctx.start.getLine() + ": Type mismatched for operands.");
            return;
        }
        values.put(ctx,new Int(Kind.INT));
    }
    @Override public void exitExpid(CmmParser.ExpidContext ctx) {
        String name = ctx.ID().getText();
        Hashnode hashnode = hashtable.get(name);
        if(hashnode==null){
            System.err.println("Error type 1 at Line " + ctx.start.getLine() + ": Undefined variable.");
        }else{
            Type type = hashnode.type;
            if(type==null) return;
            if(type.k==Kind.STRUCTURE && name.equals(((Structure)type).getName())){
                //不能直接使用struct的name来定义变量
                System.err.println("Error type 1 at Line " + ctx.start.getLine() + ": Undefined variable.");
                return;
            }
            values.put(ctx,type);
        }
    }
    @Override public void exitExpval(CmmParser.ExpvalContext ctx) {
        if(ctx.FLOAT()!=null){
            Float type = new Float(Kind.FLOAT);
            type.leftval = false;
            values.put(ctx,type);
        }else{
            Int type = new Int(Kind.INT);
            type.leftval = false;
            values.put(ctx,type);
        }
    }
    @Override public void exitExpnothing(CmmParser.ExpnothingContext ctx) {
        Type type = values.get(ctx.exp());
        values.put(ctx,type);
    }
}

enum Kind {
    INT,
    FLOAT,
    ARRAY,
    STRUCTURE,
    FUNCTION
}
class Type {
    protected Kind k;
    protected boolean leftval = true;
    public boolean isequal(Type type){
        if(type.k!=k){
            return false;
        }
        return true;
    }
}
class Int extends Type{
    public Int(Kind k){
        this.k =k;
    }
}
class Float extends Type{
    public Float(Kind k){
        this.k =k;
    }
}
class Array extends Type{
    Type arraytype;
    int dim;
    public Array(Type t,int d){
        this.k=Kind.ARRAY;
        this.arraytype=t;
        this.dim=d;
    }
    public Type getArraytype() {
        return arraytype;
    }
}
class Function extends Type {
    private Type returnType;
    private FieldList paramList;
    public Function(Type t,FieldList p){
        this.leftval=false;
        this.k=Kind.FUNCTION;
        this.returnType = t;
        this.paramList = p;
    }
    public Type getReturnType() {
        return returnType;
    }
    public FieldList getParamList() {
        return paramList;
    }
}
class Structure extends Type{
    private String name;
    private FieldList memberList;
    public Structure(String n,FieldList m){
        this.k=Kind.STRUCTURE;
        this.name = n;
        this.memberList = m;
    }
    public String getName() {
        return name;
    }
    public FieldList getMemberList() {
        return memberList;
    }
}
class FieldList {
    private String name;
    private Type type;
    private FieldList next;
    public FieldList(String name,Type type){
        this.name=name;
        this.type=type;
    }
    public String getName() { return name; }
    public Type getType() {
        return type;
    }
    public FieldList getNext() {
        return next;
    }
    public void setNext(FieldList next){
        FieldList temp = this;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=next;
    }
    public Type find(String name){
        FieldList temp = this;
        while(temp!=null){
            if(temp.name.equals(name)){
                return temp.getType();
            }
            temp = temp.next;
        }
        return null;
    }
    public int getsize(){
        int count=0;
        FieldList temp = this;
        while(temp!=null && temp.getType()!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean isequal(FieldList f){
        if(this.getType().k!=f.getType().k){
            return false;
        }
        if(this.getType().k==Kind.ARRAY){
            Array type1 = (Array)this.getType();
            Array type2 = (Array)f.getType();
            if(type1.dim!=type2.dim){
                return false;
            }
            if(type1.arraytype.k!=Kind.STRUCTURE){
                if(type1.arraytype.k!=type2.arraytype.k){
                    return false;
                }
            }else{
                Structure type3 = (Structure)type1.arraytype;
                Structure type4 = (Structure)type2.arraytype;
                if(!type3.getMemberList().isequal(type4.getMemberList())){
                    return false;
                }
            }
        }else if(this.getType().k==Kind.STRUCTURE){
            Structure type1 = (Structure)this.getType();
            Structure type2 = (Structure)f.getType();
            if(!type1.getMemberList().isequal(type2.getMemberList())){
                return false;
            }
        }
        if(f.next!=null){
            return this.next.isequal(f.next);
        }
        return true;
    }
}

//构建符号表
class Hashnode {
    String name;
    Type type;
    Hashnode next;
    public Hashnode(String name,Type t,Hashnode next){
        this.name=name;
        this.type=t;
        this.next=next;
    }
}
class HashTable {
    private static final int HASH_TABLE_SIZE=20000;
    private  Hashnode[] table;
    public HashTable() {
        table = new Hashnode[HASH_TABLE_SIZE];
    }

    public void set(String name,Type t){
        int index = getHashIndex(name);
        if(table[index]==null){
            table[index]=new Hashnode("",null,null);
        }
        Hashnode root = table[index];
        if(root.next!=null) {
            while (root.next != null) {
                root = root.next;
            }
        }
        Hashnode now = new Hashnode(name,t,null);
        root.next=now;
    }

    public Hashnode get(String name){
        int index=getHashIndex(name);
        Hashnode temp = table[index];
        while(temp!=null){
            if(temp.name.equals(name)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    private int getHashIndex(String name) {
        int val = 0, i;
        for (char c : name.toCharArray()) {
            val = (val << 2) + (int) c;
            // HASH_TABLE_SIZE描述了符号表的⼤⼩
            if ((i = (val & ~HASH_TABLE_SIZE)) != 0) {
                val = (val ^ (i >> 12)) & HASH_TABLE_SIZE;
            }
        }
        return val;
    }
}*/