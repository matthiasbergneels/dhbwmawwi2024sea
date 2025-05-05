package lecture.chapter12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {

  private static List<String> TEST_DATA = Arrays.asList(new String[]{"eins", "zwei", "drei", "vier", "fünf", "sechs"});
  @Test
  void stackTest() {

    Stack<String> testStack = new Stack<>();

    // validate size() & isEmpty()
    assertTrue(testStack.isEmpty());
    assertEquals(0, testStack.size());

    // fill Stack
    for(String word : TEST_DATA){
      testStack.push(word);
    }

    // validate size()
    assertEquals(TEST_DATA.size(), testStack.size());

    // clear Stack
    ListIterator<String> wordListIterator = TEST_DATA.listIterator(TEST_DATA.size());

    while(wordListIterator.hasPrevious()){
      assertEquals(wordListIterator.previous(), testStack.pop());
    }

    // validate size() & isEmpty()
    assertTrue(testStack.isEmpty());
    assertEquals(0, testStack.size());

  }
}