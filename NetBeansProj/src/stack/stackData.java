package stack;

class stackData 
{
    private int data;
    private stackData next;

    public stackData(int data, stackData next) 
    {
        this.data = data;
        this.next = next;
    }
    
    public int getData(){ return this.data; }
    public stackData getNext(){ return this.next; }
}
