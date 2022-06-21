package org.jwt.server;

import org.springframework.stereotype.Component;

import com.levigo.jadice.web.server.config.ConfigurationManager;

@Component
public class Config {
    Config(){
        ConfigurationManager.getServerConfiguration().setTileCachingEnabled(false);
    }
}
