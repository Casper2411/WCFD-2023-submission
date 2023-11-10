import java.util.ArrayList;
import java.util.List;

public class Hello_world {

    public static void main(String[] args) {
        //This is my hello world program        
        System.out.println("Hello world!!!!!");
        List<Integer> TestList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestList.add(i);
        }
        for (Integer integer : TestList) {
            System.out.println(integer);
        }
    }
}