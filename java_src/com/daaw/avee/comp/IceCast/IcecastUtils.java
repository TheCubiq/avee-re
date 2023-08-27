package com.daaw.avee.comp.IceCast;

import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.comp.IceCast.XiphYpXmlParser;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class IcecastUtils {
    public static IceCastDirectory<Tuple2<PlaylistSong, StationEntry>, MultiList<PlaylistSong, StationEntry>> getIcecastDirectory() {
        return new IceCastDirectory<>("http://dir.xiph.org/yp.xml", "xiph_org_yp", new XiphYpXmlParser.EntryFactory<Tuple2<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.IceCast.IcecastUtils.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.comp.IceCast.XiphYpXmlParser.EntryFactory
            public Tuple2<PlaylistSong, StationEntry> createEntry(String str, String str2, int i, String str3) {
                return new Tuple2<>(new PlaylistSong(-1L, str2, str, null), new StationEntry(str, str2, i, str3));
            }
        }, new MultiList.Factory());
    }
}
