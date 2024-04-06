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
 int performancePerMonth = performance * month;
  System.out.println(" За 20 минут машина произвела " + performancePerTwentyMinutes + " штук бутылок" +
          System.lineSeparator() + " За 1 день машина произвела " + performancePerDay + " штук бутылок" +
          System.lineSeparator() + " За 3 дня машина произвела " + performancePerThreeDays + " штук бутылок" +
          System.lineSeparator() + " За месяц машина произвела " + performancePerMonth + " штук бутылок");
System.out.println("Задание 5");
byte totalNumber = 120;
byte whiteDyeForOneClass = 2;
byte brownDyeForOneClass = 4;
byte totalDyeForOneClass = (byte) (whiteDyeForOneClass + brownDyeForOneClass);
byte totalClassNumber = (byte) (totalNumber / totalDyeForOneClass);
byte totalWhiteDye = (byte) (totalClassNumber * whiteDyeForOneClass);
byte totalBrownDye = (byte) (totalClassNumber * brownDyeForOneClass);
 System.out.println(" В школе, где " + totalClassNumber + " классов, нужно " + totalWhiteDye +
         " банок белой краски и " + totalBrownDye + " банок коричневой краски");
System.out.println("Задание 6");
byte banana = 80;
short milk = 105 * 2;
short iceCream = 100 * 2;
short rawEggs = 4 * 70;
short totalWeight = (short) (banana + milk + iceCream + rawEggs);
float kilo = totalWeight / 1000f;
 System.out.println(" Вес в граммах: " + totalWeight + " Вес в килограммах: " + kilo);
System.out.println("Задание 7");
short goal = 7000;
short caseOne = 250;
short caseTwo = 500;
byte caseOneResult = (byte) (goal / caseOne);
byte caseTwoResult = (byte) (goal / caseTwo);
byte average = (byte) ((caseOneResult + caseTwoResult) / 2);
 System.out.println(" На похудение потребуется в среднем " + average + " день");
System.out.println(" Задача 8");
int mashaSalary = 67760;
int denisSalary = 83690;
int krisSalary = 76230;
int mashaNewSalary = (int) (mashaSalary + mashaSalary * 0.1);
int denisNewSalary = (int) (denisSalary + denisSalary * 0.1);
int krisNewSalary = (int) (krisSalary + krisSalary * 0.1);
int mashaDifference = (mashaNewSalary * 12) - (mashaSalary * 12);
int denisDifference = (denisNewSalary * 12) - (denisSalary * 12);
int krisDifference = (krisNewSalary * 12) - (krisSalary * 12);
 System.out.println(" Маша теперь получает " + mashaNewSalary + " рублей в месяц. Годовой доход вырос на "
                + mashaDifference + " рублей в год" + System.lineSeparator() + " Денис теперь получает " + denisNewSalary +
         " рублей в месяц. Годовой доход вырос на " + denisDifference + " рублей в год" + System.lineSeparator() +
         " Кристина теперь получает " + krisNewSalary + " рублей в месяц. Годовой доход вырос на " + krisDifference +
         " рублей в год");
    }
}
