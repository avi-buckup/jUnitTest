package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddString {

	@Test
	public void test() {
		jUnitFunctions obj = new jUnitFunctions();
		String res = obj.addString("avi","mandavia");
		assertEquals("avimandavia",res);
	}

}
