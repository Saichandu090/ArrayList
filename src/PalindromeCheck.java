import java.util.ArrayList;

public class PalindromeCheck
{
    public static void main(String[] args) {

        ArrayList<Character> a1=new ArrayList<Character>();
        a1.add('m');
        a1.add('a');
        a1.add('a');
        a1.add('m');

        String st="";
        for(int i=0;i<a1.size();i++)
        {
            st=st+a1.get(i);
        }

        boolean rs=isPalindrome(st);
        if(rs)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }

    public static boolean isPalindrome(String st)
    {
        int l=0,h=st.length()-1;
        while(l<h)
        {
            if(st.charAt(l)!=st.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }
}
