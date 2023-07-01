package dropdown;

import base.BaseTest5;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class DropdownTest extends BaseTest5 {
    @Test
    public void testSelectedOption()
    {
        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect no of Values selected");
        assertTrue(selectedOptions.contains(option),"option not selected");

    }
}
