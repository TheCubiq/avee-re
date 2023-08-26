package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {
    public final List<HlsUrl> audios;
    public final Format muxedAudioFormat;
    public final List<Format> muxedCaptionFormats;
    public final List<HlsUrl> subtitles;
    public final List<HlsUrl> variants;

    /* loaded from: classes.dex */
    public static final class HlsUrl {
        public final Format format;
        public final String url;

        public static HlsUrl createMediaPlaylistHlsUrl(String str) {
            return new HlsUrl(str, Format.createContainerFormat("0", MimeTypes.APPLICATION_M3U8, null, null, -1, 0, null));
        }

        public HlsUrl(String str, Format format) {
            this.url = str;
            this.format = format;
        }
    }

    public HlsMasterPlaylist(String str, List<String> list, List<HlsUrl> list2, List<HlsUrl> list3, List<HlsUrl> list4, Format format, List<Format> list5) {
        super(str, list);
        this.variants = Collections.unmodifiableList(list2);
        this.audios = Collections.unmodifiableList(list3);
        this.subtitles = Collections.unmodifiableList(list4);
        this.muxedAudioFormat = format;
        this.muxedCaptionFormats = list5 != null ? Collections.unmodifiableList(list5) : null;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy */
    public HlsPlaylist copy2(List<RenditionKey> list) {
        return new HlsMasterPlaylist(this.baseUri, this.tags, copyRenditionsList(this.variants, 0, list), copyRenditionsList(this.audios, 1, list), copyRenditionsList(this.subtitles, 2, list), this.muxedAudioFormat, this.muxedCaptionFormats);
    }

    public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String str) {
        List singletonList = Collections.singletonList(HlsUrl.createMediaPlaylistHlsUrl(str));
        List emptyList = Collections.emptyList();
        return new HlsMasterPlaylist(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
    }

    private static List<HlsUrl> copyRenditionsList(List<HlsUrl> list, int i, List<RenditionKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            HlsUrl hlsUrl = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    RenditionKey renditionKey = list2.get(i3);
                    if (renditionKey.type == i && renditionKey.trackIndex == i2) {
                        arrayList.add(hlsUrl);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }
}
