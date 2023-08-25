.class public final Lcom/daaw/pc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sv4;
.implements Lcom/google/android/gms/ads/internal/client/zza;
.implements Lcom/daaw/ir4;
.implements Lcom/daaw/pq4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/gj6;

.field public final r:Lcom/daaw/kd5;

.field public final s:Lcom/daaw/fi6;

.field public final t:Lcom/daaw/th6;

.field public final u:Lcom/daaw/cq5;

.field public v:Ljava/lang/Boolean;

.field public final w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/gj6;Lcom/daaw/kd5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/cq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pc5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/pc5;->q:Lcom/daaw/gj6;

    iput-object p3, p0, Lcom/daaw/pc5;->r:Lcom/daaw/kd5;

    iput-object p4, p0, Lcom/daaw/pc5;->s:Lcom/daaw/fi6;

    iput-object p5, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iput-object p6, p0, Lcom/daaw/pc5;->u:Lcom/daaw/cq5;

    sget-object p1, Lcom/daaw/g93;->m6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/pc5;->w:Z

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/pc5;->w:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "adapter"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzb:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v4, "com.google.android.gms.ads"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzb:Ljava/lang/String;

    :cond_1
    if-ltz v1, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "arec"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_2
    iget-object p1, p0, Lcom/daaw/pc5;->q:Lcom/daaw/gj6;

    invoke-virtual {p1, v2}, Lcom/daaw/gj6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "areec"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/daaw/jd5;
    .locals 5

    iget-object v0, p0, Lcom/daaw/pc5;->r:Lcom/daaw/kd5;

    invoke-virtual {v0}, Lcom/daaw/kd5;->a()Lcom/daaw/jd5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pc5;->s:Lcom/daaw/fi6;

    iget-object v1, v1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v0, v1}, Lcom/daaw/jd5;->e(Lcom/daaw/wh6;)Lcom/daaw/jd5;

    iget-object v1, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    invoke-virtual {v0, v1}, Lcom/daaw/jd5;->d(Lcom/daaw/th6;)Lcom/daaw/jd5;

    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    iget-object p1, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-object p1, p1, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-object p1, p1, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v2, "ancn"

    invoke-virtual {v0, v2, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_0
    iget-object p1, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-boolean p1, p1, Lcom/daaw/th6;->k0:Z

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/pc5;->p:Landroid/content/Context;

    invoke-virtual {p1, v3}, Lcom/daaw/qz3;->x(Landroid/content/Context;)Z

    move-result p1

    if-eq v2, p1, :cond_1

    const-string p1, "offline"

    goto :goto_0

    :cond_1
    const-string p1, "online"

    :goto_0
    const-string v3, "device_connectivity"

    invoke-virtual {v0, v3, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string v3, "event_timestamp"

    invoke-virtual {v0, v3, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    const-string p1, "offline_ad"

    const-string v3, "1"

    invoke-virtual {v0, p1, v3}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_2
    sget-object p1, Lcom/daaw/g93;->v6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/pc5;->s:Lcom/daaw/fi6;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zze(Lcom/daaw/ri6;)I

    move-result p1

    if-eq p1, v2, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v2, "scar"

    invoke-virtual {v0, v2, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/daaw/pc5;->s:Lcom/daaw/fi6;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object p1, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    const-string v2, "ragent"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jd5;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzb(Lcom/google/android/gms/ads/internal/client/zzl;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "rtype"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_4
    return-object v0
.end method

.method public final e(Lcom/daaw/jd5;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/jd5;->f()Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/daaw/eq5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/pc5;->s:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v4, v0, Lcom/daaw/wh6;->b:Ljava/lang/String;

    const/4 v6, 0x2

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/eq5;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/pc5;->u:Lcom/daaw/cq5;

    invoke-virtual {v0, p1}, Lcom/daaw/cq5;->u(Lcom/daaw/eq5;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final f()Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/pc5;->v:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pc5;->v:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/g93;->m1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v1, p0, Lcom/daaw/pc5;->p:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v3, "CsiActionsListener.isPatternMatched"

    invoke-virtual {v1, v0, v3}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/pc5;->v:Ljava/lang/Boolean;

    :cond_2
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/pc5;->v:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "click"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->e(Lcom/daaw/jd5;)V

    return-void
.end method

.method public final s(Lcom/daaw/b15;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/pc5;->w:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "exception"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final zzb()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/pc5;->w:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "blocked"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final zzd()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pc5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_shown"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final zze()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pc5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_impression"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method

.method public final zzl()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pc5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pc5;->t:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "impression"

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->c(Ljava/lang/String;)Lcom/daaw/jd5;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/pc5;->e(Lcom/daaw/jd5;)V

    return-void
.end method
