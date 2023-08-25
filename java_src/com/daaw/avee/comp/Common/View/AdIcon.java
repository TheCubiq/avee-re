package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.View.AdIcon;
import com.daaw.j4;
import com.daaw.oy0;
import com.daaw.pq;
import com.daaw.u21;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class AdIcon extends j4 {
    public int s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ug0.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ug0.f(context, "context");
        this.s = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u21.j, 0, 0);
        ug0.e(obtainStyledAttributes, "context.theme.obtainStyl…R.styleable.AdIcon, 0, 0)");
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        this.s = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (z || oy0.e.a(Boolean.TRUE).booleanValue()) {
            setVisibility(8);
            return;
        }
        setImageResource(R.drawable.ic_ad);
        setOnClickListener(new View.OnClickListener() { // from class: com.daaw.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdIcon.d(AdIcon.this, view);
            }
        });
    }

    public /* synthetic */ AdIcon(Context context, AttributeSet attributeSet, int i, int i2, pq pqVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void d(AdIcon adIcon, View view) {
        ug0.f(adIcon, "this$0");
        oy0.b.a(Integer.valueOf(adIcon.s), Boolean.FALSE);
    }

    public final int getTargetId() {
        return this.s;
    }

    public final void setTargetId(int i) {
        this.s = i;
    }
}
