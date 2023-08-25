package com.daaw;

import android.widget.ListView;
/* loaded from: classes.dex */
public class dk0 extends AbstractView$OnTouchListenerC3402w7 {

    /* renamed from: H */
    public final ListView f7213H;

    public dk0(ListView listView) {
        super(listView);
        this.f7213H = listView;
    }

    @Override // com.daaw.AbstractView$OnTouchListenerC3402w7
    /* renamed from: a */
    public boolean mo6514a(int i) {
        return false;
    }

    @Override // com.daaw.AbstractView$OnTouchListenerC3402w7
    /* renamed from: b */
    public boolean mo6513b(int i) {
        ListView listView = this.f7213H;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractView$OnTouchListenerC3402w7
    /* renamed from: j */
    public void mo6505j(int i, int i2) {
        ek0.m23433a(this.f7213H, i2);
    }
}
