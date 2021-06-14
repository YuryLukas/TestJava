

public class App {
    public static void main(String[] args) throws Exception {

        InputString myInput = new InputString("Как Ваше имя?");
        OutputString myOut = new OutputString("Привет, ");
        myInput.read();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        myOut.output(myInput.getName());

    }
}
