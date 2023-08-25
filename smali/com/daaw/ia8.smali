.class public final Lcom/daaw/ia8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g78;


# instance fields
.field public final p:Lcom/daaw/xp4;

.field public q:Z

.field public r:J

.field public s:J

.field public t:Lcom/daaw/pp3;


# direct methods
.method public constructor <init>(Lcom/daaw/xp4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ia8;->p:Lcom/daaw/xp4;

    sget-object p1, Lcom/daaw/pp3;->d:Lcom/daaw/pp3;

    iput-object p1, p0, Lcom/daaw/ia8;->t:Lcom/daaw/pp3;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ia8;->r:J

    iget-boolean p1, p0, Lcom/daaw/ia8;->q:Z

    if-eqz p1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/ia8;->s:J

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ia8;->q:Z

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/ia8;->s:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ia8;->q:Z

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ia8;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ia8;->zza()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ia8;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ia8;->q:Z

    :cond_0
    return-void
.end method

.method public final l(Lcom/daaw/pp3;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ia8;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ia8;->zza()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ia8;->a(J)V

    :cond_0
    iput-object p1, p0, Lcom/daaw/ia8;->t:Lcom/daaw/pp3;

    return-void
.end method

.method public final zza()J
    .locals 7

    iget-wide v0, p0, Lcom/daaw/ia8;->r:J

    iget-boolean v2, p0, Lcom/daaw/ia8;->q:Z

    if-eqz v2, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/ia8;->s:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lcom/daaw/ia8;->t:Lcom/daaw/pp3;

    iget v5, v4, Lcom/daaw/pp3;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Lcom/daaw/pp3;->a(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method

.method public final zzc()Lcom/daaw/pp3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ia8;->t:Lcom/daaw/pp3;

    return-object v0
.end method
