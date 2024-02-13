B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private mBuilder As StringBuilder
	Private mTabs As Int
	'Private mMode As String
	'Private mName As String
	Private mFlat As Boolean
	Private mChildren As List
	Private mAttributes As Map
	'Type HtmlTag (Name As String, Attributes As List, Children As List)
	'Type Html_H1 (Attributes As B4XOrderedMap, Children As List)
End Sub

Public Sub Initialize '(Name As String)
	mBuilder.Initialize
	mChildren.Initialize
	mAttributes.Initialize
	'mMode = "normal"
	'mName = Name
End Sub

Public Sub setTabs (Value As Int)
	mTabs = Value
End Sub

' set to true for no tabs and CRLF
Public Sub setFlat (Value As Boolean)
	mFlat = Value
End Sub

Public Sub AddTab
	If mFlat Then Return
	For i = 0 To mTabs - 1
		mBuilder.Append(TAB)
	Next
End Sub

Public Sub AddTabs (Value As Int)
	For i = 0 To Value - 1
		mBuilder.Append(TAB)
	Next
End Sub

Public Sub TabsIncrease
	mTabs = mTabs + 1
End Sub

Public Sub TabsDecrease
	mTabs = mTabs - 1
End Sub

' Add raw text
Public Sub Text (mText As String)
	AddTab
	mBuilder.Append(mText)
	If Not(mFlat) Then mBuilder.Append(CRLF)
End Sub

'Public Sub Text2 (mText As String)
'	AddTab
'	mBuilder.Append(mText)
'End Sub

'Public Sub addText (Text As String) As String
'	Return Text
'End Sub

Public Sub addTag (mTag As Tag)
	Dim s As String = mTag.build(0)
	mBuilder.Append(s)
End Sub

'Public Sub Comment (mComment As String)
'	mBuilder.Append($"<!--${mComment}-->"$)
'	If Not(mFlat) Then mBuilder.Append(CRLF)
'End Sub

' no new line when ends
'Public Sub Comment2 (mComment As String)
'	mBuilder.Append($"<!--${mComment}-->"$)
'End Sub

' Key Value Pair
Public Sub KV (Key As String, Value As String) As Map
	Return CreateMap(Key: Value)
End Sub

Public Sub Attr (Key As String, Value As String) As List
	Dim List As List
	List.Initialize
	List.Add(CreateMap(Key.ToLowerCase: Value))
	Return List
End Sub

Public Sub Attrs (Keys As List, Values As List) As List
	Dim List As List
	List.Initialize
	For i = 0 To Keys.Size - 1
		List.Add(CreateMap(Keys.Get(i).As(String).ToLowerCase: Values.Get(i)))
	Next
	Return List
End Sub

Public Sub BuildAttribute (Key As String, Value As String) As String
	Return $"${Key.ToLowerCase}="${Value}""$
End Sub

Public Sub BuildAttributes (Attributes As List) As String
	Dim strAttribute As String
	For Each Attribute As Map In Attributes
		For Each Key As String In Attribute.Keys
			If Key.EqualsIgnoreCase("Text") = False Then
				strAttribute = strAttribute & $" ${Key.ToLowerCase}="${Attribute.Get(Key)}""$
			End If
		Next
	Next
	Return strAttribute
End Sub

Public Sub TextAttribute (Attributes As List) As String
	For Each Attribute As Map In Attributes
		For Each Key As String In Attribute.Keys
			If Key.EqualsIgnoreCase("Text") Then
				Return Attribute.Get(Key)
			End If
		Next
	Next
	Return ""
End Sub

' Single Line Tag without Attributes
'Public Sub Tag (mName As String)
'	AddTab
'	mBuilder.Append($"<${mName.ToLowerCase}>"$)
'	If Not(mFlat) Then mBuilder.Append(CRLF)
'End Sub

'Public Sub TagA (Name As String, Attributes As List) 'As String
'	Dim Str As String = TextAttribute(Attributes)
'	Dim Attribute As String = BuildAttributes(Attributes)
'	Dim txt As String = $"<${Name.ToLowerCase}${Attribute}>${Str}</${Name.ToLowerCase}>"$
'	AddTab
'	mBuilder.Append(txt)
'	If Not(mFlat) Then mBuilder.Append(CRLF)
'End Sub

'Public Sub TagB (mName As String, mAttributes As List) 'As String
'	Dim txt As String = $"<${mName.ToLowerCase}"$
'	txt = txt & BuildAttributes(mAttributes)
'	txt = txt & $" />"$
'	AddTab
'	mBuilder.Append(txt)
'	If Not(mFlat) Then mBuilder.Append(CRLF)
'End Sub

Public Sub Tagx (mName As String)
	TabsDecrease
	AddTab
	mBuilder.Append($"</${mName.ToLowerCase}>"$)
	If Not(mFlat) Then mBuilder.Append(CRLF)
End Sub

Public Sub Divx
	TabsDecrease
	AddTab
	mBuilder.Append($"</div>"$)
	If Not(mFlat) Then mBuilder.Append(CRLF)
End Sub

'Public Sub Meta (mAttributes As List)
'	TagB("meta", mAttributes)
'End Sub

'Public Sub Meta_Default
'	Meta_Charset_Utf8
'	Meta_Compatible_IE
'	Meta_ViewPort
'End Sub

'Public Sub Meta_Charset_Utf8
'	Meta(Array(KV("charset", "UTF-8")))
'End Sub
'
'Public Sub Meta_Compatible_IE
'	Meta(Array(KV("http-equiv", "X-UA-Compatible"), KV("content", "IE=edge")))
'End Sub
'
'Public Sub Meta_ViewPort
'	Meta(Array(KV("name", "viewport"), KV("content", "width=device-width, initial-scale=1.0")))
'End Sub
'
'Public Sub Title (mText As String)
'	TagA("title", Attr("Text", mText))
'End Sub
'
'Public Sub TitleA (mAttributes As List)
'	TagA("title", mAttributes)
'End Sub

' Tag without Attributes
'Public Sub Head
'	Tag("head")
'	TabsIncrease
'End Sub

'Public Sub HeadA (mAttributes As List)
'	TagA("head", mAttributes)
'End Sub

' Not increase indent
'Public Sub Head0
'	Dim FlatSetting As Boolean = mFlat
'	mFlat = True
'	Tag("head")
'	If Not(FlatSetting) Then mBuilder.Append(CRLF)
'	mFlat = FlatSetting
'End Sub

'Public Sub Headx
'	Tagx("head")
'End Sub

' Single Line Tag without Attributes
'Public Sub Body
'	Tag("body")
'	TabsIncrease
'End Sub

'Public Sub BodyA (mAttributes As List)
'	TagA("body", mAttributes)
'End Sub

' Single Line Tag without Attributes
'Public Sub BodyB
'	Tag("body")
'End Sub

' Not increase indent
'Public Sub Body0
'	Dim FlatSetting As Boolean = mFlat
'	mFlat = True
'	Tag("body")
'	If Not(FlatSetting) Then mBuilder.Append(CRLF)
'	mFlat = FlatSetting
'End Sub

'Public Sub Bodyx
'	Tagx("body")
'End Sub

'Public Sub H1 (mText As String)
'	TagA("h1", Attr("Text", mText))
'End Sub

'Public Sub H1A (mName As String, mAttributes As List)
'	Dim txt As String = $"<${mName.ToLowerCase}"$
'	txt = txt & BuildAttributes(mAttributes)
'	txt = txt & $" />"$
'	AddTab
'	mBuilder.Append(txt)
'	If Not(mFlat) Then mBuilder.Append(CRLF)
'End Sub

' Single Line Tag without Attributes
'Public Sub H1B
'	Tag("h1")
'End Sub

'Public Sub H1x
'	Tagx("h1")
'End Sub

' returns <code><img src="/img.png" /></code>
'Public Sub Img (mSrc As String)
'	TagB("img", Attr("src", mSrc))
'End Sub

' returns <code><img></code>
'Public Sub Img0
'	Tag("img")
'End Sub

Public Sub getToString As String
	Return mBuilder.ToString
End Sub

' returns <code><!DOCTYPE html></code>
Public Sub DocType
	mBuilder.Append($"<!DOCTYPE html>"$)
	If Not(mFlat) Then mBuilder.Append(CRLF)
End Sub

' returns <code><html lang="Value"></code>
Public Sub Language (Value As String) 'As String
	HtmlLang(Value)
End Sub

' returns <code><html lang="Value"></code>
Public Sub HtmlLang (Value As String) 'As String
	mBuilder.Append($"<html lang="${Value}">"$)
	If Not(mFlat) Then mBuilder.Append(CRLF)
End Sub

Public Sub Htmlx
	Tagx("html")
End Sub

'Public Sub CreateHtml_H1 (Attributes As B4XOrderedMap, Children As List) As Html_H1
'	Dim t1 As Html_H1
'	t1.Initialize
'	t1.Attributes = Attributes
'	t1.Children = Children
'	Return t1
'End Sub