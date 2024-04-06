//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
System.out.println("Задние 1");
byte a = -128;
short b = -10000;
int c = 2000000;
long d = 90000000000000L;
float e = 1.11f;
double f = 1.999999999;
 System.out.println(" Значение переменной а с типом byte равно " + a + System.lineSeparator() +
                 " Значение переменной b с типом short равно " + b + System.lineSeparator() +
         " Значение переменной c с типом int равно " + c + System.lineSeparator() +
         " Значение переменной d с типом long равно " + d + System.lineSeparator() +
         " Значение переменной e с типом float равно " + e + System.lineSeparator() +
         " Значение переменной f с типом double равно " + f);
 System.out.println("Задание 2");
 float first = 27.12f;
 long second = 987678965549L;
 float third = 2.786f;
 short fourth = 569;
 short fifth = -159;
 short sixth = 27897;
 byte seventh = 67;
  System.out.println(" Пишу, чтобы не висело предупреждение от идеи :) " + first + ", " + second + ", " + third +
          ", " + fourth + ", " + fifth + ", " + sixth + ", " + seventh + ".");
 System.out.println("Задание 3");
 byte lP = 23;
 byte aS = 27;
 byte eA = 30;
 short total = 480;
 short result = (short) (total / (lP + aS + eA));
  System.out.println(" На каждого ученика рассчитано " + result + " листов бумаги.");
 System.out.println("Задание 4");
 byte numberOfBottles = 16;
 byte time = 2;
 byte performance = (byte) (numberOfBottles / time);
 byte twentyMinutes = 20;
 short day = 24 * 60;
 short threeDays = (short) (day * 3);
 int month = day * 30;
 short performancePerTwentyMinutes = (short) (performance * twentyMinutes);
 short performancePerDay = (short) (performance * day);
 int performancePerThreeDays = performance * threeDays;
 int performancePerMonth = (int) (performance * month);
  System.out.println(" За 20 минут машина произвела " + performancePerTwentyMinutes + " штук бутылок" +
          System.lineSeparator() + " За 1 день машина произвела " + performancePerDay + " штук бутылок" +
          System.lineSeparator() + " За 3 дня машина произвела " + performancePerThreeDays + " штук бутылок" +
          System.lineSeparator() + " За месяц машина произвела " + performancePerMonth + " штук бутылок");

    }
}
