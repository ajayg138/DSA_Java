import java.util.HashSet;

public class uniqueCharacter {

    public static int cntDistinct(String str){
        HashSet<Character> s=new HashSet<>();

        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }

        return s.size();
    }

    public static void main(String[] args) {
        String str = "primecoding";
        System.out.print(cntDistinct(str));

    }
}
