public class Bitwise {

    public static void main(String[] args) {
        /*
         * | bitwise OR     agar ek bhi 1 h to 1 output dega bits m
         * & bitwise AND    agar dono 1 h to hi sirf 1 dega output m
         * ^ bitwise XOR    agar same h bits to 0 different h to 1
         * ~ bitwise NOT    zero ko 1 aur 1 ko 0
         * 
         * << left shift    do operands maangta h aur fir number maangta h ki kitni baar left ya right shift krna h ..... jitni bhi bits h wo saari uthke ek side left chli jaayegi..... 1001->10010 (9 ko ek baar left shift kra to 18 bn gya)  a<<b=a*2^b
         * 
         * 
         * 
         * >> right shift   same as left shift ..... 1001 -> 100 right shift ke baad 9 ab 4 bn gya   a >> b = a/2^b
         * 
         * 
         * 
         */

        int a = 9;
        int b = 10;
        int oroperator;
        int andoperator;
        int xoroperator;
        int notoperator;
        int leftshiftoperator;
        int rightshiftoperator;

        oroperator= a|b;
        System.out.println("oroperator = " + oroperator);

        andoperator= a&b;
        System.out.println("andoperator = " + andoperator);

        xoroperator= a^b;
        System.out.println("xoroperator = " + xoroperator);

        notoperator= ~a;
        System.out.println("notoperator = " + notoperator);

        leftshiftoperator= a<<b;
        System.out.println("leftshiftoperator = " + leftshiftoperator);

        rightshiftoperator= a>>b;
        System.out.println("rightshiftoperator = " + rightshiftoperator);


    }
}
