/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.SwitchStatements;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Yoselin
 */
public class SortingContextRefactoring {
    
    private HashMap<String, ISortDataRefactoring> sortStrategy = new HashMap<String, ISortDataRefactoring>();  
  
    public SortingContextRefactoring()  
    {  
        sortStrategy.put("BubbleSort", new BubbleSortDataRefactoring());  
        sortStrategy.put("HeapSort", new HeapSortDataRefactoring());  
        
        sortStrategy.put("MergeSort", new MergeSortDataRefactoring());  
        sortStrategy.put("InsertionSort", new InsertionSortDataRefactoring());  
        
    }  
  
    public List<String> GetSortedData(String searchType, List<String> data)  
    {  
        return sortStrategy.get(searchType).GetSortedData(data);  
    }
    
}
