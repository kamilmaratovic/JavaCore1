package listeners;


import lesson9_10_Selenium_PageObjects2_BasePage_Locators.MainPage;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

import java.util.logging.LogManager;

public class Listeners implements ITestListener {
    private static Logger logger = Logger.getLogger(MainPage.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info(iTestResult.getName() + " Started");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("++++++Hey we here +++ "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("++++++Meow we here +++ "+iTestResult.getName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

}
