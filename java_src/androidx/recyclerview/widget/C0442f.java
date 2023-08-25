package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C0442f {

    /* renamed from: b */
    public int f2232b;

    /* renamed from: c */
    public int f2233c;

    /* renamed from: d */
    public int f2234d;

    /* renamed from: e */
    public int f2235e;

    /* renamed from: h */
    public boolean f2238h;

    /* renamed from: i */
    public boolean f2239i;

    /* renamed from: a */
    public boolean f2231a = true;

    /* renamed from: f */
    public int f2236f = 0;

    /* renamed from: g */
    public int f2237g = 0;

    /* renamed from: a */
    public boolean m28221a(RecyclerView.C0409z c0409z) {
        int i = this.f2233c;
        return i >= 0 && i < c0409z.m28495b();
    }

    /* renamed from: b */
    public View m28220b(RecyclerView.C0403v c0403v) {
        View m28530o = c0403v.m28530o(this.f2233c);
        this.f2233c += this.f2234d;
        return m28530o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2232b + ", mCurrentPosition=" + this.f2233c + ", mItemDirection=" + this.f2234d + ", mLayoutDirection=" + this.f2235e + ", mStartLine=" + this.f2236f + ", mEndLine=" + this.f2237g + '}';
    }
}
