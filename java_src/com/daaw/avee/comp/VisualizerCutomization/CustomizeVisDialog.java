package com.daaw.avee.comp.VisualizerCutomization;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.daaw.avee.Common.Action;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.RateLimiter;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.CustomComposition;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.CustomScene;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class CustomizeVisDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    private static final String arg3 = "arg3";
    private static final String argSelectedIndex = "arg4";
    private static final String argSelectedPropertyKey = "arg6";
    private static final String argSelectedPropertyPath = "arg5";
    private int customizationIndex_unused;
    public CustomScene customizationScene;
    public int rootIdentifier;
    CustomizeVisView0 view0;
    CustomizeVisView1 view1;
    CustomizeVisViewProperty viewProperty;
    public static WeakEvent3<ContextData, Integer, CustomScene> onResetAction = new WeakEvent3<>();
    public static WeakEvent5<ContextData, Integer, Integer, CustomScene, String> onAddElementAction = new WeakEvent5<>();
    public static WeakEvent4<Integer, CustomScene, Integer, WeakEvent2<Integer, CustomScene>> onCustomizationChanged = new WeakEvent4<>();
    public static WeakEvent3<Integer, CustomScene, Integer> onFinishedCustomizing = new WeakEvent3<>();
    public static WeakEvent3<Integer, Integer, Boolean> onSelectedSceneElementChanged = new WeakEvent3<>();
    public static WeakEvent5<Fragment, TextView, List<String>, String, String> onImagePropertyPicking = new WeakEvent5<>();
    public static WeakEvent3<CustomizeVisDialog, Integer, Intent> onActivityResult = new WeakEvent3<>();
    public static WeakEvent onDialogShowed = new WeakEvent();
    public static WeakEvent onDialogDismissed = new WeakEvent();
    public static WeakEvent3<CustomizeVisDialog, String, String> onElementWikiInfoAction = new WeakEvent3<>();
    public static WeakEventR3<CustomizeVisDialog, String, String, Tuple2<String[], String>> onRequestElementAvailableVersions = new WeakEventR3<>();
    public static WeakEventR1<DialogFragment, Boolean> onBackPressed = new WeakEventR1<>();
    public static WeakEvent3<Context, Integer, CustomScene> onActionRemove = new WeakEvent3<>();
    public static WeakEvent3<Context, Integer, CustomScene> onActionDuplicate = new WeakEvent3<>();
    public static WeakEvent4<CustomizeVisDialog, CustomScene, CustomPropertiesList, String> onActionResetElement = new WeakEvent4<>();
    public static WeakEventR1<String, Boolean> onRequestIsElementTypePr = new WeakEventR1<>();
    private static WeakReference<CustomizeVisDialog> instanceWeak = new WeakReference<>(null);
    public int shortAnimTime = 0;
    public int spinnerTextColor = 268435455;
    public boolean wideView = false;
    private WeakEvent2<Integer, CustomScene> internalOnCustomStructureChanged = new WeakEvent2<>();
    private List<Object> listenerRefHolder = new LinkedList();
    private boolean eventsFromUser = false;
    RateLimiter onCustomizationChangedLimiter = new RateLimiter(80);
    private ArrayList<String> currentHierarchyPath = null;
    private String currentSelectedProperty = null;

    public CustomizeVisDialog() {
        setStyle(2, 0);
        this.view0 = new CustomizeVisView0(this);
        this.view1 = new CustomizeVisView1(this);
        this.viewProperty = new CustomizeVisViewProperty(this);
        instanceWeak = new WeakReference<>(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isView1Created() {
        return getActivity() != null;
    }

    public static CustomizeVisDialog createAndShowCustomizeVisDialog(ContextData contextData, Integer num, CustomScene customScene, String[] strArr) {
        CustomizeVisDialog customizeVisDialog = new CustomizeVisDialog();
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, num.intValue());
        bundle.putStringArray(arg2, strArr);
        bundle.putString(arg3, customScene.serialize());
        customizeVisDialog.setArguments(bundle);
        UtilsUI.showDialogSafe(customizeVisDialog, "CustomizeVisDialog", contextData);
        return customizeVisDialog;
    }

    public static boolean isShowing(FragmentManager fragmentManager) {
        fragmentManager.executePendingTransactions();
        return (instanceWeak.get() == null || fragmentManager.findFragmentByTag("CustomizeVisDialog") == null) ? false : true;
    }

    public static CustomizeVisDialog getInstance() {
        return instanceWeak.get();
    }

    public void removeTreeItem(int i) {
        this.view0.removeTreeItem(i);
    }

    public ThreeEntry getTreeItem(int i) {
        return this.view0.getThreeItem(i);
    }

    public void onImagePropertyValuePicked(TextView textView, List<String> list, String str, String str2) {
        this.view1.onImagePropertyValuePicked(textView, list, str, str2);
        CustomizeVisView0 customizeVisView0 = this.view0;
        customizeVisView0.parsePropertyDataByIndex(customizeVisView0.selectedElementInTree);
        Action1<Object> GetPropertyUpdateValueCb = this.view1.GetPropertyUpdateValueCb(list, str);
        if (GetPropertyUpdateValueCb != null) {
            GetPropertyUpdateValueCb.onInvoke(null);
        }
    }

    public void parsePropertyData(CustomPropertiesList customPropertiesList) {
        this.view1.parsePropertyData(customPropertiesList);
    }

    public void forceFinishCustomizing() {
        onFinishedChangingProperties();
    }

    String getCustomizationElementTagName(int i) {
        CustomComposition entry = this.customizationScene.getEntry(i);
        return entry == null ? "" : entry.getTagName();
    }

    public void onVisualizerCustomizationChanged(CustomScene customScene, boolean z, int i) {
        this.customizationScene = customScene;
        this.eventsFromUser = false;
        this.view0.parseCustomizationData(customScene);
        CustomizeVisView0 customizeVisView0 = this.view0;
        customizeVisView0.parsePropertyDataByIndex(customizeVisView0.selectedElementInTree);
        this.viewProperty.parseProperty(customScene.getData(this.currentHierarchyPath), this.currentSelectedProperty, new Func<Action1<Object>>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Func.Func
            public Action1<Object> onInvoke() {
                return CustomizeVisDialog.this.view1.GetPropertyUpdateValueCb(CustomizeVisDialog.this.currentHierarchyPath, CustomizeVisDialog.this.currentSelectedProperty);
            }
        });
        this.eventsFromUser = true;
        if (z) {
            this.view0.selectAndScrollToLast();
        } else if (i > -1) {
            this.view0.selectAndScrollToLast(i);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        this.internalOnCustomStructureChanged.subscribeWeak(new WeakEvent2.Handler<Integer, CustomScene>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.2
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, CustomScene customScene) {
            }
        }, this.listenerRefHolder);
        CustomItemActions.onActionDuplicate.subscribeWeak(new WeakEvent2.Handler<Context, Integer>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.3
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Context context, Integer num) {
                CustomizeVisDialog.onActionDuplicate.invoke(context, num, CustomizeVisDialog.this.customizationScene);
            }
        }, this.listenerRefHolder);
        CustomItemActions.onActionRemove.subscribeWeak(new WeakEvent2.Handler<Context, Integer>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.4
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Context context, Integer num) {
                CustomizeVisDialog.onActionRemove.invoke(context, num, CustomizeVisDialog.this.customizationScene);
            }
        }, this.listenerRefHolder);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        CustomizeVisDialog customizeVisDialog = instanceWeak.get();
        if (customizeVisDialog == null || !customizeVisDialog.equals(this)) {
            return;
        }
        onDialogShowed.invoke();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.internalOnCustomStructureChanged.unSubscribeWeak(this.listenerRefHolder);
        CustomItemActions.onActionDuplicate.unSubscribeWeak(this.listenerRefHolder);
        CustomItemActions.onActionRemove.unSubscribeWeak(this.listenerRefHolder);
        this.listenerRefHolder.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(getActivity(), getTheme()) { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.5
            @Override // android.app.Dialog
            public void onBackPressed() {
                if (CustomizeVisDialog.onBackPressed.invoke(CustomizeVisDialog.this, false).booleanValue()) {
                    return;
                }
                super.onBackPressed();
            }
        };
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(argSelectedIndex, this.view0.selectedElementInTree);
        bundle.putStringArrayList(argSelectedPropertyPath, this.currentHierarchyPath);
        bundle.putString(argSelectedPropertyKey, this.currentSelectedProperty);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.shortAnimTime = getResources().getInteger(17694720);
        this.spinnerTextColor = ContextCompat.getColor(getActivity(), R.color.white_alpha_2);
        this.wideView = getResources().getBoolean(R.bool.screenWidthAtLeastX00);
        Bundle arguments = getArguments();
        this.rootIdentifier = arguments.getInt(arg1);
        String[] stringArray = arguments.getStringArray(arg2);
        this.customizationScene = CustomScene.deserialize(arguments.getString(arg3));
        this.customizationIndex_unused = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.dialog_customize_vis, viewGroup, false);
        this.viewProperty.onCreatedView(layoutInflater, viewGroup2, bundle, getActivity());
        if (bundle != null) {
            this.view0.parsePropertyDataByIndex(bundle.getInt(argSelectedIndex, -1));
            this.currentHierarchyPath = bundle.getStringArrayList(argSelectedPropertyPath);
            this.currentSelectedProperty = bundle.getString(argSelectedPropertyKey);
            this.viewProperty.parseProperty(this.customizationScene.getData(this.currentHierarchyPath), this.currentSelectedProperty, new Func<Action1<Object>>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.daaw.avee.Common.Func.Func
                public Action1<Object> onInvoke() {
                    return CustomizeVisDialog.this.view1.GetPropertyUpdateValueCb(CustomizeVisDialog.this.currentHierarchyPath, CustomizeVisDialog.this.currentSelectedProperty);
                }
            });
        }
        this.view0.onCreatedView0(layoutInflater, viewGroup2, bundle, getActivity(), stringArray);
        this.eventsFromUser = false;
        CustomizeVisView0 customizeVisView0 = this.view0;
        customizeVisView0.setTreeData(customizeVisView0.selectedElementInTree);
        this.eventsFromUser = true;
        this.view1.onCreatedView1(layoutInflater, viewGroup2, bundle);
        this.eventsFromUser = false;
        CustomizeVisView0 customizeVisView02 = this.view0;
        customizeVisView02.parsePropertyDataByIndex(customizeVisView02.selectedElementInTree);
        this.eventsFromUser = true;
        this.eventsFromUser = false;
        this.view0.parseCustomizationData(this.customizationScene);
        this.eventsFromUser = true;
        return viewGroup2;
    }

    public boolean handledWhenGoToView(int i) {
        return (i == 1 && !this.wideView) != this.view0.isCollapsed();
    }

    public boolean goToView(int i) {
        boolean z = false;
        boolean z2 = i == 1 && !this.wideView;
        boolean z3 = z2 != this.view0.isCollapsed();
        this.view0.setCollapsed(z2);
        if (!z2 && !this.wideView) {
            z = true;
        }
        this.view1.setCollapsed(z);
        closePropertyView();
        return z3;
    }

    public void onSelectedElementChanged(int i, boolean z) {
        ThreeEntry treeItem = getTreeItem(i);
        onSelectedSceneElementChanged.invoke(Integer.valueOf(this.rootIdentifier), Integer.valueOf(treeItem != null ? treeItem.elementId : -1), Boolean.valueOf(z));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (this.customizationScene != null) {
            getArguments().putString(arg3, this.customizationScene.serialize());
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onFinishedChangingProperties();
        CustomizeVisDialog customizeVisDialog = instanceWeak.get();
        if (customizeVisDialog == null || !customizeVisDialog.equals(this)) {
            return;
        }
        onDialogDismissed.invoke();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            onActivityResult.invoke(this, Integer.valueOf(i), intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onCompositionChanged(boolean z) {
        if (this.eventsFromUser && this.customizationScene != null) {
            tlog.w("onCompositionChanged invoke");
            onCustomizationChanged.invoke(Integer.valueOf(this.rootIdentifier), this.customizationScene, Integer.valueOf(this.customizationIndex_unused), z ? this.internalOnCustomStructureChanged : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onChildPropertyChanged() {
        if (this.eventsFromUser && this.customizationScene != null) {
            onCustomizationChanged.invoke(Integer.valueOf(this.rootIdentifier), this.customizationScene, Integer.valueOf(this.customizationIndex_unused), this.internalOnCustomStructureChanged);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPropertyChanged() {
        if (this.eventsFromUser && this.customizationScene != null) {
            this.onCustomizationChangedLimiter.call(new Action() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.7
                @Override // com.daaw.avee.Common.Action
                public void onInvoke() {
                    CustomizeVisDialog.onCustomizationChanged.invoke(Integer.valueOf(CustomizeVisDialog.this.rootIdentifier), CustomizeVisDialog.this.customizationScene, Integer.valueOf(CustomizeVisDialog.this.customizationIndex_unused), null);
                }
            });
            CustomizeVisView0 customizeVisView0 = this.view0;
            customizeVisView0.updateSelectedItemThreeView(customizeVisView0.selectedElementInTree);
        }
    }

    public boolean closePropertyView() {
        boolean z = false;
        boolean z2 = this.wideView || this.view0.isCollapsed();
        if (this.viewProperty.isPropertyViewVisible() && z2) {
            z = true;
        }
        onPropertySelected(null, null, null, null);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPropertySelected(CustomPropertiesList customPropertiesList, String str, View view, Action1<Object> action1) {
        this.currentHierarchyPath = customPropertiesList != null ? customPropertiesList.getHierarchyPath() : null;
        this.currentSelectedProperty = str;
        this.viewProperty.parseProperty(customPropertiesList, str, new Func<Action1<Object>>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Func.Func
            public Action1<Object> onInvoke() {
                return CustomizeVisDialog.this.view1.GetPropertyUpdateValueCb(CustomizeVisDialog.this.currentHierarchyPath, CustomizeVisDialog.this.currentSelectedProperty);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFinishedChangingProperties() {
        onFinishedCustomizing.invoke(Integer.valueOf(this.rootIdentifier), this.customizationScene, Integer.valueOf(this.customizationIndex_unused));
    }

    public void view1AddPropertyUpdateValueCb(CustomPropertiesList customPropertiesList, String str, Action1<Object> action1) {
        this.view1.AddPropertyUpdateValueCb(customPropertiesList, str, action1);
    }

    public void InvokeOnElementWikiInfoAction(String str, String str2) {
        onElementWikiInfoAction.invoke(this, str, str2);
    }

    public void InvokeOnActionResetElement(CustomPropertiesList customPropertiesList, String str) {
        onActionResetElement.invoke(this, this.customizationScene, customPropertiesList, str);
    }

    public Tuple2<String[], String> InvokeOnRequestElementAvailableVersions(String str, String str2) {
        return onRequestElementAvailableVersions.invoke(this, str, str2, new Tuple2<>(new String[0], ""));
    }

    public void ApplySpinnerTheme(Spinner spinner) {
        TextView textView = (TextView) spinner.getSelectedView();
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.spinnerTextColor);
        }
    }

    public void ApplySpinnerTheme(AdapterView<?> adapterView) {
        TextView textView = (TextView) adapterView.getChildAt(0);
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.spinnerTextColor);
        }
    }

    public boolean isElementTypePr(String str) {
        return onRequestIsElementTypePr.invoke(str, true).booleanValue();
    }

    /* loaded from: classes.dex */
    public static class ThreeEntry {
        CustomComposition composition;
        CustomPropertiesList element;
        int elementId;
        String name;

        public String getSubName() {
            CustomPropertiesList customPropertiesList = this.element;
            return customPropertiesList == null ? "" : customPropertiesList.getTagName();
        }

        public ThreeEntry(String str, CustomComposition customComposition, int i, boolean z) {
            this.name = str;
            this.elementId = i;
            this.composition = customComposition;
        }

        public ThreeEntry(String str, CustomPropertiesList customPropertiesList, int i) {
            this.name = str;
            this.elementId = i;
            this.element = customPropertiesList;
        }

        public boolean isSection() {
            return this.composition != null;
        }

        public CustomComposition getComposition() {
            return this.composition;
        }

        public CustomPropertiesList getElement() {
            return this.element;
        }
    }
}
