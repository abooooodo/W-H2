//Concatenate two arrays to new array
import java.util.Arrays;

public class lab3_Q3 {
    static int [] merge(int[] A,int[] B,int[] E)
    {
        int i=0,j=0,d=0;
        while (i<A.length&&j<B.length)
        {
            if(A[i]<=B[j])
            {
                E[d]=A[i];
                i++;
            }
            else
            {
                E[d]=B[j];
                j++;
            }
            d++;
        }
        while (i<A.length)
        {
            E[d]=A[i];
            i++;
            d++;
        }
        while(j<B.length)
        {
            E[d]=B[j];
            j++;
            d++;
        }
        return E;
    }
    public static void main(String[] args) {
        int[] a={7,3,5,7};
        int[] b={6,8,5,7,9};
        int[] e=new int[a.length+b.length];

        System.out.println(Arrays.toString(merge(a,b,e)));
    }
}
