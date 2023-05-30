package org.example.stepDefs.RequestsSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RequestsPackage.AddVehiclePage;
import org.example.stepDefs.Hooks;
import org.example.stepDefs.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddVehicleSteps extends AddVehiclePage {
    functions functionsObj=new functions();
    @When("user click the effective date drop down on add vehicle page")
    public void clickEffectiveDateDropDown(){
        dateDropDown().click();
    }
    @And("user select effective date drop down option on add vehicle page")
    public void selectEffectiveDateDropDown(){
        dateDropDownOption().click();
    }
    @And("user enter year")
    public void enterYear(){
        yearTxtBox().sendKeys("2022");
    }

    @When("user enter make")
    public void enterMake() {
        makeTxtBox().sendKeys("make of vehicle");
    }
    @And("user enter model")
    public void enterModel() {
        modelTxtBox().sendKeys("model of vehicle");
    }
    @And("user enter VIN number")
    public void enterVIN (){
        vinTxtBox().sendKeys("3");
    }
    @And("user enter coverage requested")
    public void enterCoverage() {

        coverageRequestedTxtBox().sendKeys("the coverage ");
    }
    @And("click submit")
    public void clickSubmit() throws InterruptedException {
        submitBtn().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        WebElement historyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-protected/mat-sidenav-container/mat-sidenav-content/div/div/app-request-changes/div/nav/div/div/div/button[2]")));

    }
    @Then("validate that add vehicle is added in history")
    public void validateAddVehicleInHistory(){
        functionsObj.checkHistoryIsAddedARequest("Add Vehicle",functionsObj.dateOFToday());
    }
}
