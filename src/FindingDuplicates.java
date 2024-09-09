import java.util.ArrayList;

public class FindingDuplicates
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

        for(int i=0;i<ar.size();i++)
        {
            boolean isDup=false;
            for(int j=i+1;j< ar.size();j++)
            {
                if(ar.get(i).equals(ar.get(j)))
                {
                    isDup = true;
                    break;
                }
            }
            if(isDup)
                System.out.println(ar.get(i));
        }
        System.out.println("========");

    }
}
