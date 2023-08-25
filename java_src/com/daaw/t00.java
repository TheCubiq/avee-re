package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class t00 implements InterfaceC2200mp {

    /* renamed from: a */
    public final bn1<? super t00> f26859a;

    /* renamed from: b */
    public RandomAccessFile f26860b;

    /* renamed from: c */
    public Uri f26861c;

    /* renamed from: d */
    public long f26862d;

    /* renamed from: e */
    public boolean f26863e;

    /* renamed from: com.daaw.t00$a */
    /* loaded from: classes.dex */
    public static class C3006a extends IOException {
        public C3006a(IOException iOException) {
            super(iOException);
        }
    }

    public t00(bn1<? super t00> bn1Var) {
        this.f26859a = bn1Var;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f26862d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f26860b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f26862d -= read;
                bn1<? super t00> bn1Var = this.f26859a;
                if (bn1Var != null) {
                    bn1Var.mo16680a(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new C3006a(e);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        try {
            this.f26861c = c2570pp.f23115a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c2570pp.f23115a.getPath(), "r");
            this.f26860b = randomAccessFile;
            randomAccessFile.seek(c2570pp.f23118d);
            long j = c2570pp.f23119e;
            if (j == -1) {
                j = this.f26860b.length() - c2570pp.f23118d;
            }
            this.f26862d = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.f26863e = true;
            bn1<? super t00> bn1Var = this.f26859a;
            if (bn1Var != null) {
                bn1Var.mo16678c(this, c2570pp);
            }
            return this.f26862d;
        } catch (IOException e) {
            throw new C3006a(e);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        this.f26861c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f26860b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C3006a(e);
            }
        } finally {
            this.f26860b = null;
            if (this.f26863e) {
                this.f26863e = false;
                bn1<? super t00> bn1Var = this.f26859a;
                if (bn1Var != null) {
                    bn1Var.mo16679b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        return this.f26861c;
    }
}
