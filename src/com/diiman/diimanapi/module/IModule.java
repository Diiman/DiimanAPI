/**
 * An API that makes it easier to setup a modular based Minecraft modded client.
 *  Copyright (C) 2016  Daniel Robinson
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  You can contact me (Daniel Robinson) through my email:
 *  <diiman@diiman.com>.
 */
package com.diiman.diimanapi.module;

/**
 * @author Daniel "Diiman" Robinson
 * @date Aug 10, 2016 at 4:51:03 AM
 */
public interface IModule extends Comparable<IModule>{
	
	/**
	 * Gets the module alias(es).
	 * 
	 * @return all module aliases
	 */
	String[] getModuleAliases();
	
	/**
	 * Gets the module's description
	 * 
	 * @return the module's description
	 */
	String getModuleDescription();
	
	/**
	 * Gets the module type
	 * 
	 * @return the module type
	 */
	EnumModuleType getModuleType();
	
	/**
	 * Gets the module array colo(u)r
	 * 
	 * @return the module array color
	 */
	int getModuleArrayColor();
	
	
	
}
