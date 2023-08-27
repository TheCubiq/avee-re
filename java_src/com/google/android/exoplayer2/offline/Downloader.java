package com.google.android.exoplayer2.offline;

import java.io.IOException;
/* loaded from: classes.dex */
public interface Downloader {
    void cancel();

    void download() throws InterruptedException, IOException;

    float getDownloadPercentage();

    long getDownloadedBytes();

    void remove() throws InterruptedException;
}
