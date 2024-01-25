package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,11);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="GenerateHtml";
Debug.ShouldStop(2048);
_generatehtml();
 BA.debugLineNum = 13;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatehtml() throws Exception{
try {
		Debug.PushSubsStack("GenerateHtml (main) ","main",0,main.ba,main.mostCurrent,16);
if (RapidSub.canDelegate("generatehtml")) { return b4j.example.main.remoteMe.runUserSub(false, "main","generatehtml");}
RemoteObject _html = RemoteObject.declareNull("b4j.example.minihtml");
RemoteObject _content = RemoteObject.createImmutable("");
 BA.debugLineNum = 16;BA.debugLine="Sub GenerateHtml";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Dim html As MiniHtml";
Debug.ShouldStop(65536);
_html = RemoteObject.createNew ("b4j.example.minihtml");Debug.locals.put("html", _html);
 BA.debugLineNum = 18;BA.debugLine="html.Initialize";
Debug.ShouldStop(131072);
_html.runClassMethod (b4j.example.minihtml.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 20;BA.debugLine="html.Text(\"#macro( header )\")";
Debug.ShouldStop(524288);
_html.runClassMethod (b4j.example.minihtml.class, "_text" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("#macro( header )")));
 BA.debugLineNum = 21;BA.debugLine="html.DocType";
Debug.ShouldStop(1048576);
_html.runClassMethod (b4j.example.minihtml.class, "_doctype" /*RemoteObject*/ );
 BA.debugLineNum = 22;BA.debugLine="html.Language(\"en\")";
Debug.ShouldStop(2097152);
_html.runClassMethod (b4j.example.minihtml.class, "_language" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("en")));
 BA.debugLineNum = 23;BA.debugLine="html.Comment(\" velocity.vm \")";
Debug.ShouldStop(4194304);
_html.runClassMethod (b4j.example.minihtml.class, "_comment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(" velocity.vm ")));
 BA.debugLineNum = 24;BA.debugLine="html.Head";
Debug.ShouldStop(8388608);
_html.runClassMethod (b4j.example.minihtml.class, "_head" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="html.Meta(html.Attrs(Array(\"http-equiv\", \"content";
Debug.ShouldStop(33554432);
_html.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(_html.runClassMethod (b4j.example.minihtml.class, "_attrs" /*RemoteObject*/ ,(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("http-equiv")),(RemoteObject.createImmutable("content"))})))),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("content-type")),(RemoteObject.createImmutable("text/html; charset=utf-8"))})))))));
 BA.debugLineNum = 27;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
Debug.ShouldStop(67108864);
_html.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(_html.runClassMethod (b4j.example.minihtml.class, "_attrs" /*RemoteObject*/ ,(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("name")),(RemoteObject.createImmutable("content"))})))),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("viewport")),(RemoteObject.createImmutable("width=device-width, initial-scale=1"))})))))));
 BA.debugLineNum = 28;BA.debugLine="html.Text(\"$csrf\")";
Debug.ShouldStop(134217728);
_html.runClassMethod (b4j.example.minihtml.class, "_text" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("$csrf")));
 BA.debugLineNum = 29;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
Debug.ShouldStop(268435456);
_html.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(_html.runClassMethod (b4j.example.minihtml.class, "_attrs" /*RemoteObject*/ ,(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("name")),(RemoteObject.createImmutable("content"))})))),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("description")),(RemoteObject.createImmutable(""))})))))));
 BA.debugLineNum = 30;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
Debug.ShouldStop(536870912);
_html.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(_html.runClassMethod (b4j.example.minihtml.class, "_attrs" /*RemoteObject*/ ,(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("name")),(RemoteObject.createImmutable("content"))})))),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("author")),(RemoteObject.createImmutable(""))})))))));
 BA.debugLineNum = 31;BA.debugLine="html.Title(\"$APP_TITLE\")";
Debug.ShouldStop(1073741824);
_html.runClassMethod (b4j.example.minihtml.class, "_title" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("$APP_TITLE")));
 BA.debugLineNum = 32;BA.debugLine="html.Headx";
Debug.ShouldStop(-2147483648);
_html.runClassMethod (b4j.example.minihtml.class, "_headx" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="html.Body";
Debug.ShouldStop(1);
_html.runClassMethod (b4j.example.minihtml.class, "_body" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="html.H1(\"Hello, World!\")";
Debug.ShouldStop(4);
_html.runClassMethod (b4j.example.minihtml.class, "_h1" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Hello, World!")));
 BA.debugLineNum = 36;BA.debugLine="html.Img(\"/img/hello.png\")";
Debug.ShouldStop(8);
_html.runClassMethod (b4j.example.minihtml.class, "_img" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("/img/hello.png")));
 BA.debugLineNum = 38;BA.debugLine="html.Bodyx";
Debug.ShouldStop(32);
_html.runClassMethod (b4j.example.minihtml.class, "_bodyx" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="html.Htmlx";
Debug.ShouldStop(64);
_html.runClassMethod (b4j.example.minihtml.class, "_htmlx" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="Dim content As String = html.ToString";
Debug.ShouldStop(128);
_content = _html.runClassMethod (b4j.example.minihtml.class, "_gettostring" /*RemoteObject*/ );Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 41;BA.debugLine="Log(content)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("LogImpl","64522009",_content,0);
 BA.debugLineNum = 42;BA.debugLine="File.WriteString(File.DirApp, \"velocity.vm\", cont";
Debug.ShouldStop(512);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("velocity.vm")),(Object)(_content));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
minihtml.myClass = BA.getDeviceClass ("b4j.example.minihtml");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}