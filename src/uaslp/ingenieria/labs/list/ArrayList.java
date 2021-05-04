package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList() {
        this.array = new Object[4];
    }

    @Override
    public void add(H data) {
        if(size== array.length){
            Object []oldArray = array;
            array = new Object[array.length*2];
            System.arraycopy(oldArray,0,array,0,oldArray.length);
        }

        this.array[size++] = data;
    }

    @Override
    public H get(int index) {
        if(index < 0 || index >size)
            throw new MyIndexOutOfBoundsException();

        return (H)this.array[index];
    }

    @Override
    public void delete(int index) {
        if(array.length - (index + 1) >= 0){
            System.arraycopy(this.array,index + 1,this.array,index + 1 - 1,array.length - (index + 1));
        }
        else{
            throw new MyIndexOutOfBoundsException();
        }
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<H> getIterator() {
        return new ForwardIterator();
    }

    @Override
    public Iterator<H> getReverseIterator() {
        return new ReverseIterator();
    }

    public class ForwardIterator implements Iterator<H>{
        private int currentIndex;

        public ForwardIterator(){
            currentIndex=0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex<size;
        }

        @Override
        public H next() {
            H data;
            data=get(currentIndex);
            currentIndex++;
            return data;
        }
    }

    public class ReverseIterator implements Iterator<H>{
        private int currentIndex;

        public ReverseIterator(){
            currentIndex=size-1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex>=0;
        }

        @Override
        public H next() {
            H data;
            data=get(currentIndex);
            currentIndex--;
            return data;
        }
    }
}