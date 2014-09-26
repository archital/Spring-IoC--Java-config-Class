

package home.luxoft.myswingiocwith_java_config_class;

import java.util.List;


public interface ContactsService {
    
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
