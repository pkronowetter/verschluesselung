
package test;

import static org.junit.Assert.*;

import org.junit.*;

import kronowetter.cipher.MonoAlphabeticCipher;
import kronowetter.cipher.SubstitutionCipher;


public class test {


	/**
	 * Es wird ein geheimes Alphabet erstellt und dann wird es mittels equale vergleichen ob das selbe Alphabet 
	 * zur�ck gegeben wird.
	 */
	@Test
	public void test1(){
		SubstitutionCipher su = new SubstitutionCipher("qwertzuiop��asdfghjkl��yxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiop��asdfghjkl��yxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird ge�ndert 
	 * 
	 */
	@Test
	public void test2(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		su.setSecretAlphabet("qwertzuiop��asdfghjkl��yxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiop��asdfghjkl��yxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird in diesem test so getestet, dass die Exception geworfen werden sollte
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test3(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		su.setSecretAlphabet("qwer");
	}
	/**
	 * Diese Test verschl�sselt das Wort "Hallo ich bins"
	 */
	@Test
	public void test4(){
		SubstitutionCipher su = new SubstitutionCipher("qwertzuiop��asdfghjkl��yxcvbnm");
		su.decrypt("Hallo ich bins");
		System.out.println(su.decrypt("Hallo ich bins"));
	}
	/**
	 * Diese Test entschl�sseln das Wort was oben raus kommt.
	 */
	@Test
	public void test5(){
		SubstitutionCipher su = new SubstitutionCipher("qwertzuiop��asdfghjkl��yxcvbnm");
		su.encrypt("rmuui hzr �h�n");
		System.out.println(su.encrypt("rmuui hzr �h�n"));
		
	}
}	
