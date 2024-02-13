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
	'Private attributes As Map
	'Private mTabs As Int
	'Private mFlat As Boolean
	'Private mChildren As List
	Private mAttributes As Map
	Public const mUniline As String = "uniline"
	Public const mNormal As String = "normal"
End Sub

Public Sub Initialize (tagName As String) As Tag
	innerTags.Initialize
	'attributes.Initialize
	mAttributes.Initialize
	mName = tagName
	mMode = mNormal
	Return Me
End Sub

Public Sub Build (indent As Int) As String
	Dim htmlText As StringBuilder
	htmlText.Initialize
	
	htmlText.Append(CRLF)
	For i = 0 To indent
		htmlText.Append("	")
	Next
	
	If mMode <> "" Then
		htmlText.Append("<" & mName)
	End If
	
	'For Each key As String In attributes.Keys
	'	Dim attrs() As String = attributes.Get(key)
	'	htmlText.Append($" ${key}=""$)		
	'	For i = 0 To attrs.Length - 1
	'		If i > 0 Then htmlText.Append(", ")
	'		htmlText.Append(attrs(i))
	'	Next
	'	htmlText.Append("""")
	'Next
	For Each key As String In mAttributes.Keys
		Dim attrs() As String = mAttributes.Get(key)
		If attrs.Length = 1 And attrs(0).Length = 0 Then
			htmlText.Append($" ${key}"$)
		Else
			htmlText.Append($" ${key}=${QUOTE}"$)
			For i = 0 To attrs.Length - 1
				If i > 0 Then htmlText.Append(", ")
			
				htmlText.Append(attrs(i))
			Next
			htmlText.Append(QUOTE)
		End If
	Next

	Select mMode
		Case "link"
			htmlText.Append(" />")
		Case "meta", "title", mUniline, mNormal
			htmlText.Append(">")
	End Select

	For Each tagOrString In innerTags
		If tagOrString Is Tag Then
			htmlText.Append(tagOrString.As(Tag).build(indent + 1))
		Else
			htmlText.Append(tagOrString.As(String))
		End If
	Next
	
	Select mMode
		Case "normal"
			htmlText.Append(CRLF)
			For i = 0 To indent
				htmlText.Append("	")
			Next
			htmlText.Append("</" & mName & ">")
		Case "title", mUniline
			htmlText.Append("</" & mName & ">")
	End Select
	Return htmlText.ToString
End Sub

Public Sub getName As String
	Return mName
End Sub

Public Sub setName (tagName As String) As Tag
	mName = tagName
	Return Me
End Sub

'Public Sub getAttributes As Map
'	Return mAttributes
'End Sub

Public Sub GetHTML (index As Int) As String
	Return innerTags.Get(index)
End Sub

'Public Sub SetHTML (innerHTMLToAdd As String) As Tag
'	innerTags.Add(innerHTMLToAdd)
'	Return Me
'End Sub

Public Sub addText (Text As String) As Tag
	innerTags.Add(Text)
	Return Me
End Sub

Public Sub addComment (Comment As String) As Tag
	clearMode
	innerTags.Add($"<!--${Comment}-->"$)
	Return Me
End Sub

Public Sub addRaw (Text As String) As Tag
	clearMode
	innerTags.Add(Text)
	Return Me
End Sub

Public Sub GetListOfTags As List
	Return innerTags
End Sub

Public Sub addTo (Parent As Tag)
	Parent.addTag(Me)
End Sub

Public Sub addTag (tagToAdd As Tag) As Tag
	innerTags.Add(tagToAdd)
	Return Me
End Sub

Public Sub addAttribute2 (attrName As String, attrValue() As String) As Tag
	'attributes.Put(attrName, attrValue)
	mAttributes.Put(attrName, attrValue)
	Return Me
End Sub

Public Sub addAttribute (attrName As String, attrValue As String) As Tag
	'attributes.Put(attrName, attrValue)
	mAttributes.Put(attrName, Array As String(attrValue))
	Return Me
End Sub

Public Sub removeAttribute (attrName As String) As Tag
	'attributes.Remove(attrName)
	mAttributes.Remove(attrName)
	Return Me
End Sub

'Accepted values
'meta 
'link
'normal
Public Sub specialMode (changeMode As String) As Tag
	mMode = changeMode.ToLowerCase
	Return Me
End Sub

Public Sub clearMode As Tag
	mMode = ""
	Return Me
End Sub

Public Sub CreateNoTag As Tag
	Dim newtag As Tag
	newtag.Initialize("")
	newtag.clearMode
	Return newtag
End Sub

Public Sub CreateModeTag (Mode As String) As Tag
	Dim newtag As Tag
	newtag.Initialize(Mode)
	newtag.specialMode(Mode)
	Return newtag
End Sub

Public Sub CreateTag (Name As String, Mode As String) As Tag
	Dim newtag As Tag
	newtag.Initialize(Name)
	newtag.specialMode(Mode)
	Return newtag
End Sub