package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTestCase;

public class StartChrome extends BaseTestCase{
	
	
	
	
	
	@BeforeTest
	public void setup(){
		Setup();
	}
	
	@Test
	public void Search() {
		search();
	}
	
}
