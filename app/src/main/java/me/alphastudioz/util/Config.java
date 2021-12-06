package me.alphastudioz.util;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Config {

    private static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    private static InputStream inputStream = classLoader.getResourceAsStream("Config.yml");
    private static Yaml yaml = new Yaml();
    private static Map<String, Object> data = (Map<String, Object>) yaml.load(inputStream);

    public static String getToken() {
        return data.get("token").toString();
    }

    public static void setToken(String token) {
        data.put("token", token);
    }
}
