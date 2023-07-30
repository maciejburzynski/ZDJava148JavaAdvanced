package composition.romm;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public  class Inventory implements List<Inventory> {


    private int quantity;
    private int price;
    private InventoryType ineventoryType;

    public Inventory(int quantity, int price, InventoryType ineventoryType) {
        this.quantity = quantity;
        this.price = price;
        this.ineventoryType = ineventoryType;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Inventory> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Inventory inventory) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Inventory> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Inventory> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Inventory get(int index) {
        return null;
    }

    @Override
    public Inventory set(int index, Inventory element) {
        return null;
    }

    @Override
    public void add(int index, Inventory element) {

    }

    @Override
    public Inventory remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Inventory> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Inventory> listIterator(int index) {
        return null;
    }

    @Override
    public List<Inventory> subList(int fromIndex, int toIndex) {
        return null;
    }
}
