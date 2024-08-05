package Week1.Day12;

public class substringques1 {
    public static void substrings(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        String st = "abcdefgh";
     
        // System.out.println(   st.substring(0, 1));
        substrings(st);
    }
}
