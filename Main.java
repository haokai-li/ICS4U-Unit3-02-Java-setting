/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * The three.
    */
    private static final int THREE = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final HaokaiStack aStack = new HaokaiStack();

        System.out.println("It is empty.\n");
        aStack.showStack();

        System.out.println("Push: 1");
        aStack.push(1);
        aStack.showStack();

        System.out.println("Push: 2");
        aStack.push(2);
        aStack.showStack();

        System.out.println("Push: 3");
        aStack.push(THREE);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
