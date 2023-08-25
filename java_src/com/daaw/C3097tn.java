package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.tn */
/* loaded from: classes.dex */
public class C3097tn {

    /* renamed from: a */
    public static rw1<Context, Integer> f27882a = new rw1<>();

    /* renamed from: b */
    public static rw1<Context, Integer> f27883b = new rw1<>();

    /* renamed from: com.daaw.tn$a */
    /* loaded from: classes.dex */
    public static class C3098a extends ch0 {

        /* renamed from: g */
        public static C3098a f27884g = new C3098a();

        /* renamed from: com.daaw.tn$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC3099a extends AbstractC2004l0 {
            public AbstractC3099a() {
                super(C3098a.f27884g);
            }

            /* renamed from: c */
            public abstract void mo3490c(Context context, Object obj, List<Integer> list);
        }

        public C3098a() {
            super(1, false, true, R.drawable.ic_close, R.string.vis_action_duplicate);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC3099a) list2.get(i)).mo3490c(c0645al.m27377b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                C3097tn.f27883b.m10862a(c0645al.m27377b(), (Integer) arrayList.get(0));
            }
        }
    }

    /* renamed from: com.daaw.tn$b */
    /* loaded from: classes.dex */
    public static class C3100b extends ch0 {

        /* renamed from: g */
        public static ch0 f27885g = new C3100b();

        /* renamed from: com.daaw.tn$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC3101a extends AbstractC2004l0 {
            public AbstractC3101a() {
                super(C3100b.f27885g);
            }

            /* renamed from: c */
            public abstract void mo3489c(Context context, Object obj, List<Integer> list);
        }

        public C3100b() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC3101a) list2.get(i)).mo3489c(c0645al.m27377b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                C3097tn.f27882a.m10862a(c0645al.m27377b(), (Integer) arrayList.get(0));
            }
        }
    }

    /* renamed from: com.daaw.tn$c */
    /* loaded from: classes.dex */
    public static class C3102c extends ch0 {

        /* renamed from: g */
        public static ch0 f27886g = new C3102c();

        /* renamed from: com.daaw.tn$c$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC3103a extends AbstractC2004l0 {
            public AbstractC3103a() {
                super(C3102c.f27886g);
            }

            /* renamed from: c */
            public abstract void mo3488c(Context context, Object obj, List<Integer> list);
        }

        public C3102c() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC3103a) list2.get(i)).mo3488c(c0645al.m27377b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                C3097tn.f27882a.m10862a(c0645al.m27377b(), (Integer) arrayList.get(0));
            }
        }
    }
}
