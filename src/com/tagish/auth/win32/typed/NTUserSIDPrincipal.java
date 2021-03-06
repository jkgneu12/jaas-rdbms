// $Id: NTUserSIDPrincipal.java,v 1.3 2003/02/17 20:13:30 andy Exp $
/*
 * NTUserPrincipal.java
 *
 * Created on January 29, 2003, 3:43 PM
 */

package com.tagish.auth.win32.typed;

import com.tagish.auth.win32.*;

/**
 * A NTUserPrincipal is a <code>Class</code> level Principal that represents a
 * NT User's SID.
 *
 * @author Jerry L Smith II, <A HREF="mailto:jsmith@sedonaesolutions.com">jsmith@sedonaesolutions.com</A>
 * @version 1.0.3
 */
public class NTUserSIDPrincipal extends NTPrincipal {

	/** Creates a new instance of NTUserPrincipal */
	public NTUserSIDPrincipal(String name) {
		super(name, NTPrincipal.USER);
	}

}
