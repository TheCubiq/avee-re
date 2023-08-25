package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
/* loaded from: classes.dex */
public final class um6 extends sx5 {

    /* renamed from: e */
    public RandomAccessFile f29213e;

    /* renamed from: f */
    public Uri f29214f;

    /* renamed from: g */
    public long f29215g;

    /* renamed from: h */
    public boolean f29216h;

    public um6() {
        super(false);
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29215g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f29213e;
            int i3 = it5.f13991a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f29215g -= read;
                m9782c(read);
            }
            return read;
        } catch (IOException e) {
            throw new rl6(e, 2000);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 != false) goto L33;
     */
    @Override // com.daaw.p46
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1978g(pa6 pa6Var) {
        boolean m14206b;
        Uri uri = pa6Var.f22769a;
        this.f29214f = uri;
        m9780l(pa6Var);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f29213e = randomAccessFile;
            try {
                randomAccessFile.seek(pa6Var.f22774f);
                long j = pa6Var.f22775g;
                if (j == -1) {
                    j = this.f29213e.length() - pa6Var.f22774f;
                }
                this.f29215g = j;
                if (j >= 0) {
                    this.f29216h = true;
                    m9779m(pa6Var);
                    return this.f29215g;
                }
                throw new rl6(null, null, 2008);
            } catch (IOException e) {
                throw new rl6(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (it5.f13991a >= 21) {
                    m14206b = ok6.m14206b(e2.getCause());
                }
                i = 2005;
                throw new rl6(e2, i);
            }
            throw new rl6(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new rl6(e3, 2006);
        } catch (RuntimeException e4) {
            throw new rl6(e4, 2000);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f29214f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f29214f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f29213e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f29213e = null;
                if (this.f29216h) {
                    this.f29216h = false;
                    m9781k();
                }
            } catch (IOException e) {
                throw new rl6(e, 2000);
            }
        } catch (Throwable th) {
            this.f29213e = null;
            if (this.f29216h) {
                this.f29216h = false;
                m9781k();
            }
            throw th;
        }
    }
}
