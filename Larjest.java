
public class Larjest {



    public static int LarjestNumber(int number[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0; i<number.length; i++){
            if(largest < number[i]){

                largest = number[i];


            }
      }
      return largest;
      

    }




    public static void main(String[] args) {
        int number[] = {5, 4, 56, 6, 65, 54, 75};

        System.out.println("Element larjest : " + LarjestNumber(number));

    }
    
}
