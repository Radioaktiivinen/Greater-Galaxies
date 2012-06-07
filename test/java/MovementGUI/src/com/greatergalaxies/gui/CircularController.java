package com.greatergalaxies.gui;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import com.greatergalaxies.controllers.ICameraController;

/**
 * @author MagiSun
 * @since Jun 6, 2012
 * 
 * A GuiObject that allows for movement around the map.
 */
public class CircularController extends GuiObject {
    
    /**
     * The central point, used for speed and rotational checks.
     */
    private Point currentPoint;
    
    /**
     * Controls when this controller is active.
     */
    private AtomicBoolean isActive = new AtomicBoolean(false);
    
    /**
     * The current camera controller.
     */
    private ICameraController controller;
    
    public CircularController() {
	setName("MouseController");
	setVisible(false);
    }
    
    public void setCameraController(ICameraController controller) {
	this.controller = controller;
    }
    
    protected void setCurrentPoint(Point p) {
	this.currentPoint = p;
    }
    
    protected void setCurrentPoint(int x, int y) {
	setCurrentPoint(new Point(x, y));
    }
    
    private class InternalMouseEventListener
    	extends MouseAdapter {

	public void mousePressed(MouseEvent evt) {
	    /// Not supported.
	    if(evt.getButton() == MouseEvent.NOBUTTON) {
		return;
	    }
	    
	    /// What we want
	    if(evt.getButton() == MouseEvent.BUTTON2) {
		isActive.set(true);
	    }
	}

	public void mouseReleased(MouseEvent evt) {
	    isActive.set(false);
	    setVisible(false);
	    currentPoint = null;
	}
	
    }
    
}
