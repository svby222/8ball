package net.blustone.eightball;

import net.blustone.eightball.model.EightBallScript;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        EightBallScript script = EightBallScript.from("G:/8ball-test/test.8b");
        script.writeToFolder(new File("G:/8ball-test/"));
    }

}
