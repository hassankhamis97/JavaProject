/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import OnlineWaiting.OnlineWaitUI;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hassan Khamis
 */
public class OnlineWaitConnect4 extends OnlineWaitUI{

    public OnlineWaitConnect4() {
        Main.showNewScene(getScene(),"/OnlineWaiting/on.css");
        try {
            DataInputStream dis = new DataInputStream(SharedData.client.getInputStream());
            String msg = dis.readUTF();
//            if(msg.equals("startGame-tic"))
//            {
//                new GameStart(SharedData.client);
//            }
//            else 
             if(msg.equals("startGame-connect"))
            {
                new Connect4New.ConnectFour(SharedData.client);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(OnlineWaitConnect4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
