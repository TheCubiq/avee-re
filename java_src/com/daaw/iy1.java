package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class iy1 implements hy1 {

    /* renamed from: a */
    public final b61 f14113a;

    /* renamed from: b */
    public final AbstractC2374nx<gy1> f14114b;

    /* renamed from: com.daaw.iy1$a */
    /* loaded from: classes.dex */
    public class C1771a extends AbstractC2374nx<gy1> {
        public C1771a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, gy1 gy1Var) {
            String str = gy1Var.f11850a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            String str2 = gy1Var.f11851b;
            if (str2 == null) {
                ni1Var.mo16232F(2);
            } else {
                ni1Var.mo16231i(2, str2);
            }
        }
    }

    public iy1(b61 b61Var) {
        this.f14113a = b61Var;
        this.f14114b = new C1771a(b61Var);
    }

    @Override // com.daaw.hy1
    /* renamed from: a */
    public void mo19262a(gy1 gy1Var) {
        this.f14113a.m26482b();
        this.f14113a.m26481c();
        try {
            this.f14114b.m14752h(gy1Var);
            this.f14113a.m26466r();
        } finally {
            this.f14113a.m26477g();
        }
    }

    @Override // com.daaw.hy1
    /* renamed from: b */
    public List<String> mo19261b(String str) {
        e61 m23701q = e61.m23701q("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f14113a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f14113a, m23701q, false, null);
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
}
