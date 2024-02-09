//encapsulating string in another class and not using in main class
package domain.types;

public class Details {
    private String details;

    public boolean validateDetails(){
        if(this.details.isBlank()){
            return false;
        }
        return true;
    }
}
