public class function {
    public static void display(int[] arr,int a,int b){
       
        // for(int i=0;i<arr.length;i++)
        for(int i=a;a<arr.length&&i<=b;i++){
            System.out.print(arr[i]+" ");
          

        }
    }

        public static  int sum(int[] arr,int x,int y){
            int sum=0;
             for(int i=x;i<=y;i++){
                sum=arr[i]+sum;
            // for(int i: arr)
            // sum+=i; 
            // System.out.print("the sum of array is :");
            }
        return sum;
            
        }
        public static void Reverseanarray(int[] arr,int x,int y){
             
            for(int i=y;i>=x;i--)
                System.out.print(arr[i]+" ");
                System.out.println();
               
            }
            public static void reverseanarray(int[] arr,int x,int y){
                int[] temp=new int [arr.length];
                for(int i=x;i<y;i++){
                    temp[arr.length-1-i]=arr[i];
                }
                    for (int i=x;i<y;i++){
                        arr[i]=temp[i];
                       
                    }
                    display(arr,x,y);


                    
                    
               
            }
            // public static void swapelemnt(int[] arr,int i,int j){
            // int temp=arr[i];
            // arr[i]=arr[j];
            // arr[j]=temp;
            // }
            public static void reverseusingswap(int[] arr,int x,int y){
                int i=x;
                int j=y;
                while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
                

                }
                display(arr,x,y);
            }
                

       

    

    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7};
        int x=2;
        int y=4;
        //  int sum=sum(arr,x,y);
        //  System.out.print(sum);
        // // int i=1;int j=arr.length-1;
        // // // swapelemnt(arr,i,j);
        // reverseusingswap(arr,x,y);
        
        // reverseanarray(arr,x,y);
        Reverseanarray(arr,x,y);
        // int a=2;
        // int b=4;
        // display(arr,x,y);
        
    }




}
