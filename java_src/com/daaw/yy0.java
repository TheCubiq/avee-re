package com.daaw;

import android.database.Cursor;
/* loaded from: classes.dex */
public final class yy0 implements xy0 {

    /* renamed from: a */
    public final b61 f34251a;

    /* renamed from: b */
    public final AbstractC2374nx<wy0> f34252b;

    /* renamed from: com.daaw.yy0$a */
    /* loaded from: classes.dex */
    public class C3779a extends AbstractC2374nx<wy0> {
        public C3779a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, wy0 wy0Var) {
            String str = wy0Var.f31651a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            Long l = wy0Var.f31652b;
            if (l == null) {
                ni1Var.mo16232F(2);
            } else {
                ni1Var.mo16229r(2, l.longValue());
            }
        }
    }

    public yy0(b61 b61Var) {
        this.f34251a = b61Var;
        this.f34252b = new C3779a(b61Var);
    }

    @Override // com.daaw.xy0
    /* renamed from: a */
    public void mo3084a(wy0 wy0Var) {
        this.f34251a.m26482b();
        this.f34251a.m26481c();
        try {
            this.f34252b.m14752h(wy0Var);
            this.f34251a.m26466r();
        } finally {
            this.f34251a.m26477g();
        }
    }

    @Override // com.daaw.xy0
    /* renamed from: b */
    public Long mo3083b(String str) {
        e61 m23701q = e61.m23701q("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f34251a.m26482b();
        Long l = null;
        Cursor m8950b = C3104to.m8950b(this.f34251a, m23701q, false, null);
        try {
            if (m8950b.moveToFirst() && !m8950b.isNull(0)) {
                l = Long.valueOf(m8950b.getLong(0));
            }
            return l;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }
}
