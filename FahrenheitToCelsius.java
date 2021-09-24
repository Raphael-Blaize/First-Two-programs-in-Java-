public class FahrenheitToCelsius{
     public static void main(String[] args){
       
         //variable declaration statement which in in this case is saturdayFahrenheit; 
         int saturdayFahrenheit;
         int sundayFahrenheit;
         saturdayFahrenheit = 78;
         sundayFahrenheit = 81;
         //storing it in double because you can have decimal because int will give you inaccurate answers
         double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
         double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32); 
         System.out.println("Weekend Averages");
         System.out.println("Saturday:" + saturdayCelsius);
         System.out.println("Sunday:" + sundayCelsius);

     }


}