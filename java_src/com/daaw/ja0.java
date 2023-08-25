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
public class ja0 extends AbstractC2700qa {

    /* renamed from: B */
    public final ImageView[] f14572B;

    /* renamed from: C */
    public final View[] f14573C;

    /* renamed from: D */
    public final int f14574D;

    /* renamed from: E */
    public final List<Object> f14575E;

    public ja0(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_songs_stations_item, viewGroup, false), false);
        ImageView[] imageViewArr = new ImageView[5];
        this.f14572B = imageViewArr;
        this.f14573C = r1;
        this.f14575E = new LinkedList();
        View view = this.f1947a;
        this.f14574D = gr1.m21321n(view, R.attr.containerFG);
        TextView[] textViewArr = {null, null, (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt7)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn6);
        AbstractC2700qa.m12690P(textViewArr, context);
        View[] viewArr = {null, null, view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
    }

    /* renamed from: T */
    public static /* synthetic */ void m18689T(View view) {
        AbstractC2700qa.f23793v.m10862a(new C0645al(view), view);
    }

    /* renamed from: U */
    public static /* synthetic */ void m18688U(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 115, view);
    }

    /* renamed from: V */
    public static /* synthetic */ void m18687V(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f14575E.clear();
        wc0.InterfaceC3421b mo3660w = wc0Var.mo3660w();
        if (mo3660w != null) {
            mo3660w.mo6182g(new qw1.InterfaceC2788a() { // from class: com.daaw.ia0
                @Override // com.daaw.qw1.InterfaceC2788a
                /* renamed from: b */
                public final void mo3122b(Object obj) {
                    ja0.this.m18686W(((Boolean) obj).booleanValue());
                }
            }, this.f14575E);
        }
        this.f14573C[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.m18689T(view);
            }
        });
        this.f14573C[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.fa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.m18688U(view);
            }
        });
        this.f14573C[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ja0.m18687V(view);
            }
        });
        m18686W(wc0Var.mo3672b());
    }

    /* renamed from: W */
    public void m18686W(boolean z) {
        if (!z) {
            this.f14572B[3].setColorFilter(this.f14574D);
            return;
        }
        ImageView[] imageViewArr = this.f14572B;
        imageViewArr[3].setColorFilter(gr1.m21321n(imageViewArr[3], R.attr.containerHighLight));
    }
}
