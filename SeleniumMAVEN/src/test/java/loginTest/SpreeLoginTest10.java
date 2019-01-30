package loginTest;

import org.junit.Test;

import com.shiftedtech.qa.scripts.SpreeLoginTest2;

public class SpreeLoginTest10 extends SpreeLoginTest2 {
	@Test
	public void validlogintest() {
		verifyTitle("Login - Spree Demo Site");
		click(locator);
	}

}
