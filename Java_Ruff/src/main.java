

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class main {


    public static void main(String[] args) {

        main m = new main();

        System.out.println(m.getRandomLongwithRange());

    }



    public Long getRandomLongwithRange()
    {
        int range = 1000;
        Random r = new Random();
        Long res = Long.valueOf(r.nextInt(range));
        return  res;
    }


    public void getList()
    {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        for (Integer l1:l) {

            System.out.println(l1);
        }

    }
    
}
