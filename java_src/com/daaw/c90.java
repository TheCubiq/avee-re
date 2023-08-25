package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class c90 extends qa {
    public final View[] B;

    public c90(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.header_folder_item, viewGroup, false));
        this.B = r0;
        View view = this.a;
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group7)};
        qa.P(new TextView[]{(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt7)}, context);
    }

    public static /* synthetic */ void S(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.G0), view);
    }

    public static /* synthetic */ void T(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.L0), view);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.B[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.b90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c90.S(view);
            }
        });
        this.B[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.a90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c90.T(view);
            }
        });
    }
}
