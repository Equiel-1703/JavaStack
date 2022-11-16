package stack;

public class Stack {
    
    private stackData top;
    private int stackSize;
    
    public void push(int data)
    {
        stackData newEl = new stackData(data, this.top);
        this.top = newEl;
        
        this.stackSize++;
    }
    
    public int pop()
    {
        if(this.stackSize > 0)
        {
            int data = this.top.getData();
            this.top = this.top.getNext();
            this.stackSize--;
        
            return data;
        }
        
        System.err.println("Pilha vazia!");
        return -1;
    }
    
    public int getStackSize(){ return this.stackSize; }
}
