package com.kreitek.service;

import com.kreitek.files.FileSystemItem;

import java.util.List;

public interface DirectoryOptions {
    //El método listFiles se externaliza aquí para el uso exclusivo del tratamiento de directorios
    List<FileSystemItem> listFiles();
}
