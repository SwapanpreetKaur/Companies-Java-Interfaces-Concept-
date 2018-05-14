package com.java.company;

/**
 * Created by swapanpreetkaur on 2/2/17.*/
package com.eval;

        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class Employee {
    int id_number;
    String name;
    int age;

    List<Address> addresses_list;

    public Employee() {
        addresses_list = new ArrayList<Address>();


    }

    public Employee(int id, String name1, int age) {
        this.id_number = id;
        name = name1;
        this.age = age;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses_list() {
        return addresses_list;
    }

    public void setAddresses_list(List<Address> addresses_list) {
        this.addresses_list = addresses_list;
    }

    public void addAddress(Address address){
        this.addresses_list.add(address);
    }


    public static Employee empobj(int id, String name, int age) {
        Employee emp = new Employee();
        emp.id_number = id;
        emp.name = name;
        emp.setAge(age);
        return emp;
    }

}
