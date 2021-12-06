package me.alphastudioz;

import javax.security.auth.login.LoginException;

import me.alphastudioz.util.Config;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Init {

    public static String token = Config.getToken();

    public static void build() throws LoginException {
        JDABuilder builder = JDABuilder.createDefault(token);

        // Disable parts of the cache
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);
        // Set activity (like "playing Something")
        builder.setActivity(Activity.competing("Coded in Java"));

        builder.build();
        
    }

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        Init.token = token;
    }
}
