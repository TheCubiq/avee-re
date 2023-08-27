package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.StreamKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
/* loaded from: classes.dex */
public final class SsDownloadHelper extends DownloadHelper {
    @MonotonicNonNull
    private SsManifest manifest;
    private final DataSource.Factory manifestDataSourceFactory;
    private final Uri uri;

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public /* bridge */ /* synthetic */ DownloadAction getDownloadAction(byte[] bArr, List list) {
        return getDownloadAction(bArr, (List<TrackKey>) list);
    }

    public SsDownloadHelper(Uri uri, DataSource.Factory factory) {
        this.uri = uri;
        this.manifestDataSourceFactory = factory;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    protected void prepareInternal() throws IOException {
        this.manifest = (SsManifest) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new SsManifestParser(), this.uri);
    }

    public SsManifest getManifest() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        Assertions.checkNotNull(this.manifest);
        return 1;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i) {
        Assertions.checkNotNull(this.manifest);
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        TrackGroup[] trackGroupArr = new TrackGroup[streamElementArr.length];
        for (int i2 = 0; i2 < streamElementArr.length; i2++) {
            trackGroupArr[i2] = new TrackGroup(streamElementArr[i2].formats);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public SsDownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list) {
        return new SsDownloadAction(this.uri, false, bArr, toStreamKeys(list));
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public SsDownloadAction getRemoveAction(byte[] bArr) {
        return new SsDownloadAction(this.uri, true, bArr, Collections.emptyList());
    }

    private static List<StreamKey> toStreamKeys(List<TrackKey> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TrackKey trackKey = list.get(i);
            arrayList.add(new StreamKey(trackKey.groupIndex, trackKey.trackIndex));
        }
        return arrayList;
    }
}
