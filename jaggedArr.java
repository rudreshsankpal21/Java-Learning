class jaggedArr{
   public static void main(String cp[]){
     int arr[][] = new int [2][];

     arr[0] = new int[10];
     arr[1] = new int[15];

     for(int i = 0; i< arr.length; i++){
        for(int j = 0; j <arr[i].length; j++){
            arr[i][j] = i+j;
        }
     }
     
     System.out.print("      ");
     for(int i = 0; i< arr.length; i++){
        for(int j = 0; j <arr[i].length; j++){
           System.out.print(arr[i][j] + " ");
        }
        System.out.println();
     }
   } 
}