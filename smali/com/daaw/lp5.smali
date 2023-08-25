.class public final Lcom/daaw/lp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fn6;


# instance fields
.field public final p:Lcom/daaw/zo5;

.field public final q:Lcom/daaw/dp5;


# direct methods
.method public constructor <init>(Lcom/daaw/zo5;Lcom/daaw/dp5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    iput-object p2, p0, Lcom/daaw/lp5;->q:Lcom/daaw/dp5;

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 3

    sget-object p2, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object p2, Lcom/daaw/ym6;->t:Lcom/daaw/ym6;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/zo5;->g(J)V

    return-void

    :cond_1
    sget-object p2, Lcom/daaw/ym6;->P:Lcom/daaw/ym6;

    if-eq p2, p1, :cond_3

    sget-object p2, Lcom/daaw/ym6;->s:Lcom/daaw/ym6;

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/zo5;->h(J)V

    iget-object p1, p0, Lcom/daaw/lp5;->q:Lcom/daaw/dp5;

    iget-object p2, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-virtual {p2}, Lcom/daaw/zo5;->d()J

    move-result-wide v0

    iget-object p2, p1, Lcom/daaw/ip5;->b:Lcom/daaw/so5;

    new-instance v2, Lcom/daaw/cp5;

    invoke-direct {v2, p1, v0, v1}, Lcom/daaw/cp5;-><init>(Lcom/daaw/dp5;J)V

    invoke-virtual {p2, v2}, Lcom/daaw/so5;->a(Lcom/daaw/em6;)V

    return-void
.end method

.method public final M(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 4

    sget-object p2, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/daaw/ym6;->t:Lcom/daaw/ym6;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-virtual {p1}, Lcom/daaw/zo5;->c()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-object p2, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-virtual {p2}, Lcom/daaw/zo5;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/daaw/zo5;->f(J)V

    :cond_0
    return-void
.end method

.method public final S(Lcom/daaw/ym6;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object p2, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/daaw/ym6;->t:Lcom/daaw/ym6;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-virtual {p1}, Lcom/daaw/zo5;->c()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/ag;->b()J

    move-result-wide p2

    iget-object v0, p0, Lcom/daaw/lp5;->p:Lcom/daaw/zo5;

    invoke-virtual {v0}, Lcom/daaw/zo5;->c()J

    move-result-wide v0

    sub-long/2addr p2, v0

    invoke-virtual {p1, p2, p3}, Lcom/daaw/zo5;->f(J)V

    :cond_0
    return-void
.end method

.method public final k(Lcom/daaw/ym6;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
