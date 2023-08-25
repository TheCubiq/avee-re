.class public final Lcom/daaw/ro0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/qo0;

.field public final b:Ljava/lang/Object;

.field public final c:[Lcom/daaw/d81;

.field public final d:[Z

.field public e:J

.field public f:Z

.field public g:Z

.field public h:Lcom/daaw/so0;

.field public i:Lcom/daaw/ro0;

.field public j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public k:Lcom/daaw/xm1;

.field public final l:[Lcom/daaw/b41;

.field public final m:Lcom/daaw/wm1;

.field public final n:Lcom/daaw/bp0;

.field public o:Lcom/daaw/xm1;


# direct methods
.method public constructor <init>([Lcom/daaw/b41;JLcom/daaw/wm1;Lcom/daaw/l2;Lcom/daaw/bp0;Ljava/lang/Object;Lcom/daaw/so0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    iget-wide v0, p8, Lcom/daaw/so0;->b:J

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/ro0;->e:J

    iput-object p4, p0, Lcom/daaw/ro0;->m:Lcom/daaw/wm1;

    iput-object p6, p0, Lcom/daaw/ro0;->n:Lcom/daaw/bp0;

    invoke-static {p7}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    iput-object p8, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    array-length p2, p1

    new-array p2, p2, [Lcom/daaw/d81;

    iput-object p2, p0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/ro0;->d:[Z

    iget-object p1, p8, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-interface {p6, p1, p5}, Lcom/daaw/bp0;->g(Lcom/daaw/bp0$a;Lcom/daaw/l2;)Lcom/daaw/qo0;

    move-result-object p3

    iget-wide p7, p8, Lcom/daaw/so0;->c:J

    const-wide/high16 p1, -0x8000000000000000L

    cmp-long p4, p7, p1

    if-eqz p4, :cond_0

    new-instance p1, Lcom/daaw/yf;

    const/4 p4, 0x1

    const-wide/16 p5, 0x0

    move-object p2, p1

    invoke-direct/range {p2 .. p8}, Lcom/daaw/yf;-><init>(Lcom/daaw/qo0;ZJJ)V

    move-object p3, p1

    :cond_0
    iput-object p3, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    return-void
.end method


# virtual methods
.method public a(JZ)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    array-length v0, v0

    new-array v0, v0, [Z

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/ro0;->b(JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JZ[Z)J
    .locals 13

    move-object v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget v4, v3, Lcom/daaw/xm1;->a:I

    const/4 v5, 0x1

    if-ge v2, v4, :cond_1

    iget-object v4, v0, Lcom/daaw/ro0;->d:[Z

    if-nez p3, :cond_0

    iget-object v6, v0, Lcom/daaw/ro0;->o:Lcom/daaw/xm1;

    invoke-virtual {v3, v6, v2}, Lcom/daaw/xm1;->b(Lcom/daaw/xm1;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    invoke-virtual {p0, v2}, Lcom/daaw/ro0;->f([Lcom/daaw/d81;)V

    iget-object v2, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {p0, v2}, Lcom/daaw/ro0;->r(Lcom/daaw/xm1;)V

    iget-object v2, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget-object v2, v2, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    iget-object v6, v0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-virtual {v2}, Lcom/daaw/um1;->b()[Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v7

    iget-object v8, v0, Lcom/daaw/ro0;->d:[Z

    iget-object v9, v0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    move-object/from16 v10, p4

    move-wide v11, p1

    invoke-interface/range {v6 .. v12}, Lcom/daaw/qo0;->i([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJ)J

    move-result-wide v3

    iget-object v6, v0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    invoke-virtual {p0, v6}, Lcom/daaw/ro0;->c([Lcom/daaw/d81;)V

    iput-boolean v1, v0, Lcom/daaw/ro0;->g:Z

    const/4 v6, 0x0

    :goto_2
    iget-object v7, v0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    array-length v8, v7

    if-ge v6, v8, :cond_5

    aget-object v7, v7, v6

    if-eqz v7, :cond_2

    iget-object v7, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v7, v6}, Lcom/daaw/xm1;->c(I)Z

    move-result v7

    invoke-static {v7}, Lcom/daaw/s6;->f(Z)V

    iget-object v7, v0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    aget-object v7, v7, v6

    invoke-interface {v7}, Lcom/daaw/b41;->i()I

    move-result v7

    const/4 v8, 0x5

    if-eq v7, v8, :cond_4

    iput-boolean v5, v0, Lcom/daaw/ro0;->g:Z

    goto :goto_4

    :cond_2
    invoke-virtual {v2, v6}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v7

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    invoke-static {v7}, Lcom/daaw/s6;->f(Z)V

    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-wide v3
.end method

.method public final c([Lcom/daaw/d81;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/b41;->i()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v1, v0}, Lcom/daaw/xm1;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/sw;

    invoke-direct {v1}, Lcom/daaw/sw;-><init>()V

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public d(J)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ro0;->p(J)J

    move-result-wide p1

    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0, p1, p2}, Lcom/daaw/qo0;->c(J)Z

    return-void
.end method

.method public final e(Lcom/daaw/xm1;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p1, Lcom/daaw/xm1;->a:I

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/xm1;->c(I)Z

    move-result v1

    iget-object v2, p1, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v2, v0}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->g()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f([Lcom/daaw/d81;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/b41;->i()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g(Lcom/daaw/xm1;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p1, Lcom/daaw/xm1;->a:I

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/xm1;->c(I)Z

    move-result v1

    iget-object v2, p1, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v2, v0}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->e()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public h(Z)J
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/ro0;->f:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, p1, Lcom/daaw/so0;->b:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0}, Lcom/daaw/qo0;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, p1, Lcom/daaw/so0;->e:J

    :cond_1
    return-wide v0
.end method

.method public i()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ro0;->f:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0}, Lcom/daaw/qo0;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ro0;->e:J

    return-wide v0
.end method

.method public k(F)V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ro0;->f:Z

    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0}, Lcom/daaw/qo0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {p0, p1}, Lcom/daaw/ro0;->o(F)Z

    iget-object p1, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, p1, Lcom/daaw/so0;->b:J

    const/4 p1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/ro0;->a(JZ)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/ro0;->e:J

    iget-object p1, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v4, p1, Lcom/daaw/so0;->b:J

    sub-long/2addr v4, v0

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/ro0;->e:J

    invoke-virtual {p1, v0, v1}, Lcom/daaw/so0;->b(J)Lcom/daaw/so0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    return-void
.end method

.method public l()Z
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/ro0;->f:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/ro0;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0}, Lcom/daaw/qo0;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(J)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ro0;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ro0;->p(J)J

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/qo0;->g(J)V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/ro0;->r(Lcom/daaw/xm1;)V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, v0, Lcom/daaw/so0;->c:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/daaw/ro0;->n:Lcom/daaw/bp0;

    iget-object v1, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    check-cast v1, Lcom/daaw/yf;

    iget-object v1, v1, Lcom/daaw/yf;->p:Lcom/daaw/qo0;

    :goto_0
    invoke-interface {v0, v1}, Lcom/daaw/bp0;->a(Lcom/daaw/qo0;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ro0;->n:Lcom/daaw/bp0;

    iget-object v1, p0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :goto_1
    return-void
.end method

.method public o(F)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/ro0;->m:Lcom/daaw/wm1;

    iget-object v1, p0, Lcom/daaw/ro0;->l:[Lcom/daaw/b41;

    iget-object v2, p0, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/wm1;->c([Lcom/daaw/b41;Lcom/google/android/exoplayer2/source/TrackGroupArray;)Lcom/daaw/xm1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ro0;->o:Lcom/daaw/xm1;

    invoke-virtual {v0, v1}, Lcom/daaw/xm1;->a(Lcom/daaw/xm1;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iput-object v0, p0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget-object v0, v0, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v0}, Lcom/daaw/um1;->b()[Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    invoke-interface {v3, p1}, Lcom/google/android/exoplayer2/trackselection/c;->m(F)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public p(J)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ro0;->j()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public q(J)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ro0;->j()J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final r(Lcom/daaw/xm1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ro0;->o:Lcom/daaw/xm1;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/ro0;->e(Lcom/daaw/xm1;)V

    :cond_0
    iput-object p1, p0, Lcom/daaw/ro0;->o:Lcom/daaw/xm1;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/ro0;->g(Lcom/daaw/xm1;)V

    :cond_1
    return-void
.end method
