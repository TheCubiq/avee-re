.class public final Lcom/daaw/br8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nr8;
.implements Lcom/daaw/mr8;


# instance fields
.field public final p:Lcom/daaw/pr8;

.field public final q:J

.field public r:Lcom/daaw/rr8;

.field public s:Lcom/daaw/nr8;

.field public t:Lcom/daaw/mr8;

.field public u:J

.field public final v:Lcom/daaw/nw8;


# direct methods
.method public constructor <init>(Lcom/daaw/pr8;Lcom/daaw/nw8;J[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/br8;->p:Lcom/daaw/pr8;

    iput-object p2, p0, Lcom/daaw/br8;->v:Lcom/daaw/nw8;

    iput-wide p3, p0, Lcom/daaw/br8;->q:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/br8;->u:J

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/vt8;)V
    .locals 1

    check-cast p1, Lcom/daaw/nr8;

    iget-object p1, p0, Lcom/daaw/br8;->t:Lcom/daaw/mr8;

    sget v0, Lcom/daaw/it5;->a:I

    invoke-interface {p1, p0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    return-void
.end method

.method public final b(J)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->b(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(J)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Lcom/daaw/nr8;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/br8;->t:Lcom/daaw/mr8;

    sget v0, Lcom/daaw/it5;->a:I

    invoke-interface {p1, p0}, Lcom/daaw/mr8;->d(Lcom/daaw/nr8;)V

    return-void
.end method

.method public final e(JZ)V
    .locals 1

    iget-object p3, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v0, Lcom/daaw/it5;->a:I

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/daaw/nr8;->e(JZ)V

    return-void
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/br8;->u:J

    return-wide v0
.end method

.method public final g(Lcom/daaw/mr8;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/br8;->t:Lcom/daaw/mr8;

    iget-object p1, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lcom/daaw/br8;->q:J

    invoke-virtual {p0, p2, p3}, Lcom/daaw/br8;->p(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lcom/daaw/nr8;->g(Lcom/daaw/mr8;J)V

    :cond_0
    return-void
.end method

.method public final h(JLcom/daaw/aa8;)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/nr8;->h(JLcom/daaw/aa8;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/br8;->q:J

    return-wide v0
.end method

.method public final j(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2}, Lcom/daaw/nr8;->j(J)V

    return-void
.end method

.method public final k([Lcom/daaw/tv8;[Z[Lcom/daaw/mt8;[ZJ)J
    .locals 15

    move-object v0, p0

    iget-wide v1, v0, Lcom/daaw/br8;->u:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lcom/daaw/br8;->q:J

    cmp-long v7, p5, v5

    if-nez v7, :cond_0

    iput-wide v3, v0, Lcom/daaw/br8;->u:J

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p5

    :goto_0
    iget-object v8, v0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    invoke-interface/range {v8 .. v14}, Lcom/daaw/nr8;->k([Lcom/daaw/tv8;[Z[Lcom/daaw/mt8;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final l(Lcom/daaw/pr8;)V
    .locals 4

    iget-wide v0, p0, Lcom/daaw/br8;->q:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/br8;->p(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/br8;->r:Lcom/daaw/rr8;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/br8;->v:Lcom/daaw/nw8;

    invoke-interface {v2, p1, v3, v0, v1}, Lcom/daaw/rr8;->k(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    iget-object v2, p0, Lcom/daaw/br8;->t:Lcom/daaw/mr8;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lcom/daaw/nr8;->g(Lcom/daaw/mr8;J)V

    :cond_0
    return-void
.end method

.method public final m(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/br8;->u:J

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/br8;->r:Lcom/daaw/rr8;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v0}, Lcom/daaw/rr8;->l(Lcom/daaw/nr8;)V

    :cond_0
    return-void
.end method

.method public final o(Lcom/daaw/rr8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/br8;->r:Lcom/daaw/rr8;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-object p1, p0, Lcom/daaw/br8;->r:Lcom/daaw/rr8;

    return-void
.end method

.method public final p(J)J
    .locals 5

    iget-wide v0, p0, Lcom/daaw/br8;->u:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-wide v0

    :cond_0
    return-wide p1
.end method

.method public final zzb()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0}, Lcom/daaw/nr8;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzc()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0}, Lcom/daaw/nr8;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzd()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0}, Lcom/daaw/nr8;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()Lcom/daaw/au8;
    .locals 2

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0}, Lcom/daaw/nr8;->zzh()Lcom/daaw/au8;

    move-result-object v0

    return-object v0
.end method

.method public final zzk()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/nr8;->zzk()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/br8;->r:Lcom/daaw/rr8;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/rr8;->e()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    throw v0
.end method

.method public final zzp()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/br8;->s:Lcom/daaw/nr8;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/nr8;->zzp()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
