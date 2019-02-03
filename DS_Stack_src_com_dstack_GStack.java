package com.dstack;

public class GStack<T> {

    private T [] data;
    private int stackPointer;

    public GStack(){
        data = (T[]) new Object[100];
    }

    public void push(T data){
        this.data[stackPointer++] = data;
    }

    public T pop(){
        if(stackPointer == 0){
            return (T) "Got nothing in the stack";
        }else{
            return this.data[--stackPointer];
        }
    }

    public boolean contains(T item){
        boolean flag = false;
        for(int i = 0; i<this.data.length; i++){
            if(data[i].equals(item)){
                flag = true;
            }
        }
        return flag;
    }

    public T access(T item){
       while(stackPointer >0){
           T tempitem = pop();
           if(item.equals(tempitem)){
               return tempitem;
           }
       }
       return (T) "item not found";
    }
    public int size(){
        return stackPointer;
    }
}
