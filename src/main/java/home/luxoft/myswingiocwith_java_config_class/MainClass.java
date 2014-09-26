
package home.luxoft.myswingiocwith_java_config_class;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {
    

    public static void main(String[] args) throws SQLException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
  
        
       ContactsServiceImplement contactsServiceImplement = context.getBean(ContactsServiceImplement.class);

       Contact contact = context.getBean(Contact.class);
        
      int gettercontactlistprop = contactsServiceImplement.getConlistprop();
      List gettercontactlist = contactsServiceImplement.getAllContacts();
        System.out.println(contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)); 
        if (contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)==true){
      contactsServiceImplement.addContact(contact);   
        } else {System.out.println("Contact book is full!");}
        List li = contactsServiceImplement.getAllContacts();
        for (Iterator it = li.iterator(); it.hasNext();) {
            Object object = it.next();
            System.out.println(object.toString());
        }
        
          
            
    }  
}
