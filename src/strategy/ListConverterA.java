package strategy;

import java.util.Iterator;
import java.util.List;

/** This ListConverter uses iterator to go through the list
 * 
 * A new line char is inserted after every list element
 *
 * @author aleksandrpasharin
 * @param <T> any class
 */
public class ListConverterA<T> implements ListConverter<T>{

    @Override
    public String listToString(List<T> list) {
        StringBuilder sb = new StringBuilder();
        
        Iterator<T> it = list.iterator();
        
        while(it.hasNext()){
            sb.append(it.next().toString());
            sb.append('\n');
        }
        
        return sb.toString();
    }    
    
}
