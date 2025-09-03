public class pattern {

    // public static void invertedStar(){
    //    for(int i=5; i>=1; i--){
    //         for(int j=i; j>=1; j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void halfPyramid(){
    //     for(int i=1; i<=5; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    public static void characterPyramid(){
        char ch='A';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // invertedStar();
        // halfPyramid();
        characterPyramid();

    }
}
