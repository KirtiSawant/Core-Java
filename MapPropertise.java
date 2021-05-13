import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MapPropertise {

	public static void main(String[] args) {
		Properties properties = new Properties();

		properties.setProperty("property1", "value1");
		properties.setProperty("property2", "value2");
		properties.setProperty("property3", "value3");

		try(FileWriter output = new FileWriter("data/props.properties")){
		    properties.store(output, "These are properties");
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
