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
package com.diiman.diimanapi;

/**
 * @author Daniel "Diiman" Robinson.
 * @date Aug 10, 2016 at 4:32:40 AM
 */
public final class DiimanAPI {
	
	/*
	 * String 'API_VERSION' is using Semantic Versioning 2.0.0.
	 * Refer to website: http://www.semver.org/
	 * for more information.
	 */
	protected static String API_VERSION = "0.1.0";
	
	/*
	 * String 'API_PRECEDENCE' is using Semantic Versioning 2.0.0.
	 * Refer to website: http://www.semver.org/
	 * for more information.
	 */
	protected static String API_PRECEDENCE = "pre-alpha";
	
	public static String getApiVersion() {
		return String.format("%s_%s", API_VERSION, API_PRECEDENCE);
	}
	
}
