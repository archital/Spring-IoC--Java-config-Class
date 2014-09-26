/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.luxoft.myswingiocwith_java_config_class;


import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:newproperties.properties")
public class ApplicationConfig {
    
    @Bean
    public Contact getContact() {
    Contact contact3 = new Contact(896541232, "Puttler");
    return contact3;
    }
    @Bean
    
    public ContactsDaoImplement getContactsDao () {
    
        List<Contact> contactlist = new ArrayList<Contact>();
        Contact contact1 = new Contact(956781112, "Azarov");
        Contact contact2 = new Contact(764512815, "Yanukovich");
        contactlist.add(contact1);
        contactlist.add(contact2);
        ContactsDaoImplement contactsDao = new ContactsDaoImplement(contactlist);
        return contactsDao;
    } 
        @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }
     @Bean
     public ContactsServiceImplement getContactsServiceImplement() {
         ContactsServiceImplement contactsServiceImplement = new ContactsServiceImplement();
     return contactsServiceImplement;
     }
}
