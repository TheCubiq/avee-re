.class public final Lcom/daaw/sp2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/wv2;

.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:[Lcom/daaw/iw2;

.field public final e:[Z

.field public final f:J

.field public g:I

.field public h:J

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Lcom/daaw/sp2;

.field public m:Lcom/daaw/gx2;

.field public final n:[Lcom/daaw/gq2;

.field public final o:[Lcom/daaw/hq2;

.field public final p:Lcom/daaw/fx2;

.field public final q:Lcom/daaw/yv2;

.field public r:Lcom/daaw/gx2;

.field public final s:Lcom/daaw/y34;


# direct methods
.method public constructor <init>([Lcom/daaw/gq2;[Lcom/daaw/hq2;JLcom/daaw/fx2;Lcom/daaw/y34;Lcom/daaw/yv2;Ljava/lang/Object;IIZJ[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sp2;->n:[Lcom/daaw/gq2;

    iput-object p2, p0, Lcom/daaw/sp2;->o:[Lcom/daaw/hq2;

    iput-wide p3, p0, Lcom/daaw/sp2;->f:J

    iput-object p5, p0, Lcom/daaw/sp2;->p:Lcom/daaw/fx2;

    iput-object p6, p0, Lcom/daaw/sp2;->s:Lcom/daaw/y34;

    iput-object p7, p0, Lcom/daaw/sp2;->q:Lcom/daaw/yv2;

    invoke-static {p8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p8, p0, Lcom/daaw/sp2;->b:Ljava/lang/Object;

    iput p9, p0, Lcom/daaw/sp2;->c:I

    iput p10, p0, Lcom/daaw/sp2;->g:I

    iput-boolean p11, p0, Lcom/daaw/sp2;->i:Z

    iput-wide p12, p0, Lcom/daaw/sp2;->h:J

    const/4 p1, 0x2

    new-array p2, p1, [Lcom/daaw/iw2;

    iput-object p2, p0, Lcom/daaw/sp2;->d:[Lcom/daaw/iw2;

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/sp2;->e:[Z

    invoke-virtual {p6}, Lcom/daaw/y34;->l()Lcom/daaw/nx2;

    move-result-object p1

    invoke-interface {p7, p10, p1}, Lcom/daaw/yv2;->c(ILcom/daaw/nx2;)Lcom/daaw/wv2;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sp2;->a:Lcom/daaw/wv2;

    return-void
.end method


# virtual methods
.method public final a(JZ)J
    .locals 1

    const/4 p3, 0x2

    new-array p3, p3, [Z

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/daaw/sp2;->b(JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(JZ[Z)J
    .locals 13

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/sp2;->m:Lcom/daaw/gx2;

    iget-object v1, v1, Lcom/daaw/gx2;->b:Lcom/daaw/dx2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/daaw/sp2;->e:[Z

    if-nez p3, :cond_0

    iget-object v6, v0, Lcom/daaw/sp2;->m:Lcom/daaw/gx2;

    iget-object v7, v0, Lcom/daaw/sp2;->r:Lcom/daaw/gx2;

    invoke-virtual {v6, v7, v3}, Lcom/daaw/gx2;->a(Lcom/daaw/gx2;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v6, v0, Lcom/daaw/sp2;->a:Lcom/daaw/wv2;

    invoke-virtual {v1}, Lcom/daaw/dx2;->b()[Lcom/daaw/vw2;

    move-result-object v7

    iget-object v8, v0, Lcom/daaw/sp2;->e:[Z

    iget-object v9, v0, Lcom/daaw/sp2;->d:[Lcom/daaw/iw2;

    move-object/from16 v10, p4

    move-wide v11, p1

    invoke-interface/range {v6 .. v12}, Lcom/daaw/wv2;->g([Lcom/daaw/vw2;[Z[Lcom/daaw/iw2;[ZJ)J

    move-result-wide v6

    iget-object v3, v0, Lcom/daaw/sp2;->m:Lcom/daaw/gx2;

    iput-object v3, v0, Lcom/daaw/sp2;->r:Lcom/daaw/gx2;

    iput-boolean v2, v0, Lcom/daaw/sp2;->k:Z

    const/4 v3, 0x0

    :goto_2
    iget-object v8, v0, Lcom/daaw/sp2;->d:[Lcom/daaw/iw2;

    if-ge v3, v4, :cond_5

    aget-object v8, v8, v3

    if-eqz v8, :cond_3

    invoke-virtual {v1, v3}, Lcom/daaw/dx2;->a(I)Lcom/daaw/vw2;

    move-result-object v8

    if-eqz v8, :cond_2

    const/4 v8, 0x1

    goto :goto_3

    :cond_2
    const/4 v8, 0x0

    :goto_3
    invoke-static {v8}, Lcom/daaw/az2;->e(Z)V

    iput-boolean v5, v0, Lcom/daaw/sp2;->k:Z

    goto :goto_5

    :cond_3
    invoke-virtual {v1, v3}, Lcom/daaw/dx2;->a(I)Lcom/daaw/vw2;

    move-result-object v8

    if-nez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    :goto_4
    invoke-static {v8}, Lcom/daaw/az2;->e(Z)V

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    iget-object v2, v0, Lcom/daaw/sp2;->s:Lcom/daaw/y34;

    iget-object v3, v0, Lcom/daaw/sp2;->n:[Lcom/daaw/gq2;

    iget-object v4, v0, Lcom/daaw/sp2;->m:Lcom/daaw/gx2;

    iget-object v4, v4, Lcom/daaw/gx2;->a:Lcom/daaw/rw2;

    invoke-virtual {v2, v3, v4, v1}, Lcom/daaw/y34;->d([Lcom/daaw/gq2;Lcom/daaw/rw2;Lcom/daaw/dx2;)V

    return-wide v6
.end method

.method public final c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sp2;->q:Lcom/daaw/yv2;

    iget-object v1, p0, Lcom/daaw/sp2;->a:Lcom/daaw/wv2;

    invoke-interface {v0, v1}, Lcom/daaw/yv2;->a(Lcom/daaw/wv2;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final d()Z
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/sp2;->j:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/sp2;->k:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/sp2;->a:Lcom/daaw/wv2;

    invoke-interface {v0}, Lcom/daaw/wv2;->zzg()J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final e()Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/sp2;->p:Lcom/daaw/fx2;

    iget-object v1, p0, Lcom/daaw/sp2;->o:[Lcom/daaw/hq2;

    iget-object v2, p0, Lcom/daaw/sp2;->a:Lcom/daaw/wv2;

    invoke-interface {v2}, Lcom/daaw/wv2;->zzn()Lcom/daaw/rw2;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/fx2;->a([Lcom/daaw/hq2;Lcom/daaw/rw2;)Lcom/daaw/gx2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/sp2;->r:Lcom/daaw/gx2;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    invoke-virtual {v0, v1, v3}, Lcom/daaw/gx2;->a(Lcom/daaw/gx2;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_1
    iput-object v0, p0, Lcom/daaw/sp2;->m:Lcom/daaw/gx2;

    const/4 v0, 0x1

    return v0
.end method
