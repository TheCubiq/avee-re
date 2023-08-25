package com.daaw;

import android.content.Context;
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
    public static final l37 k = l37.b(new Comparator() { // from class: com.daaw.ru8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = rv8.m;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    public static final l37 l = l37.b(new Comparator() { // from class: com.daaw.su8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = rv8.m;
            return 0;
        }
    });
    public static final /* synthetic */ int m = 0;
    public final Object d;
    public final Context e;
    public final boolean f;
    public fv8 g;
    public kv8 h;
    public o98 i;
    public final gu8 j;

    public rv8(Context context) {
        gu8 gu8Var = new gu8();
        fv8 d = fv8.d(context);
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.j = gu8Var;
        this.g = d;
        this.i = o98.c;
        boolean z = false;
        if (context != null && it5.x(context)) {
            z = true;
        }
        this.f = z;
        if (!z && context != null && it5.a >= 32) {
            this.h = kv8.a(context);
        }
        if (this.g.M && context == null) {
            s95.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int j(f92 f92Var, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(f92Var.c)) {
            String n = n(str);
            String n2 = n(f92Var.c);
            if (n2 == null || n == null) {
                return (z && n2 == null) ? 1 : 0;
            } else if (n2.startsWith(n) || n.startsWith(n2)) {
                return 3;
            } else {
                return it5.I(n2, "-")[0].equals(it5.I(n, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void o(rv8 rv8Var) {
        rv8Var.t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
        if (r8.h.d(r8.i, r9) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean q(com.daaw.rv8 r8, com.daaw.f92 r9) {
        /*
            java.lang.Object r0 = r8.d
            monitor-enter(r0)
            com.daaw.fv8 r1 = r8.g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.M     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.f     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.y     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.l     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.daaw.it5.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.daaw.kv8 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.daaw.it5.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.daaw.kv8 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.daaw.kv8 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.daaw.kv8 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            com.daaw.o98 r8 = r8.i     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = 1
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rv8.q(com.daaw.rv8, com.daaw.f92):boolean");
    }

    public static boolean r(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static void s(au8 au8Var, de4 de4Var, Map map) {
        for (int i = 0; i < au8Var.a; i++) {
            if (((wa4) de4Var.y.get(au8Var.b(i))) != null) {
                throw null;
            }
        }
    }

    public static final Pair u(int i, vv8 vv8Var, int[][][] iArr, mv8 mv8Var, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == vv8Var.c(i2)) {
                au8 d = vv8Var.d(i2);
                for (int i3 = 0; i3 < d.a; i3++) {
                    r84 b = d.b(i3);
                    List a = mv8Var.a(i2, b, iArr[i2][i3]);
                    int i4 = b.a;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        nv8 nv8Var = (nv8) a.get(i6);
                        int a2 = nv8Var.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == i5) {
                                randomAccess = y17.v(nv8Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nv8Var);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    nv8 nv8Var2 = (nv8) a.get(i7);
                                    if (nv8Var2.a() == 2 && nv8Var.b(nv8Var2)) {
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
            iArr2[i8] = ((nv8) list.get(i8)).r;
        }
        nv8 nv8Var3 = (nv8) list.get(0);
        return Pair.create(new sv8(nv8Var3.q, iArr2, 0), Integer.valueOf(nv8Var3.p));
    }

    @Override // com.daaw.zv8
    public final void a() {
        kv8 kv8Var;
        synchronized (this.d) {
            if (it5.a >= 32 && (kv8Var = this.h) != null) {
                kv8Var.c();
            }
        }
        super.a();
    }

    @Override // com.daaw.zv8
    public final void b(o98 o98Var) {
        boolean z;
        synchronized (this.d) {
            z = !this.i.equals(o98Var);
            this.i = o98Var;
        }
        if (z) {
            t();
        }
    }

    @Override // com.daaw.zv8
    public final boolean c() {
        return true;
    }

    @Override // com.daaw.wv8
    public final Pair i(vv8 vv8Var, int[][][] iArr, final int[] iArr2, pr8 pr8Var, l64 l64Var) {
        final fv8 fv8Var;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        kv8 kv8Var;
        int[][][] iArr4 = iArr;
        synchronized (this.d) {
            fv8Var = this.g;
            if (fv8Var.M && it5.a >= 32 && (kv8Var = this.h) != null) {
                Looper myLooper = Looper.myLooper();
                uo4.b(myLooper);
                kv8Var.b(this, myLooper);
            }
        }
        int i2 = 2;
        sv8[] sv8VarArr = new sv8[2];
        Pair u = u(2, vv8Var, iArr4, new mv8() { // from class: com.daaw.nu8
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.daaw.mv8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a(int r17, com.daaw.r84 r18, int[] r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r9 = r18
                    com.daaw.fv8 r10 = com.daaw.fv8.this
                    int[] r1 = r2
                    int r2 = com.daaw.rv8.m
                    r11 = r1[r17]
                    int r1 = r10.i
                    int r2 = r10.j
                    boolean r3 = r10.k
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    if (r1 == r14) goto L80
                    if (r2 != r14) goto L1b
                    goto L83
                L1b:
                    r4 = 0
                    r5 = 2147483647(0x7fffffff, float:NaN)
                L1f:
                    int r6 = r9.a
                    if (r4 > 0) goto L7e
                    com.daaw.f92 r6 = r9.b(r4)
                    int r7 = r6.q
                    if (r7 <= 0) goto L78
                    int r8 = r6.r
                    if (r8 <= 0) goto L78
                    if (r3 == 0) goto L40
                    if (r7 > r8) goto L35
                    r15 = 0
                    goto L36
                L35:
                    r15 = 1
                L36:
                    if (r1 > r2) goto L3a
                    r12 = 0
                    goto L3b
                L3a:
                    r12 = 1
                L3b:
                    if (r15 == r12) goto L40
                    r12 = r1
                    r15 = r2
                    goto L42
                L40:
                    r15 = r1
                    r12 = r2
                L42:
                    int r13 = r7 * r12
                    int r14 = r8 * r15
                    if (r13 < r14) goto L52
                    android.graphics.Point r8 = new android.graphics.Point
                    int r7 = com.daaw.it5.O(r14, r7)
                    r8.<init>(r15, r7)
                    goto L5c
                L52:
                    android.graphics.Point r7 = new android.graphics.Point
                    int r8 = com.daaw.it5.O(r13, r8)
                    r7.<init>(r8, r12)
                    r8 = r7
                L5c:
                    int r7 = r6.q
                    int r6 = r6.r
                    int r12 = r7 * r6
                    int r13 = r8.x
                    float r13 = (float) r13
                    r14 = 1065017672(0x3f7ae148, float:0.98)
                    float r13 = r13 * r14
                    int r13 = (int) r13
                    if (r7 < r13) goto L78
                    int r7 = r8.y
                    float r7 = (float) r7
                    float r7 = r7 * r14
                    int r7 = (int) r7
                    if (r6 < r7) goto L78
                    if (r12 >= r5) goto L78
                    r5 = r12
                L78:
                    int r4 = r4 + 1
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    goto L1f
                L7e:
                    r14 = r5
                    goto L83
                L80:
                    r14 = 2147483647(0x7fffffff, float:NaN)
                L83:
                    com.daaw.v17 r12 = com.daaw.y17.o()
                    r13 = 0
                L88:
                    int r1 = r9.a
                    if (r13 > 0) goto Lb8
                    com.daaw.f92 r1 = r9.b(r13)
                    int r1 = r1.a()
                    r15 = 2147483647(0x7fffffff, float:NaN)
                    if (r14 == r15) goto La1
                    r2 = -1
                    if (r1 == r2) goto L9f
                    if (r1 > r14) goto L9f
                    goto La1
                L9f:
                    r8 = 0
                    goto La2
                La1:
                    r8 = 1
                La2:
                    com.daaw.qv8 r7 = new com.daaw.qv8
                    r6 = r19[r13]
                    r1 = r7
                    r2 = r17
                    r3 = r18
                    r4 = r13
                    r5 = r10
                    r15 = r7
                    r7 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r12.f(r15)
                    int r13 = r13 + 1
                    goto L88
                Lb8:
                    com.daaw.y17 r1 = r12.h()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.nu8.a(int, com.daaw.r84, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.daaw.ou8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                n17 i3 = n17.i();
                ov8 ov8Var = new Comparator() { // from class: com.daaw.ov8
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return qv8.d((qv8) obj3, (qv8) obj4);
                    }
                };
                n17 b = i3.c((qv8) Collections.max(list, ov8Var), (qv8) Collections.max(list2, ov8Var), ov8Var).b(list.size(), list2.size());
                pv8 pv8Var = new Comparator() { // from class: com.daaw.pv8
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return qv8.c((qv8) obj3, (qv8) obj4);
                    }
                };
                return b.c((qv8) Collections.max(list, pv8Var), (qv8) Collections.max(list2, pv8Var), pv8Var).a();
            }
        });
        if (u != null) {
            sv8VarArr[((Integer) u.second).intValue()] = (sv8) u.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            } else if (vv8Var.c(i3) == 2 && vv8Var.d(i3).a > 0) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        Pair u2 = u(1, vv8Var, iArr4, new mv8() { // from class: com.daaw.lu8
            @Override // com.daaw.mv8
            public final List a(int i4, r84 r84Var, int[] iArr5) {
                final rv8 rv8Var = rv8.this;
                fv8 fv8Var2 = fv8Var;
                boolean z2 = z;
                ty6 ty6Var = new ty6() { // from class: com.daaw.ku8
                    @Override // com.daaw.ty6
                    public final boolean zza(Object obj) {
                        return rv8.q(rv8.this, (f92) obj);
                    }
                };
                v17 o = y17.o();
                int i5 = 0;
                while (true) {
                    int i6 = r84Var.a;
                    if (i5 > 0) {
                        return o.h();
                    }
                    o.f(new tu8(i4, r84Var, i5, fv8Var2, iArr5[i5], z2, ty6Var));
                    i5++;
                }
            }
        }, new Comparator() { // from class: com.daaw.mu8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((tu8) Collections.max((List) obj)).c((tu8) Collections.max((List) obj2));
            }
        });
        if (u2 != null) {
            sv8VarArr[((Integer) u2.second).intValue()] = (sv8) u2.first;
        }
        if (u2 == null) {
            str = null;
        } else {
            Object obj = u2.first;
            str = ((sv8) obj).a.b(((sv8) obj).b[0]).c;
        }
        int i4 = 3;
        Pair u3 = u(3, vv8Var, iArr4, new mv8() { // from class: com.daaw.pu8
            @Override // com.daaw.mv8
            public final List a(int i5, r84 r84Var, int[] iArr5) {
                fv8 fv8Var2 = fv8.this;
                String str2 = str;
                int i6 = rv8.m;
                v17 o = y17.o();
                int i7 = 0;
                while (true) {
                    int i8 = r84Var.a;
                    if (i7 > 0) {
                        return o.h();
                    }
                    o.f(new lv8(i5, r84Var, i7, fv8Var2, iArr5[i7], str2));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.daaw.qu8
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((lv8) ((List) obj2).get(0)).c((lv8) ((List) obj3).get(0));
            }
        });
        if (u3 != null) {
            sv8VarArr[((Integer) u3.second).intValue()] = (sv8) u3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int c = vv8Var.c(i5);
            if (c != i2 && c != i && c != i4) {
                au8 d = vv8Var.d(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                r84 r84Var = null;
                int i7 = 0;
                av8 av8Var = null;
                while (i6 < d.a) {
                    r84 b = d.b(i6);
                    int[] iArr6 = iArr5[i6];
                    av8 av8Var2 = av8Var;
                    int i8 = 0;
                    while (true) {
                        int i9 = b.a;
                        if (i8 <= 0) {
                            if (r(iArr6[i8], fv8Var.N)) {
                                av8 av8Var3 = new av8(b.b(i8), iArr6[i8]);
                                if (av8Var2 == null || av8Var3.compareTo(av8Var2) > 0) {
                                    i7 = i8;
                                    av8Var2 = av8Var3;
                                    r84Var = b;
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
            s(vv8Var.d(i10), fv8Var, hashMap);
        }
        s(vv8Var.e(), fv8Var, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((wa4) hashMap.get(Integer.valueOf(vv8Var.c(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            au8 d2 = vv8Var.d(i12);
            if (fv8Var.g(i12, d2)) {
                if (fv8Var.e(i12, d2) != null) {
                    throw null;
                }
                sv8VarArr[i12] = null;
            }
            i12++;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int c2 = vv8Var.c(i14);
            if (fv8Var.f(i14) || fv8Var.z.contains(Integer.valueOf(c2))) {
                sv8VarArr[i14] = null;
            }
            i14++;
        }
        gu8 gu8Var = this.j;
        mw8 f = f();
        y17 c3 = hu8.c(sv8VarArr);
        int i16 = 2;
        tv8[] tv8VarArr = new tv8[2];
        int i17 = 0;
        while (i17 < i16) {
            sv8 sv8Var = sv8VarArr[i17];
            if (sv8Var != null && (length = (iArr3 = sv8Var.b).length) != 0) {
                tv8VarArr[i17] = length == 1 ? new uv8(sv8Var.a, iArr3[0], 0, 0, null) : gu8Var.a(sv8Var.a, iArr3, 0, f, (y17) c3.get(i17));
            }
            i17++;
            i16 = 2;
        }
        x98[] x98VarArr = new x98[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            x98VarArr[i18] = (fv8Var.f(i18) || fv8Var.z.contains(Integer.valueOf(vv8Var.c(i18))) || (vv8Var.c(i18) != -2 && tv8VarArr[i18] == null)) ? null : x98.a;
        }
        return Pair.create(x98VarArr, tv8VarArr);
    }

    public final fv8 k() {
        fv8 fv8Var;
        synchronized (this.d) {
            fv8Var = this.g;
        }
        return fv8Var;
    }

    public final void p(dv8 dv8Var) {
        boolean z;
        fv8 fv8Var = new fv8(dv8Var);
        synchronized (this.d) {
            z = !this.g.equals(fv8Var);
            this.g = fv8Var;
        }
        if (z) {
            if (fv8Var.M && this.e == null) {
                s95.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            h();
        }
    }

    public final void t() {
        boolean z;
        kv8 kv8Var;
        synchronized (this.d) {
            z = false;
            if (this.g.M && !this.f && it5.a >= 32 && (kv8Var = this.h) != null && kv8Var.g()) {
                z = true;
            }
        }
        if (z) {
            h();
        }
    }
}
