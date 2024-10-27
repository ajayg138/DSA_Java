public class RemoveDupFromString{

    public static String removeDup(String str){
        boolean[] seen=new boolean[256];
        StringBuilder res=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(!seen[ch]){
                seen[ch]=true;
                res.append(ch);
            }
        }
        return res.toString();

    }

    public static void main(String[] args){
        String input="programming";
        String output=removeDup(input);
        System.out.println("Original String: "+input);
                System.out.println("Without Duplicates: "+output);
        
    }
}