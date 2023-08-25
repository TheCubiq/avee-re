.class public final Lcom/daaw/bs8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nr8;
.implements Lcom/daaw/mr8;


# instance fields
.field public final p:Lcom/daaw/nr8;

.field public final q:J

.field public r:Lcom/daaw/mr8;


# direct methods
.method public constructor <init>(Lcom/daaw/nr8;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iput-wide p2, p0, Lcom/daaw/bs8;->q:J

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/bs8;)Lcom/daaw/nr8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/vt8;)V
    .locals 0

    check-cast p1, Lcom/daaw/nr8;

    iget-object p1, p0, Lcom/daaw/bs8;->r:Lcom/daaw/mr8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    return-void
.end method

.method public final b(J)J
    .locals 3

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v1, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->b(J)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/bs8;->q:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final c(J)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v1, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->c(J)Z

    move-result p1

    return p1
.end method

.method public final d(Lcom/daaw/nr8;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/bs8;->r:Lcom/daaw/mr8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p0}, Lcom/daaw/mr8;->d(Lcom/daaw/nr8;)V

    return-void
.end method

.method public final e(JZ)V
    .locals 2

    iget-object p3, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v0, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/daaw/nr8;->e(JZ)V

    return-void
.end method

.method public final g(Lcom/daaw/mr8;J)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/bs8;->r:Lcom/daaw/mr8;

    iget-object p1, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v0, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p2, v0

    invoke-interface {p1, p0, p2, p3}, Lcom/daaw/nr8;->g(Lcom/daaw/mr8;J)V

    return-void
.end method

.method public final h(JLcom/daaw/aa8;)J
    .locals 3

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v1, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/nr8;->h(JLcom/daaw/aa8;)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/bs8;->q:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final j(J)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v1, p0, Lcom/daaw/bs8;->q:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->j(J)V

    return-void
.end method

.method public final k([Lcom/daaw/tv8;[Z[Lcom/daaw/mt8;[ZJ)J
    .locals 12

    move-object v0, p0

    move-object v1, p3

    array-length v2, v1

    new-array v2, v2, [Lcom/daaw/mt8;

    const/4 v10, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    const/4 v11, 0x0

    if-ge v3, v4, :cond_1

    aget-object v4, v1, v3

    check-cast v4, Lcom/daaw/cs8;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/daaw/cs8;->c()Lcom/daaw/mt8;

    move-result-object v11

    :cond_0
    aput-object v11, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    iget-wide v4, v0, Lcom/daaw/bs8;->q:J

    sub-long v8, p5, v4

    move-object v4, p1

    move-object v5, p2

    move-object v6, v2

    move-object/from16 v7, p4

    invoke-interface/range {v3 .. v9}, Lcom/daaw/nr8;->k([Lcom/daaw/tv8;[Z[Lcom/daaw/mt8;[ZJ)J

    move-result-wide v3

    :goto_1
    array-length v5, v1

    if-ge v10, v5, :cond_5

    aget-object v5, v2, v10

    if-nez v5, :cond_2

    aput-object v11, v1, v10

    goto :goto_2

    :cond_2
    aget-object v6, v1, v10

    if-eqz v6, :cond_3

    check-cast v6, Lcom/daaw/cs8;

    invoke-virtual {v6}, Lcom/daaw/cs8;->c()Lcom/daaw/mt8;

    move-result-object v6

    if-eq v6, v5, :cond_4

    :cond_3
    new-instance v6, Lcom/daaw/cs8;

    iget-wide v7, v0, Lcom/daaw/bs8;->q:J

    invoke-direct {v6, v5, v7, v8}, Lcom/daaw/cs8;-><init>(Lcom/daaw/mt8;J)V

    aput-object v6, v1, v10

    :cond_4
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    iget-wide v1, v0, Lcom/daaw/bs8;->q:J

    add-long/2addr v3, v1

    return-wide v3
.end method

.method public final zzb()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzb()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/daaw/bs8;->q:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzc()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzc()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/daaw/bs8;->q:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzd()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzd()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/daaw/bs8;->q:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzh()Lcom/daaw/au8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzh()Lcom/daaw/au8;

    move-result-object v0

    return-object v0
.end method

.method public final zzk()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzk()V

    return-void
.end method

.method public final zzp()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bs8;->p:Lcom/daaw/nr8;

    invoke-interface {v0}, Lcom/daaw/nr8;->zzp()Z

    move-result v0

    return v0
.end method
