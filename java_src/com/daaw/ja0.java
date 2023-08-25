package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.qw1;
import com.daaw.wc0;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ja0 extends qa {
    public final ImageView[] B;
    public final View[] C;
    public final int D;
    public final List<Object> E;

    public ja0(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.header_songs_stations_item, viewGroup, false), false);
        ImageView[] imageViewArr = new ImageView[5];
        this.B = imageViewArr;
        this.C = r1;
        this.E = new LinkedList();
        View view = this.a;
        this.D = gr1.n(view, R.attr.containerFG);
        TextView[] textViewArr = {null, null, (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt7)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn6);
        qa.P(textViewArr, context);
        View[] viewArr = {null, null, view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
    }

    public static /* synthetic */ void T(View view) {
        qa.v.a(new al(view), view);
    }

    public static /* synthetic */ void U(View view) {
        qa.y.a(new al(view), 115, view);
    }

    public static /* synthetic */ void V(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.L0), view);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.E.clear();
        wc0.b w = wc0Var.w();
        if (w != null) {
            w.g(new qw1.a() { // from class: com.daaw.ia0
                @Override // com.daaw.qw1.a
                public final void b(Object obj) {
                    ja0.this.W(((Boolean) obj).booleanValue());
                }
            }, this.E);
        }
        this.C[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.T(view);
            }
        });
        this.C[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.fa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.U(view);
            }
        });
        this.C[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.V(view);
            }
        });
        W(wc0Var.b());
    }

    public void W(boolean z) {
        if (!z) {
            this.B[3].setColorFilter(this.D);
            return;
        }
        ImageView[] imageViewArr = this.B;
        imageViewArr[3].setColorFilter(gr1.n(imageViewArr[3], R.attr.containerHighLight));
    }
}
