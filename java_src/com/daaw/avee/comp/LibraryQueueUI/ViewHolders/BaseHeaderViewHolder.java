package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.ContextData;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import java.util.List;
/* loaded from: classes.dex */
public abstract class BaseHeaderViewHolder extends BaseAdsViewHolder {
    public static WeakEventR<Boolean> onUIRequestFollowCurrentValue = new WeakEventR<>();
    public static WeakEvent2<ContextData, View> onActionChooseSortStations = new WeakEvent2<>();
    public static WeakEvent2<ContextData, View> onActionChooseSortFiles = new WeakEvent2<>();
    public static WeakEvent2<ContextData, View> onActionChooseSort = new WeakEvent2<>();
    public static WeakEvent3<ContextData, Integer, View> onAction = new WeakEvent3<>();
    public static WeakEvent1<ContextData> onLibraryQueue2UI_ActionScanStandalonePlaylist = new WeakEvent1<>();
    public static WeakEvent3<long[], List<String>, ContextData> onActionCreatePlaylist = new WeakEvent3<>();

    public BaseHeaderViewHolder(View view, IContainerData iContainerData, boolean z) {
        super(view, 0, z);
    }

    public BaseHeaderViewHolder(View view, IContainerData iContainerData) {
        super(view, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void updateShowButtonTexts(TextView[] textViewArr, Context context) {
        if (AppPreferences.preferencesGetBoolSafe(AppPreferences.createOrGetInstance().getPreferences(context), "pref_toolButtonsShowTexts", true)) {
            for (TextView textView : textViewArr) {
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            return;
        }
        for (TextView textView2 : textViewArr) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
    }
}
