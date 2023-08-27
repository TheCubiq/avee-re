package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class FooterQueueViewHolder extends BaseAdsViewHolder implements IContainerData.IContainerStatusListener {
    private String additionalInfo;
    private TextView textInfo;
    private TextView textInfoItems;

    private void onDataItemCountChanged() {
    }

    public FooterQueueViewHolder(Context context, ViewGroup viewGroup) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.footer_queue_item, viewGroup, false), 1, true);
        this.additionalInfo = null;
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
        if (z) {
            this.textInfo.setText(R.string.searching);
            this.textInfoItems.setText(i >= 0 ? this.textInfoItems.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i)) : "");
        } else if (i == 0) {
            this.textInfo.setText(R.string.nothing_to_show);
            this.textInfoItems.setText("");
        } else {
            this.textInfo.setText("");
            this.textInfoItems.setText(this.textInfoItems.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i)));
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
    public void onUpdateStatusInfo(String str) {
        this.additionalInfo = str;
    }
}
