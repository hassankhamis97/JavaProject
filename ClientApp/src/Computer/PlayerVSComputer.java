/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;

/**
 *
 * @author hassan
 */
public class PlayerVSComputer {
    Scene gameStartScene;
    List<GamePositionAIModel> positionLst;
    boolean isWaitAIResponse = false;
 
    public  PlayerVSComputer()
    {
//        positionLst = new ArrayList<>();
//          GameBase gb = new GameBase();
//          gameStartScene = gb.getScene();
//          
//          for (int i = 0; i < 9; i++) {
//              GamePositionAIModel positionAIObj = new GamePositionAIModel();
//              positionAIObj.setPositionIndex(i);
//            positionLst.add(positionAIObj);
//        }
//          
//                gb.button.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                         this.isWaitAIResponse = true;
//                         gb.button.setText("X");
//                         gb.button.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 0) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }    
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }  
//                    }
//                 
//                });
//                gb.button0.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                        this.isWaitAIResponse = true;
//                         gb.button0.setText("X");
//                         gb.button0.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 1) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }
//                    }                       
//                });
//                gb.button1.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                        this.isWaitAIResponse = true;
//                        gb.button1.setText("X");
//                         gb.button1.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 2) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }
//                    }
//     
//                        
//                });
//                gb.button2.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                            this.isWaitAIResponse = true;
//                         gb.button2.setText("X");
//                         gb.button2.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 3) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }   
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }
//                    }
//                });
//                gb.button3.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                           this.isWaitAIResponse = true;
//                         gb.button3.setText("X");
//                         gb.button3.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 4) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           } 
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }   
//                    }
//                });
//                gb.button4.setOnAction(t -> {    
//                    if (!isWaitAIResponse) {
//                         this.isWaitAIResponse = true;
//                         gb.button4.setText("X");
//                         gb.button4.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 5) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }  
//                    }
//                });
//                gb.button5.setOnAction(t -> {   
//                    if (!isWaitAIResponse) {
//                         this.isWaitAIResponse = true;
//                         gb.button5.setText("X");
//                         gb.button5.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 6) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }
//                    }
//                });
//                gb.button6.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                      this.isWaitAIResponse = true;
//                         gb.button6.setText("X");
//                         gb.button6.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 7) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }   
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }   
//                    }
//                });
//                gb.button7.setOnAction(t -> {
//                    if (!isWaitAIResponse) {
//                       this.isWaitAIResponse = true;
//                         gb.button7.setText("X");
//                         gb.button7.setDisable(true);
//                         
//                         for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == 8) {
//                                 item.PositionTxt = "X";
//                                 break;                             
//                             }  
//                           }
//                       int computerSelectedIndex = this.prepareGamePositionToSendToAI();
//                       
//                       for (GamePositionAIModel item : positionLst) {
//                             
//                             if (item.PositionIndex == computerSelectedIndex) {
//                                 item.PositionTxt = "O";
//                                 this.setPositionTxtByComputer(computerSelectedIndex,gb);
//                                 this.isWaitAIResponse = false;
//                                 break;                             
//                             }  
//                           }   
//                    }
//                });
//            Main.showNewScene(gameStartScene);
//    }
//    
//       private int prepareGamePositionToSendToAI()
//        {
//            int index = -1;
//            /// call AI Method   
//            
//            return index;
//        }      
//       private void setPositionTxtByComputer(int computerSelectedIndex,GameBase gb)
//       {
//           switch(computerSelectedIndex)
//           {
//               case 0:
//                   gb.button.setText("O");  
//                   gb.button.setDisable(true);
//                   break; 
//               case 1: 
//                   gb.button0.setText("O");  
//                   gb.button0.setDisable(true);
//                   break;
//               case 2: 
//                   gb.button1.setText("O");  
//                   gb.button1.setDisable(true);
//                   break;
//               case 3: 
//                   gb.button2.setText("O");  
//                   gb.button2.setDisable(true);
//                   break;
//               case 4:
//                   gb.button3.setText("O");  
//                   gb.button3.setDisable(true);
//                   break;
//               case 5: 
//                   gb.button4.setText("O");  
//                   gb.button4.setDisable(true);
//                   break;
//               case 6: 
//                   gb.button5.setText("O");  
//                   gb.button5.setDisable(true);
//                   break;
//               case 7:
//                   gb.button6.setText("O");  
//                   gb.button6.setDisable(true);
//                   break;  
//               case 8: 
//                   gb.button7.setText("O");  
//                   gb.button7.setDisable(true);
//                   break;
//           }
       }
}