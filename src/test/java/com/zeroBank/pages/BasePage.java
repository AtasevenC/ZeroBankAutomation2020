package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract  class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Account Summary")
    public  WebElement AccountSummary;
    @FindBy(linkText = "Account Activity")
    public  WebElement AccountActivity;
    @FindBy(linkText = "Transfer Funds")
    public  WebElement TransferFunds;
    @FindBy(linkText = "Pay Bills")
    public  WebElement PayBills;


  public void navigate(String pageName) throws InterruptedException {
      Driver.get().findElement(By.linkText(pageName)).click();
      Thread.sleep(2000);
  }
}
