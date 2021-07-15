import java.io.File;
import static com.neotys.selenium.proxies.NLWebDriverFactory.addProxyCapabilitiesIfNecessary;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.neotys.selenium.proxies.NLWebDriver;
import com.neotys.selenium.proxies.NLWebDriverFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteJPetStore {
	private static final String CHROME_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	
	static {
		final File file = new File(CHROME_DRIVER_PATH);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	}
	static NLWebDriver driver;

	@BeforeClass
	public static void AbrirSitePetStore(){
		final ChromeDriver webDriver = new ChromeDriver(addProxyCapabilitiesIfNecessary(new DesiredCapabilities()));	
		// projectPath used to open NeoLoad project, null to use currently opened Project.
		final String projectPath = "C:\\Users\\milton.silva\\Documents\\NeoLoad Projects\\ProjetoSeleniumTeste\\ProjetoSeleniumTeste.nlp";
		driver = NLWebDriverFactory.newNLWebDriver(webDriver, "SeleniumUserPath", projectPath);	
}
	@Test
	public void clicar() {
//		driver.startTransaction("home1");
//		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
//		driver.stopTransaction();
	}
	
	}
