# kh
import java.util.Scanner;
import java.util.ArrayList;
public class Hunter33{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> al=new ArrayList<String>();
    System.out.println("Enter the n digit number");
    String num=sc.next();
    al.add("");
    al.add("");
    al.add("ABC");
    al.add("DEF");
    al.add("GHI");
    al.add("JKL");
    al.add("MNO");
    al.add("PQRS");
    al.add("TUV");
    al.add("WXYZ");
    char ch[]=num.toCharArray();
    int i;
    int flag= 0;
    for(i=0;i<ch.length;i++) {
      ++flag;
      if(flag==1) {
        System.out.println("All words possible by pressing these numbers are:");
      }
      System.out.print(al.get(Integer.parseInt(ch[i]+"")));
    }
    sc.close();
  }
  }
