package Report5;
import java.lang.NullPointerException;

public class App {
    public static void main(String[] args) {
        try{
        String str = null;
        System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("入力がありません");
            System.out.println(e.getMessage());
        }
    }
}
