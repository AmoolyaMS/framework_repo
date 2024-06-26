package executemaven;

import org.testng.annotations.Test;

public class LeadTest {
@Test
private void creatleadTest() {
	 String url = System.getProperty("url");
	  String user = System.getProperty("username");
	  String pwd = System.getProperty("password");
	  String Browser = System.getProperty("Browser");
	  System.out.println(url+" "+user+" "+pwd+" "+Browser);
System.out.println("execute creatcampaigentest");
}
@Test
private void modifyleadTest() {
System.out.println("modify creatcampaigentest"); 
}
@Test
private void deleteleadTest() {
System.out.println("delete creatcampaigentest");
}
}
