package com.greatergalaxies.gui;

import java.awt.Component;

import javax.swing.JFrame;

import com.greatergalaxies.exception.NoComponentFoundException;

/**
 * @author MagiSun
 * @since Jun 6, 2012
 *
 * A class to be used for GUI testing.
 * 
 * TODO: Needs to be expanded. Doesn't provide enough functionality yet.
 */
public class TestFrame extends JFrame {
    
    public TestFrame(String name) {
	super("GreaterGalaxies GUI Test Frame");
	
	setName(name);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Returns the first component with a given name.
     * @param name The name of the component.
     * @return The first component found.
     * 
     * TODO: Returning null is a bad idea.
     */
    public Component getComponentByName(String name)
    	throws NoComponentFoundException {
	for(Component c : getComponents()) {
	    if(c.getName().equals(name)) {
		return c;
	    }
	}
	
	throw new NoComponentFoundException();
    }
}
