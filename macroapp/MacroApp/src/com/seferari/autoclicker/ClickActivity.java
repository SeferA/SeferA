package com.seferari.autoclicker;

public class ClickActivity {
 
    /**
     * Check the key press 
     */
    private boolean isPressed = false;

    /**
     * Counts the amount of key presses
     */
    public int counterKeyPress = 0; 

    /**
     * Max cps amount entered by the user
     */
    public int maxcps = 15;   //todo user commandsystem

    /**
     * Counts the clicks made by the autoclicker
     */
    public int autoClicks = 0;


    /**
     * Resets the autoclicker clicks
     */
    public void resetMacroClicks(){ autoClicks = 0; }

    /**
     * @return resets when autoClicks reaches maxcps
     */
    public boolean checkClicks() {
        if (autoClicks == maxcps){
            resetMacroClicks();
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return calculates neccessary cps delay
     */
    public long getCPSDelay() {
        return 1000/maxcps; 
    }

    /**
     * @return maxcps user-entered maxcps
     */
    public int getCPS() {
        return maxcps;
    }

    /**
     * Increases counterKeyPress when button click
     * Autoclicker opens if counterKeyPress is odd number closes if even number
     */
    public void addKeyPress() {
        counterKeyPress++;
         if (counterKeyPress %2 == 0){
            isPressed = false;
         }else{
            isPressed = true;
        }
     }
 
    /**
     * @return isPressed
     */
    public boolean isPressed() {
        return isPressed;
    }
    
}
