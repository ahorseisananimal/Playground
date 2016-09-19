package com.example.helloworld;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"ForLoopReplaceableByForEach", "ConstantConditions"})
public class DirectoryComparison {
    public static void main(String[] args) throws IOException {
        File folderOne = new File("D1");
        File[] listOfFilesOne = folderOne.listFiles();
        File folderTwo = new File("D2");
        File[] listOfFilesTwo = folderTwo.listFiles();

        List<File> files = new ArrayList<>(Arrays.asList(listOfFilesOne));
        files.addAll(Arrays.asList(listOfFilesTwo));

        File outputFolder = new File("D3");
        if (!outputFolder.exists()) {
            outputFolder.mkdir();
        }

        for (int j = 0; j < files.size(); j++) {
            boolean uniq = true;
            for (int i = 0; i < files.size(); i++) {
                if (j != i && files.get(j).getName().equals(files.get(i).getName())) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                copyDirectory(files.get(j), new File("D3\\" + files.get(j).getName()));
            }
        }
    }

    public static void copyDirectory(File sourceLocation, File targetLocation)
            throws IOException {

        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (int i = 0; i < children.length; i++) {
                copyDirectory(new File(sourceLocation, children[i]),
                        new File(targetLocation, children[i]));
            }
        } else {

            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);

            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }
}
