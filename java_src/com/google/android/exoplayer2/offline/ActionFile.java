package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class ActionFile {
    static final int VERSION = 0;
    private final File actionFile;
    private final AtomicFile atomicFile;

    public ActionFile(File file) {
        this.actionFile = file;
        this.atomicFile = new AtomicFile(file);
    }

    public DownloadAction[] load(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (this.actionFile.exists()) {
            try {
                InputStream openRead = this.atomicFile.openRead();
                DataInputStream dataInputStream = new DataInputStream(openRead);
                int readInt = dataInputStream.readInt();
                if (readInt > 0) {
                    throw new IOException("Unsupported action file version: " + readInt);
                }
                int readInt2 = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    downloadActionArr[i] = DownloadAction.deserializeFromStream(deserializerArr, dataInputStream);
                }
                Util.closeQuietly(openRead);
                return downloadActionArr;
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) null);
                throw th;
            }
        }
        return new DownloadAction[0];
    }

    public void store(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.atomicFile.startWrite());
            try {
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(downloadActionArr.length);
                for (DownloadAction downloadAction : downloadActionArr) {
                    DownloadAction.serializeToStream(downloadAction, dataOutputStream2);
                }
                this.atomicFile.endWrite(dataOutputStream2);
                Util.closeQuietly((Closeable) null);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                Util.closeQuietly(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
