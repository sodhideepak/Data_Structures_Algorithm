// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;  

class Main {
    
    
    static int largest(int []arr){
    //  int dup=0;
    //     for(int i=0;i<arr.length;i++){
    //     if(dup<arr[i]){
    //         // dup=arr[i];
    //         dup=i;
    //     }
    //     }
        
    // // return dup;
    // return dup-1;
    
    
     
        int dup=arr[0];
        System.out.println(arr.length-1);
        int indx=0;
        // int sec_dup=0;
        
        for(int i=1;i<arr.length;i++){
            
            if(dup<arr[i]){
                // sec_dup=dup;
                dup=arr[i];
                indx=i;
                
            }
            
            
        }
        
        if(indx==arr.length-1){
            return indx;
        }
        if(indx==0){
            return 1;
        }
        
        
        return indx+1;
        
    }
    
    static int second_largest(int []arr){
     int dup=0;
     int sec_dup=0;
        for(int i=0;i<arr.length;i++){
        if(dup<arr[i]){
            sec_dup=dup;
            // dup=arr[i];
            dup=i;
        }
        }
        
    // return sec_dup;
    return sec_dup-1;
    }
    
    
    
    
    
    // Function to find largest and second largest element in the array
     static void largestAndSecondLargest(int sizeOfArray, int arr[]){
        //code here
        
        // int arrr[]={0,-1};
        int dup=arr[0];
        int sec_dup=-1;
        
        for(int i=0;i<sizeOfArray;i++){
            
            if(dup<arr[i]){
                dup=arr[i];
            }
        // System.out.println(sec_dup>arr[i]);
        // System.out.println(dup!=arr[i]);
            if(dup!=arr[i]&&sec_dup<arr[i]){
        // System.out.println("jn xinmd");
                
                sec_dup=arr[i];
                
            }
            
        }
        
        System.out.println(dup);
        System.out.println(sec_dup);
        
        // arrr[0]=dup;
        // arrr[1]=sec_dup;
        
        
        return ;
        // return sec_dup;
        
        
    }

    
    
    public static void main(String[] args) {
        
        // int []arr={34 ,8 ,10, 3 ,2 ,80, 30, 33, 1};
        // int []arr={28 ,19 ,21 ,14 ,24 ,22 ,16 ,15 ,22, 16, 22, 19, 27, 8, 27};
        int []arr={4,4,4,4,4};
        largestAndSecondLargest(arr.length,arr);
        // System.out.println(largestAndSecondLargest(arr.length,arr));
        // System.out.println(second_largest(arr));
        
        
    
    // System.out.println(dup);
    // System.out.println(arr.Length());

    }
}