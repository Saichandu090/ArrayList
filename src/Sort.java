import java.util.*;
public class Sort
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

        Collections.sort(ar,(i1,i2)->i1.compareTo(i2)>0?1:-1);

        for(int i : ar)
        {
            System.out.println(i);
        }
    }
}
