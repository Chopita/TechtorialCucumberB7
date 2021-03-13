package pages.com.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupOrderPage {

    public GroupOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(id = "InviteNote")
        public WebElement inviteNote;

    @FindBy(id = "InviteList")
    public WebElement inviteList;


    @FindBy(id = "createGroupOrder")
    public WebElement createGroupOrder;


    @FindBy(xpath = " //h1[contains(text(),'View Group Order')]")
    public WebElement viewGroupOrderHeader;


    @FindBy(xpath = "//label[.='Total Participants:']/following-sibling::div")
    public WebElement participants;

    public void sendInviteeNote(String note){
        inviteNote.sendKeys(note);

    }

    public void sendInviteList(String list){
        inviteList.sendKeys(list);
    }
    public void clickCreateGroup(){
        createGroupOrder.click();

    }
    public int getParticipantNumber(){
       return Integer.parseInt(participants.getText().trim());

    }

    }

