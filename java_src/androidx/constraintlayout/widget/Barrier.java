package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.daaw.ja;
import com.daaw.p21;
import com.daaw.qj;
/* loaded from: classes.dex */
public class Barrier extends b {
    public int x;
    public int y;
    public ja z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.z = new ja();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == p21.i1) {
                    this.z.L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == p21.k1) {
                    this.z.N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.s = this.z;
        m();
    }

    public int getMargin() {
        return this.z.J0();
    }

    public int getType() {
        return this.x;
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(qj qjVar, boolean z) {
        o(qjVar, this.x, z);
    }

    public boolean n() {
        return this.z.H0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r6 == 6) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 == 6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.daaw.qj r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.y = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.x
            if (r6 != r2) goto Lf
        Lc:
            r3.y = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.x
            if (r6 != r2) goto L19
        L16:
            r3.y = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof com.daaw.ja
            if (r5 == 0) goto L27
            com.daaw.ja r4 = (com.daaw.ja) r4
            int r5 = r3.y
            r4.M0(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.o(com.daaw.qj, int, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.z.L0(z);
    }

    public void setDpMargin(int i) {
        ja jaVar = this.z;
        jaVar.N0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.z.N0(i);
    }

    public void setType(int i) {
        this.x = i;
    }
}
