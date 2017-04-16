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
public interface ListConverter<T> {
    
    String listToString(List<T> list);
    
}
