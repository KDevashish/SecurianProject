package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pageObjects.RetirementCalculatorPage;

public class RetirementCalculator extends BaseClass{

	@Test
	public void retirementCalculatorTest() {
		
		RetirementCalculatorPage rcp = new RetirementCalculatorPage(driver);
		
		rcp.enterCurrentAge(excelutil.getDataFromExcel("TestData", 1, 2));
		rcp.enterRetirementAge(excelutil.getDataFromExcel("TestData", 1, 3));
		
		rcp.enterCurrentIncome(excelutil.getDataFromExcel("TestData", 1, 4));
		rcp.enterSpouseIncome(excelutil.getDataFromExcel("TestData", 1, 5));
		rcp.enterCurrentTotalSavings(excelutil.getDataFromExcel("TestData", 1, 6));
		rcp.enterCurrentAnnualSavings(excelutil.getDataFromExcel("TestData", 1, 7));
		rcp.enterSavingIncreaseRate(excelutil.getDataFromExcel("TestData", 1, 8));
		rcp.selectSocialSecurityBenefitAsYes();
		rcp.selectMaritalStatusAsYes();
		rcp.enterSocialSecurityOverride(excelutil.getDataFromExcel("TestData", 1, 9));
		
		rcp.clickOnAdjustDefaultValue();
		rcp.enterAdditionalIncome(excelutil.getDataFromExcel("TestData", 1, 10));
		rcp.enterRetirementDuration(excelutil.getDataFromExcel("TestData", 1, 11));
		rcp.selectInflationAsYes();
		rcp.enterRetirementAnnualIncome(excelutil.getDataFromExcel("TestData", 1, 12));
		rcp.enterPreRetirementROI(excelutil.getDataFromExcel("TestData", 1, 13));
		rcp.enterPostRetirementROI(excelutil.getDataFromExcel("TestData", 1, 14));
		rcp.clickOnSaveChangesBtn();
		
		rcp.clickOnCalculateBtn();
		String resultMessage = rcp.getResultMessage();
		Assert.assertTrue(resultMessage.contains(excelutil.getDataFromExcel("TestData", 1, 15)), "Retirement Calculation Failed");
	}
}















