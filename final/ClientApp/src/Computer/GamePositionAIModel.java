/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author hassan
 */
public class GamePositionAIModel {

    public String PositionTxt = "";
    public int PositionIndex;

    public GamePositionAIModel() {
    }

    public GamePositionAIModel(String PositionTxt, int PositionIndex) {
        this.PositionTxt = PositionTxt;
        this.PositionIndex = PositionIndex;
    }

    public void setPositionIndex(int PositionIndex) {
        this.PositionIndex = PositionIndex;
    }

    public void setPositionTxt(String PositionTxt) {
        this.PositionTxt = PositionTxt;
    }
}
