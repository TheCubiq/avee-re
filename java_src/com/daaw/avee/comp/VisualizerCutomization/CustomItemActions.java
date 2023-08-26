package com.daaw.avee.comp.VisualizerCutomization;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CustomItemActions {
    public static WeakEvent2<Context, Integer> onActionRemove = new WeakEvent2<>();
    public static WeakEvent2<Context, Integer> onActionDuplicate = new WeakEvent2<>();

    /* loaded from: classes.dex */
    public static class RemoveAction extends ItemActionBase {
        public static ItemActionBase baseInstance = new RemoveAction();

        private RemoveAction() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((RemoveActionListener) list2.get(i)).onAction(contextData.getContext(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                CustomItemActions.onActionRemove.invoke(contextData.getContext(), arrayList.get(0));
            }
        }

        /* loaded from: classes.dex */
        public static abstract class RemoveActionListener extends ActionListenerBase {
            protected abstract void onAction(Context context, Object obj, List<Integer> list);

            public RemoveActionListener() {
                super(RemoveAction.baseInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DuplicateAction extends ItemActionBase {
        public static DuplicateAction baseInstance = new DuplicateAction();

        private DuplicateAction() {
            super(1, false, true, R.drawable.ic_close, R.string.vis_action_duplicate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((DuplicateActionListener) list2.get(i)).onAction(contextData.getContext(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                CustomItemActions.onActionDuplicate.invoke(contextData.getContext(), arrayList.get(0));
            }
        }

        /* loaded from: classes.dex */
        public static abstract class DuplicateActionListener extends ActionListenerBase {
            protected abstract void onAction(Context context, Object obj, List<Integer> list);

            public DuplicateActionListener() {
                super(DuplicateAction.baseInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RemoveCompositionAction extends ItemActionBase {
        public static ItemActionBase baseInstance = new RemoveCompositionAction();

        private RemoveCompositionAction() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((RemoveCompositionActionListener) list2.get(i)).onAction(contextData.getContext(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                CustomItemActions.onActionRemove.invoke(contextData.getContext(), arrayList.get(0));
            }
        }

        /* loaded from: classes.dex */
        public static abstract class RemoveCompositionActionListener extends ActionListenerBase {
            protected abstract void onAction(Context context, Object obj, List<Integer> list);

            public RemoveCompositionActionListener() {
                super(RemoveCompositionAction.baseInstance);
            }
        }
    }
}
