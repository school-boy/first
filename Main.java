package suo;

import javax.management.StandardEmitterMBean;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 17-3-26.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello world!");
        System.out.println(UUID.randomUUID().toString());
        print();
    }

    private static void print() {
        System.out.println(System.getProperties());
    }
}
