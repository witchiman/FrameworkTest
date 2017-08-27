import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.MediaPlayer;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:player.xml")
public class XmlConfigTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().mute().enableLog();

    @Autowired
    private MediaPlayer player;


    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing This is a collection of songs from web by singers\n" +
                        "-Track: There's a bird fly ya\n" +
                        "-Track: Just do it\n" +
                        "-Track: Just fix it\n" +
                        "-Track: hahaha\n",
                 log.getLog());
    }
}
