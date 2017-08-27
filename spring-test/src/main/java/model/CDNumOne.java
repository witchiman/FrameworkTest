package model;

import org.springframework.stereotype.Component;

@Component                    //默认创建类为类名首字母小写
public class CDNumOne implements CompacDisc {
    private String title = "Love you for ever";
    private String artist = "LiuDefu";

    @Override
    public void play() {
        System.out.println(artist + " sings " + title);
    }
}
