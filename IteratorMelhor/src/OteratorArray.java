import java.util.Iterator;

class IteratorArray implements Iterator {
    private int pos=0;
    private Object array[];

    public IteratorArray(Object array[])    {
        this.array = array;
    }

    public boolean hasNext()    {
        return pos<array.length&&array[pos]!=null?true:false;
    }

    public Object next()    {
        if (!hasNext()) return null;
        return array[pos++];
    }

    public void remove(){}
}