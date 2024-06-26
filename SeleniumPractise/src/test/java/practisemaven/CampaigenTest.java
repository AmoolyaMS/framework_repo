package practisemaven;

import org.testng.annotations.Test;

public class CampaigenTest {
@Test
private void creatCampaigenTest() {
	 String url = System.getProperty("url");
	  String user = System.getProperty("username");
	  String pwd = System.getProperty("password");
	  String Browser = System.getProperty("Browser");
	  System.out.println(url+" "+user+" "+pwd+" "+Browser);
System.out.println("execute creatcampaigentest");
}
@Test
private void modifyCampaigenTest() {
System.out.println("modify creatcampaigentest"); 
}
@Test
private void deleteCampaigenTest() {
System.out.println("delete creatcampaigentest");
}
}
