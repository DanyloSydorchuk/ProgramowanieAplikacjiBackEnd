public class User {
    private String firstName;
    private String surname;
    private String phoneNumber;
    private String email;
    private int    number;

    public User(String firstName, String surname, 
                String phoneNumber, String email, int number){
                    this.firstName=firstName;
                    this.surname = surname;
                    this.phoneNumber = phoneNumber;
                    this.email = email;
                    this.number = number;
                }
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public int getNumber(){
        return this.number;
    }

}
