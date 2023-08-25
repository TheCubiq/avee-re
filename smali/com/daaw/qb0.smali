.class public final Lcom/daaw/qb0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d81;


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/rb0;

.field public r:I


# direct methods
.method public constructor <init>(Lcom/daaw/rb0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iput p2, p0, Lcom/daaw/qb0;->p:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/qb0;->r:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget v0, p0, Lcom/daaw/qb0;->r:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    invoke-virtual {v0}, Lcom/daaw/rb0;->K()V

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/c81;

    iget-object v1, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    invoke-virtual {v1}, Lcom/daaw/rb0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v1

    iget v2, p0, Lcom/daaw/qb0;->p:I

    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/daaw/c81;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 2

    iget v0, p0, Lcom/daaw/qb0;->r:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iget v1, p0, Lcom/daaw/qb0;->p:I

    invoke-virtual {v0, v1}, Lcom/daaw/rb0;->w(I)I

    move-result v0

    iput v0, p0, Lcom/daaw/qb0;->r:I

    return-void
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lcom/daaw/qb0;->r:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lcom/daaw/qb0;->r:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/qb0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iget v1, p0, Lcom/daaw/qb0;->r:I

    invoke-virtual {v0, v1}, Lcom/daaw/rb0;->H(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()V
    .locals 3

    iget v0, p0, Lcom/daaw/qb0;->r:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iget v2, p0, Lcom/daaw/qb0;->p:I

    invoke-virtual {v0, v2}, Lcom/daaw/rb0;->a0(I)V

    iput v1, p0, Lcom/daaw/qb0;->r:I

    :cond_0
    return-void
.end method

.method public j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qb0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iget v1, p0, Lcom/daaw/qb0;->r:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/rb0;->R(ILcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x3

    :goto_0
    return p1
.end method

.method public n(J)I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qb0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qb0;->q:Lcom/daaw/rb0;

    iget v1, p0, Lcom/daaw/qb0;->r:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/rb0;->Z(IJ)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
