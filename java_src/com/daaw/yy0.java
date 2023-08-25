package com.daaw;

import android.database.Cursor;
/* loaded from: classes.dex */
public final class yy0 implements xy0 {
    public final b61 a;
    public final nx<wy0> b;

    /* loaded from: classes.dex */
    public class a extends nx<wy0> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, wy0 wy0Var) {
            String str = wy0Var.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            Long l = wy0Var.b;
            if (l == null) {
                ni1Var.F(2);
            } else {
                ni1Var.r(2, l.longValue());
            }
        }
    }

    public yy0(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
    }

    @Override // com.daaw.xy0
    public void a(wy0 wy0Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(wy0Var);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.xy0
    public Long b(String str) {
        e61 q = e61.q("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Long l = null;
        Cursor b = to.b(this.a, q, false, null);
        try {
            if (b.moveToFirst() && !b.isNull(0)) {
                l = Long.valueOf(b.getLong(0));
            }
            return l;
        } finally {
            b.close();
            q.D();
        }
    }
}
