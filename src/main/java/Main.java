import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String phoneNumber;
        while(true){
            System.out.println("Введите имя, если хотите завершить, введите end");
            name = scanner.nextLine();
            if(name.equals("end")) break;
            System.out.println("Введите номер телефона");
            phoneNumber = scanner.nextLine();
            Contact contact = new Contact(name, phoneNumber);
            PhoneBook.addContact(contact);
        }
        System.out.println("Ваши контакты: \n" + PhoneBook.getAllContacts());
        System.out.println("У Вас " + PhoneBook.numberOfContacts() + " контакта");
    }


}