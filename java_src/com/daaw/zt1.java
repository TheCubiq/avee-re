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
    public static yw1<Integer, sd0, String, c> c = new yw1<>();
    public static sw1<Integer, sd0, c> d = new sw1<>();
    public List<RadioButton> a;
    public List<CheckBox> b;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ sd0 a;

        public a(sd0 sd0Var) {
            this.a = sd0Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zt1.this.c(-1, this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements RadioGroup.OnCheckedChangeListener {
        public final /* synthetic */ sd0 a;

        public b(sd0 sd0Var) {
            this.a = sd0Var;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            zt1.this.c(-1, this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int a;
        public boolean b;
    }

    public zt1(al alVar, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.a = null;
        this.b = null;
        d(view.getContext(), view, str);
    }

    public static zt1 b(al alVar, View view, String str) {
        return new zt1(alVar, view, str);
    }

    public final void c(int i, sd0 sd0Var) {
        if (this.a == null || this.b == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                i2 = 0;
                break;
            } else if (this.a.get(i2).isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        c cVar = new c();
        cVar.a = i2;
        cVar.b = this.b.get(0).isChecked();
        d.a(Integer.valueOf(i), sd0Var, cVar);
    }

    public void d(Context context, View view, String str) {
        c a2 = c.a(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.popup_dialog_view, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.a.add((RadioButton) inflate.findViewById(R.id.radioViewSmall));
        this.a.add((RadioButton) inflate.findViewById(R.id.radioViewMedium));
        this.a.add((RadioButton) inflate.findViewById(R.id.radioViewLarge));
        this.b.add((CheckBox) inflate.findViewById(R.id.chkShowArt));
        int i = a2.a;
        if (i >= 0 && i < this.a.size()) {
            radioGroup.check(this.a.get(a2.a).getId());
        }
        this.b.get(0).setChecked(a2.b);
        for (CheckBox checkBox : this.b) {
            checkBox.setOnCheckedChangeListener(new a(null));
        }
        radioGroup.setOnCheckedChangeListener(new b(null));
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        showAsDropDown(view);
    }
}
