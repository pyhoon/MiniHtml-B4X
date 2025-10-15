B4J=true
Group=Modules
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@

Private Sub Process_Globals
	Private Const tagname As String = "meta"
End Sub

Public Sub init As Tag
	Return Html.create(tagname)
End Sub

Public Sub Attr (key As String, value As String) As Tag
	Return init.Attr(key, value)
End Sub

Public Sub Attr2 (keyvals As Map) As Tag
	Return init.Attr2(keyvals)
End Sub

Public Sub up (Parent As Tag) As Tag
	Return init.up(Parent)
End Sub