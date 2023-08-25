.class public Lcom/daaw/h74;
.super Landroid/webkit/WebViewClient;
.source ""

# interfaces
.implements Lcom/daaw/t84;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field public static final synthetic R:I


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public D:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public E:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public F:Lcom/google/android/gms/ads/internal/overlay/zzz;

.field public G:Lcom/daaw/gq3;

.field public H:Lcom/google/android/gms/ads/internal/zzb;

.field public I:Lcom/daaw/bq3;

.field public J:Lcom/daaw/cx3;

.field public K:Lcom/daaw/op6;

.field public L:Z

.field public M:Z

.field public N:I

.field public O:Z

.field public final P:Ljava/util/HashSet;

.field public Q:Landroid/view/View$OnAttachStateChangeListener;

.field public final p:Lcom/daaw/a74;

.field public final q:Lcom/daaw/x33;

.field public final r:Ljava/util/HashMap;

.field public final s:Ljava/lang/Object;

.field public t:Lcom/google/android/gms/ads/internal/client/zza;

.field public u:Lcom/google/android/gms/ads/internal/overlay/zzo;

.field public v:Lcom/daaw/o84;

.field public w:Lcom/daaw/s84;

.field public x:Lcom/daaw/mf3;

.field public y:Lcom/daaw/of3;

.field public z:Lcom/daaw/vy4;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;Lcom/daaw/x33;Z)V
    .locals 4

    new-instance v0, Lcom/daaw/gq3;

    invoke-interface {p1}, Lcom/daaw/a74;->j()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/daaw/m83;

    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/daaw/m83;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/gq3;-><init>(Lcom/daaw/a74;Landroid/content/Context;Lcom/daaw/m83;)V

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/h74;->q:Lcom/daaw/x33;

    iput-object p1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    iput-boolean p3, p0, Lcom/daaw/h74;->C:Z

    iput-object v0, p0, Lcom/daaw/h74;->G:Lcom/daaw/gq3;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    new-instance p1, Ljava/util/HashSet;

    sget-object p2, Lcom/daaw/g93;->b5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, ","

    invoke-virtual {p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/daaw/h74;->P:Ljava/util/HashSet;

    return-void
.end method

.method public static final H(ZLcom/daaw/a74;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->o()Lcom/daaw/v84;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/v84;->i()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->O()Ljava/lang/String;

    move-result-object p0

    const-string p1, "interstitial_mb"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic W(Lcom/daaw/h74;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/h74;->s(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic d0(Lcom/daaw/h74;Landroid/view/View;Lcom/daaw/cx3;I)V
    .locals 0

    const/16 p3, 0xa

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/h74;->F(Landroid/view/View;Lcom/daaw/cx3;I)V

    return-void
.end method

.method public static l()Landroid/webkit/WebResourceResponse;
    .locals 3

    sget-object v0, Lcom/daaw/g93;->D0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/webkit/WebResourceResponse;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    const/4 v2, 0x0

    new-array v2, v2, [B

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v2, ""

    invoke-direct {v0, v2, v2, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->Q:Landroid/view/View$OnAttachStateChangeListener;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public final A0(ZIZ)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->L()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-static {v0, v1}, Lcom/daaw/h74;->H(ZLcom/daaw/a74;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    new-instance p3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    move-object v3, v2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    move-object v3, v0

    :goto_1
    iget-object v4, p0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    iget-object v5, p0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    iget-object v6, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v6}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v9

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    move-object v10, v0

    :goto_2
    move-object v2, p3

    move v7, p1

    move v8, p2

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/a74;ZILcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vy4;)V

    invoke-virtual {p0, p3}, Lcom/daaw/h74;->B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/bq3;->l()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzi()Lcom/google/android/gms/ads/internal/overlay/zzm;

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v1

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/zzm;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    iget-object v0, p0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    if-eqz v0, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->zzl:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->zza:Lcom/google/android/gms/ads/internal/overlay/zzc;

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/zzc;->zzb:Ljava/lang/String;

    :cond_1
    invoke-interface {v0, v1}, Lcom/daaw/cx3;->zzh(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final C0(ZILjava/lang/String;Z)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->L()Z

    move-result v1

    iget-object v2, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-static {v1, v2}, Lcom/daaw/h74;->H(ZLcom/daaw/a74;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    new-instance v15, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    move-object v5, v4

    goto :goto_1

    :cond_2
    iget-object v2, v0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    move-object v5, v2

    :goto_1
    if-eqz v1, :cond_3

    move-object v6, v4

    goto :goto_2

    :cond_3
    new-instance v1, Lcom/daaw/g74;

    iget-object v2, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    iget-object v6, v0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    invoke-direct {v1, v2, v6}, Lcom/daaw/g74;-><init>(Lcom/daaw/a74;Lcom/google/android/gms/ads/internal/overlay/zzo;)V

    move-object v6, v1

    :goto_2
    iget-object v7, v0, Lcom/daaw/h74;->x:Lcom/daaw/mf3;

    iget-object v8, v0, Lcom/daaw/h74;->y:Lcom/daaw/of3;

    iget-object v9, v0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    iget-object v10, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v10}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v14

    if-eqz v3, :cond_4

    move-object v1, v4

    goto :goto_3

    :cond_4
    iget-object v1, v0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    :goto_3
    move-object v4, v15

    move/from16 v11, p1

    move/from16 v12, p2

    move-object/from16 v13, p3

    move-object v2, v15

    move-object v15, v1

    invoke-direct/range {v4 .. v15}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/mf3;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/a74;ZILjava/lang/String;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vy4;)V

    invoke-virtual {v0, v2}, Lcom/daaw/h74;->B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final D0(ZILjava/lang/String;Ljava/lang/String;Z)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->L()Z

    move-result v1

    iget-object v2, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-static {v1, v2}, Lcom/daaw/h74;->H(ZLcom/daaw/a74;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    new-instance v15, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    move-object v5, v4

    goto :goto_1

    :cond_2
    iget-object v2, v0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    move-object v5, v2

    :goto_1
    if-eqz v1, :cond_3

    move-object v6, v4

    goto :goto_2

    :cond_3
    new-instance v1, Lcom/daaw/g74;

    iget-object v2, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    iget-object v6, v0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    invoke-direct {v1, v2, v6}, Lcom/daaw/g74;-><init>(Lcom/daaw/a74;Lcom/google/android/gms/ads/internal/overlay/zzo;)V

    move-object v6, v1

    :goto_2
    iget-object v7, v0, Lcom/daaw/h74;->x:Lcom/daaw/mf3;

    iget-object v8, v0, Lcom/daaw/h74;->y:Lcom/daaw/of3;

    iget-object v9, v0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    iget-object v10, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v10}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v1

    if-eqz v3, :cond_4

    move-object/from16 v16, v4

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    move-object/from16 v16, v2

    :goto_3
    move-object v4, v15

    move/from16 v11, p1

    move/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object v2, v15

    move-object v15, v1

    invoke-direct/range {v4 .. v16}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/mf3;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/a74;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vy4;)V

    invoke-virtual {v0, v2}, Lcom/daaw/h74;->B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final E(Lcom/daaw/o84;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h74;->v:Lcom/daaw/o84;

    return-void
.end method

.method public final E0(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v2, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final F(Landroid/view/View;Lcom/daaw/cx3;I)V
    .locals 2

    invoke-interface {p2}, Lcom/daaw/cx3;->zzi()Z

    move-result v0

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    invoke-interface {p2, p1}, Lcom/daaw/cx3;->b(Landroid/view/View;)V

    invoke-interface {p2}, Lcom/daaw/cx3;->zzi()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v1, Lcom/daaw/d74;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/d74;-><init>(Lcom/daaw/h74;Landroid/view/View;Lcom/daaw/cx3;I)V

    const-wide/16 p1, 0x64

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final F0()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/cx3;->zze()V

    iput-object v1, p0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/h74;->A()V

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    iput-object v1, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    iput-object v1, p0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    iput-object v1, p0, Lcom/daaw/h74;->v:Lcom/daaw/o84;

    iput-object v1, p0, Lcom/daaw/h74;->w:Lcom/daaw/s84;

    iput-object v1, p0, Lcom/daaw/h74;->x:Lcom/daaw/mf3;

    iput-object v1, p0, Lcom/daaw/h74;->y:Lcom/daaw/of3;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/h74;->A:Z

    iput-boolean v2, p0, Lcom/daaw/h74;->C:Z

    iput-boolean v2, p0, Lcom/daaw/h74;->D:Z

    iput-object v1, p0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    iput-object v1, p0, Lcom/daaw/h74;->H:Lcom/google/android/gms/ads/internal/zzb;

    iput-object v1, p0, Lcom/daaw/h74;->G:Lcom/daaw/gq3;

    iget-object v2, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/bq3;->h(Z)V

    iput-object v1, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    :cond_1
    iput-object v1, p0, Lcom/daaw/h74;->K:Lcom/daaw/op6;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final G(IIZ)V
    .locals 1

    iget-object p3, p0, Lcom/daaw/h74;->G:Lcom/daaw/gq3;

    if-eqz p3, :cond_0

    invoke-virtual {p3, p1, p2}, Lcom/daaw/gq3;->h(II)V

    :cond_0
    iget-object p3, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    if-eqz p3, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lcom/daaw/bq3;->j(IIZ)V

    :cond_1
    return-void
.end method

.method public final J(Lcom/google/android/gms/ads/internal/client/zza;Lcom/daaw/mf3;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;ZLcom/daaw/bh3;Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/iq3;Lcom/daaw/cx3;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/rh3;Lcom/daaw/vy4;Lcom/daaw/qh3;Lcom/daaw/kh3;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p15

    move-object/from16 v13, p16

    move-object/from16 v14, p17

    move-object/from16 v15, p18

    const/4 v9, 0x0

    if-nez p8, :cond_0

    new-instance v6, Lcom/google/android/gms/ads/internal/zzb;

    iget-object v7, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v7}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7, v5, v9}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/daaw/cx3;Lcom/google/android/gms/internal/ads/zzcbh;)V

    move-object v8, v6

    goto :goto_0

    :cond_0
    move-object/from16 v8, p8

    :goto_0
    new-instance v6, Lcom/daaw/bq3;

    iget-object v7, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-direct {v6, v7, v4}, Lcom/daaw/bq3;-><init>(Lcom/daaw/a74;Lcom/daaw/iq3;)V

    iput-object v6, v0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    iput-object v5, v0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    sget-object v5, Lcom/daaw/g93;->L0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, Lcom/daaw/lf3;

    invoke-direct {v5, v1}, Lcom/daaw/lf3;-><init>(Lcom/daaw/mf3;)V

    const-string v6, "/adMetadata"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_1
    if-eqz v2, :cond_2

    new-instance v5, Lcom/daaw/nf3;

    invoke-direct {v5, v2}, Lcom/daaw/nf3;-><init>(Lcom/daaw/of3;)V

    const-string v6, "/appEvent"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_2
    sget-object v5, Lcom/daaw/yg3;->j:Lcom/daaw/zg3;

    const-string v6, "/backButton"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->k:Lcom/daaw/zg3;

    const-string v6, "/refresh"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->b:Lcom/daaw/zg3;

    const-string v6, "/canOpenApp"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->a:Lcom/daaw/zg3;

    const-string v6, "/canOpenURLs"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->c:Lcom/daaw/zg3;

    const-string v6, "/canOpenIntents"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->d:Lcom/daaw/zg3;

    const-string v6, "/close"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->e:Lcom/daaw/zg3;

    const-string v6, "/customClose"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->n:Lcom/daaw/zg3;

    const-string v6, "/instrument"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->p:Lcom/daaw/zg3;

    const-string v6, "/delayPageLoaded"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->q:Lcom/daaw/zg3;

    const-string v6, "/delayPageClosed"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->r:Lcom/daaw/zg3;

    const-string v6, "/getLocationInfo"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v5, Lcom/daaw/yg3;->g:Lcom/daaw/zg3;

    const-string v6, "/log"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v5, Lcom/daaw/fh3;

    iget-object v6, v0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    invoke-direct {v5, v8, v6, v4}, Lcom/daaw/fh3;-><init>(Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/bq3;Lcom/daaw/iq3;)V

    const-string v4, "/mraid"

    invoke-virtual {v0, v4, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v4, v0, Lcom/daaw/h74;->G:Lcom/daaw/gq3;

    if-eqz v4, :cond_3

    const-string v5, "/mraidLoaded"

    invoke-virtual {v0, v5, v4}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_3
    new-instance v7, Lcom/daaw/jh3;

    iget-object v6, v0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    move-object v4, v7

    move-object v5, v8

    move-object v2, v7

    move-object/from16 v7, p11

    move-object/from16 v16, v8

    move-object/from16 v8, p13

    move-object v1, v9

    move-object/from16 v9, p14

    invoke-direct/range {v4 .. v9}, Lcom/daaw/jh3;-><init>(Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/bq3;Lcom/daaw/cq5;Lcom/daaw/kd5;Lcom/daaw/on6;)V

    const-string v4, "/open"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v2, Lcom/daaw/k54;

    invoke-direct {v2}, Lcom/daaw/k54;-><init>()V

    const-string v4, "/precache"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v2, Lcom/daaw/yg3;->i:Lcom/daaw/zg3;

    const-string v4, "/touch"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v2, Lcom/daaw/yg3;->l:Lcom/daaw/zg3;

    const-string v4, "/video"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v2, Lcom/daaw/yg3;->m:Lcom/daaw/zg3;

    const-string v4, "/videoMeta"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    const-string v2, "/httpTrack"

    const-string v4, "/click"

    if-eqz v10, :cond_4

    if-eqz v11, :cond_4

    new-instance v5, Lcom/daaw/yi6;

    invoke-direct {v5, v13, v11, v10}, Lcom/daaw/yi6;-><init>(Lcom/daaw/vy4;Lcom/daaw/op6;Lcom/daaw/cq5;)V

    invoke-virtual {v0, v4, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v4, Lcom/daaw/xi6;

    invoke-direct {v4, v11, v10}, Lcom/daaw/xi6;-><init>(Lcom/daaw/op6;Lcom/daaw/cq5;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p16 .. p16}, Lcom/daaw/yg3;->a(Lcom/daaw/vy4;)Lcom/daaw/zg3;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v4, Lcom/daaw/yg3;->f:Lcom/daaw/zg3;

    :goto_1
    invoke-virtual {v0, v2, v4}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object v2

    iget-object v4, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v4}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/daaw/ky3;->z(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lcom/daaw/eh3;

    iget-object v4, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v4}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/daaw/eh3;-><init>(Landroid/content/Context;)V

    const-string v4, "/logScionEvent"

    invoke-virtual {v0, v4, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_5
    if-eqz v3, :cond_6

    new-instance v2, Lcom/daaw/ah3;

    invoke-direct {v2, v3, v1}, Lcom/daaw/ah3;-><init>(Lcom/daaw/bh3;[B)V

    const-string v1, "/setInterstitialProperties"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_6
    if-eqz v12, :cond_7

    sget-object v1, Lcom/daaw/g93;->X7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "/inspectorNetworkExtras"

    invoke-virtual {v0, v1, v12}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_7
    sget-object v1, Lcom/daaw/g93;->q8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz v14, :cond_8

    const-string v1, "/shareSheet"

    invoke-virtual {v0, v1, v14}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_8
    sget-object v1, Lcom/daaw/g93;->t8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    if-eqz v15, :cond_9

    const-string v1, "/inspectorOutOfContextTest"

    invoke-virtual {v0, v1, v15}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_9
    sget-object v1, Lcom/daaw/g93;->v9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lcom/daaw/yg3;->u:Lcom/daaw/zg3;

    const-string v2, "/bindPlayStoreOverlay"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/yg3;->v:Lcom/daaw/zg3;

    const-string v2, "/presentPlayStoreOverlay"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/yg3;->w:Lcom/daaw/zg3;

    const-string v2, "/expandPlayStoreOverlay"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/yg3;->x:Lcom/daaw/zg3;

    const-string v2, "/collapsePlayStoreOverlay"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/yg3;->y:Lcom/daaw/zg3;

    const-string v2, "/closePlayStoreOverlay"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/g93;->K2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lcom/daaw/yg3;->A:Lcom/daaw/zg3;

    const-string v2, "/setPAIDPersonalizationEnabled"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v1, Lcom/daaw/yg3;->z:Lcom/daaw/zg3;

    const-string v2, "/resetPAID"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h74;->E0(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_a
    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    move-object/from16 v1, p3

    iput-object v1, v0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/daaw/h74;->x:Lcom/daaw/mf3;

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/daaw/h74;->y:Lcom/daaw/of3;

    move-object/from16 v1, p5

    iput-object v1, v0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    move-object/from16 v6, v16

    iput-object v6, v0, Lcom/daaw/h74;->H:Lcom/google/android/gms/ads/internal/zzb;

    iput-object v13, v0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    move/from16 v1, p6

    iput-boolean v1, v0, Lcom/daaw/h74;->A:Z

    iput-object v11, v0, Lcom/daaw/h74;->K:Lcom/daaw/op6;

    return-void
.end method

.method public final M()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final S()Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final T(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 4

    :try_start_0
    sget-object v0, Lcom/daaw/gb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    const-string v2, ""

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/daaw/h74;->K:Lcom/daaw/op6;

    if-eqz v0, :cond_0

    const-string v0, "oda"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/daaw/h74;->K:Lcom/daaw/op6;

    invoke-virtual {p2, p1, v1}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    new-instance p1, Landroid/webkit/WebResourceResponse;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-direct {p2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p1, v2, v2, p2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-boolean v3, p0, Lcom/daaw/h74;->O:Z

    invoke-static {p1, v0, v3}, Lcom/daaw/my3;->c(Ljava/lang/String;Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0, v0, p2}, Lcom/daaw/h74;->m(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbei;->h(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzbei;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/daaw/h33;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/h33;->b(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbef;->u()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance p1, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbef;->s()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {p1, v2, v2, p2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p1

    :cond_2
    invoke-static {}, Lcom/daaw/j04;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/daaw/wa3;->b:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p2}, Lcom/daaw/h74;->m(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :cond_3
    return-object v1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p2

    const-string v0, "AdWebViewClient.interceptRequest"

    invoke-virtual {p2, p1, v0}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/h74;->l()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Z)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/h74;->D:Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/h74;->C:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/h74;->A:Z

    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final e(Ljava/lang/String;Lcom/daaw/uy0;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/zg3;

    invoke-interface {p2, v3}, Lcom/daaw/uy0;->apply(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final e0()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h74;->v:Lcom/daaw/o84;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/daaw/h74;->L:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/h74;->N:I

    if-lez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/h74;->M:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/h74;->B:Z

    if-eqz v0, :cond_4

    :cond_1
    sget-object v0, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzo()Lcom/daaw/t93;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzo()Lcom/daaw/t93;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/t93;->a()Lcom/daaw/v93;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/y24;->zzn()Lcom/daaw/s93;

    move-result-object v1

    const-string v2, "awfllc"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/daaw/n93;->a(Lcom/daaw/v93;Lcom/daaw/s93;[Ljava/lang/String;)Z

    :cond_2
    iget-object v0, p0, Lcom/daaw/h74;->v:Lcom/daaw/o84;

    iget-boolean v1, p0, Lcom/daaw/h74;->M:Z

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lcom/daaw/h74;->B:Z

    if-nez v1, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-interface {v0, v2}, Lcom/daaw/o84;->zza(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/h74;->v:Lcom/daaw/o84;

    :cond_4
    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->N()V

    return-void
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/h74;->E:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/h74;->O:Z

    return-void
.end method

.method public final synthetic i0()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->f0()V

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzN()Lcom/google/android/gms/ads/internal/overlay/zzl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzl;->zzx()V

    :cond_0
    return-void
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/h74;->D:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k0(Landroid/net/Uri;)V
    .locals 5

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/h74;->r:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/daaw/g93;->a5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/daaw/h74;->P:Ljava/util/HashSet;

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    sget-object v3, Lcom/daaw/g93;->c5:Lcom/daaw/y83;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v2, v3, :cond_1

    const-string v2, "Parsing gmsg query params on BG thread: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzb(Landroid/net/Uri;)Lcom/daaw/f77;

    move-result-object v2

    new-instance v3, Lcom/daaw/f74;

    invoke-direct {v3, p0, v1, v0, p1}, Lcom/daaw/f74;-><init>(Lcom/daaw/h74;Ljava/util/List;Ljava/lang/String;Landroid/net/Uri;)V

    sget-object p1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-static {v2, v3, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzL(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/h74;->s(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "No GMSG handler found for GMSG: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/g93;->h6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qz3;->f()Lcom/daaw/l93;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v1, 0x2

    if-ge p1, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    :goto_1
    const-string p1, "null"

    :goto_2
    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/b74;

    invoke-direct {v1, p1}, Lcom/daaw/b74;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final synthetic l0(Landroid/view/View;Lcom/daaw/cx3;I)V
    .locals 0

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/h74;->F(Landroid/view/View;Lcom/daaw/cx3;I)V

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 10

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/16 p1, 0x108

    :try_start_0
    invoke-static {p1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    const/4 p1, 0x0

    :goto_0
    add-int/lit8 p1, p1, 0x1

    const/16 v1, 0x14

    if-gt p1, v1, :cond_7

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v2, v1, Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_6

    check-cast v1, Ljava/net/HttpURLConnection;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v3

    iget-object v2, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v2}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v2, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v2}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const v9, 0xea60

    move-object v7, v1

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/ads/internal/util/zzs;->zze(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;ZI)V

    new-instance v2, Lcom/daaw/j04;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/daaw/j04;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lcom/daaw/j04;->c(Ljava/net/HttpURLConnection;[B)V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    invoke-virtual {v2, v1, v4}, Lcom/daaw/j04;->e(Ljava/net/HttpURLConnection;I)V

    const/16 v2, 0x12c

    if-lt v4, v2, :cond_5

    const/16 v2, 0x190

    if-ge v4, v2, :cond_5

    const-string v2, "Location"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v4, "tel:"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object v3

    :cond_1
    :try_start_1
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, v0, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "Protocol is null"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/h74;->l()Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object p1

    :cond_2
    :try_start_2
    const-string v4, "http"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "https"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unsupported scheme: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/h74;->l()Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object p1

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Redirecting to "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    move-object v0, v3

    goto/16 :goto_0

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Missing Location header in redirect"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzM(Ljava/net/HttpURLConnection;)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object p1

    :cond_6
    :try_start_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid protocol."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_7
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "Too many redirects (20)"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final m0(Lcom/google/android/gms/ads/internal/overlay/zzc;Z)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->L()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-static {v0, v1}, Lcom/daaw/h74;->H(ZLcom/daaw/a74;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    new-instance p2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object v5, v3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    move-object v5, v1

    :goto_1
    if-eqz v0, :cond_3

    move-object v6, v3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/daaw/h74;->u:Lcom/google/android/gms/ads/internal/overlay/zzo;

    move-object v6, v0

    :goto_2
    iget-object v7, p0, Lcom/daaw/h74;->F:Lcom/google/android/gms/ads/internal/overlay/zzz;

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v8

    iget-object v9, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    if-eqz v2, :cond_4

    move-object v10, v3

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    move-object v10, v0

    :goto_3
    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/zzc;Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/a74;Lcom/daaw/vy4;)V

    invoke-virtual {p0, p2}, Lcom/daaw/h74;->B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final n0(Lcom/google/android/gms/ads/internal/util/zzbr;Lcom/daaw/cq5;Lcom/daaw/kd5;Lcom/daaw/on6;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v2, v0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v2}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    const/16 v10, 0xe

    move-object v1, v11

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/daaw/a74;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/util/zzbr;Lcom/daaw/cq5;Lcom/daaw/kd5;Lcom/daaw/on6;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p0, v11}, Lcom/daaw/h74;->B0(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zza;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Loading resource: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p2

    const-string v0, "gmsg"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mobileads.google.com"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/h74;->k0(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {p2}, Lcom/daaw/a74;->o0()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Blank page loaded, 1..."

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {p2}, Lcom/daaw/a74;->z()V

    monitor-exit p1

    return-void

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/h74;->L:Z

    iget-object p1, p0, Lcom/daaw/h74;->w:Lcom/daaw/s84;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/s84;->zza()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/h74;->w:Lcom/daaw/s84;

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/h74;->e0()V

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/h74;->B:Z

    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    iget-object p1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->didCrash()Z

    move-result v0

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->rendererPriorityAtExit()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/daaw/a74;->x0(ZI)Z

    move-result p1

    return p1
.end method

.method public final s(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Received GMSG: "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/zg3;

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {p3, v0, p1}, Lcom/daaw/zg3;->a(Ljava/lang/Object;Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/daaw/h74;->T(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 p2, 0x4f

    if-eq p1, p2, :cond_0

    const/16 p2, 0xde

    if-eq p1, p2, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    const/4 p1, 0x0

    return p1

    :cond_0
    :pswitch_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 12

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AdWebView shouldOverrideUrlLoading: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "gmsg"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v3, "mobileads.google.com"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/h74;->k0(Landroid/net/Uri;)V

    goto/16 :goto_2

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/h74;->A:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v1

    if-ne p1, v1, :cond_5

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v3, "http"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "https"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_1
    iget-object v0, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zza;->onAdClicked()V

    iget-object v0, p0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    if-eqz v0, :cond_2

    invoke-interface {v0, p2}, Lcom/daaw/cx3;->zzh(Ljava/lang/String;)V

    :cond_2
    iput-object v1, p0, Lcom/daaw/h74;->t:Lcom/google/android/gms/ads/internal/client/zza;

    :cond_3
    iget-object v0, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/daaw/vy4;->zzq()V

    iput-object v1, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_5
    iget-object p1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {p1}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->willNotDraw()Z

    move-result p1

    if-nez p1, :cond_9

    :try_start_0
    iget-object p1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {p1}, Lcom/daaw/a74;->a()Lcom/daaw/sl2;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Lcom/daaw/sl2;->f(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v3}, Lcom/daaw/a74;->zzk()Landroid/app/Activity;

    move-result-object v4

    check-cast v3, Landroid/view/View;

    invoke-virtual {p1, v0, v1, v3, v4}, Lcom/daaw/sl2;->a(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object v0
    :try_end_0
    .catch Lcom/daaw/tl2; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unable to append parameter to URL: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/daaw/h74;->H:Lcom/google/android/gms/ads/internal/zzb;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzb;->zzc()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/daaw/h74;->H:Lcom/google/android/gms/ads/internal/zzb;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/internal/zzb;->zzb(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    :goto_1
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v4, "android.intent.action.VIEW"

    move-object v3, p1

    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/overlay/zzx;)V

    invoke-virtual {p0, p1, v2}, Lcom/daaw/h74;->m0(Lcom/google/android/gms/ads/internal/overlay/zzc;Z)V

    goto :goto_2

    :cond_9
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "AdWebView unable to handle URL: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    :goto_2
    return v2
.end method

.method public final t0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/daaw/h74;->E:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final y0(Lcom/daaw/s84;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h74;->w:Lcom/daaw/s84;

    return-void
.end method

.method public final z0(II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->I:Lcom/daaw/bq3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/bq3;->k(II)V

    :cond_0
    return-void
.end method

.method public final zzE()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lcom/daaw/h74;->A:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/h74;->C:Z

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v2, Lcom/daaw/c74;

    invoke-direct {v2, p0}, Lcom/daaw/c74;-><init>(Lcom/daaw/h74;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzd()Lcom/google/android/gms/ads/internal/zzb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->H:Lcom/google/android/gms/ads/internal/zzb;

    return-object v0
.end method

.method public final zzj()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->q:Lcom/daaw/x33;

    if-eqz v0, :cond_0

    const/16 v1, 0x2715

    invoke-virtual {v0, v1}, Lcom/daaw/x33;->c(I)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/h74;->M:Z

    invoke-virtual {p0}, Lcom/daaw/h74;->e0()V

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->destroy()V

    return-void
.end method

.method public final zzk()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h74;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p0, Lcom/daaw/h74;->N:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/h74;->N:I

    invoke-virtual {p0}, Lcom/daaw/h74;->e0()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final zzl()V
    .locals 1

    iget v0, p0, Lcom/daaw/h74;->N:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/h74;->N:I

    invoke-virtual {p0}, Lcom/daaw/h74;->e0()V

    return-void
.end method

.method public final zzp()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h74;->J:Lcom/daaw/cx3;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/xs1;->U(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xa

    invoke-virtual {p0, v1, v0, v2}, Lcom/daaw/h74;->F(Landroid/view/View;Lcom/daaw/cx3;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/h74;->A()V

    new-instance v1, Lcom/daaw/e74;

    invoke-direct {v1, p0, v0}, Lcom/daaw/e74;-><init>(Lcom/daaw/h74;Lcom/daaw/cx3;)V

    iput-object v1, p0, Lcom/daaw/h74;->Q:Landroid/view/View$OnAttachStateChangeListener;

    iget-object v0, p0, Lcom/daaw/h74;->p:Lcom/daaw/a74;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_1
    return-void
.end method

.method public final zzq()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/vy4;->zzq()V

    :cond_0
    return-void
.end method

.method public final zzr()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/h74;->z:Lcom/daaw/vy4;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/vy4;->zzr()V

    :cond_0
    return-void
.end method
