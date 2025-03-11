package mypack;
import static java.lang.System.out;
import java.util.Properties;

public class TestSystemproperties {
public static void main(String[] args) {
	Properties pros = System.getProperties();
	// pros.list(System.out);
	out.println(pros);
	}
}
