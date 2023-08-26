package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.SearchView;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* loaded from: classes.dex */
public class HeaderArtistsViewHolder extends BaseHeaderViewHolder implements SearchView.OnQueryTextListener {
    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public HeaderArtistsViewHolder(Context context, ViewGroup viewGroup, IContainerData iContainerData) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_artists_item, viewGroup, false), iContainerData);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
    }
}
