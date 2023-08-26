package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.ViewGroup;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* loaded from: classes.dex */
public class HeaderPlainViewHolder extends BaseAdsViewHolder {
    public HeaderPlainViewHolder(Context context, ViewGroup viewGroup) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_plain_item, viewGroup, false), 0, false);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
    }
}
