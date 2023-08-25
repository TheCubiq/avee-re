package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue p;
    public TypedValue q;
    public TypedValue r;
    public TypedValue s;
    public TypedValue t;
    public TypedValue u;
    public final Rect v;
    public a w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i, int i2, int i3, int i4) {
        this.v.set(i, i2, i3, i4);
        if (xs1.V(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.t == null) {
            this.t = new TypedValue();
        }
        return this.t;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.u == null) {
            this.u = new TypedValue();
        }
        return this.u;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.r == null) {
            this.r = new TypedValue();
        }
        return this.r;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.s == null) {
            this.s = new TypedValue();
        }
        return this.s;
    }

    public TypedValue getMinWidthMajor() {
        if (this.p == null) {
            this.p = new TypedValue();
        }
        return this.p;
    }

    public TypedValue getMinWidthMinor() {
        if (this.q == null) {
            this.q = new TypedValue();
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.w;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.w = aVar;
    }
}
