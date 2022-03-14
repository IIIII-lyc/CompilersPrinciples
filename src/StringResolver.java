import java.util.regex.Pattern;

public class StringResolver {
	
	public static String resolve(String str) {
		str = removeSpaceAndLineBreak(str);
		return str;
	}
	
	private static String removeSpaceAndLineBreak(String str) {
		str = str.trim();
		return str.replaceAll("[\\t|\\n|\\x0B|\\f|\\r]", "");
	}
	
	

}
