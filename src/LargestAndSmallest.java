import java.util.ArrayList;

public class LargestAndSmallest
{
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(12);
        ar.add(9);
        ar.add(96);
        ar.add(45);
        ar.add(11);
        ar.add(23);
        ar.add(17);

        int small=Integer.MAX_VALUE;
        for(int i : ar)
        {
            for(int j=0;j<ar.size();j++)
            {
                if(ar.get(j)<small)
                   small=ar.get(j);
            }
        }
        System.out.println("Smallest is : "+small);

        int largest=Integer.MIN_VALUE;
        for(int i : ar)
        {
            for(int j=0;j<ar.size();j++)
            {
                if(ar.get(j)>largest)
                    largest=ar.get(j);
            }
        }
        System.out.println("Largest is : "+largest);
    }
}
