package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public class o61 implements ki1 {
    public final Context p;
    public final String q;
    public final File r;
    public final int s;
    public final ki1 t;
    public sp u;
    public boolean v;

    public o61(Context context, String str, File file, int i, ki1 ki1Var) {
        this.p = context;
        this.q = str;
        this.r = file;
        this.s = i;
        this.t = ki1Var;
    }

    @Override // com.daaw.ki1
    public synchronized ji1 A() {
        if (!this.v) {
            q();
            this.v = true;
        }
        return this.t.A();
    }

    @Override // com.daaw.ki1, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.t.close();
        this.v = false;
    }

    public final void d(File file) {
        ReadableByteChannel channel;
        if (this.q != null) {
            channel = Channels.newChannel(this.p.getAssets().open(this.q));
        } else if (this.r == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            channel = new FileInputStream(this.r).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.p.getCacheDir());
        createTempFile.deleteOnExit();
        j10.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (createTempFile.renameTo(file)) {
        } else {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    @Override // com.daaw.ki1
    public String getDatabaseName() {
        return this.t.getDatabaseName();
    }

    public void n(sp spVar) {
        this.u = spVar;
    }

    public final void q() {
        String databaseName = getDatabaseName();
        File databasePath = this.p.getDatabasePath(databaseName);
        sp spVar = this.u;
        kl klVar = new kl(databaseName, this.p.getFilesDir(), spVar == null || spVar.j);
        try {
            klVar.b();
            if (!databasePath.exists()) {
                try {
                    d(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.u == null) {
            } else {
                try {
                    int c = to.c(databasePath);
                    int i = this.s;
                    if (c == i) {
                        return;
                    }
                    if (this.u.a(c, i)) {
                        return;
                    }
                    if (this.p.deleteDatabase(databaseName)) {
                        try {
                            d(databasePath);
                        } catch (IOException unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to delete database file (");
                        sb.append(databaseName);
                        sb.append(") for a copy destructive migration.");
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            klVar.c();
        }
    }

    @Override // com.daaw.ki1
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.t.setWriteAheadLoggingEnabled(z);
    }
}
