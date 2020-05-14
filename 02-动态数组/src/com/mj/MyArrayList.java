package com.mj;

/**
 * 我们自己定义一个 动态数组
 */
public class MyArrayList {

    // 元素的数量
    private int size;
    // 所有的元素都放这里
    private int [] elements;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;

    // 无参构造方法，默认一开始长度为 10
    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 有参构造方法，使用者传入了长度为 capacity
    public MyArrayList(int capacity){

        // 当传入的值小于 10 时，默认设置为 10
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
        elements = new int [capacity];
    }


    /**
     * 清除所有元素
     */
    // 这里只要这一步即可，因为对于使用者来说，这个数组确实是被清空了
    // 并且残留的数组位置，可以重复利用
    public void clear(){
        size = 0;
    }

    /**
     * 元素的数量
     */
    public int size(){
        return size;
    }

    /**
     * 是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 是否包含某个元素
     */
    public boolean contains(int element){
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素到尾部
     */
    public void add(int element){

    }

    /**
     * 获取index位置的元素
     */
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        return elements[index];
    }

    /**
     * 设置index位置的元素
     */
    public int set(int index, int element){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        int old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 在index位置插入一个元素
     */
    public void add(int index, int element){

    }

    /**
     * 删除index位置的元素
     */
    public int remove(int index){
        return 0;
    }

    /**
     * 查看元素的索引
     */
    public int indexOf(int element){
        for (int i = 0; i < size; i++) {
            if(elements[i] == element){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

}
