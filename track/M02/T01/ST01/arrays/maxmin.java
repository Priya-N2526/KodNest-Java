package track.M02.T01.ST01.arrays;
public class maxmin {
    public static void main(String[] args){
    int[] arr={10,20,30,15,1,70};
    int mini=arr[0];
    int maxi=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>maxi){
            maxi=arr[i];
        }
        if(arr[i]<mini){
            mini=arr[i];
        }
    }
    System.out.println("Maximum element: "+maxi);
    System.out.println("Minimum element: "+mini);
    }
}
