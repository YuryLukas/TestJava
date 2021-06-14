

public class OutputString {
    private String prefix;
    private String name;

    // Сделано по опыту прежней работы на Java
    // Требовали создал класс с конструктором, должен быть и пустой конструктор. Почему? 
    //Это просто требование от фирмы, или имеет какй-то сакральный смысл
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
