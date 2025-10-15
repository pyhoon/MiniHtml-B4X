﻿B4J=true
Group=Modules
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@

Private Sub Process_Globals
	Private Const tagname As String = "head"
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

'Add to Parent and return this tag (child)
Public Sub up (Parent As Tag) As Tag
	Return init.up(Parent)
End Sub

Public Sub script (value As String) As Tag
	Return Html.create("script").Set("src", value)
End Sub

Public Sub script2 (value As String, keyvals As Map) As Tag
	Return Html.create("script").Set("src", value).Set2(keyvals)
End Sub