package org.example.bean;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class Leopard {

    @Override
    public String toString() {
        return "леопард живёт - поживает!";
    }
}
