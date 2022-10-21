/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata1;
import java.util.Date;

/**
 *
 * @author airam
 */
public class Kata1 {


    public static void main(String[] args) {

        Person person = new Person("Airam", new Date(101, 6, 31));


        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");

    }


}
    

