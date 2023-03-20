package org.example;

import org.example.bean.Leaf;
import org.example.config.ApplicationConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    Leaf leaf = applicationContext.getBean(Leaf.class);

    @Test
    public void testLife() {
        String s = leaf.toString();
        System.out.println(s);
        Assert.assertEquals("Листик съел жучок,жучка съела птичка,птичку съел паук,паука съела змея," +
                        "змею съел мангуст,мангуста съел леопард,леопард живёт - поживает!", s);
    }
}
