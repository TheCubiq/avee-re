package com.daaw;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class j15 implements cm4 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final m08 d;
    public final u35 e;

    public j15(Map map, Map map2, Map map3, m08 m08Var, u35 u35Var) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = m08Var;
        this.e = u35Var;
    }

    @Override // com.daaw.cm4
    public final qq5 a(int i, String str) {
        qq5 a;
        qq5 qq5Var = (qq5) this.a.get(str);
        if (qq5Var != null) {
            return qq5Var;
        }
        if (i == 1) {
            if (this.e.e() == null || (a = ((cm4) this.d.zzb()).a(i, str)) == null) {
                return null;
            }
            return gm4.a(a);
        } else if (i != 4) {
            return null;
        } else {
            tt5 tt5Var = (tt5) this.c.get(str);
            if (tt5Var != null) {
                return new rq5(tt5Var, new ey6() { // from class: com.daaw.em4
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return new gm4((List) obj);
                    }
                });
            }
            qq5 qq5Var2 = (qq5) this.b.get(str);
            if (qq5Var2 == null) {
                return null;
            }
            return gm4.a(qq5Var2);
        }
    }
}
