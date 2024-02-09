//encapsulating string in another class instead and not using in main class
package domain.types;

public class Title {
    private String title;

    public boolean validateTitle(){
        if(this.title.isBlank()){
            return false;
        }
        return true;
    }
}
