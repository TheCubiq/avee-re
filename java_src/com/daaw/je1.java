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

    /* renamed from: c */
    public static yw1<Integer, sd0, String, ie1.C1696i> f15041c = new yw1<>();

    /* renamed from: d */
    public static tw1<Integer, sd0, Integer, Integer> f15042d = new tw1<>();

    /* renamed from: a */
    public List<RadioButton> f15043a;

    /* renamed from: b */
    public List<CheckBox> f15044b;

    /* renamed from: com.daaw.je1$a */
    /* loaded from: classes.dex */
    public class C1824a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ sd0 f15045a;

        public C1824a(sd0 sd0Var) {
            this.f15045a = sd0Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            je1.this.m18546c(-1, this.f15045a);
        }
    }

    /* renamed from: com.daaw.je1$b */
    /* loaded from: classes.dex */
    public class C1825b implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ sd0 f15047a;

        public C1825b(sd0 sd0Var) {
            this.f15047a = sd0Var;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            je1.this.m18546c(-1, this.f15047a);
        }
    }

    public je1(C0645al c0645al, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.f15043a = null;
        this.f15044b = null;
        m18545d(view.getContext(), view, str);
    }

    /* renamed from: b */
    public static je1 m18547b(C0645al c0645al, View view, String str) {
        return new je1(c0645al, view, str);
    }

    /* renamed from: c */
    public final void m18546c(int i, sd0 sd0Var) {
        List<RadioButton> list = this.f15043a;
        if (list == null || this.f15044b == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (RadioButton radioButton : list) {
            if (radioButton.isChecked()) {
                i3 = ((Integer) radioButton.getTag()).intValue();
            }
        }
        for (CheckBox checkBox : this.f15044b) {
            if (checkBox.isChecked()) {
                i2 |= ((Integer) checkBox.getTag()).intValue();
            }
        }
        f15042d.m8756a(Integer.valueOf(i), sd0Var, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* renamed from: d */
    public void m18545d(Context context, View view, String str) {
        ie1.C1696i m3155a = f15041c.m3155a(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.dialog_sort, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        this.f15043a = new ArrayList(m3155a == null ? 0 : m3155a.f13562a.size());
        this.f15044b = new ArrayList(m3155a == null ? 0 : m3155a.f13563b.size());
        if (m3155a != null) {
            Iterator<lo1<Integer, Integer>> it = m3155a.f13562a.iterator();
            while (it.hasNext()) {
                lo1<Integer, Integer> next = it.next();
                RadioButton radioButton = new RadioButton(context);
                radioButton.setTag(next.f17576a);
                radioButton.setText(next.f17577b.intValue());
                radioGroup.addView(radioButton, layoutParams);
                if (next.f17576a.intValue() == m3155a.f13564c) {
                    radioGroup.check(radioButton.getId());
                }
                this.f15043a.add(radioButton);
            }
            space.setVisibility(m3155a.f13563b.size() <= 0 ? 8 : 0);
            Iterator<lo1<Integer, Integer>> it2 = m3155a.f13563b.iterator();
            while (it2.hasNext()) {
                lo1<Integer, Integer> next2 = it2.next();
                CheckBox checkBox = new CheckBox(context);
                checkBox.setTag(next2.f17576a);
                checkBox.setText(next2.f17577b.intValue());
                if ((next2.f17576a.intValue() & m3155a.f13565d) != 0) {
                    checkBox.setChecked(true);
                }
                linearLayout.addView(checkBox, layoutParams);
                checkBox.setOnCheckedChangeListener(new C1824a(null));
                this.f15044b.add(checkBox);
            }
        }
        radioGroup.setOnCheckedChangeListener(new C1825b(null));
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        showAsDropDown(view);
    }
}
