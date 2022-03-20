import java.util.HashSet;
import java.util.Set;

public class Token {
    //数据类型
    public static Set<String> TYPE;
    //语句
    public static Set<String> STATMENT;
    //修饰符
    public static Set<String> MODIFIER;
    //其他
    public static Set<String> OTHER;
    //relop
    public static Set<String> OPERATOR;
    //界符
    public static Set<String> SEPARATOR;

    static {
        TYPE = new HashSet<>();
        STATMENT = new HashSet<>();
        MODIFIER = new HashSet<>();
        OTHER = new HashSet<>();
        OPERATOR = new HashSet<>();
        SEPARATOR = new HashSet<>();

        TYPE.add("boolean");
        TYPE.add("byte");
        TYPE.add("char");
        TYPE.add("double");
        TYPE.add("float");
        TYPE.add("int");
        TYPE.add("long");
        TYPE.add("new");
        TYPE.add("short");
        TYPE.add("void");
        TYPE.add("instanceof");

        STATMENT.add("break");
        STATMENT.add("case");
        STATMENT.add("catch");
        STATMENT.add("continue");
        STATMENT.add("default");
        STATMENT.add("do");
        STATMENT.add("else");
        STATMENT.add("for");
        STATMENT.add("if");
        STATMENT.add("return");
        STATMENT.add("switch");
        STATMENT.add("try");
        STATMENT.add("while");
        STATMENT.add("finally");
        STATMENT.add("throw");
        STATMENT.add("this");
        STATMENT.add("super");

        MODIFIER.add("abstract");
        MODIFIER.add("final");
        MODIFIER.add("native");
        MODIFIER.add("private");
        MODIFIER.add("protected");
        MODIFIER.add("public");
        MODIFIER.add("static");
        MODIFIER.add("synchronized");
        MODIFIER.add("transient");
        MODIFIER.add("volatile");

        OTHER.add("class");
        OTHER.add("extends");
        OTHER.add("implements");
        OTHER.add("interface");
        OTHER.add("package");
        OTHER.add("import");
        OTHER.add("throws");


        OPERATOR.add(">");
        OPERATOR.add(">=");
        OPERATOR.add("<");
        OPERATOR.add("<=");
        OPERATOR.add("=");
        OPERATOR.add("==");
        OPERATOR.add("!=");

        OPERATOR.add("&");
        OPERATOR.add("&&");
        OPERATOR.add("|");
        OPERATOR.add("||");
        OPERATOR.add("!");

        OPERATOR.add("+");
        OPERATOR.add("++");
        OPERATOR.add("+=");
        OPERATOR.add("-");
        OPERATOR.add("--");
        OPERATOR.add("-=");
        OPERATOR.add("*");
        OPERATOR.add("*=");
        OPERATOR.add("/");
        OPERATOR.add("/=");
        OPERATOR.add("%");
        OPERATOR.add("%=");

        OPERATOR.add("(");
        OPERATOR.add(")");

        SEPARATOR.add("{");
        SEPARATOR.add("}");
        SEPARATOR.add(";");
    }

}
