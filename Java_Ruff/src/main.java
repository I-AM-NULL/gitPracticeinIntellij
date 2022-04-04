import org.omg.Messaging.SyncScopeHelper;

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


}
