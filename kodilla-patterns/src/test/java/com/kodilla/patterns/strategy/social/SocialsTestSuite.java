package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SocialsTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials("Millenial");
        User ygeneration = new YGeneration("Ygene");
        User zgeneration = new ZGeneration("Zgene");
        //When
        String millenialsharing = millenial.sharePost();
        System.out.println("Millenial " + millenialsharing);
        String ygenesharing = ygeneration.sharePost();
        System.out.println("Y Generation " + ygenesharing);
        String zgenesharing = zgeneration.sharePost();
        System.out.println("Z Generation " + zgenesharing);
        //Then
        assertSame("Is sharing post on Facebook!", millenialsharing);
        assertSame("Is sharing post on Twitter!", ygenesharing);
        assertSame("Is sharing post on Snapchat!", zgenesharing);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User marco = new Millenials("Marco");
        //When
        String marcosharing = marco.sharePost();
        System.out.println("Marco " + marcosharing);
        marco.setSocialPublisher(new FacebookPublisher());
        marcosharing = marco.sharePost();
        System.out.println("Marco now " + marcosharing);
        //Then
        assertSame("Is sharing post on Facebook!", marcosharing);
    }
}
