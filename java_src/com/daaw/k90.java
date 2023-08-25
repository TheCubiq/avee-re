package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class k90 extends AbstractC2700qa {

    /* renamed from: B */
    public final View[] f15795B;

    public k90(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_playlists_item, viewGroup, false));
        this.f15795B = r0;
        View view = this.f1947a;
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group7)};
        AbstractC2700qa.m12690P(new TextView[]{(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt7)}, context);
    }

    /* renamed from: T */
    public static /* synthetic */ void m17955T(View view) {
        AbstractC2700qa.f23791A.m9795a(null, null, new C0645al(view));
    }

    /* renamed from: U */
    public static /* synthetic */ void m17954U(View view) {
        AbstractC2700qa.f23797z.m12018a(new C0645al(view));
    }

    /* renamed from: V */
    public static /* synthetic */ void m17953V(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f15795B[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.i90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.m17955T(view);
            }
        });
        this.f15795B[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.h90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.m17954U(view);
            }
        });
        this.f15795B[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.j90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.m17953V(view);
            }
        });
    }
}
