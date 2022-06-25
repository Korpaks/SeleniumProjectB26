package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_Practice {

    CydeoPracticePage page;
    Actions actions ;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        page = new CydeoPracticePage();
        actions = new Actions(Driver.getDriver());
    }

    @Test
    public void dragSmallCircle(){
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles


//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."
        Assert.assertEquals(page.bigCircle.getText(),"Drag the small circle here.");
    }

    @Test
    public void drop_here_text(){
//        TC #3: Cydeo Practice Drag and Drop Test
//        1. Open a chrome browser
//        2.  Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

//        3. Click and hold small circle

        CydeoPracticePage page = new CydeoPracticePage();
        actions.moveToElement(page.smallCircle).clickAndHold().moveByOffset(100,100).perform();

//        4. Verify "Drop here." text appears on big circle
        Assert.assertTrue(page.bigCircle.getText().equals("Drop here."));
    }

}
