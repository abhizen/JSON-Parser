/**
 * Created by abhinit on 11/23/15.
 */
public class Variable implements Expression {
    private String value;

    public Variable(String value){
        this.value = value;
    }

    public String getName(){
        return this.value;
    }

    @Override
    public Expression getValue() {
        return null;
    }
}
