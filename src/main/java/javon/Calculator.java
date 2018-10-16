package javon;

public class Calculator {
    public int Square(int num)
    {
        return num*num;
    }
    public int Add(int num1, int num2 )
    {
        return num1 + num2;
    }
    public double Add(double num1, double num2 )
    {
        return num1 + num2;
    }
    public int Multiply(int num1, int num2 )
    {
        return num1 * num2;
    }

//    public int subtract(int num1, int num2 )
//    {
//        {
//            return num1 - num2;
//        }
//        Calculator calculator = new Calculator();
//        int expect = 10;
//
//        //When
//        int actual = calculator.Add(2,3);
//
//        //Then
//
//        Assert.assertEquals(expect,actual);
//}
}
