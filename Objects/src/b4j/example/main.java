package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="GenerateHtml";
_generatehtml();
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="End Sub";
return "";
}
public static String  _generatehtml() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "generatehtml", false))
	 {return ((String) Debug.delegate(ba, "generatehtml", null));}
b4j.example.minihtml _html = null;
String _content = "";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub GenerateHtml";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim html As MiniHtml";
_html = new b4j.example.minihtml();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="html.Initialize";
_html._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="html.Text(\"#macro( header )\")";
_html._text /*String*/ (null,"#macro( header )");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="html.DocType";
_html._doctype /*String*/ (null);
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="html.Language(\"en\")";
_html._language /*String*/ (null,"en");
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="html.Comment(\" velocity.vm \")";
_html._comment /*String*/ (null," velocity.vm ");
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="html.Head";
_html._head /*String*/ (null);
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="html.Meta(html.Attrs(Array(\"http-equiv\", \"content";
_html._meta /*String*/ (null,_html._attrs /*anywheresoftware.b4a.objects.collections.List*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("http-equiv"),(Object)("content")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("content-type"),(Object)("text/html; charset=utf-8")})));
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
_html._meta /*String*/ (null,_html._attrs /*anywheresoftware.b4a.objects.collections.List*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("name"),(Object)("content")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("viewport"),(Object)("width=device-width, initial-scale=1")})));
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="html.Text(\"$csrf\")";
_html._text /*String*/ (null,"$csrf");
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
_html._meta /*String*/ (null,_html._attrs /*anywheresoftware.b4a.objects.collections.List*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("name"),(Object)("content")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("description"),(Object)("")})));
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="html.Meta(html.Attrs(Array(\"name\", \"content\"), Ar";
_html._meta /*String*/ (null,_html._attrs /*anywheresoftware.b4a.objects.collections.List*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("name"),(Object)("content")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("author"),(Object)("")})));
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="html.Title(\"$APP_TITLE\")";
_html._title /*String*/ (null,"$APP_TITLE");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="html.Headx";
_html._headx /*String*/ (null);
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="html.Body";
_html._body /*String*/ (null);
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="html.H1(\"Hello, World!\")";
_html._h1 /*String*/ (null,"Hello, World!");
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="html.Img(\"/img/hello.png\")";
_html._img /*String*/ (null,"/img/hello.png");
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="html.Bodyx";
_html._bodyx /*String*/ (null);
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="html.Htmlx";
_html._htmlx /*String*/ (null);
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="Dim content As String = html.ToString";
_content = _html._gettostring /*String*/ (null);
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="Log(content)";
anywheresoftware.b4a.keywords.Common.LogImpl("64522009",_content,0);
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="File.WriteString(File.DirApp, \"velocity.vm\", cont";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"velocity.vm",_content);
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="End Sub";
return "";
}
}