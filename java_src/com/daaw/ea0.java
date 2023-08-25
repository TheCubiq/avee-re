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
public class ea0 extends qa {
    public final ImageView[] B;
    public final View[] C;
    public final int D;
    public final List<Object> E;

    public ea0(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.header_songs_item, viewGroup, false), false);
        ImageView[] imageViewArr = new ImageView[5];
        this.B = imageViewArr;
        this.C = r1;
        this.E = new LinkedList();
        View view = this.a;
        this.D = gr1.n(view, R.attr.containerFG);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt7)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn6);
        qa.P(textViewArr, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Boolean bool) {
        c0(bool.booleanValue());
    }

    public static /* synthetic */ void X(wc0 wc0Var, View view) {
        wc0Var.g(new al(view), 0);
    }

    public static /* synthetic */ void Y(wc0 wc0Var, View view) {
        wc0Var.g(new al(view), 1);
    }

    public static /* synthetic */ void Z(View view) {
        qa.w.a(new al(view), view);
    }

    public static /* synthetic */ void a0(View view) {
        qa.y.a(new al(view), 115, view);
    }

    public static /* synthetic */ void b0(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.L0), view);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(final wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.E.clear();
        wc0.b w = wc0Var.w();
        if (w != null) {
            w.g(new qw1.a() { // from class: com.daaw.da0
                @Override // com.daaw.qw1.a
                public final void b(Object obj) {
                    ea0.this.W((Boolean) obj);
                }
            }, this.E);
        }
        this.C[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.z90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.X(wc0.this, view);
            }
        });
        this.C[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.y90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.Y(wc0.this, view);
            }
        });
        this.C[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.Z(view);
            }
        });
        this.C[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.aa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.a0(view);
            }
        });
        this.C[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ba0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.b0(view);
            }
        });
        c0(wc0Var.b());
    }

    public void c0(boolean z) {
        if (!z) {
            this.B[3].setColorFilter(this.D);
            return;
        }
        ImageView[] imageViewArr = this.B;
        imageViewArr[3].setColorFilter(gr1.n(imageViewArr[3], R.attr.containerHighLight));
    }
}
