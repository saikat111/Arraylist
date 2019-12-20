import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Collections;


public class Myclass extends ArrayList<String> {
    public  static void main(String args []){
        Myclass car = new Myclass();
        car.add("a");
        car.add("b");
        System.out.println(car.get(1));
        car.set(1,"hi");
        System.out.println(car);
        car.remove(1);
        System.out.println(car);
        car.removeRange(0,1);
        System.out.println(car);

    }


}
