class DynamicArray{
    int capacity;
    int[] arr;
    int lastElement;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[10000];
        lastElement =-1;
    }
    public int get(int i) {
        return arr[i];
    }
    public void set(int i,int n) {
        arr[i] = n;
    }
    public void pushback(int n) {
        if(capacity == lastElement+1) resize();
        arr[++lastElement] = n;
    }
    public int popback() {
        return arr[lastElement--];
    }
    public void resize() {
        capacity*=2;
    }
    public int getSize() {
        return lastElement+1;
    }
    public int getCapacity() {
        return capacity;
    }

}