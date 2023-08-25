package com.daaw;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class j15 implements cm4 {

    /* renamed from: a */
    public final Map f14176a;

    /* renamed from: b */
    public final Map f14177b;

    /* renamed from: c */
    public final Map f14178c;

    /* renamed from: d */
    public final m08 f14179d;

    /* renamed from: e */
    public final u35 f14180e;

    public j15(Map map, Map map2, Map map3, m08 m08Var, u35 u35Var) {
        this.f14176a = map;
        this.f14177b = map2;
        this.f14178c = map3;
        this.f14179d = m08Var;
        this.f14180e = u35Var;
    }

    @Override // com.daaw.cm4
    /* renamed from: a */
    public final qq5 mo19170a(int i, String str) {
        qq5 mo19170a;
        qq5 qq5Var = (qq5) this.f14176a.get(str);
        if (qq5Var != null) {
            return qq5Var;
        }
        if (i == 1) {
            if (this.f14180e.m8598e() == null || (mo19170a = ((cm4) this.f14179d.zzb()).mo19170a(i, str)) == null) {
                return null;
            }
            return gm4.m21490a(mo19170a);
        } else if (i != 4) {
            return null;
        } else {
            tt5 tt5Var = (tt5) this.f14178c.get(str);
            if (tt5Var != null) {
                return new rq5(tt5Var, new ey6() { // from class: com.daaw.em4
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return new gm4((List) obj);
                    }
                });
            }
            qq5 qq5Var2 = (qq5) this.f14177b.get(str);
            if (qq5Var2 == null) {
                return null;
            }
            return gm4.m21490a(qq5Var2);
        }
    }
}
