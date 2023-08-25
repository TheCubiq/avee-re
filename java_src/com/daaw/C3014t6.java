package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.daaw.t6 */
/* loaded from: classes.dex */
public final class C3014t6 implements InterfaceC2200mp {

    /* renamed from: a */
    public final AssetManager f27018a;

    /* renamed from: b */
    public final bn1<? super C3014t6> f27019b;

    /* renamed from: c */
    public Uri f27020c;

    /* renamed from: d */
    public InputStream f27021d;

    /* renamed from: e */
    public long f27022e;

    /* renamed from: f */
    public boolean f27023f;

    /* renamed from: com.daaw.t6$a */
    /* loaded from: classes.dex */
    public static final class C3015a extends IOException {
        public C3015a(IOException iOException) {
            super(iOException);
        }
    }

    public C3014t6(Context context, bn1<? super C3014t6> bn1Var) {
        this.f27018a = context.getAssets();
        this.f27019b = bn1Var;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f27022e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C3015a(e);
            }
        }
        int read = this.f27021d.read(bArr, i, i2);
        if (read == -1) {
            if (this.f27022e == -1) {
                return -1;
            }
            throw new C3015a(new EOFException());
        }
        long j2 = this.f27022e;
        if (j2 != -1) {
            this.f27022e = j2 - read;
        }
        bn1<? super C3014t6> bn1Var = this.f27019b;
        if (bn1Var != null) {
            bn1Var.mo16680a(this, read);
        }
        return read;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        try {
            Uri uri = c2570pp.f23115a;
            this.f27020c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f27018a.open(path, 1);
            this.f27021d = open;
            if (open.skip(c2570pp.f23118d) >= c2570pp.f23118d) {
                long j = c2570pp.f23119e;
                if (j != -1) {
                    this.f27022e = j;
                } else {
                    long available = this.f27021d.available();
                    this.f27022e = available;
                    if (available == 2147483647L) {
                        this.f27022e = -1L;
                    }
                }
                this.f27023f = true;
                bn1<? super C3014t6> bn1Var = this.f27019b;
                if (bn1Var != null) {
                    bn1Var.mo16678c(this, c2570pp);
                }
                return this.f27022e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C3015a(e);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        this.f27020c = null;
        try {
            try {
                InputStream inputStream = this.f27021d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C3015a(e);
            }
        } finally {
            this.f27021d = null;
            if (this.f27023f) {
                this.f27023f = false;
                bn1<? super C3014t6> bn1Var = this.f27019b;
                if (bn1Var != null) {
                    bn1Var.mo16679b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        return this.f27020c;
    }
}
