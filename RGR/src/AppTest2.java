import org.junit.*;

public class AppTest2 {
	
	Api api=new Api();
	
	@Test
	public void testRunApp() {
		new App(); //can it run application
	}

    @Test
    public void testApp(){
        Assert.assertEquals(152,  api.calcArea(19, 8));
        
    }
}
