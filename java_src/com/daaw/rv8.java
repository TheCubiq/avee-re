package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class rv8 extends wv8 {

    /* renamed from: k */
    public static final l37 f25652k = l37.m17167b(new Comparator() { // from class: com.daaw.ru8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = rv8.f25654m;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });

    /* renamed from: l */
    public static final l37 f25653l = l37.m17167b(new Comparator() { // from class: com.daaw.su8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = rv8.f25654m;
            return 0;
        }
    });

    /* renamed from: m */
    public static final /* synthetic */ int f25654m = 0;

    /* renamed from: d */
    public final Object f25655d;

    /* renamed from: e */
    public final Context f25656e;

    /* renamed from: f */
    public final boolean f25657f;

    /* renamed from: g */
    public fv8 f25658g;

    /* renamed from: h */
    public kv8 f25659h;

    /* renamed from: i */
    public o98 f25660i;

    /* renamed from: j */
    public final gu8 f25661j;

    public rv8(Context context) {
        gu8 gu8Var = new gu8();
        fv8 m22237d = fv8.m22237d(context);
        this.f25655d = new Object();
        this.f25656e = context != null ? context.getApplicationContext() : null;
        this.f25661j = gu8Var;
        this.f25658g = m22237d;
        this.f25660i = o98.f21185c;
        boolean z = false;
        if (context != null && it5.m19372x(context)) {
            z = true;
        }
        this.f25657f = z;
        if (!z && context != null && it5.f13991a >= 32) {
            this.f25659h = kv8.m17401a(context);
        }
        if (this.f25658g.f10008M && context == null) {
            s95.m10493e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: j */
    public static int m10874j(f92 f92Var, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(f92Var.f9266c)) {
            String m10870n = m10870n(str);
            String m10870n2 = m10870n(f92Var.f9266c);
            if (m10870n2 == null || m10870n == null) {
                return (z && m10870n2 == null) ? 1 : 0;
            } else if (m10870n2.startsWith(m10870n) || m10870n.startsWith(m10870n2)) {
                return 3;
            } else {
                return it5.m19423I(m10870n2, "-")[0].equals(it5.m19423I(m10870n, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* renamed from: n */
    public static String m10870n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m10869o(rv8 rv8Var) {
        rv8Var.m10864t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
        if (r8.f25659h.m17398d(r8.f25660i, r9) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean m10867q(rv8 rv8Var, f92 f92Var) {
        boolean z;
        char c;
        synchronized (rv8Var.f25655d) {
            z = false;
            if (rv8Var.f25658g.f10008M && !rv8Var.f25657f && f92Var.f9288y > 2) {
                String str = f92Var.f9275l;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                            }
                        }
                    }
                    if (it5.f13991a >= 32) {
                        kv8 kv8Var = rv8Var.f25659h;
                        if (kv8Var != null) {
                            if (!kv8Var.m17395g()) {
                            }
                        }
                    }
                }
                if (it5.f13991a >= 32) {
                    kv8 kv8Var2 = rv8Var.f25659h;
                    if (kv8Var2 != null) {
                        if (kv8Var2.m17395g()) {
                            if (kv8Var2.m17397e()) {
                                if (rv8Var.f25659h.m17396f()) {
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: r */
    public static boolean m10866r(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: s */
    public static void m10865s(au8 au8Var, de4 de4Var, Map map) {
        for (int i = 0; i < au8Var.f3668a; i++) {
            if (((wa4) de4Var.f7020y.get(au8Var.m26965b(i))) != null) {
                throw null;
            }
        }
    }

    /* renamed from: u */
    public static final Pair m10863u(int i, vv8 vv8Var, int[][][] iArr, mv8 mv8Var, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == vv8Var.m6708c(i2)) {
                au8 m6707d = vv8Var.m6707d(i2);
                for (int i3 = 0; i3 < m6707d.f3668a; i3++) {
                    r84 m26965b = m6707d.m26965b(i3);
                    List mo13117a = mv8Var.mo13117a(i2, m26965b, iArr[i2][i3]);
                    int i4 = m26965b.f24960a;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        nv8 nv8Var = (nv8) mo13117a.get(i6);
                        int mo8816a = nv8Var.mo8816a();
                        if (!zArr[i6] && mo8816a != 0) {
                            if (mo8816a == i5) {
                                randomAccess = y17.m4259v(nv8Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nv8Var);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    nv8 nv8Var2 = (nv8) mo13117a.get(i7);
                                    if (nv8Var2.mo8816a() == 2 && nv8Var.mo8815b(nv8Var2)) {
                                        arrayList2.add(nv8Var2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        i5 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((nv8) list.get(i8)).f20763r;
        }
        nv8 nv8Var3 = (nv8) list.get(0);
        return Pair.create(new sv8(nv8Var3.f20762q, iArr2, 0), Integer.valueOf(nv8Var3.f20761p));
    }

    @Override // com.daaw.zv8
    /* renamed from: a */
    public final void mo1835a() {
        kv8 kv8Var;
        synchronized (this.f25655d) {
            if (it5.f13991a >= 32 && (kv8Var = this.f25659h) != null) {
                kv8Var.m17399c();
            }
        }
        super.mo1835a();
    }

    @Override // com.daaw.zv8
    /* renamed from: b */
    public final void mo1834b(o98 o98Var) {
        boolean z;
        synchronized (this.f25655d) {
            z = !this.f25660i.equals(o98Var);
            this.f25660i = o98Var;
        }
        if (z) {
            m10864t();
        }
    }

    @Override // com.daaw.zv8
    /* renamed from: c */
    public final boolean mo1833c() {
        return true;
    }

    @Override // com.daaw.wv8
    /* renamed from: i */
    public final Pair mo5757i(vv8 vv8Var, int[][][] iArr, final int[] iArr2, pr8 pr8Var, l64 l64Var) {
        final fv8 fv8Var;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        kv8 kv8Var;
        int[][][] iArr4 = iArr;
        synchronized (this.f25655d) {
            fv8Var = this.f25658g;
            if (fv8Var.f10008M && it5.f13991a >= 32 && (kv8Var = this.f25659h) != null) {
                Looper myLooper = Looper.myLooper();
                uo4.m7876b(myLooper);
                kv8Var.m17400b(this, myLooper);
            }
        }
        int i2 = 2;
        sv8[] sv8VarArr = new sv8[2];
        Pair m10863u = m10863u(2, vv8Var, iArr4, new mv8() { // from class: com.daaw.nu8
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.daaw.mv8
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List mo13117a(int i3, r84 r84Var, int[] iArr5) {
                int i4;
                int i5;
                int i6;
                Point point;
                int i7;
                int i8;
                fv8 fv8Var2 = fv8.this;
                int[] iArr6 = iArr2;
                int i9 = rv8.f25654m;
                int i10 = iArr6[i3];
                int i11 = fv8Var2.f7004i;
                int i12 = fv8Var2.f7005j;
                boolean z2 = fv8Var2.f7006k;
                int i13 = Integer.MAX_VALUE;
                if (i11 == Integer.MAX_VALUE) {
                    i13 = Integer.MAX_VALUE;
                } else if (i12 != Integer.MAX_VALUE) {
                    int i14 = 0;
                    int i15 = Integer.MAX_VALUE;
                    while (true) {
                        int i16 = r84Var.f24960a;
                        if (i14 > 0) {
                            break;
                        }
                        f92 m11590b = r84Var.m11590b(i14);
                        int i17 = m11590b.f9280q;
                        if (i17 > 0 && (i4 = m11590b.f9281r) > 0) {
                            if (z2) {
                                if ((i17 > i4) != (i11 > i12)) {
                                    i6 = i11;
                                    i5 = i12;
                                    int i18 = i17 * i6;
                                    int i19 = i4 * i5;
                                    point = i18 < i19 ? new Point(i5, it5.m19417O(i19, i17)) : new Point(it5.m19417O(i18, i4), i6);
                                    i7 = m11590b.f9280q;
                                    int i20 = m11590b.f9281r;
                                    i8 = i7 * i20;
                                    if (i7 >= ((int) (point.x * 0.98f)) && i20 >= ((int) (point.y * 0.98f)) && i8 < i15) {
                                        i15 = i8;
                                    }
                                }
                            }
                            i5 = i11;
                            i6 = i12;
                            int i182 = i17 * i6;
                            int i192 = i4 * i5;
                            if (i182 < i192) {
                            }
                            i7 = m11590b.f9280q;
                            int i202 = m11590b.f9281r;
                            i8 = i7 * i202;
                            if (i7 >= ((int) (point.x * 0.98f))) {
                                i15 = i8;
                            }
                        }
                        i14++;
                    }
                    i13 = i15;
                }
                v17 m4266o = y17.m4266o();
                int i21 = 0;
                while (true) {
                    int i22 = r84Var.f24960a;
                    if (i21 > 0) {
                        return m4266o.m7546h();
                    }
                    int m22831a = r84Var.m11590b(i21).m22831a();
                    m4266o.m7548f(new qv8(i3, r84Var, i21, fv8Var2, iArr5[i21], i10, i13 == Integer.MAX_VALUE || (m22831a != -1 && m22831a <= i13)));
                    i21++;
                }
            }
        }, new Comparator() { // from class: com.daaw.ou8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                n17 m15586i = n17.m15586i();
                ov8 ov8Var = new Comparator() { // from class: com.daaw.ov8
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return qv8.m12027d((qv8) obj3, (qv8) obj4);
                    }
                };
                n17 mo15593b = m15586i.mo15592c((qv8) Collections.max(list, ov8Var), (qv8) Collections.max(list2, ov8Var), ov8Var).mo15593b(list.size(), list2.size());
                pv8 pv8Var = new Comparator() { // from class: com.daaw.pv8
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return qv8.m12028c((qv8) obj3, (qv8) obj4);
                    }
                };
                return mo15593b.mo15592c((qv8) Collections.max(list, pv8Var), (qv8) Collections.max(list2, pv8Var), pv8Var).mo15594a();
            }
        });
        if (m10863u != null) {
            sv8VarArr[((Integer) m10863u.second).intValue()] = (sv8) m10863u.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            } else if (vv8Var.m6708c(i3) == 2 && vv8Var.m6707d(i3).f3668a > 0) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        Pair m10863u2 = m10863u(1, vv8Var, iArr4, new mv8() { // from class: com.daaw.lu8
            @Override // com.daaw.mv8
            /* renamed from: a */
            public final List mo13117a(int i4, r84 r84Var, int[] iArr5) {
                final rv8 rv8Var = rv8.this;
                fv8 fv8Var2 = fv8Var;
                boolean z2 = z;
                ty6 ty6Var = new ty6() { // from class: com.daaw.ku8
                    @Override // com.daaw.ty6
                    public final boolean zza(Object obj) {
                        return rv8.m10867q(rv8.this, (f92) obj);
                    }
                };
                v17 m4266o = y17.m4266o();
                int i5 = 0;
                while (true) {
                    int i6 = r84Var.f24960a;
                    if (i5 > 0) {
                        return m4266o.m7546h();
                    }
                    m4266o.m7548f(new tu8(i4, r84Var, i5, fv8Var2, iArr5[i5], z2, ty6Var));
                    i5++;
                }
            }
        }, new Comparator() { // from class: com.daaw.mu8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((tu8) Collections.max((List) obj)).m8814c((tu8) Collections.max((List) obj2));
            }
        });
        if (m10863u2 != null) {
            sv8VarArr[((Integer) m10863u2.second).intValue()] = (sv8) m10863u2.first;
        }
        if (m10863u2 == null) {
            str = null;
        } else {
            Object obj = m10863u2.first;
            str = ((sv8) obj).f26706a.m11590b(((sv8) obj).f26707b[0]).f9266c;
        }
        int i4 = 3;
        Pair m10863u3 = m10863u(3, vv8Var, iArr4, new mv8() { // from class: com.daaw.pu8
            @Override // com.daaw.mv8
            /* renamed from: a */
            public final List mo13117a(int i5, r84 r84Var, int[] iArr5) {
                fv8 fv8Var2 = fv8.this;
                String str2 = str;
                int i6 = rv8.f25654m;
                v17 m4266o = y17.m4266o();
                int i7 = 0;
                while (true) {
                    int i8 = r84Var.f24960a;
                    if (i7 > 0) {
                        return m4266o.m7546h();
                    }
                    m4266o.m7548f(new lv8(i5, r84Var, i7, fv8Var2, iArr5[i7], str2));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.daaw.qu8
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((lv8) ((List) obj2).get(0)).m16473c((lv8) ((List) obj3).get(0));
            }
        });
        if (m10863u3 != null) {
            sv8VarArr[((Integer) m10863u3.second).intValue()] = (sv8) m10863u3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int m6708c = vv8Var.m6708c(i5);
            if (m6708c != i2 && m6708c != i && m6708c != i4) {
                au8 m6707d = vv8Var.m6707d(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                r84 r84Var = null;
                int i7 = 0;
                av8 av8Var = null;
                while (i6 < m6707d.f3668a) {
                    r84 m26965b = m6707d.m26965b(i6);
                    int[] iArr6 = iArr5[i6];
                    av8 av8Var2 = av8Var;
                    int i8 = 0;
                    while (true) {
                        int i9 = m26965b.f24960a;
                        if (i8 <= 0) {
                            if (m10866r(iArr6[i8], fv8Var.f10009N)) {
                                av8 av8Var3 = new av8(m26965b.m11590b(i8), iArr6[i8]);
                                if (av8Var2 == null || av8Var3.compareTo(av8Var2) > 0) {
                                    i7 = i8;
                                    av8Var2 = av8Var3;
                                    r84Var = m26965b;
                                }
                            }
                            i8++;
                        }
                    }
                    i6++;
                    av8Var = av8Var2;
                }
                sv8VarArr[i5] = r84Var == null ? null : new sv8(r84Var, new int[]{i7}, 0);
            }
            i5++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            m10865s(vv8Var.m6707d(i10), fv8Var, hashMap);
        }
        m10865s(vv8Var.m6706e(), fv8Var, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((wa4) hashMap.get(Integer.valueOf(vv8Var.m6708c(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            au8 m6707d2 = vv8Var.m6707d(i12);
            if (fv8Var.m22234g(i12, m6707d2)) {
                if (fv8Var.m22236e(i12, m6707d2) != null) {
                    throw null;
                }
                sv8VarArr[i12] = null;
            }
            i12++;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int m6708c2 = vv8Var.m6708c(i14);
            if (fv8Var.m22235f(i14) || fv8Var.f7021z.contains(Integer.valueOf(m6708c2))) {
                sv8VarArr[i14] = null;
            }
            i14++;
        }
        gu8 gu8Var = this.f25661j;
        mw8 m1830f = m1830f();
        y17 m20412c = hu8.m20412c(sv8VarArr);
        int i16 = 2;
        tv8[] tv8VarArr = new tv8[2];
        int i17 = 0;
        while (i17 < i16) {
            sv8 sv8Var = sv8VarArr[i17];
            if (sv8Var != null && (length = (iArr3 = sv8Var.f26707b).length) != 0) {
                tv8VarArr[i17] = length == 1 ? new uv8(sv8Var.f26706a, iArr3[0], 0, 0, null) : gu8Var.m21210a(sv8Var.f26706a, iArr3, 0, m1830f, (y17) m20412c.get(i17));
            }
            i17++;
            i16 = 2;
        }
        x98[] x98VarArr = new x98[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            x98VarArr[i18] = (fv8Var.m22235f(i18) || fv8Var.f7021z.contains(Integer.valueOf(vv8Var.m6708c(i18))) || (vv8Var.m6708c(i18) != -2 && tv8VarArr[i18] == null)) ? null : x98.f32258a;
        }
        return Pair.create(x98VarArr, tv8VarArr);
    }

    /* renamed from: k */
    public final fv8 m10873k() {
        fv8 fv8Var;
        synchronized (this.f25655d) {
            fv8Var = this.f25658g;
        }
        return fv8Var;
    }

    /* renamed from: p */
    public final void m10868p(dv8 dv8Var) {
        boolean z;
        fv8 fv8Var = new fv8(dv8Var);
        synchronized (this.f25655d) {
            z = !this.f25658g.equals(fv8Var);
            this.f25658g = fv8Var;
        }
        if (z) {
            if (fv8Var.f10008M && this.f25656e == null) {
                s95.m10493e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            m1828h();
        }
    }

    /* renamed from: t */
    public final void m10864t() {
        boolean z;
        kv8 kv8Var;
        synchronized (this.f25655d) {
            z = false;
            if (this.f25658g.f10008M && !this.f25657f && it5.f13991a >= 32 && (kv8Var = this.f25659h) != null && kv8Var.m17395g()) {
                z = true;
            }
        }
        if (z) {
            m1828h();
        }
    }
}
