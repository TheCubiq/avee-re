package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.daaw.s6;
import com.daaw.sq1;
import com.daaw.w21;
import com.google.android.exoplayer2.ui.a;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements com.google.android.exoplayer2.ui.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final StringBuilder I;
    public final Formatter J;
    public final Runnable K;
    public final CopyOnWriteArraySet<a.InterfaceC0096a> L;
    public int M;
    public long N;
    public int O;
    public int[] P;
    public Point Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public long V;
    public int W;
    public long[] a0;
    public boolean[] b0;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Paint t;
    public final Paint u;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final Paint y;
    public final Drawable z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultTimeBar.this.q(false);
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
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        Paint paint = new Paint();
        this.t = paint;
        Paint paint2 = new Paint();
        this.u = paint2;
        Paint paint3 = new Paint();
        this.v = paint3;
        Paint paint4 = new Paint();
        this.w = paint4;
        Paint paint5 = new Paint();
        this.x = paint5;
        Paint paint6 = new Paint();
        this.y = paint6;
        paint6.setAntiAlias(true);
        this.L = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.H = b(displayMetrics, -50);
        int b = b(displayMetrics, 4);
        int b2 = b(displayMetrics, 26);
        int b3 = b(displayMetrics, 4);
        int b4 = b(displayMetrics, 12);
        int b5 = b(displayMetrics, 0);
        int b6 = b(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w21.c, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(w21.m);
                this.z = drawable;
                if (drawable != null) {
                    n(drawable);
                    b2 = Math.max(drawable.getMinimumHeight(), b2);
                }
                this.A = obtainStyledAttributes.getDimensionPixelSize(w21.f, b);
                this.B = obtainStyledAttributes.getDimensionPixelSize(w21.o, b2);
                this.C = obtainStyledAttributes.getDimensionPixelSize(w21.e, b3);
                this.D = obtainStyledAttributes.getDimensionPixelSize(w21.n, b4);
                this.E = obtainStyledAttributes.getDimensionPixelSize(w21.k, b5);
                this.F = obtainStyledAttributes.getDimensionPixelSize(w21.l, b6);
                int i = obtainStyledAttributes.getInt(w21.i, -1);
                int i2 = obtainStyledAttributes.getInt(w21.j, g(i));
                int i3 = obtainStyledAttributes.getInt(w21.g, e(i));
                int i4 = obtainStyledAttributes.getInt(w21.p, h(i));
                int i5 = obtainStyledAttributes.getInt(w21.d, -1291845888);
                int i6 = obtainStyledAttributes.getInt(w21.h, f(i5));
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
            this.A = b;
            this.B = b2;
            this.C = b3;
            this.D = b4;
            this.E = b5;
            this.F = b6;
            paint.setColor(-1);
            paint6.setColor(g(-1));
            paint2.setColor(e(-1));
            paint3.setColor(h(-1));
            paint4.setColor(-1291845888);
            this.z = null;
        }
        StringBuilder sb = new StringBuilder();
        this.I = sb;
        this.J = new Formatter(sb, Locale.getDefault());
        this.K = new a();
        Drawable drawable2 = this.z;
        if (drawable2 != null) {
            max = drawable2.getMinimumWidth();
            r2 = 1;
        } else {
            r2 = 1;
            max = Math.max(this.E, Math.max(this.D, this.F));
        }
        this.G = (max + r2) / 2;
        this.T = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.M = 20;
        setFocusable((boolean) r2);
        if (sq1.a >= 16) {
            j();
        }
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    public static int e(int i) {
        return (i & 16777215) | (-872415232);
    }

    public static int f(int i) {
        return (i & 16777215) | 855638016;
    }

    public static int g(int i) {
        return i | (-16777216);
    }

    private long getPositionIncrement() {
        long j = this.N;
        if (j == -9223372036854775807L) {
            long j2 = this.T;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.M;
        }
        return j;
    }

    private String getProgressText() {
        return sq1.B(this.I, this.J, this.U);
    }

    private long getScrubberPosition() {
        if (this.q.width() <= 0 || this.T == -9223372036854775807L) {
            return 0L;
        }
        return (this.s.width() * this.T) / this.q.width();
    }

    public static int h(int i) {
        return (i & 16777215) | 855638016;
    }

    public static boolean o(Drawable drawable, int i) {
        return sq1.a >= 23 && drawable.setLayoutDirection(i);
    }

    public final void c(Canvas canvas) {
        if (this.T <= 0) {
            return;
        }
        Rect rect = this.s;
        int l = sq1.l(rect.right, rect.left, this.q.right);
        int centerY = this.s.centerY();
        Drawable drawable = this.z;
        if (drawable == null) {
            canvas.drawCircle(l, centerY, ((this.R || isFocused()) ? this.F : isEnabled() ? this.D : this.E) / 2, this.y);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.z.getIntrinsicHeight() / 2;
        this.z.setBounds(l - intrinsicWidth, centerY - intrinsicHeight, l + intrinsicWidth, centerY + intrinsicHeight);
        this.z.draw(canvas);
    }

    public final void d(Canvas canvas) {
        int height = this.q.height();
        int centerY = this.q.centerY() - (height / 2);
        int i = height + centerY;
        if (this.T <= 0) {
            Rect rect = this.q;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.v);
            return;
        }
        Rect rect2 = this.r;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.q.left, i3), this.s.right);
        int i4 = this.q.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.v);
        }
        int max2 = Math.max(i2, this.s.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.u);
        }
        if (this.s.width() > 0) {
            Rect rect3 = this.s;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.t);
        }
        int i5 = this.C / 2;
        for (int i6 = 0; i6 < this.W; i6++) {
            long m = sq1.m(this.a0[i6], 0L, this.T);
            Rect rect4 = this.q;
            int min = rect4.left + Math.min(rect4.width() - this.C, Math.max(0, ((int) ((this.q.width() * m) / this.T)) - i5));
            canvas.drawRect(min, centerY, min + this.C, i, this.b0[i6] ? this.x : this.w);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    public final boolean i(float f, float f2) {
        return this.p.contains((int) f, (int) f2);
    }

    @TargetApi(16)
    public final void j() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(float f) {
        Rect rect = this.s;
        Rect rect2 = this.q;
        rect.right = sq1.l((int) f, rect2.left, rect2.right);
    }

    public final Point l(MotionEvent motionEvent) {
        if (this.P == null) {
            this.P = new int[2];
            this.Q = new Point();
        }
        getLocationOnScreen(this.P);
        this.Q.set(((int) motionEvent.getRawX()) - this.P[0], ((int) motionEvent.getRawY()) - this.P[1]);
        return this.Q;
    }

    public final boolean m(long j) {
        if (this.T <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long m = sq1.m(scrubberPosition + j, 0L, this.T);
        this.S = m;
        if (m == scrubberPosition) {
            return false;
        }
        if (!this.R) {
            p();
        }
        Iterator<a.InterfaceC0096a> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.S);
        }
        r();
        return true;
    }

    public final boolean n(Drawable drawable) {
        return sq1.a >= 23 && o(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        d(canvas);
        c(canvas);
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
        if (this.T <= 0) {
            return;
        }
        int i = sq1.a;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L36
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L36
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m(r0)
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.K
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.K
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.R
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.K
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.K
            r5.run()
            return r3
        L36:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.B) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.B;
        int i7 = ((i6 - this.A) / 2) + i5;
        this.p.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.q;
        Rect rect2 = this.p;
        int i8 = rect2.left;
        int i9 = this.G;
        rect.set(i8 + i9, i7, rect2.right - i9, this.A + i7);
        r();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.B;
        } else if (mode != 1073741824) {
            size = Math.min(this.B, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        s();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.z;
        if (drawable == null || !o(drawable, i)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L87
            long r2 = r7.T
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L87
        L11:
            android.graphics.Point r0 = r7.l(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L72
            r5 = 3
            if (r3 == r4) goto L63
            r6 = 2
            if (r3 == r6) goto L29
            if (r3 == r5) goto L63
            goto L87
        L29:
            boolean r8 = r7.R
            if (r8 == 0) goto L87
            int r8 = r7.H
            if (r0 >= r8) goto L38
            int r8 = r7.O
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L3b
        L38:
            r7.O = r2
            float r8 = (float) r2
        L3b:
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.S = r0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.a$a> r8 = r7.L
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer2.ui.a$a r0 = (com.google.android.exoplayer2.ui.a.InterfaceC0096a) r0
            long r1 = r7.S
            r0.a(r7, r1)
            goto L4a
        L5c:
            r7.r()
            r7.invalidate()
            return r4
        L63:
            boolean r0 = r7.R
            if (r0 == 0) goto L87
            int r8 = r8.getAction()
            if (r8 != r5) goto L6e
            r1 = 1
        L6e:
            r7.q(r1)
            return r4
        L72:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.i(r8, r0)
            if (r0 == 0) goto L87
            r7.k(r8)
            r7.p()
            long r0 = r7.getScrubberPosition()
            r7.S = r0
            goto L5c
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        this.R = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<a.InterfaceC0096a> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().c(this, getScrubberPosition());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (m(-getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        q(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (m(getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        sendAccessibilityEvent(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        return true;
     */
    @Override // android.view.View
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L8
            return r0
        L8:
            long r1 = r6.T
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            return r8
        L12:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L25
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.m(r1)
            if (r7 == 0) goto L34
        L21:
            r6.q(r8)
            goto L34
        L25:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L39
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.m(r1)
            if (r7 == 0) goto L34
            goto L21
        L34:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L39:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final void q(boolean z) {
        this.R = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<a.InterfaceC0096a> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().b(this, getScrubberPosition(), z);
        }
    }

    public final void r() {
        this.r.set(this.q);
        this.s.set(this.q);
        long j = this.R ? this.S : this.U;
        if (this.T > 0) {
            int width = (int) ((this.q.width() * this.V) / this.T);
            Rect rect = this.r;
            Rect rect2 = this.q;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.q.width() * j) / this.T);
            Rect rect3 = this.s;
            Rect rect4 = this.q;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.r;
            int i = this.q.left;
            rect5.right = i;
            this.s.right = i;
        }
        invalidate(this.p);
    }

    public final void s() {
        Drawable drawable = this.z;
        if (drawable != null && drawable.isStateful() && this.z.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void setAdMarkerColor(int i) {
        this.w.setColor(i);
        invalidate(this.p);
    }

    public void setBufferedColor(int i) {
        this.u.setColor(i);
        invalidate(this.p);
    }

    public void setBufferedPosition(long j) {
        this.V = j;
        r();
    }

    public void setDuration(long j) {
        this.T = j;
        if (this.R && j == -9223372036854775807L) {
            q(true);
        }
        r();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.R || z) {
            return;
        }
        q(true);
    }

    public void setKeyCountIncrement(int i) {
        s6.a(i > 0);
        this.M = i;
        this.N = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        s6.a(j > 0);
        this.M = -1;
        this.N = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.x.setColor(i);
        invalidate(this.p);
    }

    public void setPlayedColor(int i) {
        this.t.setColor(i);
        invalidate(this.p);
    }

    public void setPosition(long j) {
        this.U = j;
        setContentDescription(getProgressText());
        r();
    }

    public void setScrubberColor(int i) {
        this.y.setColor(i);
        invalidate(this.p);
    }

    public void setUnplayedColor(int i) {
        this.v.setColor(i);
        invalidate(this.p);
    }
}
