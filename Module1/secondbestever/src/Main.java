public class Main {
    public static void main(String[] args) {
        String moreFun = "Fun";
        System.out.println(getInfo() == "Fun");
        System.out.println(getInfo() == moreFun);
        System.out.println(getInfo() == "Fun");
    }

    public static String getInfo(){
        return("Fun");
    }
}