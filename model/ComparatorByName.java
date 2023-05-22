package model;
import model.FamilyTreeItem;

import java.util.Comparator;

public class ComparatorByName<T extends FamilyTreeItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
