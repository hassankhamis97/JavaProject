/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import java.sql.Time;
import java.time.LocalTime;

/**
 *
 * @author hassan
 */
class Moves {

    private String playerID;
    private String moveType;
    private String blockNo;

    public Moves(String id, String type, String number) {
        playerID = id;
        //delayTimeSec = delay;
        moveType = type;
        blockNo = number;
    }

    public String getMoveType() {
        return moveType;
    }

    public String getBlockNumber() {
        return blockNo;
    }
}
