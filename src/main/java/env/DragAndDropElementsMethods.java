package env;

import env.BaseTest;
import methods.SelectElementByType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by frozenbe@alumni.uwo.ca on 2017-02-19.
 */
public class DragAndDropElementsMethods extends SelectElementByType implements BaseTest {
    private WebElement elementA = null;
    private WebElement elementB = null;


    public DragAndDropElementsMethods() {
    }


    public void dragFromElementToElement(String accessTypeElementA, String accessValueElementA, String accessTypeElementB, String accessValueElementB) {
        this.elementA = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(this.getelementbytype(accessTypeElementA, accessValueElementA)));
        this.elementB = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(this.getelementbytype(accessTypeElementB, accessValueElementB)));

        Actions action = new Actions(driver);

        action.dragAndDrop(elementA, elementB).build().perform();
    }




    }
