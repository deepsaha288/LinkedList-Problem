import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

        @Test
        public void given_Data_InSearchMethod_Should_Return_Data() {
            LinkedListDemo list = new LinkedListDemo();
            list.toAppend(56);
            list.toAppend(30);
            list.toAppend(40);
            list.toAppend(70);
            list.displayList();
            int output = list.searchNode(30);
            Assertions.assertEquals(30,output);
        }
    }

