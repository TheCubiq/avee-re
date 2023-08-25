.class public final Lcom/daaw/k62;
.super Lcom/daaw/x09;
.source ""


# instance fields
.field public final b:J


# direct methods
.method public constructor <init>(Lcom/daaw/k09;J)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/x09;-><init>(Lcom/daaw/k09;)V

    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/uo4;->d(Z)V

    iput-wide p2, p0, Lcom/daaw/k62;->b:J

    return-void
.end method


# virtual methods
.method public final zzd()J
    .locals 4

    invoke-super {p0}, Lcom/daaw/x09;->zzd()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/k62;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final zze()J
    .locals 4

    invoke-super {p0}, Lcom/daaw/x09;->zze()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/k62;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzf()J
    .locals 4

    invoke-super {p0}, Lcom/daaw/x09;->zzf()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/k62;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
