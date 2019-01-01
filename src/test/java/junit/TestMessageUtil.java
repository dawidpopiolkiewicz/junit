package junit;

import static org.junit.Assert.assertEquals;

import com.junit.util.MessageUtil;

public class TestMessageUtil {

	private String testMessage = "Hello World!";
	private MessageUtil messageUtil = new MessageUtil();

	
	@org.junit.Test
	public void testPrintMessage() {
		messageUtil.setMessage("Hello World!");
		assertEquals(testMessage, messageUtil.getMessage());
	}

}
