// class jaggedArr {
//    public static void main(String cp[]) {
//       int arr[][] = new int[3][];

//       arr[0] = new int[3];
//       arr[1] = new int[5];
//       arr[2] = new int[10];

//       for (int i = 0; i < arr.length; i++) {
//          for (int j = 0; j < arr[i].length; j++) {
//             arr[i][j] = i + j;
//             for (int k = 0; k < arr[j].length; k++) {
//                arr[k] = arr[j];
//             }
//          }
//       }

//       System.out.print("        ");
//       for (int i = 0; i < arr.length; i++) {
//          for (int j = 0; j < arr[i].length; j++) {
//             System.out.print(arr[i][j] + " ");
//             for (int k = 0; k < arr[j].length; k++) {
//                arr[k] = arr[j];
//             }
//          }
//          System.out.println();
//       }
//    }
// }



class jaggedArr {
   public static void main(String cp[]) {
      // 1. Initialize the jagged array structures
      int arr[][] = new int[3][];
      arr[0] = new int[3];
      arr[1] = new int[5];
      arr[2] = new int[10];

      // 2. Populate the array with your exact target numbers
      // Row 0: 1, 2, 3
      for (int j = 0; j < arr[0].length; j++) {
         arr[0][j] = j + 1;
      }
      // Row 1: 2, 3, 4, 5, 6
      for (int j = 0; j < arr[1].length; j++) {
         arr[1][j] = j + 2;
      }
      // Row 2: 7, 8, 9, ... 16
      for (int j = 0; j < arr[2].length; j++) {
         arr[2][j] = j + 7;
      }

      // 3. Print with the correct alignment padding
      int maxLength = arr[2].length; // The longest row determines the alignment width (10)

      for (int i = 0; i < arr.length; i++) {
         // Print leading spaces to right-align the numbers like a pyramid
         int spaces = maxLength - arr[i].length;
         for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
         }

         // Print the actual numbers side-by-side without spaces
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]);
         }
         
         // Move to the next line
         System.out.println();
      }
   }
}