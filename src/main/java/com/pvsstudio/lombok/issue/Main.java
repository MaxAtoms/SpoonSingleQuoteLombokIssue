package com.pvsstudio.lombok.issue;

import spoon.MavenLauncher;
import spoon.reflect.CtModel;

public class Main {
    public static void main(String[] args) {
        MavenLauncher launcher = new MavenLauncher(
            ".",
            MavenLauncher.SOURCE_TYPE.APP_SOURCE);

        CtModel model = launcher.buildModel();

        System.out.println("Hello world!");
    }
}