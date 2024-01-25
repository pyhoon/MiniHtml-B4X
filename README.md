# MiniHtml-B4X
 Generate HTML from B4X code

## Sample:
```BASIC
Sub GenerateHtml
    Dim html As MiniHtml
    html.Initialize
    'html.Flat = True
    html.Text("#macro( header )")
    html.DocType
    html.Language("en")
    html.Comment(" velocity.vm ")
    html.Head
    html.Meta(html.Attrs(Array("http-equiv", "content"), Array("content-type", "text/html; charset=utf-8")))
    html.Meta(html.Attrs(Array("name", "content"), Array("viewport", "width=device-width, initial-scale=1")))
    html.Text("$csrf")
    html.Meta(html.Attrs(Array("name", "content"), Array("description", "")))
    html.Meta(html.Attrs(Array("name", "content"), Array("author", "")))
    html.Title("$APP_TITLE")
    html.Headx
    html.Body
    html.H1("Hello, World!")
    html.Img("/img/hello.png")
    html.Bodyx
    html.Htmlx
    Dim content As String = html.ToString
    Log(content)
End Sub
```

## Output:
```HTML
#macro( header )
<!DOCTYPE html>
<html lang="en">
<!-- velocity.vm -->
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    $csrf
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>$APP_TITLE</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <img src="/img/hello.png" />
</body>
</html>
```
