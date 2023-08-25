package com.daaw;

import android.content.Context;
import android.net.Uri;
/* loaded from: classes.dex */
public final class rq implements mp {
    public final Context a;
    public final bn1<? super mp> b;
    public final mp c;
    public mp d;
    public mp e;
    public mp f;
    public mp g;
    public mp h;
    public mp i;
    public mp j;

    public rq(Context context, bn1<? super mp> bn1Var, mp mpVar) {
        this.a = context.getApplicationContext();
        this.b = bn1Var;
        this.c = (mp) s6.e(mpVar);
    }

    public final mp a() {
        if (this.e == null) {
            this.e = new t6(this.a, this.b);
        }
        return this.e;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        return this.j.b(bArr, i, i2);
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        mp e;
        s6.f(this.j == null);
        String scheme = ppVar.a.getScheme();
        if (sq1.K(ppVar.a)) {
            if (!ppVar.a.getPath().startsWith("/android_asset/")) {
                e = g();
            }
            e = a();
        } else {
            if (!"asset".equals(scheme)) {
                e = "content".equals(scheme) ? e() : "rtmp".equals(scheme) ? i() : "data".equals(scheme) ? f() : "rawresource".equals(scheme) ? h() : this.c;
            }
            e = a();
        }
        this.j = e;
        return this.j.c(ppVar);
    }

    @Override // com.daaw.mp
    public void close() {
        mp mpVar = this.j;
        if (mpVar != null) {
            try {
                mpVar.close();
            } finally {
                this.j = null;
            }
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        mp mpVar = this.j;
        if (mpVar == null) {
            return null;
        }
        return mpVar.d();
    }

    public final mp e() {
        if (this.f == null) {
            this.f = new sk(this.a, this.b);
        }
        return this.f;
    }

    public final mp f() {
        if (this.h == null) {
            this.h = new lp();
        }
        return this.h;
    }

    public final mp g() {
        if (this.d == null) {
            this.d = new t00(this.b);
        }
        return this.d;
    }

    public final mp h() {
        if (this.i == null) {
            this.i = new i31(this.a, this.b);
        }
        return this.i;
    }

    public final mp i() {
        if (this.g == null) {
            try {
                this.g = (mp) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }
}
