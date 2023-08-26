package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class Footer1ViewHolder extends BaseAdsViewHolder implements IContainerData.IContainerStatusListener {
    private int itemCountVisible;
    private boolean loadingActive;
    private String overrideInfo;
    private boolean searchingActive;
    private TextView textInfo;
    private TextView textInfoItems;
    private int totalTime;

    private void onDataItemCountChanged() {
    }

    public Footer1ViewHolder(Context context, ViewGroup viewGroup, int i) {
        super(UtilsUI.getInflaterFromContext(context).inflate(i == 2 ? R.layout.footer_library_item : R.layout.footer_item, viewGroup, false), 1, true);
        this.overrideInfo = null;
        this.itemCountVisible = 0;
        this.totalTime = 0;
        this.searchingActive = false;
        this.loadingActive = false;
        View view = this.itemView;
        this.textInfo = (TextView) view.findViewById(R.id.textInfo);
        this.textInfoItems = (TextView) view.findViewById(R.id.textInfoItems);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
        this.textInfo.setText("");
        this.textInfoItems.setText("");
        iContainerData.setContainerStatusListener(new WeakReference<>(this));
        onDataItemCountChanged();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
    public void onItemCountChanged(int i, int i2, boolean z, boolean z2) {
        this.itemCountVisible = i;
        this.totalTime = i2;
        this.searchingActive = z;
        this.loadingActive = z2;
        updateTextInfo();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
    public void onUpdateStatusInfo(String str) {
        this.overrideInfo = str;
        updateTextInfo();
    }

    private void updateTextInfo() {
        String str = this.overrideInfo;
        String str2 = "";
        if (str != null) {
            this.textInfo.setText(str);
            this.textInfoItems.setText("");
        } else if (this.loadingActive) {
            this.textInfo.setText(R.string.loading);
            this.textInfoItems.setText("");
        } else if (this.searchingActive) {
            this.textInfo.setText(R.string.searching);
            if (this.itemCountVisible >= 0) {
                Resources resources = this.textInfoItems.getResources();
                int i = this.itemCountVisible;
                str2 = resources.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i));
            }
            this.textInfoItems.setText(str2);
        } else if (this.itemCountVisible == 0) {
            this.textInfo.setText(R.string.nothing_to_show);
            this.textInfoItems.setText("");
        } else {
            this.textInfo.setText("");
            Resources resources2 = this.textInfoItems.getResources();
            int i2 = this.itemCountVisible;
            this.textInfoItems.setText(resources2.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i2, Integer.valueOf(i2)));
        }
    }
}
