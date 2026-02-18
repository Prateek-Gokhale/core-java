public class Function{
    public static void main(String[]args){
        System.out.println("In main method");
        greetUser();
        System.out.println("Method calling complete");
        firstPattern();
        secondPattern();
        // thirdPattern();
    }
    public static void greetUser(){
        System.out.println("Good Morning");
    }
    public static void firstPattern(){
       int row=0;
        while(row<5){
            System.out.print("*");
            int i=0;
            while(i<row){
                System.out.print(" *");
                i++;
                
            }
            System.out.println();
            row++;

        }


    }

    public static void secondPattern() {

    int row = 5;

    while (row > 0) {

        int col = 0;

        while (col < row) {
            System.out.print("* ");
            col++;
        }

        System.out.println();
        row--;
    }
}
    // public static void thirdPattern(){
    //     System.out.println("        *");
    //     System.out.println("      * *");
    //     System.out.println("    * * *");
    //     System.out.println("  * * * *");
    //     System.out.println("* * * * *");

    // }
}