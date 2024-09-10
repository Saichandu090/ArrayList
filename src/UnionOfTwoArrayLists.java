import java.util.ArrayList;

public class UnionOfTwoArrayLists
{
    public static void main(String[] args) {

        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(52);
        ar.add(23);
        ar.add(85);
        ar.add(96);
        ar.add(25);

        ArrayList<Integer> a1=new ArrayList<Integer>(ar);
        a1.add(25);
        a1.add(237);
        a1.add(236);
        a1.add(96);
        a1.add(86);

        for(int i : a1)
        {
            System.out.println(i);
        }
    }
}
