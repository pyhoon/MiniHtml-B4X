# MiniHtml-B4X
 Generate HTML from B4X code

## Sample:
```BASIC
Sub GenerateHtml
	Dim doc As Document
	doc.Initialize
	doc.Append("#macro( header )")
	doc.AppendDocType
	doc.Append(TAB)
	
	Dim html As Tag
	html.Initialize("html").addAttribute("lang", "en")
	html.comment(" velocity.vm ")
	Dim head1 As Tag
	head1.Initialize("head").up(html)
	head1.meta("charset", "UTF-8")
	head1.meta2(CreateMap("name": "viewport", "content": "width=device-width, initial-scale=1.0"))
	head1.meta2(CreateMap("http-equiv": "X-UA-Compatible", "content": "IE=edge"))
	head1.raw2("$csrf")
	head1.title("$APP_TITLE")
	head1.link(CreateMap("rel": "stylesheet", "href": "../styles/style.css"))
	head1.link(CreateMap("rel": "stylesheet", "href": "../styles/bootstrap.css"))

	Dim body1 As Tag
	body1.Initialize("body").addAttribute("class", "fixed-navbar fixed-sidebar").up(html)
	
	Dim main1 As Tag
	main1.Initialize("main").up(body1)
	Dim h1 As Tag
	h1.Initialize("h1").addText("Hello, World!").up(main1)
	Dim img1 As Tag
	img1.Initialize("img").addAttribute("src", "/img/hello.png").up(main1)
	Dim div1 As Tag
	div1.Initialize("div").addAttributes(CreateMap("id": "d1", "style": "color: blue;")).up(main1)

	Dim p1 As Tag
	p1.Initialize("p").addText("This is a paragraph").Uniline.up(div1)
	Dim div2 As Tag
	div2.Initialize("div").addAttributes(CreateMap("id": "d2", "disabled": "")).Uniline.addText("Test").up(div1)
	
	doc.Append(html.Build(-1))
	Dim content As String = doc.ToString
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
		<main>
			<h1>Hello, World!</h1>
			<img src="/img/hello.png" />
			<div id="d1" style="color: blue;">
				<p>This is a paragraph</p>
				<div id="d2" disabled>Test</div>
			</div>
		</main>
	</body>
</html>

```
