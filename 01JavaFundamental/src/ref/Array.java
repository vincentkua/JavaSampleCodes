package ref;

public class Array {
    
    public static void main(String[] args){

        //Show the Array if entered using args
        for (int i=0; i<args.length ; i++){
            System.out.printf("%s ", args[i]);
        }
        System.out.println("");



        Integer[] array1 = {1,2,3,4,5};   
        for (int i=0; i<array1.length ; i++){
            System.out.printf("%d ",array1[i]);
        }

        System.out.println("");

        Integer[] array2 = new Integer[6];
        for (int i=0; i<array1.length ; i++){
            System.out.printf("%d ",array2[i]);
        }

        System.out.println("");


        Integer[][] matrix = new Integer[2][3];
        matrix[1][1] = 5;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0 ; i< row ; i++){

            for (int j=0 ; j < col ; j ++){
                System.out.printf("%d ", matrix[i][j]);
            }

            System.out.println("");

        }
        





    }

}
