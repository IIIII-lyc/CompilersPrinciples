import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {
	public static void main(String[] args) {
		
	}
	
	List<String> scan(String source) {
		List<String> result=new ArrayList<>();
		StringBuilder token=new StringBuilder();
		int state=0,index=0;
		
		int strLen = source.length();
		for(int i=0;i<strLen;) {
			char c = source.charAt(i);
			if(c ==' ')
				i++;
			//�����
			if (Token.OPERATOR.contains(c)) {
				if (i+1 <strLen ) {
					String op = String.valueOf(c) + String.valueOf(source.charAt(i+1));
					if (Token.OPERATOR.contains(op)) {
						result.add(op);
						i+=2 ;
						continue;
					}
				}
				result.add(String.valueOf(c));
			}
			//����
			if (Character.isDigit(c)) {
				do {
					token.append(c);
					i++;
				} while (i< strLen && Character.isDigit(c = source.charAt(i)));
				if (i<strLen && c == '.') {
					do {
						token.append(c);
						i++;
					} while (i< strLen && Character.isDigit(c = source.charAt(i)));
				}
				result.add(token.toString());
				token.setLength(0);
			}
			//��ĸ���»���
			if (Character.isLetter(c) || c == '_') {
				do {
					token.append(source.charAt(i));
					i++;
				} while (i < strLen && Character.isLetterOrDigit(source.charAt(i)));
				result.add(token.toString());
				token.setLength(0);
			}
				
			
		}
		return result;	
	}
}


