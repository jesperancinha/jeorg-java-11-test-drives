package org.jesperancinha.b2b2designpatterns.facadepattern.maker;

import org.jesperancinha.b2b2designpatterns.facadepattern.entities.Cancer;
import org.jesperancinha.b2b2designpatterns.facadepattern.entities.Pegasus;
import org.jesperancinha.b2b2designpatterns.facadepattern.entities.Sagittarius;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public class ConstellationMakerTest {
    @Test
    public void drawCancer() throws InterruptedException {
        Logger logger = Logger.getLogger(Cancer.class.getName());
        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        final ConstellationMaker constellationMaker = new ConstellationMaker();
        final Runnable drawCancer = constellationMaker::drawCancer;
        final ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(drawCancer);
        service.shutdown();
        service.awaitTermination(60, TimeUnit.SECONDS);

        handler.flush();
        String logMsg = out.toString();
        assertThat(logMsg).contains("Constellation Cancer is drawn!");
    }

    @Test
    public void drawPegasus() throws InterruptedException {
        Logger logger = Logger.getLogger(Pegasus.class.getName());
        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        final ConstellationMaker constellationMaker = new ConstellationMaker();
        final Runnable drawPegasus = constellationMaker::drawPegasus;
        final ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(drawPegasus);
        service.shutdown();
        service.awaitTermination(60, TimeUnit.SECONDS);

        handler.flush();
        String logMsg = out.toString();
        assertThat(logMsg).contains("Constellation Pegasus is drawn!");
    }

    @Test
    public void drawSagittarius() throws InterruptedException {
        Logger logger = Logger.getLogger(Sagittarius.class.getName());
        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        final ConstellationMaker constellationMaker = new ConstellationMaker();
        final Runnable drawSagittarius = constellationMaker::drawSagittarius;
        final ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(drawSagittarius);
        service.shutdown();
        service.awaitTermination(60, TimeUnit.SECONDS);

        handler.flush();
        String logMsg = out.toString();
        assertThat(logMsg).contains("Constellation Sagittarius is drawn!");
    }

}