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
public class w90 extends AbstractC2700qa {

    /* renamed from: B */
    public final ImageView[] f31056B;

    /* renamed from: C */
    public final int f31057C;

    /* renamed from: D */
    public final List<Object> f31058D;

    public w90(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_queue_item, viewGroup, false));
        ImageView[] imageViewArr = new ImageView[7];
        this.f31056B = imageViewArr;
        this.f31058D = new LinkedList();
        View view = this.f1947a;
        this.f31057C = gr1.m21321n(view, R.attr.containerFG);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt3), (TextView) view.findViewById(R.id.txt4), (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt6)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn4);
        imageViewArr[4] = (ImageView) view.findViewById(R.id.btn5);
        imageViewArr[5] = (ImageView) view.findViewById(R.id.btn6);
        imageViewArr[6] = (ImageView) view.findViewById(R.id.btn7);
        AbstractC2700qa.m12690P(textViewArr, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group3), view.findViewById(R.id.group4), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
        viewArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.r90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6321Y(view2);
            }
        });
        viewArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.p90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6320Z(view2);
            }
        });
        viewArr[1].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.t90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean m6319a0;
                m6319a0 = w90.m6319a0(view2);
                return m6319a0;
            }
        });
        viewArr[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.o90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6318b0(view2);
            }
        });
        viewArr[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.q90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6317c0(view2);
            }
        });
        viewArr[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.s90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6316d0(view2);
            }
        });
        viewArr[5].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.n90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6315e0(view2);
            }
        });
        viewArr[6].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.l90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w90.m6314f0(view2);
            }
        });
    }

    /* renamed from: Y */
    public static /* synthetic */ void m6321Y(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 110, view);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m6320Z(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 111, view);
    }

    /* renamed from: a0 */
    public static /* synthetic */ boolean m6319a0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 1110, view);
        return true;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m6318b0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 112, view);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m6317c0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 113, view);
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m6316d0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 114, view);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m6315e0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 115, view);
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m6314f0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f31058D.clear();
        wc0Var.mo3660w().mo6187b(new qw1.InterfaceC2788a() { // from class: com.daaw.m90
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                w90.this.m6311i0(((Integer) obj).intValue());
            }
        }, this.f31058D);
        wc0Var.mo3660w().mo6184e(new qw1.InterfaceC2788a() { // from class: com.daaw.u90
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                w90.this.m6313g0(((Boolean) obj).booleanValue());
            }
        }, this.f31058D);
        wc0Var.mo3660w().mo6182g(new qw1.InterfaceC2788a() { // from class: com.daaw.v90
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                w90.this.m6312h0(((Boolean) obj).booleanValue());
            }
        }, this.f31058D);
        boolean booleanValue = AbstractC2700qa.f23792u.m6692a(Boolean.FALSE).booleanValue();
        boolean mo3672b = wc0Var.mo3672b();
        m6313g0(booleanValue);
        m6312h0(mo3672b);
        wc0.InterfaceC3421b mo3660w = wc0Var.mo3660w();
        if (mo3660w != null) {
            m6311i0(mo3660w.mo6186c());
        }
    }

    /* renamed from: g0 */
    public void m6313g0(boolean z) {
        if (!z) {
            this.f31056B[4].setColorFilter(this.f31057C);
            return;
        }
        ImageView[] imageViewArr = this.f31056B;
        imageViewArr[4].setColorFilter(gr1.m21321n(imageViewArr[4], R.attr.containerHighLight));
    }

    /* renamed from: h0 */
    public void m6312h0(boolean z) {
        if (!z) {
            this.f31056B[5].setColorFilter(this.f31057C);
            return;
        }
        ImageView[] imageViewArr = this.f31056B;
        imageViewArr[5].setColorFilter(gr1.m21321n(imageViewArr[5], R.attr.containerHighLight));
    }

    /* renamed from: i0 */
    public void m6311i0(int i) {
        if (i == 0) {
            this.f31056B[3].setColorFilter(this.f31057C);
            return;
        }
        ImageView[] imageViewArr = this.f31056B;
        imageViewArr[3].setColorFilter(gr1.m21321n(imageViewArr[3], R.attr.containerHighLight));
    }
}
