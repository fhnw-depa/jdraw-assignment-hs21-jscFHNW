/*
 * Copyright (c) 2021 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved.
 */

package jdraw.framework;

/**
 * Listener interested in figure changes.
 * 
 * @see FigureEvent
 *
 * @author Dominik Gruntz &amp; Christoph Denzler
 * @version 2.5
 */
public interface FigureListener {

	/**
	 * Sent when a figure has changed.
	 * 
	 * @param e figure event
	 */
	void figureChanged(FigureEvent e);
}
