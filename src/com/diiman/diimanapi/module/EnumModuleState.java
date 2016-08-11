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
 * @date Aug 11, 2016.
 */
public enum EnumModuleState {
	
	UNKNOWN(0), INITIALIZING(1), INITIALIZED(2), CLOSED(3);
	
	private final int state;
	
	private EnumModuleState(int state) {
		this.state = state;
	}
	
	public int getState() {
		return this.state;
	}
	
}
