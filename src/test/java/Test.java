import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void testGetAllContacts(){
        Contact contact1 = new Contact("Николаев Олег", "4539877");
        Contact contact2 = new Contact("Денисова Кира", "3456622");
        Contact contact3 = new Contact("Иванов Петр", "3234433");

        List<Contact> expected = Contact.getAllContacts();

        List<Contact> actual = new ArrayList<>();

        actual.add(contact1);
        actual.add(contact2);
        actual.add(contact3);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testGetAllContactsNotNull(){
        List<Contact> expected = Contact.getAllContacts();
        Assertions.assertNotNull(expected);
    }

    @org.junit.jupiter.api.Test
    public void testNumberOfContacts(){
        Contact contact1 = new Contact("Николаев Олег", "4539877");
        Contact contact2 = new Contact("Денисова Кира", "3456622");
        Contact contact3 = new Contact("Иванов Петр", "3234433");

        int expected = Contact.numberOfContacts();
        int actual = 3;

        Assertions.assertEquals(expected, actual);
    }
}
