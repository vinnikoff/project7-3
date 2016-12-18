/**
 * Created by VINNI on 17.12.16.
 */


import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "firstName", "Petrov", "city", 10000));
        users.add(new User(2, "firstName2", "lastName2", "city2", 9000));
        users.add(new User(3, "firstName3", "lastName3", "city3", 8000));
        users.add(new User(4, "firstName4", "lastName4", "city4", 7000));
        users.add(new User(5, "firstName5", "lastName5", "city5", 6000));
        users.add(new User(6, "firstName6", "lastName6", "city6", 5000));
        users.add(new User(7, "firstName7", "lastName7", "city7", 4000));
        users.add(new User(8, "firstName8", "lastName8", "city8", 3000));
        users.add(new User(9, "firstName9", "lastName9", "city9", 2000));
        users.add(new User(10, "firstName10", "lastName10", "city10", 1000));


        //User[] userArray = new User[10];
        //userArray[0] = new User(1, "firstName", "lastName", "city", 10000);
        //userArray[1] = new User(2, "firstName2", "lastName2", "city2", 9000);
        //userArray[2] = new User(3, "firstName3", "lastName3", "city3", 8000);
        //userArray[3] = new User(4, "firstName4", "lastName4", "city4", 7000);
        ///userArray[4] = new User(5, "firstName5", "lastName5", "city5", 6000);
        //userArray[5] = new User(6, "firstName6", "lastName6", "city6", 5000);
        //userArray[6] = new User(7, "firstName7", "lastName7", "city7", 4000);
        //userArray[7] = new User(8, "firstName8", "lastName8", "city8", 3000);
        //userArray[8] = new User(9, "firstName9", "lastName9", "city9", 2000);
        //userArray[9] = new User(10, "firstName10", "lastName10", "city10", 1000);

        Set<Order> oder = new TreeSet<>();

        oder.add(new Order(300, 2000, Currency.USD, "itemName3", "shopIdentificator", users.get(8)));
        oder.add(new Order(3000, 12000, Currency.GRN, "itemName33", "shopIdentificator33", users.get(0)));
        oder.add(new Order(200, 3000, Currency.USD, "itemName2", "shopIdentificator2", users.get(1)));

        oder.add(new Order(400, 4000, Currency.GRN, "itemName8", "shopIdentificator3", users.get(2)));
        oder.add(new Order(100, 7000, Currency.USD, "itemName8", "shopIdentificator2", users.get(5)));
        oder.add(new Order(800, 6000, Currency.USD, "itemName7", "shopIdentificator1", users.get(1)));
        oder.add(new Order(900, 9000, Currency.USD, "itemName9", "shopIdentificator23", users.get(3)));
        oder.add(new Order(700, 1000, Currency.USD, "itemName4", "shopIdentificator7", users.get(7)));

        oder.add(new Order(900, 9000, Currency.USD, "itemName9", "shopIdentificator23", users.get(3)));
        oder.add(new Order(700, 1000, Currency.USD, "itemName4", "shopIdentificator7", users.get(7)));

        System.out.println(oder);

        for (Order order : oder) {
            if(order.getUser().getLastName().equals("Petrov"))
                System.out.println("Есть Петров");
            else System.out.println("Нет Петрова");
    }

    Iterator itr = oder.iterator();
            Object element = itr.next();
        System.out.println(element);

        // повтор с использованием get
        List<Object> maxPrice = Arrays.asList(oder.toArray());
        Order result = (Order) maxPrice.get(0);
        System.out.println(result);



        Iterator itr2 = oder.iterator();
        while(itr2.hasNext()) {
            Order element2 = (Order) itr2.next();
if (element2.getCurrency()==Currency.USD)
    itr2.remove();

        }

        System.out.println(oder);
    }
}
