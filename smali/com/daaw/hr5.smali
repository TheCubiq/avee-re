.class public final Lcom/daaw/hr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c15;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzchu;

.field public final b:Lcom/daaw/f77;

.field public final c:Lcom/daaw/th6;

.field public final d:Lcom/daaw/a74;

.field public final e:Lcom/daaw/ri6;

.field public final f:Lcom/daaw/bh3;

.field public final g:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/f77;Lcom/daaw/th6;Lcom/daaw/a74;Lcom/daaw/ri6;ZLcom/daaw/bh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hr5;->a:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p2, p0, Lcom/daaw/hr5;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/hr5;->c:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/hr5;->d:Lcom/daaw/a74;

    iput-object p5, p0, Lcom/daaw/hr5;->e:Lcom/daaw/ri6;

    iput-boolean p6, p0, Lcom/daaw/hr5;->g:Z

    iput-object p7, p0, Lcom/daaw/hr5;->f:Lcom/daaw/bh3;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/hr5;->b:Lcom/daaw/f77;

    invoke-static {v1}, Lcom/daaw/s67;->q(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/gi4;

    iget-object v2, v0, Lcom/daaw/hr5;->d:Lcom/daaw/a74;

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Lcom/daaw/a74;->g0(Z)V

    new-instance v2, Lcom/google/android/gms/ads/internal/zzj;

    iget-boolean v4, v0, Lcom/daaw/hr5;->g:Z

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/daaw/hr5;->f:Lcom/daaw/bh3;

    invoke-virtual {v4, v3}, Lcom/daaw/bh3;->e(Z)Z

    move-result v4

    move v5, v4

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    :goto_0
    iget-boolean v4, v0, Lcom/daaw/hr5;->g:Z

    if-eqz v4, :cond_1

    iget-object v6, v0, Lcom/daaw/hr5;->f:Lcom/daaw/bh3;

    invoke-virtual {v6}, Lcom/daaw/bh3;->d()Z

    move-result v6

    move v7, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/daaw/hr5;->f:Lcom/daaw/bh3;

    invoke-virtual {v4}, Lcom/daaw/bh3;->a()F

    move-result v4

    move v8, v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_2
    const/4 v6, 0x1

    const/4 v9, -0x1

    iget-object v4, v0, Lcom/daaw/hr5;->c:Lcom/daaw/th6;

    iget-boolean v11, v4, Lcom/daaw/th6;->P:Z

    const/4 v12, 0x0

    move-object v4, v2

    move/from16 v10, p1

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/ads/internal/zzj;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/br4;->zzf()V

    :cond_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzi()Lcom/google/android/gms/ads/internal/overlay/zzm;

    new-instance v15, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v1}, Lcom/daaw/gi4;->i()Lcom/daaw/p05;

    move-result-object v6

    iget-object v8, v0, Lcom/daaw/hr5;->d:Lcom/daaw/a74;

    iget-object v1, v0, Lcom/daaw/hr5;->c:Lcom/daaw/th6;

    iget v1, v1, Lcom/daaw/th6;->R:I

    const/4 v4, -0x1

    if-eq v1, v4, :cond_4

    :goto_3
    move v9, v1

    goto :goto_4

    :cond_4
    iget-object v1, v0, Lcom/daaw/hr5;->e:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->j:Lcom/google/android/gms/ads/internal/client/zzw;

    if-eqz v1, :cond_6

    iget v1, v1, Lcom/google/android/gms/ads/internal/client/zzw;->zza:I

    if-ne v1, v3, :cond_5

    const/4 v1, 0x7

    const/4 v9, 0x7

    goto :goto_4

    :cond_5
    const/4 v4, 0x2

    if-ne v1, v4, :cond_6

    const/4 v1, 0x6

    const/4 v9, 0x6

    goto :goto_4

    :cond_6
    const-string v1, "Error setting app open orientation; no targeting orientation available."

    invoke-static {v1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/daaw/hr5;->c:Lcom/daaw/th6;

    iget v1, v1, Lcom/daaw/th6;->R:I

    goto :goto_3

    :goto_4
    iget-object v10, v0, Lcom/daaw/hr5;->a:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v1, v0, Lcom/daaw/hr5;->c:Lcom/daaw/th6;

    iget-object v11, v1, Lcom/daaw/th6;->C:Ljava/lang/String;

    iget-object v1, v1, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    const/4 v5, 0x0

    const/4 v7, 0x0

    iget-object v13, v1, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object v14, v1, Lcom/daaw/yh6;->a:Ljava/lang/String;

    iget-object v1, v0, Lcom/daaw/hr5;->e:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->f:Ljava/lang/String;

    move-object v4, v15

    move-object v12, v2

    move-object v2, v15

    move-object v15, v1

    move-object/from16 v16, p3

    invoke-direct/range {v4 .. v16}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/a74;ILcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/zzj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/br4;)V

    move-object/from16 v1, p2

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/ads/internal/overlay/zzm;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void
.end method
