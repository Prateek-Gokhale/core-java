public class Array{
    public static void main(String[] args) {
        int myArr [] = new int[5];
        myArr[0]=12;
        myArr[1]=65;
        myArr[2]=5;
        myArr[3]=7;
        myArr[4]=37;
        // int index=3;
        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[index]);
        // System.out.println(myArr[4]);
         //array traversal
        int i=0;
        while(i<5){
            System.out.println(myArr[i]);
            i++;
        }
        for(i=0;i<myArr.length;i++);

        
        // int arr[]={12,34,55,67,78};
        // System.out.println(arr[3]);
        
        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
        

        
    }
}