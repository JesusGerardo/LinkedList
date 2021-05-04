package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void givenAllExistentListsBeforeThisMethod_whenAnotherListIsCreated_ThenListsCountIncrements(){
        LinkedList<Integer> lista = new LinkedList<>();

        int listsCount=LinkedList.getListsCount();

        assertEquals(7,listsCount);
    }

    @Test
    public void whenANewListIsCreated_ThenListIsEmpty(){

        LinkedList<Integer> lista = new LinkedList<>();

        int size = lista.getSize();

        assertEquals(0,size);
    }

    @Test
    public void givenAnExistentList_whenAddElement_thenSizeIsOne(){
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(5);

        assertEquals(1,lista.getSize());
        assertEquals(5,lista.get(0));
    }

    @Test
    public void givenAnExistentListWithThreeElements_whenDeleteFirstElement_thenSizeIsTwoAndElementsAreTraversedBackwards(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(0);

        assertEquals(2,lista.getSize());
        assertEquals(10,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void givenAnExistentListWithThreeElements_whenDeleteElementInTheMiddle_thenSizeIsTwoAndThirdElementIsNowSecondElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(1);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void givenAnExistentListWithThreeElements_whenDeleteLastElement_thenSizeIsTwo(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(10,lista.get(1));
    }

    @Test
    public void givenAnExistentListWithThreeElements_whenAllElementsDeleted_thenSizeIsZero(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);
        lista.delete(1);
        lista.delete(0);

        assertEquals(0,lista.getSize());
    }

    @Test
    public void givenAnExistentListWithThreeElements_whenTryingToDeleteANonExistentElement_thenMyIndexOutOfBondsExceptionIsThrown(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        assertThrows(MyIndexOutOfBoundsException.class, ()->lista.delete(3));
    }

    @Test
    public void givenAnExistentListWithOneElementsAndAnIterator_whenNextIsCalled_thenIteratorElementIsEqualToListElement(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }

    @Test
    public void givenAnExistentListWithOneElementsAndAReverseIterator_whenNextIsCalled_thenReverseIteratorElementIsEqualToListElement(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getReverseIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }

    @Test
    public void givenAnExistentListWithOneElement_whenGetElementAtIndex2_thenMyIndexOutOfBoundsExceptionIsThrown(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        assertThrows(MyIndexOutOfBoundsException.class, ()->lista.get(2));
    }
}
