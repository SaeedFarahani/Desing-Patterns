package StrategyPattern;

import StatePattern.BrushTool;
import StatePattern.Canvas;
import StatePattern.EraserTool;
import StatePattern.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();

        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());

        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

    }
}
