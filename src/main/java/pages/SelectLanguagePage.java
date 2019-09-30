package pages;

import com.framework.device.TestContext;
import com.framework.pages.BasePage;
import events.IXPNEvents;

import java.util.List;

public class SelectLanguagePage extends BasePage{

	public SelectLanguagePage(TestContext testContext) {
		super(testContext);
		createValidationList();
	}
	public SelectLanguagePage(TestContext testContext, List<String> extraList) {
		super(testContext, extraList);
	}

	public void doValidation() {
		createValidationList();

	}



	private void createValidationList() {
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_ENGLISH_BUTTON);
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_HINDI_BUTTON);
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_HINGLISH_BUTTON);
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_MALAYALAM_BUTTON);
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_PUNJABI_BUTTON);
		verifyElementFound(IXPNEvents.SELECT_LANGUAGE_TITLE);






	}
}
