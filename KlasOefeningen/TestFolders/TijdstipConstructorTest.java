package oef3Test;

import oef3.Tijdstip;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TijdstipConstructorTest {

	@Test
	public void testConstructorMetParameters() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testConstructorMetParametersTeGroot() {
		Tijdstip tijd = new Tijdstip(25, 186, 230);
		assertEquals(4, tijd.bepaalUren());
		assertEquals(9, tijd.bepaalMinuten());
		assertEquals(50, tijd.bepaalSeconden());
	}

	@Test
	public void testConstructorEenParameter() {
		Tijdstip tijd = new Tijdstip(3700);
		assertEquals(1, tijd.bepaalUren());
		assertEquals(1, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testCopyConstructor() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		Tijdstip tijd1 = new Tijdstip(tijd);
		assertEquals(tijd.bepaalMinuten(), tijd1.bepaalMinuten());
		assertEquals(tijd.bepaalSeconden(), tijd1.bepaalSeconden());
		assertEquals(tijd.bepaalUren(), tijd1.bepaalUren());
	}

	@Test
	public void testSetUurOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigUren(2);
		assertEquals(2, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetUurTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigUren(25);
		assertEquals(1, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetMinutenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigMinuten(2);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(2, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetMinutenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigMinuten(120);
		assertEquals(22, tijd.bepaalUren());
		assertEquals(0, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testSetSecondenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigSeconden(12);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(12, tijd.bepaalSeconden());

	}

	@Test
	public void testSetSecondenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.wijzigSeconden(120);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(32, tijd.bepaalMinuten());
		assertEquals(0, tijd.bepaalSeconden());

	}

	@Test
	public void testVoegUrenToeMetParameterUrenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe(2);
		assertEquals(22, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegUrenToeMetParameterUrenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe(10);
		assertEquals(6, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegUrenToeZonderParameterUrenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe();
		assertEquals(21, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegUrenToeZonderParameterUrenTeGroot() {
		Tijdstip tijd = new Tijdstip(23, 30, 40);
		tijd.voegUrenToe();
		assertEquals(0, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegMinutenToeOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegMinutenToe(10);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(40, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegMinutenToeTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegMinutenToe(60);
		assertEquals(21, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegSecondenToeOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegSecondenToe(6);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(30, tijd.bepaalMinuten());
		assertEquals(46, tijd.bepaalSeconden());
	}

	@Test
	public void testVoegSecondenToeTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegSecondenToe(60);
		assertEquals(20, tijd.bepaalUren());
		assertEquals(31, tijd.bepaalMinuten());
		assertEquals(40, tijd.bepaalSeconden());
	}

	@Test
	public void testToStringEngelsNotatie() {
		Tijdstip tijd = new Tijdstip(8, 4, 4);
		assertEquals("8:04 u", tijd.toStringTijd(false));
	}

	@Test
	public void testToStringEngelsNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(0, 0, 0);
		assertEquals("0:00 u", tijd.toStringTijd(false));
	}

	@Test
	public void testToStringGeenEngelsNotatieVoorMiddag() {
		Tijdstip tijd = new Tijdstip(8, 5, 0);
		assertEquals("08:05 AM", tijd.toStringTijd(true));
	}

	@Test
	public void testToStringGeenEngelsNotatieNaMiddag() {
		Tijdstip tijd = new Tijdstip(18, 5, 0);
		assertEquals("06:05 PM", tijd.toStringTijd(true));
	}

	@Test
	public void testToStringGeenEngelsNotatieMiddag() {
		Tijdstip tijd = new Tijdstip(12, 0, 0);
		assertEquals("12:00 PM (noon)", tijd.toStringTijd(true));
	}

	@Test
	public void testToStringGeenEngelsNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(24, 0, 0);
		assertEquals("12:00 AM (midnight)", tijd.toStringTijd(true));
	}

	@Test
	public void testToStringTechnischZonderVoorloopNullen() {
		Tijdstip tijd = new Tijdstip(15, 10, 20);
		assertEquals("15:10:20", tijd.toStringTechnisch());
	}

	@Test
	public void testToStringTechnischMetVoorloopNullen() {
		Tijdstip tijd = new Tijdstip(5, 1, 2);
		assertEquals("05:01:02", tijd.toStringTechnisch());
	}
}
