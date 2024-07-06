public class MultiArray{
    public static void main(String args[]){
        int num[][] = new int[3][];    // jagged array
        int nums[][][] = new int[3][4][5]; // three dimensional array

        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];

        for(int i = 0;i<num.length;i++){
            for(int k=0;k<num[i].length;k++){
                num[i][k] = (int)(Math.random() * 100);
            }
        }

        // for(int i = 0;i<3;i++){
        //     for(int k=0;k<4;k++){
        //         System.out.print(num[i][k] + " ");
        //     }
        //     System.out.println();
        // }


        // advanced for loop
        for(int n[]: num){
            for (int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}