package com.daaw;

import android.net.Uri;
import com.daaw.ka1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j41 {

    /* renamed from: a */
    public final String f14242a;

    /* renamed from: b */
    public final long f14243b;

    /* renamed from: c */
    public final Format f14244c;

    /* renamed from: d */
    public final String f14245d;

    /* renamed from: e */
    public final long f14246e;

    /* renamed from: f */
    public final List<C1860jt> f14247f;

    /* renamed from: g */
    public final d31 f14248g;

    /* renamed from: com.daaw.j41$b */
    /* loaded from: classes.dex */
    public static class C1786b extends j41 implements InterfaceC0879bp {

        /* renamed from: h */
        public final ka1.AbstractC1927a f14249h;

        public C1786b(String str, long j, Format format, String str2, ka1.AbstractC1927a abstractC1927a, List<C1860jt> list) {
            super(str, j, format, str2, abstractC1927a, list);
            this.f14249h = abstractC1927a;
        }

        @Override // com.daaw.j41
        /* renamed from: a */
        public String mo19087a() {
            return null;
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: b */
        public long mo12611b(long j) {
            return this.f14249h.m17928g(j);
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: c */
        public long mo12610c(long j, long j2) {
            return this.f14249h.m17930e(j, j2);
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: d */
        public d31 mo12609d(long j) {
            return this.f14249h.mo17924h(this, j);
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: e */
        public long mo12608e(long j, long j2) {
            return this.f14249h.m17929f(j, j2);
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: f */
        public boolean mo12607f() {
            return this.f14249h.mo17927i();
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: g */
        public long mo12606g() {
            return this.f14249h.m17931c();
        }

        @Override // com.daaw.InterfaceC0879bp
        /* renamed from: h */
        public int mo12605h(long j) {
            return this.f14249h.mo17925d(j);
        }

        @Override // com.daaw.j41
        /* renamed from: i */
        public InterfaceC0879bp mo19086i() {
            return this;
        }

        @Override // com.daaw.j41
        /* renamed from: j */
        public d31 mo19085j() {
            return null;
        }
    }

    /* renamed from: com.daaw.j41$c */
    /* loaded from: classes.dex */
    public static class C1787c extends j41 {

        /* renamed from: h */
        public final Uri f14250h;

        /* renamed from: i */
        public final long f14251i;

        /* renamed from: j */
        public final String f14252j;

        /* renamed from: k */
        public final d31 f14253k;

        /* renamed from: l */
        public final qd1 f14254l;

        public C1787c(String str, long j, Format format, String str2, ka1.C1931e c1931e, List<C1860jt> list, String str3, long j2) {
            super(str, j, format, str2, c1931e, list);
            String str4;
            this.f14250h = Uri.parse(str2);
            d31 m17923c = c1931e.m17923c();
            this.f14253k = m17923c;
            if (str3 != null) {
                str4 = str3;
            } else if (str != null) {
                str4 = str + "." + format.f35716p + "." + j;
            } else {
                str4 = null;
            }
            this.f14252j = str4;
            this.f14251i = j2;
            this.f14254l = m17923c == null ? new qd1(new d31(null, 0L, j2)) : null;
        }

        @Override // com.daaw.j41
        /* renamed from: a */
        public String mo19087a() {
            return this.f14252j;
        }

        @Override // com.daaw.j41
        /* renamed from: i */
        public InterfaceC0879bp mo19086i() {
            return this.f14254l;
        }

        @Override // com.daaw.j41
        /* renamed from: j */
        public d31 mo19085j() {
            return this.f14253k;
        }
    }

    public j41(String str, long j, Format format, String str2, ka1 ka1Var, List<C1860jt> list) {
        this.f14242a = str;
        this.f14243b = j;
        this.f14244c = format;
        this.f14245d = str2;
        this.f14247f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f14248g = ka1Var.mo17926a(this);
        this.f14246e = ka1Var.m17932b();
    }

    /* renamed from: l */
    public static j41 m19089l(String str, long j, Format format, String str2, ka1 ka1Var, List<C1860jt> list) {
        return m19088m(str, j, format, str2, ka1Var, list, null);
    }

    /* renamed from: m */
    public static j41 m19088m(String str, long j, Format format, String str2, ka1 ka1Var, List<C1860jt> list, String str3) {
        if (ka1Var instanceof ka1.C1931e) {
            return new C1787c(str, j, format, str2, (ka1.C1931e) ka1Var, list, str3, -1L);
        }
        if (ka1Var instanceof ka1.AbstractC1927a) {
            return new C1786b(str, j, format, str2, (ka1.AbstractC1927a) ka1Var, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: a */
    public abstract String mo19087a();

    /* renamed from: i */
    public abstract InterfaceC0879bp mo19086i();

    /* renamed from: j */
    public abstract d31 mo19085j();

    /* renamed from: k */
    public d31 m19090k() {
        return this.f14248g;
    }
}
