public class Anagram {
    public boolean Solution(String s3,String s4){
        if(s3.length()!=s4.length()){
            return false;
        }
        //convert the string int array..........
        char[]arr1=s3.toCharArray();
        char[]arr2=s4.toCharArray();
        //sort the arrays............
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        //compair the arrays.............
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="CAT";
        String s2="ATC";
        Anagram a1=new Anagram();
        if(a1.Solution(s1, s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }
     }
}
