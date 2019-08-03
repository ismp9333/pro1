public class OperJava{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        long longNumber = 100;
        double doubleNumber = 1.5;
        float floatNumber = 3.0f;
        char charText = 'C';
        String text1 = "Message1";
        String text2 = "Message1";
         
        
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
       

        if(num1 > num2){
            System.out.println("num1 > num2");
        }    
        else {
            System.out.println("num1 <  num2");
        }
        
        if (num1==10){
            System.out.println("num1 = 10");
        }
        if (num1!=10){
            System.out.println("num1 != 10");
        }


  if (text1.equals(text2)){
            System.out.println("text1 == text2");
        }

        int num = 2;

        switch(num)
        {
            case 1:
                System.out.println("Case1 : Value is:" + num);
                break;

            case 2:
            System.out.println("Case2 : Value is:" + num);
                break;

            case 3:
            System.out.println("Case3 : Value is:" + num);
                break;

            case 4:
            System.out.println("Case4 : Value is:" + num);
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        
       
        for(int i = 10; i >= 1;  i--)
        {
            System.out.println(" The value of i is: "+ i);
        }


        int i=10;
         while(true)
         {
             System.out.println(i);
              i--;

              if(i==-100000){
                System.out.println(" Stop" );
                break;
              }
         }



       



    }
}