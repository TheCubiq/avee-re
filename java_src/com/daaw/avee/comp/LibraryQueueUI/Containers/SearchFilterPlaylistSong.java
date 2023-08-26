package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class SearchFilterPlaylistSong implements FilterComparable<PlaylistSong> {
    private Context context;

    public SearchFilterPlaylistSong(Context context) {
        this.context = context;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public String preProcessQuery(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public void preProcessItem(PlaylistSong playlistSong) {
        playlistSong.getData();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public boolean compare(String str, PlaylistSong playlistSong) {
        PlaylistSong.Data dataBlocking = playlistSong.getDataBlocking(this.context);
        if (dataBlocking != null) {
            return dataBlocking.artistName.toLowerCase().contains(str) || dataBlocking.trackName.toLowerCase().contains(str);
        }
        return false;
    }
}
