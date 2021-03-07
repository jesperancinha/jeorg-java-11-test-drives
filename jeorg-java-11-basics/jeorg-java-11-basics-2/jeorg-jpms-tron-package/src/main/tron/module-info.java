import org.jesperancinha.java11.tron.TronService;
import org.jesperancinha.java11.tron.TronServiceImpl;

module tron {
    uses TronService;
    exports org.jesperancinha.java11.tron;
    provides TronService with TronServiceImpl;
}