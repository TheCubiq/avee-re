package com.shawnlin.numberpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.daaw.C3866zk;
import com.daaw.b21;
import com.daaw.k11;
import com.daaw.k91;
import com.daaw.n11;
import com.daaw.n21;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;
/* loaded from: classes2.dex */
public class NumberPicker extends LinearLayout {

    /* renamed from: E0 */
    public static final C4184f f37913E0 = new C4184f();

    /* renamed from: F0 */
    public static final char[] f37914F0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, '-'};

    /* renamed from: A */
    public float f37915A;

    /* renamed from: A0 */
    public int f37916A0;

    /* renamed from: B */
    public Typeface f37917B;

    /* renamed from: B0 */
    public boolean f37918B0;

    /* renamed from: C */
    public int f37919C;

    /* renamed from: C0 */
    public boolean f37920C0;

    /* renamed from: D */
    public int f37921D;

    /* renamed from: D0 */
    public Context f37922D0;

    /* renamed from: E */
    public String[] f37923E;

    /* renamed from: F */
    public int f37924F;

    /* renamed from: G */
    public int f37925G;

    /* renamed from: H */
    public int f37926H;

    /* renamed from: I */
    public View.OnClickListener f37927I;

    /* renamed from: J */
    public InterfaceC4183e f37928J;

    /* renamed from: K */
    public InterfaceC4182d f37929K;

    /* renamed from: L */
    public InterfaceC4181c f37930L;

    /* renamed from: M */
    public long f37931M;

    /* renamed from: N */
    public final SparseArray<String> f37932N;

    /* renamed from: O */
    public int f37933O;

    /* renamed from: P */
    public int f37934P;

    /* renamed from: Q */
    public int f37935Q;

    /* renamed from: R */
    public int[] f37936R;

    /* renamed from: S */
    public final Paint f37937S;

    /* renamed from: T */
    public int f37938T;

    /* renamed from: U */
    public int f37939U;

    /* renamed from: V */
    public int f37940V;

    /* renamed from: W */
    public final k91 f37941W;

    /* renamed from: a0 */
    public final k91 f37942a0;

    /* renamed from: b0 */
    public int f37943b0;

    /* renamed from: c0 */
    public int f37944c0;

    /* renamed from: d0 */
    public RunnableC4180b f37945d0;

    /* renamed from: e0 */
    public float f37946e0;

    /* renamed from: f0 */
    public float f37947f0;

    /* renamed from: g0 */
    public float f37948g0;

    /* renamed from: h0 */
    public float f37949h0;

    /* renamed from: i0 */
    public VelocityTracker f37950i0;

    /* renamed from: j0 */
    public int f37951j0;

    /* renamed from: k0 */
    public int f37952k0;

    /* renamed from: l0 */
    public int f37953l0;

    /* renamed from: m0 */
    public boolean f37954m0;

    /* renamed from: n0 */
    public Drawable f37955n0;

    /* renamed from: o0 */
    public int f37956o0;

    /* renamed from: p */
    public final EditText f37957p;

    /* renamed from: p0 */
    public int f37958p0;

    /* renamed from: q */
    public float f37959q;

    /* renamed from: q0 */
    public int f37960q0;

    /* renamed from: r */
    public float f37961r;

    /* renamed from: r0 */
    public int f37962r0;

    /* renamed from: s */
    public int f37963s;

    /* renamed from: s0 */
    public int f37964s0;

    /* renamed from: t */
    public int f37965t;

    /* renamed from: t0 */
    public int f37966t0;

    /* renamed from: u */
    public int f37967u;

    /* renamed from: u0 */
    public int f37968u0;

    /* renamed from: v */
    public int f37969v;

    /* renamed from: v0 */
    public int f37970v0;

    /* renamed from: w */
    public final boolean f37971w;

    /* renamed from: w0 */
    public int f37972w0;

    /* renamed from: x */
    public int f37973x;

    /* renamed from: x0 */
    public float f37974x0;

    /* renamed from: y */
    public int f37975y;

    /* renamed from: y0 */
    public float f37976y0;

    /* renamed from: z */
    public float f37977z;

    /* renamed from: z0 */
    public int f37978z0;

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$a */
    /* loaded from: classes2.dex */
    public class C4179a implements InterfaceC4181c {

        /* renamed from: a */
        public final /* synthetic */ String f37979a;

        public C4179a(String str) {
            this.f37979a = str;
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.InterfaceC4181c
        /* renamed from: a */
        public String mo17a(int i) {
            return String.format(Locale.getDefault(), this.f37979a, Integer.valueOf(i));
        }
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$b */
    /* loaded from: classes2.dex */
    public class RunnableC4180b implements Runnable {

        /* renamed from: p */
        public boolean f37981p;

        public RunnableC4180b() {
        }

        /* renamed from: b */
        public final void m20b(boolean z) {
            this.f37981p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.m45c(this.f37981p);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f37931M);
        }
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4181c {
        /* renamed from: a */
        String mo17a(int i);
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4182d {
        /* renamed from: a */
        void m19a(NumberPicker numberPicker, int i);
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4183e {
        /* renamed from: a */
        void mo18a(NumberPicker numberPicker, int i, int i2);
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$f */
    /* loaded from: classes2.dex */
    public static class C4184f implements InterfaceC4181c {

        /* renamed from: b */
        public char f37984b;

        /* renamed from: c */
        public Formatter f37985c;

        /* renamed from: a */
        public final StringBuilder f37983a = new StringBuilder();

        /* renamed from: d */
        public final Object[] f37986d = new Object[1];

        public C4184f() {
            m14d(Locale.getDefault());
        }

        /* renamed from: c */
        public static char m15c(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.InterfaceC4181c
        /* renamed from: a */
        public String mo17a(int i) {
            Locale locale = Locale.getDefault();
            if (this.f37984b != m15c(locale)) {
                m14d(locale);
            }
            this.f37986d[0] = Integer.valueOf(i);
            StringBuilder sb = this.f37983a;
            sb.delete(0, sb.length());
            this.f37985c.format("%02d", this.f37986d);
            return this.f37985c.toString();
        }

        /* renamed from: b */
        public final Formatter m16b(Locale locale) {
            return new Formatter(this.f37983a, locale);
        }

        /* renamed from: d */
        public final void m14d(Locale locale) {
            this.f37985c = m16b(locale);
            this.f37984b = m15c(locale);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        int i2;
        float f;
        int i3;
        this.f37973x = -16777216;
        this.f37975y = -16777216;
        this.f37977z = 25.0f;
        this.f37915A = 25.0f;
        this.f37924F = 1;
        this.f37925G = 100;
        this.f37931M = 300L;
        this.f37932N = new SparseArray<>();
        this.f37933O = 3;
        this.f37934P = 3;
        this.f37935Q = 3 / 2;
        this.f37936R = new int[3];
        this.f37939U = Integer.MIN_VALUE;
        this.f37956o0 = -16777216;
        this.f37962r0 = 0;
        this.f37972w0 = -1;
        this.f37918B0 = true;
        this.f37920C0 = true;
        this.f37922D0 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n21.f19420x, i, 0);
        this.f37955n0 = C3866zk.m2178e(context, k11.np_numberpicker_selection_divider);
        this.f37956o0 = obtainStyledAttributes.getColor(n21.f19421y, this.f37956o0);
        this.f37958p0 = obtainStyledAttributes.getDimensionPixelSize(n21.f19422z, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f37960q0 = obtainStyledAttributes.getDimensionPixelSize(n21.f19368A, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f37916A0 = obtainStyledAttributes.getInt(n21.f19374G, 0);
        this.f37978z0 = obtainStyledAttributes.getInt(n21.f19375H, 1);
        this.f37974x0 = obtainStyledAttributes.getDimensionPixelSize(n21.f19384Q, -1);
        this.f37976y0 = obtainStyledAttributes.getDimensionPixelSize(n21.f19371D, -1);
        m52H();
        this.f37971w = true;
        this.f37926H = obtainStyledAttributes.getInt(n21.f19382O, this.f37926H);
        this.f37925G = obtainStyledAttributes.getInt(n21.f19372E, this.f37925G);
        this.f37924F = obtainStyledAttributes.getInt(n21.f19373F, this.f37924F);
        this.f37973x = obtainStyledAttributes.getColor(n21.f19377J, this.f37973x);
        this.f37915A = obtainStyledAttributes.getDimension(n21.f19378K, m51I(this.f37915A));
        this.f37975y = obtainStyledAttributes.getColor(n21.f19379L, this.f37975y);
        this.f37977z = obtainStyledAttributes.getDimension(n21.f19380M, m51I(this.f37977z));
        this.f37917B = Typeface.create(obtainStyledAttributes.getString(n21.f19381N), 0);
        this.f37930L = m50J(obtainStyledAttributes.getString(n21.f19370C));
        this.f37918B0 = obtainStyledAttributes.getBoolean(n21.f19369B, this.f37918B0);
        this.f37920C0 = obtainStyledAttributes.getBoolean(n21.f19376I, this.f37920C0);
        this.f37933O = obtainStyledAttributes.getInt(n21.f19383P, this.f37933O);
        setWillNotDraw(false);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(b21.number_picker_with_selector_wheel, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(n11.np__numberpicker_input);
        this.f37957p = editText;
        editText.setEnabled(false);
        editText.setFocusable(false);
        editText.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f37937S = paint;
        setSelectedTextColor(this.f37973x);
        setTextColor(this.f37975y);
        setTextSize(this.f37977z);
        setSelectedTextSize(this.f37915A);
        setTypeface(this.f37917B);
        setFormatter(this.f37930L);
        m48L();
        setValue(this.f37926H);
        setMaxValue(this.f37925G);
        setMinValue(this.f37924F);
        setDividerColor(this.f37956o0);
        setWheelItemCount(this.f37933O);
        boolean z = obtainStyledAttributes.getBoolean(n21.f19385R, this.f37954m0);
        this.f37954m0 = z;
        setWrapSelectorWheel(z);
        float f2 = this.f37974x0;
        if (f2 == -1.0f || this.f37976y0 == -1.0f) {
            if (f2 == -1.0f) {
                f2 = this.f37976y0;
                i2 = f2 != -1.0f ? this.f37965t : i2;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f37951j0 = viewConfiguration.getScaledTouchSlop();
                this.f37952k0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f37953l0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
                this.f37941W = new k91(context, null, true);
                this.f37942a0 = new k91(context, new DecelerateInterpolator(2.5f));
                if (getImportantForAccessibility() == 0) {
                }
                obtainStyledAttributes.recycle();
            }
            setScaleX(f2 / this.f37967u);
            f = this.f37974x0;
            i3 = this.f37967u;
            setScaleY(f / i3);
            ViewConfiguration viewConfiguration2 = ViewConfiguration.get(context);
            this.f37951j0 = viewConfiguration2.getScaledTouchSlop();
            this.f37952k0 = viewConfiguration2.getScaledMinimumFlingVelocity();
            this.f37953l0 = viewConfiguration2.getScaledMaximumFlingVelocity() / 8;
            this.f37941W = new k91(context, null, true);
            this.f37942a0 = new k91(context, new DecelerateInterpolator(2.5f));
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
            obtainStyledAttributes.recycle();
        }
        i2 = this.f37967u;
        setScaleX(f2 / i2);
        f = this.f37976y0;
        i3 = this.f37965t;
        setScaleY(f / i3);
        ViewConfiguration viewConfiguration22 = ViewConfiguration.get(context);
        this.f37951j0 = viewConfiguration22.getScaledTouchSlop();
        this.f37952k0 = viewConfiguration22.getScaledMinimumFlingVelocity();
        this.f37953l0 = viewConfiguration22.getScaledMaximumFlingVelocity() / 8;
        this.f37941W = new k91(context, null, true);
        this.f37942a0 = new k91(context, new DecelerateInterpolator(2.5f));
        if (getImportantForAccessibility() == 0) {
        }
        obtainStyledAttributes.recycle();
    }

    private float getMaxTextSize() {
        return Math.max(this.f37977z, this.f37915A);
    }

    private int[] getSelectorIndices() {
        return this.f37936R;
    }

    public static final InterfaceC4181c getTwoDigitFormatter() {
        return f37913E0;
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

    /* renamed from: A */
    public final float m59A(float f) {
        return f / getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: B */
    public final void m58B() {
        RunnableC4180b runnableC4180b = this.f37945d0;
        if (runnableC4180b != null) {
            removeCallbacks(runnableC4180b);
        }
    }

    /* renamed from: C */
    public final void m57C() {
        RunnableC4180b runnableC4180b = this.f37945d0;
        if (runnableC4180b != null) {
            removeCallbacks(runnableC4180b);
        }
    }

    /* renamed from: D */
    public final int m56D(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    /* renamed from: E */
    public void m55E(int i, int i2) {
        m54F(getResources().getString(i), i2);
    }

    /* renamed from: F */
    public void m54F(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTypeface(Typeface.create(str, i));
    }

    /* renamed from: G */
    public final void m53G(int i, boolean z) {
        if (this.f37926H == i) {
            return;
        }
        int m36l = this.f37954m0 ? m36l(i) : Math.min(Math.max(i, this.f37924F), this.f37925G);
        int i2 = this.f37926H;
        this.f37926H = m36l;
        m48L();
        if (z) {
            m26v(i2, m36l);
        }
        m32p();
        invalidate();
    }

    /* renamed from: H */
    public final void m52H() {
        float m43e;
        boolean m30r = m30r();
        this.f37963s = -1;
        if (m30r) {
            this.f37965t = (int) m43e(64.0f);
            m43e = m43e(180.0f);
        } else {
            this.f37965t = (int) m43e(180.0f);
            m43e = m43e(64.0f);
        }
        this.f37967u = (int) m43e;
        this.f37969v = -1;
    }

    /* renamed from: I */
    public final float m51I(float f) {
        return TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    /* renamed from: J */
    public final InterfaceC4181c m50J(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new C4179a(str);
    }

    /* renamed from: K */
    public final void m49K() {
        int i;
        if (this.f37971w) {
            this.f37937S.setTextSize(getMaxTextSize());
            String[] strArr = this.f37923E;
            int i2 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float measureText = this.f37937S.measureText(m38j(i3));
                    if (measureText > f) {
                        f = measureText;
                    }
                }
                for (int i4 = this.f37925G; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float measureText2 = this.f37937S.measureText(this.f37923E[i2]);
                    if (measureText2 > i5) {
                        i5 = (int) measureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            int paddingLeft = i + this.f37957p.getPaddingLeft() + this.f37957p.getPaddingRight();
            if (this.f37969v != paddingLeft) {
                int i6 = this.f37967u;
                if (paddingLeft > i6) {
                    this.f37969v = paddingLeft;
                } else {
                    this.f37969v = i6;
                }
                invalidate();
            }
        }
    }

    /* renamed from: L */
    public final boolean m48L() {
        String[] strArr = this.f37923E;
        String m39i = strArr == null ? m39i(this.f37926H) : strArr[this.f37926H - this.f37924F];
        if (TextUtils.isEmpty(m39i) || m39i.equals(this.f37957p.getText().toString())) {
            return false;
        }
        this.f37957p.setText(m39i);
        return true;
    }

    /* renamed from: c */
    public final void m45c(boolean z) {
        this.f37957p.setVisibility(4);
        if (!m27u(this.f37941W)) {
            m27u(this.f37942a0);
        }
        if (m30r()) {
            this.f37943b0 = 0;
            if (z) {
                this.f37941W.m17940m(0, 0, -this.f37938T, 0, 300);
            } else {
                this.f37941W.m17940m(0, 0, this.f37938T, 0, 300);
            }
        } else {
            this.f37944c0 = 0;
            if (z) {
                this.f37941W.m17940m(0, 0, 0, -this.f37938T, 300);
            } else {
                this.f37941W.m17940m(0, 0, 0, this.f37938T, 300);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (m29s()) {
            k91 k91Var = this.f37941W;
            if (k91Var.m17941l()) {
                k91Var = this.f37942a0;
                if (k91Var.m17941l()) {
                    return;
                }
            }
            k91Var.m17951b();
            if (m30r()) {
                int m17947f = k91Var.m17947f();
                if (this.f37943b0 == 0) {
                    this.f37943b0 = k91Var.m17943j();
                }
                scrollBy(m17947f - this.f37943b0, 0);
                this.f37943b0 = m17947f;
            } else {
                int m17946g = k91Var.m17946g();
                if (this.f37944c0 == 0) {
                    this.f37944c0 = k91Var.m17942k();
                }
                scrollBy(0, m17946g - this.f37944c0);
                this.f37944c0 = m17946g;
            }
            if (k91Var.m17941l()) {
                m24x(k91Var);
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: d */
    public final void m44d(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i = iArr[1] - 1;
        if (this.f37954m0 && i < this.f37924F) {
            i = this.f37925G;
        }
        iArr[0] = i;
        m42f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        requestFocus();
        r5.f37972w0 = r0;
        m58B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r5.f37941W.m17941l() == false) goto L30;
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
        m45c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f37972w0 == keyCode) {
                    this.f37972w0 = -1;
                    return true;
                }
            } else if (!this.f37954m0) {
            }
        } else if (keyCode == 23 || keyCode == 66) {
            m58B();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            m58B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            m58B();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: e */
    public final float m43e(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public final void m42f(int i) {
        String str;
        SparseArray<String> sparseArray = this.f37932N;
        if (sparseArray.get(i) != null) {
            return;
        }
        int i2 = this.f37924F;
        if (i < i2 || i > this.f37925G) {
            str = "";
        } else {
            String[] strArr = this.f37923E;
            str = strArr != null ? strArr[i - i2] : m39i(i);
        }
        sparseArray.put(i, str);
    }

    /* renamed from: g */
    public final boolean m41g() {
        k91 k91Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f37939U - this.f37940V;
        if (i5 != 0) {
            int abs = Math.abs(i5);
            int i6 = this.f37938T;
            if (abs > i6 / 2) {
                if (i5 > 0) {
                    i6 = -i6;
                }
                i5 += i6;
            }
            int i7 = i5;
            if (m30r()) {
                this.f37943b0 = 0;
                k91Var = this.f37942a0;
                i = 0;
                i2 = 0;
                i4 = 800;
                i3 = i7;
                i7 = 0;
            } else {
                this.f37944c0 = 0;
                k91Var = this.f37942a0;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 800;
            }
            k91Var.m17940m(i, i2, i3, i7, i4);
            invalidate();
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return (m30r() || !this.f37918B0) ? 0.0f : 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f37923E;
    }

    public int getDividerColor() {
        return this.f37956o0;
    }

    public float getDividerDistance() {
        return m22z(this.f37958p0);
    }

    public float getDividerThickness() {
        return m22z(this.f37960q0);
    }

    public InterfaceC4181c getFormatter() {
        return this.f37930L;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return (m30r() && this.f37918B0) ? 0.9f : 0.0f;
    }

    public int getMaxValue() {
        return this.f37925G;
    }

    public int getMinValue() {
        return this.f37924F;
    }

    public int getOrder() {
        return this.f37916A0;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return this.f37978z0;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return (m30r() && this.f37918B0) ? 0.9f : 0.0f;
    }

    public int getSelectedTextColor() {
        return this.f37973x;
    }

    public float getSelectedTextSize() {
        return this.f37915A;
    }

    public int getTextColor() {
        return this.f37975y;
    }

    public float getTextSize() {
        return m51I(this.f37977z);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return (m30r() || !this.f37918B0) ? 0.0f : 0.9f;
    }

    public Typeface getTypeface() {
        return this.f37917B;
    }

    public int getValue() {
        return this.f37926H;
    }

    public int getWheelItemCount() {
        return this.f37933O;
    }

    public boolean getWrapSelectorWheel() {
        return this.f37954m0;
    }

    /* renamed from: h */
    public final void m40h(int i) {
        k91 k91Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (m30r()) {
            this.f37943b0 = 0;
            k91Var = this.f37941W;
            i2 = i > 0 ? 0 : Integer.MAX_VALUE;
            i3 = 0;
            i9 = 0;
            i5 = 0;
            i6 = Integer.MAX_VALUE;
            i7 = 0;
            i8 = 0;
            i4 = i;
        } else {
            this.f37944c0 = 0;
            k91Var = this.f37941W;
            i2 = 0;
            i3 = i > 0 ? 0 : Integer.MAX_VALUE;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = Integer.MAX_VALUE;
            i9 = i;
        }
        k91Var.m17950c(i2, i3, i4, i9, i5, i6, i7, i8);
        invalidate();
    }

    /* renamed from: i */
    public final String m39i(int i) {
        InterfaceC4181c interfaceC4181c = this.f37930L;
        return interfaceC4181c != null ? interfaceC4181c.mo17a(i) : m38j(i);
    }

    /* renamed from: j */
    public final String m38j(int i) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
    }

    /* renamed from: k */
    public final float m37k(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: l */
    public final int m36l(int i) {
        int i2 = this.f37925G;
        int i3 = this.f37924F;
        return i > i2 ? (i3 + ((i - i2) % (i2 - i3))) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    /* renamed from: m */
    public final void m35m(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            iArr[i] = iArr[i2];
            i = i2;
        }
        int i3 = iArr[iArr.length - 2] + 1;
        if (this.f37954m0 && i3 > this.f37925G) {
            i3 = this.f37924F;
        }
        iArr[iArr.length - 1] = i3;
        m42f(i3);
    }

    /* renamed from: n */
    public final void m34n() {
        int bottom;
        int top;
        if (m30r()) {
            setHorizontalFadingEdgeEnabled(true);
            bottom = getRight();
            top = getLeft();
        } else {
            setVerticalFadingEdgeEnabled(true);
            bottom = getBottom();
            top = getTop();
        }
        setFadingEdgeLength(((bottom - top) - ((int) this.f37977z)) / 2);
    }

    /* renamed from: o */
    public final void m33o() {
        int maxTextSize;
        float f;
        m32p();
        int[] selectorIndices = getSelectorIndices();
        int length = ((selectorIndices.length - 1) * ((int) this.f37977z)) + ((int) this.f37915A);
        float length2 = selectorIndices.length;
        if (m30r()) {
            this.f37919C = (int) (((getRight() - getLeft()) - length) / length2);
            maxTextSize = ((int) getMaxTextSize()) + this.f37919C;
            this.f37938T = maxTextSize;
            f = this.f37959q;
        } else {
            this.f37921D = (int) (((getBottom() - getTop()) - length) / length2);
            maxTextSize = ((int) getMaxTextSize()) + this.f37921D;
            this.f37938T = maxTextSize;
            f = this.f37961r;
        }
        this.f37939U = ((int) f) - (maxTextSize * this.f37935Q);
        this.f37940V = this.f37939U;
        m48L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m58B();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float right;
        float f;
        Paint paint;
        int i;
        canvas.save();
        if (m30r()) {
            right = this.f37940V;
            f = this.f37957p.getBaseline() + this.f37957p.getTop();
            if (this.f37934P < 3) {
                canvas.clipRect(this.f37968u0, 0, this.f37970v0, getBottom());
            }
        } else {
            right = (getRight() - getLeft()) / 2;
            f = this.f37940V;
            if (this.f37934P < 3) {
                canvas.clipRect(0, this.f37964s0, getRight(), this.f37966t0);
            }
        }
        int[] selectorIndices = getSelectorIndices();
        for (int i2 = 0; i2 < selectorIndices.length; i2++) {
            if (i2 == this.f37935Q) {
                this.f37937S.setTextSize(this.f37915A);
                paint = this.f37937S;
                i = this.f37973x;
            } else {
                this.f37937S.setTextSize(this.f37977z);
                paint = this.f37937S;
                i = this.f37975y;
            }
            paint.setColor(i);
            String str = this.f37932N.get(selectorIndices[m31q() ? i2 : (selectorIndices.length - i2) - 1]);
            if (i2 != this.f37935Q || this.f37957p.getVisibility() != 0) {
                if (m30r()) {
                    canvas.drawText(str, right, f, this.f37937S);
                } else {
                    canvas.drawText(str, right, m37k(this.f37937S.getFontMetrics()) + f, this.f37937S);
                }
            }
            if (m30r()) {
                right += this.f37938T;
            } else {
                f += this.f37938T;
            }
        }
        canvas.restore();
        if (this.f37955n0 != null) {
            if (m30r()) {
                int i3 = this.f37968u0;
                this.f37955n0.setBounds(i3, 0, this.f37960q0 + i3, getBottom());
                this.f37955n0.draw(canvas);
                int i4 = this.f37970v0;
                this.f37955n0.setBounds(i4 - this.f37960q0, 0, i4, getBottom());
            } else {
                int i5 = this.f37964s0;
                this.f37955n0.setBounds(0, i5, getRight(), this.f37960q0 + i5);
                this.f37955n0.draw(canvas);
                int i6 = this.f37966t0;
                this.f37955n0.setBounds(0, i6 - this.f37960q0, getRight(), i6);
            }
            this.f37955n0.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(m29s());
        int i = this.f37924F;
        int i2 = this.f37938T;
        int i3 = (this.f37926H + i) * i2;
        int i4 = (this.f37925G - i) * i2;
        if (m30r()) {
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
            m58B();
            this.f37957p.setVisibility(4);
            if (m30r()) {
                float x = motionEvent.getX();
                this.f37946e0 = x;
                this.f37948g0 = x;
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!this.f37941W.m17941l()) {
                    this.f37941W.m17949d(true);
                    this.f37942a0.m17949d(true);
                    m25w(0);
                } else if (this.f37942a0.m17941l()) {
                    float f = this.f37946e0;
                    int i = this.f37968u0;
                    if (f >= i && f <= this.f37970v0) {
                        View.OnClickListener onClickListener = this.f37927I;
                        if (onClickListener != null) {
                            onClickListener.onClick(this);
                        }
                    } else if (f < i) {
                        m23y(false, ViewConfiguration.getLongPressTimeout());
                    } else if (f > this.f37970v0) {
                        m23y(true, ViewConfiguration.getLongPressTimeout());
                    }
                } else {
                    this.f37941W.m17949d(true);
                    this.f37942a0.m17949d(true);
                }
                return true;
            }
            float y = motionEvent.getY();
            this.f37947f0 = y;
            this.f37949h0 = y;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.f37941W.m17941l()) {
                this.f37941W.m17949d(true);
                this.f37942a0.m17949d(true);
                m25w(0);
            } else if (this.f37942a0.m17941l()) {
                float f2 = this.f37947f0;
                int i2 = this.f37964s0;
                if (f2 >= i2 && f2 <= this.f37966t0) {
                    View.OnClickListener onClickListener2 = this.f37927I;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                } else if (f2 < i2) {
                    m23y(false, ViewConfiguration.getLongPressTimeout());
                } else if (f2 > this.f37966t0) {
                    m23y(true, ViewConfiguration.getLongPressTimeout());
                }
            } else {
                this.f37941W.m17949d(true);
                this.f37942a0.m17949d(true);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f37957p.getMeasuredWidth();
        int measuredHeight2 = this.f37957p.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.f37957p.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        this.f37959q = this.f37957p.getX() + (this.f37957p.getMeasuredWidth() / 2);
        this.f37961r = this.f37957p.getY() + (this.f37957p.getMeasuredHeight() / 2);
        if (z) {
            m33o();
            m34n();
            if (m30r()) {
                int width = getWidth();
                int i7 = this.f37958p0;
                int i8 = this.f37960q0;
                int i9 = ((width - i7) / 2) - i8;
                this.f37968u0 = i9;
                this.f37970v0 = i9 + (i8 * 2) + i7;
                return;
            }
            int height = getHeight();
            int i10 = this.f37958p0;
            int i11 = this.f37960q0;
            int i12 = ((height - i10) / 2) - i11;
            this.f37964s0 = i12;
            this.f37966t0 = i12 + (i11 * 2) + i10;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(m28t(i, this.f37969v), m28t(i2, this.f37965t));
        setMeasuredDimension(m56D(this.f37967u, getMeasuredWidth(), i), m56D(this.f37963s, getMeasuredHeight(), i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r7 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r7 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        m45c(false);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int yVelocity;
        if (isEnabled() && m29s()) {
            if (this.f37950i0 == null) {
                this.f37950i0 = VelocityTracker.obtain();
            }
            this.f37950i0.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 1) {
                m57C();
                VelocityTracker velocityTracker = this.f37950i0;
                velocityTracker.computeCurrentVelocity(1000, this.f37953l0);
                if (m30r()) {
                    yVelocity = (int) velocityTracker.getXVelocity();
                    if (Math.abs(yVelocity) <= this.f37952k0) {
                        int x = (int) motionEvent.getX();
                        if (((int) Math.abs(x - this.f37946e0)) <= this.f37951j0) {
                            int i = (x / this.f37938T) - this.f37935Q;
                            if (i <= 0) {
                            }
                            m45c(true);
                            m25w(0);
                            this.f37950i0.recycle();
                            this.f37950i0 = null;
                        }
                        m41g();
                        m25w(0);
                        this.f37950i0.recycle();
                        this.f37950i0 = null;
                    }
                    m40h(yVelocity);
                    m25w(2);
                    this.f37950i0.recycle();
                    this.f37950i0 = null;
                } else {
                    yVelocity = (int) velocityTracker.getYVelocity();
                    if (Math.abs(yVelocity) <= this.f37952k0) {
                        int y = (int) motionEvent.getY();
                        if (((int) Math.abs(y - this.f37947f0)) <= this.f37951j0) {
                            int i2 = (y / this.f37938T) - this.f37935Q;
                            if (i2 <= 0) {
                            }
                            m45c(true);
                            m25w(0);
                            this.f37950i0.recycle();
                            this.f37950i0 = null;
                        }
                        m41g();
                        m25w(0);
                        this.f37950i0.recycle();
                        this.f37950i0 = null;
                    }
                    m40h(yVelocity);
                    m25w(2);
                    this.f37950i0.recycle();
                    this.f37950i0 = null;
                }
            } else if (action == 2) {
                if (m30r()) {
                    float x2 = motionEvent.getX();
                    if (this.f37962r0 == 1) {
                        scrollBy((int) (x2 - this.f37948g0), 0);
                        invalidate();
                    } else if (((int) Math.abs(x2 - this.f37946e0)) > this.f37951j0) {
                        m58B();
                        m25w(1);
                    }
                    this.f37948g0 = x2;
                } else {
                    float y2 = motionEvent.getY();
                    if (this.f37962r0 == 1) {
                        scrollBy(0, (int) (y2 - this.f37949h0));
                        invalidate();
                    } else if (((int) Math.abs(y2 - this.f37947f0)) > this.f37951j0) {
                        m58B();
                        m25w(1);
                    }
                    this.f37949h0 = y2;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m32p() {
        this.f37932N.clear();
        int[] selectorIndices = getSelectorIndices();
        int value = getValue();
        for (int i = 0; i < this.f37936R.length; i++) {
            int i2 = (i - this.f37935Q) + value;
            if (this.f37954m0) {
                i2 = m36l(i2);
            }
            selectorIndices[i] = i2;
            m42f(selectorIndices[i]);
        }
    }

    /* renamed from: q */
    public boolean m31q() {
        return getOrder() == 0;
    }

    /* renamed from: r */
    public boolean m30r() {
        return getOrientation() == 0;
    }

    /* renamed from: s */
    public boolean m29s() {
        return this.f37920C0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r4.f37940V = r4.f37939U;
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
    */
    public void scrollBy(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (!m29s()) {
            return;
        }
        int[] selectorIndices = getSelectorIndices();
        if (m30r()) {
            if (m31q()) {
                this.f37940V += i;
                i3 = this.f37919C;
            } else {
                this.f37940V += i;
                i3 = this.f37919C;
            }
            while (true) {
                i4 = this.f37940V;
                if (i4 - this.f37939U > i3) {
                    break;
                }
                this.f37940V = i4 - this.f37938T;
                if (m31q()) {
                    m44d(selectorIndices);
                } else {
                    m35m(selectorIndices);
                }
                m53G(selectorIndices[this.f37935Q], true);
                if (!this.f37954m0 && selectorIndices[this.f37935Q] < this.f37924F) {
                    this.f37940V = this.f37939U;
                }
            }
            while (true) {
                i5 = this.f37940V;
                if (i5 - this.f37939U < (-i3)) {
                    return;
                }
                this.f37940V = i5 + this.f37938T;
                if (m31q()) {
                    m35m(selectorIndices);
                } else {
                    m44d(selectorIndices);
                }
                m53G(selectorIndices[this.f37935Q], true);
                if (!this.f37954m0 && selectorIndices[this.f37935Q] > this.f37925G) {
                    this.f37940V = this.f37939U;
                }
            }
        } else {
            if (m31q()) {
                this.f37940V += i2;
                i3 = this.f37921D;
            } else {
                this.f37940V += i2;
                i3 = this.f37921D;
            }
            while (true) {
                i4 = this.f37940V;
                if (i4 - this.f37939U > i3) {
                }
            }
            while (true) {
                i5 = this.f37940V;
                if (i5 - this.f37939U < (-i3)) {
                }
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        EditText editText;
        int i;
        if (this.f37923E == strArr) {
            return;
        }
        this.f37923E = strArr;
        if (strArr != null) {
            editText = this.f37957p;
            i = 524289;
        } else {
            editText = this.f37957p;
            i = 2;
        }
        editText.setRawInputType(i);
        m48L();
        m32p();
        m49K();
    }

    public void setDividerColor(int i) {
        this.f37956o0 = i;
        this.f37955n0 = new ColorDrawable(i);
    }

    public void setDividerColorResource(int i) {
        setDividerColor(C3866zk.m2180c(this.f37922D0, i));
    }

    public void setDividerDistance(int i) {
        this.f37958p0 = (int) m43e(i);
    }

    public void setDividerThickness(int i) {
        this.f37960q0 = (int) m43e(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f37957p.setEnabled(z);
    }

    public void setFadingEdgeEnabled(boolean z) {
        this.f37918B0 = z;
    }

    public void setFormatter(int i) {
        setFormatter(getResources().getString(i));
    }

    public void setFormatter(InterfaceC4181c interfaceC4181c) {
        if (interfaceC4181c == this.f37930L) {
            return;
        }
        this.f37930L = interfaceC4181c;
        m32p();
        m48L();
    }

    public void setFormatter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setFormatter(m50J(str));
    }

    public void setMaxValue(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f37925G = i;
        if (i < this.f37926H) {
            this.f37926H = i;
        }
        setWrapSelectorWheel(i - this.f37924F > this.f37936R.length);
        m32p();
        m48L();
        m49K();
        invalidate();
    }

    public void setMinValue(int i) {
        this.f37924F = i;
        if (i > this.f37926H) {
            this.f37926H = i;
        }
        setWrapSelectorWheel(this.f37925G - i > this.f37936R.length);
        m32p();
        m48L();
        m49K();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f37927I = onClickListener;
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f37931M = j;
    }

    public void setOnScrollListener(InterfaceC4182d interfaceC4182d) {
        this.f37929K = interfaceC4182d;
    }

    public void setOnValueChangedListener(InterfaceC4183e interfaceC4183e) {
        this.f37928J = interfaceC4183e;
    }

    public void setOrder(int i) {
        this.f37916A0 = i;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.f37978z0 = i;
        m52H();
    }

    public void setScrollerEnabled(boolean z) {
        this.f37920C0 = z;
    }

    public void setSelectedTextColor(int i) {
        this.f37973x = i;
        this.f37957p.setTextColor(i);
    }

    public void setSelectedTextColorResource(int i) {
        setSelectedTextColor(C3866zk.m2180c(this.f37922D0, i));
    }

    public void setSelectedTextSize(float f) {
        this.f37915A = f;
        this.f37957p.setTextSize(m59A(f));
    }

    public void setSelectedTextSize(int i) {
        setSelectedTextSize(getResources().getDimension(i));
    }

    public void setTextColor(int i) {
        this.f37975y = i;
        this.f37937S.setColor(i);
    }

    public void setTextColorResource(int i) {
        setTextColor(C3866zk.m2180c(this.f37922D0, i));
    }

    public void setTextSize(float f) {
        this.f37977z = f;
        this.f37937S.setTextSize(f);
    }

    public void setTextSize(int i) {
        setTextSize(getResources().getDimension(i));
    }

    public void setTypeface(int i) {
        m55E(i, 0);
    }

    public void setTypeface(Typeface typeface) {
        Paint paint;
        Typeface typeface2;
        this.f37917B = typeface;
        if (typeface != null) {
            this.f37957p.setTypeface(typeface);
            paint = this.f37937S;
            typeface2 = this.f37917B;
        } else {
            this.f37957p.setTypeface(Typeface.MONOSPACE);
            paint = this.f37937S;
            typeface2 = Typeface.MONOSPACE;
        }
        paint.setTypeface(typeface2);
    }

    public void setTypeface(String str) {
        m54F(str, 0);
    }

    public void setValue(int i) {
        m53G(i, false);
    }

    public void setWheelItemCount(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Wheel item count must be >= 1");
        }
        this.f37934P = i;
        if (i < 3) {
            i = 3;
        }
        this.f37933O = i;
        this.f37935Q = i / 2;
        this.f37936R = new int[i];
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.f37925G - this.f37924F >= this.f37936R.length;
        if ((!z || z2) && z != this.f37954m0) {
            this.f37954m0 = z;
        }
    }

    /* renamed from: t */
    public final int m28t(int i, int i2) {
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

    /* renamed from: u */
    public final boolean m27u(k91 k91Var) {
        k91Var.m17949d(true);
        if (m30r()) {
            int m17945h = k91Var.m17945h() - k91Var.m17947f();
            int i = this.f37939U - ((this.f37940V + m17945h) % this.f37938T);
            if (i != 0) {
                int abs = Math.abs(i);
                int i2 = this.f37938T;
                if (abs > i2 / 2) {
                    i = i > 0 ? i - i2 : i + i2;
                }
                scrollBy(m17945h + i, 0);
                return true;
            }
        } else {
            int m17944i = k91Var.m17944i() - k91Var.m17946g();
            int i3 = this.f37939U - ((this.f37940V + m17944i) % this.f37938T);
            if (i3 != 0) {
                int abs2 = Math.abs(i3);
                int i4 = this.f37938T;
                if (abs2 > i4 / 2) {
                    i3 = i3 > 0 ? i3 - i4 : i3 + i4;
                }
                scrollBy(0, m17944i + i3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m26v(int i, int i2) {
        InterfaceC4183e interfaceC4183e = this.f37928J;
        if (interfaceC4183e != null) {
            interfaceC4183e.mo18a(this, i, this.f37926H);
        }
    }

    /* renamed from: w */
    public final void m25w(int i) {
        if (this.f37962r0 == i) {
            return;
        }
        this.f37962r0 = i;
        InterfaceC4182d interfaceC4182d = this.f37929K;
        if (interfaceC4182d != null) {
            interfaceC4182d.m19a(this, i);
        }
    }

    /* renamed from: x */
    public final void m24x(k91 k91Var) {
        if (k91Var == this.f37941W) {
            if (!m41g()) {
                m48L();
            }
            m25w(0);
        } else if (this.f37962r0 != 1) {
            m48L();
        }
    }

    /* renamed from: y */
    public final void m23y(boolean z, long j) {
        RunnableC4180b runnableC4180b = this.f37945d0;
        if (runnableC4180b == null) {
            this.f37945d0 = new RunnableC4180b();
        } else {
            removeCallbacks(runnableC4180b);
        }
        this.f37945d0.m20b(z);
        postDelayed(this.f37945d0, j);
    }

    /* renamed from: z */
    public final float m22z(float f) {
        return f / getResources().getDisplayMetrics().density;
    }
}
