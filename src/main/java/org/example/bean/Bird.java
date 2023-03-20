package org.example.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Bird {

    private Spider spider;

    @Autowired
    public Bird(Spider spider) {
        this.spider = spider;
    }

    @Override
    public String toString() {
        return "птичку съел паук," + spider;
    }
}
