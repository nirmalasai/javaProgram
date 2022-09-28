
public void iccTest(String teamName) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		WebElement rankings = driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::button[@class='linked-list__dropdown-label js-dropdown-btn' and normalize-space()='Rankings']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(rankings).perform();
		
		
		WebElement teamRankings = driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::a[@href='/rankings/mens/team-rankings']"));
		teamRankings.click();
		
		String mensRankingPageTitle = "ICC Men's Test Team Rankings | ICC";
		String actTitle = driver.getTitle();
		
		if(actTitle.contains(mensRankingPageTitle)) {
			Assert.assertTrue(true);
			Reporter.log("Mens Ranking page is displayed : ", true);
		}else {
			Assert.assertTrue(false);
			Reporter.log("Mens Ranking page not displayed : ", true);
		}
		WebElement tableTeamRating =driver.findElement(By.xpath("//table[@class='table']/tbody/tr[contains(.,'"+teamName+"')]/td[5]"));
	
		String teamText = tableTeamRating.getText();
		System.out.println("teamText is "+teamText);
		
	}
}