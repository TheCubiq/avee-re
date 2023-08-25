.class public final Lcom/daaw/n55;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r35;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Lcom/daaw/sn3;

.field public final b:Lcom/daaw/gr4;

.field public final c:Lcom/daaw/jq4;

.field public final d:Lcom/daaw/ty4;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/daaw/th6;

.field public final g:Lcom/google/android/gms/internal/ads/zzchu;

.field public final h:Lcom/daaw/ri6;

.field public i:Z

.field public j:Z

.field public k:Z

.field public final l:Lcom/daaw/on3;

.field public final m:Lcom/daaw/pn3;


# direct methods
.method public constructor <init>(Lcom/daaw/on3;Lcom/daaw/pn3;Lcom/daaw/sn3;Lcom/daaw/gr4;Lcom/daaw/jq4;Lcom/daaw/ty4;Landroid/content/Context;Lcom/daaw/th6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/ri6;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p11, 0x0

    iput-boolean p11, p0, Lcom/daaw/n55;->i:Z

    iput-boolean p11, p0, Lcom/daaw/n55;->j:Z

    const/4 p11, 0x1

    iput-boolean p11, p0, Lcom/daaw/n55;->k:Z

    iput-object p1, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    iput-object p2, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    iput-object p3, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    iput-object p4, p0, Lcom/daaw/n55;->b:Lcom/daaw/gr4;

    iput-object p5, p0, Lcom/daaw/n55;->c:Lcom/daaw/jq4;

    iput-object p6, p0, Lcom/daaw/n55;->d:Lcom/daaw/ty4;

    iput-object p7, p0, Lcom/daaw/n55;->e:Landroid/content/Context;

    iput-object p8, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iput-object p9, p0, Lcom/daaw/n55;->g:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p10, p0, Lcom/daaw/n55;->h:Lcom/daaw/ri6;

    return-void
.end method

.method public static final r(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final b(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    :try_start_0
    iget-boolean p1, p0, Lcom/daaw/n55;->i:Z

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzs()Lcom/google/android/gms/ads/internal/util/zzaw;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/n55;->e:Landroid/content/Context;

    iget-object p3, p0, Lcom/daaw/n55;->g:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    iget-object p4, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iget-object p4, p4, Lcom/daaw/th6;->D:Lorg/json/JSONObject;

    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p4

    iget-object v0, p0, Lcom/daaw/n55;->h:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, v0}, Lcom/google/android/gms/ads/internal/util/zzaw;->zzn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/n55;->i:Z

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/n55;->k:Z

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcom/daaw/sn3;->zzB()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    invoke-interface {p1}, Lcom/daaw/sn3;->zzx()V

    iget-object p1, p0, Lcom/daaw/n55;->b:Lcom/daaw/gr4;

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V

    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/daaw/on3;->r3()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    invoke-virtual {p1}, Lcom/daaw/on3;->zzt()V

    iget-object p1, p0, Lcom/daaw/n55;->b:Lcom/daaw/gr4;

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V

    return-void

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/daaw/pn3;->r3()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    invoke-virtual {p1}, Lcom/daaw/pn3;->zzr()V

    iget-object p1, p0, Lcom/daaw/n55;->b:Lcom/daaw/gr4;

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    return-void

    :catch_0
    move-exception p1

    const-string p2, "Failed to call recordImpression"

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Landroid/view/View;Ljava/util/Map;)V
    .locals 0

    :try_start_0
    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/daaw/sn3;->n0(Lcom/daaw/yd0;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/daaw/on3;->w2(Lcom/daaw/yd0;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Lcom/daaw/pn3;->q3(Lcom/daaw/yd0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    const-string p2, "Failed to call untrackView"

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Landroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final e(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final f(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V
    .locals 8

    :try_start_0
    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    iget-object p4, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iget-object p4, p4, Lcom/daaw/th6;->l0:Lorg/json/JSONObject;

    sget-object p5, Lcom/daaw/g93;->q1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p5}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p5, :cond_e

    invoke-virtual {p4}, Lorg/json/JSONObject;->length()I

    move-result p5

    if-nez p5, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p2, :cond_1

    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    :cond_1
    move-object p5, p2

    :goto_0
    if-nez p3, :cond_2

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v3, p5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v3, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p5

    :catch_0
    :cond_3
    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    if-nez v5, :cond_5

    :cond_4
    :goto_3
    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Lcom/daaw/g93;->r1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_c

    const-string v6, "3010"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    :try_start_1
    invoke-interface {v2}, Lcom/daaw/sn3;->zzn()Lcom/daaw/yd0;

    move-result-object v2
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    nop

    goto :goto_5

    :cond_7
    :try_start_2
    iget-object v2, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v2, :cond_8

    :try_start_3
    invoke-virtual {v2}, Lcom/daaw/on3;->l3()Lcom/daaw/yd0;

    move-result-object v2
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :cond_8
    :try_start_4
    iget-object v2, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2

    if-eqz v2, :cond_9

    :try_start_5
    invoke-virtual {v2}, Lcom/daaw/pn3;->k3()Lcom/daaw/yd0;

    move-result-object v2
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_4

    :cond_9
    move-object v2, v5

    :goto_4
    if-eqz v2, :cond_a

    :try_start_6
    invoke-static {v2}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v5
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2

    :cond_a
    :goto_5
    if-nez v5, :cond_b

    goto :goto_3

    :cond_b
    :try_start_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2

    :cond_c
    :try_start_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v4, v2}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzc(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v4, p0, Lcom/daaw/n55;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catchall_0
    :cond_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2

    :try_start_9
    invoke-static {v6, v1, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v6, :cond_d

    goto/16 :goto_2

    :cond_e
    :goto_6
    :try_start_a
    iput-boolean v0, p0, Lcom/daaw/n55;->k:Z

    invoke-static {p2}, Lcom/daaw/n55;->r(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p2

    invoke-static {p3}, Lcom/daaw/n55;->r(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p3

    iget-object p4, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    if-eqz p4, :cond_f

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-static {p3}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p3

    invoke-interface {p4, p1, p2, p3}, Lcom/daaw/sn3;->n2(Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V

    return-void

    :cond_f
    iget-object p4, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    if-eqz p4, :cond_10

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-static {p3}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p3

    invoke-virtual {p4, p1, p2, p3}, Lcom/daaw/on3;->p3(Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V

    iget-object p2, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    invoke-virtual {p2, p1}, Lcom/daaw/on3;->o3(Lcom/daaw/yd0;)V

    return-void

    :cond_10
    iget-object p4, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    if-eqz p4, :cond_11

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-static {p3}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p3

    invoke-virtual {p4, p1, p2, p3}, Lcom/daaw/pn3;->p3(Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V

    iget-object p2, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    invoke-virtual {p2, p1}, Lcom/daaw/pn3;->o3(Lcom/daaw/yd0;)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_2

    :cond_11
    return-void

    :catch_2
    move-exception p1

    const-string p2, "Failed to call trackView"

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;)V
    .locals 0

    iget-boolean p2, p0, Lcom/daaw/n55;->j:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iget-boolean p2, p2, Lcom/daaw/th6;->M:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/n55;->q(Landroid/view/View;)V

    return-void
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(Lcom/google/android/gms/ads/internal/client/zzcs;)V
    .locals 0

    const-string p1, "Mute This Ad is not supported for 3rd party ads"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void
.end method

.method public final l(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/n55;->j:Z

    if-nez p1, :cond_0

    const-string p1, "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set."

    :goto_0
    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iget-boolean p1, p1, Lcom/daaw/th6;->M:Z

    if-nez p1, :cond_1

    const-string p1, "Custom click reporting for 3p ads failed. Ad unit id not in allow list."

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Lcom/daaw/n55;->q(Landroid/view/View;)V

    return-void
.end method

.method public final m(Lcom/daaw/ve3;)V
    .locals 0

    return-void
.end method

.method public final n(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final o(Lcom/google/android/gms/ads/internal/client/zzcw;)V
    .locals 0

    const-string p1, "Mute This Ad is not supported for 3rd party ads"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void
.end method

.method public final p(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(Landroid/view/View;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/sn3;->zzA()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n55;->a:Lcom/daaw/sn3;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/sn3;->w2(Lcom/daaw/yd0;)V

    iget-object p1, p0, Lcom/daaw/n55;->c:Lcom/daaw/jq4;

    invoke-virtual {p1}, Lcom/daaw/jq4;->onAdClicked()V

    sget-object p1, Lcom/daaw/g93;->W8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/n55;->d:Lcom/daaw/ty4;

    invoke-virtual {p1}, Lcom/daaw/ty4;->zzq()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/on3;->q3()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/n55;->l:Lcom/daaw/on3;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/on3;->n3(Lcom/daaw/yd0;)V

    iget-object p1, p0, Lcom/daaw/n55;->c:Lcom/daaw/jq4;

    invoke-virtual {p1}, Lcom/daaw/jq4;->onAdClicked()V

    sget-object p1, Lcom/daaw/g93;->W8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/n55;->d:Lcom/daaw/ty4;

    invoke-virtual {p1}, Lcom/daaw/ty4;->zzq()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/pn3;->zzv()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/n55;->m:Lcom/daaw/pn3;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/pn3;->n3(Lcom/daaw/yd0;)V

    iget-object p1, p0, Lcom/daaw/n55;->c:Lcom/daaw/jq4;

    invoke-virtual {p1}, Lcom/daaw/jq4;->onAdClicked()V

    sget-object p1, Lcom/daaw/g93;->W8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/n55;->d:Lcom/daaw/ty4;

    invoke-virtual {p1}, Lcom/daaw/ty4;->zzq()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to call handleClick"

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzA()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzB()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n55;->f:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->M:Z

    return v0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzg()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final zzh()V
    .locals 0

    return-void
.end method

.method public final zzi()V
    .locals 0

    return-void
.end method

.method public final zzp()V
    .locals 0

    return-void
.end method

.method public final zzr()V
    .locals 0

    return-void
.end method

.method public final zzv()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/n55;->j:Z

    return-void
.end method
