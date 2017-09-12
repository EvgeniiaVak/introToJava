package chapter12;

public class Chapter {

    public static void main(String[] args) {
//        long value = Long.MAX_VALUE + 1;
//        System.out.println(value);
//        String s = "abc";
//        System.out.println(s.charAt(3));
//        Object o = new Object();
//        String d = (String)o;
//        System.out.println(-1.0 / 0);
//
//        try {
//            method();
//            System.out.println("After the method call");
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException"); }
//        catch (RuntimeException ex) { System.out.println("RuntimeException");
//        }
//        catch (Exception e) {
//            System.out.println("Exception"); }
//
//        try{
//            methodWithRunTimeException();
//        } catch (RuntimeException e) {
//            System.out.println("catch in main");
//        }
//        methodWithRunTimeException();

        try {
            m2();
        } catch (RuntimeException e) {
            System.out.println("caught runtime exception");
        } catch (Exception e) {
            System.out.println("caught exception");
        }

    }

    private static void m1() throws RuntimeException {
            throw new RuntimeException();
    }

    private static void m2() throws Exception {
        try {
            m1();
        } catch (RuntimeException e) {
            throw (Exception) e;
        }
    }

    private static void methodWithRunTimeException() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
        }
    }

    private static void method() throws Exception {
        System.out.println(1 / 0);
    }

    private void m(int value) throws Exception { if (value < 40)
        throw new Exception("value is too small");
    }

}
