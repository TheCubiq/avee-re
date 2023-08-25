package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class t6 implements mp {
    public final AssetManager a;
    public final bn1<? super t6> b;
    public Uri c;
    public InputStream d;
    public long e;
    public boolean f;

    /* loaded from: classes.dex */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public t6(Context context, bn1<? super t6> bn1Var) {
        this.a = context.getAssets();
        this.b = bn1Var;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int read = this.d.read(bArr, i, i2);
        if (read == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        bn1<? super t6> bn1Var = this.b;
        if (bn1Var != null) {
            bn1Var.a(this, read);
        }
        return read;
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        try {
            Uri uri = ppVar.a;
            this.c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.a.open(path, 1);
            this.d = open;
            if (open.skip(ppVar.d) >= ppVar.d) {
                long j = ppVar.e;
                if (j != -1) {
                    this.e = j;
                } else {
                    long available = this.d.available();
                    this.e = available;
                    if (available == 2147483647L) {
                        this.e = -1L;
                    }
                }
                this.f = true;
                bn1<? super t6> bn1Var = this.b;
                if (bn1Var != null) {
                    bn1Var.c(this, ppVar);
                }
                return this.e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.mp
    public void close() {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.d = null;
            if (this.f) {
                this.f = false;
                bn1<? super t6> bn1Var = this.b;
                if (bn1Var != null) {
                    bn1Var.b(this);
                }
            }
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        return this.c;
    }
}
