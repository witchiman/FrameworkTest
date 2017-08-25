package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.*;

@Component
public class CDPlayer implements MediaPlayer {
    private CompacDisc cd;

    @Autowired                          //该注解是用来在Spring为CDPlayer创建bean的时候，通过这个构造器传入一个可设置给
    public CDPlayer(CompacDisc cd) {    //CompactDisc的bean，从而解决CDPlayer类对于CompactDisc的依赖问题。
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    @Autowired
    public void setCd(CompacDisc cd) {        //除了构造方法注入还可能通过setter方法注入
        this.cd = cd;
    }
}
