package com.google.android.exoplayer2.p002ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.daaw.C2914s6;
import com.daaw.sq1;
import com.daaw.w21;
import com.google.android.exoplayer2.p002ui.InterfaceC3977a;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements InterfaceC3977a {

    /* renamed from: A */
    public final int f35923A;

    /* renamed from: B */
    public final int f35924B;

    /* renamed from: C */
    public final int f35925C;

    /* renamed from: D */
    public final int f35926D;

    /* renamed from: E */
    public final int f35927E;

    /* renamed from: F */
    public final int f35928F;

    /* renamed from: G */
    public final int f35929G;

    /* renamed from: H */
    public final int f35930H;

    /* renamed from: I */
    public final StringBuilder f35931I;

    /* renamed from: J */
    public final Formatter f35932J;

    /* renamed from: K */
    public final Runnable f35933K;

    /* renamed from: L */
    public final CopyOnWriteArraySet<InterfaceC3977a.InterfaceC3978a> f35934L;

    /* renamed from: M */
    public int f35935M;

    /* renamed from: N */
    public long f35936N;

    /* renamed from: O */
    public int f35937O;

    /* renamed from: P */
    public int[] f35938P;

    /* renamed from: Q */
    public Point f35939Q;

    /* renamed from: R */
    public boolean f35940R;

    /* renamed from: S */
    public long f35941S;

    /* renamed from: T */
    public long f35942T;

    /* renamed from: U */
    public long f35943U;

    /* renamed from: V */
    public long f35944V;

    /* renamed from: W */
    public int f35945W;

    /* renamed from: a0 */
    public long[] f35946a0;

    /* renamed from: b0 */
    public boolean[] f35947b0;

    /* renamed from: p */
    public final Rect f35948p;

    /* renamed from: q */
    public final Rect f35949q;

    /* renamed from: r */
    public final Rect f35950r;

    /* renamed from: s */
    public final Rect f35951s;

    /* renamed from: t */
    public final Paint f35952t;

    /* renamed from: u */
    public final Paint f35953u;

    /* renamed from: v */
    public final Paint f35954v;

    /* renamed from: w */
    public final Paint f35955w;

    /* renamed from: x */
    public final Paint f35956x;

    /* renamed from: y */
    public final Paint f35957y;

    /* renamed from: z */
    public final Drawable f35958z;

    /* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar$a */
    /* loaded from: classes.dex */
    public class RunnableC3975a implements Runnable {
        public RunnableC3975a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultTimeBar.this.m1498q(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ?? r2;
        int max;
        this.f35948p = new Rect();
        this.f35949q = new Rect();
        this.f35950r = new Rect();
        this.f35951s = new Rect();
        Paint paint = new Paint();
        this.f35952t = paint;
        Paint paint2 = new Paint();
        this.f35953u = paint2;
        Paint paint3 = new Paint();
        this.f35954v = paint3;
        Paint paint4 = new Paint();
        this.f35955w = paint4;
        Paint paint5 = new Paint();
        this.f35956x = paint5;
        Paint paint6 = new Paint();
        this.f35957y = paint6;
        paint6.setAntiAlias(true);
        this.f35934L = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f35930H = m1513b(displayMetrics, -50);
        int m1513b = m1513b(displayMetrics, 4);
        int m1513b2 = m1513b(displayMetrics, 26);
        int m1513b3 = m1513b(displayMetrics, 4);
        int m1513b4 = m1513b(displayMetrics, 12);
        int m1513b5 = m1513b(displayMetrics, 0);
        int m1513b6 = m1513b(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w21.f30801c, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(w21.f30811m);
                this.f35958z = drawable;
                if (drawable != null) {
                    m1501n(drawable);
                    m1513b2 = Math.max(drawable.getMinimumHeight(), m1513b2);
                }
                this.f35923A = obtainStyledAttributes.getDimensionPixelSize(w21.f30804f, m1513b);
                this.f35924B = obtainStyledAttributes.getDimensionPixelSize(w21.f30813o, m1513b2);
                this.f35925C = obtainStyledAttributes.getDimensionPixelSize(w21.f30803e, m1513b3);
                this.f35926D = obtainStyledAttributes.getDimensionPixelSize(w21.f30812n, m1513b4);
                this.f35927E = obtainStyledAttributes.getDimensionPixelSize(w21.f30809k, m1513b5);
                this.f35928F = obtainStyledAttributes.getDimensionPixelSize(w21.f30810l, m1513b6);
                int i = obtainStyledAttributes.getInt(w21.f30807i, -1);
                int i2 = obtainStyledAttributes.getInt(w21.f30808j, m1508g(i));
                int i3 = obtainStyledAttributes.getInt(w21.f30805g, m1510e(i));
                int i4 = obtainStyledAttributes.getInt(w21.f30814p, m1507h(i));
                int i5 = obtainStyledAttributes.getInt(w21.f30802d, -1291845888);
                int i6 = obtainStyledAttributes.getInt(w21.f30806h, m1509f(i5));
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f35923A = m1513b;
            this.f35924B = m1513b2;
            this.f35925C = m1513b3;
            this.f35926D = m1513b4;
            this.f35927E = m1513b5;
            this.f35928F = m1513b6;
            paint.setColor(-1);
            paint6.setColor(m1508g(-1));
            paint2.setColor(m1510e(-1));
            paint3.setColor(m1507h(-1));
            paint4.setColor(-1291845888);
            this.f35958z = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f35931I = sb;
        this.f35932J = new Formatter(sb, Locale.getDefault());
        this.f35933K = new RunnableC3975a();
        Drawable drawable2 = this.f35958z;
        if (drawable2 != null) {
            max = drawable2.getMinimumWidth();
            r2 = 1;
        } else {
            r2 = 1;
            max = Math.max(this.f35927E, Math.max(this.f35926D, this.f35928F));
        }
        this.f35929G = (max + r2) / 2;
        this.f35942T = -9223372036854775807L;
        this.f35936N = -9223372036854775807L;
        this.f35935M = 20;
        setFocusable((boolean) r2);
        if (sq1.f26525a >= 16) {
            m1505j();
        }
    }

    /* renamed from: b */
    public static int m1513b(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    /* renamed from: e */
    public static int m1510e(int i) {
        return (i & 16777215) | (-872415232);
    }

    /* renamed from: f */
    public static int m1509f(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: g */
    public static int m1508g(int i) {
        return i | (-16777216);
    }

    private long getPositionIncrement() {
        long j = this.f35936N;
        if (j == -9223372036854775807L) {
            long j2 = this.f35942T;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.f35935M;
        }
        return j;
    }

    private String getProgressText() {
        return sq1.m10043B(this.f35931I, this.f35932J, this.f35943U);
    }

    private long getScrubberPosition() {
        if (this.f35949q.width() <= 0 || this.f35942T == -9223372036854775807L) {
            return 0L;
        }
        return (this.f35951s.width() * this.f35942T) / this.f35949q.width();
    }

    /* renamed from: h */
    public static int m1507h(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: o */
    public static boolean m1500o(Drawable drawable, int i) {
        return sq1.f26525a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: c */
    public final void m1512c(Canvas canvas) {
        if (this.f35942T <= 0) {
            return;
        }
        Rect rect = this.f35951s;
        int m10004l = sq1.m10004l(rect.right, rect.left, this.f35949q.right);
        int centerY = this.f35951s.centerY();
        Drawable drawable = this.f35958z;
        if (drawable == null) {
            canvas.drawCircle(m10004l, centerY, ((this.f35940R || isFocused()) ? this.f35928F : isEnabled() ? this.f35926D : this.f35927E) / 2, this.f35957y);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.f35958z.getIntrinsicHeight() / 2;
        this.f35958z.setBounds(m10004l - intrinsicWidth, centerY - intrinsicHeight, m10004l + intrinsicWidth, centerY + intrinsicHeight);
        this.f35958z.draw(canvas);
    }

    /* renamed from: d */
    public final void m1511d(Canvas canvas) {
        int height = this.f35949q.height();
        int centerY = this.f35949q.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f35942T <= 0) {
            Rect rect = this.f35949q;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f35954v);
            return;
        }
        Rect rect2 = this.f35950r;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f35949q.left, i3), this.f35951s.right);
        int i4 = this.f35949q.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f35954v);
        }
        int max2 = Math.max(i2, this.f35951s.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f35953u);
        }
        if (this.f35951s.width() > 0) {
            Rect rect3 = this.f35951s;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f35952t);
        }
        int i5 = this.f35925C / 2;
        for (int i6 = 0; i6 < this.f35945W; i6++) {
            long m10003m = sq1.m10003m(this.f35946a0[i6], 0L, this.f35942T);
            Rect rect4 = this.f35949q;
            int min = rect4.left + Math.min(rect4.width() - this.f35925C, Math.max(0, ((int) ((this.f35949q.width() * m10003m) / this.f35942T)) - i5));
            canvas.drawRect(min, centerY, min + this.f35925C, i, this.f35947b0[i6] ? this.f35956x : this.f35955w);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m1496s();
    }

    /* renamed from: i */
    public final boolean m1506i(float f, float f2) {
        return this.f35948p.contains((int) f, (int) f2);
    }

    @TargetApi(16)
    /* renamed from: j */
    public final void m1505j() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35958z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: k */
    public final void m1504k(float f) {
        Rect rect = this.f35951s;
        Rect rect2 = this.f35949q;
        rect.right = sq1.m10004l((int) f, rect2.left, rect2.right);
    }

    /* renamed from: l */
    public final Point m1503l(MotionEvent motionEvent) {
        if (this.f35938P == null) {
            this.f35938P = new int[2];
            this.f35939Q = new Point();
        }
        getLocationOnScreen(this.f35938P);
        this.f35939Q.set(((int) motionEvent.getRawX()) - this.f35938P[0], ((int) motionEvent.getRawY()) - this.f35938P[1]);
        return this.f35939Q;
    }

    /* renamed from: m */
    public final boolean m1502m(long j) {
        if (this.f35942T <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long m10003m = sq1.m10003m(scrubberPosition + j, 0L, this.f35942T);
        this.f35941S = m10003m;
        if (m10003m == scrubberPosition) {
            return false;
        }
        if (!this.f35940R) {
            m1499p();
        }
        Iterator<InterfaceC3977a.InterfaceC3978a> it = this.f35934L.iterator();
        while (it.hasNext()) {
            it.next().m1481a(this, this.f35941S);
        }
        m1497r();
        return true;
    }

    /* renamed from: n */
    public final boolean m1501n(Drawable drawable) {
        return sq1.f26525a >= 23 && m1500o(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m1511d(canvas);
        m1512c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f35942T <= 0) {
            return;
        }
        int i = sq1.f26525a;
        if (i >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m1502m(positionIncrement)) {
                            removeCallbacks(this.f35933K);
                            postDelayed(this.f35933K, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m1502m(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.f35940R) {
                removeCallbacks(this.f35933K);
                this.f35933K.run();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.f35924B) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.f35924B;
        int i7 = ((i6 - this.f35923A) / 2) + i5;
        this.f35948p.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.f35949q;
        Rect rect2 = this.f35948p;
        int i8 = rect2.left;
        int i9 = this.f35929G;
        rect.set(i8 + i9, i7, rect2.right - i9, this.f35923A + i7);
        m1497r();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f35924B;
        } else if (mode != 1073741824) {
            size = Math.min(this.f35924B, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m1496s();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f35958z;
        if (drawable == null || !m1500o(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 != 3) goto L36;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (isEnabled() && this.f35942T > 0) {
            Point m1503l = m1503l(motionEvent);
            int i = m1503l.x;
            int i2 = m1503l.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f35940R) {
                            if (i2 < this.f35930H) {
                                int i3 = this.f35937O;
                                f = i3 + ((i - i3) / 3);
                            } else {
                                this.f35937O = i;
                                f = i;
                            }
                            m1504k(f);
                            this.f35941S = getScrubberPosition();
                            Iterator<InterfaceC3977a.InterfaceC3978a> it = this.f35934L.iterator();
                            while (it.hasNext()) {
                                it.next().m1481a(this, this.f35941S);
                            }
                            m1497r();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.f35940R) {
                    m1498q(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                float f2 = i;
                if (m1506i(f2, i2)) {
                    m1504k(f2);
                    m1499p();
                    this.f35941S = getScrubberPosition();
                    m1497r();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m1499p() {
        this.f35940R = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC3977a.InterfaceC3978a> it = this.f35934L.iterator();
        while (it.hasNext()) {
            it.next().m1479c(this, getScrubberPosition());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (m1502m(-getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        m1498q(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (m1502m(getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        sendAccessibilityEvent(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        return true;
     */
    @Override // android.view.View
    @TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f35942T <= 0) {
            return false;
        }
        if (i != 8192) {
            if (i != 4096) {
                return false;
            }
        }
    }

    /* renamed from: q */
    public final void m1498q(boolean z) {
        this.f35940R = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC3977a.InterfaceC3978a> it = this.f35934L.iterator();
        while (it.hasNext()) {
            it.next().m1480b(this, getScrubberPosition(), z);
        }
    }

    /* renamed from: r */
    public final void m1497r() {
        this.f35950r.set(this.f35949q);
        this.f35951s.set(this.f35949q);
        long j = this.f35940R ? this.f35941S : this.f35943U;
        if (this.f35942T > 0) {
            int width = (int) ((this.f35949q.width() * this.f35944V) / this.f35942T);
            Rect rect = this.f35950r;
            Rect rect2 = this.f35949q;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f35949q.width() * j) / this.f35942T);
            Rect rect3 = this.f35951s;
            Rect rect4 = this.f35949q;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f35950r;
            int i = this.f35949q.left;
            rect5.right = i;
            this.f35951s.right = i;
        }
        invalidate(this.f35948p);
    }

    /* renamed from: s */
    public final void m1496s() {
        Drawable drawable = this.f35958z;
        if (drawable != null && drawable.isStateful() && this.f35958z.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void setAdMarkerColor(int i) {
        this.f35955w.setColor(i);
        invalidate(this.f35948p);
    }

    public void setBufferedColor(int i) {
        this.f35953u.setColor(i);
        invalidate(this.f35948p);
    }

    public void setBufferedPosition(long j) {
        this.f35944V = j;
        m1497r();
    }

    public void setDuration(long j) {
        this.f35942T = j;
        if (this.f35940R && j == -9223372036854775807L) {
            m1498q(true);
        }
        m1497r();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f35940R || z) {
            return;
        }
        m1498q(true);
    }

    public void setKeyCountIncrement(int i) {
        C2914s6.m10690a(i > 0);
        this.f35935M = i;
        this.f35936N = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C2914s6.m10690a(j > 0);
        this.f35935M = -1;
        this.f35936N = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f35956x.setColor(i);
        invalidate(this.f35948p);
    }

    public void setPlayedColor(int i) {
        this.f35952t.setColor(i);
        invalidate(this.f35948p);
    }

    public void setPosition(long j) {
        this.f35943U = j;
        setContentDescription(getProgressText());
        m1497r();
    }

    public void setScrubberColor(int i) {
        this.f35957y.setColor(i);
        invalidate(this.f35948p);
    }

    public void setUnplayedColor(int i) {
        this.f35954v.setColor(i);
        invalidate(this.f35948p);
    }
}
