package com.example.testcodeexample;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DoorsGameTest {
    @Test
    public void oneDoor_NoPass() {
        DoorsGame doorsGame = new DoorsGame(1);

        assertArrayEquals(new boolean[]{false}, doorsGame.getDoorsState());
    }

    @Test
    public void oneDoor_OnePass() {
        DoorsGame doorsGame = new DoorsGame(1);
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true}, doorsGame.getDoorsState());
    }

    @Test
    public void twoDoor_noPass() {
        DoorsGame doorsGame = new DoorsGame(2);
        assertArrayEquals(new boolean[]{false, false}, doorsGame.getDoorsState());
    }

    @Test
    public void twoDoor_onePass() {
        DoorsGame doorsGame = new DoorsGame(2);
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, true}, doorsGame.getDoorsState());
    }

    @Test
    public void twoDoor_twoPass() {
        DoorsGame doorsGame = new DoorsGame(2);
        doorsGame.pass();
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, false}, doorsGame.getDoorsState());
    }

    @Test
    public void fourDoor_noPass() {
        DoorsGame doorsGame = new DoorsGame(4);
        assertArrayEquals(new boolean[]{false, false, false, false}, doorsGame.getDoorsState());
    }

    @Test
    public void fourDoor_onePass() {
        DoorsGame doorsGame = new DoorsGame(4);
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, true, true, true}, doorsGame.getDoorsState());
    }

    @Test
    public void fourDoor_twoPass() {
        DoorsGame doorsGame = new DoorsGame(4);
        doorsGame.pass();
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, false, true, false}, doorsGame.getDoorsState());
    }

    @Test
    public void fourDoor_threePass() {
        DoorsGame doorsGame = new DoorsGame(4);
        doorsGame.pass();
        doorsGame.pass();
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, false, false, false}, doorsGame.getDoorsState());
    }

    @Test
    public void fourDoor_fourPass() {
        DoorsGame doorsGame = new DoorsGame(4);
        doorsGame.pass();
        doorsGame.pass();
        doorsGame.pass();
        doorsGame.pass();
        assertArrayEquals(new boolean[]{true, false, false, true}, doorsGame.getDoorsState());
    }

}
