class Example
{
   public void print()
    {
      System.out.println("No argument");
     }
   public void print(int n)
   {
     System.out.println("Int argument");
    }
   public void print(char n)
    {
     System.out.println("Char argument");
     }
}
class Test
{
  public static void main(String []args)
   {
       Example e=new Example();
       e.print('R');  //Char argument method will be called
       e.print();    //No arg method will be called
       e.print(20);  //int arg 
       //e.print(10.10); //Error - no such definition in class Example
    }
}