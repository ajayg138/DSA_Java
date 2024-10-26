public class ReverseString{

    public static void main(String[] args){

        // StringBuffer sb=new StringBuffer("eloG yajA");


        // // sb.reverse();
        // // System.out.println(sb);


        // int n=sb.length();
        // StringBuffer rev=new StringBuffer();
        // for(int i=n-1;i>=0;i--){
        //     rev.append(sb.charAt(i));
        // }
        // System.out.println(rev);


        String str="eloG yajA";

        String rev="";
        int n=str.length();

        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println("Reverse String is: "+rev);
        
    }
}