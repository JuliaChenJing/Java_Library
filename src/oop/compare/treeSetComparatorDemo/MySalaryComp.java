package oop.compare.treeSetComparatorDemo;

import java.util.Comparator;

class MySalaryComp implements Comparator<Empl>{
	 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
