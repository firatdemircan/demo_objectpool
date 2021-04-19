package com.works.pool;

import java.util.ArrayList;
import java.util.List;

public class CouirerPool {

    //we make this static so that noone creating it
    static CouirerPool instance = new CouirerPool();

    //you have to make sure that you initilazie with arraylist or you will get an error
    List<Couirer> poolCouirer=new ArrayList<>();

    //we are creating a pool of couriers in constructor so when we call the object all 5 is ready to use
    public CouirerPool(){
        for (int i = 0; i < 5; i++) {
            poolCouirer.add(new Couirer("Ali"+i));
        }
    }

    //we are getting one courier from the pool
    static Couirer getCouirer() throws Exception {

        if (instance.poolCouirer.size() == 0) {
            throw new Exception();
        }

        Couirer couirer = instance.poolCouirer.get(0);
        instance.poolCouirer.remove(0);

        return couirer;
    }


    //we are realesing a courier from the pool
    public static void relaseCourier( Couirer couirer ) {
        if ( couirer != null ) {
            instance.poolCouirer.add(couirer);
        }
    }

}
