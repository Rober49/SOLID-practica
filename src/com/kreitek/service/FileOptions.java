package com.kreitek.service;

import com.kreitek.files.FileSystemItem;

public interface FileOptions {
    //Aquí estarían los métodos de la clase FileSystemItem que pertenecen al tratamiento de ficheros
    String getExtension();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
