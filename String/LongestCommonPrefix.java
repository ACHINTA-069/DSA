
import java.util.*;;

public class LongestCommonPrefix {
    public static String Solution(String[]v){
        if(v.length==0||v==null)
            return "";

        Arrays.sort(v);
        String First=v[0];
        String Last =v[v.length-1];
        int i=0;
        while(i<First.length()&&i<Last.length()&&First.charAt(i)==Last.charAt(i)){
            i++;
        }
        return First.substring(0,i);
    }
    public static void main(String[] args) {
        String []a={"flower","flow","flex"};
        System.out.print(Solution(a));
    }
}
