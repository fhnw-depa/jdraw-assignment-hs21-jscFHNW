/*
 * Copyright (c) 2021 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved.
 */

package jdraw.framework;

/**
 * Listener interested in draw model changes.
 *
 * @author Dominik Gruntz &amp; Christoph Denzler
 * @version 2.5
 */
public interface DrawModelListener {

	/**
	 * Sent when a draw model has changed.
	 * 
	 * @param e draw model event
	 */
	void modelChanged(DrawModelEvent e);
}
