.class public abstract Lcom/daaw/nk7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i98;
.implements Lcom/daaw/l98;


# instance fields
.field public A:Z

.field public final p:I

.field public final q:Lcom/daaw/a78;

.field public r:Lcom/daaw/x98;

.field public s:I

.field public t:Lcom/daaw/lh8;

.field public u:I

.field public v:Lcom/daaw/mt8;

.field public w:[Lcom/daaw/f92;

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/nk7;->p:I

    new-instance p1, Lcom/daaw/a78;

    invoke-direct {p1}, Lcom/daaw/a78;-><init>()V

    iput-object p1, p0, Lcom/daaw/nk7;->q:Lcom/daaw/a78;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/daaw/nk7;->y:J

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    return-void
.end method

.method public B()V
    .locals 0

    return-void
.end method

.method public C()V
    .locals 0

    return-void
.end method

.method public abstract D([Lcom/daaw/f92;JJ)V
.end method

.method public final b(J)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/nk7;->q(JZ)V

    return-void
.end method

.method public final d()V
    .locals 3

    iget v0, p0, Lcom/daaw/nk7;->u:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput v1, p0, Lcom/daaw/nk7;->u:I

    invoke-virtual {p0}, Lcom/daaw/nk7;->C()V

    return-void
.end method

.method public synthetic e(FF)V
    .locals 0

    return-void
.end method

.method public final f([Lcom/daaw/f92;Lcom/daaw/mt8;JJ)V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/nk7;->z:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-object p2, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    iget-wide v0, p0, Lcom/daaw/nk7;->y:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Lcom/daaw/nk7;->y:J

    :cond_0
    iput-object p1, p0, Lcom/daaw/nk7;->w:[Lcom/daaw/f92;

    iput-wide p5, p0, Lcom/daaw/nk7;->x:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/nk7;->D([Lcom/daaw/f92;JJ)V

    return-void
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/nk7;->z:Z

    return v0
.end method

.method public h(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final j()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/nk7;->y:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k(ILcom/daaw/lh8;)V
    .locals 0

    iput p1, p0, Lcom/daaw/nk7;->s:I

    iput-object p2, p0, Lcom/daaw/nk7;->t:Lcom/daaw/lh8;

    return-void
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/daaw/nk7;->u:I

    return v0
.end method

.method public final n(Lcom/daaw/x98;[Lcom/daaw/f92;Lcom/daaw/mt8;JZZJJ)V
    .locals 9

    move-object v7, p0

    move v8, p6

    iget v0, v7, Lcom/daaw/nk7;->u:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    move-object v0, p1

    iput-object v0, v7, Lcom/daaw/nk7;->r:Lcom/daaw/x98;

    iput v1, v7, Lcom/daaw/nk7;->u:I

    move/from16 v0, p7

    invoke-virtual {p0, p6, v0}, Lcom/daaw/nk7;->y(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/nk7;->f([Lcom/daaw/f92;Lcom/daaw/mt8;JJ)V

    move-wide v0, p4

    invoke-virtual {p0, p4, p5, p6}, Lcom/daaw/nk7;->q(JZ)V

    return-void
.end method

.method public final o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/nk7;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/nk7;->z:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/daaw/mt8;->zze()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final p()[Lcom/daaw/f92;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk7;->w:[Lcom/daaw/f92;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final q(JZ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/nk7;->z:Z

    iput-wide p1, p0, Lcom/daaw/nk7;->y:J

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/nk7;->z(JZ)V

    return-void
.end method

.method public final r(Lcom/daaw/a78;Lcom/daaw/ma7;I)I
    .locals 6

    iget-object v0, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mt8;->b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, Lcom/daaw/i37;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lcom/daaw/nk7;->y:J

    iget-boolean p1, p0, Lcom/daaw/nk7;->z:Z

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, -0x3

    return p1

    :cond_1
    iget-wide v0, p2, Lcom/daaw/ma7;->e:J

    iget-wide v2, p0, Lcom/daaw/nk7;->x:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lcom/daaw/ma7;->e:J

    iget-wide p1, p0, Lcom/daaw/nk7;->y:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/nk7;->y:J

    goto :goto_0

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object v0, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v0, Lcom/daaw/f92;->p:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object p3

    iget-wide v3, p0, Lcom/daaw/nk7;->x:J

    add-long/2addr v1, v3

    invoke-virtual {p3, v1, v2}, Lcom/daaw/b72;->w(J)Lcom/daaw/b72;

    invoke-virtual {p3}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p3

    iput-object p3, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    return p2

    :cond_3
    :goto_0
    return p3
.end method

.method public final s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;
    .locals 9

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    iget-boolean v1, p0, Lcom/daaw/nk7;->A:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/nk7;->A:Z

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p0, p2}, Lcom/daaw/l98;->c(Lcom/daaw/f92;)I

    move-result v0
    :try_end_0
    .catch Lcom/daaw/vu7; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit8 v0, v0, 0x7

    iput-boolean v1, p0, Lcom/daaw/nk7;->A:Z

    move v6, v0

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lcom/daaw/nk7;->A:Z

    throw p1

    :catch_0
    iput-boolean v1, p0, Lcom/daaw/nk7;->A:Z

    :cond_0
    const/4 v6, 0x4

    :goto_0
    invoke-interface {p0}, Lcom/daaw/i98;->a()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lcom/daaw/nk7;->s:I

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v2 .. v8}, Lcom/daaw/vu7;->b(Ljava/lang/Throwable;Ljava/lang/String;ILcom/daaw/f92;IZI)Lcom/daaw/vu7;

    move-result-object p1

    return-object p1
.end method

.method public final t(J)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/daaw/nk7;->x:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/mt8;->a(J)I

    move-result p1

    return p1
.end method

.method public final u()Lcom/daaw/a78;
    .locals 2

    iget-object v0, p0, Lcom/daaw/nk7;->q:Lcom/daaw/a78;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/a78;->b:Lcom/daaw/xn8;

    iput-object v1, v0, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    return-object v0
.end method

.method public final v()Lcom/daaw/x98;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk7;->r:Lcom/daaw/x98;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final w()Lcom/daaw/lh8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk7;->t:Lcom/daaw/lh8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public abstract x()V
.end method

.method public y(ZZ)V
    .locals 0

    return-void
.end method

.method public abstract z(JZ)V
.end method

.method public final zzA()V
    .locals 2

    iget v0, p0, Lcom/daaw/nk7;->u:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/nk7;->q:Lcom/daaw/a78;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/a78;->b:Lcom/daaw/xn8;

    iput-object v1, v0, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-virtual {p0}, Lcom/daaw/nk7;->A()V

    return-void
.end method

.method public final zzC()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/nk7;->z:Z

    return-void
.end method

.method public final zzE()V
    .locals 2

    iget v0, p0, Lcom/daaw/nk7;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/nk7;->u:I

    invoke-virtual {p0}, Lcom/daaw/nk7;->B()V

    return-void
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/daaw/nk7;->p:I

    return v0
.end method

.method public zze()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzf()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/nk7;->y:J

    return-wide v0
.end method

.method public zzi()Lcom/daaw/g78;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzj()Lcom/daaw/l98;
    .locals 0

    return-object p0
.end method

.method public final zzm()Lcom/daaw/mt8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    return-object v0
.end method

.method public final zzn()V
    .locals 3

    iget v0, p0, Lcom/daaw/nk7;->u:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/nk7;->q:Lcom/daaw/a78;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/a78;->b:Lcom/daaw/xn8;

    iput-object v1, v0, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    iput v2, p0, Lcom/daaw/nk7;->u:I

    iput-object v1, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    iput-object v1, p0, Lcom/daaw/nk7;->w:[Lcom/daaw/f92;

    iput-boolean v2, p0, Lcom/daaw/nk7;->z:Z

    invoke-virtual {p0}, Lcom/daaw/nk7;->x()V

    return-void
.end method

.method public final zzr()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk7;->v:Lcom/daaw/mt8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/daaw/mt8;->zzd()V

    return-void
.end method
