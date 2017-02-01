package jp.ac.uryukyu.ie.e165720;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165720 on 2017/02/01.
 */
public class centerTest {
    center w = new center();
    @Test
    public void deal() throws Exception {
        w.deal();
    }

    @Test
    public void judge() throws Exception {
         w.judge(18,19);
    }

    @Test
    public void player() throws Exception {
       w.player();
    }

    @Test
    public void dealer() throws Exception {
        w.dealer();
    }

    @Test
    public void dealer2() throws Exception {
        w.dealer2(12);
    }

}