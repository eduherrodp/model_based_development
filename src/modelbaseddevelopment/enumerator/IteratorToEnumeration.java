import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Enumeration {
    Iterator iter;
    public IteratorToEnumeration(Iterator iter){
        this.iter = iter;
    }
    public boolean hasMoreElements(){
        return iter.hasNext();
    }
    public Object nextElement(){
        return iter.next();
    }
}
