package oef3Test;

import oef3.Tijdstip;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TijdstipGetterSetterTest {

	private Tijdstip tijd;

	@Before
	public void init() {
		tijd = new Tijdstip(20, 30, 40);
	}

	public void testSetUurOk() {
		tijd.wijzigUren(2);
		assertEquals(2, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetUurTeGroot() {
		tijd.wijzigUren(25);
		assertEquals(1, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetMinutenOk() {
		tijd.wijzigMinuten(2);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(2, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetMinutenTeGroot() {
		tijd.wijzigMinuten(120);
		assertEquals(22, tijd.bepaalUren());
		assertEquals(0, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetSecondenOk() {
		tijd.wijzigSeconden(12);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(12, tijd.bepaalSeconden());

	}

	@Test
	public void testSetSecondenTeGroot() {
		tijd.wijzigSeconden(120);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(32, tijd.bepaalMinuten());
		assertEquals(0, tijd.bepaalSeconden());

	}

	@Test
	public void testVoegUrenToeMetParameterUrenOk() {
		tijd.voegUrenToe(2);
		assertEquals(22, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegUrenToeMetParameterUrenTeGroot() {
		tijd.voegUrenToe(10);
		assertEquals(6, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegUrenToeZonderParameterUren() {
		tijd.voegUrenToe();
		assertEquals(21, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegMinutenToeOk() {
		tijd.voegMinutenToe(10);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(40, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegMinutenToeTeGroot() {
		tijd.voegMinutenToe(60);
		assertEquals(21, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegSecondenToeOk() {
		tijd.voegSecondenToe(6);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(46, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegSecondenToeTeGroot() {
		tijd.voegSecondenToe(60);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(31, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

}
