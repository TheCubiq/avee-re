package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsDownloadAction extends SegmentDownloadAction<RenditionKey> {
    private static final int VERSION = 0;
    private static final String TYPE = "hls";
    public static final DownloadAction.Deserializer DESERIALIZER = new SegmentDownloadAction.SegmentDownloadActionDeserializer<RenditionKey>(TYPE, 0) { // from class: com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer
        public RenditionKey readKey(DataInputStream dataInputStream) throws IOException {
            return new RenditionKey(dataInputStream.readInt(), dataInputStream.readInt());
        }

        @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer
        protected DownloadAction createDownloadAction(Uri uri, boolean z, byte[] bArr, List<RenditionKey> list) {
            return new HlsDownloadAction(uri, z, bArr, list);
        }
    };

    public HlsDownloadAction(Uri uri, boolean z, byte[] bArr, List<RenditionKey> list) {
        super(TYPE, 0, uri, z, bArr, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.DownloadAction
    public HlsDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new HlsDownloader(this.uri, this.keys, downloaderConstructorHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction
    public void writeKey(DataOutputStream dataOutputStream, RenditionKey renditionKey) throws IOException {
        dataOutputStream.writeInt(renditionKey.type);
        dataOutputStream.writeInt(renditionKey.trackIndex);
    }
}
