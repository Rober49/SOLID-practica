package com.kreitek.files;

import java.util.List;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    int getSize();
    //El método listFiles debería ir en una clase aparte, exclusiva para directorios

    List<FileSystemItem> listFiles();

    //Todos los métodos de aquí debajo deberían externalizarse, en una clase exclusiva para ficheros

    String getExtension();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
