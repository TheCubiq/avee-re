.class public final Lcom/daaw/kb6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/qz3;

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lcom/daaw/g77;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/daaw/fz3;


# direct methods
.method public constructor <init>(Lcom/daaw/qz3;ZZLcom/daaw/fz3;Lcom/daaw/g77;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kb6;->a:Lcom/daaw/qz3;

    iput-boolean p2, p0, Lcom/daaw/kb6;->b:Z

    iput-boolean p3, p0, Lcom/daaw/kb6;->c:Z

    iput-object p4, p0, Lcom/daaw/kb6;->g:Lcom/daaw/fz3;

    iput-object p5, p0, Lcom/daaw/kb6;->e:Lcom/daaw/g77;

    iput-object p6, p0, Lcom/daaw/kb6;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/daaw/kb6;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Exception;)Lcom/daaw/lb6;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kb6;->a:Lcom/daaw/qz3;

    const-string v1, "TrustlessTokenSignal"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x32

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    sget-object v0, Lcom/daaw/g93;->D6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/kb6;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/kb6;->b:Z

    if-nez v0, :cond_2

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/ib6;->a:Lcom/daaw/ib6;

    iget-object v2, p0, Lcom/daaw/kb6;->e:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/sb3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/kb6;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/jb6;

    invoke-direct {v1, p0}, Lcom/daaw/jb6;-><init>(Lcom/daaw/kb6;)V

    const-class v2, Ljava/lang/Exception;

    iget-object v3, p0, Lcom/daaw/kb6;->e:Lcom/daaw/g77;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
