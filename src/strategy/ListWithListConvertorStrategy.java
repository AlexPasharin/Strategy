/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author aleksandrpasharin
 * @param <T> any class
 */
public class ListWithListConvertorStrategy<T> {
    
    private final List<T> list;
    private ListConverter<T> convertorStrategy;

    public ListWithListConvertorStrategy(List<T> list, ListConverter<T> convertorStrategy) {
        this.list = list;
        this.convertorStrategy = convertorStrategy;
    }

    public void setConvertorStrategy(ListConverter<T> convertorStrategy) {
        this.convertorStrategy = convertorStrategy;
    }
    
    @Override
    public String toString(){
        return this.convertorStrategy.listToString(this.list);
    }
    
    
}
