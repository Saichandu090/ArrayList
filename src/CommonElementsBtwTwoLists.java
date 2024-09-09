import java.util.ArrayList;

public class CommonElementsBtwTwoLists
{
    public static void main(String[] args) {

        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(12);
        a1.add(37);
        a1.add(52);
        a1.add(36);

        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(12);
        a2.add(36);
        a2.add(96);
        a2.add(25);
        a2.add(37);

        for(int i=0;i<a1.size();i++)
        {
            for(int j=0;j<a2.size();j++)
            {
                if(a1.get(i).equals(a2.get(j)))
                    System.out.println(a1.get(i));
            }
        }
    }
}
