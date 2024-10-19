import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /*
     University, School, Car жана Person деген класс тузунуз.  Алардын свойстваларын ойлоп табыныз
     Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек  Ар бир класска 3-4 тон объект тузуп жана
     аларга маанилерин бериниз Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз */

        University university1 = new University();
        university1.setName("Cambridge");
        university1.setCountry("Great Britain");
        university1.setDate(1209);

        University university2 = new University();
        university2.setName("Stanford");
        university2.setCountry("USA");
        university2.setDate(1885);

        University university3 = new University();
        university3.setName("Oxford");
        university3.setCountry("Great Britain");
        university3.setDate(1096);

        University university4 = new University();
        university4.setName("Harvard");
        university4.setCountry("USA");
        university4.setDate(1636);

        University[] university = {university1, university2, university3,university4};
        for(University universities: university){
            System.out.println( universities.toString());
        }




        System.out.println();
        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setColor("black");
        car1.setPrice(40000);
        car1.setDate(LocalDate.of(2022, 5,19));

        Car car2 = new Car();
        car2.setBrand("Lexus");
        car2.setColor("white");
        car2.setPrice(30000);
        car2.setDate(LocalDate.of(2020, 5,12));

        Car car3 = new Car();
        car3.setBrand("Mercedes-benz");
        car3.setColor("silver");
        car3.setPrice(20000);
        car3.setDate(LocalDate.of(2023, 9,29));

        Car car4 = new Car();
        car4.setBrand("Ferrari");
        car4.setColor("black");
        car4.setPrice(60000);
        car4.setDate(LocalDate.of(2021, 4,5));

        Car[] car = {car1, car2, car3, car4};

        for(Car cars: car){
            System.out.println(cars.toString());
        }




        System.out.println();
        Person person1 = new Person();
        person1.setName("Jane");
        person1.setAge(29);
        person1.setProfession("Surgeon");
        person1.setCitizen("USA");

        Person person2 = new Person();
        person2.setName("Alex");
        person2.setAge(32);
        person2.setProfession("Engineer");
        person2.setCitizen("Germany");

        Person person3 = new Person();
        person3.setName("Alice");
        person3.setAge(28);
        person3.setProfession("Journalist");
        person3.setCitizen("Canada");

        Person person4 = new Person();
        person4.setName("Beckham");
        person4.setAge(36);
        person4.setProfession("Veterinarian");
        person4.setCitizen("Scotland");

        Person[] person = {person1, person2, person3, person4};
        for(Person persons: person){
            System.out.println(persons.toString());
        }



        System.out.println();
        Scanner scanner = new Scanner(System.in);
        School school1 = new School();
        System.out.println("Write name of school (String): ");
        school1.setName(scanner.nextLine());
        System.out.println("Write square (double) : ");
        school1.setSquare(scanner.nextDouble());
        school1.setDate(LocalDate.of(2019,8,1));


        School school2 = new School();
        scanner.nextLine();
        System.out.println("Write name of school: ");
        school2.setName(scanner.nextLine());
        System.out.println("Write square: ");
        school2.setSquare(scanner.nextDouble());
        school2.setDate(LocalDate.of(2017,6,4));


        School school3 = new School();
        scanner.nextLine();
        System.out.println("Write name of school (String) : ");
        school3.setName(scanner.nextLine());
        System.out.println("Write square (double) : ");
        school3.setSquare(scanner.nextDouble());
        school3.setDate(LocalDate.of(2020,11,16));

        School[] school = {school1, school2, school3};
        for(School schools : school){
            System.out.println( schools.toString());
        }











    }
}