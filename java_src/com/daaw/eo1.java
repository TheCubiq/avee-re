package com.daaw;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface eo1 {

    /* renamed from: com.daaw.eo1$a */
    /* loaded from: classes.dex */
    public static final class C1205a {

        /* renamed from: a */
        public final String f8611a;

        /* renamed from: b */
        public final int f8612b;

        /* renamed from: c */
        public final byte[] f8613c;

        public C1205a(String str, int i, byte[] bArr) {
            this.f8611a = str;
            this.f8612b = i;
            this.f8613c = bArr;
        }
    }

    /* renamed from: com.daaw.eo1$b */
    /* loaded from: classes.dex */
    public static final class C1206b {

        /* renamed from: a */
        public final int f8614a;

        /* renamed from: b */
        public final String f8615b;

        /* renamed from: c */
        public final List<C1205a> f8616c;

        /* renamed from: d */
        public final byte[] f8617d;

        public C1206b(int i, String str, List<C1205a> list, byte[] bArr) {
            this.f8614a = i;
            this.f8615b = str;
            this.f8616c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f8617d = bArr;
        }
    }

    /* renamed from: com.daaw.eo1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1207c {
        /* renamed from: a */
        eo1 mo23338a(int i, C1206b c1206b);

        /* renamed from: b */
        SparseArray<eo1> mo23337b();
    }

    /* renamed from: com.daaw.eo1$d */
    /* loaded from: classes.dex */
    public static final class C1208d {

        /* renamed from: a */
        public final String f8618a;

        /* renamed from: b */
        public final int f8619b;

        /* renamed from: c */
        public final int f8620c;

        /* renamed from: d */
        public int f8621d;

        /* renamed from: e */
        public String f8622e;

        public C1208d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C1208d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f8618a = str;
            this.f8619b = i2;
            this.f8620c = i3;
            this.f8621d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void m23336a() {
            int i = this.f8621d;
            this.f8621d = i == Integer.MIN_VALUE ? this.f8619b : i + this.f8620c;
            this.f8622e = this.f8618a + this.f8621d;
        }

        /* renamed from: b */
        public String m23335b() {
            m23333d();
            return this.f8622e;
        }

        /* renamed from: c */
        public int m23334c() {
            m23333d();
            return this.f8621d;
        }

        /* renamed from: d */
        public final void m23333d() {
            if (this.f8621d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* renamed from: a */
    void mo15752a(rv0 rv0Var, boolean z);

    /* renamed from: b */
    void mo15751b();

    /* renamed from: c */
    void mo15750c(ol1 ol1Var, d00 d00Var, C1208d c1208d);
}
