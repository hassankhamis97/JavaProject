/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Profile.ProfileUI;
import Stack.NavigationStack;

/**
 *
 * @author Hassan Khamis
 */
public class Profile extends ProfileUI {

    public Profile(int playerID) {

//        Main.showNewScene(retScene(),"/Profile/pro.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Profile";
        nsObj.cssStyle = "/Profile/pro.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(this);
    }

    public Profile() {
//         Main.showNewScene(retScene(),"/Profile/pro.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Profile";
        nsObj.cssStyle = "/Profile/pro.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(this);

    }

}
