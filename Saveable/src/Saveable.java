import java.util.ArrayList;

public interface Saveable {
    public ArrayList<String> write();
    public void read(ArrayList<String> savedValues);

}
