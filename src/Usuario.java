package src;

public class Usuario {
    private String name;
    private String lastName;
    private String email;
    private String password;

    public Usuario( String name , String lastName, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    
}