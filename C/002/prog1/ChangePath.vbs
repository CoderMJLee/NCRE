currPath= WScript.Arguments(0)
Wscript.Echo currPath

targetFile= currPath&"\PROG1.C"
Set objFSO = CreateObject("Scripting.FileSystemObject")
If objFSO.FileExists(targetFile)=false then
   wscript.Quit
end If
'reading
Set objFile = objFSO.OpenTextFile(targetFile, 1)
strText = objFile.ReadAll
objFile.Close

currPath=Replace(currPath,"\","\\")
strNewText = Replace(strText,"c:\\test",currPath)
'writing
set objFile = objFSO.OpenTextFile(targetFile, 2)
objFile.WriteLine strNewText
objFile.Close
'É¾³ý
objFSO.DeleteFile WScript.ScriptFullName
