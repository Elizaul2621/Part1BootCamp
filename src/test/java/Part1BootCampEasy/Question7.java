package Part1BootCampEasy;

public class Question7 {


    public static String reversed(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(Question7.reversed("My name is Elizaul"));
    }

}
