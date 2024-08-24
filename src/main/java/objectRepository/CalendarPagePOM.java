package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPagePOM {

	@FindBy(xpath = "//td[@class='cellNormal']/div/img[@onclick=\"fnvshobj(this,'addEvent'); "
			+ "gshow('addEvent','Call','2024-03-18','2024-03-18','08','00','am','09','00','am','hourview','event')\"]")
	private WebElement Mon_8AM_18;

	@FindBy(id = "[id='activitytype']")
	private WebElement event_type;

	@FindBy(xpath = "//option[@value='Call']")
	private WebElement call;

	@FindBy(xpath = "//option[@value='Meeting']")
	private WebElement meeting;

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement event_name;

	@FindBy(xpath = "//input[@name='visibility']")
	private WebElement mark_public_checkbox;

	@FindBy(name = "[name='description']")
	private WebElement description;

	@FindBy(name = "[name='location']")
	private WebElement location;

	@FindBy(id = "[id='eventstatus']")
	private WebElement status;

	@FindBy(xpath = "(//input[@name='assigntype'])[1]")
	private WebElement assigned_to;

	@FindBy(xpath = "(//select[@id='taskpriority'])[1]")
	private WebElement priority;

	@FindBy(name = "[name='sendnotification']")
	private WebElement send_notification;

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Calendar.gif']")
	private WebElement calendar1;

	@FindBy(xpath = "(//td[@class='day' and .='20'])[4]")
	private WebElement startdate;

	@FindBy(id = "[id='jscal_trigger_due_date']")
	private WebElement calendar2;

	@FindBy(xpath = "(//td[@class='day' and .='25'])[5]")
	private WebElement enddate;

	@FindBy(xpath = "//a[.='Invite']")
	private WebElement invite;

	@FindBy(xpath = "//a[.='Reminder']")
	private WebElement reminder;

	@FindBy(xpath = "//a[.='Repeat']")
	private WebElement repeat;

	@FindBy(xpath = "//a[.='Related To']")
	private WebElement related_to;

	@FindBy(name = "[name='eventsave']")
	private WebElement savebtn;

	@FindBy(name = "[name='eventcancel']")
	private WebElement cancelbtn;

	//Constructor
	public CalendarPagePOM(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	//Getters
	public WebElement getMon_8AM_18() {
		return Mon_8AM_18;
	}

	public WebElement getEvent_type() {
		return event_type;
	}

	public WebElement getCall() {
		return call;
	}

	public WebElement getMeeting() {
		return meeting;
	}

	public WebElement getEvent_name() {
		return event_name;
	}

	public WebElement getMark_public_checkbox() {
		return mark_public_checkbox;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getAssigned_to() {
		return assigned_to;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getSend_notification() {
		return send_notification;
	}

	public WebElement getCalendar1() {
		return calendar1;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getCalendar2() {
		return calendar2;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getInvite() {
		return invite;
	}

	public WebElement getReminder() {
		return reminder;
	}

	public WebElement getRepeat() {
		return repeat;
	}

	public WebElement getRelated_to() {
		return related_to;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	//Business Library
	public void ClickOnMon_8AM_18() {

		getMon_8AM_18().click();
	}

	public void ClickOnEventType() {
		getEvent_type().click();
	}

	public void SelectCall() {

		getCall().click();
	}

	public void SelectMeeting() {

		getMeeting().click();
	}

	public void EnterEventName(String eventname) {

		getEvent_name().sendKeys(eventname);
	}

	public void ClickOnPublicCheckBox() {

		getMark_public_checkbox().click();
	}

	public void EnterDescription(String desc) {

		getDescription().sendKeys(desc);
	}

	public void EnterLocation (String location) {

		getLocation().sendKeys(location);
	}

	public void SelectStatus() {

		getStatus().click();
	}

	public void SelectAssigedTo() {

		getAssigned_to().click();
	}

	public void SelectPriority() {

		getPriority().click();
	}

	public void SelectStartDate() {

		getCalendar1().click();
		getStartdate().click();
	}

	public void SelectEndDate() {

		getCalendar2().click();
		getEnddate().click();
	}

	public void ClickOnInvite() {

		getInvite().click();
	}

	public void ClickOnReminder() {

		getReminder().click();
	}

	public void ClickOnRepeat() {

		getRepeat().click();
	}

	public void ClickOnRelatedTo() {

		getRelated_to().click();
	}

	public void ClickOnSaveBtn() {

		getSavebtn().click();
	}

	public void ClickOnCancelBtn() {

		getCancelbtn().click();
	}

	public void ClickOnSendNotice() {

		getSend_notification().click();
	}

}
