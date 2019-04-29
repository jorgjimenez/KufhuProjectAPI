package utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SessionMap;

public class DataSession {
    private static final SessionMap<Object, Object> serenitySession = Serenity.getCurrentSession();

    public enum Data {

        NAME("name");
        private String value;

        Data(String value) {
            this.value = value;
        }
    }

    public static <T> T getFromSession(Data key) {
        return (T) serenitySession.get(key.value);
    }

    public static <T> T getFromSession(String key) {
        return (T) serenitySession.get(key);
    }

    public static <T> void setInSession(Data key, T value) {
        serenitySession.put(key.value, value);
    }

    public static <T> void setInSession(String key, T value) {
        serenitySession.put(key, value);
    }
}
