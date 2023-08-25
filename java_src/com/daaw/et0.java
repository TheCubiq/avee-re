package com.daaw;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.dt0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class et0 implements ct0 {
    public final Context a;
    public final Notification.Builder b;
    public final dt0.d c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    public et0(dt0.d dVar) {
        int i;
        Icon icon;
        List<String> e;
        Bundle bundle;
        String str;
        this.c = dVar;
        this.a = dVar.a;
        int i2 = Build.VERSION.SDK_INT;
        Context context = dVar.a;
        this.b = i2 >= 26 ? new Notification.Builder(context, dVar.K) : new Notification.Builder(context);
        Notification notification = dVar.R;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.e).setContentText(dVar.f).setContentInfo(dVar.k).setContentIntent(dVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.h, (notification.flags & 128) != 0).setLargeIcon(dVar.j).setNumber(dVar.l).setProgress(dVar.t, dVar.u, dVar.v);
        if (i2 < 21) {
            this.b.setSound(notification.sound, notification.audioStreamType);
        }
        this.b.setSubText(dVar.q).setUsesChronometer(dVar.o).setPriority(dVar.m);
        Iterator<dt0.a> it = dVar.b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle2 = dVar.D;
        if (bundle2 != null) {
            this.g.putAll(bundle2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 20) {
            if (dVar.z) {
                this.g.putBoolean("android.support.localOnly", true);
            }
            String str2 = dVar.w;
            if (str2 != null) {
                this.g.putString("android.support.groupKey", str2);
                if (dVar.x) {
                    bundle = this.g;
                    str = "android.support.isGroupSummary";
                } else {
                    bundle = this.g;
                    str = "android.support.useSideChannel";
                }
                bundle.putBoolean(str, true);
            }
            String str3 = dVar.y;
            if (str3 != null) {
                this.g.putString("android.support.sortKey", str3);
            }
        }
        this.d = dVar.H;
        this.e = dVar.I;
        this.b.setShowWhen(dVar.n);
        if (i3 < 21 && (e = e(f(dVar.c), dVar.U)) != null && !e.isEmpty()) {
            this.g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i3 >= 20) {
            this.b.setLocalOnly(dVar.z).setGroup(dVar.w).setGroupSummary(dVar.x).setSortKey(dVar.y);
            this.h = dVar.O;
        }
        if (i3 >= 21) {
            this.b.setCategory(dVar.C).setColor(dVar.E).setVisibility(dVar.F).setPublicVersion(dVar.G).setSound(notification.sound, notification.audioAttributes);
            List<String> e2 = i3 < 28 ? e(f(dVar.c), dVar.U) : dVar.U;
            if (e2 != null && !e2.isEmpty()) {
                for (String str4 : e2) {
                    this.b.addPerson(str4);
                }
            }
            this.i = dVar.J;
            if (dVar.d.size() > 0) {
                Bundle bundle3 = dVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < dVar.d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), ft0.b(dVar.d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = dVar.T) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.b.setExtras(dVar.D).setRemoteInputHistory(dVar.s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.b.setBadgeIconType(dVar.L).setSettingsText(dVar.r).setShortcutId(dVar.M).setTimeoutAfter(dVar.N).setGroupAlertBehavior(dVar.O);
            if (dVar.B) {
                this.b.setColorized(dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<lw0> it2 = dVar.c.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(dVar.Q);
            this.b.setBubbleMetadata(dt0.c.a(null));
        }
        if (i6 >= 31 && (i = dVar.P) != 0) {
            this.b.setForegroundServiceBehavior(i);
        }
        if (dVar.S) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i7 = notification.defaults & (-2) & (-3);
            notification.defaults = i7;
            this.b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        j6 j6Var = new j6(list.size() + list2.size());
        j6Var.addAll(list);
        j6Var.addAll(list2);
        return new ArrayList(j6Var);
    }

    public static List<String> f(List<lw0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lw0 lw0Var : list) {
            arrayList.add(lw0Var.g());
        }
        return arrayList;
    }

    @Override // com.daaw.ct0
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(dt0.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            this.f.add(ft0.e(this.b, aVar));
            return;
        }
        IconCompat e = aVar.e();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(e != null ? e.o() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(e != null ? e.h() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : s31.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i2 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i2 >= 29) {
            builder.setContextual(aVar.k());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    public Notification c() {
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        dt0.e eVar = this.c.p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews e = eVar != null ? eVar.e(this) : null;
        Notification d2 = d();
        if (e != null || (e = this.c.H) != null) {
            d2.contentView = e;
        }
        int i = Build.VERSION.SDK_INT;
        if (eVar != null && (d = eVar.d(this)) != null) {
            d2.bigContentView = d;
        }
        if (i >= 21 && eVar != null && (f = this.c.p.f(this)) != null) {
            d2.headsUpContentView = f;
        }
        if (eVar != null && (a = dt0.a(d2)) != null) {
            eVar.a(a);
        }
        return d2;
    }

    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification build = this.b.build();
            if (this.h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.h == 2) {
                    g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.h == 1) {
                    g(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.b.setExtras(this.g);
            Notification build2 = this.b.build();
            RemoteViews remoteViews = this.d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.h == 2) {
                    g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.h == 1) {
                    g(build2);
                }
            }
            return build2;
        } else if (i < 20) {
            SparseArray<Bundle> a = ft0.a(this.f);
            if (a != null) {
                this.g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.b.setExtras(this.g);
            Notification build3 = this.b.build();
            RemoteViews remoteViews4 = this.d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            return build3;
        } else {
            this.b.setExtras(this.g);
            Notification build4 = this.b.build();
            RemoteViews remoteViews6 = this.d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            if (this.h != 0) {
                if (build4.getGroup() != null && (build4.flags & 512) != 0 && this.h == 2) {
                    g(build4);
                }
                if (build4.getGroup() != null && (build4.flags & 512) == 0 && this.h == 1) {
                    g(build4);
                }
            }
            return build4;
        }
    }

    public final void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
