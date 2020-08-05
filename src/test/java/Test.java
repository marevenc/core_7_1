import java.util.*;

import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void testHasContact(){
        Contact contact1 = new Contact("Oleg", "4539877");
        Contact contact2 = new Contact("Kira", "3456622");
        Contact contact3 = new Contact("Pavel", "3234433");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.addContact(contact3);

        Assertions.assertEquals(phoneBook.hasContact(contact1), true);
    }

    @org.junit.jupiter.api.Test
    public void testAddContacts(){
        Contact contact1 = new Contact("Oleg", "4539877");
        Contact contact2 = new Contact("Kira", "3456622");
        Contact contact3 = new Contact("Pavel", "3234433");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.addContact(contact3);


        Map<Integer, Contact> actual = new HashMap<>();
        actual.put(1, contact1);
        actual.put(2, contact2);
        actual.put(3, contact3);
        Assertions.assertEquals(PhoneBook.allContacts, actual);
    }

    @org.junit.jupiter.api.Test
    public void testContactsNotNull(){
        Contact contact1 = new Contact("Oleg", "4539877");
        Contact contact2 = new Contact("Kira", "3456622");
        Contact contact3 = new Contact("Pavel", "3234433");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.addContact(contact3);

        Assertions.assertNotNull(phoneBook.getAllContacts());
    }

}
