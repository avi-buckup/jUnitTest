package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNum {

	@Test
	public void test() {
		jUnitFunctions obj = new jUnitFunctions();
		int res = obj.addNum(2, 3);
		assertEquals(5,res);
	}

}
