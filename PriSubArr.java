public class PriSubArr {
    
   public static void PrintSubbArray(int number[]){
    for(int i = 0; i<number.length; i++){
        int start = i;
        for(int j = 0; j<number.length; j++){
            int end = j;
            for(int k= start; k<=end; k++){
                System.err.print(number[k] +"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
   }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        PrintSubbArray(number);

    }
}
