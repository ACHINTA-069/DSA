public class palindome{
    public static void main(String[]args){
        String str="cabcdcbac";
        String original=str.toLowerCase();
        boolean isPalindome=true;
        for(int i=0;i<(original.length()-1)/2;i++){
            char start =original.charAt(i);
            char end =original.charAt(original.length()-1-i);
            if(start!=end){
                isPalindome=false;
            }
        }
        if(isPalindome==true){
            System.out.println("The String is palindome");
        }
        else
             System.out.println("The String is not palindome");

    }
}