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
public class qa0 extends AbstractC2700qa {

    /* renamed from: B */
    public final ImageView[] f23798B;

    /* renamed from: C */
    public final View[] f23799C;

    /* renamed from: D */
    public final int f23800D;

    /* renamed from: E */
    public final List<Object> f23801E;

    public qa0(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_songs_item, viewGroup, false));
        ImageView[] imageViewArr = new ImageView[5];
        this.f23798B = imageViewArr;
        this.f23799C = r1;
        this.f23801E = new LinkedList();
        View view = this.f1947a;
        this.f23800D = gr1.m21321n(view, R.attr.containerFG);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt7)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn6);
        AbstractC2700qa.m12690P(textViewArr, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
    }

    /* renamed from: V */
    public static /* synthetic */ void m12684V(wc0 wc0Var, View view) {
        wc0Var.mo2241g(new C0645al(view), 0);
    }

    /* renamed from: W */
    public static /* synthetic */ void m12683W(wc0 wc0Var, View view) {
        wc0Var.mo2241g(new C0645al(view), 1);
    }

    /* renamed from: X */
    public static /* synthetic */ void m12682X(View view) {
        AbstractC2700qa.f23795x.m10862a(new C0645al(view), view);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m12681Y(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 115, view);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m12680Z(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(final wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f23801E.clear();
        wc0.InterfaceC3421b mo3660w = wc0Var.mo3660w();
        if (mo3660w != null) {
            mo3660w.mo6182g(new qw1.InterfaceC2788a() { // from class: com.daaw.pa0
                @Override // com.daaw.qw1.InterfaceC2788a
                /* renamed from: b */
                public final void mo3122b(Object obj) {
                    qa0.this.m12679a0(((Boolean) obj).booleanValue());
                }
            }, this.f23801E);
        }
        this.f23799C[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ka0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qa0.m12684V(wc0.this, view);
            }
        });
        this.f23799C[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.la0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qa0.m12683W(wc0.this, view);
            }
        });
        this.f23799C[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qa0.m12682X(view);
            }
        });
        this.f23799C[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.na0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qa0.m12681Y(view);
            }
        });
        this.f23799C[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.oa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qa0.m12680Z(view);
            }
        });
        m12679a0(wc0Var.mo3672b());
    }

    /* renamed from: a0 */
    public void m12679a0(boolean z) {
        if (!z) {
            this.f23798B[3].setColorFilter(this.f23800D);
            return;
        }
        ImageView[] imageViewArr = this.f23798B;
        imageViewArr[3].setColorFilter(gr1.m21321n(imageViewArr[3], R.attr.containerHighLight));
    }
}
