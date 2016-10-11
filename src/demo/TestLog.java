package demo;

import org.apache.log4j.Logger;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class TestLog {
	
	Logger log = Logger.getLogger(TestLog.class);
	
	public void ditBonjour(String nom)
	{
		log.info("Bonjour " + nom);
	}
	
	public static void main(String[] args) {
		TestLog t = new TestLog();
		t.ditBonjour("Sabrine");
	
	}

}
