package com.daaw.avee.comp.LibraryQueueUI;

import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class FileSortingUtils {
    static Comparator<ContainerFile.Item> comparatorName = new Comparator<ContainerFile.Item>() { // from class: com.daaw.avee.comp.LibraryQueueUI.FileSortingUtils.1
        @Override // java.util.Comparator
        public int compare(ContainerFile.Item item, ContainerFile.Item item2) {
            return item.getName().compareTo(item2.getName());
        }
    };
    static Comparator<ContainerFile.Item> comparatorPath = new Comparator<ContainerFile.Item>() { // from class: com.daaw.avee.comp.LibraryQueueUI.FileSortingUtils.2
        @Override // java.util.Comparator
        public int compare(ContainerFile.Item item, ContainerFile.Item item2) {
            return item.getPath().compareTo(item2.getPath());
        }
    };
    static Comparator<ContainerFile.Item> comparatorDateModified = new Comparator<ContainerFile.Item>() { // from class: com.daaw.avee.comp.LibraryQueueUI.FileSortingUtils.3
        @Override // java.util.Comparator
        public int compare(ContainerFile.Item item, ContainerFile.Item item2) {
            return FileSortingUtils.Long_compare(item.getLastModified(), item2.getLastModified());
        }
    };
    static Comparator<ContainerFile.Item> comparatorSize = new Comparator<ContainerFile.Item>() { // from class: com.daaw.avee.comp.LibraryQueueUI.FileSortingUtils.4
        @Override // java.util.Comparator
        public int compare(ContainerFile.Item item, ContainerFile.Item item2) {
            return FileSortingUtils.Long_compare(item.getCountOrSize(), item2.getCountOrSize());
        }
    };

    static int Long_compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static Comparator<ContainerFile.Item> getSortComparator(SortDesign.SortDesc sortDesc) {
        return getSortComparator_(sortDesc, sortDesc.sortModeIndex);
    }

    public static Comparator<ContainerFile.Item> getSortComparator(SortDesign.SortDesc sortDesc, int i) {
        if (sortDesc.sortModeIndex != 8) {
            i = sortDesc.sortModeIndex;
        }
        return getSortComparator_(sortDesc, i);
    }

    public static Comparator<ContainerFile.Item> getSortComparator_(SortDesign.SortDesc sortDesc, int i) {
        Comparator<ContainerFile.Item> comparator = null;
        if (sortDesc == null) {
            return null;
        }
        boolean z = sortDesc.sortDescending;
        switch (sortDesc.sortModeIndex) {
            case 0:
                comparator = comparatorName;
                break;
            case 1:
                comparator = comparatorName;
                break;
            case 2:
                comparator = comparatorName;
                break;
            case 3:
                comparator = comparatorPath;
                break;
            case 4:
                comparator = comparatorDateModified;
                z = !z;
                break;
            case 5:
                comparator = comparatorDateModified;
                z = !z;
                break;
            case 6:
                comparator = comparatorSize;
                z = !z;
                break;
            case 7:
                comparator = comparatorSize;
                z = !z;
                break;
            case 8:
                comparator = comparatorName;
                break;
        }
        return (comparator == null || !z) ? comparator : Collections.reverseOrder(comparator);
    }
}
