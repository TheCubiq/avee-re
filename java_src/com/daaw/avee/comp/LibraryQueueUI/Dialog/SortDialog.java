package com.daaw.avee.comp.LibraryQueueUI.Dialog;

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
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class SortDialog extends PopupWindow {
    private static final String arg1 = "arg1";
    public static WeakEventR3<Integer, IGeneralItemContainerIdentifier, String, SortDesign.SortOptions> onRequestSortOptions = new WeakEventR3<>();
    public static WeakEvent4<Integer, IGeneralItemContainerIdentifier, Integer, Integer> onSubmitSortOptions = new WeakEvent4<>();
    private List<CheckBox> chkBoxList;
    private List<RadioButton> radioBtnList;

    public static SortDialog createAndShowDialog(ContextData contextData, View view, String str) {
        return new SortDialog(contextData, view, str);
    }

    public SortDialog(ContextData contextData, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.radioBtnList = null;
        this.chkBoxList = null;
        onCreateDialog(view.getContext(), view, str);
    }

    public void onCreateDialog(Context context, View view, String str) {
        SortDesign.SortOptions invoke = onRequestSortOptions.invoke(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.dialog_sort, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        this.radioBtnList = new ArrayList(invoke == null ? 0 : invoke.radioOptions.size());
        this.chkBoxList = new ArrayList(invoke == null ? 0 : invoke.checkOptions.size());
        if (invoke != null) {
            Iterator<Tuple2<Integer, String>> it = invoke.radioOptions.iterator();
            while (it.hasNext()) {
                Tuple2<Integer, String> next = it.next();
                RadioButton radioButton = new RadioButton(context);
                radioButton.setTag(next.obj1);
                radioButton.setText(next.obj2);
                radioGroup.addView(radioButton, layoutParams);
                if (next.obj1.intValue() == invoke.selectedRadioOption) {
                    radioGroup.check(radioButton.getId());
                }
                this.radioBtnList.add(radioButton);
            }
            if (invoke.checkOptions.size() > 0) {
                space.setVisibility(0);
            } else {
                space.setVisibility(8);
            }
            Iterator<Tuple2<Integer, String>> it2 = invoke.checkOptions.iterator();
            while (it2.hasNext()) {
                Tuple2<Integer, String> next2 = it2.next();
                CheckBox checkBox = new CheckBox(context);
                checkBox.setTag(next2.obj1);
                checkBox.setText(next2.obj2);
                if ((next2.obj1.intValue() & invoke.maskCheckOptions) != 0) {
                    checkBox.setChecked(true);
                }
                linearLayout.addView(checkBox, layoutParams);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.SortDialog.1
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        SortDialog.this.notifyOptionChange(-1, r2);
                    }
                });
                this.chkBoxList.add(checkBox);
            }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.SortDialog.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                SortDialog.this.notifyOptionChange(-1, r2);
            }
        });
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        showAsDropDown(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOptionChange(int i, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        List<RadioButton> list = this.radioBtnList;
        if (list == null || this.chkBoxList == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (RadioButton radioButton : list) {
            if (radioButton.isChecked()) {
                i3 = ((Integer) radioButton.getTag()).intValue();
            }
        }
        for (CheckBox checkBox : this.chkBoxList) {
            if (checkBox.isChecked()) {
                i2 |= ((Integer) checkBox.getTag()).intValue();
            }
        }
        onSubmitSortOptions.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
