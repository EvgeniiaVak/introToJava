package chapter13;

public class Chapter {
    public static void main(String[] args) {
//        Number x = 3;
//        Number y = x.doubleValue();
//        System.out.println(x.getClass().getSimpleName());
//        System.out.println(y.getClass().getSimpleName());

//        Integer x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(x.compareTo(new Integer(4)));

//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(((Integer)x).compareTo(new Integer(4)));


//        Integer n1 = new Integer(3);
//        Object n2 = new Integer(4);
//        System.out.println(n1.compareTo((Integer)n2));

//        ChapterChild child = new ChapterChild();
//        ChapterChild childOfChild = new ChildOfChild();
//        ChapterChild childOfChildWithoutClone = new ChildOfChildWithoutClone();
//        try {
//            Chapter child1 = child.clone();
//            Chapter child2 = childOfChild.clone();
//            Chapter child3 = childOfChildWithoutClone.clone();
//
//            System.out.println(child1.getClass());
//            System.out.println(child2.getClass());
//            System.out.println(child3.getClass());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        java.util.Date date = new java.util.Date();
//        java.util.Date date1 = date;
//        java.util.Date date2 = (java.util.Date)(date.clone());
//        System.out.println(date == date1);
//        System.out.println(date == date2);
//        System.out.println(date.equals(date2));

//        Number a = 4.5;
//        Number b = 4;
//        System.out.println(a.getClass().getSimpleName());
//        System.out.println(b.getClass().getSimpleName());
    }

    public Object returnObject () {
        return new Object();
    }

    interface A {
        void m1();
    }
    class B implements A {
        public void m1() {
            System.out.println("m1");
        }
    }
}
