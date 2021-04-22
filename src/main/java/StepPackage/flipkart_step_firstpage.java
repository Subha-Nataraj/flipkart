package StepPackage;

import ObjectPackage.flipkart_object_firstpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkart_step_firstpage {
flipkart_object_firstpage flipkart;
@Given("^Launch the Web Application$")
public void launch_the_Web_Application() throws Throwable {
flipkart=new flipkart_object_firstpage();
}

@When("^Enter the UserName as \"([^\"]*)\" PassWord as \"([^\"]*)\"$")
public void enter_the_UserName_as_PassWord_as(String arg1, String arg2) throws Throwable {
 flipkart.textbox(flipkart.getuser(), arg1);
 flipkart.textbox(flipkart.getpass(), arg2);
}

@When("^Click the login button$")
public void click_the_login_button() throws Throwable {
   flipkart.getlogin().click();
}

@Then("^get the nextpage title for a successfull logins$")
public void get_the_nextpage_title_for_a_successfull_logins() throws Throwable {
    flipkart.title();
}


}
