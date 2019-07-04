package question1;

public class EnsembleTest extends junit.framework.TestCase {

	public void testUnion() {
		question1.Ensemble<Integer> e1, e2;
		e1 = new question1.Ensemble<Integer>();
		assertEquals(true, e1.add(2));
		assertEquals(true, e1.add(3));

		e2 = new question1.Ensemble<Integer>();
		assertEquals(true, e2.add(3));
		assertEquals(true, e2.add(4));
		assertEquals(true, e2.add(5));

		question1.Ensemble<Integer> union = e1.union(e2);
		assertEquals(4, union.size());
		assertTrue(union.contains(2));
		assertTrue(union.contains(3));
		assertTrue(union.contains(4));
		assertTrue(union.contains(5));
		assertFalse(union.contains(6));
	}
	public void testAdd() {
		question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();
		assertEquals(true, e1.add(2));
		assertEquals(true, e1.add(3));
		assertEquals(true, e1.contains(2));
		assertEquals(true, e1.contains(3));
	}
	public void testDiff() {
		question1.Ensemble<Integer> e1, e2;

		e1 = new question1.Ensemble<Integer>();
		assertEquals(true, e1.add(2));
		assertEquals(true, e1.add(3));

		e2 = new question1.Ensemble<Integer>();
		assertEquals(true, e2.add(3));
		assertEquals(true, e2.add(4));
		assertEquals(true, e2.add(5));

		question1.Ensemble<Integer> diff = e2.diff(e1);
		assertEquals(2, diff.size());
		assertTrue(diff.contains(4));
		assertTrue(diff.contains(5));
		assertFalse(diff.contains(3));
	}
}
