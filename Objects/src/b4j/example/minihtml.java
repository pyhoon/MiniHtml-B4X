package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class minihtml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.minihtml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.minihtml.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _mbuilder = null;
public int _mtabs = 0;
public boolean _mflat = false;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.minihtml __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="mBuilder.Initialize";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public String  _text(b4j.example.minihtml __ref,String _mtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "text", false))
	 {return ((String) Debug.delegate(ba, "text", new Object[] {_mtext}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Text (mText As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="mBuilder.Append(mText)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_mtext);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
public String  _doctype(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "doctype", false))
	 {return ((String) Debug.delegate(ba, "doctype", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub DocType";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="mBuilder.Append($\"<!DOCTYPE html>\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("<!DOCTYPE html>"));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public String  _language(b4j.example.minihtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "language", false))
	 {return ((String) Debug.delegate(ba, "language", new Object[] {_value}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Language (Value As String) 'As String";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="HtmlLang(Value)";
__ref._htmllang /*String*/ (null,_value);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public String  _comment(b4j.example.minihtml __ref,String _mcomment) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "comment", false))
	 {return ((String) Debug.delegate(ba, "comment", new Object[] {_mcomment}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Comment (mComment As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="mBuilder.Append($\"<!--${mComment}-->\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("<!--"+__c.SmartStringFormatter("",(Object)(_mcomment))+"-->"));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public String  _head(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "head", false))
	 {return ((String) Debug.delegate(ba, "head", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Head";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Tag(\"head\")";
__ref._tag /*String*/ (null,"head");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="TabsIncrease";
__ref._tabsincrease /*String*/ (null);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return "";
}
public String  _meta(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "meta", false))
	 {return ((String) Debug.delegate(ba, "meta", new Object[] {_mattributes}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Meta (mAttributes As List)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="TagB(\"meta\", mAttributes)";
__ref._tagb /*String*/ (null,"meta",_mattributes);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _attrs(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "attrs", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "attrs", new Object[] {_keys,_values}));}
anywheresoftware.b4a.objects.collections.List _list = null;
int _i = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Attrs (Keys As List, Values As List) As";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="List.Add(CreateMap(Keys.Get(i).As(String).ToLowe";
_list.Add((Object)(__c.createMap(new Object[] {(Object)((BA.ObjectToString(_keys.Get(_i))).toLowerCase()),_values.Get(_i)}).getObject()));
 }
};
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return null;
}
public String  _title(b4j.example.minihtml __ref,String _mtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "title", false))
	 {return ((String) Debug.delegate(ba, "title", new Object[] {_mtext}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Title (mText As String)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="TagA(\"title\", Attr(\"Text\", mText))";
__ref._taga /*String*/ (null,"title",__ref._attr /*anywheresoftware.b4a.objects.collections.List*/ (null,"Text",_mtext));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _headx(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "headx", false))
	 {return ((String) Debug.delegate(ba, "headx", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Headx";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Tagx(\"head\")";
__ref._tagx /*String*/ (null,"head");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _body(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "body", false))
	 {return ((String) Debug.delegate(ba, "body", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Body";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Tag(\"body\")";
__ref._tag /*String*/ (null,"body");
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="TabsIncrease";
__ref._tabsincrease /*String*/ (null);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return "";
}
public String  _h1(b4j.example.minihtml __ref,String _mtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "h1", false))
	 {return ((String) Debug.delegate(ba, "h1", new Object[] {_mtext}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub H1 (mText As String)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="TagA(\"h1\", Attr(\"Text\", mText))";
__ref._taga /*String*/ (null,"h1",__ref._attr /*anywheresoftware.b4a.objects.collections.List*/ (null,"Text",_mtext));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _img(b4j.example.minihtml __ref,String _msrc) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "img", false))
	 {return ((String) Debug.delegate(ba, "img", new Object[] {_msrc}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Img (mSrc As String)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="TagB(\"img\", Attr(\"src\", mSrc))";
__ref._tagb /*String*/ (null,"img",__ref._attr /*anywheresoftware.b4a.objects.collections.List*/ (null,"src",_msrc));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public String  _bodyx(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "bodyx", false))
	 {return ((String) Debug.delegate(ba, "bodyx", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Bodyx";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Tagx(\"body\")";
__ref._tagx /*String*/ (null,"body");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _htmlx(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "htmlx", false))
	 {return ((String) Debug.delegate(ba, "htmlx", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Htmlx";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="mBuilder.Append($\"</html>\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("</html>"));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public String  _gettostring(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "gettostring", false))
	 {return ((String) Debug.delegate(ba, "gettostring", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub getToString As String";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return mBuilder.ToString";
if (true) return __ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _addtab(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "addtab", false))
	 {return ((String) Debug.delegate(ba, "addtab", null));}
int _i = 0;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub AddTab";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If mFlat Then Return";
if (__ref._mflat /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="For i = 0 To mTabs - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mtabs /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="mBuilder.Append(TAB)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.TAB);
 }
};
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public String  _addtabs(b4j.example.minihtml __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "addtabs", false))
	 {return ((String) Debug.delegate(ba, "addtabs", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub AddTabs (Value As Int)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="For i = 0 To Value - 1";
{
final int step1 = 1;
final int limit1 = (int) (_value-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="mBuilder.Append(TAB)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.TAB);
 }
};
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _attr(b4j.example.minihtml __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "attr", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "attr", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Attr (Key As String, Value As String) A";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="List.Add(CreateMap(Key.ToLowerCase: Value))";
_list.Add((Object)(__c.createMap(new Object[] {(Object)(_key.toLowerCase()),(Object)(_value)}).getObject()));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return null;
}
public String  _tag(b4j.example.minihtml __ref,String _mname) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "tag", false))
	 {return ((String) Debug.delegate(ba, "tag", new Object[] {_mname}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Tag (mName As String)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="mBuilder.Append($\"<${mName.ToLowerCase}>\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("<"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+">"));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public String  _tabsincrease(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "tabsincrease", false))
	 {return ((String) Debug.delegate(ba, "tabsincrease", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub TabsIncrease";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="mTabs = mTabs + 1";
__ref._mtabs /*int*/  = (int) (__ref._mtabs /*int*/ +1);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public String  _body0(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "body0", false))
	 {return ((String) Debug.delegate(ba, "body0", null));}
boolean _flatsetting = false;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub Body0";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim FlatSetting As Boolean = mFlat";
_flatsetting = __ref._mflat /*boolean*/ ;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="mFlat = True";
__ref._mflat /*boolean*/  = __c.True;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Tag(\"body\")";
__ref._tag /*String*/ (null,"body");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="If Not(FlatSetting) Then mBuilder.Append(CRLF)";
if (__c.Not(_flatsetting)) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="mFlat = FlatSetting";
__ref._mflat /*boolean*/  = _flatsetting;
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="End Sub";
return "";
}
public String  _bodya(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "bodya", false))
	 {return ((String) Debug.delegate(ba, "bodya", new Object[] {_mattributes}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub BodyA (mAttributes As List)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="TagA(\"body\", mAttributes)";
__ref._taga /*String*/ (null,"body",_mattributes);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _taga(b4j.example.minihtml __ref,String _mname,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "taga", false))
	 {return ((String) Debug.delegate(ba, "taga", new Object[] {_mname,_mattributes}));}
String _mtext = "";
String _mattribute = "";
String _txt = "";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub TagA (mName As String, mAttributes As L";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim mText As String = TextAttribute(mAttributes)";
_mtext = __ref._textattribute /*String*/ (null,_mattributes);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim mAttribute As String = BuildAttributes(mAttri";
_mattribute = __ref._buildattributes /*String*/ (null,_mattributes);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}${mAtt";
_txt = ("<"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+""+__c.SmartStringFormatter("",(Object)(_mattribute))+">"+__c.SmartStringFormatter("",(Object)(_mtext))+"</"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+">");
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="mBuilder.Append(txt)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_txt);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return "";
}
public String  _bodyb(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "bodyb", false))
	 {return ((String) Debug.delegate(ba, "bodyb", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub BodyB";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Tag(\"body\")";
__ref._tag /*String*/ (null,"body");
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _tagx(b4j.example.minihtml __ref,String _mname) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "tagx", false))
	 {return ((String) Debug.delegate(ba, "tagx", new Object[] {_mname}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub Tagx (mName As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="TabsDecrease";
__ref._tabsdecrease /*String*/ (null);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="mBuilder.Append($\"</${mName.ToLowerCase}>\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("</"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+">"));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return "";
}
public String  _buildattribute(b4j.example.minihtml __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "buildattribute", false))
	 {return ((String) Debug.delegate(ba, "buildattribute", new Object[] {_key,_value}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub BuildAttribute (Key As String, Value As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return $\"${Key.ToLowerCase}=\"${Value}\"\"$";
if (true) return (""+__c.SmartStringFormatter("",(Object)(_key.toLowerCase()))+"=\""+__c.SmartStringFormatter("",(Object)(_value))+"\"");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _buildattributes(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "buildattributes", false))
	 {return ((String) Debug.delegate(ba, "buildattributes", new Object[] {_attributes}));}
String _strattribute = "";
anywheresoftware.b4a.objects.collections.Map _attribute = null;
String _key = "";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub BuildAttributes (Attributes As List) As";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim strAttribute As String";
_strattribute = "";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="For Each Attribute As Map In Attributes";
_attribute = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _attributes;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_attribute = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group2.Get(index2)));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="For Each Key As String In Attribute.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _attribute.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If Key.EqualsIgnoreCase(\"Text\") = False Then";
if (_key.equalsIgnoreCase("Text")==__c.False) { 
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="strAttribute = strAttribute & $\" ${Key.ToLower";
_strattribute = _strattribute+(" "+__c.SmartStringFormatter("",(Object)(_key.toLowerCase()))+"=\""+__c.SmartStringFormatter("",_attribute.Get((Object)(_key)))+"\"");
 };
 }
};
 }
};
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Return strAttribute";
if (true) return _strattribute;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Private mBuilder As StringBuilder";
_mbuilder = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Private mTabs As Int";
_mtabs = 0;
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Private mFlat As Boolean";
_mflat = false;
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="End Sub";
return "";
}
public String  _comment2(b4j.example.minihtml __ref,String _mcomment) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "comment2", false))
	 {return ((String) Debug.delegate(ba, "comment2", new Object[] {_mcomment}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Comment2 (mComment As String)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="mBuilder.Append($\"<!--${mComment}-->\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("<!--"+__c.SmartStringFormatter("",(Object)(_mcomment))+"-->"));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _divx(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "divx", false))
	 {return ((String) Debug.delegate(ba, "divx", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Divx";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="TabsDecrease";
__ref._tabsdecrease /*String*/ (null);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="mBuilder.Append($\"</div>\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("</div>"));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return "";
}
public String  _tabsdecrease(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "tabsdecrease", false))
	 {return ((String) Debug.delegate(ba, "tabsdecrease", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub TabsDecrease";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="mTabs = mTabs - 1";
__ref._mtabs /*int*/  = (int) (__ref._mtabs /*int*/ -1);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public String  _h1a(b4j.example.minihtml __ref,String _mname,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "h1a", false))
	 {return ((String) Debug.delegate(ba, "h1a", new Object[] {_mname,_mattributes}));}
String _txt = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub H1A (mName As String, mAttributes As Li";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}\"$";
_txt = ("<"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+"");
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="txt = txt & BuildAttributes(mAttributes)";
_txt = _txt+__ref._buildattributes /*String*/ (null,_mattributes);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="txt = txt & $\" />\"$";
_txt = _txt+(" />");
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="mBuilder.Append(txt)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_txt);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
return "";
}
public String  _h1b(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "h1b", false))
	 {return ((String) Debug.delegate(ba, "h1b", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub H1B";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Tag(\"h1\")";
__ref._tag /*String*/ (null,"h1");
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _h1x(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "h1x", false))
	 {return ((String) Debug.delegate(ba, "h1x", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub H1x";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Tagx(\"h1\")";
__ref._tagx /*String*/ (null,"h1");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _head0(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "head0", false))
	 {return ((String) Debug.delegate(ba, "head0", null));}
boolean _flatsetting = false;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Head0";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim FlatSetting As Boolean = mFlat";
_flatsetting = __ref._mflat /*boolean*/ ;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="mFlat = True";
__ref._mflat /*boolean*/  = __c.True;
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Tag(\"head\")";
__ref._tag /*String*/ (null,"head");
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="If Not(FlatSetting) Then mBuilder.Append(CRLF)";
if (__c.Not(_flatsetting)) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="mFlat = FlatSetting";
__ref._mflat /*boolean*/  = _flatsetting;
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="End Sub";
return "";
}
public String  _heada(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "heada", false))
	 {return ((String) Debug.delegate(ba, "heada", new Object[] {_mattributes}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub HeadA (mAttributes As List)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="TagA(\"head\", mAttributes)";
__ref._taga /*String*/ (null,"head",_mattributes);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public String  _htmllang(b4j.example.minihtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "htmllang", false))
	 {return ((String) Debug.delegate(ba, "htmllang", new Object[] {_value}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub HtmlLang (Value As String) 'As String";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="mBuilder.Append($\"<html lang=\"${Value}\">\"$)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(("<html lang=\""+__c.SmartStringFormatter("",(Object)(_value))+"\">"));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return "";
}
public String  _tagb(b4j.example.minihtml __ref,String _mname,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "tagb", false))
	 {return ((String) Debug.delegate(ba, "tagb", new Object[] {_mname,_mattributes}));}
String _txt = "";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub TagB (mName As String, mAttributes As L";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}\"$";
_txt = ("<"+__c.SmartStringFormatter("",(Object)(_mname.toLowerCase()))+"");
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="txt = txt & BuildAttributes(mAttributes)";
_txt = _txt+__ref._buildattributes /*String*/ (null,_mattributes);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="txt = txt & $\" />\"$";
_txt = _txt+(" />");
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="mBuilder.Append(txt)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_txt);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
if (__c.Not(__ref._mflat /*boolean*/ )) { 
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);};
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="End Sub";
return "";
}
public String  _img0(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "img0", false))
	 {return ((String) Debug.delegate(ba, "img0", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Img0";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Tag(\"img\")";
__ref._tag /*String*/ (null,"img");
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _kv(b4j.example.minihtml __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "kv", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "kv", new Object[] {_key,_value}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub KV (Key As String, Value As String) As";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return CreateMap(Key: Value)";
if (true) return __c.createMap(new Object[] {(Object)(_key),(Object)(_value)});
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _meta_default(b4j.example.minihtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "meta_default", false))
	 {return ((String) Debug.delegate(ba, "meta_default", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Meta_Default";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Meta(Array(KV(\"charset\", \"UTF-8\")))";
__ref._meta /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._kv /*anywheresoftware.b4a.objects.collections.Map*/ (null,"charset","UTF-8").getObject())}));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Meta(Array(KV(\"http-equiv\", \"X-UA-Compatible\"), K";
__ref._meta /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._kv /*anywheresoftware.b4a.objects.collections.Map*/ (null,"http-equiv","X-UA-Compatible").getObject()),(Object)(__ref._kv /*anywheresoftware.b4a.objects.collections.Map*/ (null,"content","IE=edge").getObject())}));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Meta(Array(KV(\"name\", \"viewport\"), KV(\"content\",";
__ref._meta /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._kv /*anywheresoftware.b4a.objects.collections.Map*/ (null,"name","viewport").getObject()),(Object)(__ref._kv /*anywheresoftware.b4a.objects.collections.Map*/ (null,"content","width=device-width, initial-scale=1.0").getObject())}));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public String  _setflat(b4j.example.minihtml __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "setflat", false))
	 {return ((String) Debug.delegate(ba, "setflat", new Object[] {_value}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub setFlat (Value As Boolean)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="mFlat = Value";
__ref._mflat /*boolean*/  = _value;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _settabs(b4j.example.minihtml __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "settabs", false))
	 {return ((String) Debug.delegate(ba, "settabs", new Object[] {_value}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub setTabs (Value As Int)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="mTabs = Value";
__ref._mtabs /*int*/  = _value;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public String  _textattribute(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "textattribute", false))
	 {return ((String) Debug.delegate(ba, "textattribute", new Object[] {_attributes}));}
anywheresoftware.b4a.objects.collections.Map _attribute = null;
String _key = "";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub TextAttribute (Attributes As List) As S";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="For Each Attribute As Map In Attributes";
_attribute = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attribute = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="For Each Key As String In Attribute.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _attribute.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="If Key.EqualsIgnoreCase(\"Text\") Then";
if (_key.equalsIgnoreCase("Text")) { 
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Return Attribute.Get(Key)";
if (true) return BA.ObjectToString(_attribute.Get((Object)(_key)));
 };
 }
};
 }
};
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return "";
}
public String  _text2(b4j.example.minihtml __ref,String _mtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "text2", false))
	 {return ((String) Debug.delegate(ba, "text2", new Object[] {_mtext}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Text2 (mText As String)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="AddTab";
__ref._addtab /*String*/ (null);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="mBuilder.Append(mText)";
__ref._mbuilder /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_mtext);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _titlea(b4j.example.minihtml __ref,anywheresoftware.b4a.objects.collections.List _mattributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="minihtml";
if (Debug.shouldDelegate(ba, "titlea", false))
	 {return ((String) Debug.delegate(ba, "titlea", new Object[] {_mattributes}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub TitleA (mAttributes As List)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="TagA(\"title\", mAttributes)";
__ref._taga /*String*/ (null,"title",_mattributes);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
}