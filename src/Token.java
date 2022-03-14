import java.util.HashSet;
import java.util.Set;

public class Token {
	public static Set<String> TYPE;
	public static Set<String> STATMENT;
	public static Set<String> MODIFIER;
	public static Set<String> OTHER;
	public static Set<String> OPERATOR;

	static {
		TYPE=new HashSet<>();
		STATMENT=new HashSet<>();
		MODIFIER=new HashSet<>();
		OTHER=new HashSet<>();
		OPERATOR=new HashSet<>();
		
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
		OPERATOR.add("+=");
		OPERATOR.add("-");
		OPERATOR.add("-=");
		OPERATOR.add("*");
		OPERATOR.add("*=");
		OPERATOR.add("/");
		OPERATOR.add("/=");
		OPERATOR.add("%");
		OPERATOR.add("%=");
		
	}
	
}
