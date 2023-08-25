package com.daaw;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class kx6 extends sx5 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public InputStream i;
    public long j;
    public boolean k;

    public kx6(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new hw6(null, e, 2000);
                }
            }
            InputStream inputStream = this.i;
            int i3 = it5.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.j == -1) {
                    return -1;
                }
                throw new hw6("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j2 = this.j;
            if (j2 != -1) {
                this.j = j2 - read;
            }
            c(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    @Override // com.daaw.p46
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(com.daaw.pa6 r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kx6.g(com.daaw.pa6):long");
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.g;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            k();
                        }
                    }
                } catch (IOException e) {
                    throw new hw6(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new hw6(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new hw6(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    k();
                }
                throw th2;
            }
        }
    }
}
