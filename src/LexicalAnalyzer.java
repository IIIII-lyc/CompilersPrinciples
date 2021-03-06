import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalyzer {
    public static void main(String[] args) {
        FileReader reader = new FileReader("test.txt");
        String str = reader.readString();
        System.out.println("test="+str.charAt(1)+"=end");
        List<String> scan = scan(str);
        analyse(scan);
    }

    public static List<String> scan(String source) {
        List<String> result = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        int strLen = source.length();
        for (int i = 0; i < strLen; ) {
            char c = source.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            }

            if (Token.OPERATOR.contains(String.valueOf(c))) {
                if (i + 1 < strLen) {
                    String op = c + String.valueOf(source.charAt(i + 1));
                    if (Token.OPERATOR.contains(op)) {
                        result.add(op);
                        i += 2;
                        continue;
                    }
                }
                result.add(String.valueOf(c));
                i++;
                continue;
            }

            if (Character.isDigit(c)) {
                do {
                    token.append(c);
                    i++;
                } while (i < strLen && Character.isDigit(c = source.charAt(i)));
                if (i < strLen && c == '.') {
                    do {
                        token.append(c);
                        i++;
                    } while (i < strLen && Character.isDigit(c = source.charAt(i)));
                }
                if (i < strLen && (c == 'E' || c == 'e')) {
                    do {
                        token.append(c);
                        i++;
                    } while (i < strLen && Character.isDigit(c = source.charAt(i)));
                }

                if (source.charAt(i) != ' ' && !Token.SEPARATOR.contains(String.valueOf(source.charAt(i)))) {
                    while (i < strLen && (c = source.charAt(i)) != ' ' && !Token.OPERATOR.contains(String.valueOf(c))
                            && !Token.SEPARATOR.contains(String.valueOf(c))) {
                        token.append(c);
                        i++;
                    }
                    result.add(token + "  ERROR");
                } else {
                    result.add(token.toString());
                }
                token.setLength(0);
            }

            if (isVariable(c)) {
                do {
                    token.append(source.charAt(i));
                    i++;
                } while (i < strLen && (isVariable(c = source.charAt(i)) || Character.isDigit(c)));
                result.add(token.toString());
                token.setLength(0);
            }

            if (i < strLen && c != ' ' && !Token.OPERATOR.contains(String.valueOf(c))) {
                result.add(String.valueOf(c));
                i++;
            }

        }
        return result;
    }

    public static boolean isVariable(char c) {
        if (Character.isLetter(c) || c == '_' || c == '$')
            return true;
        return false;
    }


    public static void analyse(List<String> list) {
        String isFloat = "[+-]?[\\d]+([\\.][\\d]*)?([Ee][+-]?[0-9]{0,2})?";
        for (String str : list) {
            String strings = null;
            if (Token.TYPE.contains(str))
                strings = "????????????";
            else if (Token.STATMENT.contains(str))
                strings = "??????";
            else if (Token.MODIFIER.contains(str))
                strings = "?????????";
            else if (Token.OTHER.contains(str))
                strings = "??????";
            else if (Token.OPERATOR.contains(str))
                strings = "?????????";
            else if (Token.SEPARATOR.contains(str))
                strings = "?????????";
            else if (Pattern.matches(isFloat, str))
                strings = "num";
            else
                strings = "??????";
            System.out.println("<" + str + "," + strings + ">");
        }
    }

}


