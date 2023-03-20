package org.example.bean;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class Spider {

    Snake snake;


    @Override
    public String toString() {
        return "паука съела змея," + snake.toString();
    }
}
