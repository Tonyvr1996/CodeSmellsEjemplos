/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.SwitchStatements;

import java.util.List;

/**
 *
 * @author Yoselin
 */
public class SwitchStatementsCodeSmells {
    public List<String> GetSortedData(String searchType, List<String> data)  
        {  
            List<String> sortedData = null;  
            String x;
            switch (searchType)  
            {  
                case "BubbleSort":  
                    //Peform Bubble sort and assign to data.  
                    sortedData = data;  
                    break;  
  
                case "HeapSort":  
                    //Peform Heap sort and assign to data.  
                    sortedData = data;  
                    break;  
  
                case "MergeSort":  
                    //Peform Merge sort and assign to data.  
                    sortedData = data;  
                    break;  
  
                case "InsertionSort":  
                    //Peform Insertion sort and assign to data.  
                    sortedData = data;  
                    break;  
            }  
  
            return sortedData;  
        }  
}
