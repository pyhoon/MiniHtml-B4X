B4J=true
Group=Modules
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@

Private Sub Process_Globals
	Private Const tagname As String = "p"
End Sub

Public Sub init As Tag
	Return Html.create(tagname)
End Sub

Public Sub Set (key As String, value As String) As Tag
	Return init.Set(key, value)
End Sub

Public Sub Set2 (keyvals As Map) As Tag
	Return init.Set2(keyvals)
End Sub

Public Sub up (Parent As Tag) As Tag
	Return init.up(Parent)
End Sub

Public Sub Text (value As String) As Tag
	Return init.Text(value)
End Sub

Public Sub addClass (value As String) As Tag
	Return init.addClass(value)
End Sub

Public Sub addStyle (value As String) As Tag
	Return init.addStyle(value)
End Sub

' same as addClass (experimental)
Public Sub cls (value As String) As Tag
	Return init.cls(value)
End Sub

' same as addStyle (experimental)
Public Sub sty (value As String) As Tag
	Return init.sty(value)
End Sub

'Set id attribute
Public Sub id (value As String) As Tag
	Return init.Set("id", value)
End Sub