package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class RetirementCalculatorPage {
	
	private SeleniumUtility webUtil;

	@FindBy(id = "current-age")
	private WebElement currentAge;  
	
	@FindBy(id = "retirement-age")
	private WebElement retirementAge;  
	
	@FindBy(id = "current-income")
	private WebElement currentIncome;  
	
	@FindBy(id = "spouse-income")
	private WebElement spouseIncome;  
	
	@FindBy(id = "current-total-savings")
	private WebElement currentTotalSavings;  
	
	@FindBy(id = "current-annual-savings")
	private WebElement currentAnnualSavings;  
	
	@FindBy(id = "savings-increase-rate")
	private WebElement savingsIncreaseRate;  
	
	@FindBy(css = "label[for = 'yes-social-benefits']")
	private WebElement yesRadioBtn;  
	
	@FindBy(css = "label[for = 'married']")
	private WebElement marriedRadioBtn;  
	
	@FindBy(id = "social-security-override")
	private WebElement socialSecurityOverride;  
	
	@FindBy(linkText = "Adjust default values")
	private WebElement adjustDefaultValueLink;  
	
	@FindBy(id = "additional-income")
	private WebElement additionalIncome;  
	
	@FindBy(id = "retirement-duration")
	private WebElement retirementDuration;  
	
	@FindBy(css = "label[for = 'include-inflation']")
	private WebElement includeInflationRadioBtn;
	
	@FindBy(id = "retirement-annual-income")
	private WebElement retirementAnnualIncome;
	
	@FindBy(id = "pre-retirement-roi")
	private WebElement preRetirementRoi;
	
	@FindBy(id = "post-retirement-roi")
	private WebElement postRetirementRoi;
	
	@FindBy(xpath = "//button[text() = 'Save changes']")
	private WebElement saveChangeBtn;
	
	@FindBy(xpath = "//button[text() = 'Calculate']")
	private WebElement calculatorBtn;
	
	@FindBy(id = "result-message")
	private WebElement resultMessage;
	
	public RetirementCalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		webUtil = new SeleniumUtility(driver);
	}
	
	public void enterCurrentAge(String currentAge) {
		this.currentAge.sendKeys(currentAge);
	}
	
	public void enterRetirementAge(String retirementAge) {
		this.retirementAge.sendKeys(retirementAge);
	}
	
	public void enterCurrentIncome(String currentIncome) {
		webUtil.enterTextByJavascript(this.currentIncome, currentIncome);
	}
	
	public void enterSpouseIncome(String spouseIncome) {
		webUtil.enterTextByJavascript(this.spouseIncome, spouseIncome);
	}
	
	public void enterCurrentTotalSavings(String currentTotalSavings) {
		webUtil.enterTextByJavascript(this.currentTotalSavings, currentTotalSavings);
	}
	
	public void enterCurrentAnnualSavings(String currentAnnualSavings) {
		this.currentAnnualSavings.sendKeys(currentAnnualSavings);
	}
	
	public void enterSavingIncreaseRate(String savingIncreaseRate) {
		this.savingsIncreaseRate.sendKeys(savingIncreaseRate);
	}
	
	public void selectSocialSecurityBenefitAsYes() {
		this.yesRadioBtn.click();
	}
	
	public void selectMaritalStatusAsYes() {
		this.marriedRadioBtn.click();
	}
	
	public void enterSocialSecurityOverride(String socialSecurityOverride) {
		webUtil.enterTextByJavascript(this.socialSecurityOverride, socialSecurityOverride);
	}
	
	public void clickOnAdjustDefaultValue() {
		this.adjustDefaultValueLink.click();
	}
	
	public void enterAdditionalIncome(String additionalIncome) {
		webUtil.enterTextByJavascript(this.additionalIncome, additionalIncome);
	}
	
	public void enterRetirementDuration(String retirementDuration) {
		this.retirementDuration.sendKeys(retirementDuration);
	}
	
	public void selectInflationAsYes() {
		this.includeInflationRadioBtn.click();
	}
	
	public void enterRetirementAnnualIncome(String retirementAnnualIncome) {
		this.retirementAnnualIncome.sendKeys(retirementAnnualIncome);
	}
	
	public void enterPreRetirementROI(String preRetirementROI) {
		this.preRetirementRoi.sendKeys(preRetirementROI);
	}
	
	public void enterPostRetirementROI(String postRetirementROI) {
		this.postRetirementRoi.sendKeys(postRetirementROI);
	}
	
	public void clickOnSaveChangesBtn() {
		this.saveChangeBtn.click();
	}
	
	public void clickOnCalculateBtn() {
		this.calculatorBtn.click();
	}
	
	public String getResultMessage() {
		webUtil.waitUntilVisible(this.resultMessage);
		return this.resultMessage.getText();
	}
}
