# MiniHtml-B4X
 Generate HTML from B4X code

## Sample:
```BASIC
Sub GenerateHtml
	Dim doc As MiniHtml
	doc.Initialize
	'doc.Flat = True
	doc.Text("#macro( header )")
	doc.DocType
	
	Dim html As Tag
	html.Initialize("html")
	
	html.addTag(html.CreateNoTag.addComment(" velocity.vm "))
	html.addAttribute("lang", "en")
	
	Dim head As Tag
	head.Initialize("head")
	
	html.CreateModeTag("meta") _
	.addAttribute("charset", "UTF-8") _
	.addTo(head)

	html.CreateModeTag("meta") _
	.addAttribute("name", "viewport") _
	.addAttribute2("content", Array As String("width=device-width", "initial-scale=1.0")) _
	.addTo(head)
	
	html.CreateModeTag("meta") _
	.addAttribute("http-equiv", "X-UA-Compatible") _
	.addAttribute("content", "IE=edge") _
	.addTo(head)
	
	html.CreateNoTag _
	.addRaw("$csrf") _
	.addTo(head)

	html.CreateModeTag("title") _
	.addText("$APP_TITLE") _
	.addTo(head)
	
	Dim stylesheets() As String = Array As String("../styles/style.css", "../styles/bootstrap.css")
	
	For Each style In stylesheets
		html.CreateModeTag("link") _
		.addAttribute("rel", "stylesheet") _
		.addAttribute("href", style) _
		.addTo(head)
	Next
	html.addTag(head)
	
	Dim body As Tag
	body.Initialize("body")
	body.addAttribute("class", "fixed-navbar fixed-sidebar")
	
	html.CreateTag("h1", html.mUniline).addText("Hello, World!").addTo(body)
	html.CreateTag("img", html.mUniline).addAttribute("src", "/img/hello.png").specialMode("link").addTo(body)
	Dim div1 As Tag = html.CreateTag("div", html.mNormal).addAttribute("id", "d1").addAttribute("style", "color: blue;")
	div1.addTo(body)
	Dim div2 As Tag = html.CreateTag("div", html.mUniline).addAttribute("id", "d2").addText("Test").addAttribute("disabled", "")
	div2.addTo(div1)
	
	body.addTo(html)
	
	doc.Text(html.Build(-1))

	Dim content As String = doc.ToString
	Log(content)
	File.WriteString(File.DirApp, "velocity.html", content)
End Sub
```

## Output:
```HTML
#macro( header )
<!DOCTYPE html>

<html lang="en">
	<!-- velocity.vm -->
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		$csrf
		<title>$APP_TITLE</title>
		<link rel="stylesheet" href="../styles/style.css" />
		<link rel="stylesheet" href="../styles/bootstrap.css" />
	</head>
	<body class="fixed-navbar fixed-sidebar">
		<h1>Hello, World!</h1>
		<img src="/img/hello.png" />
		<div id="d1" style="color: blue;">
			<div id="d2" disabled>Test</div>
		</div>
	</body>
</html>
```
