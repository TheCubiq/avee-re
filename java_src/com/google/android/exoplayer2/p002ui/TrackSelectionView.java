package com.google.android.exoplayer2.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.daaw.C0668as;
import com.daaw.C2914s6;
import com.daaw.e21;
import com.daaw.rm1;
import com.daaw.vm1;
import com.daaw.z11;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AbstractC3968b;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Arrays;
/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: A */
    public boolean f35968A;

    /* renamed from: B */
    public DefaultTrackSelector.SelectionOverride f35969B;

    /* renamed from: p */
    public final int f35970p;

    /* renamed from: q */
    public final LayoutInflater f35971q;

    /* renamed from: r */
    public final CheckedTextView f35972r;

    /* renamed from: s */
    public final CheckedTextView f35973s;

    /* renamed from: t */
    public final View$OnClickListenerC3976a f35974t;

    /* renamed from: u */
    public boolean f35975u;

    /* renamed from: v */
    public rm1 f35976v;

    /* renamed from: w */
    public CheckedTextView[][] f35977w;

    /* renamed from: x */
    public DefaultTrackSelector f35978x;

    /* renamed from: y */
    public int f35979y;

    /* renamed from: z */
    public TrackGroupArray f35980z;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3976a implements View.OnClickListener {
        public View$OnClickListenerC3976a() {
        }

        public /* synthetic */ View$OnClickListenerC3976a(TrackSelectionView trackSelectionView, vm1 vm1Var) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m1487d(view);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f35970p = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f35971q = from;
        View$OnClickListenerC3976a view$OnClickListenerC3976a = new View$OnClickListenerC3976a(this, null);
        this.f35974t = view$OnClickListenerC3976a;
        this.f35976v = new C0668as(getResources());
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f35972r = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(e21.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(view$OnClickListenerC3976a);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(z11.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f35973s = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(e21.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(view$OnClickListenerC3976a);
        addView(checkedTextView2);
    }

    /* renamed from: b */
    public static int[] m1489b(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: c */
    public static int[] m1488c(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final void m1487d(View view) {
        if (view == this.f35972r) {
            m1485f();
        } else if (view == this.f35973s) {
            m1486e();
        } else {
            m1484g(view);
        }
        m1483h();
    }

    /* renamed from: e */
    public final void m1486e() {
        this.f35968A = false;
        this.f35969B = null;
    }

    /* renamed from: f */
    public final void m1485f() {
        this.f35968A = true;
        this.f35969B = null;
    }

    /* renamed from: g */
    public final void m1484g(View view) {
        DefaultTrackSelector.SelectionOverride selectionOverride;
        this.f35968A = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride2 = this.f35969B;
        if (selectionOverride2 == null || selectionOverride2.f35873p != intValue || !this.f35975u) {
            this.f35969B = new DefaultTrackSelector.SelectionOverride(intValue, intValue2);
            return;
        }
        int i = selectionOverride2.f35875r;
        int[] iArr = selectionOverride2.f35874q;
        if (!((CheckedTextView) view).isChecked()) {
            selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, m1489b(iArr, intValue2));
        } else if (i == 1) {
            this.f35969B = null;
            this.f35968A = true;
            return;
        } else {
            selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, m1488c(iArr, intValue2));
        }
        this.f35969B = selectionOverride;
    }

    /* renamed from: h */
    public final void m1483h() {
        this.f35972r.setChecked(this.f35968A);
        this.f35973s.setChecked(!this.f35968A && this.f35969B == null);
        int i = 0;
        while (i < this.f35977w.length) {
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f35977w;
                if (i2 < checkedTextViewArr[i].length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i][i2];
                    DefaultTrackSelector.SelectionOverride selectionOverride = this.f35969B;
                    checkedTextView.setChecked(selectionOverride != null && selectionOverride.f35873p == i && selectionOverride.m1555a(i2));
                    i2++;
                }
            }
            i++;
        }
    }

    /* renamed from: i */
    public final void m1482i() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        DefaultTrackSelector defaultTrackSelector = this.f35978x;
        AbstractC3968b.C3969a m1545e = defaultTrackSelector == null ? null : defaultTrackSelector.m1545e();
        if (this.f35978x == null || m1545e == null) {
            this.f35972r.setEnabled(false);
            this.f35973s.setEnabled(false);
            return;
        }
        this.f35972r.setEnabled(true);
        this.f35973s.setEnabled(true);
        this.f35980z = m1545e.m1537e(this.f35979y);
        DefaultTrackSelector.Parameters m1572t = this.f35978x.m1572t();
        this.f35968A = m1572t.m1562g(this.f35979y);
        this.f35969B = m1572t.m1561h(this.f35979y, this.f35980z);
        this.f35977w = new CheckedTextView[this.f35980z.f35848p];
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f35980z;
            if (i >= trackGroupArray.f35848p) {
                m1483h();
                return;
            }
            TrackGroup m1594a = trackGroupArray.m1594a(i);
            boolean z = this.f35975u && this.f35980z.m1594a(i).f35844p > 1 && m1545e.m1541a(this.f35979y, i, false) != 0;
            this.f35977w[i] = new CheckedTextView[m1594a.f35844p];
            for (int i2 = 0; i2 < m1594a.f35844p; i2++) {
                if (i2 == 0) {
                    addView(this.f35971q.inflate(z11.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f35971q.inflate(z ? 17367056 : 17367055, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f35970p);
                checkedTextView.setText(this.f35976v.mo11182a(m1594a.m1598a(i2)));
                if (m1545e.m1536f(this.f35979y, i, i2) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                    checkedTextView.setOnClickListener(this.f35974t);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f35977w[i][i2] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f35975u != z) {
            this.f35975u = z;
            m1482i();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f35972r.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(rm1 rm1Var) {
        this.f35976v = (rm1) C2914s6.m10686e(rm1Var);
        m1482i();
    }
}
