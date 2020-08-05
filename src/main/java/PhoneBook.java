import java.util.*;

public class PhoneBook {

    public static Map<Integer, Contact> allContacts = new HashMap<>();

    public static boolean hasContact(Contact contact){
        for (Contact i : allContacts.values()){
            if (i.equals(contact) && i.hashCode() == contact.hashCode()){
                return true;
            }
        }
        return false;
    }

    public static void addContact(Contact contact){
        if (!hasContact(contact)){
            allContacts.put(contact.getId(), contact);
        } else {
            System.out.println("Такой контакт уже существует");
        }

    }

    public static List<Contact> getAllContacts(){
        return new ArrayList<>(allContacts.values());
    }

    public static int numberOfContacts(){
        return allContacts.size();
    }
}

