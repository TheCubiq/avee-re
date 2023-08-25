.class public final Lcom/daaw/sv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv2;
.implements Lcom/daaw/os2;
.implements Lcom/daaw/uy2;
.implements Lcom/daaw/gw2;


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public final B:Landroid/os/Handler;

.field public final C:Landroid/util/SparseArray;

.field public D:Lcom/daaw/vv2;

.field public E:Lcom/daaw/us2;

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:I

.field public K:Lcom/daaw/rw2;

.field public L:J

.field public M:[Z

.field public N:[Z

.field public O:Z

.field public P:J

.field public Q:J

.field public R:J

.field public S:I

.field public T:Z

.field public U:Z

.field public final V:Lcom/daaw/nx2;

.field public final p:Landroid/net/Uri;

.field public final q:Lcom/daaw/kx2;

.field public final r:I

.field public final s:Landroid/os/Handler;

.field public final t:Lcom/daaw/tv2;

.field public final u:Lcom/daaw/xv2;

.field public final v:J

.field public final w:Lcom/daaw/yy2;

.field public final x:Lcom/daaw/qv2;

.field public final y:Lcom/daaw/cz2;

.field public final z:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/kx2;[Lcom/daaw/ns2;ILandroid/os/Handler;Lcom/daaw/tv2;Lcom/daaw/xv2;Lcom/daaw/nx2;Ljava/lang/String;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sv2;->p:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/sv2;->q:Lcom/daaw/kx2;

    iput p4, p0, Lcom/daaw/sv2;->r:I

    iput-object p5, p0, Lcom/daaw/sv2;->s:Landroid/os/Handler;

    iput-object p6, p0, Lcom/daaw/sv2;->t:Lcom/daaw/tv2;

    iput-object p7, p0, Lcom/daaw/sv2;->u:Lcom/daaw/xv2;

    iput-object p8, p0, Lcom/daaw/sv2;->V:Lcom/daaw/nx2;

    int-to-long p1, p10

    iput-wide p1, p0, Lcom/daaw/sv2;->v:J

    new-instance p1, Lcom/daaw/yy2;

    const-string p2, "Loader:ExtractorMediaPeriod"

    invoke-direct {p1, p2}, Lcom/daaw/yy2;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    new-instance p1, Lcom/daaw/qv2;

    invoke-direct {p1, p3, p0}, Lcom/daaw/qv2;-><init>([Lcom/daaw/ns2;Lcom/daaw/os2;)V

    iput-object p1, p0, Lcom/daaw/sv2;->x:Lcom/daaw/qv2;

    new-instance p1, Lcom/daaw/cz2;

    invoke-direct {p1}, Lcom/daaw/cz2;-><init>()V

    iput-object p1, p0, Lcom/daaw/sv2;->y:Lcom/daaw/cz2;

    new-instance p1, Lcom/daaw/hv2;

    invoke-direct {p1, p0}, Lcom/daaw/hv2;-><init>(Lcom/daaw/sv2;)V

    iput-object p1, p0, Lcom/daaw/sv2;->z:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/iv2;

    invoke-direct {p1, p0}, Lcom/daaw/iv2;-><init>(Lcom/daaw/sv2;)V

    iput-object p1, p0, Lcom/daaw/sv2;->A:Ljava/lang/Runnable;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/sv2;->R:J

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/daaw/sv2;->P:J

    return-void
.end method

.method public static bridge synthetic C(Lcom/daaw/sv2;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/sv2;->U:Z

    return p0
.end method

.method public static bridge synthetic s(Lcom/daaw/sv2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/sv2;->v:J

    return-wide v0
.end method

.method public static bridge synthetic t(Lcom/daaw/sv2;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic u(Lcom/daaw/sv2;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic v(Lcom/daaw/sv2;)Lcom/daaw/tv2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sv2;->t:Lcom/daaw/tv2;

    return-object p0
.end method

.method public static bridge synthetic w(Lcom/daaw/sv2;)Lcom/daaw/vv2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sv2;->D:Lcom/daaw/vv2;

    return-object p0
.end method

.method public static bridge synthetic x(Lcom/daaw/sv2;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sv2;->A:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic y(Lcom/daaw/sv2;)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/sv2;->U:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/daaw/sv2;->G:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/daaw/sv2;->F:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/hw2;

    invoke-virtual {v3}, Lcom/daaw/hw2;->h()Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v3

    if-eqz v3, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/sv2;->y:Lcom/daaw/cz2;

    invoke-virtual {v2}, Lcom/daaw/cz2;->b()Z

    new-array v2, v0, [Lcom/daaw/mw2;

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/daaw/sv2;->N:[Z

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/daaw/sv2;->M:[Z

    iget-object v3, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    invoke-interface {v3}, Lcom/daaw/us2;->zza()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/daaw/sv2;->L:J

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v0, :cond_4

    iget-object v5, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/hw2;

    invoke-virtual {v5}, Lcom/daaw/hw2;->h()Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v5

    new-instance v6, Lcom/daaw/mw2;

    new-array v7, v4, [Lcom/google/android/gms/internal/ads/zzatd;

    aput-object v5, v7, v1

    invoke-direct {v6, v7}, Lcom/daaw/mw2;-><init>([Lcom/google/android/gms/internal/ads/zzatd;)V

    aput-object v6, v2, v3

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    invoke-static {v5}, Lcom/daaw/fz2;->b(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {v5}, Lcom/daaw/fz2;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :cond_3
    :goto_2
    iget-object v5, p0, Lcom/daaw/sv2;->N:[Z

    aput-boolean v4, v5, v3

    iget-boolean v5, p0, Lcom/daaw/sv2;->O:Z

    or-int/2addr v4, v5

    iput-boolean v4, p0, Lcom/daaw/sv2;->O:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/daaw/rw2;

    invoke-direct {v0, v2}, Lcom/daaw/rw2;-><init>([Lcom/daaw/mw2;)V

    iput-object v0, p0, Lcom/daaw/sv2;->K:Lcom/daaw/rw2;

    iput-boolean v4, p0, Lcom/daaw/sv2;->G:Z

    iget-object v0, p0, Lcom/daaw/sv2;->u:Lcom/daaw/xv2;

    new-instance v1, Lcom/daaw/lw2;

    iget-wide v2, p0, Lcom/daaw/sv2;->L:J

    iget-object v4, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    invoke-interface {v4}, Lcom/daaw/us2;->zzc()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/lw2;-><init>(JZ)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/xv2;->d(Lcom/daaw/mq2;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/sv2;->D:Lcom/daaw/vv2;

    invoke-interface {v0, p0}, Lcom/daaw/vv2;->h(Lcom/daaw/wv2;)V

    :cond_5
    :goto_3
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sv2;->x:Lcom/daaw/qv2;

    iget-object v1, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    new-instance v2, Lcom/daaw/nv2;

    invoke-direct {v2, p0, v0}, Lcom/daaw/nv2;-><init>(Lcom/daaw/sv2;Lcom/daaw/qv2;)V

    invoke-virtual {v1, v2}, Lcom/daaw/yy2;->h(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sv2;->U:Z

    return-void
.end method

.method public final B(IJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/hw2;

    iget-boolean v0, p0, Lcom/daaw/sv2;->T:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/hw2;->g()J

    move-result-wide v0

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/hw2;->l()V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Lcom/daaw/hw2;->n(JZ)Z

    return-void
.end method

.method public final a(J)Z
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/sv2;->T:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/sv2;->G:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/sv2;->J:I

    if-eqz p1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/sv2;->y:Lcom/daaw/cz2;

    invoke-virtual {p1}, Lcom/daaw/cz2;->c()Z

    move-result p1

    iget-object p2, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    invoke-virtual {p2}, Lcom/daaw/yy2;->i()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sv2;->p()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/us2;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    iget-object p1, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/sv2;->z:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(J)V
    .locals 0

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/sv2;->z:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final e(J)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    invoke-interface {v0}, Lcom/daaw/us2;->zzc()Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    iput-wide p1, p0, Lcom/daaw/sv2;->Q:J

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/sv2;->q()Z

    move-result v2

    xor-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-ge v3, v0, :cond_4

    iget-object v4, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_1

    iget-object v1, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/hw2;

    invoke-virtual {v1, p1, p2, v2}, Lcom/daaw/hw2;->n(JZ)Z

    move-result v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-wide p1, p0, Lcom/daaw/sv2;->R:J

    iput-boolean v2, p0, Lcom/daaw/sv2;->T:Z

    iget-object v1, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    invoke-virtual {v1}, Lcom/daaw/yy2;->i()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lcom/daaw/yy2;->f()V

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    iget-object v3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/hw2;

    iget-object v4, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v4, v4, v1

    invoke-virtual {v3, v4}, Lcom/daaw/hw2;->j(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    iput-boolean v2, p0, Lcom/daaw/sv2;->I:Z

    return-wide p1
.end method

.method public final f(Lcom/daaw/vv2;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sv2;->D:Lcom/daaw/vv2;

    iget-object p1, p0, Lcom/daaw/sv2;->y:Lcom/daaw/cz2;

    invoke-virtual {p1}, Lcom/daaw/cz2;->c()Z

    invoke-virtual {p0}, Lcom/daaw/sv2;->p()V

    return-void
.end method

.method public final g([Lcom/daaw/vw2;[Z[Lcom/daaw/iw2;[ZJ)J
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/sv2;->G:Z

    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget-object v2, p3, v1

    if-eqz v2, :cond_1

    aget-object v3, p1, v1

    if-eqz v3, :cond_0

    aget-boolean v3, p2, v1

    if-nez v3, :cond_1

    :cond_0
    check-cast v2, Lcom/daaw/rv2;

    invoke-static {v2}, Lcom/daaw/rv2;->c(Lcom/daaw/rv2;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v3, v3, v2

    invoke-static {v3}, Lcom/daaw/az2;->e(Z)V

    iget v3, p0, Lcom/daaw/sv2;->J:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Lcom/daaw/sv2;->J:I

    iget-object v3, p0, Lcom/daaw/sv2;->M:[Z

    aput-boolean v0, v3, v2

    iget-object v3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/hw2;

    invoke-virtual {v2}, Lcom/daaw/hw2;->i()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    const/4 v1, 0x0

    :goto_1
    array-length v2, p1

    const/4 v3, 0x1

    if-ge p2, v2, :cond_5

    aget-object v2, p3, p2

    if-nez v2, :cond_4

    aget-object v2, p1, p2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/daaw/vw2;->b()I

    invoke-virtual {v2, v0}, Lcom/daaw/vw2;->a(I)I

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Lcom/daaw/az2;->e(Z)V

    iget-object v1, p0, Lcom/daaw/sv2;->K:Lcom/daaw/rw2;

    invoke-virtual {v2}, Lcom/daaw/vw2;->d()Lcom/daaw/mw2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/rw2;->a(Lcom/daaw/mw2;)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v2, v2, v1

    xor-int/2addr v2, v3

    invoke-static {v2}, Lcom/daaw/az2;->e(Z)V

    iget v2, p0, Lcom/daaw/sv2;->J:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/daaw/sv2;->J:I

    iget-object v2, p0, Lcom/daaw/sv2;->M:[Z

    aput-boolean v3, v2, v1

    new-instance v2, Lcom/daaw/rv2;

    invoke-direct {v2, p0, v1}, Lcom/daaw/rv2;-><init>(Lcom/daaw/sv2;I)V

    aput-object v2, p3, p2

    aput-boolean v3, p4, p2

    const/4 v1, 0x1

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    iget-boolean p1, p0, Lcom/daaw/sv2;->H:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_3
    if-ge p2, p1, :cond_7

    iget-object v2, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v2, v2, p2

    if-nez v2, :cond_6

    iget-object v2, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/hw2;

    invoke-virtual {v2}, Lcom/daaw/hw2;->i()V

    :cond_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_7
    iget p1, p0, Lcom/daaw/sv2;->J:I

    const-wide/16 v4, 0x0

    if-nez p1, :cond_8

    iput-boolean v0, p0, Lcom/daaw/sv2;->I:Z

    iget-object p1, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    invoke-virtual {p1}, Lcom/daaw/yy2;->i()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p1}, Lcom/daaw/yy2;->f()V

    goto :goto_6

    :cond_8
    iget-boolean p1, p0, Lcom/daaw/sv2;->H:Z

    if-eqz p1, :cond_9

    if-eqz v1, :cond_c

    goto :goto_4

    :cond_9
    cmp-long p1, p5, v4

    if-nez p1, :cond_a

    move-wide p5, v4

    goto :goto_6

    :cond_a
    :goto_4
    invoke-virtual {p0, p5, p6}, Lcom/daaw/sv2;->e(J)J

    move-result-wide p5

    :goto_5
    array-length p1, p3

    if-ge v0, p1, :cond_c

    aget-object p1, p3, v0

    if-eqz p1, :cond_b

    aput-boolean v3, p4, v0

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_c
    :goto_6
    iput-boolean v3, p0, Lcom/daaw/sv2;->H:Z

    return-wide p5
.end method

.method public final h(II)Lcom/daaw/ws2;
    .locals 2

    iget-object p2, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/hw2;

    if-nez p2, :cond_0

    new-instance p2, Lcom/daaw/hw2;

    iget-object v0, p0, Lcom/daaw/sv2;->V:Lcom/daaw/nx2;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lcom/daaw/hw2;-><init>(Lcom/daaw/nx2;[B)V

    invoke-virtual {p2, p0}, Lcom/daaw/hw2;->k(Lcom/daaw/gw2;)V

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object p2
.end method

.method public final bridge synthetic i(Lcom/daaw/wy2;JJLjava/io/IOException;)I
    .locals 5

    check-cast p1, Lcom/daaw/pv2;

    invoke-virtual {p0, p1}, Lcom/daaw/sv2;->o(Lcom/daaw/pv2;)V

    iget-object p2, p0, Lcom/daaw/sv2;->s:Landroid/os/Handler;

    if-eqz p2, :cond_0

    new-instance p3, Lcom/daaw/ov2;

    invoke-direct {p3, p0, p6}, Lcom/daaw/ov2;-><init>(Lcom/daaw/sv2;Ljava/io/IOException;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    instance-of p2, p6, Lcom/daaw/sw2;

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    const/4 p3, 0x3

    goto :goto_4

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/sv2;->m()I

    move-result p2

    iget p4, p0, Lcom/daaw/sv2;->S:I

    iget-wide p5, p0, Lcom/daaw/sv2;->P:J

    const-wide/16 v0, -0x1

    const/4 v2, 0x1

    cmp-long v3, p5, v0

    if-nez v3, :cond_6

    iget-object p5, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    if-eqz p5, :cond_2

    invoke-interface {p5}, Lcom/daaw/us2;->zza()J

    move-result-wide p5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p5, v0

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    const-wide/16 p5, 0x0

    iput-wide p5, p0, Lcom/daaw/sv2;->Q:J

    iget-boolean v0, p0, Lcom/daaw/sv2;->G:Z

    iput-boolean v0, p0, Lcom/daaw/sv2;->I:Z

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    iget-object v3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/hw2;

    iget-boolean v4, p0, Lcom/daaw/sv2;->G:Z

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean v4, v4, v1

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v4, 0x1

    :goto_2
    invoke-virtual {v3, v4}, Lcom/daaw/hw2;->j(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p1, p5, p6, p5, p6}, Lcom/daaw/pv2;->b(JJ)V

    :cond_6
    :goto_3
    invoke-virtual {p0}, Lcom/daaw/sv2;->m()I

    move-result p1

    iput p1, p0, Lcom/daaw/sv2;->S:I

    if-gt p2, p4, :cond_7

    :goto_4
    return p3

    :cond_7
    return v2
.end method

.method public final bridge synthetic j(Lcom/daaw/wy2;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/pv2;

    invoke-virtual {p0, p1}, Lcom/daaw/sv2;->o(Lcom/daaw/pv2;)V

    if-nez p6, :cond_1

    iget p1, p0, Lcom/daaw/sv2;->J:I

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object p3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/hw2;

    iget-object p4, p0, Lcom/daaw/sv2;->M:[Z

    aget-boolean p4, p4, p2

    invoke-virtual {p3, p4}, Lcom/daaw/hw2;->j(Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/sv2;->D:Lcom/daaw/vv2;

    invoke-interface {p1, p0}, Lcom/daaw/jw2;->b(Lcom/daaw/kw2;)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic k(Lcom/daaw/wy2;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/pv2;

    invoke-virtual {p0, p1}, Lcom/daaw/sv2;->o(Lcom/daaw/pv2;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/sv2;->T:Z

    iget-wide p1, p0, Lcom/daaw/sv2;->L:J

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p5, p1, p3

    if-nez p5, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sv2;->n()J

    move-result-wide p1

    const-wide/high16 p3, -0x8000000000000000L

    cmp-long p5, p1, p3

    if-nez p5, :cond_0

    const-wide/16 p1, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x2710

    add-long/2addr p1, p3

    :goto_0
    iput-wide p1, p0, Lcom/daaw/sv2;->L:J

    iget-object p3, p0, Lcom/daaw/sv2;->u:Lcom/daaw/xv2;

    new-instance p4, Lcom/daaw/lw2;

    iget-object p5, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    invoke-interface {p5}, Lcom/daaw/us2;->zzc()Z

    move-result p5

    invoke-direct {p4, p1, p2, p5}, Lcom/daaw/lw2;-><init>(JZ)V

    const/4 p1, 0x0

    invoke-interface {p3, p4, p1}, Lcom/daaw/xv2;->d(Lcom/daaw/mq2;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/sv2;->D:Lcom/daaw/vv2;

    invoke-interface {p1, p0}, Lcom/daaw/jw2;->b(Lcom/daaw/kw2;)V

    return-void
.end method

.method public final l(I)Z
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/sv2;->T:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sv2;->q()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/hw2;

    invoke-virtual {p1}, Lcom/daaw/hw2;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final m()I
    .locals 4

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/hw2;

    invoke-virtual {v3}, Lcom/daaw/hw2;->e()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public final n()J
    .locals 6

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/hw2;

    invoke-virtual {v4}, Lcom/daaw/hw2;->g()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public final o(Lcom/daaw/pv2;)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/sv2;->P:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {p1}, Lcom/daaw/pv2;->a(Lcom/daaw/pv2;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/sv2;->P:J

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 11

    new-instance v6, Lcom/daaw/pv2;

    iget-object v2, p0, Lcom/daaw/sv2;->p:Landroid/net/Uri;

    iget-object v3, p0, Lcom/daaw/sv2;->q:Lcom/daaw/kx2;

    iget-object v4, p0, Lcom/daaw/sv2;->x:Lcom/daaw/qv2;

    iget-object v5, p0, Lcom/daaw/sv2;->y:Lcom/daaw/cz2;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/pv2;-><init>(Lcom/daaw/sv2;Landroid/net/Uri;Lcom/daaw/kx2;Lcom/daaw/qv2;Lcom/daaw/cz2;)V

    iget-boolean v0, p0, Lcom/daaw/sv2;->G:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/sv2;->q()Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/az2;->e(Z)V

    iget-wide v3, p0, Lcom/daaw/sv2;->L:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    iget-wide v7, p0, Lcom/daaw/sv2;->R:J

    cmp-long v0, v7, v3

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sv2;->T:Z

    iput-wide v1, p0, Lcom/daaw/sv2;->R:J

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    iget-wide v3, p0, Lcom/daaw/sv2;->R:J

    invoke-interface {v0, v3, v4}, Lcom/daaw/us2;->a(J)J

    move-result-wide v3

    iget-wide v7, p0, Lcom/daaw/sv2;->R:J

    invoke-virtual {v6, v3, v4, v7, v8}, Lcom/daaw/pv2;->b(JJ)V

    iput-wide v1, p0, Lcom/daaw/sv2;->R:J

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/sv2;->m()I

    move-result v0

    iput v0, p0, Lcom/daaw/sv2;->S:I

    iget v0, p0, Lcom/daaw/sv2;->r:I

    const/4 v3, -0x1

    const/4 v4, 0x6

    const/4 v5, 0x3

    if-ne v0, v3, :cond_5

    iget-boolean v0, p0, Lcom/daaw/sv2;->G:Z

    if-eqz v0, :cond_4

    iget-wide v7, p0, Lcom/daaw/sv2;->P:J

    const-wide/16 v9, -0x1

    cmp-long v0, v7, v9

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/sv2;->E:Lcom/daaw/us2;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/daaw/us2;->zza()J

    move-result-wide v7

    cmp-long v0, v7, v1

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x6

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x3

    :cond_5
    :goto_2
    iget-object v1, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    invoke-virtual {v1, v6, p0, v0}, Lcom/daaw/yy2;->a(Lcom/daaw/wy2;Lcom/daaw/uy2;I)J

    return-void
.end method

.method public final q()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/sv2;->R:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r(ILcom/daaw/cq2;Lcom/daaw/bs2;Z)I
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/sv2;->I:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sv2;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/daaw/hw2;

    iget-boolean v4, p0, Lcom/daaw/sv2;->T:Z

    iget-wide v5, p0, Lcom/daaw/sv2;->Q:J

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/hw2;->f(Lcom/daaw/cq2;Lcom/daaw/bs2;ZZJ)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x3

    return p1
.end method

.method public final z()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Lcom/daaw/yy2;->g(I)V

    return-void
.end method

.method public final zza()J
    .locals 2

    iget v0, p0, Lcom/daaw/sv2;->J:I

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/sv2;->zzg()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sv2;->F:Z

    iget-object v0, p0, Lcom/daaw/sv2;->B:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/sv2;->z:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzg()J
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/sv2;->T:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/sv2;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/sv2;->R:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/sv2;->O:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const-wide v3, 0x7fffffffffffffffL

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_4

    iget-object v6, p0, Lcom/daaw/sv2;->N:[Z

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/daaw/sv2;->C:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/hw2;

    invoke-virtual {v6}, Lcom/daaw/hw2;->g()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/sv2;->n()J

    move-result-wide v3

    :cond_4
    cmp-long v0, v3, v1

    if-nez v0, :cond_5

    iget-wide v0, p0, Lcom/daaw/sv2;->Q:J

    return-wide v0

    :cond_5
    return-wide v3
.end method

.method public final zzh()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/sv2;->I:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sv2;->I:Z

    iget-wide v0, p0, Lcom/daaw/sv2;->Q:J

    return-wide v0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final zzn()Lcom/daaw/rw2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sv2;->K:Lcom/daaw/rw2;

    return-object v0
.end method

.method public final zzs()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sv2;->w:Lcom/daaw/yy2;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Lcom/daaw/yy2;->g(I)V

    return-void
.end method
