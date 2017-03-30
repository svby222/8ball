# 8ball scripts

(This project is not affiliated with mspaintadventures.com and is simply a "fan project".)

### Demo
```text
scheme default:
	AG: "#005682"
	TG: "#e00707"
end

page (title: "Vriska: Do something."):

	flash "animation.swf" (width: 500, height: 280)
	
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

#### Demo result
Results are available [here](https://1blustone.github.io/8ball/).
Flash animation credits go to [Davdus](https://github.com/Davdus)!

That's all you need. CSS and JS will be copied to this directory as well.