
package com.zyro.youtube;

import dev.arbjerg.lavalink.api.ISocketContext;
import dev.arbjerg.lavalink.api.PluginEventHandler;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZyroYouTubePlugin extends PluginEventHandler {

    private static final Logger log = LoggerFactory.getLogger(ZyroYouTubePlugin.class);

    public ZyroYouTubePlugin() {
        log.info("ZYRO YouTube Plugin loaded!");
    }

    @Override
    public void onWebSocketOpen(@NotNull ISocketContext context, boolean resumed) {
        log.info("ZYRO WebSocket opened!");
    }
}
