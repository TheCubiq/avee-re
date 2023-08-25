package com.daaw;

import android.view.Surface;
import com.daaw.bp0;
import com.daaw.cp0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
/* loaded from: classes.dex */
public interface x2 {

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final nl1 b;
        public final int c;
        public final bp0.a d;
        public final long e;
        public final long f;
        public final long g;

        public a(long j, nl1 nl1Var, int i, bp0.a aVar, long j2, long j3, long j4) {
            this.a = j;
            this.b = nl1Var;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = j3;
            this.g = j4;
        }
    }

    void A(a aVar, cp0.b bVar, cp0.c cVar);

    void B(a aVar);

    void C(a aVar, int i);

    void a(a aVar, cp0.c cVar);

    void b(a aVar, cp0.c cVar);

    void c(a aVar, int i, long j);

    void d(a aVar, cp0.b bVar, cp0.c cVar);

    void e(a aVar, int i);

    void f(a aVar);

    void g(a aVar, boolean z, int i);

    void h(a aVar, int i);

    void i(a aVar, int i, fq fqVar);

    void j(a aVar, boolean z);

    void k(a aVar, int i, Format format);

    void l(a aVar, Metadata metadata);

    void m(a aVar, Surface surface);

    void n(a aVar, TrackGroupArray trackGroupArray, um1 um1Var);

    void o(a aVar, cp0.b bVar, cp0.c cVar);

    void p(a aVar);

    void q(a aVar, cp0.b bVar, cp0.c cVar, IOException iOException, boolean z);

    void r(a aVar, int i, long j, long j2);

    void s(a aVar, int i, fq fqVar);

    void t(a aVar, zw0 zw0Var);

    void u(a aVar);

    void v(a aVar, int i, String str, long j);

    void w(a aVar, int i, long j, long j2);

    void x(a aVar, int i, int i2, int i3, float f);

    void y(a aVar, qz qzVar);

    void z(a aVar);
}
