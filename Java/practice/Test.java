class Person
{
    //fields must be private

    private int age;
    private String name;

    //Constructor
    public Person() {
       age = 1;
       name = "N.A";
       System.out.println("Constructor");
    }


    //public methods -- Getter and Setter methods

     public void setAge(int v)
     {
        if(v>=1 && v<=100) 
         {
           age = v;
          }
      }
     public void setName(String v)
     {
         if(v==null)
          {
           return;
           }
         if(v.length()>=5 && v.length()<=50)
          {
            name = v;    
           }
      }

      public int getAge()
       {
          return age;
        }
       public String getName()
       {
         return name;
        }
    
}

class Test
{
   public static void main(String []args)
    {
         Person p = new Person();
         System.out.println(p.getAge() + " " + p.getName());
         p.setAge(10); 
         p.setName("Rajesh"); 

         System.out.println(p.getAge() + " " + p.getName());

         Person k = new Person();
 
     }
} 