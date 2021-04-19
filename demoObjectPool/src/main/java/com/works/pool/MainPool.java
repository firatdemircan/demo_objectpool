package com.works.pool;

import java.util.List;

public class MainPool {

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 9; i++) {
            Couirer couirer = CouirerPool.getCouirer();
            System.out.println(couirer.getName()+"is in delivery");
            CouirerPool.relaseCourier(couirer);
        }

        /*
        the output in the following code will be like
        Ali0is in delivery
Ali1is in delivery
Ali2is in delivery
Ali3is in delivery
Ali4is in delivery
Ali0is in delivery
Ali1is in delivery
Ali2is in delivery
Ali3is in delivery
Ali4is in delivery


        you can see that arrayList working with filo, so that your couirer works properly

         */

    }

}
