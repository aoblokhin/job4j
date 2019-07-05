package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alex Blokhin (ao.blokhin@ya.ru)
 * @version $Id$
 * @since 0.1
 */

public class CalculateTest {
/**
 * Test echo.
 */

@Test
 public void whenTakenNameThenThreeEchoPlusName() {
	String input = "Alex Blokhin";
	String expect = "Echo, echo, echo : Alex Blokhin";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
 }

}
