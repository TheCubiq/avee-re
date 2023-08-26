package com.daaw.avee.comp.LibraryQueueUI;

import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.comp.IceCast.StationEntry;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class StationSortingUtils {
    static Comparator<Tuple2<PlaylistSong, StationEntry>> comparatorName = new Comparator<Tuple2<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils.1
        @Override // java.util.Comparator
        public int compare(Tuple2<PlaylistSong, StationEntry> tuple2, Tuple2<PlaylistSong, StationEntry> tuple22) {
            return tuple2.obj2.name.compareTo(tuple22.obj2.name);
        }
    };
    static Comparator<Tuple2<PlaylistSong, StationEntry>> comparatorPath = new Comparator<Tuple2<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils.2
        @Override // java.util.Comparator
        public int compare(Tuple2<PlaylistSong, StationEntry> tuple2, Tuple2<PlaylistSong, StationEntry> tuple22) {
            return tuple2.obj2.url.compareTo(tuple22.obj2.url);
        }
    };
    static Comparator<Tuple2<PlaylistSong, StationEntry>> comparatorBitrate = new Comparator<Tuple2<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils.3
        @Override // java.util.Comparator
        public int compare(Tuple2<PlaylistSong, StationEntry> tuple2, Tuple2<PlaylistSong, StationEntry> tuple22) {
            return StationSortingUtils.Long_compare(tuple2.obj2.bitrate, tuple22.obj2.bitrate);
        }
    };

    static int Long_compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static Comparator<Tuple2<PlaylistSong, StationEntry>> getSortComparator(SortDesign.SortDesc sortDesc) {
        return getSortComparator_(sortDesc, sortDesc.sortModeIndex);
    }

    public static Comparator<Tuple2<PlaylistSong, StationEntry>> getSortComparator(SortDesign.SortDesc sortDesc, int i) {
        if (sortDesc.sortModeIndex != 8) {
            i = sortDesc.sortModeIndex;
        }
        return getSortComparator_(sortDesc, i);
    }

    public static Comparator<Tuple2<PlaylistSong, StationEntry>> getSortComparator_(SortDesign.SortDesc sortDesc, int i) {
        Comparator<Tuple2<PlaylistSong, StationEntry>> comparator = null;
        if (sortDesc == null) {
            return null;
        }
        boolean z = sortDesc.sortDescending;
        if (i == 0) {
            comparator = comparatorName;
        } else if (i == 3) {
            comparator = comparatorPath;
        } else {
            switch (i) {
                case 9:
                    comparator = comparatorBitrate;
                    break;
            }
        }
        return (comparator == null || !z) ? comparator : Collections.reverseOrder(comparator);
    }
}
