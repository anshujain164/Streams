package org.example.oops.constructor;
final class Maths{
    private Maths(){
        throw new AssertionError("do not instantiate");
    }

    public static int square(int x){
        return x * x;
    }
}
public class PrivateConstructor {
    public static void main(String[] args){
        /// Maths math = new Maths(); /// it gives compile time error

        System.out.println("Square(4) = "+ Maths.square(4));
    }
}
