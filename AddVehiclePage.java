package org.example.pages.RequestsPackage;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class AddVehiclePage {
    public WebElement dateDropDown(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[1]/div[1]/div/div"));
    }
    public WebElement dateDropDownOption(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ant-picker-today-btn\"]"));
    }
    public WebElement yearTxtBox(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[2]/div[1]/div/input"));
    }

    public WebElement makeTxtBox(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[3]/div[1]/div/input"));
    }

    public WebElement modelTxtBox(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[4]/div[1]/div/input"));
    }
    public WebElement vinTxtBox(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[5]/div[1]/div/input"));
    }

    public WebElement coverageRequestedTxtBox(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/div/app-react-design-system-wrapper/app-react-design-system-form-container/div/div/div[1]/div/div[2]/div[6]/div[1]/div/input"));
    }
    public WebElement submitBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".tru-market-submit-button button")));
        return submitButton;
    }
 public WebElement confirmedMsgForRequest(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/snack-bar-container/div/div/simple-snack-bar/span"));
  }
}
