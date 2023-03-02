package nus.iss.day13workshopadrsbook.repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import nus.iss.day13workshopadrsbook.model.Contact;

@Repository
public class ContactRepo {

    private List<Contact> contacts;

    public ContactRepo() throws ParseException {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = df.parse("1980-10-15");
        Contact cont = new Contact("Lee", "lee@gmail.com", 8765432, dt);
        contacts.add(cont);

        dt = df.parse("1988-11-11");
        cont = new Contact("Tan", "tan@gmail.com", 98764454, dt);
        contacts.add(cont);

    }

    public List<Contact> findAll() {
        return contacts;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }


}
