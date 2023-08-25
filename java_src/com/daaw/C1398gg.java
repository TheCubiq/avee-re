package com.daaw;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.daaw.C2932sd;
import com.daaw.nf1;
/* renamed from: com.daaw.gg */
/* loaded from: classes2.dex */
public final class C1398gg {

    /* renamed from: b0 */
    public static final boolean f11158b0 = false;

    /* renamed from: c0 */
    public static final Paint f11159c0 = null;

    /* renamed from: A */
    public boolean f11160A;

    /* renamed from: B */
    public Bitmap f11161B;

    /* renamed from: C */
    public Paint f11162C;

    /* renamed from: D */
    public float f11163D;

    /* renamed from: E */
    public float f11164E;

    /* renamed from: F */
    public int[] f11165F;

    /* renamed from: G */
    public boolean f11166G;

    /* renamed from: H */
    public final TextPaint f11167H;

    /* renamed from: I */
    public final TextPaint f11168I;

    /* renamed from: J */
    public TimeInterpolator f11169J;

    /* renamed from: K */
    public TimeInterpolator f11170K;

    /* renamed from: L */
    public float f11171L;

    /* renamed from: M */
    public float f11172M;

    /* renamed from: N */
    public float f11173N;

    /* renamed from: O */
    public ColorStateList f11174O;

    /* renamed from: P */
    public float f11175P;

    /* renamed from: Q */
    public float f11176Q;

    /* renamed from: R */
    public float f11177R;

    /* renamed from: S */
    public ColorStateList f11178S;

    /* renamed from: T */
    public float f11179T;

    /* renamed from: U */
    public float f11180U;

    /* renamed from: V */
    public StaticLayout f11181V;

    /* renamed from: W */
    public float f11182W;

    /* renamed from: X */
    public float f11183X;

    /* renamed from: Y */
    public float f11184Y;

    /* renamed from: Z */
    public CharSequence f11185Z;

    /* renamed from: a */
    public final View f11186a;

    /* renamed from: b */
    public boolean f11188b;

    /* renamed from: c */
    public float f11189c;

    /* renamed from: d */
    public final Rect f11190d;

    /* renamed from: e */
    public final Rect f11191e;

    /* renamed from: f */
    public final RectF f11192f;

    /* renamed from: k */
    public ColorStateList f11197k;

    /* renamed from: l */
    public ColorStateList f11198l;

    /* renamed from: m */
    public float f11199m;

    /* renamed from: n */
    public float f11200n;

    /* renamed from: o */
    public float f11201o;

    /* renamed from: p */
    public float f11202p;

    /* renamed from: q */
    public float f11203q;

    /* renamed from: r */
    public float f11204r;

    /* renamed from: s */
    public Typeface f11205s;

    /* renamed from: t */
    public Typeface f11206t;

    /* renamed from: u */
    public Typeface f11207u;

    /* renamed from: v */
    public C2932sd f11208v;

    /* renamed from: w */
    public C2932sd f11209w;

    /* renamed from: x */
    public CharSequence f11210x;

    /* renamed from: y */
    public CharSequence f11211y;

    /* renamed from: z */
    public boolean f11212z;

    /* renamed from: g */
    public int f11193g = 16;

    /* renamed from: h */
    public int f11194h = 16;

    /* renamed from: i */
    public float f11195i = 15.0f;

    /* renamed from: j */
    public float f11196j = 15.0f;

    /* renamed from: a0 */
    public int f11187a0 = 1;

    /* renamed from: com.daaw.gg$a */
    /* loaded from: classes2.dex */
    public class C1399a implements C2932sd.InterfaceC2933a {
        public C1399a() {
        }

        @Override // com.daaw.C2932sd.InterfaceC2933a
        /* renamed from: a */
        public void mo10454a(Typeface typeface) {
            C1398gg.this.m21704M(typeface);
        }
    }

    public C1398gg(View view) {
        this.f11186a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f11167H = textPaint;
        this.f11168I = new TextPaint(textPaint);
        this.f11191e = new Rect();
        this.f11190d = new Rect();
        this.f11192f = new RectF();
    }

    /* renamed from: C */
    public static float m21714C(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1247f3.m22951a(f, f2, f3);
    }

    /* renamed from: F */
    public static boolean m21711F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    public static int m21690a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: z */
    public static boolean m21662z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: A */
    public final boolean m21716A() {
        return xs1.m4768E(this.f11186a) == 1;
    }

    /* renamed from: B */
    public final boolean m21715B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f11198l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f11197k) != null && colorStateList.isStateful());
    }

    /* renamed from: D */
    public void m21713D() {
        this.f11188b = this.f11191e.width() > 0 && this.f11191e.height() > 0 && this.f11190d.width() > 0 && this.f11190d.height() > 0;
    }

    /* renamed from: E */
    public void m21712E() {
        if (this.f11186a.getHeight() <= 0 || this.f11186a.getWidth() <= 0) {
            return;
        }
        m21688b();
        m21684d();
    }

    /* renamed from: G */
    public void m21710G(int i, int i2, int i3, int i4) {
        if (m21711F(this.f11191e, i, i2, i3, i4)) {
            return;
        }
        this.f11191e.set(i, i2, i3, i4);
        this.f11166G = true;
        m21713D();
    }

    /* renamed from: H */
    public void m21709H(Rect rect) {
        m21710G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void m21708I(int i) {
        ik1 ik1Var = new ik1(this.f11186a.getContext(), i);
        ColorStateList colorStateList = ik1Var.f13693a;
        if (colorStateList != null) {
            this.f11198l = colorStateList;
        }
        float f = ik1Var.f13706n;
        if (f != 0.0f) {
            this.f11196j = f;
        }
        ColorStateList colorStateList2 = ik1Var.f13696d;
        if (colorStateList2 != null) {
            this.f11174O = colorStateList2;
        }
        this.f11172M = ik1Var.f13701i;
        this.f11173N = ik1Var.f13702j;
        this.f11171L = ik1Var.f13703k;
        this.f11179T = ik1Var.f13705m;
        C2932sd c2932sd = this.f11209w;
        if (c2932sd != null) {
            c2932sd.m10456c();
        }
        this.f11209w = new C2932sd(new C1399a(), ik1Var.m19738e());
        ik1Var.m19735h(this.f11186a.getContext(), this.f11209w);
        m21712E();
    }

    /* renamed from: J */
    public final void m21707J(float f) {
        this.f11182W = f;
        xs1.m4720i0(this.f11186a);
    }

    /* renamed from: K */
    public void m21706K(ColorStateList colorStateList) {
        if (this.f11198l != colorStateList) {
            this.f11198l = colorStateList;
            m21712E();
        }
    }

    /* renamed from: L */
    public void m21705L(int i) {
        if (this.f11194h != i) {
            this.f11194h = i;
            m21712E();
        }
    }

    /* renamed from: M */
    public void m21704M(Typeface typeface) {
        if (m21703N(typeface)) {
            m21712E();
        }
    }

    /* renamed from: N */
    public final boolean m21703N(Typeface typeface) {
        C2932sd c2932sd = this.f11209w;
        if (c2932sd != null) {
            c2932sd.m10456c();
        }
        if (this.f11205s != typeface) {
            this.f11205s = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void m21702O(int i, int i2, int i3, int i4) {
        if (m21711F(this.f11190d, i, i2, i3, i4)) {
            return;
        }
        this.f11190d.set(i, i2, i3, i4);
        this.f11166G = true;
        m21713D();
    }

    /* renamed from: P */
    public void m21701P(Rect rect) {
        m21702O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Q */
    public final void m21700Q(float f) {
        this.f11183X = f;
        xs1.m4720i0(this.f11186a);
    }

    /* renamed from: R */
    public void m21699R(ColorStateList colorStateList) {
        if (this.f11197k != colorStateList) {
            this.f11197k = colorStateList;
            m21712E();
        }
    }

    /* renamed from: S */
    public void m21698S(int i) {
        if (this.f11193g != i) {
            this.f11193g = i;
            m21712E();
        }
    }

    /* renamed from: T */
    public void m21697T(float f) {
        if (this.f11195i != f) {
            this.f11195i = f;
            m21712E();
        }
    }

    /* renamed from: U */
    public final boolean m21696U(Typeface typeface) {
        C2932sd c2932sd = this.f11208v;
        if (c2932sd != null) {
            c2932sd.m10456c();
        }
        if (this.f11206t != typeface) {
            this.f11206t = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public void m21695V(float f) {
        float m10153a = sn0.m10153a(f, 0.0f, 1.0f);
        if (m10153a != this.f11189c) {
            this.f11189c = m10153a;
            m21684d();
        }
    }

    /* renamed from: W */
    public final void m21694W(float f) {
        m21681g(f);
        boolean z = f11158b0 && this.f11163D != 1.0f;
        this.f11160A = z;
        if (z) {
            m21676l();
        }
        xs1.m4720i0(this.f11186a);
    }

    /* renamed from: X */
    public void m21693X(TimeInterpolator timeInterpolator) {
        this.f11169J = timeInterpolator;
        m21712E();
    }

    /* renamed from: Y */
    public final boolean m21692Y(int[] iArr) {
        this.f11165F = iArr;
        if (m21715B()) {
            m21712E();
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void m21691Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f11210x, charSequence)) {
            this.f11210x = charSequence;
            this.f11211y = null;
            m21680h();
            m21712E();
        }
    }

    /* renamed from: a0 */
    public void m21689a0(TimeInterpolator timeInterpolator) {
        this.f11170K = timeInterpolator;
        m21712E();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21688b() {
        float f;
        int i;
        float centerX;
        StaticLayout staticLayout;
        float measureText;
        StaticLayout staticLayout2;
        int i2;
        int i3;
        float centerX2;
        float f2;
        StaticLayout staticLayout3;
        float f3 = this.f11164E;
        m21681g(this.f11196j);
        CharSequence charSequence = this.f11211y;
        if (charSequence != null && (staticLayout3 = this.f11181V) != null) {
            this.f11185Z = TextUtils.ellipsize(charSequence, this.f11167H, staticLayout3.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f11185Z;
        float measureText2 = charSequence2 != null ? this.f11167H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int m21894b = g80.m21894b(this.f11194h, this.f11212z ? 1 : 0);
        int i4 = m21894b & 112;
        if (i4 == 48) {
            f = this.f11191e.top;
        } else if (i4 != 80) {
            this.f11200n = this.f11191e.centerY() - ((this.f11167H.descent() - this.f11167H.ascent()) / 2.0f);
            i = m21894b & 8388615;
            if (i != 1) {
                centerX = this.f11191e.centerX();
                measureText2 /= 2.0f;
            } else if (i != 5) {
                this.f11202p = this.f11191e.left;
                m21681g(this.f11195i);
                float height = this.f11181V != null ? staticLayout.getHeight() : 0.0f;
                CharSequence charSequence3 = this.f11211y;
                measureText = charSequence3 != null ? this.f11167H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
                staticLayout2 = this.f11181V;
                if (staticLayout2 != null && this.f11187a0 > 1 && !this.f11212z) {
                    measureText = staticLayout2.getWidth();
                }
                StaticLayout staticLayout4 = this.f11181V;
                this.f11184Y = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
                int m21894b2 = g80.m21894b(this.f11193g, this.f11212z ? 1 : 0);
                i2 = m21894b2 & 112;
                if (i2 != 48) {
                    this.f11199m = i2 != 80 ? this.f11190d.centerY() - (height / 2.0f) : (this.f11190d.bottom - height) + this.f11167H.descent();
                } else {
                    this.f11199m = this.f11190d.top;
                }
                i3 = m21894b2 & 8388615;
                if (i3 == 1) {
                    centerX2 = this.f11190d.centerX();
                    measureText /= 2.0f;
                } else if (i3 != 5) {
                    f2 = this.f11190d.left;
                    this.f11201o = f2;
                    m21680h();
                    m21694W(f3);
                } else {
                    centerX2 = this.f11190d.right;
                }
                f2 = centerX2 - measureText;
                this.f11201o = f2;
                m21680h();
                m21694W(f3);
            } else {
                centerX = this.f11191e.right;
            }
            this.f11202p = centerX - measureText2;
            m21681g(this.f11195i);
            if (this.f11181V != null) {
            }
            CharSequence charSequence32 = this.f11211y;
            if (charSequence32 != null) {
            }
            staticLayout2 = this.f11181V;
            if (staticLayout2 != null) {
                measureText = staticLayout2.getWidth();
            }
            StaticLayout staticLayout42 = this.f11181V;
            this.f11184Y = staticLayout42 != null ? staticLayout42.getLineLeft(0) : 0.0f;
            int m21894b22 = g80.m21894b(this.f11193g, this.f11212z ? 1 : 0);
            i2 = m21894b22 & 112;
            if (i2 != 48) {
            }
            i3 = m21894b22 & 8388615;
            if (i3 == 1) {
            }
            f2 = centerX2 - measureText;
            this.f11201o = f2;
            m21680h();
            m21694W(f3);
        } else {
            f = this.f11191e.bottom + this.f11167H.ascent();
        }
        this.f11200n = f;
        i = m21894b & 8388615;
        if (i != 1) {
        }
        this.f11202p = centerX - measureText2;
        m21681g(this.f11195i);
        if (this.f11181V != null) {
        }
        CharSequence charSequence322 = this.f11211y;
        if (charSequence322 != null) {
        }
        staticLayout2 = this.f11181V;
        if (staticLayout2 != null) {
        }
        StaticLayout staticLayout422 = this.f11181V;
        this.f11184Y = staticLayout422 != null ? staticLayout422.getLineLeft(0) : 0.0f;
        int m21894b222 = g80.m21894b(this.f11193g, this.f11212z ? 1 : 0);
        i2 = m21894b222 & 112;
        if (i2 != 48) {
        }
        i3 = m21894b222 & 8388615;
        if (i3 == 1) {
        }
        f2 = centerX2 - measureText;
        this.f11201o = f2;
        m21680h();
        m21694W(f3);
    }

    /* renamed from: b0 */
    public void m21687b0(Typeface typeface) {
        boolean m21703N = m21703N(typeface);
        boolean m21696U = m21696U(typeface);
        if (m21703N || m21696U) {
            m21712E();
        }
    }

    /* renamed from: c */
    public float m21686c() {
        if (this.f11210x == null) {
            return 0.0f;
        }
        m21665w(this.f11168I);
        TextPaint textPaint = this.f11168I;
        CharSequence charSequence = this.f11210x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public final boolean m21685c0() {
        return (this.f11187a0 <= 1 || this.f11212z || this.f11160A) ? false : true;
    }

    /* renamed from: d */
    public final void m21684d() {
        m21682f(this.f11189c);
    }

    /* renamed from: e */
    public final boolean m21683e(CharSequence charSequence) {
        return (m21716A() ? mk1.f18932d : mk1.f18931c).mo15990a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    public final void m21682f(float f) {
        TextPaint textPaint;
        int m21670r;
        m21663y(f);
        this.f11203q = m21714C(this.f11201o, this.f11202p, f, this.f11169J);
        this.f11204r = m21714C(this.f11199m, this.f11200n, f, this.f11169J);
        m21694W(m21714C(this.f11195i, this.f11196j, f, this.f11170K));
        TimeInterpolator timeInterpolator = C1247f3.f9052b;
        m21707J(1.0f - m21714C(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m21700Q(m21714C(1.0f, 0.0f, f, timeInterpolator));
        if (this.f11198l != this.f11197k) {
            textPaint = this.f11167H;
            m21670r = m21690a(m21668t(), m21670r(), f);
        } else {
            textPaint = this.f11167H;
            m21670r = m21670r();
        }
        textPaint.setColor(m21670r);
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = this.f11179T;
            float f3 = this.f11180U;
            if (f2 != f3) {
                this.f11167H.setLetterSpacing(m21714C(f3, f2, f, timeInterpolator));
            } else {
                this.f11167H.setLetterSpacing(f2);
            }
        }
        this.f11167H.setShadowLayer(m21714C(this.f11175P, this.f11171L, f, null), m21714C(this.f11176Q, this.f11172M, f, null), m21714C(this.f11177R, this.f11173N, f, null), m21690a(m21669s(this.f11178S), m21669s(this.f11174O), f));
        xs1.m4720i0(this.f11186a);
    }

    /* renamed from: g */
    public final void m21681g(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f11210x == null) {
            return;
        }
        float width = this.f11191e.width();
        float width2 = this.f11190d.width();
        if (m21662z(f, this.f11196j)) {
            f2 = this.f11196j;
            this.f11163D = 1.0f;
            Typeface typeface = this.f11207u;
            Typeface typeface2 = this.f11205s;
            if (typeface != typeface2) {
                this.f11207u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.f11195i;
            Typeface typeface3 = this.f11207u;
            Typeface typeface4 = this.f11206t;
            if (typeface3 != typeface4) {
                this.f11207u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (m21662z(f, f3)) {
                this.f11163D = 1.0f;
            } else {
                this.f11163D = f / this.f11195i;
            }
            float f4 = this.f11196j / this.f11195i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.f11164E != f2 || this.f11166G || z2;
            this.f11164E = f2;
            this.f11166G = false;
        }
        if (this.f11211y == null || z2) {
            this.f11167H.setTextSize(this.f11164E);
            this.f11167H.setTypeface(this.f11207u);
            this.f11167H.setLinearText(this.f11163D != 1.0f);
            this.f11212z = m21683e(this.f11210x);
            StaticLayout m21679i = m21679i(m21685c0() ? this.f11187a0 : 1, width, this.f11212z);
            this.f11181V = m21679i;
            this.f11211y = m21679i.getText();
        }
    }

    /* renamed from: h */
    public final void m21680h() {
        Bitmap bitmap = this.f11161B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f11161B = null;
        }
    }

    /* renamed from: i */
    public final StaticLayout m21679i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = nf1.m15198c(this.f11210x, this.f11167H, (int) f).m15196e(TextUtils.TruncateAt.END).m15194g(z).m15197d(Layout.Alignment.ALIGN_NORMAL).m15195f(false).m15193h(i).m15200a();
        } catch (nf1.C2287a e) {
            e.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) ty0.m8699f(staticLayout);
    }

    /* renamed from: j */
    public void m21678j(Canvas canvas) {
        int save = canvas.save();
        if (this.f11211y == null || !this.f11188b) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.f11203q + this.f11181V.getLineLeft(0)) - (this.f11184Y * 2.0f);
        this.f11167H.setTextSize(this.f11164E);
        float f = this.f11203q;
        float f2 = this.f11204r;
        if (this.f11160A && this.f11161B != null) {
            z = true;
        }
        float f3 = this.f11163D;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.f11161B, f, f2, this.f11162C);
            canvas.restoreToCount(save);
            return;
        }
        if (m21685c0()) {
            m21677k(canvas, lineLeft, f2);
        } else {
            canvas.translate(f, f2);
            this.f11181V.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public final void m21677k(Canvas canvas, float f, float f2) {
        int alpha = this.f11167H.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f11167H.setAlpha((int) (this.f11183X * f3));
        this.f11181V.draw(canvas);
        this.f11167H.setAlpha((int) (this.f11182W * f3));
        int lineBaseline = this.f11181V.getLineBaseline(0);
        CharSequence charSequence = this.f11185Z;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f11167H);
        String trim = this.f11185Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f11167H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f11181V.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.f11167H);
    }

    /* renamed from: l */
    public final void m21676l() {
        if (this.f11161B != null || this.f11190d.isEmpty() || TextUtils.isEmpty(this.f11211y)) {
            return;
        }
        m21682f(0.0f);
        int width = this.f11181V.getWidth();
        int height = this.f11181V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f11161B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f11181V.draw(new Canvas(this.f11161B));
        if (this.f11162C == null) {
            this.f11162C = new Paint(3);
        }
    }

    /* renamed from: m */
    public void m21675m(RectF rectF, int i, int i2) {
        this.f11212z = m21683e(this.f11210x);
        rectF.left = m21672p(i, i2);
        rectF.top = this.f11191e.top;
        rectF.right = m21671q(rectF, i, i2);
        rectF.bottom = this.f11191e.top + m21673o();
    }

    /* renamed from: n */
    public ColorStateList m21674n() {
        return this.f11198l;
    }

    /* renamed from: o */
    public float m21673o() {
        m21665w(this.f11168I);
        return -this.f11168I.ascent();
    }

    /* renamed from: p */
    public final float m21672p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (m21686c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f11212z ? this.f11191e.left : this.f11191e.right - m21686c() : this.f11212z ? this.f11191e.right - m21686c() : this.f11191e.left;
    }

    /* renamed from: q */
    public final float m21671q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (m21686c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f11212z ? rectF.left + m21686c() : this.f11191e.right : this.f11212z ? this.f11191e.right : rectF.left + m21686c();
    }

    /* renamed from: r */
    public int m21670r() {
        return m21669s(this.f11198l);
    }

    /* renamed from: s */
    public final int m21669s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f11165F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    public final int m21668t() {
        return m21669s(this.f11197k);
    }

    /* renamed from: u */
    public float m21667u() {
        m21664x(this.f11168I);
        return -this.f11168I.ascent();
    }

    /* renamed from: v */
    public float m21666v() {
        return this.f11189c;
    }

    /* renamed from: w */
    public final void m21665w(TextPaint textPaint) {
        textPaint.setTextSize(this.f11196j);
        textPaint.setTypeface(this.f11205s);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f11179T);
        }
    }

    /* renamed from: x */
    public final void m21664x(TextPaint textPaint) {
        textPaint.setTextSize(this.f11195i);
        textPaint.setTypeface(this.f11206t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f11180U);
        }
    }

    /* renamed from: y */
    public final void m21663y(float f) {
        this.f11192f.left = m21714C(this.f11190d.left, this.f11191e.left, f, this.f11169J);
        this.f11192f.top = m21714C(this.f11199m, this.f11200n, f, this.f11169J);
        this.f11192f.right = m21714C(this.f11190d.right, this.f11191e.right, f, this.f11169J);
        this.f11192f.bottom = m21714C(this.f11190d.bottom, this.f11191e.bottom, f, this.f11169J);
    }
}
