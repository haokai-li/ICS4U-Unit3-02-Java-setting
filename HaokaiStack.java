/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.ArrayList;

/**
* This is the standard "lock" program.
*/
public class HaokaiStack {
    /**
    * Arraylist.
    */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * And 1 method.
    *
    * @param decrement
    *
    */
    public void push(final int decrement) {
        this.stackAsArray.add(decrement);
    }

    /**
    * Ahow stack.
    */
    public void showStack() {
        System.out.println("It is start list.");
        for (int iLoop : this.stackAsArray) {
            System.out.println(iLoop);
        }
        System.out.println("It is end list.\n");
    }
}

