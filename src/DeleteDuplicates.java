import java.util.ArrayList;

public class DeleteDuplicates
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(12);
        ar.add(63);
        ar.add(56);
        ar.add(12);
        ar.add(56);
        ar.add(12);

        boolean[] a=new boolean[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            if(!a[i])
            {
                for (int j = i + 1; j < ar.size(); j++)
                {
                    if (ar.get(i).equals(ar.get(j)))
                    {
                         a[j]=true;
                    }
                    if(a[j])
                        ar.remove(ar.get(j));
                }
            }

        }
        System.out.println("========");

        for(int i : ar)
        {
            System.out.println(i);
        }

    }
}
