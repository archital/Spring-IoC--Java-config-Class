package home.luxoft.myswingiocwith_java_config_class;

import java.util.List;


public interface ContactsDao {
     void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
