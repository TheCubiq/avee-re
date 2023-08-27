package com.daaw.avee.comp.VisualizerCutomization;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
/* loaded from: classes.dex */
public class CustomizeVisViewProperty {
    private CustomizeVisDialog customizeVisDialog;
    private ViewGroup linearLayoutRootContent;
    private ViewGroup propertyViewRoot;

    public CustomizeVisViewProperty(CustomizeVisDialog customizeVisDialog) {
        this.customizeVisDialog = customizeVisDialog;
    }

    public void onCreatedView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity) {
        this.propertyViewRoot = (ViewGroup) viewGroup.findViewById(R.id.propertyViewRoot);
        this.linearLayoutRootContent = (ViewGroup) viewGroup.findViewById(R.id.layoutPropertyContent);
        ((ImageButton) viewGroup.findViewById(R.id.btnClose)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisViewProperty.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeVisViewProperty.this.customizeVisDialog.closePropertyView();
            }
        });
    }

    boolean isViewCreated() {
        return this.linearLayoutRootContent != null;
    }

    public void parseProperty(CustomPropertiesList customPropertiesList, String str, Func<Action1<Object>> func) {
        if (this.customizeVisDialog.isView1Created() && isViewCreated()) {
            LayoutInflater from = LayoutInflater.from(this.customizeVisDialog.getActivity());
            if (customPropertiesList == null || str == null) {
                this.linearLayoutRootContent.removeAllViews();
                closePropertyView();
                return;
            }
            this.linearLayoutRootContent.removeAllViews();
            this.propertyViewRoot.setAlpha(0.0f);
            openPropertyView();
            customPropertiesList.getPropertyHint(str);
            CustomizeVisView1.createPropertyView(this.customizeVisDialog, from, customPropertiesList, this.linearLayoutRootContent, str, true, func);
        }
    }

    public void openPropertyView() {
        this.propertyViewRoot.setVisibility(0);
        this.propertyViewRoot.animate().alpha(1.0f).setDuration(this.customizeVisDialog.shortAnimTime);
    }

    public void closePropertyView() {
        this.propertyViewRoot.animate().alpha(0.0f).setDuration(this.customizeVisDialog.shortAnimTime).withEndAction(new Runnable() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisViewProperty.2
            @Override // java.lang.Runnable
            public void run() {
                CustomizeVisViewProperty.this.propertyViewRoot.setVisibility(8);
            }
        });
    }

    public boolean isPropertyViewVisible() {
        return this.propertyViewRoot.getVisibility() == 0;
    }
}
