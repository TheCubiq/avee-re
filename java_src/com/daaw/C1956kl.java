package com.daaw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.daaw.kl */
/* loaded from: classes.dex */
public class C1956kl {

    /* renamed from: e */
    public static final Map<String, Lock> f16440e = new HashMap();

    /* renamed from: a */
    public final File f16441a;

    /* renamed from: b */
    public final Lock f16442b;

    /* renamed from: c */
    public final boolean f16443c;

    /* renamed from: d */
    public FileChannel f16444d;

    public C1956kl(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f16441a = file2;
        this.f16442b = m17678a(file2.getAbsolutePath());
        this.f16443c = z;
    }

    /* renamed from: a */
    public static Lock m17678a(String str) {
        Lock lock;
        Map<String, Lock> map = f16440e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void m17677b() {
        this.f16442b.lock();
        if (this.f16443c) {
            try {
                FileChannel channel = new FileOutputStream(this.f16441a).getChannel();
                this.f16444d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void m17676c() {
        FileChannel fileChannel = this.f16444d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f16442b.unlock();
    }
}
