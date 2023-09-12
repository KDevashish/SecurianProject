package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pageObjects.RetirementCalculatorPage;

public class MandatoryFieldErrorTest extends BaseClass {

	@Test
	public void mandatoryFieldErrorTest() {

		RetirementCalculatorPage rcp = new RetirementCalculatorPage(driver);

		rcp.enterRetirementAge(excelutil.getDataFromExcel("TestData", 3, 3));

		rcp.enterCurrentIncome(excelutil.getDataFromExcel("TestData", 3, 4));
		rcp.enterSpouseIncome(excelutil.getDataFromExcel("TestData", 3, 5));
		rcp.enterCurrentTotalSavings(excelutil.getDataFromExcel("TestData", 3, 6));
		rcp.enterCurrentAnnualSavings(excelutil.getDataFromExcel("TestData", 3, 7));
		rcp.enterSavingIncreaseRate(excelutil.getDataFromExcel("TestData", 3, 8));
		rcp.selectSocialSecurityBenefitAsYes();
		rcp.selectMaritalStatusAsYes();
		rcp.enterSocialSecurityOverride(excelutil.getDataFromExcel("TestData", 3, 9));

		rcp.clickOnAdjustDefaultValue();
		rcp.enterAdditionalIncome(excelutil.getDataFromExcel("TestData", 3, 10));
		rcp.enterRetirementDuration(excelutil.getDataFromExcel("TestData", 3, 11));
		rcp.selectInflationAsYes();
		rcp.enterRetirementAnnualIncome(excelutil.getDataFromExcel("TestData", 3, 12));
		rcp.enterPreRetirementROI(excelutil.getDataFromExcel("TestData", 3, 13));
		rcp.enterPostRetirementROI(excelutil.getDataFromExcel("TestData", 3, 14));
		rcp.clickOnSaveChangesBtn();

		rcp.clickOnCalculateBtn();
		Assert.assertEquals(rcp.getErrorMessage(), excelutil.getDataFromExcel("TestData", 3, 16));
		Assert.assertEquals(rcp.getCurrentAgeErrorMsg(), excelutil.getDataFromExcel("TestData", 3, 17));
	}
	
}
