package Array.Array.QueryAndUpdate;


public class Array {

    private int[] data;
    private int size;

    // 構造函數，傳入數組的容量capacity構造Array //456change
    //a
    //b
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 無參數的構造函數，默認數組的容量capacity=10
    public Array(){
        this(10);
    }

    // 獲取數組的容量
    public int getCapacity(){
        return data.length;
    }

    // 獲取數組中的元素個數
    public int getSize(){
        return size;
    }

    // 返回數組是否為空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素後添加一個新元素
    public void addLast(int e){
        add(size, e);
    }

    // 在所有元素前添加一個新元素
    public void addFirst(int e){
        add(0, e);
    }

    // 在index索引的位置插入一個新元素e
    public void add(int index, int e){

        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for(int i = size - 1; i >= index ; i --)
            data[i + 1] = data[i];

        data[index] = e;

        size ++;
    }

    // 獲取index索引位置的元素
    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    // 修改index索引位置的元素為e
    public void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = e;
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
