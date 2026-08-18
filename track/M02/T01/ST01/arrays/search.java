package track.M02.T01.ST01.arrays;
class arrays{
        void search(int[] ref,int key){
            boolean found=true;
            for(int i=0;i<ref.length;i++){
                if(ref[i]==key){
                    System.out.println("Element found at : "+i);
                    found=false;
                }
            }
            if(found){
                System.out.println("element not found");
            }

        }
    }

public class search {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        arrays a=new arrays();
        a.search(arr,60);

    }
    

    }

