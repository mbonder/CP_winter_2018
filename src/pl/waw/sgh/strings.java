package pl.waw.sgh;

public class strings {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";

        System.out.println(s + s2);
        int slen = s.length();
        System.out.println(s.indexOf("ab"));
        System.out.println(s.charAt(2));

        int ii1, ii2;
        ii1 = 4;
        ii2 = 4;

        //ii1++ii2
        //ii1<ii2
        //ii1<=ii2
        //ii1>=ii2
        boolean cond = ii1==ii2;
        //! - negate
        //|| - OR
        //&& - AND

        if (cond || ii2>3 && ii1>5) {
            System.out.println("ii1=ii2");
        } else  {
            System.out.println("ii2 not equal ii2");
        }
    }

}

