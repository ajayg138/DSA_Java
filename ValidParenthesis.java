import java.util.*;

public class ValidParenthesis{


    public static boolean isValid(String str){

        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(isOpening(cur)){
                s.push(cur);
            }else{
                if(s.isEmpty()){
                    return false;
                }else if(!isMatching(s.peek(),cur)){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }


    public static boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        boolean res=isValid(str);
        if(!res){
            System.out.println("Not Valid Parenthesis");
        }else{
            System.out.println("Valid Parenthesis");
        }
    }
}