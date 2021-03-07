package org.jesperancinha.java11.crums.crum6;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum6 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 6 - Setting up Locales and translation bundles");

        MAGENTA.printGenericLn("In this case, we are missing the language");

        Locale.setDefault(new Locale("", "PT"));

        ORANGE.printGenericLn("We have set the default Locale to -> %s", Locale.getDefault());

        final Locale locale = new Locale.Builder().setLanguage("pt")
                .build();
        ORANGE.printGenericLn("We will use, however a Locale with just a language %s", locale);

        ResourceBundle resourceBundlePt = ResourceBundle.getBundle("messages", locale);

        ORANGE.printGenericLn(resourceBundlePt.getString("goodday"));
        ORANGE.printGenericLn(resourceBundlePt.getString("goodnight"));
        try {
            ORANGE.printGenericLn(resourceBundlePt.getString("goodmorning"));

        } catch (MissingResourceException e) {
            RED.printGenericLn("This is expected! Since we cannot find the resource \"goodmorning\", we throw this exception -> %s", e);
            RED.printGenericLn("The reason for this is that file messages_pt_PT.properties, is only valid for a Locale with country PT");
            RED.printGenericLn("Since this is not the case with our java.util.Locale, our code will throw a java.util.MissingResourceException");
        }

        var locale2 = new Locale.Builder().setRegion("ES")
                .build();
        MAGENTA.printGenericLn("We can also read a bundle file, if we only have the country code of it -> %s. This is only possible with two underscores though", locale2);
        final ResourceBundle resourceBundleEs = ResourceBundle.getBundle("messages", locale2);
        ORANGE.printGenericLn(resourceBundleEs.getString("goodnight"));

        var locale3 = new Locale.Builder().setLanguage("pt")
                .setRegion("PT")
                .build();
        MAGENTA.printGenericLn("We can also read a bundle file, if we have the language and the country code -> %s", locale3);
        final ResourceBundle resourceBundlePtPt = ResourceBundle.getBundle("messages", locale3);
        ORANGE.printGenericLn(resourceBundlePtPt.getString("goodmorning"));

        GREEN.printGenericLn("Bundles have simple and very complicated rules");
        GREEN.printGenericLn("A normal message properties file can have this format: <bundle_name>_<language_code>_<country_code>.properties");
        GREEN.printGenericLn("If we only have the bundle: <bundle_name>.properties");
        GREEN.printGenericLn("If we have the bundle and the language: <bundle_name>_<language_code>.properties");
        GREEN.printGenericLn("If we have the bundle and the country: <bundle_name__<country_code>.properties (notice the two underscores");

    }
}
