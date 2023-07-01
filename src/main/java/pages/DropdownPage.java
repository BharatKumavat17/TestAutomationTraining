package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void selectFromDropdown(String option)
    {
        //Select dropdownElement = new Select(driver.findElement(dropdown));  -- Instead of this we created method findDropdownElement
        //If above line added then dropdownElement.selectedByVisibleText(option)
        findDropdownElement().selectByVisibleText(option);

    }

    public List<String> getSelectedOptions()
    {
        //Here we are passing String of list as return as we dont want to pass any element to main class
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();

        //to Extract text value stream from All WebElement found by getAllSelectedOptions();
        //Here .map(e->e.getText()) is lambda expression
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

    }

    private  Select findDropdownElement()
    {
        return new Select(driver.findElement(dropdown));
    }


}
