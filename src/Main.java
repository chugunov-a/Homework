//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(" Result №1 = " + "dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper + ".");
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(" Result №2 = " + "dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper + ".");
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(" Result №3 = " + "dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper + ".");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(" friend = " + friend);
        friend = friend + 2;
        System.out.println(" friend = " + friend);
        friend = friend / 7;
        System.out.println(" friend = " + friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(" frog = " + frog);
        frog = frog * 10;
        System.out.println(" frog = " + frog);
        frog = frog / 3.5;
        System.out.println(" frog = " + frog);
        frog = frog + 4;
        System.out.println(" frog = " + frog);
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var massDifference = boxer2Weight - boxer1Weight;
        System.out.println(" Общая масса бойцов = " + totalWeight);
        System.out.println(" Разница между массами бойцов = " + massDifference);
        System.out.println("Задача 7");
        System.out.println(" Остаток от деления между весами бойцов = " + boxer2Weight % boxer1Weight);
        System.out.println("Задача 8.1");
        var hours = 640;
        var hoursFor1Employee = 8;
        var totalNumbersOfEmployees = hours / hoursFor1Employee;
        System.out.println(" Всего работников в комании - " + totalNumbersOfEmployees + " человек");
        System.out.println("Задача 8.2");
        var employees = totalNumbersOfEmployees + 94;
        var unknownNumberOfHours = (totalNumbersOfEmployees + 94) * 8;
        System.out.println(" Если в компании работает " + employees + " человека, то всего " + unknownNumberOfHours + " часов работы может быть поделено между сотрудниками");
    }
}
