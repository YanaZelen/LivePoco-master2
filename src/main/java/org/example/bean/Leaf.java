package org.example.bean;

import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class Leaf {
    Bug bug;

    @Override
    public String toString() {
        return "Листик съел жучок," + bug.toString();
    }
}
