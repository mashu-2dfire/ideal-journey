/*输入四个数字，四个数字从大往小排减去从小往大排的值循环至最后为6124*/
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
class Main
{
    public static void  main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext())
        {
            int num=scan.nextInt();
            if(num<0||num>10000)
            {
                System.out.println("");
                System.exit(0);
            }
            else
            {
                while(true)
                {
                    num=method(num);
                }
            }

        }
    }
    public static int method(int num)
    {
        String str=String.valueOf(num);
        char[] strch=str.toCharArray();
        Arrays.sort(strch);
        char[] maxstr=strch;
        char[] minstr=new char[strch.length];
        for(int i=0;i<strch.length;i++)
        {
            minstr[i]=maxstr[strch.length-i-1];
        }
        int max=Integer.parseInt(method1(maxstr));
        int min=Integer.parseInt(method1(minstr));
        int newNum=max-min;
        System.out.println(max+"-"+min+"="+(newNum));
        return newNum;
    }
    public static String method1(char[] chars)
    {
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<chars.length;i++)
        {
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }
}