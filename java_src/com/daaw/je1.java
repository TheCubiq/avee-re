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
import android.widget.RelativeLayout;
import android.widget.Space;
import com.daaw.avee.R;
import com.daaw.ie1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class je1 extends PopupWindow {
    public static yw1<Integer, sd0, String, ie1.i> c = new yw1<>();
    public static tw1<Integer, sd0, Integer, Integer> d = new tw1<>();
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
            je1.this.c(-1, this.a);
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
            je1.this.c(-1, this.a);
        }
    }

    public je1(al alVar, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.a = null;
        this.b = null;
        d(view.getContext(), view, str);
    }

    public static je1 b(al alVar, View view, String str) {
        return new je1(alVar, view, str);
    }

    public final void c(int i, sd0 sd0Var) {
        List<RadioButton> list = this.a;
        if (list == null || this.b == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (RadioButton radioButton : list) {
            if (radioButton.isChecked()) {
                i3 = ((Integer) radioButton.getTag()).intValue();
            }
        }
        for (CheckBox checkBox : this.b) {
            if (checkBox.isChecked()) {
                i2 |= ((Integer) checkBox.getTag()).intValue();
            }
        }
        d.a(Integer.valueOf(i), sd0Var, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public void d(Context context, View view, String str) {
        ie1.i a2 = c.a(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.dialog_sort, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        this.a = new ArrayList(a2 == null ? 0 : a2.a.size());
        this.b = new ArrayList(a2 == null ? 0 : a2.b.size());
        if (a2 != null) {
            Iterator<lo1<Integer, Integer>> it = a2.a.iterator();
            while (it.hasNext()) {
                lo1<Integer, Integer> next = it.next();
                RadioButton radioButton = new RadioButton(context);
                radioButton.setTag(next.a);
                radioButton.setText(next.b.intValue());
                radioGroup.addView(radioButton, layoutParams);
                if (next.a.intValue() == a2.c) {
                    radioGroup.check(radioButton.getId());
                }
                this.a.add(radioButton);
            }
            space.setVisibility(a2.b.size() <= 0 ? 8 : 0);
            Iterator<lo1<Integer, Integer>> it2 = a2.b.iterator();
            while (it2.hasNext()) {
                lo1<Integer, Integer> next2 = it2.next();
                CheckBox checkBox = new CheckBox(context);
                checkBox.setTag(next2.a);
                checkBox.setText(next2.b.intValue());
                if ((next2.a.intValue() & a2.d) != 0) {
                    checkBox.setChecked(true);
                }
                linearLayout.addView(checkBox, layoutParams);
                checkBox.setOnCheckedChangeListener(new a(null));
                this.b.add(checkBox);
            }
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
