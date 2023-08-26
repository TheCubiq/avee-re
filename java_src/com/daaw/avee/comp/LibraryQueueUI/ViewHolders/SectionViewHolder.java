package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SectionViewHolder extends BaseViewHolder implements IContainerData.IContainerStatusListener {
    private ImageButton btnCollapse;
    private TextView textTitle;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
    public void onItemCountChanged(int i, int i2, boolean z, boolean z2) {
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
    public void onUpdateStatusInfo(String str) {
    }

    public SectionViewHolder(Context context, ViewGroup viewGroup) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.section_item, viewGroup, false));
        View view = this.itemView;
        this.btnCollapse = (ImageButton) view.findViewById(R.id.btnCollapse);
        this.textTitle = (TextView) view.findViewById(R.id.txtTitle);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(final IContainerData iContainerData, int i) {
        iContainerData.getDisplayName().Run(new VAsyncTask.ResultListener<String>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.SectionViewHolder.1
            @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
            public void onResult(String str, boolean z) {
                if (z) {
                    return;
                }
                SectionViewHolder.this.textTitle.setText(str);
            }
        });
        updateButtonState(iContainerData.getSectionOpened());
        this.btnCollapse.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.SectionViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IContainerData iContainerData2 = iContainerData;
                iContainerData2.setSectionOpenedState(!iContainerData2.getSectionOpened());
                SectionViewHolder.this.updateButtonState(iContainerData.getSectionOpened());
            }
        });
    }

    void updateButtonState(boolean z) {
        if (z) {
            this.btnCollapse.setImageResource(R.drawable.ic_minus);
        } else {
            this.btnCollapse.setImageResource(R.drawable.ic_expand2);
        }
    }
}
