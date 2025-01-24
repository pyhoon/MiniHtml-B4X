B4J=true
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
	'Private mClass As String
	Private mClasses As List
	Private mStyles As Map
	Private mFlat As Boolean
	Public Const mUniline 	As String = "uniline" ' <tag></tag>
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
		Case "meta"
			mMode = mMeta
		Case "title", "h1"
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

Public Sub addText (tText As String) As Tag
	innerTags.Add(tText)
	Return Me
End Sub

'Public Sub addSource (tText As String) As Tag
'	mAttributes.Put("src", tText)
'	Return Me
'End Sub

Public Sub comment (Text As String) As Tag
	Dim tag1 As Tag
	tag1.Initialize("")
	tag1.addText($"<!--${Text}-->"$)
	innerTags.Add(tag1)
	Return Me
End Sub

Public Sub meta (attrName As String, attrValue As String)
	Dim tag1 As Tag
	tag1.Initialize("meta") _
	.addAttribute(attrName, attrValue)
	innerTags.Add(tag1)
End Sub

Public Sub meta2 (attrs As Map)
	Dim tag1 As Tag
	tag1.Initialize("meta") _
	.addAttributes(attrs)
	innerTags.Add(tag1)
End Sub

Public Sub meta_preset (attrs As Map)
	Dim tag1 As Tag
	tag1.Initialize("meta") _
	.addAttributes(attrs)
	innerTags.Add(tag1)
End Sub

Public Sub link (attrs As Map) As Tag
	Dim tag1 As Tag
	tag1.Initialize("link") _
	.ChangeMode("link") _
	.addAttributes(attrs)
	innerTags.Add(tag1)
	Return Me
End Sub

Public Sub addRaw (Text As String) 'As Tag
	'mMode = ""
	innerTags.Add(Text)
	'Return Me
End Sub

Public Sub raw (Text As String) 'As Tag
	'Return addRaw(Text)
	addRaw(Text)
End Sub

' raw with CRLF
Public Sub raw2 (Text As String) As Tag
	Dim tag1 As Tag
	tag1.Initialize("")
	tag1.addText(Text)
	innerTags.Add(tag1)
	Return Me
End Sub

Public Sub newline 'As Tag
	addRaw(CRLF)
End Sub

Public Sub title (Text As String) As Tag
	Dim tag1 As Tag
	tag1.Initialize("title") _
	.ChangeMode("uniline") _
	.addText(Text)
	innerTags.Add(tag1)
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

' Add a Child without returning parent tag
Public Sub add (Child As Tag)
	innerTags.Add(Child)
End Sub

' Add to Parent
Public Sub addTo (Parent As Tag)
	Parent.addChild(Me)
End Sub

' Add a Child and return the parent tag
Public Sub addChild (Child As Tag) As Tag
	innerTags.Add(Child)
	Return Me
End Sub

' same as addTo
Public Sub up (Parent As Tag)
	Parent.addChild(Me)
End Sub

' Same as addChild
Public Sub down (Child As Tag) As Tag
	Return addChild(Child)
End Sub

Public Sub addAttribute (attrName As String, attrValue As String) As Tag
	mAttributes.Put(attrName, attrValue)
	Return Me
End Sub

Public Sub getAttribute (key As String) As String
	'Return addAttribute(attrName, attrValue)
	Return mAttributes.Get(key)
End Sub

Public Sub addAttributes (attrs As Map) As Tag
	For Each Key As String In attrs.Keys
		Dim Value As String = attrs.Get(Key)
		mAttributes.Put(Key, Value)
	Next
	Return Me
End Sub

Public Sub getAttributes As Map
	'Return addAttributes(attrs)
	Return mAttributes
End Sub

Public Sub removeAttribute (attrName As String) As Tag
	'attributes.Remove(attrName)
	mAttributes.Remove(attrName)
	Return Me
End Sub

Public Sub addClass (className As String) As Tag
	If mClasses.IndexOf(className) < 0 Then mClasses.Add(className)
	'mClasses.Sort(True)
	mAttributes.Put("class", mClasses)
	Return Me
End Sub

Public Sub removeClass (className As String) As Tag
	If mClasses.IndexOf(className) > -1 Then mClasses.RemoveAt(mClasses.IndexOf(className))
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

'Accepted values
'meta 
'link
'normal
Public Sub ChangeMode (TagMode As String) As Tag
	mMode = TagMode.ToLowerCase
	Return Me
End Sub

Public Sub setMode (TagMode As String)
	mMode = TagMode.ToLowerCase
End Sub

Public Sub getMode As String
	Return mMode
End Sub

Public Sub Uniline As Tag
	mMode = mUniline
	Return Me
End Sub