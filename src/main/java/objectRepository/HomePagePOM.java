package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {

	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private	WebElement home;

	@FindBy(xpath = "//a[.='Calendar']")
	private	WebElement calendar;

	@FindBy(xpath = "(//a[.='Leads'])[1]")
	private	WebElement leads;

	@FindBy(xpath = "(//a[.='Organizations'])[1]")
	private	WebElement organizations;

	@FindBy(xpath = "//a[.='Contacts']")
	private	WebElement contacts;
	@FindBy(xpath = "(//a[.='Opportunities'])[1]")
	private	WebElement opportunities;

	@FindBy(xpath = "//a[.='Products']")
	private	WebElement products;

	@FindBy(xpath = "//a[.='Documents']")
	private	WebElement documents;

	@FindBy(xpath = "//a[.='Email']")
	private	WebElement email;

	@FindBy(xpath = "(//a[.='Trouble Tickets'])[1]")
	private	WebElement trouble_tickets;

	@FindBy(xpath = "//a[.='Dashboard']")
	private	WebElement dashboard;

	@FindBy(xpath = "//a[.='More']")
	private	WebElement more;

	@FindBy(xpath = "//a[.='SMSNotifier']")
	private	WebElement smsnotifier;

	@FindBy(xpath = "//a[.='Our Sites']")
	private	WebElement our_sites;

	@FindBy(xpath = "//a[.='Integration']")
	private	WebElement integration;

	@FindBy(xpath = "//a[.='Mail Manager']")
	private	WebElement mail_manager;

	@FindBy(xpath = "//a[.='PBX Manager']")
	private	WebElement pbx_manager;

	@FindBy(xpath = "//a[.='Comments']")
	private	WebElement comments;

	@FindBy(xpath = "//a[.='Recycle Bin']")
	private	WebElement recycle_bin;

	@FindBy(xpath = "//a[.='RSS']")
	private	WebElement rss;

	@FindBy(xpath = "//a[.='Reports']")
	private	WebElement reports;

	@FindBy(xpath = "//a[.='Campaigns']")
	private	WebElement campaigns;

	@FindBy(xpath = "//a[.='Service Contracts']")
	private	WebElement service_contracts;

	@FindBy(xpath = "//a[.='Project Milestones']")
	private	WebElement project_mailestones;

	@FindBy(xpath = "//a[.='Project Tasks']")
	private	WebElement project_tasks;

	@FindBy(xpath = "//a[.='Projects']")
	private	WebElement projects;

	@FindBy(xpath = "//a[.='FAQ']")
	private	WebElement faq;

	@FindBy(xpath = "//a[.='Services']")
	private	WebElement services;

	@FindBy(xpath = "//a[.='Assets']")
	private	WebElement assests;

	@FindBy(xpath = "//a[.='Purchase Order']")
	private	WebElement purchase_order;

	@FindBy(xpath = "//a[.='Price Books']")
	private	WebElement price_books;

	@FindBy(xpath = "//a[.='Vendors']")
	private	WebElement vendors;

	@FindBy(xpath = "(//select[@class='small'])[1]")
	private WebElement quick_create;

	@FindBy(xpath = "//select/option[4]")
	private WebElement to_do;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private	WebElement user;

	@FindBy(id = "[id='_my_preferences_']")
	private	WebElement my_preferences;

	@FindBy(xpath = "//a[.='Sign Out']")
	private	WebElement sign_out;

	@FindBy(xpath = "//img[@src='themes/softed/images/info.PNG']")
	private	WebElement info;

	@FindBy(xpath = "//a[.='Help']")
	private	WebElement help;

	@FindBy(xpath = "//a[.='Feedback']")
	private	WebElement feedback;

	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	private	WebElement settings;

	@FindBy(xpath = "//a[.='CRM Settings']")
	private	WebElement crm_settings;

	//constructor
	public HomePagePOM(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	//Getters
	public WebElement getHome() {
		return home;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getDocuments() {
		return documents;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTrouble_tickets() {
		return trouble_tickets;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getSmsnotifier() {
		return smsnotifier;
	}

	public WebElement getOur_sites() {
		return our_sites;
	}

	public WebElement getIntegration() {
		return integration;
	}

	public WebElement getMail_manager() {
		return mail_manager;
	}

	public WebElement getPbx_manager() {
		return pbx_manager;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getRecycle_bin() {
		return recycle_bin;
	}

	public WebElement getRss() {
		return rss;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getCampaigns() {
		return campaigns;
	}

	public WebElement getService_contracts() {
		return service_contracts;
	}

	public WebElement getProject_mailestones() {
		return project_mailestones;
	}

	public WebElement getProject_tasks() {
		return project_tasks;
	}

	public WebElement getProjects() {
		return projects;
	}

	public WebElement getFaq() {
		return faq;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getAssests() {
		return assests;
	}

	public WebElement getPurchase_order() {
		return purchase_order;
	}

	public WebElement getPrice_books() {
		return price_books;
	}

	public WebElement getVendors() {
		return vendors;
	}

	public WebElement getQuick_create() {
		return quick_create;
	}

	public WebElement getTo_do() {
		return to_do;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getMy_preferences() {
		return my_preferences;
	}

	public WebElement getSign_out() {
		return sign_out;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getHelp() {
		return help;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCrm_settings() {
		return crm_settings;
	}

	public void ClickOnHome() {
		getHome().click();
	}
	public void ClickOnCalendar() {
		getCalendar().click();
	}
	public void ClickOnLeads() {
		getLeads().click();
	}
	public void ClickOnOrganization() {
		getOrganizations().click();
	}
	public void ClickOnOpportunities() {
		getOpportunities().click();
	}
	public void ClickOnContacts() {
		getContacts().click();
	}
	public void ClickOnProducts() {
		getProducts().click();
	}
	public void ClickOnDocuments() {
		getDocuments().click();
	}
	public void ClickOnEmail() {
		getEmail().click();
	}
	public void ClickOnTrouble_Tickets() {
		getTrouble_tickets().click();
	}
	public void ClickOnDashBoard() {
		getDashboard().click();
	}
	public void ClickOnMore() {
		getMore().click();
	}
	public void ClickOnSMSNotifier() {
		getSmsnotifier().click();
	}
	public void ClickOnOurSite() {
		getOur_sites().click();
	}
	public void ClickOnIntegration() {
		getIntegration().click();
	}
	public void ClickOnMail_Manager() {
		getMail_manager().click();
	}
	public void ClickOnPBX_Manager() {
		getPbx_manager().click();
	}
	public void ClickOnComments() {
		getComments().click();
	}
	public void ClickOnRecycle_Bin() {
		getRecycle_bin().click();
	}
	public void ClickOnRSS() {
		getRss().click();
	}
	public void ClickOnResports() {
		getReports().click();
	}
	public void ClickOnCampaigns() {
		getCampaigns().click();
	}
	public void ClickOnService_Contracts() {
		getService_contracts().click();
	}
	public void ClickOnProject_Milestones() {
		getProject_mailestones().click();
	}
	public void ClickOnProject_Tasks() {
		getProject_tasks().click();
	}
	public void ClickOnProjects() {
		getProjects().click();
	}
	public void ClickOnFAQ() {
		getFaq().click();
	}
	public void ClickOnServices() {
		getServices().click();
	}
	public void ClickOnAssests() {
		getAssests().click();
	}
	public void ClickOnPurchase_Order() {
		getPurchase_order().click();
	}
	public void ClickOnPrice_Book() {
		getPrice_books().click();
	}
	public void ClickOnVendors() {
		getVendors().click();
	}
	public void ClickOnQuick_Create() {
		getQuick_create().click();
		getTo_do().click();
	}
	public void ClickOnUser() {
		getUser().click();
	}
	public void ClickOnMy_Preferences() {
		getMy_preferences().click();
	}
	public void ClickOnSign_Out() {
		getSign_out().click();
	}
	public void ClickOnInfo() {
		getInfo().click();
	}
	public void ClickOnHelp() {
		getHelp().click();
	}
	public void ClickOnFeed_Back() {
		getFeedback().click();
	}
	public void ClickOnSettnigs() {
		getSettings().click();
	}
	public void ClickOnCRM_Settings() {
		getCrm_settings().click();
	}

}
