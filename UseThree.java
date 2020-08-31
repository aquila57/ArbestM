/**************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 
**************************************************************************/
/* Copyright © 2000–2017, Robert Sedgewick and Kevin Wayne.
Last updated: Fri Oct 20 14:12:12 EDT 2017. */

public class UseThree {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}


