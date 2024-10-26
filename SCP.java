public class SCP{

    public static void main(String[] args){

        //Store in Heap Area
        String s1=new String("Deepak");
        String s2=new String("Deepak");

        System.out.println(s1==s2);


//Store in SCP
        String s3="Amit";
        String s4="Amit";
        System.out.println(s3==s4);

    }
}