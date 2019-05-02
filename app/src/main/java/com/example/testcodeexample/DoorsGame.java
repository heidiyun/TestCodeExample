package com.example.testcodeexample;

class DoorsGame {
    private final boolean[] doorsState;
    private int doorCount;
    private int pass;

    public DoorsGame(int doorCount) {
        this.doorCount = doorCount;
        doorsState = new boolean[doorCount];
    }

    public boolean[] getDoorsState() {
        return doorsState;
    }

    private void changeDoorsState() {

        for (int doorIndex = pass - 1; doorIndex < doorCount; doorIndex += pass) {
            doorsState[doorIndex] = !doorsState[doorIndex];
        }

    }

//    private void changeDoorsState() {
//        if (doorCount == 2) {
//            if (pass == 2) {
//                doorsState[1] = !doorsState[1];
//            }
//            if (pass == 1) { // visit
//                doorsState[0] = !doorsState[0];
//                doorsState[1] = !doorsState[1];
//            }
//
//        } else if (doorCount == 4) {
//            if (pass == 1) {
//                doorsState[0] = !doorsState[0];
//                doorsState[1] = !doorsState[1];
//                doorsState[2] = !doorsState[2];
//                doorsState[3] = !doorsState[3];
//            }
//
//            if (pass == 2) {
//                doorsState[1] = !doorsState[1];
//                doorsState[3] = !doorsState[3];
//            }
//
//            if (pass == 3) {
//                doorsState[2] = !doorsState[2];
//            }
//
//            if (pass == 4) {
//                doorsState[3] = !doorsState[3];
//            }
//
//        } else {
//            if (pass == 1) {
//                doorsState[0] = !doorsState[0];
//
//            }
//        }
//
//    }

    public void pass() {
        pass++;
        changeDoorsState();
    }
}