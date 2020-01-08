package ValidBraces;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;
public class Brackets {
    private static Map<String,String> leftRight = Map.of("{", "}", "[", "]", "(", ")");

    public static List<String> split(String s){
	    List<String> result =  Stream.of(s.split(""))
		    .filter(Predicate.not(x -> x.isBlank()))
		    .collect(Collectors.toList());
	    return result;
    }

    public static boolean testBracketExpression(String s){

	    var brackets = Brackets.split(s);
	    var leftBrackets = new  LinkedList<String>();
	    if (brackets.size()% 2 != 0) return false;

    	    for (var i : brackets){
	    	if(leftRight.containsValue(i) && leftBrackets.isEmpty()){
		       	return false;
		}
	   	else if (leftRight.containsKey(i)){
			leftBrackets.add(i);
			continue;
		}
		else if(leftRight.containsValue(i) && leftRight.get(leftBrackets.getLast()).equals(i)){
			leftBrackets.removeLast();
			continue;
		}
		else return false;
	    }

	    return leftBrackets.isEmpty();
    }
}
