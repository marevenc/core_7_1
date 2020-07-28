import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");

            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String sex = scanner.next();
            String education = scanner.next();
            String position = scanner.next();
            String department = scanner.next();

            Employee emp = new Employee(surname, name, age, sex, education, position, department);
            list.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end, если хотите добавить еще одного сотрудника, нажмите enter");
            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }

        printEmp(list);

        while (true) {
            System.out.println("Если хотите изменить данные сотрудника, нажмите enter, если не хотите менять данные, введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            makeChanges(list);
        }
        printEmp(list);
    }

    public static List<Employee> deleteEmployee(List<Employee> list, int i){
        list.remove(i);
        return list;
    }
    static int searchBySurname(String surname, String name, List<Employee> employeeList){
        int index = -1;
        for(int i = 0; i < employeeList.size(); i++){
            if(employeeList.get(i).getSurname().equals(surname) && employeeList.get(i).getName().equals(name)){
                index = i;
            }
        }

        if(index != -1){
            return index;
        } else {
            return -1;
        }
    }

    public static void printEmp(List<Employee> employeeList){
        System.out.println("Список сотрудников:");
        System.out.printf("%15s\t%15s\t%10s\t%10s\t%15s\t%15s\t%10s", "Фамилия", "Имя", "Возраст", "Пол", "Образование", "Должность", "Отдел");
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    public static void makeChanges(List<Employee> list){
        System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
        Scanner scanner = new Scanner(System.in);
        String input;
        String surname = scanner.next();
        String name = scanner.next();
        scanner.nextLine();

        int empIndex = searchBySurname(surname, name, list);
        if (empIndex != -1) {
            System.out.println("Меняем фамилию? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите фамилию");
                input = scanner.nextLine();
                list.get(empIndex).setSurname(input);
            }

            System.out.println("Меняем имя? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите имя");
                input = scanner.nextLine();
                list.get(empIndex).setName(input);
            }

            System.out.println("Меняем возраст? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите возраст");
                list.get(empIndex).setAge(scanner.nextInt());
                scanner.nextLine();
            }

            System.out.println("Меняем пол? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите пол");
                input = scanner.nextLine();
                list.get(empIndex).setSex(input);
            }

            System.out.println("Меняем образование? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите образование");
                input = scanner.nextLine();
                list.get(empIndex).setEducation(input);
            }

            System.out.println("Меняем должность? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите должность");
                input = scanner.nextLine();
                list.get(empIndex).setPosition(input);
            }

            System.out.println("Меняем отдел? Введите да/нет");
            input = scanner.nextLine();
            if ("да".equals(input)) {
                System.out.println("Введите отдел");
                input = scanner.nextLine();
                list.get(empIndex).setDepartment(input);
            }
        } else {
            System.out.println("Сотрудник не найден");
        }
    }
}