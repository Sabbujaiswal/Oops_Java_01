public class JDBC_Isert {
    public static void main(String[] args) {
        //Mutable and Immutable Learn--
        String str="Jack";//String is immutable
        str.concat("Sabbu");
        System.out.println(str);
        String st = new String("Ram");
        st.concat("he");
        System.out.println(st);
        System.out.println(st.concat("ji"));

        //StringBuffer and String BUilder class is mutable
        StringBuffer st1= new StringBuffer("Hey");
        st1.append("Hi");
        System.out.println(st1);
    }
}
