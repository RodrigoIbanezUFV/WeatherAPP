package com.ufv.dis;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGetRecommendationSunnyAndWarm() {
        assertEquals("Perfecto para hacer un picnic", WeatherApp.getRecommendation(25, "soleado"));
    }

    @Test
    public void testGetRecommendationColdAndRainy() {
        assertEquals("Abrígate y lleva paraguas", WeatherApp.getRecommendation(5, "lluvioso"));
    }

    @Test
    public void testGetRecommendationHotAndSunny() {
        assertEquals("Lleva gorra y protector solar", WeatherApp.getRecommendation(30, "soleado"));
    }
}

