public class Employee {
    private String surname, name, sex, education, position, department;
    private int age;

    public Employee (String surname, String name, int age, String sex, String education, String position, String department){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.position = position;
        this.department = department;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }

    public void setEducation(String education){
        this.education = education;
    }
    public String getEducation(){
        return education;
    }

    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return String.format("%15s\t%15s\t%10d\t%10s\t%15s\t%15s\t%10s", surname, name, age, sex, education, department, position);
    }
}
