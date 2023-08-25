.class public final Lcom/daaw/vv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c15;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ia5;

.field public final c:Lcom/daaw/ri6;

.field public final d:Lcom/google/android/gms/internal/ads/zzchu;

.field public final e:Lcom/daaw/th6;

.field public final f:Lcom/daaw/f77;

.field public final g:Lcom/daaw/a74;

.field public final h:Lcom/daaw/bh3;

.field public final i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ia5;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/f77;Lcom/daaw/a74;Lcom/daaw/bh3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vv5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/vv5;->b:Lcom/daaw/ia5;

    iput-object p3, p0, Lcom/daaw/vv5;->c:Lcom/daaw/ri6;

    iput-object p4, p0, Lcom/daaw/vv5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p5, p0, Lcom/daaw/vv5;->e:Lcom/daaw/th6;

    iput-object p6, p0, Lcom/daaw/vv5;->f:Lcom/daaw/f77;

    iput-object p7, p0, Lcom/daaw/vv5;->g:Lcom/daaw/a74;

    iput-object p8, p0, Lcom/daaw/vv5;->h:Lcom/daaw/bh3;

    iput-boolean p9, p0, Lcom/daaw/vv5;->i:Z

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/daaw/vv5;->f:Lcom/daaw/f77;

    invoke-static {v0}, Lcom/daaw/s67;->q(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/k95;

    :try_start_0
    iget-object v2, v1, Lcom/daaw/vv5;->e:Lcom/daaw/th6;

    iget-object v3, v1, Lcom/daaw/vv5;->g:Lcom/daaw/a74;

    invoke-interface {v3}, Lcom/daaw/a74;->V()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    :goto_0
    iget-object v2, v1, Lcom/daaw/vv5;->g:Lcom/daaw/a74;

    move-object v11, v2

    goto :goto_2

    :cond_0
    sget-object v3, Lcom/daaw/g93;->G0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lcom/daaw/vv5;->b:Lcom/daaw/ia5;

    iget-object v5, v1, Lcom/daaw/vv5;->c:Lcom/daaw/ri6;

    iget-object v5, v5, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v6}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/k95;->i()Lcom/daaw/ez4;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/daaw/ph3;->b(Lcom/daaw/a74;Lcom/daaw/oh3;)V

    new-instance v5, Lcom/daaw/ma5;

    invoke-direct {v5}, Lcom/daaw/ma5;-><init>()V

    iget-object v7, v1, Lcom/daaw/vv5;->a:Landroid/content/Context;

    move-object v8, v3

    check-cast v8, Landroid/view/View;

    invoke-virtual {v5, v7, v8}, Lcom/daaw/ma5;->a(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0}, Lcom/daaw/k95;->l()Lcom/daaw/ha5;

    move-result-object v7

    iget-boolean v8, v1, Lcom/daaw/vv5;->i:Z

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/daaw/vv5;->h:Lcom/daaw/bh3;

    goto :goto_1

    :cond_2
    move-object v8, v6

    :goto_1
    invoke-virtual {v7, v3, v4, v8}, Lcom/daaw/ha5;->i(Lcom/daaw/a74;ZLcom/daaw/bh3;)V

    invoke-interface {v3}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v7

    new-instance v8, Lcom/daaw/tv5;

    invoke-direct {v8, v5, v3}, Lcom/daaw/tv5;-><init>(Lcom/daaw/ma5;Lcom/daaw/a74;)V

    invoke-interface {v7, v8}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    invoke-interface {v3}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v5

    new-instance v7, Lcom/daaw/uv5;

    invoke-direct {v7, v3}, Lcom/daaw/uv5;-><init>(Lcom/daaw/a74;)V

    invoke-interface {v5, v7}, Lcom/daaw/t84;->y0(Lcom/daaw/s84;)V

    iget-object v2, v2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v5, v2, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-interface {v3, v5, v2, v6}, Lcom/daaw/a74;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/daaw/l74; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    :goto_2
    invoke-interface {v11, v4}, Lcom/daaw/a74;->g0(Z)V

    new-instance v2, Lcom/google/android/gms/ads/internal/zzj;

    iget-boolean v3, v1, Lcom/daaw/vv5;->i:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/daaw/vv5;->h:Lcom/daaw/bh3;

    invoke-virtual {v3, v5}, Lcom/daaw/bh3;->e(Z)Z

    move-result v3

    move v13, v3

    goto :goto_3

    :cond_3
    const/4 v13, 0x0

    :goto_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v3, v1, Lcom/daaw/vv5;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzE(Landroid/content/Context;)Z

    move-result v14

    iget-boolean v3, v1, Lcom/daaw/vv5;->i:Z

    if-eqz v3, :cond_4

    iget-object v5, v1, Lcom/daaw/vv5;->h:Lcom/daaw/bh3;

    invoke-virtual {v5}, Lcom/daaw/bh3;->d()Z

    move-result v5

    move v15, v5

    goto :goto_4

    :cond_4
    const/4 v15, 0x0

    :goto_4
    if-eqz v3, :cond_5

    iget-object v3, v1, Lcom/daaw/vv5;->h:Lcom/daaw/bh3;

    invoke-virtual {v3}, Lcom/daaw/bh3;->a()F

    move-result v3

    move/from16 v16, v3

    goto :goto_5

    :cond_5
    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_5
    iget-object v3, v1, Lcom/daaw/vv5;->e:Lcom/daaw/th6;

    const/16 v17, -0x1

    iget-boolean v5, v3, Lcom/daaw/th6;->P:Z

    iget-boolean v3, v3, Lcom/daaw/th6;->Q:Z

    move-object v12, v2

    move/from16 v18, p1

    move/from16 v19, v5

    move/from16 v20, v3

    invoke-direct/range {v12 .. v20}, Lcom/google/android/gms/ads/internal/zzj;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_6

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/br4;->zzf()V

    :cond_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzi()Lcom/google/android/gms/ads/internal/overlay/zzm;

    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v0}, Lcom/daaw/k95;->j()Lcom/daaw/p05;

    move-result-object v9

    iget-object v0, v1, Lcom/daaw/vv5;->e:Lcom/daaw/th6;

    iget v12, v0, Lcom/daaw/th6;->R:I

    iget-object v13, v1, Lcom/daaw/vv5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v14, v0, Lcom/daaw/th6;->C:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    const/4 v8, 0x0

    const/4 v10, 0x0

    iget-object v5, v0, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/yh6;->a:Ljava/lang/String;

    iget-object v6, v1, Lcom/daaw/vv5;->c:Lcom/daaw/ri6;

    iget-object v6, v6, Lcom/daaw/ri6;->f:Ljava/lang/String;

    move-object v7, v3

    move-object v15, v2

    move-object/from16 v16, v5

    move-object/from16 v17, v0

    move-object/from16 v18, v6

    move-object/from16 v19, p3

    invoke-direct/range {v7 .. v19}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/a74;ILcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/zzj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/br4;)V

    move-object/from16 v0, p2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/ads/internal/overlay/zzm;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
