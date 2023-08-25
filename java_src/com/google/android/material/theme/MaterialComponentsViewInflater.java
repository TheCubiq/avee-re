package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.C2405o4;
import com.daaw.C2682q3;
import com.daaw.C2908s3;
import com.daaw.C3397w4;
import com.daaw.C3809z4;
import com.daaw.fn0;
import com.daaw.in0;
import com.daaw.ln0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C3809z4 {
    @Override // com.daaw.C3809z4
    /* renamed from: c */
    public C2682q3 mo178c(Context context, AttributeSet attributeSet) {
        return new fn0(context, attributeSet);
    }

    @Override // com.daaw.C3809z4
    /* renamed from: d */
    public C2908s3 mo177d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.daaw.C3809z4
    /* renamed from: e */
    public AppCompatCheckBox mo176e(Context context, AttributeSet attributeSet) {
        return new in0(context, attributeSet);
    }

    @Override // com.daaw.C3809z4
    /* renamed from: k */
    public C2405o4 mo175k(Context context, AttributeSet attributeSet) {
        return new ln0(context, attributeSet);
    }

    @Override // com.daaw.C3809z4
    /* renamed from: o */
    public C3397w4 mo174o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
