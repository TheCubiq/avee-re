package com.daaw.avee.comp.VisualizerCutomization;

import android.content.Context;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.VisualizerCutomization.CustomItemActions;
import com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter;
import java.util.List;
/* loaded from: classes.dex */
public class CustomSimpleViewHolder extends RecyclerView.ViewHolder {
    public final ImageButton btnItemMore;
    public final ViewGroup collapsible;
    public boolean isSection;
    public int itemPosition;
    public final TextView subtitle;
    public final TextView title;
    public static WeakEventR<Boolean> onRequest = new WeakEventR<>();
    static final ActionListenerBase[] itemActionsElement = {new CustomItemActions.RemoveAction.RemoveActionListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.1
        @Override // com.daaw.avee.comp.VisualizerCutomization.CustomItemActions.RemoveAction.RemoveActionListener
        protected void onAction(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }};
    static final ActionListenerBase[] itemActionsElementPremium = {new CustomItemActions.DuplicateAction.DuplicateActionListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.2
        @Override // com.daaw.avee.comp.VisualizerCutomization.CustomItemActions.DuplicateAction.DuplicateActionListener
        protected void onAction(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }, new CustomItemActions.RemoveAction.RemoveActionListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.3
        @Override // com.daaw.avee.comp.VisualizerCutomization.CustomItemActions.RemoveAction.RemoveActionListener
        protected void onAction(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }};
    static final ActionListenerBase[] itemActionsComposition = {new CustomItemActions.RemoveCompositionAction.RemoveCompositionActionListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.4
        @Override // com.daaw.avee.comp.VisualizerCutomization.CustomItemActions.RemoveCompositionAction.RemoveCompositionActionListener
        protected void onAction(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }};

    public CustomSimpleViewHolder(View view) {
        super(view);
        this.isSection = true;
        this.title = (TextView) view.findViewById(R.id.txtItemLine1);
        this.subtitle = (TextView) view.findViewById(R.id.txtItemLine2);
        this.collapsible = (ViewGroup) view.findViewById(R.id.collapsible);
        this.btnItemMore = (ImageButton) view.findViewById(R.id.btnItemMore);
    }

    public CustomSimpleViewHolder(final View view, final CustomSimpleAdapter.IOnDraggingListener iOnDraggingListener, final ViewGroup viewGroup) {
        super(view);
        this.isSection = false;
        this.title = (TextView) view.findViewById(R.id.txtItemLine1);
        this.subtitle = (TextView) view.findViewById(R.id.txtItemLine2);
        this.collapsible = (ViewGroup) view.findViewById(R.id.collapsible);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.btnItemMore = imageButton;
        imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.5
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                iOnDraggingListener.onStartDragging(view);
                return true;
            }
        });
        this.btnItemMore.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
                return view2.onTouchEvent(motionEvent);
            }
        });
    }

    public void initItem() {
        int adapterPosition = getAdapterPosition();
        this.itemPosition = adapterPosition;
        if (this.isSection) {
            if (adapterPosition == 0) {
                setItemActions(null);
            } else {
                setItemActions(itemActionsComposition);
            }
        } else if (onRequest.invoke(false).booleanValue()) {
            setItemActions(itemActionsElementPremium);
        } else {
            setItemActions(itemActionsElement);
        }
    }

    public void setTextSubtitle(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            this.subtitle.setText(charSequence);
            this.subtitle.setVisibility(0);
            return;
        }
        this.subtitle.setText("");
        this.subtitle.setVisibility(8);
    }

    public void setItemActions(final ActionListenerBase[] actionListenerBaseArr) {
        if (actionListenerBaseArr != null && actionListenerBaseArr.length > 0) {
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.7
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    CustomSimpleViewHolder.this.createMenu(view, actionListenerBaseArr);
                    return true;
                }
            });
        } else {
            this.itemView.setOnLongClickListener(null);
        }
    }

    public void createMenu(final View view, final ActionListenerBase[] actionListenerBaseArr) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder.8
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                actionListenerBaseArr[menuItem.getItemId()].execute(new ContextData(view), Integer.valueOf(CustomSimpleViewHolder.this.itemPosition));
                return true;
            }
        });
        for (int i = 0; i < actionListenerBaseArr.length; i++) {
            if (actionListenerBaseArr[i].getItemActionBase().getShouldShow() && actionListenerBaseArr[i].getItemActionBase().isAllowSingle()) {
                popupMenu.getMenu().add(0, i, actionListenerBaseArr[i].getItemActionBase().getActionId(), actionListenerBaseArr[i].getItemActionBase().getNameStrResId());
            }
        }
        popupMenu.show();
    }
}
