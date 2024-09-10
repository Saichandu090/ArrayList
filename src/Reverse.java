import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(12);
        ar.add(9);
        ar.add(96);
        ar.add(45);
        ar.add(11);
        ar.add(23);
        ar.add(17);

        int l=0,h=ar.size()-1;
        while(l<h)
        {
           int temp=ar.remove(l);
           ar.add(l,ar.remove(h-1));
           ar.add(h,temp);
           l++;
           h--;
        }

        for(int i : ar)
        {
            System.out.println(i);
        }
    }
}
