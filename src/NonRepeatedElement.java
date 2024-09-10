import java.util.*;
public class NonRepeatedElement
{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(12);
        ar.add(45);
        ar.add(12);
        ar.add(37);
        ar.add(52);
        ar.add(36);
        ar.add(37);

        boolean[] rs = new boolean[ar.size()];
        for (int i = 0; i < ar.size(); i++)
        {
            for (int j = i + 1; j < ar.size(); j++)
            {
                if (ar.get(i).equals(ar.get(j)))
                {
                    rs[i] = true;
                }
            }
            if (!rs[i])
            {
                System.out.println("First Non-Repeatable Element is : "+ar.get(i));
                break;
            }
        }
    }
}