package org.jwt.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.levigo.jadice.web.server.config.ConfigurationManager;

@Component
public class Config {
    @Value("${webtoolkit.tileCachingEnabled:false}")
    private boolean tileCachingEnabled;

    Config(){
        ConfigurationManager.getServerConfiguration().setTileCachingEnabled(false);
    }
}
