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

    /* renamed from: e */
    public final AssetManager f25672e;

    /* renamed from: f */
    public Uri f25673f;

    /* renamed from: g */
    public InputStream f25674g;

    /* renamed from: h */
    public long f25675h;

    /* renamed from: i */
    public boolean f25676i;

    public rw5(Context context) {
        super(false);
        this.f25672e = context.getAssets();
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25675h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ov5(e, 2000);
                }
            }
            InputStream inputStream = this.f25674g;
            int i3 = it5.f13991a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.f25675h;
            if (j2 != -1) {
                this.f25675h = j2 - read;
            }
            m9782c(read);
            return read;
        }
        return -1;
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        try {
            Uri uri = pa6Var.f22769a;
            this.f25673f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m9780l(pa6Var);
            InputStream open = this.f25672e.open(path, 1);
            this.f25674g = open;
            if (open.skip(pa6Var.f22774f) >= pa6Var.f22774f) {
                long j = pa6Var.f22775g;
                if (j != -1) {
                    this.f25675h = j;
                } else {
                    long available = this.f25674g.available();
                    this.f25675h = available;
                    if (available == 2147483647L) {
                        this.f25675h = -1L;
                    }
                }
                this.f25676i = true;
                m9779m(pa6Var);
                return this.f25675h;
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
        return this.f25673f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f25673f = null;
        try {
            try {
                InputStream inputStream = this.f25674g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f25674g = null;
                if (this.f25676i) {
                    this.f25676i = false;
                    m9781k();
                }
            } catch (IOException e) {
                throw new ov5(e, 2000);
            }
        } catch (Throwable th) {
            this.f25674g = null;
            if (this.f25676i) {
                this.f25676i = false;
                m9781k();
            }
            throw th;
        }
    }
}
