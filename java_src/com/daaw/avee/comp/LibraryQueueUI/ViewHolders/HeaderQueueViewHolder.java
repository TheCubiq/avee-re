package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class HeaderQueueViewHolder extends BaseHeaderViewHolder {
    private int btnColor0;
    private ImageView[] buttonIcons;
    private TextView[] buttonTexts;
    private List<Object> listenerRefHolder;

    public HeaderQueueViewHolder(Context context, ViewGroup viewGroup, IContainerData iContainerData) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_queue_item, viewGroup, false), iContainerData);
        this.buttonTexts = new TextView[7];
        this.buttonIcons = new ImageView[7];
        this.listenerRefHolder = new LinkedList();
        View view = this.itemView;
        this.btnColor0 = UtilsUI.getAttrColor(view, (int) R.attr.containerFG);
        this.buttonTexts[0] = (TextView) view.findViewById(R.id.txt1);
        this.buttonTexts[1] = (TextView) view.findViewById(R.id.txt2);
        this.buttonTexts[2] = (TextView) view.findViewById(R.id.txt3);
        this.buttonTexts[3] = (TextView) view.findViewById(R.id.txt4);
        this.buttonTexts[4] = (TextView) view.findViewById(R.id.txt5);
        this.buttonTexts[5] = (TextView) view.findViewById(R.id.txt6);
        this.buttonTexts[6] = (TextView) view.findViewById(R.id.txt6);
        this.buttonIcons[3] = (ImageView) view.findViewById(R.id.btn4);
        this.buttonIcons[4] = (ImageView) view.findViewById(R.id.btn5);
        this.buttonIcons[5] = (ImageView) view.findViewById(R.id.btn6);
        this.buttonIcons[6] = (ImageView) view.findViewById(R.id.btn7);
        updateShowButtonTexts(this.buttonTexts, context);
        View[] viewArr = {view.findViewById(R.id.group1), view.findViewById(R.id.group2), view.findViewById(R.id.group3), view.findViewById(R.id.group4), view.findViewById(R.id.group5), view.findViewById(R.id.group6), view.findViewById(R.id.group7)};
        viewArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 110, view2);
            }
        });
        viewArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 111, view2);
            }
        });
        viewArr[1].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), Integer.valueOf((int) LibraryQueueFragmentBase.ACTION_ClearQueue_Long), view2);
                return true;
            }
        });
        viewArr[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 112, view2);
            }
        });
        viewArr[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 113, view2);
            }
        });
        viewArr[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 114, view2);
            }
        });
        viewArr[5].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), 115, view2);
            }
        });
        viewArr[6].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view2), Integer.valueOf((int) LibraryQueueFragmentBase.ACTION_SwitchView), view2);
            }
        });
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
        this.listenerRefHolder.clear();
        iContainerData.getLibraryContainerDataListener().subscribeWeakShuffleModeChanged(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.9
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                HeaderQueueViewHolder.this.onShuffleModeChanged(num.intValue());
            }
        }, this.listenerRefHolder);
        iContainerData.getLibraryContainerDataListener().subscribeWeakFollowCurrentValueChanged(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.10
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                HeaderQueueViewHolder.this.onFollowCurrentChanged(bool.booleanValue());
            }
        }, this.listenerRefHolder);
        iContainerData.getLibraryContainerDataListener().subscribeWeakShowAlbumArtValueChanged(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderQueueViewHolder.11
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                HeaderQueueViewHolder.this.onShowAlbumArtInsteadChanged(bool.booleanValue());
            }
        }, this.listenerRefHolder);
        boolean booleanValue = onUIRequestFollowCurrentValue.invoke(false).booleanValue();
        boolean showAlbumArtValue = iContainerData.getShowAlbumArtValue();
        onFollowCurrentChanged(booleanValue);
        onShowAlbumArtInsteadChanged(showAlbumArtValue);
        IContainerData.ILibraryContainerDataListener libraryContainerDataListener = iContainerData.getLibraryContainerDataListener();
        if (libraryContainerDataListener != null) {
            onShuffleModeChanged(libraryContainerDataListener.onRequestShuffleMode());
        }
    }

    public void onShuffleModeChanged(int i) {
        if (i != 0) {
            ImageView[] imageViewArr = this.buttonIcons;
            imageViewArr[3].setColorFilter(UtilsUI.getAttrColor(imageViewArr[3], (int) R.attr.containerHighLight));
            return;
        }
        this.buttonIcons[3].setColorFilter(this.btnColor0);
    }

    public void onFollowCurrentChanged(boolean z) {
        if (z) {
            ImageView[] imageViewArr = this.buttonIcons;
            imageViewArr[4].setColorFilter(UtilsUI.getAttrColor(imageViewArr[4], (int) R.attr.containerHighLight));
            return;
        }
        this.buttonIcons[4].setColorFilter(this.btnColor0);
    }

    public void onShowAlbumArtInsteadChanged(boolean z) {
        if (z) {
            ImageView[] imageViewArr = this.buttonIcons;
            imageViewArr[5].setColorFilter(UtilsUI.getAttrColor(imageViewArr[5], (int) R.attr.containerHighLight));
            return;
        }
        this.buttonIcons[5].setColorFilter(this.btnColor0);
    }
}
