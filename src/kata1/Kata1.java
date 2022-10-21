/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata1;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author airam
 */
public class Kata1 {


    public static void main(String[] args) {

        Calendar birthdate = GregorianCalendar.getInstance();
        birthdate.set(2001, 7, 31);
        Person person = new Person("Airam", birthdate);


        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }


}
    

