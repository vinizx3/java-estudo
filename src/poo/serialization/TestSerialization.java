package poo.serialization;

import poo.serialization.entities.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestSerialization {
    private static void contactSerialize(List<Contact> contacts) throws IOException{
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Agenda.ser"))){
            outputStream.writeObject(contacts);
            System.out.println("operation completed");
        }
    }

    private static void deserializeContact() throws IOException,ClassNotFoundException{
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Agenda.ser"))){
            List<Contact> readContacts = (List<Contact>) inputStream.readObject();
            for (Contact contact : readContacts){
                System.out.println("Contact: " + contact.name + ", Telephone: " + contact.phoneNum);
            }
        }
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("user745", "21760");
        Contact contact2 = new Contact("User862", "52893");
        Contact contact3 = new Contact("User292", "71906");

        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);

        try {
            contactSerialize(contactList);
            deserializeContact();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
