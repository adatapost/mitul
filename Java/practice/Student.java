class Student
{
  private int roll;
  private String name;
  private int eng,sci,maths;

  public void setRoll(int v) { roll=v;}
  public void setName(String v) { name = v; }
  public void setEng(int v) { eng = v; }
  public void setSci(int v) { sci= v; }
  public void setMaths(int v) { maths = v; }

  public int getRoll() { return roll; }
  public String getName() { return name; }
  public int getEng() { return eng; }
  public int getSci() { return sci; }
  public int getMaths() { return maths; }

  public int getTotal() { return eng+sci+maths; }
  public double getPer() { return getTotal()/3.0; }
 
  public String getGrade()
   {
     double p = getPer();
     if(p>=70)
      {
        return "A";
      }
     if(p>=60)
      {
        return "B";
       }
     return "C";

   }
}

class Test
{
  public static void main(String []args)
  {
      Student s = new Student();
      s.setRoll(10);
      s.setName("Raj");
      s.setEng(66);
      s.setMaths(88);
      s.setSci(87);

      System.out.println("Roll    : " + s.getRoll());
      System.out.println("Name    : " + s.getName());
      System.out.println("English : " + s.getEng());
      System.out.println("Maths   : " + s.getMaths());
      System.out.println("Science : " + s.getSci());
      System.out.println("Total   : " + s.getTotal());
      System.out.println("Percent : " + s.getPer());
      System.out.println("Grade   : " + s.getGrade());
   }
}