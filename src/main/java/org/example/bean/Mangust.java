package org.example.bean;

import lombok.Data;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Value
public class Mangust {

    Leopard leopard;

    @Override
    public String toString() {
        return "мангуста съел леопард," + leopard.toString();
    }
}
