import java.util.*;
import java.util.Arrays;


public class ArrayFunctions 
{
    public void display (ArrayList<Integer> array)
    {
        System.out.println("Array is :" + array );
    }

    public void oddEven(int[] array)
    {
       /*

        int[] odd = new int[5];
        int[] even = new int[5];
        int odd_index = 0;
        int even_index = 0;
        
        */
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        

        for(int i = 0; i < array.length;i++)
        {
            if(array[i]% 2 == 0 )
            {
                even.add(array[i]);
                
            }
            else
            {
                 odd.add(array[i]);
            }
        }

        display(even);
        display(odd);
    }
}
