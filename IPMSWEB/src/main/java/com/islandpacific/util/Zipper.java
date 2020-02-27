package com.islandpacific.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipper {
    private List<String> fileList = new ArrayList<String>();

    public static  void Zip() throws Exception {
    	
    	String fileName = System.getProperty("user.dir") +"/Archive";

        Path path = Paths.get(fileName);

        if (!Files.exists(path)) {
            
            Files.createDirectory(path);
            
        } 
        
        else {
            
           
        }
        String dir = (System.getProperty("user.dir") +"/ScreenRecordings");
        String zipFile = (System.getProperty("user.dir") +"/Archive/ScreenRecordings.zip");


        Zipper zip = new Zipper();
        zip.compressDirectory(dir, zipFile);
    }

    private void compressDirectory(String dir, String zipFile) {
        File directory = new File(dir);
        getFileList(directory);

        try {
            FileOutputStream fos  = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);

            for (String filePath : fileList) {
             

                //
                // Creates a zip entry.
                //
                String name = filePath.substring(directory.getAbsolutePath().length() + 1,
                        filePath.length());
                ZipEntry zipEntry = new ZipEntry(name);
                zos.putNextEntry(zipEntry);

                //
                // Read file content and write to zip output stream.
                //
                FileInputStream fis = new FileInputStream(filePath);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }

                //
                // Close the zip entry and the file input stream.
                //
                zos.closeEntry();
                fis.close();
            }

            //
            // Close zip output stream and file output stream. This will
            // complete the compression process.
            //
            zos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get files list from the directory recursive to the sub directory.
     */
    private void getFileList(File directory) {
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getAbsolutePath());
                } else {
                    getFileList(file);
                }
            }
        }

    }
}