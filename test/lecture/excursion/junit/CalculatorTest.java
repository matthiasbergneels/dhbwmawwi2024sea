package lecture.excursion.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

  private Calculator calcUnderTest;

  @BeforeAll
  static void setUpBeforeClass() {
    System.out.println("Before all Test (EINMAL)");
  }

  @BeforeEach
  void setUp() {
    System.out.println("Before each Test");
    calcUnderTest = new Calculator();
  }

  @AfterEach
  void tearDown() {
    System.out.println("After each Test");
    calcUnderTest = null;
  }

  @AfterAll
  static void tearDownAfterClass() {
    System.out.println("After all Test (EINMAL)");
  }

  @Nested
  @DisplayName("Add Test Cases")
  class AddTestCase{

    @BeforeEach
    void setUp() {
      System.out.println("Before each AddTestCase)");
    }

  @Test
  @Tag("DevelopmentTest")
  @DisplayName("Simple add test")
  void addSimpleTest() {
    System.out.println("addSimpleTest");
    // Arrange

    // Act
    double result = calcUnderTest.add(1, 2);

    // Assert
    assertEquals(3.0, result);
  }

  @Test
  @Tag("DevelopmentTest")
  @DisplayName("add test with large Numbers")
  void addLargeNumberTest() {
    System.out.println("addLargeNumberTest");
    // Arrange

    // Act
    double result = calcUnderTest.add(100000000.0, 200000000d);

    // Assert
    assertEquals(300000000.0, result);
  }

  @RepeatedTest(10)
  @Tag("DevelopmentTest")
  void addIntNumberTest() {
    System.out.println("addIntNumberTest");
    // Arrange

    // Act
    double result = calcUnderTest.add(10, 20);

    // Assert
    assertEquals(30, result);
  }
  }

  @Nested
  class SubtractTestCase{
    @Test
    @Tag("DevelopmentTest")
    void subtractSimpleTest() {
      System.out.println("subtractSimpleTest");
      // Arrange

      // Act
      double result = calcUnderTest.subtract(1, 2);

      // Assert
      assertEquals(-1.0, result);
    }

    @Test
    @Tag("DevelopmentTest")
    void subtractLargeNumberTest() {
      System.out.println("subtractLargeNumberTest");
      // Arrange

      // Act
      double result = calcUnderTest.subtract(100000000.0, 200000000d);

      // Assert
      assertEquals(-100000000.0, result);
    }

    @Test
    @Tag("DevelopmentTest")
    void subtractIntNumberTest() {
      System.out.println("subtractIntNumberTest");
      // Arrange

      // Act
      double result = calcUnderTest.subtract(20, 10);

      // Assert
      assertEquals(10, result);
    }
  }

  @ParameterizedTest(name="{0} multiplied with {1} should result in {2}")
  @Tag("IntegrationTest")
  @CsvSource({
    "10.0, 10.0, 100.0",
    "5.0, 2.0, 10.0",
    "100, 0, 0",
    "-1, 5.0, -5.0"
  })
  void multiply(double numberA, double numberB, double expectedResult) {
    System.out.println("multiply test");
    // Arrange

    // Act
    double result = calcUnderTest.multiply(numberA, numberB);

    // Assert
    assertEquals(expectedResult, result);
  }
}