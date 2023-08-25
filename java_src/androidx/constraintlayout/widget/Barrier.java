package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.daaw.C1815ja;
import com.daaw.C2716qj;
import com.daaw.p21;
/* loaded from: classes.dex */
public class Barrier extends AbstractC0181b {

    /* renamed from: x */
    public int f863x;

    /* renamed from: y */
    public int f864y;

    /* renamed from: z */
    public C1815ja f865z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b
    /* renamed from: g */
    public void mo12220g(AttributeSet attributeSet) {
        super.mo12220g(attributeSet);
        this.f865z = new C1815ja();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.f22371a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22434j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == p21.f22427i1) {
                    this.f865z.m18695L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == p21.f22440k1) {
                    this.f865z.m18693N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f985s = this.f865z;
        m29861m();
    }

    public int getMargin() {
        return this.f865z.m18697J0();
    }

    public int getType() {
        return this.f863x;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b
    /* renamed from: h */
    public void mo29866h(C2716qj c2716qj, boolean z) {
        m29897o(c2716qj, this.f863x, z);
    }

    /* renamed from: n */
    public boolean m29898n() {
        return this.f865z.m18699H0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r6 == 6) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 == 6) goto L13;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29897o(C2716qj c2716qj, int i, boolean z) {
        this.f864y = i;
        if (z) {
            int i2 = this.f863x;
            if (i2 != 5) {
            }
            this.f864y = 1;
        } else {
            int i3 = this.f863x;
            if (i3 != 5) {
            }
            this.f864y = 0;
        }
        if (c2716qj instanceof C1815ja) {
            ((C1815ja) c2716qj).m18694M0(this.f864y);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f865z.m18695L0(z);
    }

    public void setDpMargin(int i) {
        C1815ja c1815ja = this.f865z;
        c1815ja.m18693N0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f865z.m18693N0(i);
    }

    public void setType(int i) {
        this.f863x = i;
    }
}
