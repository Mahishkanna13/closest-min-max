import java.util.Scanner;

public class MinMax {
    public static void SubArray(int[] array)
    {
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>Max)
            {
                Max=array[i];
            }
            if(array[i]<Min)
            {
                Min=array[i];
            }
        }
        int minIndex=-1;
        int maxIndex=-1;
        int result=array.length;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==Min)
            {
                minIndex=i;
                if(maxIndex>=0)
                {
                    result=Math.min(result,Math.abs(maxIndex-i)+1);
                }
            }
            if(array[i]==Max)
            {
                maxIndex=i;
                if(minIndex>=0)
                {
                    result=Math.min(result,Math.abs(minIndex-i)+1);
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        SubArray(Array);
        
    }
}
