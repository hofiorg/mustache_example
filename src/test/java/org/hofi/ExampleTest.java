package org.hofi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ExampleTest {
  @Test
  void testGenerate() throws IOException {

    String ls = System.getProperty("line.separator");

    Assertions.assertEquals("    Name: Item 1" + ls +
      "    Price: $19.99" + ls +
      "        Feature: New!" + ls +
      "        Feature: Awesome!" + ls +
      "    Name: Item 2" + ls +
      "    Price: $29.99" + ls +
      "        Feature: Old." + ls +
      "        Feature: Ugly." + ls, Example.generate());
  }
}
