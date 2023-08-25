package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ct implements bt {
    public final b61 a;
    public final nx<xs> b;

    /* loaded from: classes.dex */
    public class a extends nx<xs> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, xs xsVar) {
            String str = xsVar.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            String str2 = xsVar.b;
            if (str2 == null) {
                ni1Var.F(2);
            } else {
                ni1Var.i(2, str2);
            }
        }
    }

    public ct(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
    }

    @Override // com.daaw.bt
    public List<String> a(String str) {
        e61 q = e61.q("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b = to.b(this.a, q, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            q.D();
        }
    }

    @Override // com.daaw.bt
    public boolean b(String str) {
        e61 q = e61.q("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor b = to.b(this.a, q, false, null);
        try {
            if (b.moveToFirst()) {
                z = b.getInt(0) != 0;
            }
            return z;
        } finally {
            b.close();
            q.D();
        }
    }

    @Override // com.daaw.bt
    public boolean c(String str) {
        e61 q = e61.q("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor b = to.b(this.a, q, false, null);
        try {
            if (b.moveToFirst()) {
                z = b.getInt(0) != 0;
            }
            return z;
        } finally {
            b.close();
            q.D();
        }
    }

    @Override // com.daaw.bt
    public void d(xs xsVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(xsVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }
}
