import java.util.ArrayList;
public class ModArrayList<D> extends ArrayList<D>{
    public D getUsingMod(int index){
        int ValidIndex = Math.abs(index) % this.size();
        return this.get(ValidIndex);
    }
}
