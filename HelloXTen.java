/***************************************************************************
 *  Compilation:  javac HelloXTen.java
 *  Execution:    java HelloXTen
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 **************************************************************************/
/* Copyright © 2000–2017, Robert Sedgewick and Kevin Wayne.
Last updated: Fri Oct 20 14:12:12 EDT 2017. */

public class HelloXTen {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
	int i = 10;
	while (i > 0)
	    {
            System.out.println("Hello, World");
	    i = i - 1;
	    } // hello loop
    } // public static void main(String[] args)

} // HelloXTen


