class DynamicArray {

    private ArrayList<Integer> arr;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new ArrayList<>(capacity);
    
    }

    public int get(int i) {
        return arr.get(i);
    }

    public void set(int i, int n) {
        arr.set(i,n);
 
    }

    public void pushback(int n) {
        if (arr.size() == capacity){
            resize();
        }
        arr.add(n);
        
    }

    public int popback() {
        return arr.remove(arr.size()-1);
    }

    private void resize() {
        capacity = capacity*2;
    }

    public int getSize() {
        return arr.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
