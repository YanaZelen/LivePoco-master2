package org.example.bean;

import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class Bug {

    Bird bird;

    @Override
    public String toString() {
        return "жучка съела птичка," + bird.toString();
    }
}
