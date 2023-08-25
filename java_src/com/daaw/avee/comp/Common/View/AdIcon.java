package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.daaw.C1782j4;
import com.daaw.C2575pq;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.View.AdIcon;
import com.daaw.oy0;
import com.daaw.u21;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class AdIcon extends C1782j4 {

    /* renamed from: s */
    public int f3809s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ug0.m8268f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ug0.m8268f(context, "context");
        this.f3809s = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u21.f28440j, 0, 0);
        ug0.m8269e(obtainStyledAttributes, "context.theme.obtainStyl…R.styleable.AdIcon, 0, 0)");
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        this.f3809s = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (z || oy0.f22101e.m6692a(Boolean.TRUE).booleanValue()) {
            setVisibility(8);
            return;
        }
        setImageResource(R.drawable.ic_ad);
        setOnClickListener(new View.OnClickListener() { // from class: com.daaw.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdIcon.m26862d(AdIcon.this, view);
            }
        });
    }

    public /* synthetic */ AdIcon(Context context, AttributeSet attributeSet, int i, int i2, C2575pq c2575pq) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: d */
    public static final void m26862d(AdIcon adIcon, View view) {
        ug0.m8268f(adIcon, "this$0");
        oy0.f22098b.m5753a(Integer.valueOf(adIcon.f3809s), Boolean.FALSE);
    }

    public final int getTargetId() {
        return this.f3809s;
    }

    public final void setTargetId(int i) {
        this.f3809s = i;
    }
}
