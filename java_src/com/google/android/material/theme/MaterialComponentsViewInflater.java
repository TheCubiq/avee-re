package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.fn0;
import com.daaw.in0;
import com.daaw.ln0;
import com.daaw.o4;
import com.daaw.q3;
import com.daaw.s3;
import com.daaw.w4;
import com.daaw.z4;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends z4 {
    @Override // com.daaw.z4
    public q3 c(Context context, AttributeSet attributeSet) {
        return new fn0(context, attributeSet);
    }

    @Override // com.daaw.z4
    public s3 d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.daaw.z4
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new in0(context, attributeSet);
    }

    @Override // com.daaw.z4
    public o4 k(Context context, AttributeSet attributeSet) {
        return new ln0(context, attributeSet);
    }

    @Override // com.daaw.z4
    public w4 o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
