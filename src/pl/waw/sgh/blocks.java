package pl.waw.sgh;

public class blocks {



    public static void main(String[] args) {
        int i1 = 0;
        {
            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2=" + i2);
        }
        {
            int i3=7;
            System.out.println("inside internal block i1=" +i1);
        }
        {
            //  System.out.println("inside internal block 2 i1=" + i3)
        }

    }
}