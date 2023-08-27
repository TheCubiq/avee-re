package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.StreamKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class SsDownloadAction extends SegmentDownloadAction<StreamKey> {
    private static final int VERSION = 0;
    private static final String TYPE = "ss";
    public static final DownloadAction.Deserializer DESERIALIZER = new SegmentDownloadAction.SegmentDownloadActionDeserializer<StreamKey>(TYPE, 0) { // from class: com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer
        public StreamKey readKey(DataInputStream dataInputStream) throws IOException {
            return new StreamKey(dataInputStream.readInt(), dataInputStream.readInt());
        }

        @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer
        protected DownloadAction createDownloadAction(Uri uri, boolean z, byte[] bArr, List<StreamKey> list) {
            return new SsDownloadAction(uri, z, bArr, list);
        }
    };

    public SsDownloadAction(Uri uri, boolean z, byte[] bArr, List<StreamKey> list) {
        super(TYPE, 0, uri, z, bArr, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.DownloadAction
    public SsDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new SsDownloader(this.uri, this.keys, downloaderConstructorHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloadAction
    public void writeKey(DataOutputStream dataOutputStream, StreamKey streamKey) throws IOException {
        dataOutputStream.writeInt(streamKey.streamElementIndex);
        dataOutputStream.writeInt(streamKey.trackIndex);
    }
}
