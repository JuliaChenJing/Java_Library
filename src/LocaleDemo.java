import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		/*
		 * public Locale(String language, String country) { this(language,
		 * country, ""); }
		 */
		Locale obj = new Locale("ENGLISH", "AMERICA");
		System.out.println(obj.getCountry());// AMERICA

	}
}
