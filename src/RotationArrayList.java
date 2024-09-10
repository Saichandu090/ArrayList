import java.util.ArrayList;

public class RotationArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(60);

        int n=3;
        System.out.println(ar);
        rotate(ar,n);
        System.out.println(ar);
    }

    public static void rotate(ArrayList<Integer> ar,int n)
    {
        int steps=n%ar.size();

        for(int i=0;i<steps;i++)
        {
            int temp=ar.get(ar.size()-1);

            for(int j=ar.size()-1;j>0;j--)
            {
                ar.set(j,ar.get(j-1));
            }
            ar.set(0,temp);
        }
    }
}
