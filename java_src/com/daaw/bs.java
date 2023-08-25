package com.daaw;

import android.util.SparseArray;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class bs implements eo1.c {
    public final int a;
    public final List<Format> b;

    public bs(int i) {
        this(i, Collections.emptyList());
    }

    public bs(int i, List<Format> list) {
        this.a = i;
        if (!d(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.B(null, "application/cea-608", 0, null));
        }
        this.b = list;
    }

    @Override // com.daaw.eo1.c
    public eo1 a(int i, eo1.b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new mw0(new zq0(bVar.b));
            }
            if (i == 15) {
                if (d(2)) {
                    return null;
                }
                return new mw0(new t1(false, bVar.b));
            } else if (i == 17) {
                if (d(2)) {
                    return null;
                }
                return new mw0(new ti0(bVar.b));
            } else if (i != 21) {
                if (i == 27) {
                    if (d(4)) {
                        return null;
                    }
                    return new mw0(new n80(c(bVar), d(1), d(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (i == 134) {
                                        if (d(16)) {
                                            return null;
                                        }
                                        return new aa1(new se1());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new mw0(new t(bVar.b));
                        }
                        return new mw0(new cv(bVar.b));
                    }
                    return new mw0(new jv(bVar.c));
                } else {
                    return new mw0(new o80(c(bVar)));
                }
            } else {
                return new mw0(new se0());
            }
        }
        return new mw0(new m80());
    }

    @Override // com.daaw.eo1.c
    public SparseArray<eo1> b() {
        return new SparseArray<>();
    }

    public final cb1 c(eo1.b bVar) {
        String str;
        int i;
        if (d(32)) {
            return new cb1(this.b);
        }
        rv0 rv0Var = new rv0(bVar.d);
        List<Format> list = this.b;
        while (rv0Var.a() > 0) {
            int x = rv0Var.x();
            int c = rv0Var.c() + rv0Var.x();
            if (x == 134) {
                list = new ArrayList<>();
                int x2 = rv0Var.x() & 31;
                for (int i2 = 0; i2 < x2; i2++) {
                    String u = rv0Var.u(3);
                    int x3 = rv0Var.x();
                    if ((x3 & 128) != 0) {
                        i = x3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    list.add(Format.D(null, str, null, -1, 0, u, i, null));
                    rv0Var.K(2);
                }
            }
            rv0Var.J(c);
        }
        return new cb1(list);
    }

    public final boolean d(int i) {
        return (i & this.a) != 0;
    }
}
