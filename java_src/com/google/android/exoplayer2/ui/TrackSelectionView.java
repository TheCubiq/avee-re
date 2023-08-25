package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.daaw.as;
import com.daaw.e21;
import com.daaw.rm1;
import com.daaw.s6;
import com.daaw.vm1;
import com.daaw.z11;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public boolean A;
    public DefaultTrackSelector.SelectionOverride B;
    public final int p;
    public final LayoutInflater q;
    public final CheckedTextView r;
    public final CheckedTextView s;
    public final a t;
    public boolean u;
    public rm1 v;
    public CheckedTextView[][] w;
    public DefaultTrackSelector x;
    public int y;
    public TrackGroupArray z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        public /* synthetic */ a(TrackSelectionView trackSelectionView, vm1 vm1Var) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.p = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.q = from;
        a aVar = new a(this, null);
        this.t = aVar;
        this.v = new as(getResources());
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.r = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(e21.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(z11.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.s = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(e21.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public static int[] b(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    public static int[] c(int[] iArr, int i) {
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

    public final void d(View view) {
        if (view == this.r) {
            f();
        } else if (view == this.s) {
            e();
        } else {
            g(view);
        }
        h();
    }

    public final void e() {
        this.A = false;
        this.B = null;
    }

    public final void f() {
        this.A = true;
        this.B = null;
    }

    public final void g(View view) {
        DefaultTrackSelector.SelectionOverride selectionOverride;
        this.A = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride2 = this.B;
        if (selectionOverride2 == null || selectionOverride2.p != intValue || !this.u) {
            this.B = new DefaultTrackSelector.SelectionOverride(intValue, intValue2);
            return;
        }
        int i = selectionOverride2.r;
        int[] iArr = selectionOverride2.q;
        if (!((CheckedTextView) view).isChecked()) {
            selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, b(iArr, intValue2));
        } else if (i == 1) {
            this.B = null;
            this.A = true;
            return;
        } else {
            selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, c(iArr, intValue2));
        }
        this.B = selectionOverride;
    }

    public final void h() {
        this.r.setChecked(this.A);
        this.s.setChecked(!this.A && this.B == null);
        int i = 0;
        while (i < this.w.length) {
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.w;
                if (i2 < checkedTextViewArr[i].length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i][i2];
                    DefaultTrackSelector.SelectionOverride selectionOverride = this.B;
                    checkedTextView.setChecked(selectionOverride != null && selectionOverride.p == i && selectionOverride.a(i2));
                    i2++;
                }
            }
            i++;
        }
    }

    public final void i() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        DefaultTrackSelector defaultTrackSelector = this.x;
        b.a e = defaultTrackSelector == null ? null : defaultTrackSelector.e();
        if (this.x == null || e == null) {
            this.r.setEnabled(false);
            this.s.setEnabled(false);
            return;
        }
        this.r.setEnabled(true);
        this.s.setEnabled(true);
        this.z = e.e(this.y);
        DefaultTrackSelector.Parameters t = this.x.t();
        this.A = t.g(this.y);
        this.B = t.h(this.y, this.z);
        this.w = new CheckedTextView[this.z.p];
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.z;
            if (i >= trackGroupArray.p) {
                h();
                return;
            }
            TrackGroup a2 = trackGroupArray.a(i);
            boolean z = this.u && this.z.a(i).p > 1 && e.a(this.y, i, false) != 0;
            this.w[i] = new CheckedTextView[a2.p];
            for (int i2 = 0; i2 < a2.p; i2++) {
                if (i2 == 0) {
                    addView(this.q.inflate(z11.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.q.inflate(z ? 17367056 : 17367055, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.p);
                checkedTextView.setText(this.v.a(a2.a(i2)));
                if (e.f(this.y, i, i2) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                    checkedTextView.setOnClickListener(this.t);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.w[i][i2] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.u != z) {
            this.u = z;
            i();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(rm1 rm1Var) {
        this.v = (rm1) s6.e(rm1Var);
        i();
    }
}
