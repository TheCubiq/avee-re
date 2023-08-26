package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.ViewCompat;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* loaded from: classes.dex */
public class ContentItemViewHolder extends BaseViewHolder {
    private ImageButton btnItemMore;
    private Drawable btnItemMoreDefaultDrawable;
    public Object dataId;
    public ImageView imgArt;
    private Action1<ContentItemViewHolder> isSelected;
    private ActionListenerBase[] itemListenerActions;
    public int itemPosition;
    public ItemSelection.One<Object> itemSelection;
    private boolean overrideHideTxtItemLine2;
    public TextView txtItemDuration;
    public TextView txtItemLine1;
    private TextView txtItemLine2;
    public TextView txtNum;
    public View viewItemBg;
    public boolean viewItemBgSelected;
    public static WeakEvent3<ActionListenerBase[], Boolean, ItemSelection.One<Object>> onItemSelected = new WeakEvent3<>();
    public static WeakEventR<Boolean> onRequestIsSelectingEnabled = new WeakEventR<>();
    public static WeakEvent1<Object> onItemInteracted = new WeakEvent1<>();

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
    }

    public ContentItemViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
        this.itemSelection = null;
        this.dataId = null;
        this.itemListenerActions = null;
        this.overrideHideTxtItemLine2 = false;
        this.isSelected = null;
        View view = this.itemView;
        this.viewItemBg = view.findViewById(R.id.viewItemBg);
        this.imgArt = (ImageView) view.findViewById(R.id.imgArt);
        this.txtNum = (TextView) view.findViewById(R.id.txtNum);
        this.txtItemLine1 = (TextView) view.findViewById(R.id.txtItemLine1);
        this.txtItemLine2 = (TextView) view.findViewById(R.id.txtItemLine2);
        this.txtItemDuration = (TextView) view.findViewById(R.id.txtItemDuration);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.btnItemMore = imageButton;
        this.btnItemMoreDefaultDrawable = imageButton.getBackground();
        this.itemView.setLongClickable(true);
    }

    public void setImgResource(int i) {
        IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
        if (albumArtFactory != null) {
            albumArtFactory.cancelRequest(this.imgArt);
        }
        this.imgArt.setImageResource(i);
    }

    public void setImgColorFilter(int i) {
        if (i == -1) {
            this.imgArt.setColorFilter(i & ViewCompat.MEASURED_SIZE_MASK);
            this.imgArt.setImageAlpha(255);
            return;
        }
        this.imgArt.setColorFilter((16777215 & i) + ViewCompat.MEASURED_STATE_MASK);
        this.imgArt.setImageAlpha(Color.alpha(i));
    }

    private void setBtnItemMoreColorFilter(int i) {
        this.btnItemMore.setColorFilter((16777215 & i) + ViewCompat.MEASURED_STATE_MASK);
        this.btnItemMore.setImageAlpha(Color.alpha(i));
    }

    public void setImageDrawable(Drawable drawable) {
        IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
        if (albumArtFactory != null) {
            albumArtFactory.cancelRequest(this.imgArt);
        }
        this.imgArt.setImageDrawable(drawable);
    }

    public void setTxtItemLine2Text(String str) {
        this.txtItemLine2.setText(str);
    }

    public void setTxtItemLine2Visibility(int i) {
        if (!this.overrideHideTxtItemLine2) {
            this.txtItemLine2.setVisibility(i);
        } else {
            this.txtItemLine2.setVisibility(8);
        }
    }

    public void setBtnItemMoreImage(int i) {
        this.btnItemMore.setImageResource(i);
    }

    public void setToDefault(IContainerData iContainerData, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        setToDefault(iContainerData, null, iGeneralItemContainerIdentifier);
    }

    public void setToDefault(final IContainerData iContainerData, Object obj, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        Tuple2<Integer, Boolean> containerItemHeight = iContainerData.getContainerItemHeight();
        this.overrideHideTxtItemLine2 = !containerItemHeight.obj2.booleanValue();
        ViewGroup.LayoutParams layoutParams = this.viewItemBg.getLayoutParams();
        layoutParams.height = containerItemHeight.obj1.intValue();
        this.viewItemBg.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.imgArt.getLayoutParams();
        layoutParams2.width = containerItemHeight.obj1.intValue();
        this.imgArt.setLayoutParams(layoutParams2);
        this.dataId = null;
        if (obj != null) {
            this.itemSelection = new ItemSelection.One<>(iGeneralItemContainerIdentifier, obj);
        } else {
            this.itemSelection = null;
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iContainerData.onListViewClick(ContentItemViewHolder.this.itemPosition, view.getContext());
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return false;
            }
        });
        this.btnItemMore.setVisibility(8);
        this.btnItemMore.setImageResource(R.drawable.ic_overflowv_2_s);
        setBtnItemMoreColorFilter(UtilsUI.getAttrColor(this.btnItemMore, (int) R.attr.containerBackgroundDark));
        this.viewItemBg.setActivated(false);
        setItemActions2(null, -1, iContainerData);
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
    }

    public void setItemActions2(ActionListenerBase[] actionListenerBaseArr, int i, IContainerData iContainerData) {
        setItemActions2(actionListenerBaseArr, i, iContainerData, false, false, null);
    }

    public void refreshSelection() {
        Action1<ContentItemViewHolder> action1 = this.isSelected;
        if (action1 != null) {
            action1.onInvoke(this);
        }
        if (onRequestIsSelectingEnabled.invoke(false).booleanValue()) {
            return;
        }
        setStayPressed(false);
    }

    public void setItemActions2(ActionListenerBase[] actionListenerBaseArr, int i, final IContainerData iContainerData, final boolean z, boolean z2, Action1<ContentItemViewHolder> action1) {
        ActionListenerBase[] actionListenerBaseArr2;
        this.isSelected = action1;
        this.itemListenerActions = actionListenerBaseArr;
        if (actionListenerBaseArr == null) {
            i = -1;
        }
        if (z) {
            this.btnItemMore.setBackgroundResource(R.drawable.reorder_button_bg);
            this.btnItemMore.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.4
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    if (iContainerData.getOnDraggingListener() == null) {
                        return false;
                    }
                    iContainerData.getOnDraggingListener().onStartDragging(ContentItemViewHolder.this.itemView);
                    return true;
                }
            });
        } else {
            this.btnItemMore.setBackground(this.btnItemMoreDefaultDrawable);
            this.btnItemMore.setOnLongClickListener(null);
        }
        ActionListenerBase[] actionListenerBaseArr3 = this.itemListenerActions;
        if (actionListenerBaseArr3 != null && actionListenerBaseArr3.length > 0) {
            this.btnItemMore.setVisibility(0);
            this.btnItemMore.setImageResource(R.drawable.ic_overflowv_2_s);
            this.btnItemMore.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (z && ContentItemViewHolder.onRequestIsSelectingEnabled.invoke(false).booleanValue() && motionEvent.getAction() == 0 && iContainerData.getOnDraggingListener() != null) {
                        iContainerData.getOnDraggingListener().onStartDragging(ContentItemViewHolder.this.itemView);
                        return true;
                    }
                    return false;
                }
            });
            this.btnItemMore.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.6
                @Override // android.view.View.OnClickListener
                public void onClick(final View view) {
                    if (z && ContentItemViewHolder.onRequestIsSelectingEnabled.invoke(false).booleanValue()) {
                        return;
                    }
                    ContentItemViewHolder.onItemInteracted.invoke(ContentItemViewHolder.this.itemSelection.getItemIdentifier());
                    PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.6.1
                        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            ContentItemViewHolder.this.itemListenerActions[menuItem.getItemId()].execute(new ContextData(view), ContentItemViewHolder.this.itemSelection.getItemIdentifier());
                            return true;
                        }
                    });
                    for (int i2 = 0; i2 < ContentItemViewHolder.this.itemListenerActions.length; i2++) {
                        if (ContentItemViewHolder.this.itemListenerActions[i2].getItemActionBase().getShouldShow() && ContentItemViewHolder.this.itemListenerActions[i2].getItemActionBase().isAllowSingle()) {
                            popupMenu.getMenu().add(0, i2, ContentItemViewHolder.this.itemListenerActions[i2].getItemActionBase().getActionId(), ContentItemViewHolder.this.itemListenerActions[i2].getItemActionBase().getNameStrResId());
                        }
                    }
                    popupMenu.show();
                }
            });
        } else {
            this.btnItemMore.setVisibility(8);
            this.btnItemMore.setOnTouchListener(null);
            this.btnItemMore.setOnClickListener(null);
        }
        if (i >= 0) {
            ActionListenerBase[] actionListenerBaseArr4 = this.itemListenerActions;
            if (actionListenerBaseArr4.length > 0) {
                final ActionListenerBase actionListenerBase = actionListenerBaseArr4[i];
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ContentItemViewHolder.onItemInteracted.invoke(ContentItemViewHolder.this.itemSelection.getItemIdentifier());
                        if (!ContentItemViewHolder.onRequestIsSelectingEnabled.invoke(false).booleanValue()) {
                            if (actionListenerBase.getItemActionBase().isStayPressedHint()) {
                                ContentItemViewHolder.this.setStayPressed(true);
                            }
                            actionListenerBase.execute(new ContextData(view), ContentItemViewHolder.this.itemSelection.getItemIdentifier());
                        } else if (ContentItemViewHolder.this.itemSelection != null) {
                            ContentItemViewHolder.onItemSelected.invoke(ContentItemViewHolder.this.itemListenerActions, Boolean.valueOf(true ^ ContentItemViewHolder.this.viewItemBg.isSelected()), ContentItemViewHolder.this.itemSelection);
                        }
                    }
                });
                actionListenerBaseArr2 = this.itemListenerActions;
                if (actionListenerBaseArr2 != null || actionListenerBaseArr2.length <= 0 || this.itemSelection == null) {
                    return;
                }
                this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.9
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        ContentItemViewHolder.onItemSelected.invoke(ContentItemViewHolder.this.itemListenerActions, Boolean.valueOf(!ContentItemViewHolder.this.viewItemBg.isSelected()), ContentItemViewHolder.this.itemSelection);
                        return true;
                    }
                });
                return;
            }
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ContentItemViewHolder.onRequestIsSelectingEnabled.invoke(false).booleanValue()) {
                    iContainerData.onListViewClick(ContentItemViewHolder.this.itemPosition, view.getContext());
                } else if (ContentItemViewHolder.this.itemSelection != null) {
                    ContentItemViewHolder.onItemSelected.invoke(ContentItemViewHolder.this.itemListenerActions, Boolean.valueOf(!ContentItemViewHolder.this.viewItemBg.isSelected()), ContentItemViewHolder.this.itemSelection);
                }
            }
        });
        actionListenerBaseArr2 = this.itemListenerActions;
        if (actionListenerBaseArr2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStayPressed(boolean z) {
        this.itemView.setSelected(z);
    }
}
