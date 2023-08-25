package com.daaw;

import java.io.Writer;
/* loaded from: classes.dex */
public final class kl0 extends Writer {
    public final String p;
    public StringBuilder q = new StringBuilder(128);

    public kl0(String str) {
        this.p = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.q.length() > 0) {
            this.q.toString();
            StringBuilder sb = this.q;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                d();
            } else {
                this.q.append(c);
            }
        }
    }
}
