package Week1.Day13;

public class Recursion {
    static void print(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    // tail Recursion in sum function
    static int sum(int n ,  int a){
        if(n==1){
            return (a+n);
        }return sum(n-1, a+n);
    }

    // head Recursion in sum function
    static int sum1(int n ){
        if(n==1){
            return 1;
        }
        return n+sum1(n-1);
    }

    // Tail Recursion in count Even function
    static int countEven(int n , int count){
        if(n==1){
            return count;
        }
        if(n%2==0){
            count++;
        }
        return countEven(n-1, count);
    }

    // Head Recursion in count Even function 
    static int count ( int n){
        if (n==1){
            return 0;
        }
        if(n%2==0){
            return 1+ count(n-1);
        } else{
            return count(n-1);
        }
    }

    // power function using head recursion 
    static int power(int base , int p){
        if(p==0){
            return 1;
        } 
        return base * power(base ,  p-1);

    }
// power function using tail recursion 
static int power1(int base , int p , int ans){
    if(p==0){
        return ans;
        }
        return power1(base , p-1 , base*ans);
    }

    // factorial function using head recursion
    static int factorial(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n* factorial(n-1);
    }

    // factorial function using tail recursion
    static int fact(int n ,  int ans){
        if(n==0 || n==1){
            return ans;
        }
        return fact(n-1 ,  ans) *n;
    }

    //fibonacci series using head recursion
    static int fibonacci(int n){
        if (n==1 || n==0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    // Fibonacci series using tail recursion
    static int fib(int n , int a , int b){
        if(n==0){
            return a;
        }
        return fib(n-1 , b , a+b);


    }


    public static void main(String[] args) {
        int n=10;
        // print(n);
        // System.out.println(sum(n, 0));
        System.out.println(countEven(n, 0)); 
        System.out.println(count(n)); 
        int base = 2;
        int power = 3;
        System.out.println(power1(base, power, 1));
        System.out.println(factorial(5));
        System.out.println(fact(5,1));
        System.out.println(fibonacci(5));
        System.out.println(fib(6,0 ,1));

    }
}
