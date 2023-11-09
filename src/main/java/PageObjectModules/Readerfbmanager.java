package PageObjectModules;

public class Readerfbmanager {

	
	
	private Readerfbmanager() {
		
		
		
	}
	
	public static Readerfbmanager Instant_reader() {
		Readerfbmanager rfm = new Readerfbmanager();
		return rfm;
		
	}
	public Readerfacebook Instatnt_readerValue() throws Exception{
		Readerfacebook rfb = new Readerfacebook();
		return rfb;
	}
	
	
}

