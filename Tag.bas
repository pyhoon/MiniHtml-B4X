﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.5
@EndOfDesignText@
' Credit to: EnriqueGonzalez
' Enhanced by: Aeric
Sub Class_Globals
	Private mName As String
	Private mMode As String
	Private innerTags As List
	Private mAttributes As Map
	Private mClasses As List
	Private mStyles As Map
	Private mFlat As Boolean
	Public Const mUniline 	As String = "uniline" 	' <tag></tag>
	Public Const mNormal 	As String = "normal"	' <tag></tag> (multiline)
	Public Const mLink 		As String = "link"		' <tag />
	Public Const mMeta 		As String = "meta"		' <meta>
	Public Const mNoTag 	As String = ""
End Sub

Public Sub Initialize (tagName As String) As Tag
	innerTags.Initialize
	mAttributes.Initialize
	mClasses.Initialize
	mStyles.Initialize
	mName = tagName
	Select mName.ToLowerCase
		Case "head"
			mMode = mNormal
		Case "meta", "input"
			mMode = mMeta
		Case "title", "h1", "h2", "h3", "h4", "h5", "script"
			mMode = mUniline
		Case "img", "link"
			mMode = mLink
		Case ""
			mMode = mNoTag
		Case Else
			mMode = mNormal
	End Select
	Return Me
End Sub

Public Sub Build (indent As Int) As String
	Dim htmlText As StringBuilder
	htmlText.Initialize
	
	htmlText.Append(CRLF)
	For i = 0 To indent
		htmlText.Append("	")
	Next
	
	If Not(mMode = "") Then
		htmlText.Append("<" & mName)
	End If
	
	For Each key As String In mAttributes.Keys
		'Log(key & "->" & mAttributes.Get(key))
		Dim attrs As String = mAttributes.Get(key)
		If attrs.Length > 0 Then
			htmlText.Append($" ${key}=${QUOTE}"$)
			htmlText.Append(attrs)
			htmlText.Append(QUOTE)
		Else
			htmlText.Append($" ${key}"$)
		End If
	Next

	Select mMode
		Case mLink
			htmlText.Append(" />")
		Case mUniline, mNormal, mMeta
			htmlText.Append(">")
	End Select

	For Each tagOrString In innerTags
		If tagOrString Is Tag Then
			htmlText.Append(tagOrString.As(Tag).Build(indent + 1))
		Else
			htmlText.Append(tagOrString.As(String))
		End If
	Next
	
	Select mMode
		Case mNormal
			htmlText.Append(CRLF)
			For i = 0 To indent
				htmlText.Append("	")
			Next
			htmlText.Append("</" & mName & ">")
		Case mUniline
			htmlText.Append("</" & mName & ">")
	End Select
	Return htmlText.ToString
End Sub

' set to true for no tabs and CRLF
Public Sub setFlat (Value As Boolean)
	mFlat = Value
End Sub

Public Sub getName As String
	Return mName
End Sub

Public Sub setName (tagName As String) As Tag
	mName = tagName
	Return Me
End Sub

Public Sub innerTag (index As Int) As Tag
	Return innerTags.Get(index)
End Sub

Public Sub PrintInnerTags
	For Each item In innerTags
		'Log(GetType(item))
		If item Is Tag Then
			Log(item.As(Tag).IsInitialized & "[" & item.As(Tag).Name & "]")
		Else If item Is String Then
			Log(item)
		Else
			Log(GetType(item))	
		End If
	Next
End Sub

Public Sub comment (value As String) As Tag
	innerTags.Add(Html.create(""))
	innerTags.Add($"<!--${value}-->"$)
	'PrintInnerTags
	Return Me
End Sub
Public Sub comment2 (value As String) As Tag
	innerTags.Add($"<!--${value}-->"$)
	Return Me
End Sub

Public Sub addMeta (key As String, value As String)
	innerTags.Add(Html.create("meta").attribute(key, value))
End Sub

Public Sub addMeta2 (keyvals As Map)
	innerTags.Add(Html.create("meta").attribute2(keyvals))
End Sub

Public Sub Meta_Preset As Tag
	addMeta("charset", "UTF-8")
	addMeta2(CreateMap("name": "viewport", "content": "width=device-width, initial-scale=1.0"))
	addMeta2(CreateMap("http-equiv": "X-UA-Compatible", "content": "IE=edge"))
	Return Me
End Sub

Public Sub Link (keyvals As Map) As Tag
	innerTags.Add(Html.create("link").attribute2(keyvals))
	Return Me
End Sub

' raw with CRLF
Public Sub Raw (value As String) As Tag
	innerTags.Add(Html.create(""))
	innerTags.Add(value)
	Return Me
End Sub

Public Sub Raw2 (value As String)
	innerTags.Add(value)
End Sub

Public Sub Text (value As String) As Tag
	'innerTags.Add(Html.create("").Text(value))
	innerTags.Add(value)
	Return Me
End Sub

Public Sub Script (value As String) As Tag
	innerTags.Add(Html.create("script").attribute("src", value))
	Return Me
End Sub

Public Sub Script2 (value As String, keyvals As Map) As Tag
	innerTags.Add(Html.create("script").attribute("src", value).attribute2(keyvals))
	Return Me
End Sub

Public Sub Style (value As String) As Tag
	innerTags.Add(Html.create("style").Text(value))
	Return Me
End Sub

Public Sub newline
	Raw("")
End Sub

Public Sub Title (value As String) As Tag
	innerTags.Add(Html.create("title").Text(value))
	Return Me
End Sub

Public Sub innerText As String
	If innerTags.Size > 0 Then
		If innerTags.Get(0).As(String).StartsWith("[") = False Then
			Return innerTags.Get(0)
		End If
	End If
	Return ""
End Sub

Public Sub Tags As List
	Return innerTags
End Sub

' Add a Child and return parent tag
Public Sub add (Child As Tag) As Tag
	innerTags.Add(Child)
	Return Me
End Sub

' Add a Child without returning parent tag
Public Sub add2 (Child As Tag)
	innerTags.Add(Child)
End Sub

' Add to Parent and return parent tag
Public Sub addTo (Parent As Tag) As Tag
	Parent.add(Me)
	Return Me
End Sub

' Add to Parent without returning parent tag
Public Sub addTo2 (Parent As Tag)
	Parent.add(Me)
End Sub

' same as addTo
Public Sub up (Parent As Tag) As Tag
	Return addTo(Parent)
End Sub

' same as addTo2
Public Sub up2 (Parent As Tag)
	addTo2(Parent)
End Sub

' Same as add
Public Sub down (Child As Tag) As Tag
	Return add(Child)
End Sub

' Same as add2
Public Sub down2 (Child As Tag)
	add2(Child)
End Sub

' Add an attribute
Public Sub attribute (key As String, value As String) As Tag
	mAttributes.Put(key, value)
	Return Me
End Sub

' Add multiple attributes
Public Sub attribute2 (keyvals As Map) As Tag
	For Each key As String In keyvals.Keys
		Dim value As String = keyvals.Get(key)
		mAttributes.Put(key, value)
	Next
	Return Me
End Sub

' Return maps of attributes
Public Sub getAttributes As Map
	Return mAttributes
End Sub

Public Sub addClass (name As String) As Tag
	Dim names() As String = Regex.Split(" ", name)
	For Each subname As String In names
		If mClasses.IndexOf(subname) < 0 Then mClasses.Add(subname)
	Next
	mClasses.Sort(True)
	mAttributes.Put("class", ClassesAsString)
	Return Me
End Sub

Public Sub removeClass (name As String) As Tag
	If mClasses.IndexOf(name) > -1 Then mClasses.RemoveAt(mClasses.IndexOf(name))
	If mClasses.Size = 0 Then
		mAttributes.Remove("class")
	Else
		mAttributes.Put("class", mClasses)
	End If
	Return Me
End Sub

Public Sub ListToString (list1 As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each item As String In list1
		If sb.Length > 0 Then sb.Append(separator)
		sb.Append(item)
	Next
	Return sb.ToString
End Sub

Public Sub ClassesAsString As String
	Return ListToString(mClasses, " ")
End Sub

Public Sub MapToString (list1 As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each key As String In mStyles.Keys
		If sb.Length > 0 Then sb.Append(separator & IIf(mFlat, "", " "))
		sb.Append($"${key}:${IIf(mFlat, "", " ")}${mStyles.Get(key)}"$)
	Next
	Return sb.ToString
End Sub

Public Sub StylesAsString As String
	Return MapToString(mStyles, ";")
End Sub

Public Sub setMode (TagMode As String)
	mMode = TagMode.ToLowerCase
End Sub

Public Sub getMode As String
	Return mMode
End Sub

Public Sub uniline As Tag
	mMode = mUniline
	Return Me
End Sub