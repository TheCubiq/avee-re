package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.ct */
/* loaded from: classes.dex */
public final class C1006ct implements InterfaceC0885bt {

    /* renamed from: a */
    public final b61 f6172a;

    /* renamed from: b */
    public final AbstractC2374nx<C3566xs> f6173b;

    /* renamed from: com.daaw.ct$a */
    /* loaded from: classes.dex */
    public class C1007a extends AbstractC2374nx<C3566xs> {
        public C1007a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, C3566xs c3566xs) {
            String str = c3566xs.f32901a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            String str2 = c3566xs.f32902b;
            if (str2 == null) {
                ni1Var.mo16232F(2);
            } else {
                ni1Var.mo16231i(2, str2);
            }
        }
    }

    public C1006ct(b61 b61Var) {
        this.f6172a = b61Var;
        this.f6173b = new C1007a(b61Var);
    }

    @Override // com.daaw.InterfaceC0885bt
    /* renamed from: a */
    public List<String> mo24984a(String str) {
        e61 m23701q = e61.m23701q("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f6172a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f6172a, m23701q, false, null);
        try {
            ArrayList arrayList = new ArrayList(m8950b.getCount());
            while (m8950b.moveToNext()) {
                arrayList.add(m8950b.getString(0));
            }
            return arrayList;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.InterfaceC0885bt
    /* renamed from: b */
    public boolean mo24983b(String str) {
        e61 m23701q = e61.m23701q("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f6172a.m26482b();
        boolean z = false;
        Cursor m8950b = C3104to.m8950b(this.f6172a, m23701q, false, null);
        try {
            if (m8950b.moveToFirst()) {
                z = m8950b.getInt(0) != 0;
            }
            return z;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.InterfaceC0885bt
    /* renamed from: c */
    public boolean mo24982c(String str) {
        e61 m23701q = e61.m23701q("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f6172a.m26482b();
        boolean z = false;
        Cursor m8950b = C3104to.m8950b(this.f6172a, m23701q, false, null);
        try {
            if (m8950b.moveToFirst()) {
                z = m8950b.getInt(0) != 0;
            }
            return z;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.InterfaceC0885bt
    /* renamed from: d */
    public void mo24981d(C3566xs c3566xs) {
        this.f6172a.m26482b();
        this.f6172a.m26481c();
        try {
            this.f6173b.m14752h(c3566xs);
            this.f6172a.m26466r();
        } finally {
            this.f6172a.m26477g();
        }
    }
}
