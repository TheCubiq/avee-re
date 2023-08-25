package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Space;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zt1 extends PopupWindow {

    /* renamed from: c */
    public static yw1<Integer, sd0, String, C3898c> f35479c = new yw1<>();

    /* renamed from: d */
    public static sw1<Integer, sd0, C3898c> f35480d = new sw1<>();

    /* renamed from: a */
    public List<RadioButton> f35481a;

    /* renamed from: b */
    public List<CheckBox> f35482b;

    /* renamed from: com.daaw.zt1$a */
    /* loaded from: classes.dex */
    public class C3896a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ sd0 f35483a;

        public C3896a(sd0 sd0Var) {
            this.f35483a = sd0Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zt1.this.m1917c(-1, this.f35483a);
        }
    }

    /* renamed from: com.daaw.zt1$b */
    /* loaded from: classes.dex */
    public class C3897b implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ sd0 f35485a;

        public C3897b(sd0 sd0Var) {
            this.f35485a = sd0Var;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            zt1.this.m1917c(-1, this.f35485a);
        }
    }

    /* renamed from: com.daaw.zt1$c */
    /* loaded from: classes.dex */
    public static class C3898c {

        /* renamed from: a */
        public int f35487a;

        /* renamed from: b */
        public boolean f35488b;
    }

    public zt1(C0645al c0645al, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.f35481a = null;
        this.f35482b = null;
        m1916d(view.getContext(), view, str);
    }

    /* renamed from: b */
    public static zt1 m1918b(C0645al c0645al, View view, String str) {
        return new zt1(c0645al, view, str);
    }

    /* renamed from: c */
    public final void m1917c(int i, sd0 sd0Var) {
        if (this.f35481a == null || this.f35482b == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f35481a.size()) {
                i2 = 0;
                break;
            } else if (this.f35481a.get(i2).isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        C3898c c3898c = new C3898c();
        c3898c.f35487a = i2;
        c3898c.f35488b = this.f35482b.get(0).isChecked();
        f35480d.m9795a(Integer.valueOf(i), sd0Var, c3898c);
    }

    /* renamed from: d */
    public void m1916d(Context context, View view, String str) {
        C3898c m3155a = f35479c.m3155a(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.popup_dialog_view, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        this.f35481a = new ArrayList();
        this.f35482b = new ArrayList();
        this.f35481a.add((RadioButton) inflate.findViewById(R.id.radioViewSmall));
        this.f35481a.add((RadioButton) inflate.findViewById(R.id.radioViewMedium));
        this.f35481a.add((RadioButton) inflate.findViewById(R.id.radioViewLarge));
        this.f35482b.add((CheckBox) inflate.findViewById(R.id.chkShowArt));
        int i = m3155a.f35487a;
        if (i >= 0 && i < this.f35481a.size()) {
            radioGroup.check(this.f35481a.get(m3155a.f35487a).getId());
        }
        this.f35482b.get(0).setChecked(m3155a.f35488b);
        for (CheckBox checkBox : this.f35482b) {
            checkBox.setOnCheckedChangeListener(new C3896a(null));
        }
        radioGroup.setOnCheckedChangeListener(new C3897b(null));
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        showAsDropDown(view);
    }
}
