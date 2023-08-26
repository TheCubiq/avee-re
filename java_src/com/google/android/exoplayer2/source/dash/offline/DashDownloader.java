package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest, RepresentationKey> {
    public DashDownloader(Uri uri, List<RepresentationKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public DashManifest getManifest(DataSource dataSource, Uri uri) throws IOException {
        return DashUtil.loadManifest(dataSource, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws InterruptedException, IOException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long msToUs = C.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), msToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<SegmentDownloader.Segment> arrayList) throws IOException, InterruptedException {
        DashSegmentIndex segmentIndex;
        AdaptationSet adaptationSet2 = adaptationSet;
        int i = 0;
        while (i < adaptationSet2.representations.size()) {
            Representation representation = adaptationSet2.representations.get(i);
            try {
            } catch (IOException e) {
                e = e;
            }
            try {
                segmentIndex = getSegmentIndex(dataSource, adaptationSet2.type, representation);
            } catch (IOException e2) {
                e = e2;
                if (z) {
                    throw e;
                }
                i++;
                adaptationSet2 = adaptationSet;
            }
            if (segmentIndex == null) {
                try {
                    throw new DownloadException("Missing segment index");
                    break;
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                    }
                }
            } else {
                int segmentCount = segmentIndex.getSegmentCount(j2);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                String str = representation.baseUrl;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    addSegment(j, str, initializationUri, arrayList);
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    addSegment(j, str, indexUri, arrayList);
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j3 = (segmentCount + firstSegmentNum) - 1;
                while (firstSegmentNum <= j3) {
                    addSegment(j + segmentIndex.getTimeUs(firstSegmentNum), str, segmentIndex.getSegmentUrl(firstSegmentNum), arrayList);
                    firstSegmentNum++;
                }
                i++;
                adaptationSet2 = adaptationSet;
            }
        }
    }

    private static void addSegment(long j, String str, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> arrayList) {
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, null)));
    }

    private static DashSegmentIndex getSegmentIndex(DataSource dataSource, int i, Representation representation) throws IOException, InterruptedException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex loadChunkIndex = DashUtil.loadChunkIndex(dataSource, i, representation);
        if (loadChunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(loadChunkIndex, representation.presentationTimeOffsetUs);
    }
}
