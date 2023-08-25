.class public final Lcom/daaw/j56;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/i76;

.field public final b:J

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j56;->a:Lcom/daaw/i76;

    iput-wide p2, p0, Lcom/daaw/j56;->b:J

    iput-object p4, p0, Lcom/daaw/j56;->c:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/j56;->a:Lcom/daaw/i76;

    invoke-interface {v0}, Lcom/daaw/i76;->zza()I

    move-result v0

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 6

    iget-object v0, p0, Lcom/daaw/j56;->a:Lcom/daaw/i76;

    invoke-interface {v0}, Lcom/daaw/i76;->zzb()Lcom/daaw/f77;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/j56;->b:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/j56;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    :cond_0
    const-class v1, Ljava/lang/Throwable;

    sget-object v2, Lcom/daaw/i56;->a:Lcom/daaw/i56;

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
