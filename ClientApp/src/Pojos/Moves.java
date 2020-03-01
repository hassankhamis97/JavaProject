/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

import java.time.LocalTime;

/**
 *
 * @author Hassan Khamis
 */
public class Moves {

    public int playerID;
    public long delayTimeSec;
    public String moveType;
    public String blockNo;

    public String getMoveType() {
        return moveType;
    }

}
