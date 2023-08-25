package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class bx1 extends ln {
    public final long D;
    public final long E;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public long a;
        public long b;
        public SpannableStringBuilder c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;

        public b() {
            c();
        }

        public bx1 a() {
            if (this.h != Float.MIN_VALUE && this.i == Integer.MIN_VALUE) {
                b();
            }
            return new bx1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final b b() {
            Layout.Alignment alignment = this.d;
            if (alignment == null) {
                this.i = Integer.MIN_VALUE;
            } else {
                int i = a.a[alignment.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.i = 1;
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unrecognized alignment: ");
                        sb.append(this.d);
                    } else {
                        this.i = 2;
                    }
                }
                this.i = 0;
            }
            return this;
        }

        public void c() {
            this.a = 0L;
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = Float.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Float.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public b d(long j) {
            this.b = j;
            return this;
        }

        public b e(float f) {
            this.e = f;
            return this;
        }

        public b f(int i) {
            this.g = i;
            return this;
        }

        public b g(int i) {
            this.f = i;
            return this;
        }

        public b h(float f) {
            this.h = f;
            return this;
        }

        public b i(int i) {
            this.i = i;
            return this;
        }

        public b j(long j) {
            this.a = j;
            return this;
        }

        public b k(SpannableStringBuilder spannableStringBuilder) {
            this.c = spannableStringBuilder;
            return this;
        }

        public b l(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b m(float f) {
            this.j = f;
            return this;
        }
    }

    public bx1(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public bx1(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.D = j;
        this.E = j2;
    }

    public bx1(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public boolean a() {
        return this.s == Float.MIN_VALUE && this.v == Float.MIN_VALUE;
    }
}
