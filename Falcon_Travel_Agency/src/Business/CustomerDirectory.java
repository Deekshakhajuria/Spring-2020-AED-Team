/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CustomerDirectory {

    private ArrayList<Person> custDir;
  

    public CustomerDirectory() {
        custDir = new ArrayList<Person>();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1,d2,d3;
        
        try {
                 d1 = df.parse("10-12-2019");
                 d2 = df.parse("10-12-2019");
                 d3 = df.parse("10-12-2019");
//                 Person p1 = new Person("Shreedhar", "Steve", "222", "Male", d1.toString());
//                 Person p2 = new Person("Dabas", "Abhishek", "222", "Male", d2.toString());
//                 Person p3 = new Person("Vig", "Parul", "222", "Female", d3.toString());
//        custDir.add(p1);
//        custDir.add(p2);
//        custDir.add(p3);
 
            } catch (ParseException e) {
                System.out.println("error in date format");
            }

       /* Person p1 = new Person("Shreedhar", "Steve", "222", "Male", d1);
        Person p2 = new Person("Dabas", "Abhishek", "222", "Male", d2);
        Person p3 = new Person("Vig", "Parul", "222", "Female", d3);
        custDir.add(p1);
        custDir.add(p2);
        custDir.add(p3);
*/
    }


    public ArrayList<Person> getCustDir() {
        return custDir;
    }

    public void setCustDir(ArrayList<Person> custDir) {
        this.custDir = custDir;
    }
    public Person addPerson(String FullName, int PhoneNo, String EmailId, int Age, Date DOB)
{
    Person person = new Person(FullName, PhoneNo, EmailId, Age, DOB);
    custDir.add(person);
    return person;
}
   
public void removePerson(Person person)
{
   
    custDir.remove(person);
   
} 
}
