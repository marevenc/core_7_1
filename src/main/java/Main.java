import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, Contact> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String phoneNumber;
        while(true){
            System.out.println("Введите имя, если хотите завершить, введите end");
            name = scanner.nextLine();
            if(name.equals("end")) break;
            System.out.println("Введите номер телефона");
            phoneNumber = scanner.nextLine();
            Contact contact = new Contact(name, phoneNumber);
        }
        System.out.println("Ваши контакты: \n" + Contact.getAllContacts());
        System.out.println("У Вас " + Contact.numberOfContacts() + " контакта");
    }


}