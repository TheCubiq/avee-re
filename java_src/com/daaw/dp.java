package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class dp extends ef {
    public byte[] i;
    public int j;
    public volatile boolean k;

    public dp(mp mpVar, pp ppVar, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(mpVar, ppVar, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = bArr;
    }

    @Override // com.daaw.jk0.c
    public final void a() {
        try {
            this.h.c(this.a);
            int i = 0;
            this.j = 0;
            while (i != -1 && !this.k) {
                g();
                i = this.h.b(this.i, this.j, 16384);
                if (i != -1) {
                    this.j += i;
                }
            }
            if (!this.k) {
                e(this.i, this.j);
            }
        } finally {
            sq1.h(this.h);
        }
    }

    @Override // com.daaw.jk0.c
    public final void b() {
        this.k = true;
    }

    @Override // com.daaw.ef
    public long c() {
        return this.j;
    }

    public abstract void e(byte[] bArr, int i);

    public byte[] f() {
        return this.i;
    }

    public final void g() {
        byte[] bArr = this.i;
        if (bArr == null) {
            this.i = new byte[16384];
        } else if (bArr.length < this.j + 16384) {
            this.i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
