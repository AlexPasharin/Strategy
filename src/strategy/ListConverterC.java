package strategy;

import java.util.List;

/** This ListConverter uses get-method of List interface and for loop
 * 
 * A new line char is inserted after every third list element
 *
 * @author aleksandrpasharin
 * @param <T> any class
 */
public class ListConverterC<T> implements ListConverter<T>{

    @Override
    public String listToString(List<T> list) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i).toString());
            
            if(i%3 == 2) sb.append('\n');
            else  sb.append(' ');
        }        
        
        return sb.toString();
    }       
}
