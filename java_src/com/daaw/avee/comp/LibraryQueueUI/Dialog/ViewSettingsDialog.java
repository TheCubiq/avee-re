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
import android.widget.Space;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ViewSettingsDialog extends PopupWindow {
    private static final String arg1 = "arg1";
    public static WeakEventR3<Integer, IGeneralItemContainerIdentifier, String, ViewOptions> onRequestOptionsState = new WeakEventR3<>();
    public static WeakEvent3<Integer, IGeneralItemContainerIdentifier, ViewOptions> onSubmitOptions = new WeakEvent3<>();
    private List<CheckBox> chkBoxList;
    private List<RadioButton> radioBtnList;

    /* loaded from: classes.dex */
    public static class ViewOptions {
        public boolean showAlbumArt;
        public int viewMode;
    }

    public static ViewSettingsDialog createAndShowDialog(ContextData contextData, View view, String str) {
        return new ViewSettingsDialog(contextData, view, str);
    }

    public ViewSettingsDialog(ContextData contextData, View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.radioBtnList = null;
        this.chkBoxList = null;
        onCreateDialog(view.getContext(), view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreateDialog(Context context, View view, String str) {
        ViewOptions invoke = onRequestOptionsState.invoke(-1, null, str, null);
        View inflate = View.inflate(view.getContext(), R.layout.popup_dialog_view, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutCheckOptions);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupOptions);
        Space space = (Space) inflate.findViewById(R.id.space);
        this.radioBtnList = new ArrayList();
        this.chkBoxList = new ArrayList();
        this.radioBtnList.add(inflate.findViewById(R.id.radioViewSmall));
        this.radioBtnList.add(inflate.findViewById(R.id.radioViewMedium));
        this.radioBtnList.add(inflate.findViewById(R.id.radioViewLarge));
        this.chkBoxList.add(inflate.findViewById(R.id.chkShowArt));
        if (invoke.viewMode >= 0 && invoke.viewMode < this.radioBtnList.size()) {
            radioGroup.check(this.radioBtnList.get(invoke.viewMode).getId());
        }
        this.chkBoxList.get(0).setChecked(invoke.showAlbumArt);
        for (CheckBox checkBox : this.chkBoxList) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.ViewSettingsDialog.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ViewSettingsDialog.this.notifyOptionChange(-1, r2);
                }
            });
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.ViewSettingsDialog.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                ViewSettingsDialog.this.notifyOptionChange(-1, r2);
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
        if (this.radioBtnList == null || this.chkBoxList == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.radioBtnList.size()) {
                i2 = 0;
                break;
            } else if (this.radioBtnList.get(i2).isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.viewMode = i2;
        viewOptions.showAlbumArt = this.chkBoxList.get(0).isChecked();
        onSubmitOptions.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, viewOptions);
    }
}
