public class RotateString {
    public boolean  Solution(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            String rotated=s.substring(i)+s.substring(0,i);
            if(rotated.equals(goal))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="rotation";
        String goal1="tionrota";
        RotateString r1=new RotateString(); 
        System.out.println(r1.Solution(s1, goal1));
    }
}
