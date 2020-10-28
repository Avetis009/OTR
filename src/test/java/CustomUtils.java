import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomUtils {

    public static byte[] getScreen(WebDriver driver){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot,new File("src/main/resources/screen.jpg"));
            return Files.readAllBytes(Paths.get("src/main/resources","screen.jpg"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return new byte[0];
    }
}
