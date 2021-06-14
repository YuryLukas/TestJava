

public class OutputString {
    private String prefix;
    private String name;

    public OutputString(){
        
    }
    
    public OutputString(String prefix){
        this.prefix = prefix;
    }

    public void output(String name) {
        System.out.print( this.prefix.trim() + " ");
        System.out.println(name);
    }

    public void output() {
        System.out.print( this.getPrefix().trim() + " ");
        System.out.println(this.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public String getPrefix(){
        return this.prefix;
    }
}
