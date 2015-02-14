package org.openntf.eclipse.xpdesigner.core.xspcomponents;

import com.ibm.xsp.library.XspLibrary;

public class XSPLibrary {
	private final String m_ClassName;
	private final String m_PluginID;
	private final XspLibrary m_Lib;
	
	public XSPLibrary(String pluginID, String className,XspLibrary lib) {
		m_ClassName = className;
		m_PluginID = pluginID;
		m_Lib = lib;
	}

	public String getClassName() {
		return m_ClassName;
	}

	public String getPluginID() {
		return m_PluginID;
	}
	
	public XspLibrary getLib() {
		return m_Lib;
	}
	
}
