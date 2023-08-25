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

    /* renamed from: a */
    public final Context f8755a;

    /* renamed from: b */
    public final Notification.Builder f8756b;

    /* renamed from: c */
    public final dt0.C1136d f8757c;

    /* renamed from: d */
    public RemoteViews f8758d;

    /* renamed from: e */
    public RemoteViews f8759e;

    /* renamed from: f */
    public final List<Bundle> f8760f = new ArrayList();

    /* renamed from: g */
    public final Bundle f8761g = new Bundle();

    /* renamed from: h */
    public int f8762h;

    /* renamed from: i */
    public RemoteViews f8763i;

    public et0(dt0.C1136d c1136d) {
        int i;
        Icon icon;
        List<String> m23204e;
        Bundle bundle;
        String str;
        this.f8757c = c1136d;
        this.f8755a = c1136d.f7755a;
        int i2 = Build.VERSION.SDK_INT;
        Context context = c1136d.f7755a;
        this.f8756b = i2 >= 26 ? new Notification.Builder(context, c1136d.f7744K) : new Notification.Builder(context);
        Notification notification = c1136d.f7751R;
        this.f8756b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c1136d.f7763i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c1136d.f7759e).setContentText(c1136d.f7760f).setContentInfo(c1136d.f7765k).setContentIntent(c1136d.f7761g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c1136d.f7762h, (notification.flags & 128) != 0).setLargeIcon(c1136d.f7764j).setNumber(c1136d.f7766l).setProgress(c1136d.f7774t, c1136d.f7775u, c1136d.f7776v);
        if (i2 < 21) {
            this.f8756b.setSound(notification.sound, notification.audioStreamType);
        }
        this.f8756b.setSubText(c1136d.f7771q).setUsesChronometer(c1136d.f7769o).setPriority(c1136d.f7767m);
        Iterator<dt0.C1133a> it = c1136d.f7756b.iterator();
        while (it.hasNext()) {
            m23207b(it.next());
        }
        Bundle bundle2 = c1136d.f7737D;
        if (bundle2 != null) {
            this.f8761g.putAll(bundle2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 20) {
            if (c1136d.f7780z) {
                this.f8761g.putBoolean("android.support.localOnly", true);
            }
            String str2 = c1136d.f7777w;
            if (str2 != null) {
                this.f8761g.putString("android.support.groupKey", str2);
                if (c1136d.f7778x) {
                    bundle = this.f8761g;
                    str = "android.support.isGroupSummary";
                } else {
                    bundle = this.f8761g;
                    str = "android.support.useSideChannel";
                }
                bundle.putBoolean(str, true);
            }
            String str3 = c1136d.f7779y;
            if (str3 != null) {
                this.f8761g.putString("android.support.sortKey", str3);
            }
        }
        this.f8758d = c1136d.f7741H;
        this.f8759e = c1136d.f7742I;
        this.f8756b.setShowWhen(c1136d.f7768n);
        if (i3 < 21 && (m23204e = m23204e(m23203f(c1136d.f7757c), c1136d.f7754U)) != null && !m23204e.isEmpty()) {
            this.f8761g.putStringArray("android.people", (String[]) m23204e.toArray(new String[m23204e.size()]));
        }
        if (i3 >= 20) {
            this.f8756b.setLocalOnly(c1136d.f7780z).setGroup(c1136d.f7777w).setGroupSummary(c1136d.f7778x).setSortKey(c1136d.f7779y);
            this.f8762h = c1136d.f7748O;
        }
        if (i3 >= 21) {
            this.f8756b.setCategory(c1136d.f7736C).setColor(c1136d.f7738E).setVisibility(c1136d.f7739F).setPublicVersion(c1136d.f7740G).setSound(notification.sound, notification.audioAttributes);
            List<String> m23204e2 = i3 < 28 ? m23204e(m23203f(c1136d.f7757c), c1136d.f7754U) : c1136d.f7754U;
            if (m23204e2 != null && !m23204e2.isEmpty()) {
                for (String str4 : m23204e2) {
                    this.f8756b.addPerson(str4);
                }
            }
            this.f8763i = c1136d.f7743J;
            if (c1136d.f7758d.size() > 0) {
                Bundle bundle3 = c1136d.m23975c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < c1136d.f7758d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), ft0.m22308b(c1136d.f7758d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                c1136d.m23975c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f8761g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = c1136d.f7753T) != null) {
            this.f8756b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f8756b.setExtras(c1136d.f7737D).setRemoteInputHistory(c1136d.f7773s);
            RemoteViews remoteViews = c1136d.f7741H;
            if (remoteViews != null) {
                this.f8756b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = c1136d.f7742I;
            if (remoteViews2 != null) {
                this.f8756b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = c1136d.f7743J;
            if (remoteViews3 != null) {
                this.f8756b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f8756b.setBadgeIconType(c1136d.f7745L).setSettingsText(c1136d.f7772r).setShortcutId(c1136d.f7746M).setTimeoutAfter(c1136d.f7747N).setGroupAlertBehavior(c1136d.f7748O);
            if (c1136d.f7735B) {
                this.f8756b.setColorized(c1136d.f7734A);
            }
            if (!TextUtils.isEmpty(c1136d.f7744K)) {
                this.f8756b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<lw0> it2 = c1136d.f7757c.iterator();
            while (it2.hasNext()) {
                this.f8756b.addPerson(it2.next().m16465h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f8756b.setAllowSystemGeneratedContextualActions(c1136d.f7750Q);
            this.f8756b.setBubbleMetadata(dt0.C1135c.m23978a(null));
        }
        if (i6 >= 31 && (i = c1136d.f7749P) != 0) {
            this.f8756b.setForegroundServiceBehavior(i);
        }
        if (c1136d.f7752S) {
            if (this.f8757c.f7778x) {
                this.f8762h = 2;
            } else {
                this.f8762h = 1;
            }
            this.f8756b.setVibrate(null);
            this.f8756b.setSound(null);
            int i7 = notification.defaults & (-2) & (-3);
            notification.defaults = i7;
            this.f8756b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f8757c.f7777w)) {
                    this.f8756b.setGroup("silent");
                }
                this.f8756b.setGroupAlertBehavior(this.f8762h);
            }
        }
    }

    /* renamed from: e */
    public static List<String> m23204e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1798j6 c1798j6 = new C1798j6(list.size() + list2.size());
        c1798j6.addAll(list);
        c1798j6.addAll(list2);
        return new ArrayList(c1798j6);
    }

    /* renamed from: f */
    public static List<String> m23203f(List<lw0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lw0 lw0Var : list) {
            arrayList.add(lw0Var.m16466g());
        }
        return arrayList;
    }

    @Override // com.daaw.ct0
    /* renamed from: a */
    public Notification.Builder mo23208a() {
        return this.f8756b;
    }

    /* renamed from: b */
    public final void m23207b(dt0.C1133a c1133a) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            this.f8760f.add(ft0.m22305e(this.f8756b, c1133a));
            return;
        }
        IconCompat m23986e = c1133a.m23986e();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(m23986e != null ? m23986e.m29718o() : null, c1133a.m23982i(), c1133a.m23990a()) : new Notification.Action.Builder(m23986e != null ? m23986e.m29725h() : 0, c1133a.m23982i(), c1133a.m23990a());
        if (c1133a.m23985f() != null) {
            for (RemoteInput remoteInput : s31.m10745b(c1133a.m23985f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = c1133a.m23987d() != null ? new Bundle(c1133a.m23987d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", c1133a.m23989b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(c1133a.m23989b());
        }
        bundle.putInt("android.support.action.semanticAction", c1133a.m23984g());
        if (i2 >= 28) {
            builder.setSemanticAction(c1133a.m23984g());
        }
        if (i2 >= 29) {
            builder.setContextual(c1133a.m23980k());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(c1133a.m23981j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c1133a.m23983h());
        builder.addExtras(bundle);
        this.f8756b.addAction(builder.build());
    }

    /* renamed from: c */
    public Notification m23206c() {
        Bundle m23991a;
        RemoteViews m23955f;
        RemoteViews m23957d;
        dt0.AbstractC1137e abstractC1137e = this.f8757c.f7770p;
        if (abstractC1137e != null) {
            abstractC1137e.mo23959b(this);
        }
        RemoteViews m23956e = abstractC1137e != null ? abstractC1137e.m23956e(this) : null;
        Notification m23205d = m23205d();
        if (m23956e != null || (m23956e = this.f8757c.f7741H) != null) {
            m23205d.contentView = m23956e;
        }
        int i = Build.VERSION.SDK_INT;
        if (abstractC1137e != null && (m23957d = abstractC1137e.m23957d(this)) != null) {
            m23205d.bigContentView = m23957d;
        }
        if (i >= 21 && abstractC1137e != null && (m23955f = this.f8757c.f7770p.m23955f(this)) != null) {
            m23205d.headsUpContentView = m23955f;
        }
        if (abstractC1137e != null && (m23991a = dt0.m23991a(m23205d)) != null) {
            abstractC1137e.mo23960a(m23991a);
        }
        return m23205d;
    }

    /* renamed from: d */
    public Notification m23205d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f8756b.build();
        }
        if (i >= 24) {
            Notification build = this.f8756b.build();
            if (this.f8762h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f8762h == 2) {
                    m23202g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f8762h == 1) {
                    m23202g(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f8756b.setExtras(this.f8761g);
            Notification build2 = this.f8756b.build();
            RemoteViews remoteViews = this.f8758d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f8759e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f8763i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f8762h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f8762h == 2) {
                    m23202g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f8762h == 1) {
                    m23202g(build2);
                }
            }
            return build2;
        } else if (i < 20) {
            SparseArray<Bundle> m22309a = ft0.m22309a(this.f8760f);
            if (m22309a != null) {
                this.f8761g.putSparseParcelableArray("android.support.actionExtras", m22309a);
            }
            this.f8756b.setExtras(this.f8761g);
            Notification build3 = this.f8756b.build();
            RemoteViews remoteViews4 = this.f8758d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f8759e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            return build3;
        } else {
            this.f8756b.setExtras(this.f8761g);
            Notification build4 = this.f8756b.build();
            RemoteViews remoteViews6 = this.f8758d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f8759e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            if (this.f8762h != 0) {
                if (build4.getGroup() != null && (build4.flags & 512) != 0 && this.f8762h == 2) {
                    m23202g(build4);
                }
                if (build4.getGroup() != null && (build4.flags & 512) == 0 && this.f8762h == 1) {
                    m23202g(build4);
                }
            }
            return build4;
        }
    }

    /* renamed from: g */
    public final void m23202g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
