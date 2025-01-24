B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@

Private Sub Process_Globals

End Sub

Public Sub AsTag As Tag
	Dim tag1 As Tag
	tag1.Initialize("link")
	Return tag1
End Sub

Public Sub up (Parent As Tag) As Tag
	Dim tag1 As Tag
	tag1.Initialize("link").up(Parent)
	Return tag1
End Sub

Public Sub Attribute (attrName As String, attrValue As String) As Tag
	Dim tag1 As Tag
	tag1.Initialize("link") _
	.addAttribute(attrName, attrValue)
	Return tag1
End Sub

Public Sub Attributes (attrs As Map) As Tag
	Dim tag1 As Tag
	tag1.Initialize("link") _
	.addAttributes(attrs)
	Return tag1
End Sub