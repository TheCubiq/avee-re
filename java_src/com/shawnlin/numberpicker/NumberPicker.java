package com.shawnlin.numberpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.daaw.k91;
import com.daaw.zk;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;
/* loaded from: classes2.dex */
public class NumberPicker extends LinearLayout {
    public static final f E0 = new f();
    public static final char[] F0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, '-'};
    public float A;
    public int A0;
    public Typeface B;
    public boolean B0;
    public int C;
    public boolean C0;
    public int D;
    public Context D0;
    public String[] E;
    public int F;
    public int G;
    public int H;
    public View.OnClickListener I;
    public e J;
    public d K;
    public c L;
    public long M;
    public final SparseArray<String> N;
    public int O;
    public int P;
    public int Q;
    public int[] R;
    public final Paint S;
    public int T;
    public int U;
    public int V;
    public final k91 W;
    public final k91 a0;
    public int b0;
    public int c0;
    public b d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public VelocityTracker i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public Drawable n0;
    public int o0;
    public final EditText p;
    public int p0;
    public float q;
    public int q0;
    public float r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public int v;
    public int v0;
    public final boolean w;
    public int w0;
    public int x;
    public float x0;
    public int y;
    public float y0;
    public float z;
    public int z0;

    /* loaded from: classes2.dex */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.c
        public String a(int i) {
            return String.format(Locale.getDefault(), this.a, Integer.valueOf(i));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public boolean p;

        public b() {
        }

        public final void b(boolean z) {
            this.p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.c(this.p);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.M);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        String a(int i);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(NumberPicker numberPicker, int i);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(NumberPicker numberPicker, int i, int i2);
    }

    /* loaded from: classes2.dex */
    public static class f implements c {
        public char b;
        public Formatter c;
        public final StringBuilder a = new StringBuilder();
        public final Object[] d = new Object[1];

        public f() {
            d(Locale.getDefault());
        }

        public static char c(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.c
        public String a(int i) {
            Locale locale = Locale.getDefault();
            if (this.b != c(locale)) {
                d(locale);
            }
            this.d[0] = Integer.valueOf(i);
            StringBuilder sb = this.a;
            sb.delete(0, sb.length());
            this.c.format("%02d", this.d);
            return this.c.toString();
        }

        public final Formatter b(Locale locale) {
            return new Formatter(this.a, locale);
        }

        public final void d(Locale locale) {
            this.c = b(locale);
            this.b = c(locale);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NumberPicker(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shawnlin.numberpicker.NumberPicker.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private float getMaxTextSize() {
        return Math.max(this.z, this.A);
    }

    private int[] getSelectorIndices() {
        return this.R;
    }

    public static final c getTwoDigitFormatter() {
        return E0;
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i = size;
            }
        } else if (size < i) {
            i = 16777216 | size;
        }
        return i | ((-16777216) & i3);
    }

    public final float A(float f2) {
        return f2 / getResources().getDisplayMetrics().scaledDensity;
    }

    public final void B() {
        b bVar = this.d0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public final void C() {
        b bVar = this.d0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public final int D(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    public void E(int i, int i2) {
        F(getResources().getString(i), i2);
    }

    public void F(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTypeface(Typeface.create(str, i));
    }

    public final void G(int i, boolean z) {
        if (this.H == i) {
            return;
        }
        int l = this.m0 ? l(i) : Math.min(Math.max(i, this.F), this.G);
        int i2 = this.H;
        this.H = l;
        L();
        if (z) {
            v(i2, l);
        }
        p();
        invalidate();
    }

    public final void H() {
        float e2;
        boolean r = r();
        this.s = -1;
        if (r) {
            this.t = (int) e(64.0f);
            e2 = e(180.0f);
        } else {
            this.t = (int) e(180.0f);
            e2 = e(64.0f);
        }
        this.u = (int) e2;
        this.v = -1;
    }

    public final float I(float f2) {
        return TypedValue.applyDimension(2, f2, getResources().getDisplayMetrics());
    }

    public final c J(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new a(str);
    }

    public final void K() {
        int i;
        if (this.w) {
            this.S.setTextSize(getMaxTextSize());
            String[] strArr = this.E;
            int i2 = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float measureText = this.S.measureText(j(i3));
                    if (measureText > f2) {
                        f2 = measureText;
                    }
                }
                for (int i4 = this.G; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f2);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float measureText2 = this.S.measureText(this.E[i2]);
                    if (measureText2 > i5) {
                        i5 = (int) measureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            int paddingLeft = i + this.p.getPaddingLeft() + this.p.getPaddingRight();
            if (this.v != paddingLeft) {
                int i6 = this.u;
                if (paddingLeft > i6) {
                    this.v = paddingLeft;
                } else {
                    this.v = i6;
                }
                invalidate();
            }
        }
    }

    public final boolean L() {
        String[] strArr = this.E;
        String i = strArr == null ? i(this.H) : strArr[this.H - this.F];
        if (TextUtils.isEmpty(i) || i.equals(this.p.getText().toString())) {
            return false;
        }
        this.p.setText(i);
        return true;
    }

    public final void c(boolean z) {
        this.p.setVisibility(4);
        if (!u(this.W)) {
            u(this.a0);
        }
        if (r()) {
            this.b0 = 0;
            if (z) {
                this.W.m(0, 0, -this.T, 0, 300);
            } else {
                this.W.m(0, 0, this.T, 0, 300);
            }
        } else {
            this.c0 = 0;
            if (z) {
                this.W.m(0, 0, 0, -this.T, 300);
            } else {
                this.W.m(0, 0, 0, this.T, 300);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (s()) {
            k91 k91Var = this.W;
            if (k91Var.l()) {
                k91Var = this.a0;
                if (k91Var.l()) {
                    return;
                }
            }
            k91Var.b();
            if (r()) {
                int f2 = k91Var.f();
                if (this.b0 == 0) {
                    this.b0 = k91Var.j();
                }
                scrollBy(f2 - this.b0, 0);
                this.b0 = f2;
            } else {
                int g = k91Var.g();
                if (this.c0 == 0) {
                    this.c0 = k91Var.k();
                }
                scrollBy(0, g - this.c0);
                this.c0 = g;
            }
            if (k91Var.l()) {
                x(k91Var);
            } else {
                postInvalidate();
            }
        }
    }

    public final void d(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i = iArr[1] - 1;
        if (this.m0 && i < this.F) {
            i = this.G;
        }
        iArr[0] = i;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        requestFocus();
        r5.w0 = r0;
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r5.W.l() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r0 != 20) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
        c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L19
            if (r0 == r2) goto L19
            r1 = 23
            if (r0 == r1) goto L15
            r1 = 66
            if (r0 == r1) goto L15
            goto L60
        L15:
            r5.B()
            goto L60
        L19:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L23
            goto L60
        L23:
            int r1 = r5.w0
            if (r1 != r0) goto L60
            r6 = -1
            r5.w0 = r6
            return r3
        L2b:
            boolean r1 = r5.m0
            if (r1 != 0) goto L3d
            if (r0 != r2) goto L32
            goto L3d
        L32:
            int r1 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r1 <= r4) goto L60
            goto L47
        L3d:
            int r1 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r1 >= r4) goto L60
        L47:
            r5.requestFocus()
            r5.w0 = r0
            r5.B()
            com.daaw.k91 r6 = r5.W
            boolean r6 = r6.l()
            if (r6 == 0) goto L5f
            if (r0 != r2) goto L5b
            r6 = 1
            goto L5c
        L5b:
            r6 = 0
        L5c:
            r5.c(r6)
        L5f:
            return r3
        L60:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shawnlin.numberpicker.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            B();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final float e(float f2) {
        return f2 * getResources().getDisplayMetrics().density;
    }

    public final void f(int i) {
        String str;
        SparseArray<String> sparseArray = this.N;
        if (sparseArray.get(i) != null) {
            return;
        }
        int i2 = this.F;
        if (i < i2 || i > this.G) {
            str = "";
        } else {
            String[] strArr = this.E;
            str = strArr != null ? strArr[i - i2] : i(i);
        }
        sparseArray.put(i, str);
    }

    public final boolean g() {
        k91 k91Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.U - this.V;
        if (i5 != 0) {
            int abs = Math.abs(i5);
            int i6 = this.T;
            if (abs > i6 / 2) {
                if (i5 > 0) {
                    i6 = -i6;
                }
                i5 += i6;
            }
            int i7 = i5;
            if (r()) {
                this.b0 = 0;
                k91Var = this.a0;
                i = 0;
                i2 = 0;
                i4 = 800;
                i3 = i7;
                i7 = 0;
            } else {
                this.c0 = 0;
                k91Var = this.a0;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 800;
            }
            k91Var.m(i, i2, i3, i7, i4);
            invalidate();
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return (r() || !this.B0) ? 0.0f : 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.E;
    }

    public int getDividerColor() {
        return this.o0;
    }

    public float getDividerDistance() {
        return z(this.p0);
    }

    public float getDividerThickness() {
        return z(this.q0);
    }

    public c getFormatter() {
        return this.L;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return (r() && this.B0) ? 0.9f : 0.0f;
    }

    public int getMaxValue() {
        return this.G;
    }

    public int getMinValue() {
        return this.F;
    }

    public int getOrder() {
        return this.A0;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return this.z0;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return (r() && this.B0) ? 0.9f : 0.0f;
    }

    public int getSelectedTextColor() {
        return this.x;
    }

    public float getSelectedTextSize() {
        return this.A;
    }

    public int getTextColor() {
        return this.y;
    }

    public float getTextSize() {
        return I(this.z);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return (r() || !this.B0) ? 0.0f : 0.9f;
    }

    public Typeface getTypeface() {
        return this.B;
    }

    public int getValue() {
        return this.H;
    }

    public int getWheelItemCount() {
        return this.O;
    }

    public boolean getWrapSelectorWheel() {
        return this.m0;
    }

    public final void h(int i) {
        k91 k91Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (r()) {
            this.b0 = 0;
            k91Var = this.W;
            i2 = i > 0 ? 0 : Integer.MAX_VALUE;
            i3 = 0;
            i9 = 0;
            i5 = 0;
            i6 = Integer.MAX_VALUE;
            i7 = 0;
            i8 = 0;
            i4 = i;
        } else {
            this.c0 = 0;
            k91Var = this.W;
            i2 = 0;
            i3 = i > 0 ? 0 : Integer.MAX_VALUE;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = Integer.MAX_VALUE;
            i9 = i;
        }
        k91Var.c(i2, i3, i4, i9, i5, i6, i7, i8);
        invalidate();
    }

    public final String i(int i) {
        c cVar = this.L;
        return cVar != null ? cVar.a(i) : j(i);
    }

    public final String j(int i) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
    }

    public final float k(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    public final int l(int i) {
        int i2 = this.G;
        int i3 = this.F;
        return i > i2 ? (i3 + ((i - i2) % (i2 - i3))) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    public final void m(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            iArr[i] = iArr[i2];
            i = i2;
        }
        int i3 = iArr[iArr.length - 2] + 1;
        if (this.m0 && i3 > this.G) {
            i3 = this.F;
        }
        iArr[iArr.length - 1] = i3;
        f(i3);
    }

    public final void n() {
        int bottom;
        int top;
        if (r()) {
            setHorizontalFadingEdgeEnabled(true);
            bottom = getRight();
            top = getLeft();
        } else {
            setVerticalFadingEdgeEnabled(true);
            bottom = getBottom();
            top = getTop();
        }
        setFadingEdgeLength(((bottom - top) - ((int) this.z)) / 2);
    }

    public final void o() {
        int maxTextSize;
        float f2;
        p();
        int[] selectorIndices = getSelectorIndices();
        int length = ((selectorIndices.length - 1) * ((int) this.z)) + ((int) this.A);
        float length2 = selectorIndices.length;
        if (r()) {
            this.C = (int) (((getRight() - getLeft()) - length) / length2);
            maxTextSize = ((int) getMaxTextSize()) + this.C;
            this.T = maxTextSize;
            f2 = this.q;
        } else {
            this.D = (int) (((getBottom() - getTop()) - length) / length2);
            maxTextSize = ((int) getMaxTextSize()) + this.D;
            this.T = maxTextSize;
            f2 = this.r;
        }
        this.U = ((int) f2) - (maxTextSize * this.Q);
        this.V = this.U;
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float right;
        float f2;
        Paint paint;
        int i;
        canvas.save();
        if (r()) {
            right = this.V;
            f2 = this.p.getBaseline() + this.p.getTop();
            if (this.P < 3) {
                canvas.clipRect(this.u0, 0, this.v0, getBottom());
            }
        } else {
            right = (getRight() - getLeft()) / 2;
            f2 = this.V;
            if (this.P < 3) {
                canvas.clipRect(0, this.s0, getRight(), this.t0);
            }
        }
        int[] selectorIndices = getSelectorIndices();
        for (int i2 = 0; i2 < selectorIndices.length; i2++) {
            if (i2 == this.Q) {
                this.S.setTextSize(this.A);
                paint = this.S;
                i = this.x;
            } else {
                this.S.setTextSize(this.z);
                paint = this.S;
                i = this.y;
            }
            paint.setColor(i);
            String str = this.N.get(selectorIndices[q() ? i2 : (selectorIndices.length - i2) - 1]);
            if (i2 != this.Q || this.p.getVisibility() != 0) {
                if (r()) {
                    canvas.drawText(str, right, f2, this.S);
                } else {
                    canvas.drawText(str, right, k(this.S.getFontMetrics()) + f2, this.S);
                }
            }
            if (r()) {
                right += this.T;
            } else {
                f2 += this.T;
            }
        }
        canvas.restore();
        if (this.n0 != null) {
            if (r()) {
                int i3 = this.u0;
                this.n0.setBounds(i3, 0, this.q0 + i3, getBottom());
                this.n0.draw(canvas);
                int i4 = this.v0;
                this.n0.setBounds(i4 - this.q0, 0, i4, getBottom());
            } else {
                int i5 = this.s0;
                this.n0.setBounds(0, i5, getRight(), this.q0 + i5);
                this.n0.draw(canvas);
                int i6 = this.t0;
                this.n0.setBounds(0, i6 - this.q0, getRight(), i6);
            }
            this.n0.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(s());
        int i = this.F;
        int i2 = this.T;
        int i3 = (this.H + i) * i2;
        int i4 = (this.G - i) * i2;
        if (r()) {
            accessibilityEvent.setScrollX(i3);
            accessibilityEvent.setMaxScrollX(i4);
            return;
        }
        accessibilityEvent.setScrollY(i3);
        accessibilityEvent.setMaxScrollY(i4);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && (motionEvent.getAction() & 255) == 0) {
            B();
            this.p.setVisibility(4);
            if (r()) {
                float x = motionEvent.getX();
                this.e0 = x;
                this.g0 = x;
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!this.W.l()) {
                    this.W.d(true);
                    this.a0.d(true);
                    w(0);
                } else if (this.a0.l()) {
                    float f2 = this.e0;
                    int i = this.u0;
                    if (f2 >= i && f2 <= this.v0) {
                        View.OnClickListener onClickListener = this.I;
                        if (onClickListener != null) {
                            onClickListener.onClick(this);
                        }
                    } else if (f2 < i) {
                        y(false, ViewConfiguration.getLongPressTimeout());
                    } else if (f2 > this.v0) {
                        y(true, ViewConfiguration.getLongPressTimeout());
                    }
                } else {
                    this.W.d(true);
                    this.a0.d(true);
                }
                return true;
            }
            float y = motionEvent.getY();
            this.f0 = y;
            this.h0 = y;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.W.l()) {
                this.W.d(true);
                this.a0.d(true);
                w(0);
            } else if (this.a0.l()) {
                float f3 = this.f0;
                int i2 = this.s0;
                if (f3 >= i2 && f3 <= this.t0) {
                    View.OnClickListener onClickListener2 = this.I;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                } else if (f3 < i2) {
                    y(false, ViewConfiguration.getLongPressTimeout());
                } else if (f3 > this.t0) {
                    y(true, ViewConfiguration.getLongPressTimeout());
                }
            } else {
                this.W.d(true);
                this.a0.d(true);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.p.getMeasuredWidth();
        int measuredHeight2 = this.p.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.p.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        this.q = this.p.getX() + (this.p.getMeasuredWidth() / 2);
        this.r = this.p.getY() + (this.p.getMeasuredHeight() / 2);
        if (z) {
            o();
            n();
            if (r()) {
                int width = getWidth();
                int i7 = this.p0;
                int i8 = this.q0;
                int i9 = ((width - i7) / 2) - i8;
                this.u0 = i9;
                this.v0 = i9 + (i8 * 2) + i7;
                return;
            }
            int height = getHeight();
            int i10 = this.p0;
            int i11 = this.q0;
            int i12 = ((height - i10) / 2) - i11;
            this.s0 = i12;
            this.t0 = i12 + (i11 * 2) + i10;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(t(i, this.v), t(i2, this.t));
        setMeasuredDimension(D(this.u, getMeasuredWidth(), i), D(this.s, getMeasuredHeight(), i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r7 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r7 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        c(false);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shawnlin.numberpicker.NumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        this.N.clear();
        int[] selectorIndices = getSelectorIndices();
        int value = getValue();
        for (int i = 0; i < this.R.length; i++) {
            int i2 = (i - this.Q) + value;
            if (this.m0) {
                i2 = l(i2);
            }
            selectorIndices[i] = i2;
            f(selectorIndices[i]);
        }
    }

    public boolean q() {
        return getOrder() == 0;
    }

    public boolean r() {
        return getOrientation() == 0;
    }

    public boolean s() {
        return this.C0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r4.V = r4.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3 A[EDGE_INSN: B:82:0x00d3->B:69:0x00d3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void scrollBy(int r5, int r6) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shawnlin.numberpicker.NumberPicker.scrollBy(int, int):void");
    }

    public void setDisplayedValues(String[] strArr) {
        EditText editText;
        int i;
        if (this.E == strArr) {
            return;
        }
        this.E = strArr;
        if (strArr != null) {
            editText = this.p;
            i = 524289;
        } else {
            editText = this.p;
            i = 2;
        }
        editText.setRawInputType(i);
        L();
        p();
        K();
    }

    public void setDividerColor(int i) {
        this.o0 = i;
        this.n0 = new ColorDrawable(i);
    }

    public void setDividerColorResource(int i) {
        setDividerColor(zk.c(this.D0, i));
    }

    public void setDividerDistance(int i) {
        this.p0 = (int) e(i);
    }

    public void setDividerThickness(int i) {
        this.q0 = (int) e(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.p.setEnabled(z);
    }

    public void setFadingEdgeEnabled(boolean z) {
        this.B0 = z;
    }

    public void setFormatter(int i) {
        setFormatter(getResources().getString(i));
    }

    public void setFormatter(c cVar) {
        if (cVar == this.L) {
            return;
        }
        this.L = cVar;
        p();
        L();
    }

    public void setFormatter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setFormatter(J(str));
    }

    public void setMaxValue(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.G = i;
        if (i < this.H) {
            this.H = i;
        }
        setWrapSelectorWheel(i - this.F > this.R.length);
        p();
        L();
        K();
        invalidate();
    }

    public void setMinValue(int i) {
        this.F = i;
        if (i > this.H) {
            this.H = i;
        }
        setWrapSelectorWheel(this.G - i > this.R.length);
        p();
        L();
        K();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.I = onClickListener;
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.M = j;
    }

    public void setOnScrollListener(d dVar) {
        this.K = dVar;
    }

    public void setOnValueChangedListener(e eVar) {
        this.J = eVar;
    }

    public void setOrder(int i) {
        this.A0 = i;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.z0 = i;
        H();
    }

    public void setScrollerEnabled(boolean z) {
        this.C0 = z;
    }

    public void setSelectedTextColor(int i) {
        this.x = i;
        this.p.setTextColor(i);
    }

    public void setSelectedTextColorResource(int i) {
        setSelectedTextColor(zk.c(this.D0, i));
    }

    public void setSelectedTextSize(float f2) {
        this.A = f2;
        this.p.setTextSize(A(f2));
    }

    public void setSelectedTextSize(int i) {
        setSelectedTextSize(getResources().getDimension(i));
    }

    public void setTextColor(int i) {
        this.y = i;
        this.S.setColor(i);
    }

    public void setTextColorResource(int i) {
        setTextColor(zk.c(this.D0, i));
    }

    public void setTextSize(float f2) {
        this.z = f2;
        this.S.setTextSize(f2);
    }

    public void setTextSize(int i) {
        setTextSize(getResources().getDimension(i));
    }

    public void setTypeface(int i) {
        E(i, 0);
    }

    public void setTypeface(Typeface typeface) {
        Paint paint;
        Typeface typeface2;
        this.B = typeface;
        if (typeface != null) {
            this.p.setTypeface(typeface);
            paint = this.S;
            typeface2 = this.B;
        } else {
            this.p.setTypeface(Typeface.MONOSPACE);
            paint = this.S;
            typeface2 = Typeface.MONOSPACE;
        }
        paint.setTypeface(typeface2);
    }

    public void setTypeface(String str) {
        F(str, 0);
    }

    public void setValue(int i) {
        G(i, false);
    }

    public void setWheelItemCount(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Wheel item count must be >= 1");
        }
        this.P = i;
        if (i < 3) {
            i = 3;
        }
        this.O = i;
        this.Q = i / 2;
        this.R = new int[i];
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.G - this.F >= this.R.length;
        if ((!z || z2) && z != this.m0) {
            this.m0 = z;
        }
    }

    public final int t(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return i;
                }
                throw new IllegalArgumentException("Unknown measure mode: " + mode);
            }
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
    }

    public final boolean u(k91 k91Var) {
        k91Var.d(true);
        if (r()) {
            int h = k91Var.h() - k91Var.f();
            int i = this.U - ((this.V + h) % this.T);
            if (i != 0) {
                int abs = Math.abs(i);
                int i2 = this.T;
                if (abs > i2 / 2) {
                    i = i > 0 ? i - i2 : i + i2;
                }
                scrollBy(h + i, 0);
                return true;
            }
        } else {
            int i3 = k91Var.i() - k91Var.g();
            int i4 = this.U - ((this.V + i3) % this.T);
            if (i4 != 0) {
                int abs2 = Math.abs(i4);
                int i5 = this.T;
                if (abs2 > i5 / 2) {
                    i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                }
                scrollBy(0, i3 + i4);
                return true;
            }
        }
        return false;
    }

    public final void v(int i, int i2) {
        e eVar = this.J;
        if (eVar != null) {
            eVar.a(this, i, this.H);
        }
    }

    public final void w(int i) {
        if (this.r0 == i) {
            return;
        }
        this.r0 = i;
        d dVar = this.K;
        if (dVar != null) {
            dVar.a(this, i);
        }
    }

    public final void x(k91 k91Var) {
        if (k91Var == this.W) {
            if (!g()) {
                L();
            }
            w(0);
        } else if (this.r0 != 1) {
            L();
        }
    }

    public final void y(boolean z, long j) {
        b bVar = this.d0;
        if (bVar == null) {
            this.d0 = new b();
        } else {
            removeCallbacks(bVar);
        }
        this.d0.b(z);
        postDelayed(this.d0, j);
    }

    public final float z(float f2) {
        return f2 / getResources().getDisplayMetrics().density;
    }
}
