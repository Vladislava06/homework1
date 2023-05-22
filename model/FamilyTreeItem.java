package model;

public interface FamilyTreeItem {
    String getFullName();
    int getAge();
    FamilyTreeItem getFather();
    FamilyTreeItem getMother();
    void addKid(T human);
}
