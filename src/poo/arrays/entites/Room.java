package introducao.arrays.entites;

public class Room {
    private String name;
    private String email;

    public Room(String name, String email){
        this.name = name;
        this.email = email;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

    public String toString(){
        return name + ", " + email;
    }
}

