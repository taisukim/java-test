package org.hack.transferHack;

public class BrokenAccount extends Account {

    public BrokenAccount(String name) {
        super(name);
    }

    /**
     * finalize 를통해 서 gc가 실행될때 메서드를 호출하는걸 오버라이딩해버리면 가능하다는건 알겠는데
     * 테스트에서 해봤는데 안되네 ㅎㅎ.
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        this.transfer(100000, "taesoo");
    }
}
