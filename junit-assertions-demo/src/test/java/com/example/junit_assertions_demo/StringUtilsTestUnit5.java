package com.example.junit_assertions_demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StringUtilsTestUnit5 {

  @Test
  public void testConvertToDoubleOK() {
    // Test case with the age is a numeric string
    String age = "1990";
    final Double expAge = Double.valueOf(age);
    final Double actual = StringUtils.convertToDouble(age);

    assertAll("Do many assertions.", new Executable() {
		@Override
		public void execute() throws Throwable {
		  assertNotNull(actual);
		  assertEquals(expAge, actual);
		}
	});

  
  }

  @Test
  public void testConvertToDoubleWithNullArgument() {
    // Test case with the age is null
    String age = null;
    Double actual = StringUtils.convertToDouble(age);
    // Java 8 Style
    assertNull(actual, new Supplier<String>() {
		@Override
		public String get() {
			return "The actual is not null";
		}
	});
  }



  @Test
  public void testConvertToDoubleThrowException() {
    // Test with the age is a non numeric string
    final String age = "N/A";
    assertThrows(NumberFormatException.class, new Executable() {
		@Override
		public void execute() throws Throwable {
		  StringUtils.convertToDouble(age);
		}
	});

    assertThrows(NumberFormatException.class, new Executable() {
		@Override
		public void execute() throws Throwable {
		  StringUtils.convertToDouble(age);
		}
	});
  }

  @Test
  public void testIsNullOrBlankOK() {
    // Test the case that the input is NULL
    String input = null;

    assertTrue(StringUtils.isNullOrBlank(input));
    // Java 8 Lambdas Style
    assertTrue(StringUtils.isNullOrBlank(input), new Supplier<String>() {
		@Override
		public String get() {
			return "The string is not null or blank";
		}
	});

    // Test case with the input is empty
    input = " ";
    assertTrue(StringUtils.isNullOrBlank(input));

    // Test case with the input is not empty
    input = "abc";

    assertFalse(StringUtils.isNullOrBlank(input));

  }

  @Test
  public void testGetDefaultIfNull() {
    // Test case with input string is null
    String st = null;
    String defaultSt = "abc";

    String actual = StringUtils.getDefaultIfNull(st, defaultSt);
    assertSame(defaultSt, actual);
    // Java 8 Lambdas Style
    assertSame(defaultSt, actual, new Supplier<String>() {
		@Override
		public String get() {
			return "Expected ouput is not same with actual";
		}
	});

    // Test case with input string is not null
    st = "def";

    actual = StringUtils.getDefaultIfNull(st, defaultSt);
    assertNotSame(defaultSt, actual);
    // Java 8 Lambdas Style
    assertNotSame(defaultSt, actual, new Supplier<String>() {
		@Override
		public String get() {
			return "Expected ouput is same with actual";
		}
	});

    // Test case with input string is empty
    st = "";
    actual = StringUtils.getDefaultIfNull(st, defaultSt);
    if (actual.equals(defaultSt)) {
      fail("The actual should be empty");

      // Java 8 Lambdas Style
      fail(new Supplier<String>() {
		@Override
		public String get() {
			return "The actual should be empty";
		}
	});
    }

  }

  @Test
  public void testConcatWithRegularInput() {
    String st1 = "Hello";
    String st2 = "World";
    String st3 = "!";
    String expect = st1 + st2 + st3;
    String actual = StringUtils.concat(st1, st2, st3);
    assertEquals(expect, actual);
  }

  @Test
  public void testConcatWithNullInput() {
    String st1 = "Hello";
    String st2 = "World";
    String st3 = null;
    String expect = st1 + st2;
    String actual = StringUtils.concat(st1, st2, st3);
    assertEquals(expect, actual);
  }

  @Disabled
  @Test
  public void testConcatWithAllNullInput() {
    String actual = StringUtils.concat();
    assertNull(actual);
  }
}