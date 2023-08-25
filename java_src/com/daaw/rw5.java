package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class rw5 extends sx5 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public rw5(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ov5(e, 2000);
                }
            }
            InputStream inputStream = this.g;
            int i3 = it5.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.h;
            if (j2 != -1) {
                this.h = j2 - read;
            }
            c(read);
            return read;
        }
        return -1;
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        try {
            Uri uri = pa6Var.a;
            this.f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            l(pa6Var);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(pa6Var.f) >= pa6Var.f) {
                long j = pa6Var.g;
                if (j != -1) {
                    this.h = j;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                m(pa6Var);
                return this.h;
            }
            throw new ov5(null, 2008);
        } catch (ov5 e) {
            throw e;
        } catch (IOException e2) {
            throw new ov5(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    k();
                }
            } catch (IOException e) {
                throw new ov5(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                k();
            }
            throw th;
        }
    }
}
