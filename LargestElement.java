import java.util.Scanner ;
public class LargestElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num []=new int[5];
        int largest ;
        System.out.print("Enter array element:");
       for(int i=0;i<5;i++){
        num[i]=input.nextInt();

       }
    largest=num[0];
     for(int i=0;i<5;i++){
        if(largest<num[i]){
        largest=num[i];
        }
     }
     System.out.print("Largest number="+largest);




    }

}
