package org.example.HW11;

public class Main {
    public static void main(String[] args) {
        VideoFile file = new VideoFile("example.ogg", new Buffer("RAW VIDEO DATA"));
        VideoConversionFacade converter = new VideoConversionFacade();
        VideoFile mp4File = converter.convert(file, "mp4");

        System.out.println("Result: " + mp4File.getName() + " [" + mp4File.getCodecType() + "]");
    }
}
