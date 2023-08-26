package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class SearchFilter implements FilterComparable<Tuple2<PlaylistSong, IItemIdentifier>> {
    private Context context;

    public SearchFilter(Context context) {
        this.context = context;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public String preProcessQuery(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public void preProcessItem(Tuple2<PlaylistSong, IItemIdentifier> tuple2) {
        tuple2.obj1.getData();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public boolean compare(String str, Tuple2<PlaylistSong, IItemIdentifier> tuple2) {
        PlaylistSong.Data dataBlocking = tuple2.obj1.getDataBlocking(this.context);
        if (dataBlocking != null) {
            return dataBlocking.artistName.toLowerCase().contains(str) || dataBlocking.trackName.toLowerCase().contains(str);
        }
        return false;
    }
}
