package org.hack.transferHack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void 푸틴의계좌에서_나한테보내는법() throws InterruptedException {

        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        } catch (Exception e) {
            System.out.println("푸틴은 안되는데..");
        }

        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        Thread.sleep(50000L);

    }

    @Test
    void testt1() {
        Account account = new Account("test1");
        account.transfer(100000, "teasoo");

    }
}