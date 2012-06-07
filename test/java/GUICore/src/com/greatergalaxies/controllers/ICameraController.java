package com.greatergalaxies.controllers;

/**
 * @author MagiSun
 * @since Jun 6, 2012
 * 
 * A proxy to the actual camera.
 */
public interface ICameraController {
    
    /**
     * Sets the current location of the camera focus.
     * @param x Horizontal position
     * @param y Vertical position
     */
    public void moveTo(int x, int y);
    
    /**
     * Moves the camera focus by 'x' and 'y'
     * @param x Horizontal movement ammount
     * @param y Vertical movement ammount
     */
    public void transformBy(int x, int y);
    
    /**
     * Adds a camera effect to apply to frame output.
     * @param effect The camera effect to add
     * 
     * TODO: Make an effect class so this actually does have arguments
     */
    public void addEffect();
}
