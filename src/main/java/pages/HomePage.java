package pages;

import com.framework.device.TestContext;
import com.framework.pages.BasePage;
import events.IXPNEvents;

import java.util.List;

public class HomePage extends BasePage{

	public HomePage(TestContext testContext) {
		super(testContext);
		createValidationList();
	}
	public HomePage(TestContext testContext, List<String> extraList) {
		super(testContext, extraList);
		doValidation();
	}

	public void doValidation() {
		createValidationList();

	}



	private void createValidationList() {
	verifyElementFound(IXPNEvents.HOME_PAGE_USERNAME_TITLE);
		verifyElementFound(IXPNEvents.HOME_PAGE_FILTER_ICON);
		verifyElementFound(IXPNEvents.HOME_PAGE_HAMBURGER_ICON);
		verifyElementFound(IXPNEvents.HOME_PAGE_REFERSH_BUTTON);
		verifyElementFound(IXPNEvents.HOME_PAGE_SEARCH_FIELD);
		verifyElementFound(IXPNEvents.HOME_PAGE_USERNAME_TITLE);




	}
}
