package com.daaw;

import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: com.daaw.tb */
/* loaded from: classes.dex */
public class C3030tb {

    /* renamed from: a */
    public boolean f27169a;

    /* renamed from: b */
    public String f27170b;

    /* renamed from: c */
    public String f27171c;

    /* renamed from: d */
    public C3034c f27172d;

    /* renamed from: e */
    public rt8 f27173e;

    /* renamed from: f */
    public ArrayList f27174f;

    /* renamed from: g */
    public boolean f27175g;

    /* renamed from: com.daaw.tb$a */
    /* loaded from: classes.dex */
    public static class C3031a {

        /* renamed from: a */
        public String f27176a;

        /* renamed from: b */
        public String f27177b;

        /* renamed from: c */
        public List f27178c;

        /* renamed from: d */
        public ArrayList f27179d;

        /* renamed from: e */
        public boolean f27180e;

        /* renamed from: f */
        public C3034c.C3035a f27181f;

        public /* synthetic */ C3031a(cr2 cr2Var) {
            C3034c.C3035a m9388a = C3034c.m9388a();
            C3034c.C3035a.m9377f(m9388a);
            this.f27181f = m9388a;
        }

        /* renamed from: a */
        public C3030tb m9399a() {
            ArrayList arrayList = this.f27179d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f27178c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (z2 || z3) {
                if (z2 && z3) {
                    throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
                }
                if (!z2) {
                    C3032b c3032b = (C3032b) this.f27178c.get(0);
                    for (int i = 0; i < this.f27178c.size(); i++) {
                        C3032b c3032b2 = (C3032b) this.f27178c.get(i);
                        if (c3032b2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                        if (i != 0 && !c3032b2.m9395b().m17310c().equals(c3032b.m9395b().m17310c()) && !c3032b2.m9395b().m17310c().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String m17308e = c3032b.m9395b().m17308e();
                    for (C3032b c3032b3 : this.f27178c) {
                        if (!c3032b.m9395b().m17310c().equals("play_pass_subs") && !c3032b3.m9395b().m17310c().equals("play_pass_subs") && !m17308e.equals(c3032b3.m9395b().m17308e())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.f27179d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else {
                    if (this.f27179d.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.f27179d.get(0);
                        String m27857b = skuDetails.m27857b();
                        ArrayList arrayList2 = this.f27179d;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                            if (!m27857b.equals("play_pass_subs") && !skuDetails2.m27857b().equals("play_pass_subs") && !m27857b.equals(skuDetails2.m27857b())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String m27853f = skuDetails.m27853f();
                        ArrayList arrayList3 = this.f27179d;
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                            if (!m27857b.equals("play_pass_subs") && !skuDetails3.m27857b().equals("play_pass_subs") && !m27853f.equals(skuDetails3.m27853f())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                }
                C3030tb c3030tb = new C3030tb(null);
                if ((!z2 || ((SkuDetails) this.f27179d.get(0)).m27853f().isEmpty()) && (!z3 || ((C3032b) this.f27178c.get(0)).m9395b().m17308e().isEmpty())) {
                    z = false;
                }
                c3030tb.f27169a = z;
                c3030tb.f27170b = this.f27176a;
                c3030tb.f27171c = this.f27177b;
                c3030tb.f27172d = this.f27181f.m9382a();
                ArrayList arrayList4 = this.f27179d;
                c3030tb.f27174f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                c3030tb.f27175g = this.f27180e;
                List list2 = this.f27178c;
                c3030tb.f27173e = list2 != null ? rt8.m10943q(list2) : rt8.m10942r();
                return c3030tb;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }

        /* renamed from: b */
        public C3031a m9398b(List<C3032b> list) {
            this.f27178c = new ArrayList(list);
            return this;
        }

        /* renamed from: c */
        public C3031a m9397c(C3034c c3034c) {
            this.f27181f = C3034c.m9386c(c3034c);
            return this;
        }
    }

    /* renamed from: com.daaw.tb$b */
    /* loaded from: classes.dex */
    public static final class C3032b {

        /* renamed from: a */
        public final kz0 f27182a;

        /* renamed from: b */
        public final String f27183b;

        /* renamed from: com.daaw.tb$b$a */
        /* loaded from: classes.dex */
        public static class C3033a {

            /* renamed from: a */
            public kz0 f27184a;

            /* renamed from: b */
            public String f27185b;

            public /* synthetic */ C3033a(is2 is2Var) {
            }

            /* renamed from: a */
            public C3032b m9393a() {
                jf8.m18534c(this.f27184a, "ProductDetails is required for constructing ProductDetailsParams.");
                jf8.m18534c(this.f27185b, "offerToken is required for constructing ProductDetailsParams.");
                return new C3032b(this, null);
            }

            /* renamed from: b */
            public C3033a m9392b(String str) {
                this.f27185b = str;
                return this;
            }

            /* renamed from: c */
            public C3033a m9391c(kz0 kz0Var) {
                this.f27184a = kz0Var;
                if (kz0Var.m17312a() != null) {
                    Objects.requireNonNull(kz0Var.m17312a());
                    this.f27185b = kz0Var.m17312a().m17306a();
                }
                return this;
            }
        }

        public /* synthetic */ C3032b(C3033a c3033a, jt2 jt2Var) {
            this.f27182a = c3033a.f27184a;
            this.f27183b = c3033a.f27185b;
        }

        /* renamed from: a */
        public static C3033a m9396a() {
            return new C3033a(null);
        }

        /* renamed from: b */
        public final kz0 m9395b() {
            return this.f27182a;
        }

        /* renamed from: c */
        public final String m9394c() {
            return this.f27183b;
        }
    }

    /* renamed from: com.daaw.tb$c */
    /* loaded from: classes.dex */
    public static class C3034c {

        /* renamed from: a */
        public String f27186a;

        /* renamed from: b */
        public int f27187b = 0;

        /* renamed from: com.daaw.tb$c$a */
        /* loaded from: classes.dex */
        public static class C3035a {

            /* renamed from: a */
            public String f27188a;

            /* renamed from: b */
            public boolean f27189b;

            /* renamed from: c */
            public int f27190c = 0;

            public /* synthetic */ C3035a(ou2 ou2Var) {
            }

            /* renamed from: f */
            public static /* synthetic */ C3035a m9377f(C3035a c3035a) {
                c3035a.f27189b = true;
                return c3035a;
            }

            /* renamed from: a */
            public C3034c m9382a() {
                boolean z = (TextUtils.isEmpty(this.f27188a) && TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (this.f27189b || z || isEmpty) {
                    C3034c c3034c = new C3034c(null);
                    c3034c.f27186a = this.f27188a;
                    c3034c.f27187b = this.f27190c;
                    return c3034c;
                }
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }

            /* renamed from: b */
            public C3035a m9381b(String str) {
                this.f27188a = str;
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C3035a m9380c(String str) {
                this.f27188a = str;
                return this;
            }

            /* renamed from: d */
            public C3035a m9379d(int i) {
                this.f27190c = i;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C3035a m9378e(int i) {
                this.f27190c = i;
                return this;
            }
        }

        public /* synthetic */ C3034c(mv2 mv2Var) {
        }

        /* renamed from: a */
        public static C3035a m9388a() {
            return new C3035a(null);
        }

        /* renamed from: c */
        public static /* bridge */ /* synthetic */ C3035a m9386c(C3034c c3034c) {
            C3035a m9388a = m9388a();
            m9388a.m9380c(c3034c.f27186a);
            m9388a.m9378e(c3034c.f27187b);
            return m9388a;
        }

        /* renamed from: b */
        public final int m9387b() {
            return this.f27187b;
        }

        /* renamed from: d */
        public final String m9385d() {
            return this.f27186a;
        }
    }

    public /* synthetic */ C3030tb(qw2 qw2Var) {
    }

    /* renamed from: a */
    public static C3031a m9415a() {
        return new C3031a(null);
    }

    /* renamed from: b */
    public final int m9414b() {
        return this.f27172d.m9387b();
    }

    /* renamed from: c */
    public final String m9413c() {
        return this.f27170b;
    }

    /* renamed from: d */
    public final String m9412d() {
        return this.f27171c;
    }

    /* renamed from: e */
    public final String m9411e() {
        return this.f27172d.m9385d();
    }

    /* renamed from: f */
    public final ArrayList m9410f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27174f);
        return arrayList;
    }

    /* renamed from: g */
    public final List m9409g() {
        return this.f27173e;
    }

    /* renamed from: o */
    public final boolean m9401o() {
        return this.f27175g;
    }

    /* renamed from: p */
    public final boolean m9400p() {
        return (this.f27170b == null && this.f27171c == null && this.f27172d.m9387b() == 0 && !this.f27169a && !this.f27175g) ? false : true;
    }
}
