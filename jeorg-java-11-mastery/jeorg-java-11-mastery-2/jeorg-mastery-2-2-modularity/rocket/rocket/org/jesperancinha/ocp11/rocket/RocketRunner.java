package org.jesperancinha.java11.rocket;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.lunar.extra.HelloSender;
import org.jesperancinha.java11.lunar.module.LunarInterface;
import org.jesperancinha.java11.service.module.ServiceInterface;

import java.util.ServiceLoader;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.typingWaitGlobal;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class RocketRunner {
    public static void main(String[] args) {
        typingWaitGlobal = 0;
        BLUE.printGenericLn("============ Welcome to the Apollo 13's mission launch of 1970 ============");
        printRainbowTitleLn("Apollo 13 - Rocket Launched!...");

        ServiceLoader<ServiceInterface> serviceLoaderServiceModule = ServiceLoader.load(ServiceInterface.class);
        ServiceLoader<LunarInterface> serviceLoaderLunarModule = ServiceLoader.load(LunarInterface.class);

        var lunarInterface = serviceLoaderLunarModule.findFirst().orElse(null);
        var serviceInterface = serviceLoaderServiceModule.findFirst().orElse(null);

        HelloSender.sendHello();
        serviceInterface.detachModule();
        lunarInterface.detachModule();

        YELLOW.printGenericLn("Mission complete");
        GREEN.printGenericLn("Done!!");
    }
}
