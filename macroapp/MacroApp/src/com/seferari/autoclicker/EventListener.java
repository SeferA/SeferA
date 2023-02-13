package com.seferari.autoclicker;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class EventListener implements NativeKeyListener {

    /**
     * ThreadManager class
     */
    private ThreadManager thManager = new ThreadManager(false);

    /**
     * ClickActivity class
     */
    private ClickActivity activity = new ClickActivity();
  
    /**
     * EventListener constructor 
     * Creates the GUI
     */
    EventListener() {  
      try {
        GlobalScreen.registerNativeHook();
      }
      catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
      }
      GlobalScreen.addNativeKeyListener(this);

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
      if (e.getKeyCode() == NativeKeyEvent.VC_H) {
            activity.addKeyPress();
            if (activity.isPressed()){
                thManager.start();
            }else{
                thManager.stop();
            }        
        }
    }  
} 
