package my.issues.issue08;

public class ArrayIndexOutOfBoundsWithException {
    public static void main(String[] args) {
        Random random=new Random();

        int index[]=new int[7];

        for(int i=0;i<index.length;i++)
        {
            index[i]=random.nextInt(7);
        }

        try {
            System.out.println(index[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum index is 6");
        }


        for(int i : index){
            System.out.print(i+" ");
        }


    }
}
