import java.util.*;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;


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

        this.name = name;
        this.phoneNumber = phoneNumber;

        if (!PhoneBook.hasContact(this)){
            countId++;
            this.id = countId;
        }
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