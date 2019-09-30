package util;

import com.framework.device.TestContext;
import com.framework.events.IClient;
import com.framework.executor.TestCase;
import com.framework.pages.DummyPage;
import events.IXPNEvents;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pages.HomePage;
import pages.SelectLanguagePage;
import pages.WelcomeScreenPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OkUtil {

   public static void signIn( TestContext testContext)
   {
       SelectLanguagePage selectLanguagePage=new SelectLanguagePage(testContext);
       selectLanguagePage.clickElement(IXPNEvents.SELECT_LANGUAGE_ENGLISH_BUTTON);
       WelcomeScreenPage welcomeScreenPage=new WelcomeScreenPage(testContext);
       welcomeScreenPage.clickElement(IXPNEvents.WELCOME_SLIDER_PAGE_GET_STARTED_BUTTON);
       DummyPage dummyPage=new DummyPage(testContext);
       dummyPage.verifyElementFound(IXPNEvents.SIGN_UP_PAGE_PHONE_NUMBER_FIELD);
       dummyPage.clickElement(IXPNEvents.SIGN_UP_PAGE_PHONE_NUMBER_FIELD);
       dummyPage.elementSendText(IXPNEvents.SIGN_UP_PAGE_PHONE_NUMBER_FIELD,"9082748436");
       dummyPage.clickElement(IXPNEvents.OK_BUTTON);
       if(dummyPage.isElementFound(IXPNEvents.SIGN_IN_PAGE_PASSWORD_FIELD))
       {
           dummyPage.clickElement(IXPNEvents.SIGN_IN_PAGE_PASSWORD_FIELD);
           dummyPage.elementSendText(IXPNEvents.SIGN_IN_PAGE_PASSWORD_FIELD,"123456");
           dummyPage.clickElement(IXPNEvents.OK_BUTTON);
       }
       else if(dummyPage.isElementFound(IXPNEvents.SIGN_UP_SEND_OTP_BUTTON))
       {
           dummyPage.clickElement(IXPNEvents.SIGN_UP_SEND_OTP_BUTTON);
           dummyPage.verifyElementFound(IXPNEvents.SIGN_UP_OTP_NUMBER_BLOCKS);
           dummyPage.defaultWait();
       }
       dummyPage.defaultWaitTillElementAppear(IXPNEvents.HOME_PAGE_USERNAME_TITLE,30000);
       HomePage homePage=new HomePage(testContext);
   }

   public static void navigateToHomeScreen(TestContext testContext)
   {

   DummyPage dummyPage=new DummyPage(testContext);
       if (dummyPage.isElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_GET_STARTED_BUTTON))
       {
           OkUtil.signIn(testContext);
       }
       else if (dummyPage.isElementFound(IXPNEvents.HOME_PAGE_SEARCH_FIELD)) {


       }
       else{
           dummyPage.applicationClose();
           dummyPage.applicationLaunch();
           if (dummyPage.isElementFound(IXPNEvents.WELCOME_SLIDER_PAGE_GET_STARTED_BUTTON))
           {
               OkUtil.signIn(testContext);
           }
       }
   }
}
