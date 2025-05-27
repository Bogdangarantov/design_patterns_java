package org.example.HW11;

public class VideoConversionFacade {
    public VideoFile convert(VideoFile file, String format) {
        System.out.println("VideoConversionFacade: conversion started.");

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, file.getName(), destinationCodec);
        new AudioMixer().fix(intermediateResult, buffer);

        System.out.println("VideoConversionFacade: conversion completed.");
        return intermediateResult;
    }
}
