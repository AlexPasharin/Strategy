package strategy;

import java.util.List;

/** This ListConverter converts list to an array before going through it elements
 * 
 * A new line char is inserted after every second list element
 *
 * @author aleksandrpasharin
 * @param <T> any class
 */
public class ListConverterB<T> implements ListConverter<T>{

    @Override
    public String listToString(List<T> list) {
        StringBuilder sb = new StringBuilder();
        
        T[] ar = (T[]) list.toArray();
        
        for(int i = 0; i < ar.length; i++){
            sb.append(ar[i].toString());
            
            if(i%2 == 1) sb.append('\n'); 
            else sb.append(' '); 
        }        
        
        return sb.toString();
    }       
}
