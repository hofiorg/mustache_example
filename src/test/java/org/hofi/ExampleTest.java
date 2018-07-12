package org.hofi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ExampleTest {
  @Test
  void testGenerate() throws IOException {
    Assertions.assertEquals("    Name: Item 1\r\n" +
      "    Price: $19.99\r\n" +
      "        Feature: New!\r\n" +
      "        Feature: Awesome!\r\n" +
      "    Name: Item 2\r\n" +
      "    Price: $29.99\r\n" +
      "        Feature: Old.\r\n" +
      "        Feature: Ugly.\r\n", Example.generate());
  }
}
