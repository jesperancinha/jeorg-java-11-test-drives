import org.jesperancinha.java11.mastery2dot1.animals.BetterFluteServiceImpl;
import org.jesperancinha.java11.mastery2dot1.animals.FluteService;
import org.jesperancinha.java11.mastery2dot1.animals.FluteServiceImpl;
import org.jesperancinha.java11.mastery2dot1.animals.OboeService;
import org.jesperancinha.java11.mastery2dot1.animals.OboeServiceImpl;

module $mastery$ {
    requires consolerizer;
    uses FluteService;
    uses OboeService;
    provides FluteService with FluteServiceImpl, BetterFluteServiceImpl;
    provides OboeService with OboeServiceImpl;
}