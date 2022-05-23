package com.sparta.fw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }

    @Test
    @DisplayName("check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.greeting( 14));
    }
    @Test
    @DisplayName("check that we can return Good Evening")
    void checkWeCanReturnGoodEvening(){
        Assertions.assertEquals("Good Evening", App.greeting( 19));
    }

    @Test
    @DisplayName("check that returns Good Evening at 24")
    void checkWeCanReturnGoodEveningWithEquals(){
        Assertions.assertEquals("Good Evening", App.greeting( 24));
    }

    @Test
    @DisplayName("out of range test")
    void checkWeCanReturnNotValidMessage(){
        Assertions.assertEquals("Your selection isn't valid", App.greeting( 35));
    }

    @Test
    @DisplayName("check for - 1")
    void checkWeCanReturnMinusNumber(){
        Assertions.assertEquals("Your selection isn't valid", App.greeting( -1));
    }



}
