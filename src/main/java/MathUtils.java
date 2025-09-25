public final class MathUtils {

    public static int sum(int a, int b){
        return a+b;
        }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double div(int a, int b){
        if(b ==0) throw new ArithmeticException("Division by zero");
        return (double)a/b;
    }

    public static double sqrt(double a){
        if(a<0) throw new IllegalArgumentException("Negative value");
        return Math.sqrt(a);
    }

    public static int factorial(int a){
        if(a< 0 ) throw new IllegalArgumentException("Negative value");
        if(a==0) return 1;
        return a*factorial(a-1);

    }

}


