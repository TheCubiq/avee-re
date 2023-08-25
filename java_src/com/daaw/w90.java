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
public class w90 extends qa {
    public final ImageView[] B;
    public final int C;
    public final List<Object> D;

    public w90(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.header_queue_item, viewGroup, false));
        ImageView[] imageViewArr = new ImageView[7];
        this.B = imageViewArr;
        this.D = new LinkedList();
        View view = this.a;
        this.C = gr1.n(view, R.attr.containerFG);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt3), (TextView) view.findViewById(R.id.txt4), (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt6)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn4);
        imageViewArr[4] = (ImageView) view.findViewById(R.id.btn5);
        imageViewArr[5] = (ImageView) view.findViewById(R.id.btn6);
        imageViewArr[6] = (ImageView) view.findViewById(R.id.btn7);
        qa.P(textViewArr, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group3), view.findViewById(R.id.group4), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
        viewArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.r90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.Y(view2);
            }
        });
        viewArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.p90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.Z(view2);
            }
        });
        viewArr[1].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.t90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean a0;
                a0 = w90.a0(view2);
                return a0;
            }
        });
        viewArr[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.o90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.b0(view2);
            }
        });
        viewArr[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.q90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.c0(view2);
            }
        });
        viewArr[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.s90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.d0(view2);
            }
        });
        viewArr[5].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.n90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.e0(view2);
            }
        });
        viewArr[6].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.l90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.f0(view2);
            }
        });
    }

    public static /* synthetic */ void Y(View view) {
        qa.y.a(new al(view), 110, view);
    }

    public static /* synthetic */ void Z(View view) {
        qa.y.a(new al(view), 111, view);
    }

    public static /* synthetic */ boolean a0(View view) {
        qa.y.a(new al(view), 1110, view);
        return true;
    }

    public static /* synthetic */ void b0(View view) {
        qa.y.a(new al(view), 112, view);
    }

    public static /* synthetic */ void c0(View view) {
        qa.y.a(new al(view), 113, view);
    }

    public static /* synthetic */ void d0(View view) {
        qa.y.a(new al(view), 114, view);
    }

    public static /* synthetic */ void e0(View view) {
        qa.y.a(new al(view), 115, view);
    }

    public static /* synthetic */ void f0(View view) {
        qa.y.a(new al(view), Integer.valueOf((int) x21.L0), view);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.D.clear();
        wc0Var.w().b(new qw1.a() { // from class: com.daaw.m90
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                w90.this.i0(((Integer) obj).intValue());
            }
        }, this.D);
        wc0Var.w().e(new qw1.a() { // from class: com.daaw.u90
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                w90.this.g0(((Boolean) obj).booleanValue());
            }
        }, this.D);
        wc0Var.w().g(new qw1.a() { // from class: com.daaw.v90
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                w90.this.h0(((Boolean) obj).booleanValue());
            }
        }, this.D);
        boolean booleanValue = qa.u.a(Boolean.FALSE).booleanValue();
        boolean b = wc0Var.b();
        g0(booleanValue);
        h0(b);
        wc0.b w = wc0Var.w();
        if (w != null) {
            i0(w.c());
        }
    }

    public void g0(boolean z) {
        if (!z) {
            this.B[4].setColorFilter(this.C);
            return;
        }
        ImageView[] imageViewArr = this.B;
        imageViewArr[4].setColorFilter(gr1.n(imageViewArr[4], R.attr.containerHighLight));
    }

    public void h0(boolean z) {
        if (!z) {
            this.B[5].setColorFilter(this.C);
            return;
        }
        ImageView[] imageViewArr = this.B;
        imageViewArr[5].setColorFilter(gr1.n(imageViewArr[5], R.attr.containerHighLight));
    }

    public void i0(int i) {
        if (i == 0) {
            this.B[3].setColorFilter(this.C);
            return;
        }
        ImageView[] imageViewArr = this.B;
        imageViewArr[3].setColorFilter(gr1.n(imageViewArr[3], R.attr.containerHighLight));
    }
}
