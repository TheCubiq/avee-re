package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.view.View;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* loaded from: classes.dex */
public abstract class BaseAdsViewHolder extends BaseViewHolder {
    BaseAdsCore adsCore;

    public BaseAdsViewHolder(View view, int i, boolean z) {
        super(view);
        this.adsCore = new BaseAdsCore(i, z ? view.findViewById(R.id.adView) : null);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        this.adsCore.onBind(iContainerData.getItemCount(), i);
    }
}
