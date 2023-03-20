package org.example.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Snake {
    private Mangust mangust;

    @Autowired
    public void setSnake(Mangust mangust) {
        this.mangust = mangust;
    }

    @Override
    public String toString() {
        return "змею съел мангуст," + mangust;
    }
}
