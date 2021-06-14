import java.util.Scanner;

class InputString{
    private String nameString;
    private String message;
    private Scanner keyboard;

    InputString() {
        
    }

    InputString(String message) {
        this.message = message;    
    }

    public void read() {
        this.keyboard = new Scanner(System.in);
        System.out.println(this.message);
        this.nameString = keyboard.nextLine();
    }

    public void setName(String nameString) {
        this.nameString = nameString;
    }

    public String getName() {
        return this.nameString;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}