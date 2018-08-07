/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.SwitchStatements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yoselin
 */
public class SortingClientRefactoring {
    
    ArrayList<String> data = new ArrayList<>(); //{ "Ball", "Apple", "Cat" };    
    SortingContextRefactoring sortingContext = new SortingContextRefactoring();  
    List<String> result = sortingContext.GetSortedData("BubbleSort", data);
    
}
