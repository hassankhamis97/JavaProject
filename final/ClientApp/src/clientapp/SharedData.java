/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Stack.NavigationStack;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hassa
 */
public class SharedData {

    public static int playerID;
    public static Connection con;
    public static Socket client;
    public static int Coins;
    
    public static List<NavigationStack> nsList = new ArrayList<>();
//        static DataInputStream dis;
//        static DataOutputStream dos;
}
