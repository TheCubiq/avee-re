package com.daaw;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class jx8 extends qy8 {

    /* renamed from: g */
    public final xp5 f15501g;

    /* renamed from: h */
    public final /* synthetic */ u32 f15502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx8(u32 u32Var, String str, int i, xp5 xp5Var) {
        super(str, i);
        this.f15502h = u32Var;
        this.f15501g = xp5Var;
    }

    @Override // com.daaw.qy8
    /* renamed from: a */
    public final int mo4372a() {
        return this.f15501g.m4851E();
    }

    @Override // com.daaw.qy8
    /* renamed from: b */
    public final boolean mo4371b() {
        return this.f15501g.m4839Q();
    }

    @Override // com.daaw.qy8
    /* renamed from: c */
    public final boolean mo4370c() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (r2.booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d4  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Long] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m18174k(Long l, Long l2, it6 it6Var, long j, to2 to2Var, boolean z) {
        hk5 m14155w;
        String m5133d;
        String str;
        hk5 m14155w2;
        String m5133d2;
        String m5132e;
        String str2;
        Boolean m11929i;
        String m19286J;
        String str3;
        wj8.m6042b();
        boolean m12677B = this.f15502h.f25143a.m24020z().m12677B(this.f24648a, m75.f18517Y);
        long j2 = this.f15501g.m4840P() ? to2Var.f27920e : j;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.f15502h.f25143a.mo3895i().m14168C(), 2)) {
            this.f15502h.f25143a.mo3895i().m14156v().m20650d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f24649b), this.f15501g.m4838R() ? Integer.valueOf(this.f15501g.m4851E()) : null, this.f15502h.f25143a.m24055D().m5133d(this.f15501g.m4846J()));
            this.f15502h.f25143a.mo3895i().m14156v().m20652b("Filter definition", this.f15502h.f19771b.m3898g0().m23599E(this.f15501g));
        }
        if (!this.f15501g.m4838R() || this.f15501g.m4851E() > 256) {
            this.f15502h.f25143a.mo3895i().m14155w().m20651c("Invalid event filter ID. appId, id", om5.m14152z(this.f24648a), String.valueOf(this.f15501g.m4838R() ? Integer.valueOf(this.f15501g.m4851E()) : null));
            return false;
        }
        boolean z2 = this.f15501g.m4842N() || this.f15501g.m4841O() || this.f15501g.m4840P();
        if (z && !z2) {
            this.f15502h.f25143a.mo3895i().m14156v().m20651c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f24649b), this.f15501g.m4838R() ? Integer.valueOf(this.f15501g.m4851E()) : null);
            return true;
        }
        xp5 xp5Var = this.f15501g;
        String m19362K = it6Var.m19362K();
        if (xp5Var.m4839Q()) {
            Boolean m11930h = qy8.m11930h(j2, xp5Var.m4847I());
            if (m11930h != null) {
            }
            this.f15502h.f25143a.mo3895i().m14156v().m20652b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f24650c = bool2;
            if (bool.booleanValue()) {
                this.f24651d = bool2;
                if (z2 && it6Var.m19350W()) {
                    Long valueOf = Long.valueOf(it6Var.m19366G());
                    if (this.f15501g.m4841O()) {
                        if (m12677B && this.f15501g.m4839Q()) {
                            valueOf = l;
                        }
                        this.f24653f = valueOf;
                    } else {
                        if (m12677B && this.f15501g.m4839Q()) {
                            valueOf = l2;
                        }
                        this.f24652e = valueOf;
                    }
                }
                return true;
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = xp5Var.m4845K().iterator();
        while (true) {
            if (it.hasNext()) {
                ds5 ds5Var = (ds5) it.next();
                if (ds5Var.m24001H().isEmpty()) {
                    m14155w = this.f15502h.f25143a.mo3895i().m14155w();
                    m5133d = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                    str = "null or empty param name in filter. event";
                    break;
                }
                hashSet.add(ds5Var.m24001H());
            } else {
                C1370g6 c1370g6 = new C1370g6();
                Iterator it2 = it6Var.m19361L().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = xp5Var.m4845K().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            ds5 ds5Var2 = (ds5) it3.next();
                            boolean z3 = ds5Var2.m23998K() && ds5Var2.m23999J();
                            String m24001H = ds5Var2.m24001H();
                            if (m24001H.isEmpty()) {
                                m14155w = this.f15502h.f25143a.mo3895i().m14155w();
                                m5133d = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                str = "Event has empty param name. event";
                                break;
                            }
                            Object obj = c1370g6.get(m24001H);
                            if (obj instanceof Long) {
                                if (!ds5Var2.m23997L()) {
                                    m14155w2 = this.f15502h.f25143a.mo3895i().m14155w();
                                    m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                    m5132e = this.f15502h.f25143a.m24055D().m5132e(m24001H);
                                    str2 = "No number filter for long param. event, param";
                                    break;
                                }
                                Boolean m11930h2 = qy8.m11930h(((Long) obj).longValue(), ds5Var2.m24003F());
                                if (m11930h2 == null) {
                                    break;
                                } else if (m11930h2.booleanValue() == z3) {
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!ds5Var2.m23997L()) {
                                    m14155w2 = this.f15502h.f25143a.mo3895i().m14155w();
                                    m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                    m5132e = this.f15502h.f25143a.m24055D().m5132e(m24001H);
                                    str2 = "No number filter for double param. event, param";
                                    break;
                                }
                                Boolean m11931g = qy8.m11931g(((Double) obj).doubleValue(), ds5Var2.m24003F());
                                if (m11931g == null) {
                                    break;
                                } else if (m11931g.booleanValue() == z3) {
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!ds5Var2.m23995N()) {
                                    if (!ds5Var2.m23997L()) {
                                        m14155w2 = this.f15502h.f25143a.mo3895i().m14155w();
                                        m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                        m5132e = this.f15502h.f25143a.m24055D().m5132e(m24001H);
                                        str2 = "No filter for String param. event, param";
                                        break;
                                    }
                                    String str4 = (String) obj;
                                    if (!ec8.m23590N(str4)) {
                                        m14155w2 = this.f15502h.f25143a.mo3895i().m14155w();
                                        m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                        m5132e = this.f15502h.f25143a.m24055D().m5132e(m24001H);
                                        str2 = "Invalid param value for number filter. event, param";
                                        break;
                                    }
                                    m11929i = qy8.m11929i(str4, ds5Var2.m24003F());
                                } else {
                                    m11929i = qy8.m11932f((String) obj, ds5Var2.m24002G(), this.f15502h.f25143a.mo3895i());
                                }
                                if (m11929i == null) {
                                    break;
                                } else if (m11929i.booleanValue() == z3) {
                                    break;
                                }
                            } else {
                                om5 mo3895i = this.f15502h.f25143a.mo3895i();
                                if (obj == null) {
                                    mo3895i.m14156v().m20651c("Missing param for filter. event, param", this.f15502h.f25143a.m24055D().m5133d(m19362K), this.f15502h.f25143a.m24055D().m5132e(m24001H));
                                } else {
                                    m14155w2 = mo3895i.m14155w();
                                    m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                    m5132e = this.f15502h.f25143a.m24055D().m5132e(m24001H);
                                    str2 = "Unknown param type. event, param";
                                }
                            }
                        }
                    } else {
                        ix6 ix6Var = (ix6) it2.next();
                        if (hashSet.contains(ix6Var.m19286J())) {
                            if (ix6Var.m19271Y()) {
                                m19286J = ix6Var.m19286J();
                                if (ix6Var.m19271Y()) {
                                    str3 = Long.valueOf(ix6Var.m19289G());
                                    c1370g6.put(m19286J, str3);
                                }
                                str3 = null;
                                c1370g6.put(m19286J, str3);
                            } else {
                                if (!ix6Var.m19273W()) {
                                    if (!ix6Var.m19269a0()) {
                                        m14155w2 = this.f15502h.f25143a.mo3895i().m14155w();
                                        m5133d2 = this.f15502h.f25143a.m24055D().m5133d(m19362K);
                                        m5132e = this.f15502h.f25143a.m24055D().m5132e(ix6Var.m19286J());
                                        str2 = "Unknown value for param. event, param";
                                        break;
                                    }
                                    m19286J = ix6Var.m19286J();
                                    str3 = ix6Var.m19285K();
                                } else {
                                    m19286J = ix6Var.m19286J();
                                    if (ix6Var.m19273W()) {
                                        str3 = Double.valueOf(ix6Var.m19292D());
                                    }
                                    str3 = null;
                                }
                                c1370g6.put(m19286J, str3);
                            }
                        }
                    }
                }
                m14155w2.m20651c(str2, m5133d2, m5132e);
            }
        }
        m14155w.m20652b(str, m5133d);
        this.f15502h.f25143a.mo3895i().m14156v().m20652b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
