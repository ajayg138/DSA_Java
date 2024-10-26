public class SCP{

    public static void main(String[] args){

        //Store in Heap Area
        String s1=new String("Deepak");
        String s2=new String("Deepak");

        System.out.println(s1==s2);
                System.out.println(s1.equals(s2));



//Store in SCP
        String s3="Amit";
        String s4="amit";
        System.out.println(s3==s4);



        String s5=new String();
        System.out.println(s5.length());
        System.out.println(s5);


        //byte array to String
        byte[] b={101,102,103};
        char[] ch={'a','j','a','y'};
        String s6=new String(ch);
        System.out.println(s6);


        char[] chh=new char[]{'a','b','c'};

        String s7=new String("ABC");

        System.out.println("chh- "+chh);
        System.out.println("s7- "+s7);


        String s8=" Ajay Ramchandra Gole ";
        String res=s8.replaceAll("\\s","-");
        System.out.print(res);

         String s9=new String("     ");
         System.out.println(s9.length());

         System.out.println(s3.equals(s4));
          System.out.println(s3.equalsIgnoreCase(s4));

        String str="A";
        String str1="a";
        System.out.println(str.compareTo(str1));


        String str3="Ajay";
        String str4="Gole";

        System.out.println(str3+str4);
        System.out.println(str3+str4+10);
        System.out.println(str3+str4+10+10);
        System.out.println(10+10+str3+str4);
        System.out.println(10+str3+10+str4);
        System.out.println(str3+str4+1000/200);
        // System.out.print(str3+str4+10-4);
        System.out.println(String.join("--",str3,str4));
        System.out.println(String.join("/",str3,str4));


        String strr="yyyAjay Golezzz";
        System.out.println(strr.subSequence(3,12));
        System.out.println(strr.substring(3));


        String s="This Java was Good...";
        System.out.println(s.replace("was","is"));
        System.out.println(s.replaceFirst("a","A"));


        System.out.println(s.replaceAll("\\s",""));
        System.out.println(s.replaceAll("is(.)",""));

        System.out.println(s.indexOf("w"));
        System.out.println(s.indexOf("Th"));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.charAt(5));
        System.out.println(s.contains("w"));
        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("T"));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());



        int a=10;
        String ss=String.valueOf(a);
        System.out.println(ss);
        System.out.println(ss+10);

        char[] crt=s.toCharArray();
        System.out.println(crt);

        // StringBuffer sb=new StringBuffer("Ajay");
        // StringBuffer sb=new StringBuffer(100);
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Ajay Gole");
        System.out.println(sb.capacity());

        sb.append("Ajay Ramchandra Gole");
        System.out.println(sb.capacity());

        sb.append("Ajay Ramchandra Gole Pune Ajay Ramchandra Gole Pune");
        // System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb);

    
    }
}