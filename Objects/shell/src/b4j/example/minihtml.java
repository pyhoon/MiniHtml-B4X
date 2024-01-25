
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class minihtml {
    public static RemoteObject myClass;
	public minihtml() {
	}
    public static PCBA staticBA = new PCBA(null, minihtml.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbuilder = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _mtabs = RemoteObject.createImmutable(0);
public static RemoteObject _mflat = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"mBuilder",_ref.getField(false, "_mbuilder"),"mFlat",_ref.getField(false, "_mflat"),"mTabs",_ref.getField(false, "_mtabs")};
}
}