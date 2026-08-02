public class duplicare_find{
    public static void main(String[] args) {
        int[]arr={1,2,3,1,4,5};
        boolean isFound=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isFound=true;
                    break;
                }     
            }
            // if(isFound){
            //     break;
            // }
        }
        if(isFound){
            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");
    }
}