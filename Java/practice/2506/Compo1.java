class Address
{
   private String city;
   private int pin;
   //constructors & getters/setters

    public Address()
    {
      city="";
     }
    public Address(String mCity, int mPin) 
     {
       city = mCity;
       pin = mPin;
     }

    public int getPin() { return pin;}
    public String getCity() { return city;}
    public void setPin(int v) { pin=v;}
    public void setCity(String v) { city = v;}
}


class Student {
   private int roll;
   private String name;
   private Address localAddress;
   private Address postalAddress;
    
   public Student() 
   {
        name = "";
        localAddress = new Address();
        postalAddress = new Address();
   }

   public int getRoll() { return roll;}
   public String getName() { return name;}
   public Address getLocalAddress() { return localAddress;}
   public Address getPostalAddress() { return postalAddress;}
   public void setRoll(int v) { roll=v;}
   public void setName(String v) { name=v;}  
   public void setPostalAddress(Address v) { postalAddress =v;}
   public void setLocalAddress(Address v) { localAddress = v;}
}


class Test
{

   public static void main(String []args)
    {
       Student s = new Student();
       s.setRoll(10);
       s.setName("Raj");
       s.setLocalAddress( new Address("Mehsana",382001) );
       s.setPostalAddress( new Address("Patan",312001) );
        
       System.out.println(s.getRoll());
       System.out.println(s.getName());
       System.out.println(s.getPostalAddress().getCity());
       System.out.println(s.getPostalAddress().getPin());
       System.out.println(s.getLocalAddress().getCity());
       System.out.println(s.getLocalAddress().getPin());


    }
   public static void main1(String []args)
    {
       Student s = new Student();
       s.setRoll(10);
       s.setName("Raj");
       s.getLocalAddress().setCity("Mehsana");
       s.getLocalAddress().setPin(384001);
       s.getPostalAddress().setCity("Patan");
       s.getPostalAddress().setPin(334455);

       System.out.println(s.getRoll());
       System.out.println(s.getName());
       System.out.println(s.getPostalAddress().getCity());
       System.out.println(s.getPostalAddress().getPin());
       System.out.println(s.getLocalAddress().getCity());
       System.out.println(s.getLocalAddress().getPin());


    }
}