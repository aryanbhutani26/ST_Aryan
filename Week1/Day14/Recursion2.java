package Week1.Day14;

import Week1.Day12.substringques1;

public class Recursion2 {
    static void toss(int n , String ans){
    if(n==0){
        System.out.println(ans);
        return ;
        }
    toss(n-1 , ans + " H ");
    toss(n-1 ,ans + " T "); 
    
}
static void subSequence(String Q , String ans){
    if(Q.isEmpty()){
        System.out.println(ans);
        return;
    }
    subSequence(Q.substring(1, Q.length()), ans + Q.substring(0,1));
    subSequence(Q.substring(1, Q.length()), ans );

}

// head recursion for counting the number of subsequences
    static int Countsubsequence(String Q ){
        if(Q.isEmpty()){
            
            return 1;
        }
        int num1=Countsubsequence(Q.substring(1, Q.length()));
        int num2= Countsubsequence(Q.substring(1, Q.length()) );
        return num1+num2;
    }
    static void validParenthesis(int n , int l , int r , String ans){
        if(n==l && l==r){
            System.out.println(ans);
        }
        if(l>n || r>l){
            return;
        }
        // Code1 Left Parenthesis
        validParenthesis(n, l+1, r, ans+"{");
        // Code 2 Right Parenthresis
        validParenthesis(n, l, r+1, ans+"}");
  }
  
//   check valid Parenthesis
static Parenthesis(String s){
    int count = 0;
    if()
}
public static void main(String[] args) {
    toss(3 , "");
    subSequence("CAR", "");
    System.out.println(Countsubsequence("CARRY"));
    validParenthesis(3, 0, 0, "");
}
    
}
