package com.daaw;

import android.net.Uri;
import com.daaw.b00;
import com.daaw.bp0;
import com.daaw.mp;
/* loaded from: classes.dex */
public final class c00 extends ua implements b00.e {
    public final Object A;
    public long B;
    public boolean C;
    public final Uri u;
    public final mp.a v;
    public final e00 w;
    public final int x;
    public final String y;
    public final int z;

    /* loaded from: classes.dex */
    public static final class b {
        public final mp.a a;
        public e00 b;
        public String c;
        public Object d;
        public int e = -1;
        public int f = 1048576;
        public boolean g;

        public b(mp.a aVar) {
            this.a = aVar;
        }

        public c00 a(Uri uri) {
            this.g = true;
            if (this.b == null) {
                this.b = new xq();
            }
            return new c00(uri, this.a, this.b, this.e, this.c, this.f, this.d);
        }
    }

    public c00(Uri uri, mp.a aVar, e00 e00Var, int i, String str, int i2, Object obj) {
        this.u = uri;
        this.v = aVar;
        this.w = e00Var;
        this.x = i;
        this.y = str;
        this.z = i2;
        this.B = -9223372036854775807L;
        this.A = obj;
    }

    @Override // com.daaw.bp0
    public void a(qo0 qo0Var) {
        ((b00) qo0Var).Q();
    }

    @Override // com.daaw.b00.e
    public void b(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.B;
        }
        if (this.B == j && this.C == z) {
            return;
        }
        q(j, z);
    }

    @Override // com.daaw.bp0
    public void e() {
    }

    @Override // com.daaw.bp0
    public qo0 g(bp0.a aVar, l2 l2Var) {
        s6.a(aVar.a == 0);
        return new b00(this.u, this.v.a(), this.w.a(), this.x, j(aVar), this, l2Var, this.y, this.z);
    }

    @Override // com.daaw.ua
    public void m(rz rzVar, boolean z) {
        q(this.B, false);
    }

    @Override // com.daaw.ua
    public void p() {
    }

    public final void q(long j, boolean z) {
        this.B = j;
        this.C = z;
        n(new od1(this.B, this.C, false, this.A), null);
    }
}
