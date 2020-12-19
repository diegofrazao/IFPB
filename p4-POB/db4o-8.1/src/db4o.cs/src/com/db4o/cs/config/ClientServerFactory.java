/* This file is part of the db4o object database http://www.db4o.com

Copyright (C) 2004 - 2011  Versant Corporation http://www.versant.com

db4o is free software; you can redistribute it and/or modify it under
the terms of version 3 of the GNU General Public License as published
by the Free Software Foundation.

db4o is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program.  If not, see http://www.gnu.org/licenses/. */
package com.db4o.cs.config;

import com.db4o.*;
import com.db4o.ext.*;

/**
 * factory to open C/S server and client implementations.
 * @see com.db4o.cs.Db4oClientServer#openClient(ClientConfiguration, String, int, String, String)
 * @see com.db4o.cs.Db4oClientServer#openServer(ServerConfiguration, String, int)
 */
public interface ClientServerFactory {
	
	public ObjectContainer openClient(
			ClientConfiguration config,
			String hostName, 
			int port, 
			String user, 
			String password)
				throws 
					Db4oIOException, 
					OldFormatException,
					InvalidPasswordException ;
	
	
	public ObjectServer openServer(
			ServerConfiguration config,
			String databaseFileName, 
			int port) 
				throws 
					Db4oIOException,
					IncompatibleFileFormatException, 
					OldFormatException,
					DatabaseFileLockedException, 
					DatabaseReadOnlyException;

}
