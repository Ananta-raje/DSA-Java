package Bits;
public class bit {


//Check Odd or Even number
    // public static void OddOrEven(int n){
    //  int bitMask = 1;

    //  if ((n & bitMask) == 0) {
    //     System.out.println("Even number");
    //  }else{
    //     System.out.println("Odd number");
    //  }
    // }
    // public static void main(String[] args) {
    //     OddOrEven(4);
    // }

//getIth bit


    //   public static int getIthBit(int n, int i){
    //      int bitMask = 1<<i;
    //      if ((n & bitMask) == 0) {
    //         return 0 ;
    //      }else{
    //         return 1;
    //      }

    //   }
    //   public static void main(String[] args) {
    //     System.out.println(getIthBit(10, 1));
    //   }


//setIth bit

        // public static int setIthBit(int n, int i){
        //   int bitMask = 1<<i ;
        //   return n | bitMask ;
        // }
        // public static void main(String[] args) {
        //     System.err.println(setIthBit(10, 2));
        // }

//clearIthBit
           
        public static int ClearIthBit(int n, int i){
           int bitMask = ~1<<i ;
           return n &  bitMask ;
        }
        public static void main(String[] args) {
            System.out.println(ClearIthBit(10, 1));
        }
}
