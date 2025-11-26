public class Main {
    public  static void main(String[] args){
         System.out.println("I love java");
         System.out.print("Kenya is a beautiful country\n");
         System.out.print("You need to visit kenya - Maasai Mara National Park\n");
         //comment - this is my first java project
        /*
        This
        is
        multi-line
        comment
         */
        int age=22;
        System.out.println("My Age is "+age);

        int year = 2025;
        System.out.println("The year is "+year);

        int quantity = 676;
        System.out.println("The quantity is "+quantity);

        double price = 12;
        System.out.println("$" + price);

        double temp = 36.5;
        System.out.println("The Temperature is " + temp + " ᰱᰱᰱᰱᰱC");

        char grade = 'A';
        System.out.println(grade);

        char symbol = '!';
        System.out.println(symbol);

        char currency = '$';
        System.out.println(currency);

        boolean isStudent = false;
        System.out.println(isStudent);

        boolean forSale = true;
        System.out.println(forSale);

        if(isStudent == true){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You aren't a student");
        }

        String name = "Julius Irungu";
        System.out.println("My name is " + name);

        String food = "Ugali + Nyama";
        System.out.println("My favourite food is " + food);

        String email = "kasongothegithinji254@gmail.com";
        System.out.println("Email ya kasongo -> " + email);
        System.out.println("Hello my name is " + name + " and I'm " + age + " years old. My body temperature is " + temp + " ᰱᰱᰱᰱᰱC");

        String car = "Ford Mustang";
        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else {
            System.out.println("There is a " + car + " is not for sale");
        }
    }
}