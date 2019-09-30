package pages;

import com.framework.device.TestContext;
import com.framework.pages.BasePage;
import events.IXPNEvents;

import java.util.List;

public class WelcomeScreenPage extends BasePage{

	public WelcomeScreenPage(TestContext testContext) {
		super(testContext);
		createValidationList();
	}
	public WelcomeScreenPage(TestContext testContext, List<String> extraList) {
		super(testContext, extraList);
	}

	public void doValidation() {
		createValidationList();

	}



	private void createValidationList() {
		defaultWait();
		if(isElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_1_TITLE)) {
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_1_TITLE);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_1_LABEL_SWIPE_TO_LEARN_MORE);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_2_TITLE);
			swipe(400	,300,100,300,100);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_3_TITLE);
			swipe(400	,300,100,300,100);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_4_TITLE);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_GET_STARTED_BUTTON);
		}
		else{
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_2_TITLE);
			swipe(400	,300,100,300,100);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_3_TITLE);
			swipe(400	,300,100,300,100);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_4_TITLE);
			verifyElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_GET_STARTED_BUTTON);

		}







	}
}
