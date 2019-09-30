package pages;

import com.framework.device.TestContext;
import com.framework.pages.BasePage;

import java.util.List;

public class DummyPage extends BasePage{

	public DummyPage(TestContext testContext) {
		super(testContext);
	}
	public DummyPage(TestContext testContext, List<String> extraList) {
		super(testContext, extraList);
	}

}
