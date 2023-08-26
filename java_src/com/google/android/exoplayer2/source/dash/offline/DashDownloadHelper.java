package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
/* loaded from: classes.dex */
public final class DashDownloadHelper extends DownloadHelper {
    @MonotonicNonNull
    private DashManifest manifest;
    private final DataSource.Factory manifestDataSourceFactory;
    private final Uri uri;

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public /* bridge */ /* synthetic */ DownloadAction getDownloadAction(byte[] bArr, List list) {
        return getDownloadAction(bArr, (List<TrackKey>) list);
    }

    public DashDownloadHelper(Uri uri, DataSource.Factory factory) {
        this.uri = uri;
        this.manifestDataSourceFactory = factory;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    protected void prepareInternal() throws IOException {
        this.manifest = (DashManifest) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new DashManifestParser(), this.uri);
    }

    public DashManifest getManifest() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest.getPeriodCount();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i) {
        Assertions.checkNotNull(this.manifest);
        List<AdaptationSet> list = this.manifest.getPeriod(i).adaptationSets;
        int size = list.size();
        TrackGroup[] trackGroupArr = new TrackGroup[size];
        for (int i2 = 0; i2 < size; i2++) {
            List<Representation> list2 = list.get(i2).representations;
            Format[] formatArr = new Format[list2.size()];
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                formatArr[i3] = list2.get(i3).format;
            }
            trackGroupArr[i2] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public DashDownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list) {
        return new DashDownloadAction(this.uri, false, bArr, toRepresentationKeys(list));
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public DashDownloadAction getRemoveAction(byte[] bArr) {
        return new DashDownloadAction(this.uri, true, bArr, Collections.emptyList());
    }

    private static List<RepresentationKey> toRepresentationKeys(List<TrackKey> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TrackKey trackKey = list.get(i);
            arrayList.add(new RepresentationKey(trackKey.periodIndex, trackKey.groupIndex, trackKey.trackIndex));
        }
        return arrayList;
    }
}
