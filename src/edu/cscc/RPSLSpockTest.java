package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpockTest {

    @Test
    public void testIsValidPick() {
        //Testing all five input possibilities for the game through the 'isValidPick()' method to yield 'true' when input is valid.
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        //Testing an invalid game input through the 'isValidPick()' method to yield 'false'.
        Assert.assertFalse(RPSLSpock.isValidPick(null));
    }

    @Test
    //Testing the validity of the 'generatePick()' method one million times using the 'isValidPick()' method a for loop.
    public void testGeneratePick() {
        for(int i = 0; i < 1000000; i++)
        {
            Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.generatePick()));
        }
    }

    @Test
    public void testIsComputerWin() {
        //Testing all the possibilities for 'isComputerWin()' to yield 'true' when computer wins.
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
        //Testing 'isComputerWin()' to yield 'false' when computer looses.
        Assert.assertFalse(RPSLSpock.isComputerWin("rock", "paper"));

    }
}