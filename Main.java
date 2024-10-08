package pushpak49Recursion;

public class Main {
    //print number from 10 to 1
    public static void printnumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);


    }
    //print number from 1 to 10
    public static void printnum(int n){
        if(n==10){
            return;
        }
        System.out.println(n);
        printnum(n+1);


    }
    //print sum of number
    public static void printsum(int i,int n,int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printsum(i+1,n,sum);

    }
    //factorial
    public static int calcFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fac =n*calcFactorial(n-1);
        return fac;

    }
//    fibonacci
    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.print(c);
        fibonacci(b,c,n-1);


    }
    public static void main(String[] args) {
        printnumber(10);
        printnum(1);
        printsum(1,5,0);
        System.out.println(calcFactorial(5));
        System.out.print(0);
        System.out.print(1);
        fibonacci(0,1,6);

    }
}
