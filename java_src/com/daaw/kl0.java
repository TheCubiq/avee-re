package com.daaw;

import java.io.Writer;
/* loaded from: classes.dex */
public final class kl0 extends Writer {

    /* renamed from: p */
    public final String f16445p;

    /* renamed from: q */
    public StringBuilder f16446q = new StringBuilder(128);

    public kl0(String str) {
        this.f16445p = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m17675d();
    }

    /* renamed from: d */
    public final void m17675d() {
        if (this.f16446q.length() > 0) {
            this.f16446q.toString();
            StringBuilder sb = this.f16446q;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m17675d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m17675d();
            } else {
                this.f16446q.append(c);
            }
        }
    }
}
