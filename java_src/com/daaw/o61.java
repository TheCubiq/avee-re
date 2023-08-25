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

    /* renamed from: p */
    public final Context f21077p;

    /* renamed from: q */
    public final String f21078q;

    /* renamed from: r */
    public final File f21079r;

    /* renamed from: s */
    public final int f21080s;

    /* renamed from: t */
    public final ki1 f21081t;

    /* renamed from: u */
    public C2963sp f21082u;

    /* renamed from: v */
    public boolean f21083v;

    public o61(Context context, String str, File file, int i, ki1 ki1Var) {
        this.f21077p = context;
        this.f21078q = str;
        this.f21079r = file;
        this.f21080s = i;
        this.f21081t = ki1Var;
    }

    @Override // com.daaw.ki1
    /* renamed from: A */
    public synchronized ji1 mo14533A() {
        if (!this.f21083v) {
            m14530q();
            this.f21083v = true;
        }
        return this.f21081t.mo14533A();
    }

    @Override // com.daaw.ki1, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f21081t.close();
        this.f21083v = false;
    }

    /* renamed from: d */
    public final void m14532d(File file) {
        ReadableByteChannel channel;
        if (this.f21078q != null) {
            channel = Channels.newChannel(this.f21077p.getAssets().open(this.f21078q));
        } else if (this.f21079r == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            channel = new FileInputStream(this.f21079r).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f21077p.getCacheDir());
        createTempFile.deleteOnExit();
        j10.m19175a(channel, new FileOutputStream(createTempFile).getChannel());
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
        return this.f21081t.getDatabaseName();
    }

    /* renamed from: n */
    public void m14531n(C2963sp c2963sp) {
        this.f21082u = c2963sp;
    }

    /* renamed from: q */
    public final void m14530q() {
        String databaseName = getDatabaseName();
        File databasePath = this.f21077p.getDatabasePath(databaseName);
        C2963sp c2963sp = this.f21082u;
        C1956kl c1956kl = new C1956kl(databaseName, this.f21077p.getFilesDir(), c2963sp == null || c2963sp.f26473j);
        try {
            c1956kl.m17677b();
            if (!databasePath.exists()) {
                try {
                    m14532d(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.f21082u == null) {
            } else {
                try {
                    int m8949c = C3104to.m8949c(databasePath);
                    int i = this.f21080s;
                    if (m8949c == i) {
                        return;
                    }
                    if (this.f21082u.m10096a(m8949c, i)) {
                        return;
                    }
                    if (this.f21077p.deleteDatabase(databaseName)) {
                        try {
                            m14532d(databasePath);
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
            c1956kl.m17676c();
        }
    }

    @Override // com.daaw.ki1
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f21081t.setWriteAheadLoggingEnabled(z);
    }
}
