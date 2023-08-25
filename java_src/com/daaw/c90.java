package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class c90 extends AbstractC2700qa {

    /* renamed from: B */
    public final View[] f5639B;

    public c90(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_folder_item, viewGroup, false));
        this.f5639B = r0;
        View view = this.f1947a;
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group7)};
        AbstractC2700qa.m12690P(new TextView[]{(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt7)}, context);
    }

    /* renamed from: S */
    public static /* synthetic */ void m25490S(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31789G0), view);
    }

    /* renamed from: T */
    public static /* synthetic */ void m25489T(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f5639B[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.b90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c90.m25490S(view);
            }
        });
        this.f5639B[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.a90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c90.m25489T(view);
            }
        });
    }
}
