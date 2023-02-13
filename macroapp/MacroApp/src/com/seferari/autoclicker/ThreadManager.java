package com.seferari.autoclicker;

import java.awt.*;
import java.awt.event.*;

public class ThreadManager implements Runnable{
     
    /**
     * Thread variable
     */
    private Thread worker;

    /**
     * Checks the thread runnable status
     */
    private boolean isRun;


    /**
     * ClickActivity Class
     */
    private ClickActivity activity = new ClickActivity(); 


    /**
     * @param isRun Checks the thread's running status
     */
    public ThreadManager(boolean isRun) {
          this.isRun = isRun;
    }


    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     * Auto click thread
     */
    @Override
    public void run() {
        setRun(true);
        while (isRun()) {
            Robot bot = null;

            try {
                bot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            
             if (!activity.checkClicks()){  
                bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                activity.autoClicks++;
               try {
                Thread.sleep(activity.getCPSDelay());
            } catch (InterruptedException e) {       
                e.printStackTrace();
            }  
          }
        }
    }

    /**
     * @return runnable status
     */
    public boolean isRun() {
        return isRun;
    }


    /**
     * @param isRun runnable status
     * Sets the thread's running state
     */
    public void setRun(boolean isRun) {
        this.isRun = isRun;
    }

    /**
     * Starts the auto click thread
     */
    public void start() {
        worker = new Thread(this);
        worker.start();
    }
  
    /**
     * Stops the auto click thread
     */
    public void stop() {
        setRun(false);
        
    }
    
}