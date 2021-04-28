package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList() {
        this.array = new Object[4];
    }

    @Override
    public void add(H data) {

        this.array[size++] = data;
    }

    @Override
    public H get(int index) {
        return (H)this.array[index];
    }

    @Override
    public void delete(int index) {

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

        public int getCurrentIndex(){
            return currentIndex;
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

        public int getCurrentIndex(){
            return currentIndex;
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