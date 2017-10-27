package bowling.frame.state;

import static org.junit.Assert.*;

import org.junit.Test;

import bowling.frame.state.Spare;

public class SpareTest {
    @Test(expected = IllegalArgumentException.class)
    public void create_illegal() throws Exception {
        new Spare(7, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void bowl() {
        new Spare(8, 2).bowl(8);
    }

    @Test
    public void cacluateAdditionalScore() throws Exception {
        Score score = new Score(10, 2);
        Spare spare = new Spare(8, 2);
        assertEquals(new Score(20, 0), spare.cacluateAdditionalScore(score));
    }
}
