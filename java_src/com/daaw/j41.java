package com.daaw;

import android.net.Uri;
import com.daaw.ka1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j41 {
    public final String a;
    public final long b;
    public final Format c;
    public final String d;
    public final long e;
    public final List<jt> f;
    public final d31 g;

    /* loaded from: classes.dex */
    public static class b extends j41 implements bp {
        public final ka1.a h;

        public b(String str, long j, Format format, String str2, ka1.a aVar, List<jt> list) {
            super(str, j, format, str2, aVar, list);
            this.h = aVar;
        }

        @Override // com.daaw.j41
        public String a() {
            return null;
        }

        @Override // com.daaw.bp
        public long b(long j) {
            return this.h.g(j);
        }

        @Override // com.daaw.bp
        public long c(long j, long j2) {
            return this.h.e(j, j2);
        }

        @Override // com.daaw.bp
        public d31 d(long j) {
            return this.h.h(this, j);
        }

        @Override // com.daaw.bp
        public long e(long j, long j2) {
            return this.h.f(j, j2);
        }

        @Override // com.daaw.bp
        public boolean f() {
            return this.h.i();
        }

        @Override // com.daaw.bp
        public long g() {
            return this.h.c();
        }

        @Override // com.daaw.bp
        public int h(long j) {
            return this.h.d(j);
        }

        @Override // com.daaw.j41
        public bp i() {
            return this;
        }

        @Override // com.daaw.j41
        public d31 j() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j41 {
        public final Uri h;
        public final long i;
        public final String j;
        public final d31 k;
        public final qd1 l;

        public c(String str, long j, Format format, String str2, ka1.e eVar, List<jt> list, String str3, long j2) {
            super(str, j, format, str2, eVar, list);
            String str4;
            this.h = Uri.parse(str2);
            d31 c = eVar.c();
            this.k = c;
            if (str3 != null) {
                str4 = str3;
            } else if (str != null) {
                str4 = str + "." + format.p + "." + j;
            } else {
                str4 = null;
            }
            this.j = str4;
            this.i = j2;
            this.l = c == null ? new qd1(new d31(null, 0L, j2)) : null;
        }

        @Override // com.daaw.j41
        public String a() {
            return this.j;
        }

        @Override // com.daaw.j41
        public bp i() {
            return this.l;
        }

        @Override // com.daaw.j41
        public d31 j() {
            return this.k;
        }
    }

    public j41(String str, long j, Format format, String str2, ka1 ka1Var, List<jt> list) {
        this.a = str;
        this.b = j;
        this.c = format;
        this.d = str2;
        this.f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.g = ka1Var.a(this);
        this.e = ka1Var.b();
    }

    public static j41 l(String str, long j, Format format, String str2, ka1 ka1Var, List<jt> list) {
        return m(str, j, format, str2, ka1Var, list, null);
    }

    public static j41 m(String str, long j, Format format, String str2, ka1 ka1Var, List<jt> list, String str3) {
        if (ka1Var instanceof ka1.e) {
            return new c(str, j, format, str2, (ka1.e) ka1Var, list, str3, -1L);
        }
        if (ka1Var instanceof ka1.a) {
            return new b(str, j, format, str2, (ka1.a) ka1Var, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract bp i();

    public abstract d31 j();

    public d31 k() {
        return this.g;
    }
}
