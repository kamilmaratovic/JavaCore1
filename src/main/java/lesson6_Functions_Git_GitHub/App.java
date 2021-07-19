package lesson6_Functions_Git_GitHub;

public class App {
    public static void main(String[] args) {
        String xx = "Nik";
    String result = getHello(xx);
        System.out.println(result);
        String secondResult = getHello(result);
        System.out.println(secondResult);
        String thirdResult = getHello(getHello(result));
        System.out.println(thirdResult);
    }
    public static String getHello (String name){
        return "Hello, "+name;
    }
}
