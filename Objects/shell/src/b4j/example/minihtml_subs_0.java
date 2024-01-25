package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class minihtml_subs_0 {


public static RemoteObject  _addtab(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddTab (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("addtab")) { return __ref.runUserSub(false, "minihtml","addtab", __ref);}
int _i = 0;
 BA.debugLineNum = 21;BA.debugLine="Public Sub AddTab";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="If mFlat Then Return";
Debug.ShouldStop(2097152);
if (__ref.getField(true,"_mflat" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 23;BA.debugLine="For i = 0 To mTabs - 1";
Debug.ShouldStop(4194304);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mtabs" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 24;BA.debugLine="mBuilder.Append(TAB)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"TAB")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtabs(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTabs (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addtabs")) { return __ref.runUserSub(false, "minihtml","addtabs", __ref, _value);}
int _i = 0;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 28;BA.debugLine="Public Sub AddTabs (Value As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="For i = 0 To Value - 1";
Debug.ShouldStop(268435456);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 30;BA.debugLine="mBuilder.Append(TAB)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"TAB")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _attr(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Attr (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("attr")) { return __ref.runUserSub(false, "minihtml","attr", __ref, _key, _value);}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 69;BA.debugLine="Public Sub Attr (Key As String, Value As String) A";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim List As List";
Debug.ShouldStop(32);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List", _list);
 BA.debugLineNum = 71;BA.debugLine="List.Initialize";
Debug.ShouldStop(64);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="List.Add(CreateMap(Key.ToLowerCase: Value))";
Debug.ShouldStop(128);
_list.runVoidMethod ("Add",(Object)((minihtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(_key.runMethod(true,"toLowerCase")),(_value)})).getObject())));
 BA.debugLineNum = 73;BA.debugLine="Return List";
Debug.ShouldStop(256);
if (true) return _list;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _attrs(RemoteObject __ref,RemoteObject _keys,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("Attrs (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("attrs")) { return __ref.runUserSub(false, "minihtml","attrs", __ref, _keys, _values);}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("Keys", _keys);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 76;BA.debugLine="Public Sub Attrs (Keys As List, Values As List) As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Dim List As List";
Debug.ShouldStop(4096);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List", _list);
 BA.debugLineNum = 78;BA.debugLine="List.Initialize";
Debug.ShouldStop(8192);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="For i = 0 To Keys.Size - 1";
Debug.ShouldStop(16384);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_keys.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="List.Add(CreateMap(Keys.Get(i).As(String).ToLowe";
Debug.ShouldStop(32768);
_list.runVoidMethod ("Add",(Object)((minihtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {((BA.ObjectToString(_keys.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))).runMethod(true,"toLowerCase")),_values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))})).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="Return List";
Debug.ShouldStop(131072);
if (true) return _list;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _body(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Body (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("body")) { return __ref.runUserSub(false, "minihtml","body", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Public Sub Body";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Tag(\"body\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("body")));
 BA.debugLineNum = 189;BA.debugLine="TabsIncrease";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.minihtml.class, "_tabsincrease" /*RemoteObject*/ );
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _body0(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Body0 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("body0")) { return __ref.runUserSub(false, "minihtml","body0", __ref);}
RemoteObject _flatsetting = RemoteObject.createImmutable(false);
 BA.debugLineNum = 202;BA.debugLine="Public Sub Body0";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Dim FlatSetting As Boolean = mFlat";
Debug.ShouldStop(1024);
_flatsetting = __ref.getField(true,"_mflat" /*RemoteObject*/ );Debug.locals.put("FlatSetting", _flatsetting);Debug.locals.put("FlatSetting", _flatsetting);
 BA.debugLineNum = 204;BA.debugLine="mFlat = True";
Debug.ShouldStop(2048);
__ref.setField ("_mflat" /*RemoteObject*/ ,minihtml.__c.getField(true,"True"));
 BA.debugLineNum = 205;BA.debugLine="Tag(\"body\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("body")));
 BA.debugLineNum = 206;BA.debugLine="If Not(FlatSetting) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(8192);
if (minihtml.__c.runMethod(true,"Not",(Object)(_flatsetting)).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 207;BA.debugLine="mFlat = FlatSetting";
Debug.ShouldStop(16384);
__ref.setField ("_mflat" /*RemoteObject*/ ,_flatsetting);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bodya(RemoteObject __ref,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("BodyA (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("bodya")) { return __ref.runUserSub(false, "minihtml","bodya", __ref, _mattributes);}
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 192;BA.debugLine="Public Sub BodyA (mAttributes As List)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="TagA(\"body\", mAttributes)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.minihtml.class, "_taga" /*RemoteObject*/ ,(Object)(BA.ObjectToString("body")),(Object)(_mattributes));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bodyb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BodyB (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("bodyb")) { return __ref.runUserSub(false, "minihtml","bodyb", __ref);}
 BA.debugLineNum = 197;BA.debugLine="Public Sub BodyB";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Tag(\"body\")";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("body")));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bodyx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Bodyx (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("bodyx")) { return __ref.runUserSub(false, "minihtml","bodyx", __ref);}
 BA.debugLineNum = 210;BA.debugLine="Public Sub Bodyx";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Tagx(\"body\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.minihtml.class, "_tagx" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("body")));
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildattribute(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("BuildAttribute (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("buildattribute")) { return __ref.runUserSub(false, "minihtml","buildattribute", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 85;BA.debugLine="Public Sub BuildAttribute (Key As String, Value As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Return $\"${Key.ToLowerCase}=\"${Value}\"\"$";
Debug.ShouldStop(2097152);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("=\""),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("\"")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildattributes(RemoteObject __ref,RemoteObject _attributes) throws Exception{
try {
		Debug.PushSubsStack("BuildAttributes (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("buildattributes")) { return __ref.runUserSub(false, "minihtml","buildattributes", __ref, _attributes);}
RemoteObject _strattribute = RemoteObject.createImmutable("");
RemoteObject _attribute = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Attributes", _attributes);
 BA.debugLineNum = 89;BA.debugLine="Public Sub BuildAttributes (Attributes As List) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim strAttribute As String";
Debug.ShouldStop(33554432);
_strattribute = RemoteObject.createImmutable("");Debug.locals.put("strAttribute", _strattribute);
 BA.debugLineNum = 91;BA.debugLine="For Each Attribute As Map In Attributes";
Debug.ShouldStop(67108864);
_attribute = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = _attributes;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_attribute = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));Debug.locals.put("Attribute", _attribute);
Debug.locals.put("Attribute", _attribute);
 BA.debugLineNum = 92;BA.debugLine="For Each Key As String In Attribute.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group3 = _attribute.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("Key", _key);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 93;BA.debugLine="If Key.EqualsIgnoreCase(\"Text\") = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_key.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("Text"))),minihtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 94;BA.debugLine="strAttribute = strAttribute & $\" ${Key.ToLower";
Debug.ShouldStop(536870912);
_strattribute = RemoteObject.concat(_strattribute,(RemoteObject.concat(RemoteObject.createImmutable(" "),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("=\""),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_attribute.runMethod(false,"Get",(Object)((_key))))),RemoteObject.createImmutable("\""))));Debug.locals.put("strAttribute", _strattribute);
 };
 }
}Debug.locals.put("Key", _key);
;
 }
}Debug.locals.put("Attribute", _attribute);
;
 BA.debugLineNum = 98;BA.debugLine="Return strAttribute";
Debug.ShouldStop(2);
if (true) return _strattribute;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mBuilder As StringBuilder";
minihtml._mbuilder = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_mbuilder",minihtml._mbuilder);
 //BA.debugLineNum = 3;BA.debugLine="Private mTabs As Int";
minihtml._mtabs = RemoteObject.createImmutable(0);__ref.setField("_mtabs",minihtml._mtabs);
 //BA.debugLineNum = 4;BA.debugLine="Private mFlat As Boolean";
minihtml._mflat = RemoteObject.createImmutable(false);__ref.setField("_mflat",minihtml._mflat);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _comment(RemoteObject __ref,RemoteObject _mcomment) throws Exception{
try {
		Debug.PushSubsStack("Comment (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("comment")) { return __ref.runUserSub(false, "minihtml","comment", __ref, _mcomment);}
Debug.locals.put("mComment", _mcomment);
 BA.debugLineNum = 54;BA.debugLine="Public Sub Comment (mComment As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="mBuilder.Append($\"<!--${mComment}-->\"$)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<!--"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mcomment))),RemoteObject.createImmutable("-->")))));
 BA.debugLineNum = 56;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(8388608);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comment2(RemoteObject __ref,RemoteObject _mcomment) throws Exception{
try {
		Debug.PushSubsStack("Comment2 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("comment2")) { return __ref.runUserSub(false, "minihtml","comment2", __ref, _mcomment);}
Debug.locals.put("mComment", _mcomment);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Comment2 (mComment As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="mBuilder.Append($\"<!--${mComment}-->\"$)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<!--"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mcomment))),RemoteObject.createImmutable("-->")))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _divx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Divx (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("divx")) { return __ref.runUserSub(false, "minihtml","divx", __ref);}
 BA.debugLineNum = 144;BA.debugLine="Public Sub Divx";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="TabsDecrease";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.minihtml.class, "_tabsdecrease" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="AddTab";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="mBuilder.Append($\"</div>\"$)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.createImmutable("</div>"))));
 BA.debugLineNum = 148;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(524288);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _doctype(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocType (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("doctype")) { return __ref.runUserSub(false, "minihtml","doctype", __ref);}
 BA.debugLineNum = 255;BA.debugLine="Public Sub DocType";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="mBuilder.Append($\"<!DOCTYPE html>\"$)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.createImmutable("<!DOCTYPE html>"))));
 BA.debugLineNum = 257;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(1);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getToString (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("gettostring")) { return __ref.runUserSub(false, "minihtml","gettostring", __ref);}
 BA.debugLineNum = 246;BA.debugLine="Public Sub getToString As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="Return mBuilder.ToString";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runMethod(true,"ToString");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _h1(RemoteObject __ref,RemoteObject _mtext) throws Exception{
try {
		Debug.PushSubsStack("H1 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("h1")) { return __ref.runUserSub(false, "minihtml","h1", __ref, _mtext);}
Debug.locals.put("mText", _mtext);
 BA.debugLineNum = 214;BA.debugLine="Public Sub H1 (mText As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="TagA(\"h1\", Attr(\"Text\", mText))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.minihtml.class, "_taga" /*RemoteObject*/ ,(Object)(BA.ObjectToString("h1")),(Object)(__ref.runClassMethod (b4j.example.minihtml.class, "_attr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Text")),(Object)(_mtext))));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _h1a(RemoteObject __ref,RemoteObject _mname,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("H1A (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("h1a")) { return __ref.runUserSub(false, "minihtml","h1a", __ref, _mname, _mattributes);}
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("mName", _mname);
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 218;BA.debugLine="Public Sub H1A (mName As String, mAttributes As Li";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}\"$";
Debug.ShouldStop(67108864);
_txt = (RemoteObject.concat(RemoteObject.createImmutable("<"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("")));Debug.locals.put("txt", _txt);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 220;BA.debugLine="txt = txt & BuildAttributes(mAttributes)";
Debug.ShouldStop(134217728);
_txt = RemoteObject.concat(_txt,__ref.runClassMethod (b4j.example.minihtml.class, "_buildattributes" /*RemoteObject*/ ,(Object)(_mattributes)));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 221;BA.debugLine="txt = txt & $\" />\"$";
Debug.ShouldStop(268435456);
_txt = RemoteObject.concat(_txt,(RemoteObject.createImmutable(" />")));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 222;BA.debugLine="AddTab";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 223;BA.debugLine="mBuilder.Append(txt)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_txt));
 BA.debugLineNum = 224;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(-2147483648);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _h1b(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("H1B (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("h1b")) { return __ref.runUserSub(false, "minihtml","h1b", __ref);}
 BA.debugLineNum = 228;BA.debugLine="Public Sub H1B";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Tag(\"h1\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1")));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _h1x(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("H1x (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("h1x")) { return __ref.runUserSub(false, "minihtml","h1x", __ref);}
 BA.debugLineNum = 232;BA.debugLine="Public Sub H1x";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Tagx(\"h1\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.minihtml.class, "_tagx" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1")));
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _head(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Head (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("head")) { return __ref.runUserSub(false, "minihtml","head", __ref);}
 BA.debugLineNum = 164;BA.debugLine="Public Sub Head";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="Tag(\"head\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("head")));
 BA.debugLineNum = 166;BA.debugLine="TabsIncrease";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.minihtml.class, "_tabsincrease" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _head0(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Head0 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("head0")) { return __ref.runUserSub(false, "minihtml","head0", __ref);}
RemoteObject _flatsetting = RemoteObject.createImmutable(false);
 BA.debugLineNum = 174;BA.debugLine="Public Sub Head0";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Dim FlatSetting As Boolean = mFlat";
Debug.ShouldStop(16384);
_flatsetting = __ref.getField(true,"_mflat" /*RemoteObject*/ );Debug.locals.put("FlatSetting", _flatsetting);Debug.locals.put("FlatSetting", _flatsetting);
 BA.debugLineNum = 176;BA.debugLine="mFlat = True";
Debug.ShouldStop(32768);
__ref.setField ("_mflat" /*RemoteObject*/ ,minihtml.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="Tag(\"head\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("head")));
 BA.debugLineNum = 178;BA.debugLine="If Not(FlatSetting) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(131072);
if (minihtml.__c.runMethod(true,"Not",(Object)(_flatsetting)).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 179;BA.debugLine="mFlat = FlatSetting";
Debug.ShouldStop(262144);
__ref.setField ("_mflat" /*RemoteObject*/ ,_flatsetting);
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _heada(RemoteObject __ref,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("HeadA (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("heada")) { return __ref.runUserSub(false, "minihtml","heada", __ref, _mattributes);}
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 169;BA.debugLine="Public Sub HeadA (mAttributes As List)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="TagA(\"head\", mAttributes)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.minihtml.class, "_taga" /*RemoteObject*/ ,(Object)(BA.ObjectToString("head")),(Object)(_mattributes));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Headx (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("headx")) { return __ref.runUserSub(false, "minihtml","headx", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Public Sub Headx";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Tagx(\"head\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.minihtml.class, "_tagx" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("head")));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _htmllang(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("HtmlLang (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("htmllang")) { return __ref.runUserSub(false, "minihtml","htmllang", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 272;BA.debugLine="Public Sub HtmlLang (Value As String) 'As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="mBuilder.Append($\"<html lang=\"${Value}\">\"$)";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<html lang=\""),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("\">")))));
 BA.debugLineNum = 274;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(131072);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _htmlx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Htmlx (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("htmlx")) { return __ref.runUserSub(false, "minihtml","htmlx", __ref);}
 BA.debugLineNum = 278;BA.debugLine="Public Sub Htmlx";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="mBuilder.Append($\"</html>\"$)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.createImmutable("</html>"))));
 BA.debugLineNum = 280;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(8388608);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img(RemoteObject __ref,RemoteObject _msrc) throws Exception{
try {
		Debug.PushSubsStack("Img (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("img")) { return __ref.runUserSub(false, "minihtml","img", __ref, _msrc);}
Debug.locals.put("mSrc", _msrc);
 BA.debugLineNum = 237;BA.debugLine="Public Sub Img (mSrc As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="TagB(\"img\", Attr(\"src\", mSrc))";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.minihtml.class, "_tagb" /*RemoteObject*/ ,(Object)(BA.ObjectToString("img")),(Object)(__ref.runClassMethod (b4j.example.minihtml.class, "_attr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("src")),(Object)(_msrc))));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img0(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Img0 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("img0")) { return __ref.runUserSub(false, "minihtml","img0", __ref);}
 BA.debugLineNum = 242;BA.debugLine="Public Sub Img0";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Tag(\"img\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.minihtml.class, "_tag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "minihtml","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="mBuilder.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kv(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("KV (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("kv")) { return __ref.runUserSub(false, "minihtml","kv", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 65;BA.debugLine="Public Sub KV (Key As String, Value As String) As";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Return CreateMap(Key: Value)";
Debug.ShouldStop(2);
if (true) return minihtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(_key),(_value)}));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _language(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Language (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("language")) { return __ref.runUserSub(false, "minihtml","language", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 266;BA.debugLine="Public Sub Language (Value As String) 'As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 268;BA.debugLine="HtmlLang(Value)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.minihtml.class, "_htmllang" /*RemoteObject*/ ,(Object)(_value));
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _meta(RemoteObject __ref,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("Meta (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("meta")) { return __ref.runUserSub(false, "minihtml","meta", __ref, _mattributes);}
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 151;BA.debugLine="Public Sub Meta (mAttributes As List)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="TagB(\"meta\", mAttributes)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.minihtml.class, "_tagb" /*RemoteObject*/ ,(Object)(BA.ObjectToString("meta")),(Object)(_mattributes));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _meta_default(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Meta_Default (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("meta_default")) { return __ref.runUserSub(false, "minihtml","meta_default", __ref);}
 BA.debugLineNum = 283;BA.debugLine="Public Sub Meta_Default";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Meta(Array(KV(\"charset\", \"UTF-8\")))";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(minihtml.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.minihtml.class, "_kv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("charset")),(Object)(RemoteObject.createImmutable("UTF-8"))).getObject())})))));
 BA.debugLineNum = 285;BA.debugLine="Meta(Array(KV(\"http-equiv\", \"X-UA-Compatible\"), K";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(minihtml.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.runClassMethod (b4j.example.minihtml.class, "_kv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("http-equiv")),(Object)(RemoteObject.createImmutable("X-UA-Compatible"))).getObject()),(__ref.runClassMethod (b4j.example.minihtml.class, "_kv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("content")),(Object)(RemoteObject.createImmutable("IE=edge"))).getObject())})))));
 BA.debugLineNum = 286;BA.debugLine="Meta(Array(KV(\"name\", \"viewport\"), KV(\"content\",";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.minihtml.class, "_meta" /*RemoteObject*/ ,(Object)(minihtml.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.runClassMethod (b4j.example.minihtml.class, "_kv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("name")),(Object)(RemoteObject.createImmutable("viewport"))).getObject()),(__ref.runClassMethod (b4j.example.minihtml.class, "_kv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("content")),(Object)(RemoteObject.createImmutable("width=device-width, initial-scale=1.0"))).getObject())})))));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setflat(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setFlat (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("setflat")) { return __ref.runUserSub(false, "minihtml","setflat", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 17;BA.debugLine="Public Sub setFlat (Value As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="mFlat = Value";
Debug.ShouldStop(131072);
__ref.setField ("_mflat" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabs(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTabs (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("settabs")) { return __ref.runUserSub(false, "minihtml","settabs", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 12;BA.debugLine="Public Sub setTabs (Value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="mTabs = Value";
Debug.ShouldStop(4096);
__ref.setField ("_mtabs" /*RemoteObject*/ ,_value);
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
public static RemoteObject  _tabsdecrease(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TabsDecrease (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("tabsdecrease")) { return __ref.runUserSub(false, "minihtml","tabsdecrease", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub TabsDecrease";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="mTabs = mTabs - 1";
Debug.ShouldStop(64);
__ref.setField ("_mtabs" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mtabs" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabsincrease(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TabsIncrease (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("tabsincrease")) { return __ref.runUserSub(false, "minihtml","tabsincrease", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub TabsIncrease";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="mTabs = mTabs + 1";
Debug.ShouldStop(4);
__ref.setField ("_mtabs" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mtabs" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tag(RemoteObject __ref,RemoteObject _mname) throws Exception{
try {
		Debug.PushSubsStack("Tag (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("tag")) { return __ref.runUserSub(false, "minihtml","tag", __ref, _mname);}
Debug.locals.put("mName", _mname);
 BA.debugLineNum = 113;BA.debugLine="Public Sub Tag (mName As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="AddTab";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="mBuilder.Append($\"<${mName.ToLowerCase}>\"$)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable(">")))));
 BA.debugLineNum = 116;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(524288);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _taga(RemoteObject __ref,RemoteObject _mname,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("TagA (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("taga")) { return __ref.runUserSub(false, "minihtml","taga", __ref, _mname, _mattributes);}
RemoteObject _mtext = RemoteObject.createImmutable("");
RemoteObject _mattribute = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("mName", _mname);
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 119;BA.debugLine="Public Sub TagA (mName As String, mAttributes As L";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim mText As String = TextAttribute(mAttributes)";
Debug.ShouldStop(8388608);
_mtext = __ref.runClassMethod (b4j.example.minihtml.class, "_textattribute" /*RemoteObject*/ ,(Object)(_mattributes));Debug.locals.put("mText", _mtext);Debug.locals.put("mText", _mtext);
 BA.debugLineNum = 121;BA.debugLine="Dim mAttribute As String = BuildAttributes(mAttri";
Debug.ShouldStop(16777216);
_mattribute = __ref.runClassMethod (b4j.example.minihtml.class, "_buildattributes" /*RemoteObject*/ ,(Object)(_mattributes));Debug.locals.put("mAttribute", _mattribute);Debug.locals.put("mAttribute", _mattribute);
 BA.debugLineNum = 122;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}${mAtt";
Debug.ShouldStop(33554432);
_txt = (RemoteObject.concat(RemoteObject.createImmutable("<"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable(""),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mattribute))),RemoteObject.createImmutable(">"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mtext))),RemoteObject.createImmutable("</"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable(">")));Debug.locals.put("txt", _txt);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 123;BA.debugLine="AddTab";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="mBuilder.Append(txt)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_txt));
 BA.debugLineNum = 125;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(268435456);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tagb(RemoteObject __ref,RemoteObject _mname,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("TagB (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("tagb")) { return __ref.runUserSub(false, "minihtml","tagb", __ref, _mname, _mattributes);}
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("mName", _mname);
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 128;BA.debugLine="Public Sub TagB (mName As String, mAttributes As L";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim txt As String = $\"<${mName.ToLowerCase}\"$";
Debug.ShouldStop(1);
_txt = (RemoteObject.concat(RemoteObject.createImmutable("<"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("")));Debug.locals.put("txt", _txt);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 130;BA.debugLine="txt = txt & BuildAttributes(mAttributes)";
Debug.ShouldStop(2);
_txt = RemoteObject.concat(_txt,__ref.runClassMethod (b4j.example.minihtml.class, "_buildattributes" /*RemoteObject*/ ,(Object)(_mattributes)));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 131;BA.debugLine="txt = txt & $\" />\"$";
Debug.ShouldStop(4);
_txt = RemoteObject.concat(_txt,(RemoteObject.createImmutable(" />")));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 132;BA.debugLine="AddTab";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="mBuilder.Append(txt)";
Debug.ShouldStop(16);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_txt));
 BA.debugLineNum = 134;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(32);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tagx(RemoteObject __ref,RemoteObject _mname) throws Exception{
try {
		Debug.PushSubsStack("Tagx (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("tagx")) { return __ref.runUserSub(false, "minihtml","tagx", __ref, _mname);}
Debug.locals.put("mName", _mname);
 BA.debugLineNum = 137;BA.debugLine="Public Sub Tagx (mName As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="TabsDecrease";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.minihtml.class, "_tabsdecrease" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="AddTab";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="mBuilder.Append($\"</${mName.ToLowerCase}>\"$)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("</"),minihtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mname.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable(">")))));
 BA.debugLineNum = 141;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(4096);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _text(RemoteObject __ref,RemoteObject _mtext) throws Exception{
try {
		Debug.PushSubsStack("Text (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("text")) { return __ref.runUserSub(false, "minihtml","text", __ref, _mtext);}
Debug.locals.put("mText", _mtext);
 BA.debugLineNum = 43;BA.debugLine="Public Sub Text (mText As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="AddTab";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="mBuilder.Append(mText)";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_mtext));
 BA.debugLineNum = 46;BA.debugLine="If Not(mFlat) Then mBuilder.Append(CRLF)";
Debug.ShouldStop(8192);
if (minihtml.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mflat" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(minihtml.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _text2(RemoteObject __ref,RemoteObject _mtext) throws Exception{
try {
		Debug.PushSubsStack("Text2 (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("text2")) { return __ref.runUserSub(false, "minihtml","text2", __ref, _mtext);}
Debug.locals.put("mText", _mtext);
 BA.debugLineNum = 49;BA.debugLine="Public Sub Text2 (mText As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="AddTab";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.minihtml.class, "_addtab" /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="mBuilder.Append(mText)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbuilder" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_mtext));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textattribute(RemoteObject __ref,RemoteObject _attributes) throws Exception{
try {
		Debug.PushSubsStack("TextAttribute (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("textattribute")) { return __ref.runUserSub(false, "minihtml","textattribute", __ref, _attributes);}
RemoteObject _attribute = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Attributes", _attributes);
 BA.debugLineNum = 101;BA.debugLine="Public Sub TextAttribute (Attributes As List) As S";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="For Each Attribute As Map In Attributes";
Debug.ShouldStop(32);
_attribute = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = _attributes;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attribute = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("Attribute", _attribute);
Debug.locals.put("Attribute", _attribute);
 BA.debugLineNum = 103;BA.debugLine="For Each Key As String In Attribute.Keys";
Debug.ShouldStop(64);
{
final RemoteObject group2 = _attribute.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("Key", _key);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 104;BA.debugLine="If Key.EqualsIgnoreCase(\"Text\") Then";
Debug.ShouldStop(128);
if (_key.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("Text"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="Return Attribute.Get(Key)";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString(_attribute.runMethod(false,"Get",(Object)((_key))));
 };
 }
}Debug.locals.put("Key", _key);
;
 }
}Debug.locals.put("Attribute", _attribute);
;
 BA.debugLineNum = 109;BA.debugLine="Return \"\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _title(RemoteObject __ref,RemoteObject _mtext) throws Exception{
try {
		Debug.PushSubsStack("Title (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("title")) { return __ref.runUserSub(false, "minihtml","title", __ref, _mtext);}
Debug.locals.put("mText", _mtext);
 BA.debugLineNum = 155;BA.debugLine="Public Sub Title (mText As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="TagA(\"title\", Attr(\"Text\", mText))";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.minihtml.class, "_taga" /*RemoteObject*/ ,(Object)(BA.ObjectToString("title")),(Object)(__ref.runClassMethod (b4j.example.minihtml.class, "_attr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Text")),(Object)(_mtext))));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _titlea(RemoteObject __ref,RemoteObject _mattributes) throws Exception{
try {
		Debug.PushSubsStack("TitleA (minihtml) ","minihtml",1,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("titlea")) { return __ref.runUserSub(false, "minihtml","titlea", __ref, _mattributes);}
Debug.locals.put("mAttributes", _mattributes);
 BA.debugLineNum = 159;BA.debugLine="Public Sub TitleA (mAttributes As List)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="TagA(\"title\", mAttributes)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.minihtml.class, "_taga" /*RemoteObject*/ ,(Object)(BA.ObjectToString("title")),(Object)(_mattributes));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}