package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void whenANewListIsCreated_ThenListIsEmpty(){
        //Inicializacion
        ArrayList<Integer> lista = new ArrayList<>();
        //Ejecucion
        int size = lista.getSize();
        //Validacion
        assertEquals(0,size);
    }
}
