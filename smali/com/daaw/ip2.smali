.class public abstract Lcom/daaw/ip2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gq2;
.implements Lcom/daaw/hq2;


# instance fields
.field public final a:I

.field public b:Lcom/daaw/iq2;

.field public c:I

.field public d:I

.field public e:Lcom/daaw/iw2;

.field public f:J

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ip2;->a:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ip2;->g:Z

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ip2;->g:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/ip2;->h:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    invoke-interface {v0}, Lcom/daaw/iw2;->zze()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final e()V
    .locals 2

    iget v0, p0, Lcom/daaw/ip2;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/az2;->e(Z)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/ip2;->d:I

    invoke-virtual {p0}, Lcom/daaw/ip2;->t()V

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ip2;->c:I

    return-void
.end method

.method public final g(J)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ip2;->h:Z

    iput-boolean v0, p0, Lcom/daaw/ip2;->g:Z

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/ip2;->s(JZ)V

    return-void
.end method

.method public final i([Lcom/google/android/gms/internal/ads/zzatd;Lcom/daaw/iw2;J)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ip2;->h:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    iput-object p2, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/daaw/ip2;->g:Z

    iput-wide p3, p0, Lcom/daaw/ip2;->f:J

    invoke-virtual {p0, p1, p3, p4}, Lcom/daaw/ip2;->v([Lcom/google/android/gms/internal/ads/zzatd;J)V

    return-void
.end method

.method public final j(Lcom/daaw/iq2;[Lcom/google/android/gms/internal/ads/zzatd;Lcom/daaw/iw2;JZJ)V
    .locals 2

    iget v0, p0, Lcom/daaw/ip2;->d:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    iput-object p1, p0, Lcom/daaw/ip2;->b:Lcom/daaw/iq2;

    iput v1, p0, Lcom/daaw/ip2;->d:I

    invoke-virtual {p0, p6}, Lcom/daaw/ip2;->r(Z)V

    invoke-virtual {p0, p2, p3, p7, p8}, Lcom/daaw/ip2;->i([Lcom/google/android/gms/internal/ads/zzatd;Lcom/daaw/iw2;J)V

    invoke-virtual {p0, p4, p5, p6}, Lcom/daaw/ip2;->s(JZ)V

    return-void
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lcom/daaw/ip2;->c:I

    return v0
.end method

.method public final m(Lcom/daaw/cq2;Lcom/daaw/bs2;Z)I
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    move/from16 v4, p3

    invoke-interface {v3, v1, v2, v4}, Lcom/daaw/iw2;->b(Lcom/daaw/cq2;Lcom/daaw/bs2;Z)I

    move-result v3

    const/4 v4, -0x4

    if-ne v3, v4, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/wr2;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/ip2;->g:Z

    iget-boolean v1, v0, Lcom/daaw/ip2;->h:Z

    if-eqz v1, :cond_0

    return v4

    :cond_0
    const/4 v1, -0x3

    return v1

    :cond_1
    iget-wide v4, v2, Lcom/daaw/bs2;->d:J

    iget-wide v6, v0, Lcom/daaw/ip2;->f:J

    add-long/2addr v4, v6

    iput-wide v4, v2, Lcom/daaw/bs2;->d:J

    goto/16 :goto_0

    :cond_2
    const/4 v2, -0x5

    if-ne v3, v2, :cond_3

    iget-object v4, v1, Lcom/daaw/cq2;->a:Lcom/google/android/gms/internal/ads/zzatd;

    iget-wide v5, v4, Lcom/google/android/gms/internal/ads/zzatd;->L:J

    const-wide v7, 0x7fffffffffffffffL

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    iget-wide v7, v0, Lcom/daaw/ip2;->f:J

    new-instance v3, Lcom/google/android/gms/internal/ads/zzatd;

    move-object v9, v3

    iget-object v10, v4, Lcom/google/android/gms/internal/ads/zzatd;->p:Ljava/lang/String;

    iget-object v11, v4, Lcom/google/android/gms/internal/ads/zzatd;->t:Ljava/lang/String;

    iget-object v12, v4, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    iget-object v13, v4, Lcom/google/android/gms/internal/ads/zzatd;->r:Ljava/lang/String;

    iget v14, v4, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    iget v15, v4, Lcom/google/android/gms/internal/ads/zzatd;->v:I

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    move/from16 v16, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    move/from16 v17, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->A:F

    move/from16 v18, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->B:I

    move/from16 v19, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->C:F

    move/from16 v20, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->E:[B

    move-object/from16 v21, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->D:I

    move/from16 v22, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->F:Lcom/google/android/gms/internal/ads/zzbbb;

    move-object/from16 v23, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->G:I

    move/from16 v24, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->H:I

    move/from16 v25, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->I:I

    move/from16 v26, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->J:I

    move/from16 v27, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->K:I

    move/from16 v28, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->M:I

    move/from16 v29, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->N:Ljava/lang/String;

    move-object/from16 v30, v2

    iget v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->O:I

    move/from16 v31, v2

    add-long v32, v5, v7

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->w:Ljava/util/List;

    move-object/from16 v34, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->x:Lcom/google/android/gms/internal/ads/zzavc;

    move-object/from16 v35, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzatd;->s:Lcom/google/android/gms/internal/ads/zzaxo;

    move-object/from16 v36, v2

    invoke-direct/range {v9 .. v36}, Lcom/google/android/gms/internal/ads/zzatd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFIF[BILcom/google/android/gms/internal/ads/zzbbb;IIIIIILjava/lang/String;IJLjava/util/List;Lcom/google/android/gms/internal/ads/zzavc;Lcom/google/android/gms/internal/ads/zzaxo;)V

    iput-object v3, v1, Lcom/daaw/cq2;->a:Lcom/google/android/gms/internal/ads/zzatd;

    const/4 v1, -0x5

    return v1

    :cond_3
    :goto_0
    return v3
.end method

.method public final p()Lcom/daaw/iq2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ip2;->b:Lcom/daaw/iq2;

    return-object v0
.end method

.method public abstract q()V
.end method

.method public abstract r(Z)V
.end method

.method public abstract s(JZ)V
.end method

.method public abstract t()V
.end method

.method public abstract u()V
.end method

.method public v([Lcom/google/android/gms/internal/ads/zzatd;J)V
    .locals 0

    return-void
.end method

.method public final w(J)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    iget-wide v1, p0, Lcom/daaw/ip2;->f:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/iw2;->a(J)V

    return-void
.end method

.method public final zzA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ip2;->g:Z

    return v0
.end method

.method public final zzB()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ip2;->h:Z

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/daaw/ip2;->d:I

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/daaw/ip2;->a:I

    return v0
.end method

.method public final zzf()Lcom/daaw/hq2;
    .locals 0

    return-object p0
.end method

.method public final zzh()Lcom/daaw/iw2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    return-object v0
.end method

.method public zzi()Lcom/daaw/ez2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzj()V
    .locals 3

    iget v0, p0, Lcom/daaw/ip2;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/az2;->e(Z)V

    iput v2, p0, Lcom/daaw/ip2;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    iput-boolean v2, p0, Lcom/daaw/ip2;->h:Z

    invoke-virtual {p0}, Lcom/daaw/ip2;->q()V

    return-void
.end method

.method public final zzm()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ip2;->e:Lcom/daaw/iw2;

    invoke-interface {v0}, Lcom/daaw/iw2;->zzc()V

    return-void
.end method

.method public final zzv()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ip2;->h:Z

    return-void
.end method

.method public final zzz()V
    .locals 3

    iget v0, p0, Lcom/daaw/ip2;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    iput v1, p0, Lcom/daaw/ip2;->d:I

    invoke-virtual {p0}, Lcom/daaw/ip2;->u()V

    return-void
.end method
