package poo.serialization.entities;

import java.io.Serializable;

public class Contact implements Serializable{
        public String name;
        public String phoneNum;

    public Contact(String name, String phoneNum){
            this.name = name;
            this.phoneNum = phoneNum;
        }
}
