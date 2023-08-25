package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class bx1 extends C2099ln {

    /* renamed from: D */
    public final long f5241D;

    /* renamed from: E */
    public final long f5242E;

    /* renamed from: com.daaw.bx1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0894a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5243a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f5243a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5243a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5243a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.daaw.bx1$b */
    /* loaded from: classes.dex */
    public static class C0895b {

        /* renamed from: a */
        public long f5244a;

        /* renamed from: b */
        public long f5245b;

        /* renamed from: c */
        public SpannableStringBuilder f5246c;

        /* renamed from: d */
        public Layout.Alignment f5247d;

        /* renamed from: e */
        public float f5248e;

        /* renamed from: f */
        public int f5249f;

        /* renamed from: g */
        public int f5250g;

        /* renamed from: h */
        public float f5251h;

        /* renamed from: i */
        public int f5252i;

        /* renamed from: j */
        public float f5253j;

        public C0895b() {
            m25775c();
        }

        /* renamed from: a */
        public bx1 m25777a() {
            if (this.f5251h != Float.MIN_VALUE && this.f5252i == Integer.MIN_VALUE) {
                m25776b();
            }
            return new bx1(this.f5244a, this.f5245b, this.f5246c, this.f5247d, this.f5248e, this.f5249f, this.f5250g, this.f5251h, this.f5252i, this.f5253j);
        }

        /* renamed from: b */
        public final C0895b m25776b() {
            Layout.Alignment alignment = this.f5247d;
            if (alignment == null) {
                this.f5252i = Integer.MIN_VALUE;
            } else {
                int i = C0894a.f5243a[alignment.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.f5252i = 1;
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unrecognized alignment: ");
                        sb.append(this.f5247d);
                    } else {
                        this.f5252i = 2;
                    }
                }
                this.f5252i = 0;
            }
            return this;
        }

        /* renamed from: c */
        public void m25775c() {
            this.f5244a = 0L;
            this.f5245b = 0L;
            this.f5246c = null;
            this.f5247d = null;
            this.f5248e = Float.MIN_VALUE;
            this.f5249f = Integer.MIN_VALUE;
            this.f5250g = Integer.MIN_VALUE;
            this.f5251h = Float.MIN_VALUE;
            this.f5252i = Integer.MIN_VALUE;
            this.f5253j = Float.MIN_VALUE;
        }

        /* renamed from: d */
        public C0895b m25774d(long j) {
            this.f5245b = j;
            return this;
        }

        /* renamed from: e */
        public C0895b m25773e(float f) {
            this.f5248e = f;
            return this;
        }

        /* renamed from: f */
        public C0895b m25772f(int i) {
            this.f5250g = i;
            return this;
        }

        /* renamed from: g */
        public C0895b m25771g(int i) {
            this.f5249f = i;
            return this;
        }

        /* renamed from: h */
        public C0895b m25770h(float f) {
            this.f5251h = f;
            return this;
        }

        /* renamed from: i */
        public C0895b m25769i(int i) {
            this.f5252i = i;
            return this;
        }

        /* renamed from: j */
        public C0895b m25768j(long j) {
            this.f5244a = j;
            return this;
        }

        /* renamed from: k */
        public C0895b m25767k(SpannableStringBuilder spannableStringBuilder) {
            this.f5246c = spannableStringBuilder;
            return this;
        }

        /* renamed from: l */
        public C0895b m25766l(Layout.Alignment alignment) {
            this.f5247d = alignment;
            return this;
        }

        /* renamed from: m */
        public C0895b m25765m(float f) {
            this.f5253j = f;
            return this;
        }
    }

    public bx1(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public bx1(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f5241D = j;
        this.f5242E = j2;
    }

    public bx1(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    /* renamed from: a */
    public boolean m25778a() {
        return this.f17550s == Float.MIN_VALUE && this.f17553v == Float.MIN_VALUE;
    }
}
