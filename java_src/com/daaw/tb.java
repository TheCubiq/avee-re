package com.daaw;

import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class tb {
    public boolean a;
    public String b;
    public String c;
    public c d;
    public rt8 e;
    public ArrayList f;
    public boolean g;

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;
        public List c;
        public ArrayList d;
        public boolean e;
        public c.a f;

        public /* synthetic */ a(cr2 cr2Var) {
            c.a a = c.a();
            c.a.f(a);
            this.f = a;
        }

        public tb a() {
            ArrayList arrayList = this.d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (z2 || z3) {
                if (z2 && z3) {
                    throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
                }
                if (!z2) {
                    b bVar = (b) this.c.get(0);
                    for (int i = 0; i < this.c.size(); i++) {
                        b bVar2 = (b) this.c.get(i);
                        if (bVar2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                        if (i != 0 && !bVar2.b().c().equals(bVar.b().c()) && !bVar2.b().c().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String e = bVar.b().e();
                    for (b bVar3 : this.c) {
                        if (!bVar.b().c().equals("play_pass_subs") && !bVar3.b().c().equals("play_pass_subs") && !e.equals(bVar3.b().e())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else {
                    if (this.d.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.d.get(0);
                        String b = skuDetails.b();
                        ArrayList arrayList2 = this.d;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                            if (!b.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !b.equals(skuDetails2.b())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String f = skuDetails.f();
                        ArrayList arrayList3 = this.d;
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                            if (!b.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !f.equals(skuDetails3.f())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                }
                tb tbVar = new tb(null);
                if ((!z2 || ((SkuDetails) this.d.get(0)).f().isEmpty()) && (!z3 || ((b) this.c.get(0)).b().e().isEmpty())) {
                    z = false;
                }
                tbVar.a = z;
                tbVar.b = this.a;
                tbVar.c = this.b;
                tbVar.d = this.f.a();
                ArrayList arrayList4 = this.d;
                tbVar.f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                tbVar.g = this.e;
                List list2 = this.c;
                tbVar.e = list2 != null ? rt8.q(list2) : rt8.r();
                return tbVar;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }

        public a b(List<b> list) {
            this.c = new ArrayList(list);
            return this;
        }

        public a c(c cVar) {
            this.f = c.c(cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final kz0 a;
        public final String b;

        /* loaded from: classes.dex */
        public static class a {
            public kz0 a;
            public String b;

            public /* synthetic */ a(is2 is2Var) {
            }

            public b a() {
                jf8.c(this.a, "ProductDetails is required for constructing ProductDetailsParams.");
                jf8.c(this.b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a c(kz0 kz0Var) {
                this.a = kz0Var;
                if (kz0Var.a() != null) {
                    Objects.requireNonNull(kz0Var.a());
                    this.b = kz0Var.a().a();
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, jt2 jt2Var) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final kz0 b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String a;
        public int b = 0;

        /* loaded from: classes.dex */
        public static class a {
            public String a;
            public boolean b;
            public int c = 0;

            public /* synthetic */ a(ou2 ou2Var) {
            }

            public static /* synthetic */ a f(a aVar) {
                aVar.b = true;
                return aVar;
            }

            public c a() {
                boolean z = (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (this.b || z || isEmpty) {
                    c cVar = new c(null);
                    cVar.a = this.a;
                    cVar.b = this.c;
                    return cVar;
                }
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            @Deprecated
            public a c(String str) {
                this.a = str;
                return this;
            }

            public a d(int i) {
                this.c = i;
                return this;
            }

            @Deprecated
            public a e(int i) {
                this.c = i;
                return this;
            }
        }

        public /* synthetic */ c(mv2 mv2Var) {
        }

        public static a a() {
            return new a(null);
        }

        public static /* bridge */ /* synthetic */ a c(c cVar) {
            a a2 = a();
            a2.c(cVar.a);
            a2.e(cVar.b);
            return a2;
        }

        public final int b() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }
    }

    public /* synthetic */ tb(qw2 qw2Var) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.d.b();
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d.d();
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final List g() {
        return this.e;
    }

    public final boolean o() {
        return this.g;
    }

    public final boolean p() {
        return (this.b == null && this.c == null && this.d.b() == 0 && !this.a && !this.g) ? false : true;
    }
}
