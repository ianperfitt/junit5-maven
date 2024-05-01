package org.practice;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Optional;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;


public class JUnit5Tests {

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                ofSeconds(2),
                () -> {
                    // code that requires less then 2 minutes to execute
                    Thread.sleep(1000);
                }
        );
    }

//    @Test
//    public void whenAssertingEqualityListOfStrings_thenEqual() {
//        List<String> expected = asList("Java", "\\d+", "JUnit");
//        List<String> actual = asList("Java", "11", "JUnit");
//
//        assertLinesMatch(expected, actual);
//    }

//    @Test
//    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
//        assertAll(
//                "heading",
//                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
//                () -> assertEquals("java", "JAVA".toLowerCase()),
//                () -> assertEquals(null, null, "null is equal to null")
//        );
//    }

//    @Test
//    public void whenAssertingSameObject_thenSuccessfull() {
//        String language = "Java";
//        Optional<String> optional = Optional.of(language);
//
//        assertSame(language, optional.get());
//    }

//    @Test
//    public void whenAssertingNotNull_thenTrue() {
//        Object dog = new Object();
//
//        assertNotNull(dog,() -> "The dog should not ber null");
//    }

//    @Test
//    public void whenAssertingEqualityWithDelta_thenEqual() {
//        float square = 2 * 2;
//        float rectangle = 3 * 2;
//        float delta = 2;
//
//        assertEquals(square, rectangle, delta);
//    }


//    @Test
//    public void whenAssertingEquality_thenEqual() {
//
//        float square = 2 * 2;
//        float rectangle = 2 * 2;
//        assertEquals(square, rectangle);
//    }

//    @Test
//    public void whenAssertingArraysEquality_thenEqual() {
//        char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
//        char[] actual = "Jupiter".toCharArray();
//
//        assertArrayEquals(expected, actual, "Arrays should be equal");
//    }

//    @BeforeAll
//    static void setup() {
//        System.out.println("@BeforeAll executed");
//    }
//
//    @BeforeEach
//    void setupThis() {
//        System.out.println("@BeforeEach executed");
//    }
//
//    @Tag("DEV")
//    @Test
//    void testCalcOne() {
//        System.out.println("======TEST ONE EXECUTED=======");
//        Assertions.assertEquals(4, Math.addExact(2, 2));
//    }
//
//    @Tag("PROD")
//    @Disabled
//    @Test
//    void testCalcTwo() {
//        System.out.println("======TEST TWO EXECUTED=======");
//        Assertions.assertEquals(6, Math.addExact(3, 3));
//    }
//
//    @AfterEach
//    void tearThis() {
//
//        System.out.println("@AfterEach executed");
//    }
//
//    @AfterAll
//    static void tear() {
//
//        System.out.println("@AfterAll executed");
//    }
}
