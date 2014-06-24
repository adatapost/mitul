class Date {
   int d,m,y;  //fields

   //methods

   boolean isLeap() {
      return y%4==0;
   }

   boolean isValidMonth() {
      return m>=1 && m<=12;
   }
   

   boolean isValidDay() {
      if(!isValidMonth()) {
        return false;
      }
      switch(m) {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
                    return d>=1 && d<=31;
           case 4:
           case 6:
           case 9:
           case 11:
                    return d>=1 && d<=30;
           case 2:
                    if(isLeap())  {
                       return d>=1 && d<=29;
                    } else {
                       return d>=1 && d<=28;
                    }
          }//end of switch

          return false;

      }
   
}

class Test {
  public static void main(String []args) {
     //Date object
     Date a = new Date();
     a.d=29; a.m=2; a.y=2012;
     if(a.isValidDay()) {
          System.out.println("Valid");
     } else {
         System.out.println("Invalid");
     }
 }//end of main
}//end of class Test 