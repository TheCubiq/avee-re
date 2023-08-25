package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class k90 extends qa {
    public final View[] B;

    public k90(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.header_playlists_item, viewGroup, false));
        this.B = r0;
        View view = this.a;
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group7)};
        qa.P(new TextView[]{(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt7)}, context);
    }

    public static /* synthetic */ void T(View view) {
        qa.A.a(null, null, new al(view));
    }

    public static /* synthetic */ void U(View view) {
        qa.z.a(new al(view));
    }

    public static /* synthetic */ void V(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.L0), view);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.B[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.i90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.T(view);
            }
        });
        this.B[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.h90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.U(view);
            }
        });
        this.B[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.j90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k90.V(view);
            }
        });
    }
}
