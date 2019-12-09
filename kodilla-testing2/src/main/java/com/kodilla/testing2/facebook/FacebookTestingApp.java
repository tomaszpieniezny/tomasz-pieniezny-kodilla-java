package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span";
    public static final String XPATH_SELECT_DAY = XPATH_SELECT + "/select[1]";
    public static final String XPATH_SELECT_MONTH = XPATH_SELECT + "/select[2]";
    public static final String XPATH_SELECT_YEAR = XPATH_SELECT + "/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
        //02.11.1999
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("22");


        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("1");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1995");
    }
}