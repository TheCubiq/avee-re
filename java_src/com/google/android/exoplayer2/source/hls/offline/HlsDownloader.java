package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist, RenditionKey> {
    public HlsDownloader(Uri uri, List<RenditionKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public HlsPlaylist getManifest(DataSource dataSource, Uri uri) throws IOException {
        return loadManifest(dataSource, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (hlsPlaylist instanceof HlsMasterPlaylist) {
            HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) hlsPlaylist;
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.variants, arrayList);
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.audios, arrayList);
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.subtitles, arrayList);
        } else {
            arrayList.add(Uri.parse(hlsPlaylist.baseUri));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) loadManifest(dataSource, uri);
                arrayList2.add(new SegmentDownloader.Segment(hlsMediaPlaylist.startTimeUs, new DataSpec(uri)));
                HlsMediaPlaylist.Segment segment = null;
                List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                for (int i = 0; i < list.size(); i++) {
                    HlsMediaPlaylist.Segment segment2 = list.get(i);
                    HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                    if (segment3 != null && segment3 != segment) {
                        addSegment(arrayList2, hlsMediaPlaylist, segment3, hashSet);
                        segment = segment3;
                    }
                    addSegment(arrayList2, hlsMediaPlaylist, segment2, hashSet);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
                arrayList2.add(new SegmentDownloader.Segment(0L, new DataSpec(uri)));
            }
        }
        return arrayList2;
    }

    private static HlsPlaylist loadManifest(DataSource dataSource, Uri uri) throws IOException {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, 4, new HlsPlaylistParser());
        parsingLoadable.load();
        return (HlsPlaylist) parsingLoadable.getResult();
    }

    private static void addSegment(ArrayList<SegmentDownloader.Segment> arrayList, HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> hashSet) {
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        if (segment.fullSegmentEncryptionKeyUri != null) {
            Uri resolveToUri = UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.fullSegmentEncryptionKeyUri);
            if (hashSet.add(resolveToUri)) {
                arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(resolveToUri)));
            }
        }
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, null)));
    }

    private static void addResolvedUris(String str, List<HlsMasterPlaylist.HlsUrl> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(UriUtil.resolveToUri(str, list.get(i).url));
        }
    }
}
