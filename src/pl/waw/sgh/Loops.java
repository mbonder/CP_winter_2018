package pl.waw.sgh;

public class Loops {
    public static void main(String[] args)  {
        for (int i=0; i<5;i++)  {
            System.out.println("I=" + 1);
        }
        System.out.println();
        for (int i=6; i>1;i--)    {
            //skip to next iteration
            if (i==5) continue;
            System.out.println("I=" + i);
            //stop the loop
            if (i==4) break;
        }


        }


        }








