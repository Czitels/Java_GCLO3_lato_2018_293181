/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyjatki_kolekcje_rtti;
import java.util.Scanner;
/**
 *
 * @author bitel
 */
public class Wyjatki_Kolekcje_RTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double xd=input.nextDouble();
        CalculateSqrt MySqrt=new CalculateSqrt();
        MySqrt.SqrtCount(xd);
    }
    
}
//instanceof, dzialanie
public void doSomething(Number param) {
  if( param instanceof Double) {
    System.out.println("param is a Double");
  }
  else if( param instanceof Integer) {
    System.out.println("param is an Integer");
  }

  if( param instanceof Comparable) {
    //subclasses of Number like Double etc. implement Comparable
    //other subclasses might not -> you could pass Number instances that don't implement that interface
    System.out.println("param is comparable"); 
  }
}

//excetiony 
class WordContainsException extends Exception
{
      // Parameterless Constructor
      public WordContainsException() {}

      // Constructor that accepts a message
      public WordContainsException(String message)
      {
         super(message);
      }
 }
//usage
try
{
     if(word.contains(" "))
     {
          throw new WordContainsException();
     }
}
catch(WordContainsException ex)
{
      // Process message however you would like
}
// inny przyklad
//
//
//
//
public class NameNotFoundException extends Exception {

    public NameNotFoundException(String message) {
        super(message);
    }

}
//uzycie go
public class CustomerService {

    public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer(name);

    }

    public static void main(String[] args) {

        CustomerService obj = new CustomerService();

        try {

            Customer cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}