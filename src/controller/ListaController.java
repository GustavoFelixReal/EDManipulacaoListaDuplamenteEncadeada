package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaController {

	public ListaController() {
		super();
	}
	
	public List<Integer> concat(List<Integer> list1, List<Integer> list2) {
		List<Integer> concatList = new LinkedList<Integer>();
		
		for (int i = 0; i < list1.size(); i++) {
			concatList.add(list1.get(i));
			concatList.add(list2.get(i));
		}
		
		return concatList; 
	}
	
	public List<List<Integer>> split(List<Integer> list, int splitBy) {
		List<List<Integer>> partitions = new LinkedList<List<Integer>>();
		int listSize = list.size();
		
		
		if (listSize / splitBy < 1) {
			throw new Error("Não é possível dividir a lista por " + splitBy);
		}
		
		for (int i = 0; i < listSize; i += splitBy) {
			partitions.add(new LinkedList<Integer>(
					list.subList(i, Math.min(listSize, i + splitBy))
			));
		}
		
		return partitions;
	}

}
