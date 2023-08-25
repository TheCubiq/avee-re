.class public final Lcom/daaw/y16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/qz3;

.field public b:Lcom/daaw/l5;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lcom/daaw/g77;

.field public final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/g93;->t2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/k5;->a(Landroid/content/Context;)Lcom/daaw/l5;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/y16;->b:Lcom/daaw/l5;

    :cond_0
    iput-object p1, p0, Lcom/daaw/y16;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/y16;->a:Lcom/daaw/qz3;

    iput-object p3, p0, Lcom/daaw/y16;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lcom/daaw/y16;->d:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0xb

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    sget-object v0, Lcom/daaw/g93;->p2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/daaw/g93;->u2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/daaw/g93;->q2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/y16;->b:Lcom/daaw/l5;

    invoke-interface {v0}, Lcom/daaw/l5;->a()Lcom/daaw/rj1;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ov6;->a(Lcom/daaw/rj1;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/v16;->a:Lcom/daaw/v16;

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/daaw/g93;->t2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/y16;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/wj6;->a(Landroid/content/Context;)Lcom/daaw/rj1;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/y16;->b:Lcom/daaw/l5;

    invoke-interface {v0}, Lcom/daaw/l5;->a()Lcom/daaw/rj1;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/z16;

    invoke-direct {v0, v2, v1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lcom/daaw/ov6;->a(Lcom/daaw/rj1;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/w16;->a:Lcom/daaw/w16;

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->r2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/daaw/g93;->s2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/y16;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    :cond_3
    new-instance v1, Lcom/daaw/x16;

    invoke-direct {v1, p0}, Lcom/daaw/x16;-><init>(Lcom/daaw/y16;)V

    const-class v2, Ljava/lang/Exception;

    iget-object v3, p0, Lcom/daaw/y16;->d:Lcom/daaw/g77;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    new-instance v0, Lcom/daaw/z16;

    invoke-direct {v0, v2, v1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
