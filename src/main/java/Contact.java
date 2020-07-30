import java.util.*;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;

    private static Map<Integer, Contact> allContacts = new HashMap<>();
    private static int countId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact (String name, String phoneNumber){
        if (allContacts == null){
            allContacts = new HashMap<>();
        }
        this.name = name;
        this.phoneNumber = phoneNumber;

        if (!hasContact()){
            countId++;
            this.id = countId;
            allContacts.put(id, this);
        }
    }

    private boolean hasContact(){
        for (Contact contact : allContacts.values()){
            if (contact.equals(this) && contact.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    public static List<Contact> getAllContacts(){
        return new ArrayList<>(allContacts.values());
    }

    public static int numberOfContacts(){
        return allContacts.size();
    }

    @Override
    public String toString(){
        return "Имя: " + this.name + ", телефон: " + this.phoneNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return id == contact.id;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + id;
        return result;
    }
}