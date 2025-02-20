package com.pksv.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove Sub-Folders from the Filesystem
public class RemoveSubFolders {
    public static void main(String[] args) {
        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        System.out.printf(new RemoveSubFolders().removeSubfolders(folder).toString());
    }

    public List<String> removeSubfolders(String[] folder) {
        List<String> result = new ArrayList<>();
        Arrays.sort(folder);
        result.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(result.getLast() + "/")) {
                result.addLast(folder[i]);
            }
        }
        return result;
    }
}
