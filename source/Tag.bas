B4J=true
Group=Classes
ModulesStructureVersion=1
Type=Class
Version=4.5
@EndOfDesignText@
' Created by: Aeric
' Credit to:  EnriqueGonzalez
Sub Class_Globals
	Private mName As String
	Private mMode As String
	Private mParent As Tag
	Private mChildren As List
	Private mAttributes As Map
	Private mClasses As List
	Private mStyles As Map
	Private mFlat As Boolean
	Public Const mUniline 	As String = "uniline" 	' <tag></tag>
	'Public Const mSpan 	As String = "span"		' <span></span>
	Public Const mNormal 	As String = "normal"	' <tag></tag> (multiline)
	Public Const mLink 		As String = "link"		' <tag />
	Public Const mMeta 		As String = "meta"		' <meta>
	Public Const mNoTag 	As String = ""
End Sub

Public Sub Initialize (tagName As String) As Tag
	mChildren.Initialize
	mAttributes.Initialize
	mClasses.Initialize
	mStyles.Initialize
	mName = tagName
	Select mName.ToLowerCase
		'Case "head", "form", "table"
		'	mMode = mNormal
		Case "meta", "input"
			mMode = mMeta
		Case "title", "h1", "h2", "h3", "h4", "h5", "script", "label", "button", "span", "li", "a", "i", "b", "u", "option", "bold", "italic", "underline", "strong", "em", "del", "th", "td", "small"
			mMode = mUniline
		Case "img", "link", "br"
			mMode = mLink
		Case "text", ""
			mMode = mNoTag
		Case Else
			mMode = mNormal
	End Select
	Return Me
End Sub

Public Sub build As String
	Return build3(-1, False)
End Sub

Public Sub build2 As String
	Return build3(-1, True)
End Sub

Public Sub build3 (indent As Int, Line1CRLF As Boolean) As String
	Dim SB As StringBuilder
	SB.Initialize
	If Line1CRLF Then
		SB.Append(CRLF)
	End If
	For n = 0 To indent
		SB.Append(TAB)
	Next
	If Not(mMode = "") Then
		SB.Append("<" & mName)
	End If
	For Each key As String In mAttributes.Keys
		'Log(key & "->" & mAttributes.Get(key))
		Dim attrs As String = mAttributes.Get(key)
		If attrs.Length > 0 Then
			SB.Append($" ${key}=${QUOTE}"$)
			SB.Append(attrs)
			SB.Append(QUOTE)
		Else
			SB.Append($" ${key}"$)
		End If
	Next
	Select mMode
		Case mLink
			'If mFlat = False Then SB.Append(" ")
			SB.Append("/>")
		Case mUniline, mNormal, mMeta
			SB.Append(">")
	End Select
	For Each tagOrString In mChildren
		If tagOrString Is Tag Then
			SB.Append(tagOrString.As(Tag).build3(indent + 1, True))
		Else
			SB.Append(tagOrString.As(String))
		End If
	Next
	Select mMode
		Case mNormal
			SB.Append(CRLF)
			For n = 0 To indent
				SB.Append("	")
			Next
			SB.Append("</" & mName & ">")
		Case mUniline
			SB.Append("</" & mName & ">")
	End Select
	Return SB.ToString
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

Public Sub Child (tagIndex As Int) As Tag
	Return mChildren.Get(tagIndex)
End Sub

Public Sub ChildById (Id As String) As Tag
	For i = 0 To mChildren.Size - 1
		If Child(i).mAttributes.Get("id") = Id Then
			Return Child(i)
		End If
	Next
	Return Null
End Sub

Public Sub PrintMe
	Log(Me.as(Tag).build)
End Sub

Public Sub PrintChildren
	Dim indent As String
	For Each item As Tag In mChildren
		indent = indent & "  "
		If item.IsInitialized Then
			Log($"${indent}${item.Name}"$)
		End If
		item.PrintChildren
	Next
End Sub

' append on new line
Public Sub comment (value As String) As Tag
	mChildren.Add(Html.create(mNoTag))
	mChildren.Add($"<!--${value}-->"$)
	Return Me
End Sub

' append on same line
Public Sub comment2 (value As String) As Tag
	mChildren.Add($"<!--${value}-->"$)
	Return Me
End Sub

Public Sub title (value As String) As Tag
	mChildren.Add(Html.create("title").Text(value))
	Return Me
End Sub

Public Sub addMeta (key As String, value As String)
	mChildren.Add(Html.create("meta").attribute(key, value))
End Sub

Public Sub addMeta2 (keyvals As Map)
	mChildren.Add(Html.create("meta").attribute2(keyvals))
End Sub

' Deprecated. Use responsive.
Public Sub meta_preset As Tag
	addMeta("charset", "UTF-8")
	addMeta2(CreateMap("name": "viewport", "content": "width=device-width, initial-scale=1"))
	'addMeta2(CreateMap("http-equiv": "X-UA-Compatible", "content": "IE=edge"))
	Return Me
End Sub

Public Sub responsive As Tag
	addMeta("charset", "UTF-8")
	addMeta2(CreateMap("name": "viewport", "content": "width=device-width, initial-scale=1"))
	Return Me
End Sub

Public Sub link (href As String, rel As String, integrity As String, crossorigin As String) As Tag
	Return link3(href, rel, integrity, crossorigin, "", "", "")
End Sub

Public Sub link2 (keyvals As Map) As Tag
	mChildren.Add(Html.create("link").attribute2(keyvals))
	Return Me
End Sub

Public Sub link3 (href As String, rel As String, integrity As String, crossorigin As String, titleText As String, typeText As String, asText As String) As Tag
	Dim Map1 As Map
	Map1.Initialize
	If href <> "" Then Map1.Put("href", href)
	If rel <> "" Then Map1.Put("rel", rel)
	If integrity <> "" Then Map1.Put("integrity", integrity)
	If crossorigin <> "" Then Map1.Put("crossorigin", crossorigin)
	If titleText <> "" Then Map1.Put("title", titleText)
	If typeText <> "" Then Map1.Put("type", typeText)
	If asText <> "" Then Map1.Put("as", asText)
	Return link2(Map1)
End Sub

' rel="stylesheet"
Public Sub linkCss (href As String) As Tag
	Return link2(CreateMap("href": href, "rel": "stylesheet"))
End Sub

Public Sub cdnScript (src As String, integrity As String) As Tag
	Return cdnScript2(src, integrity, "anonymous")
End Sub

Public Sub cdnScript2 (src As String, integrity As String, crossorigin As String) As Tag
	mChildren.Add(Html.create("script").attribute2(CreateMap("src": src, "integrity": integrity, "crossorigin": crossorigin)))
	Return Me
End Sub

Public Sub cdnStyle (href As String, integrity As String) As Tag
	Return cdnStyle2(href, integrity, "anonymous")
End Sub

Public Sub cdnStyle2 (href As String, integrity As String, crossorigin As String) As Tag
	mChildren.Add(Html.create("link").attribute2(CreateMap("href": href, "rel": "stylesheet", "integrity": integrity, "crossorigin": crossorigin)))
	Return Me
End Sub

Public Sub Text (value As String) As Tag
	mChildren.Add(value)
	Return Me
End Sub

' raw with CRLF
Public Sub TextNextLine (value As String) As Tag
	mChildren.Add(Html.create(mNoTag))
	mChildren.Add(value)
	Return Me
End Sub

Public Sub TextInline (value As String)
	mChildren.Add(value)
End Sub

Public Sub innerText As String
	If mChildren.Size > 0 Then
		If mChildren.Get(0).As(String).StartsWith("[") = False Then
			Return mChildren.Get(0)
		End If
	End If
	Return ""
End Sub

Public Sub script (src As String, integrity As String, crossorigin As String) As Tag
	Dim Map1 As Map
	Map1.Initialize
	Map1.Put("src", src)
	If integrity <> "" Then Map1.Put("integrity", integrity)
	If crossorigin <> "" Then Map1.Put("crossorigin", crossorigin)
	Return script2(Map1)
End Sub

Public Sub script2 (keyvals As Map) As Tag
	mChildren.Add(Html.create("script").attribute2(keyvals))
	Return Me
End Sub

Public Sub scriptSrc (src As String) As Tag
	Return script2(CreateMap("src": src))
End Sub

Public Sub style (value As String) As Tag
	mChildren.Add(Html.create("style").Text(value))
	Return Me
End Sub

Public Sub newline
	TextNextLine("")
End Sub

Public Sub Tags As List
	Return mChildren
End Sub

Public Sub setParent (ParentTag As Tag)
	mParent = ParentTag
End Sub

Public Sub getParent As Tag
	Return mParent
End Sub

'Add a Child and return the passing tag (child)
Public Sub add (ChildTag As Tag) As Tag
	mChildren.Add(ChildTag)
	ChildTag.Parent = Me
	Log("adding " & ChildTag.Name)
	Return ChildTag
End Sub

'Add a Child and return current tag (parent)
Public Sub add2 (ChildTag As Tag) As Tag
	mChildren.Add(ChildTag)
	ChildTag.Parent = Me
	Return Me
End Sub

'Add a Child only (no tag)
Public Sub add3 (ChildTag As Tag)
	mChildren.Add(ChildTag)
	ChildTag.Parent = Me
End Sub

'Add to Parent and return current tag (child)
Public Sub addTo (ParentTag As Tag) As Tag
	ParentTag.add(Me)
	mParent = ParentTag
	Return Me
End Sub

'Add to Parent and return the parent tag (parent)
Public Sub addTo2 (ParentTag As Tag) As Tag
	ParentTag.add(Me)
	mParent = ParentTag
	Return ParentTag
End Sub

'Add to Parent only (no tag)
Public Sub addTo3 (ParentTag As Tag)
	ParentTag.add(Me)
	mParent = ParentTag
End Sub

'Add a Sibling and return the sibling tag (sibling)
Public Sub addSibling (siblingTag As Tag) As Tag
	mParent.Add(siblingTag)
	siblingTag.Parent = mParent
	Log("Parent=" & mParent)
	'Log("siblingTag added: " & siblingTag.build & " Me=" & Me.As(Tag).build)
	Return siblingTag
End Sub

'Add a Sibling and return parent tag (parent)
Public Sub addSibling2 (siblingTag As Tag) As Tag
	Log("Parent=" & mParent)
	mParent.Add(siblingTag)
	siblingTag.Parent = mParent
	Return Me
End Sub

'Add a Sibling only (no tag)
Public Sub addSibling3 (siblingTag As Tag)
	mParent.Add(siblingTag)
	siblingTag.Parent = mParent
	Log("Parent=" & mParent)
End Sub

'Add a Sibling and return the current tag (current)
Public Sub addSibling4 (siblingTag As Tag) As Tag
	mParent.Add(siblingTag)
	Log("adding " & siblingTag.Name)
	Return Me
End Sub

'Same as add (child)
Public Sub down (ChildTag As Tag) As Tag
	Return add(ChildTag)
End Sub

'Same as add2 (parent)
Public Sub down2 (ChildTag As Tag)
	add2(ChildTag)
End Sub

'Same as add3
Public Sub down3 (ChildTag As Tag)
	add3(ChildTag)
End Sub

'same as addTo (child)
Public Sub up (ParentTag As Tag) As Tag
	Return addTo(ParentTag)
End Sub

'same as addTo2 (parent)
Public Sub up2 (ParentTag As Tag) As Tag
	Return addTo2(ParentTag)
End Sub

'same as addTo3 (no tag)
Public Sub up3 (ParentTag As Tag)
	addTo3(ParentTag)
End Sub

'Add an attribute
Public Sub attribute (key As String, value As String) As Tag
	mAttributes.Put(key, value)
	Return Me
End Sub

'Add multiple attributes
Public Sub attribute2 (keyvals As Map) As Tag
	For Each key As String In keyvals.Keys
		Dim value As String = keyvals.Get(key)
		mAttributes.Put(key, value)
	Next
	Return Me
End Sub

'Add single attribute without value
Public Sub attribute3 (name As String) As Tag
	Log("attribute3=" & Me.As(Tag).build)
'	Log($"Me is Initialized= ${Me.as(Tag).IsInitialized}"$)
'	mAttributes.Put(name, "")
'	Log(mAttributes.As(JSON).ToString)
	Return Me.As(Tag)
End Sub

'Add attributes by passing a json object
Public Sub attr (json As String) As Tag
	Try
		Dim keyvals As Map = json.As(JSON).ToMap
		For Each key As String In keyvals.Keys
			Dim value As String = keyvals.Get(key)
			mAttributes.Put(key, value)
		Next
	Catch
		Log(LastException)
	End Try
	Return Me
End Sub

'Return maps of attributes
Public Sub getAttributes As Map
	Return mAttributes
End Sub

'Assign attributes map
Public Sub setAttributes (keyvals As Map)
	mAttributes = keyvals
End Sub

Public Sub addId (value As String) As Tag
	mAttributes.Put("id", value)
	Return Me
End Sub

Public Sub addName (value As String) As Tag
	mAttributes.Put("name", value)
	Return Me
End Sub

Public Sub addClass (name As String) As Tag
	Try
		Dim names() As String = Regex.Split(" ", name)
		For Each subname As String In names
			If mClasses.IndexOf(subname) < 0 Then mClasses.Add(subname)
		Next
		'mClasses.Sort(True)
		updateClassAttribute
	Catch
		Log(LastException)
	End Try
	Return Me
End Sub

Public Sub removeClass (name As String) As Tag
	If mClasses.IndexOf(name) > -1 Then mClasses.RemoveAt(mClasses.IndexOf(name))
	updateClassAttribute
	Return Me
End Sub

Public Sub addStyle (name As String) As Tag
	Try
		Dim pairs() As String = Regex.Split(";", name)
		For Each pair As String In pairs
			Dim keyvals() As String = Regex.Split(":", pair.Trim)
			mStyles.Put(keyvals(0).Trim, keyvals(1).Trim)
		Next
		updateStyleAttribute
	Catch
		Log(LastException)
	End Try
	Return Me
End Sub

Public Sub removeStyle (name As String) As Tag
	If mStyles.ContainsKey(name) Then mStyles.Remove(name)
	updateStyleAttribute
	Return Me
End Sub

Private Sub updateClassAttribute
	If mClasses.Size = 0 Then
		mAttributes.Remove("class")
	Else
		mAttributes.Put("class", ClassesAsString)
	End If
End Sub

Private Sub updateStyleAttribute
	If mStyles.Size = 0 Then
		mAttributes.Remove("style")
	Else
		mAttributes.Put("style", StylesAsString)
	End If
End Sub

Public Sub ClassesAsString As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each item As String In mClasses
		If sb.Length > 0 Then sb.Append(" ")
		sb.Append(item)
	Next
	Return sb.ToString
End Sub

Public Sub StylesAsString As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each key As String In mStyles.Keys
		If sb.Length > 0 Then sb.Append(";" & IIf(mFlat, "", " "))
		sb.Append($"${key}:${IIf(mFlat, "", " ")}${mStyles.Get(key)}"$)
	Next
	Return sb.ToString
End Sub

Public Sub addLink (href As String, rel As String) As Tag
	mChildren.Add(Html.create("link").attribute2(CreateMap("href": href, "rel": "stylesheet")))
	Return Me
End Sub

Public Sub addLink2 (href As String) As Tag
	mChildren.Add(Html.create("link").attribute2(CreateMap("href": href, "rel": "stylesheet")))
	Return Me
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

Public Sub multiline As Tag
	mMode = mNormal
	Return Me
End Sub

Public Sub required As Tag
	If mName = "input" Then
		mAttributes.Put("required", "")
	End If
	Return Me
End Sub

Public Sub action (value As String) As Tag
	mAttributes.Put("action", value)
	Return Me
End Sub

Public Sub hxGet (url As String) As Tag
	mAttributes.Put("hx-get", url)
	Return Me
End Sub

Public Sub hxPost (url As String) As Tag
	mAttributes.Put("hx-post", url)
	Return Me
End Sub

Public Sub hxPut (url As String) As Tag
	mAttributes.Put("hx-put", url)
	Return Me
End Sub

Public Sub hxPatch (url As String) As Tag
	mAttributes.Put("hx-patch", url)
	Return Me
End Sub

Public Sub hxDelete (url As String) As Tag
	mAttributes.Put("hx-delete", url)
	Return Me
End Sub

Public Sub hxSwap (name As String) As Tag
	mAttributes.Put("hx-swap", name)
	Return Me
End Sub

Public Sub hxTarget (name As String) As Tag
	mAttributes.Put("hx-target", name)
	Return Me
End Sub

Public Sub hxTrigger (eventname As String) As Tag
	mAttributes.Put("hx-trigger", eventname)
	Return Me
End Sub

Public Sub hxIndicator (name As String) As Tag
	mAttributes.Put("hx-indicator", name)
	Return Me
End Sub

Public Sub hxConfirm (value As String) As Tag
	mAttributes.Put("hx-confirm", value)
	Return Me
End Sub

Public Sub hxDisable As Tag
	mAttributes.Put("hx-disable", "")
	Return Me
End Sub

Public Sub hxHistory (value As String) As Tag
	mAttributes.Put("hx-history", value)
	Return Me
End Sub

Public Sub hxBoost (value As String) As Tag
	mAttributes.Put("hx-boost", value)
	Return Me
End Sub

Public Sub hxPushUrl (value As String) As Tag
	mAttributes.Put("hx-push-url", value)
	Return Me
End Sub

Public Sub hxExt (name As String) As Tag
	mAttributes.Put("hx-ext", name)
	Return Me
End Sub

Public Sub hxSync (name As String) As Tag
	mAttributes.Put("hx-sync", name)
	Return Me
End Sub

Public Sub hxSwapOob (value As String) As Tag
	mAttributes.Put("hx-swap-oob", value)
	Return Me
End Sub