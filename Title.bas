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
	tag1.Initialize("title")
	Return tag1
End Sub

Public Sub up (Parent As Tag) As Tag
	Dim tag1 As Tag
	tag1.Initialize("title") _
	.Uniline _
	.up(Parent)
	Return tag1
End Sub

Public Sub Text (value As String) As Tag
	Dim tag1 As Tag
	tag1.Initialize("title") _
	.ChangeMode("uniline") _
	.addText(value)
	Return tag1
End Sub