package com.daaw;

import android.widget.ListView;
/* loaded from: classes.dex */
public class dk0 extends w7 {
    public final ListView H;

    public dk0(ListView listView) {
        super(listView);
        this.H = listView;
    }

    @Override // com.daaw.w7
    public boolean a(int i) {
        return false;
    }

    @Override // com.daaw.w7
    public boolean b(int i) {
        ListView listView = this.H;
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

    @Override // com.daaw.w7
    public void j(int i, int i2) {
        ek0.a(this.H, i2);
    }
}
