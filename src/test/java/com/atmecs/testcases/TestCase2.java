package com.atmecs.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestCase2 {

	@Test
	public void doLogin() {

		System.out.println("Executing Login Test");
	}

	@Test
	public void doUserReg() {

		System.out.println("User Reg Test Passed");
		//Assert.fail("User Reg Test Failed");
	}

	@Test
	public void isSkip() {

		throw new SkipException("Skipping the test case");
	}

}
