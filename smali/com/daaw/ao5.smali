.class public final Lcom/daaw/ao5;
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

.field public final r:Lcom/daaw/fi6;

.field public final s:Lcom/daaw/th6;

.field public final t:Lcom/daaw/cq5;

.field public u:Ljava/lang/Boolean;

.field public final v:Z

.field public final w:Lcom/daaw/on6;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/gj6;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/cq5;Lcom/daaw/on6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ao5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ao5;->q:Lcom/daaw/gj6;

    iput-object p3, p0, Lcom/daaw/ao5;->r:Lcom/daaw/fi6;

    iput-object p4, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iput-object p5, p0, Lcom/daaw/ao5;->t:Lcom/daaw/cq5;

    sget-object p1, Lcom/daaw/g93;->m6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/ao5;->v:Z

    iput-object p6, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    iput-object p7, p0, Lcom/daaw/ao5;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/ao5;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzb:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v3, "com.google.android.gms.ads"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    iget v0, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzb:Ljava/lang/String;

    :cond_1
    iget-object p1, p0, Lcom/daaw/ao5;->q:Lcom/daaw/gj6;

    invoke-virtual {p1, v1}, Lcom/daaw/gj6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "ifts"

    invoke-virtual {p0, v1}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    const-string v2, "reason"

    const-string v3, "adapter"

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    if-ltz v0, :cond_2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "arec"

    invoke-virtual {v1, v2, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_2
    if-eqz p1, :cond_3

    const-string v0, "areec"

    invoke-virtual {v1, v0, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_3
    iget-object p1, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    invoke-interface {p1, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/daaw/nn6;
    .locals 3

    invoke-static {p1}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/ao5;->r:Lcom/daaw/fi6;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/nn6;->h(Lcom/daaw/fi6;Lcom/daaw/xz3;)Lcom/daaw/nn6;

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    invoke-virtual {p1, v0}, Lcom/daaw/nn6;->f(Lcom/daaw/th6;)Lcom/daaw/nn6;

    iget-object v0, p0, Lcom/daaw/ao5;->x:Ljava/lang/String;

    const-string v1, "request_id"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->u:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "ancn"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/ao5;->p:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/daaw/qz3;->x(Landroid/content/Context;)Z

    move-result v1

    if-eq v0, v1, :cond_1

    const-string v0, "offline"

    goto :goto_0

    :cond_1
    const-string v0, "online"

    :goto_0
    const-string v1, "device_connectivity"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "event_timestamp"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    const-string v0, "offline_ad"

    const-string v1, "1"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_2
    return-object p1
.end method

.method public final e(Lcom/daaw/nn6;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    invoke-interface {v0, p1}, Lcom/daaw/on6;->b(Lcom/daaw/nn6;)Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/daaw/eq5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/ao5;->r:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v4, v0, Lcom/daaw/wh6;->b:Ljava/lang/String;

    const/4 v6, 0x2

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/eq5;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/ao5;->t:Lcom/daaw/cq5;

    invoke-virtual {v0, p1}, Lcom/daaw/cq5;->u(Lcom/daaw/eq5;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    invoke-interface {v0, p1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final f()Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/ao5;->u:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ao5;->u:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/g93;->m1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v1, p0, Lcom/daaw/ao5;->p:Landroid/content/Context;

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

    iput-object v0, p0, Lcom/daaw/ao5;->u:Ljava/lang/Boolean;

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
    iget-object v0, p0, Lcom/daaw/ao5;->u:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "click"

    invoke-virtual {p0, v0}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/ao5;->e(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final s(Lcom/daaw/b15;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ao5;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-virtual {p0, v0}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "exception"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_1
    iget-object p1, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    invoke-interface {p1, v0}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final zzb()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/ao5;->v:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    const-string v1, "ifts"

    invoke-virtual {p0, v1}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    const-string v2, "reason"

    const-string v3, "blocked"

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final zzd()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ao5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    const-string v1, "adapter_shown"

    invoke-virtual {p0, v1}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final zze()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ao5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ao5;->w:Lcom/daaw/on6;

    const-string v1, "adapter_impression"

    invoke-virtual {p0, v1}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final zzl()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ao5;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ao5;->s:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "impression"

    invoke-virtual {p0, v0}, Lcom/daaw/ao5;->c(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/ao5;->e(Lcom/daaw/nn6;)V

    return-void
.end method
