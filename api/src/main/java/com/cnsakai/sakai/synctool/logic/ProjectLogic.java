package com.cnsakai.sakai.synctool.logic;

import java.util.List;

import com.cnsakai.sakai.synctool.model.Item;

/**
 * An example logic interface
 * 
 * @author Mike Jennings (mike_jennings@unc.edu)
 *
 */
public interface ProjectLogic {

	/**
	 * Get a list of Items
	 * @return
	 */
	public List<Item> getItems();
}
