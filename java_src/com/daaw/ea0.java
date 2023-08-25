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
public class ea0 extends AbstractC2700qa {

    /* renamed from: B */
    public final ImageView[] f8278B;

    /* renamed from: C */
    public final View[] f8279C;

    /* renamed from: D */
    public final int f8280D;

    /* renamed from: E */
    public final List<Object> f8281E;

    public ea0(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.header_songs_item, viewGroup, false), false);
        ImageView[] imageViewArr = new ImageView[5];
        this.f8278B = imageViewArr;
        this.f8279C = r1;
        this.f8281E = new LinkedList();
        View view = this.f1947a;
        this.f8280D = gr1.m21321n(view, R.attr.containerFG);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.txt1), (TextView) view.findViewById(R.id.txt2), (TextView) view.findViewById(R.id.txt5), (TextView) view.findViewById(R.id.txt6), (TextView) view.findViewById(R.id.txt7)};
        imageViewArr[3] = (ImageView) view.findViewById(R.id.btn6);
        AbstractC2700qa.m12690P(textViewArr, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m23640W(Boolean bool) {
        m23634c0(bool.booleanValue());
    }

    /* renamed from: X */
    public static /* synthetic */ void m23639X(wc0 wc0Var, View view) {
        wc0Var.mo2241g(new C0645al(view), 0);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m23638Y(wc0 wc0Var, View view) {
        wc0Var.mo2241g(new C0645al(view), 1);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m23637Z(View view) {
        AbstractC2700qa.f23794w.m10862a(new C0645al(view), view);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m23636a0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), 115, view);
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m23635b0(View view) {
        AbstractC2700qa.f23796y.m9795a(new C0645al(view), Integer.valueOf((int) x21.f31814L0), view);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(final wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f8281E.clear();
        wc0.InterfaceC3421b mo3660w = wc0Var.mo3660w();
        if (mo3660w != null) {
            mo3660w.mo6182g(new qw1.InterfaceC2788a() { // from class: com.daaw.da0
                @Override // com.daaw.qw1.InterfaceC2788a
                /* renamed from: b */
                public final void mo3122b(Object obj) {
                    ea0.this.m23640W((Boolean) obj);
                }
            }, this.f8281E);
        }
        this.f8279C[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.z90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.m23639X(wc0.this, view);
            }
        });
        this.f8279C[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.y90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.m23638Y(wc0.this, view);
            }
        });
        this.f8279C[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.m23637Z(view);
            }
        });
        this.f8279C[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.aa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.m23636a0(view);
            }
        });
        this.f8279C[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ba0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea0.m23635b0(view);
            }
        });
        m23634c0(wc0Var.mo3672b());
    }

    /* renamed from: c0 */
    public void m23634c0(boolean z) {
        if (!z) {
            this.f8278B[3].setColorFilter(this.f8280D);
            return;
        }
        ImageView[] imageViewArr = this.f8278B;
        imageViewArr[3].setColorFilter(gr1.m21321n(imageViewArr[3], R.attr.containerHighLight));
    }
}
