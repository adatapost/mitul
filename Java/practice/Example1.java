class Student
{
   private int no;
   private String name;

   //getter & setter 

    public int getNo() { return no;}
    public String getName() { return name;}
    public void setNo(int v) { no = v;}
    public void setName(String v) { name = v;}

   //overload methods

   public void setStudent(int mNo, String mName) {
       no = mNo;
       name = mName;
   }
   public void setStudent(String mName,int mNo) {
       no = mNo;
       name = mName;
   }


 //constructor
    public Student()   //No argument constructor
     {
        no = 1;
        name = "N.A";
     }

    public Student(int mNo, String mName)   //Argument constructor
    {
         no = mNo;
         name = mName;
    }
   public Student(String mName,int mNo)   //Argument constructor
    {
         no = mNo;
         name = mName;
    }
   public void print() 
   {
      System.out.println(no +  " " + name);
   }
}

class Test
{
  public static void main(String []args)
   {
       Student a = new Student(10,"Raj");
        Student b = new Student("Man",20);
        Student c=new Student();
         a.print();
         b.print();
         c.print(); 
    }
}
