package org.iesvdm.programacion;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {

	@Test
	public void ArrayListTest1() {
		ArrayList<String> arrayList=new ArrayList<>();
		//given
		String str1 ="cad1";
		String str2 = "cad2";
		
		//when
		arrayList.add(str1);
		arrayList.add(str2);
		
		//expect
		
		Assert.assertEquals("[cad1, cad2]", arrayList.toString());
		Assert.assertEquals(2, arrayList.size());
		
		int pos = arrayList.indexOf(str1);
		
		Assert.assertEquals(0, pos);
		
		String str=arrayList.get(1);
		
		Assert.assertEquals(str2, str);
		
		}
}
