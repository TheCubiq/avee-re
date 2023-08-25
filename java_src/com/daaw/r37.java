package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class r37 extends b27 {

    /* renamed from: v */
    public static final b27 f24812v = new r37(null, new Object[0], 0);
    @CheckForNull

    /* renamed from: s */
    public final transient Object f24813s;

    /* renamed from: t */
    public final transient Object[] f24814t;

    /* renamed from: u */
    public final transient int f24815u;

    public r37(@CheckForNull Object obj, Object[] objArr, int i) {
        this.f24813s = obj;
        this.f24814t = objArr;
        this.f24815u = i;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v3 ??, r5v10 ??, r5v6 short[], r5v11 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.tryInsertAdditionalMove(TypeInferenceVisitor.java:742)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:109)
        */
    /* renamed from: i */
    public static com.daaw.r37 m11785i(int r17, java.lang.Object[] r18, com.daaw.a27 r19) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r37.m11785i(int, java.lang.Object[], com.daaw.a27):com.daaw.r37");
    }

    @Override // com.daaw.b27
    /* renamed from: a */
    public final t17 mo11788a() {
        return new q37(this.f24814t, 1, this.f24815u);
    }

    @Override // com.daaw.b27
    /* renamed from: e */
    public final d27 mo11787e() {
        return new o37(this, this.f24814t, 0, this.f24815u);
    }

    @Override // com.daaw.b27
    /* renamed from: f */
    public final d27 mo11786f() {
        return new p37(this, new q37(this.f24814t, 0, this.f24815u));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.daaw.b27, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.f24813s;
        Object[] objArr = this.f24814t;
        int i = this.f24815u;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int m12804a = q17.m12804a(obj.hashCode());
                    while (true) {
                        int i2 = m12804a & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            m12804a = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int m12804a2 = q17.m12804a(obj.hashCode());
                    while (true) {
                        int i4 = m12804a2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        } else if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                            break;
                        } else {
                            m12804a2 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int m12804a3 = q17.m12804a(obj.hashCode());
                    while (true) {
                        int i5 = m12804a3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            m12804a3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24815u;
    }
}
