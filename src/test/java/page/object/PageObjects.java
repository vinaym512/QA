package page.object;

import org.openqa.selenium.By;

public class PageObjects {

	public static By btnPopup = By.xpath("//div[@class='Onboard_close_1p8']");
	public static By lnkRacing = By.xpath("//a[@data-redesign-ga='mainNav/Click/Racing']");
	public static By btnHorseRacing = By.xpath("(//span[@class='TrendingBets_sportType_34m'][text()='horseracing']/ancestor::div[2]//button)[1]");
	public static By boxStake = By.cssSelector(".CurrencyBox_currencyBox_2ey.CurrencyBox_withoutSymbol_34P.QuickBetOptions_textInput_1QJ");
	public static By btnAddBet = By.cssSelector(".Button_root_3Zd.Button_center_1Yv.Button_fullWidth_2af.Button_white_1pH");
	public static By sectionBetAdded = By.xpath("//span[@class='SideBar_badge_Dhz']");
}

