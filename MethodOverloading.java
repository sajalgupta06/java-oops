class Overload
{
    void test()
    {
        System.out.println("No parameter");

    }
    void test(int a)
    {
        System.out.println("a="+a);
    }
    void test (int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b=" + b);

    }
    double test(double a)
    {
        return a*a;
    }
    void test(byte b)
    {
        System.out.println("byte b="+b);
    }
    void test(String s)
    {
        System.out.println("String:"+s);
    }
}
class MethodOverloading1 {
    public static void main(String[] args) {
        byte a =8;
        Overload obj=new Overload();
        obj.test(a);
        obj.test(250);
        System.out.println("Square of double a:"+obj.test(7.5));
        obj.test("Hello");
        obj.test('A');

        System.out.println("Square of float a:" + obj.test(5f));

    }
}