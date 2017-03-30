# 8ball
### Demo
```text
scheme default:
	AG: "#005682"
	TG: "#e00707"
end

page (title: "Vriska: Do something."):

	flash "animation.swf" (width: 300, height: 300)
	
	image "vriska.png" (width: 500, height: auto)
	
	text "Hello world!"
	
	log "Pesterlog" (colors: default):
		AG: "Sample text"
	end

end
```

### Converting a .8b script to HTML
```java
EightBallScript script = EightBallScript.from("some/file.8b");
script.writeToFolder(new File("some/directory"));
```

That's all you need. CSS and JS will be copied to this directory as well.