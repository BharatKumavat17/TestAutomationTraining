package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index)
    {
        //figurecaption return multiple element
        WebElement figure = driver.findElements(figureBox).get(index-1); //here this get 3 element and select 1st element using "get()" method

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }
    //New approach to handle found Element fields
    public class FigureCaption{
        //accept element in caption
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        //this will execute
        public FigureCaption(WebElement caption)
        {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed()
        {
            //Here caption added so anything that needs to be find is inside caption elemebnt
            return caption.isDisplayed();
        }
        public String getTitle()
        {
            return caption.findElement(header).getText();
        }

        public String getLink()
        {
            return caption.findElement(link).getAttribute("href");
        }

        public String linkText()
        {
            return caption.findElement(link).getText();
        }
    }



}
