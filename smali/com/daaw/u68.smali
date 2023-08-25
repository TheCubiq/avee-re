.class public final Lcom/daaw/u68;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lcom/daaw/mr8;
.implements Lcom/daaw/yv8;
.implements Lcom/daaw/k88;
.implements Lcom/daaw/fr7;
.implements Lcom/daaw/t88;


# instance fields
.field public final A:Lcom/daaw/d34;

.field public final B:J

.field public final C:Lcom/daaw/is7;

.field public final D:Ljava/util/ArrayList;

.field public final E:Lcom/daaw/xp4;

.field public final F:Lcom/daaw/s78;

.field public final G:Lcom/daaw/n88;

.field public final H:J

.field public I:Lcom/daaw/aa8;

.field public J:Lcom/daaw/q88;

.field public K:Lcom/daaw/o68;

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:I

.field public W:Lcom/daaw/r68;

.field public X:J

.field public Y:I

.field public Z:Z

.field public a0:Lcom/daaw/vu7;

.field public b0:J

.field public final c0:Lcom/daaw/x38;

.field public final d0:Lcom/daaw/zo7;

.field public final p:[Lcom/daaw/i98;

.field public final q:Ljava/util/Set;

.field public final r:[Lcom/daaw/l98;

.field public final s:Lcom/daaw/zv8;

.field public final t:Lcom/daaw/fw8;

.field public final u:Lcom/daaw/d78;

.field public final v:Lcom/daaw/mw8;

.field public final w:Lcom/daaw/vz4;

.field public final x:Landroid/os/HandlerThread;

.field public final y:Landroid/os/Looper;

.field public final z:Lcom/daaw/i54;


# direct methods
.method public constructor <init>([Lcom/daaw/i98;Lcom/daaw/zv8;Lcom/daaw/fw8;Lcom/daaw/d78;Lcom/daaw/mw8;IZLcom/daaw/fb8;Lcom/daaw/aa8;Lcom/daaw/zo7;JZLandroid/os/Looper;Lcom/daaw/xp4;Lcom/daaw/x38;Lcom/daaw/lh8;[B)V
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move-object/from16 v5, p15

    move-object/from16 v6, p17

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v7, p16

    iput-object v7, v0, Lcom/daaw/u68;->c0:Lcom/daaw/x38;

    iput-object v1, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    iput-object v2, v0, Lcom/daaw/u68;->s:Lcom/daaw/zv8;

    move-object v7, p3

    iput-object v7, v0, Lcom/daaw/u68;->t:Lcom/daaw/fw8;

    move-object/from16 v8, p4

    iput-object v8, v0, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    iput-object v3, v0, Lcom/daaw/u68;->v:Lcom/daaw/mw8;

    const/4 v9, 0x0

    iput v9, v0, Lcom/daaw/u68;->Q:I

    iput-boolean v9, v0, Lcom/daaw/u68;->R:Z

    move-object/from16 v10, p9

    iput-object v10, v0, Lcom/daaw/u68;->I:Lcom/daaw/aa8;

    move-object/from16 v10, p10

    iput-object v10, v0, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    move-wide/from16 v10, p11

    iput-wide v10, v0, Lcom/daaw/u68;->H:J

    iput-boolean v9, v0, Lcom/daaw/u68;->M:Z

    iput-object v5, v0, Lcom/daaw/u68;->E:Lcom/daaw/xp4;

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v10, v0, Lcom/daaw/u68;->b0:J

    invoke-interface/range {p4 .. p4}, Lcom/daaw/d78;->zza()J

    move-result-wide v10

    iput-wide v10, v0, Lcom/daaw/u68;->B:J

    invoke-interface/range {p4 .. p4}, Lcom/daaw/d78;->zzf()Z

    invoke-static {p3}, Lcom/daaw/q88;->g(Lcom/daaw/fw8;)Lcom/daaw/q88;

    move-result-object v7

    iput-object v7, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    new-instance v8, Lcom/daaw/o68;

    invoke-direct {v8, v7}, Lcom/daaw/o68;-><init>(Lcom/daaw/q88;)V

    iput-object v8, v0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    array-length v7, v1

    const/4 v7, 0x2

    new-array v8, v7, [Lcom/daaw/l98;

    iput-object v8, v0, Lcom/daaw/u68;->r:[Lcom/daaw/l98;

    :goto_0
    if-ge v9, v7, :cond_0

    aget-object v8, v1, v9

    invoke-interface {v8, v9, v6}, Lcom/daaw/i98;->k(ILcom/daaw/lh8;)V

    iget-object v8, v0, Lcom/daaw/u68;->r:[Lcom/daaw/l98;

    aget-object v10, v1, v9

    invoke-interface {v10}, Lcom/daaw/i98;->zzj()Lcom/daaw/l98;

    move-result-object v10

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/is7;

    invoke-direct {v1, p0, v5}, Lcom/daaw/is7;-><init>(Lcom/daaw/fr7;Lcom/daaw/xp4;)V

    iput-object v1, v0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/u68;->q:Ljava/util/Set;

    new-instance v1, Lcom/daaw/i54;

    invoke-direct {v1}, Lcom/daaw/i54;-><init>()V

    iput-object v1, v0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    new-instance v1, Lcom/daaw/d34;

    invoke-direct {v1}, Lcom/daaw/d34;-><init>()V

    iput-object v1, v0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p2, p0, v3}, Lcom/daaw/zv8;->g(Lcom/daaw/yv8;Lcom/daaw/mw8;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/u68;->Z:Z

    new-instance v1, Landroid/os/Handler;

    move-object/from16 v2, p14

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/daaw/s78;

    invoke-direct {v2, v4, v1}, Lcom/daaw/s78;-><init>(Lcom/daaw/fb8;Landroid/os/Handler;)V

    iput-object v2, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    new-instance v2, Lcom/daaw/n88;

    invoke-direct {v2, p0, v4, v1, v6}, Lcom/daaw/n88;-><init>(Lcom/daaw/k88;Lcom/daaw/fb8;Landroid/os/Handler;Lcom/daaw/lh8;)V

    iput-object v2, v0, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    new-instance v1, Landroid/os/HandlerThread;

    const/16 v2, -0x10

    const-string v3, "ExoPlayer:Playback"

    invoke-direct {v1, v3, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lcom/daaw/u68;->x:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/u68;->y:Landroid/os/Looper;

    invoke-interface {v5, v1, p0}, Lcom/daaw/xp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/vz4;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    return-void
.end method

.method public static G(Lcom/daaw/i98;)Z
    .locals 0

    invoke-interface {p0}, Lcom/daaw/i98;->m()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static I(Lcom/daaw/q88;Lcom/daaw/d34;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object p0, p0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {p0}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object p0

    iget-boolean p0, p0, Lcom/daaw/d34;->f:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static L(Lcom/daaw/tv8;)[Lcom/daaw/f92;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/daaw/xv8;->zzc()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v2, v1, [Lcom/daaw/f92;

    :goto_1
    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Lcom/daaw/xv8;->b(I)Lcom/daaw/f92;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method public static final M(Lcom/daaw/z88;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/z88;->j()Z

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/z88;->c()Lcom/daaw/w88;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/z88;->a()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/z88;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/daaw/w88;->h(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lcom/daaw/z88;->h(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v0}, Lcom/daaw/z88;->h(Z)V

    throw v1
.end method

.method public static final N(Lcom/daaw/i98;)V
    .locals 2

    invoke-interface {p0}, Lcom/daaw/i98;->m()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lcom/daaw/i98;->d()V

    :cond_0
    return-void
.end method

.method public static final O(Lcom/daaw/i98;J)V
    .locals 0

    invoke-interface {p0}, Lcom/daaw/i98;->zzC()V

    instance-of p1, p0, Lcom/daaw/eu8;

    if-nez p1, :cond_0

    return-void

    :cond_0
    check-cast p0, Lcom/daaw/eu8;

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic Q(Lcom/daaw/u68;)Lcom/daaw/vz4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    return-object p0
.end method

.method public static S(Lcom/daaw/i54;Lcom/daaw/d34;IZLjava/lang/Object;Lcom/daaw/l64;Lcom/daaw/l64;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p5, p4}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result p4

    invoke-virtual {p5}, Lcom/daaw/l64;->b()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p4

    const/4 p4, -0x1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p4, v1, :cond_1

    move-object v3, p5

    move-object v5, p1

    move-object v6, p0

    move v7, p2

    move v8, p3

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/l64;->i(ILcom/daaw/d34;Lcom/daaw/i54;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    const/4 p4, -0x1

    goto :goto_1

    :cond_0
    invoke-virtual {p5, v4}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p6, p4}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result p4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    invoke-virtual {p6, p4}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic T(Lcom/daaw/u68;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/u68;->T:Z

    return-void
.end method

.method public static final synthetic a0(Lcom/daaw/z88;)V
    .locals 2

    :try_start_0
    invoke-static {p0}, Lcom/daaw/u68;->M(Lcom/daaw/z88;)V
    :try_end_0
    .catch Lcom/daaw/vu7; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Unexpected error delivering message on external thread."

    invoke-static {v0, v1, p0}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static h0(Lcom/daaw/l64;Lcom/daaw/r68;ZIZLcom/daaw/i54;Lcom/daaw/d34;)Landroid/util/Pair;
    .locals 12

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p6

    iget-object v1, v0, Lcom/daaw/r68;->a:Lcom/daaw/l64;

    invoke-virtual {p0}, Lcom/daaw/l64;->o()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    return-object v9

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v3

    if-ne v2, v3, :cond_1

    move-object v10, v7

    goto :goto_0

    :cond_1
    move-object v10, v1

    :goto_0
    :try_start_0
    iget v4, v0, Lcom/daaw/r68;->b:I

    iget-wide v5, v0, Lcom/daaw/r68;->c:J

    move-object v1, v10

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v10}, Lcom/daaw/l64;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v2, v8}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v2

    iget-boolean v2, v2, Lcom/daaw/d34;->f:Z

    if-eqz v2, :cond_3

    iget v2, v8, Lcom/daaw/d34;->c:I

    const-wide/16 v3, 0x0

    move-object/from16 v11, p5

    invoke-virtual {v10, v2, v11, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v2

    iget v2, v2, Lcom/daaw/i54;->m:I

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v3}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v1, v8}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget v3, v1, Lcom/daaw/d34;->c:I

    iget-wide v4, v0, Lcom/daaw/r68;->c:J

    :goto_1
    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v1

    :cond_4
    move-object/from16 v11, p5

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move v2, p3

    move/from16 v3, p4

    move-object v5, v10

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcom/daaw/u68;->S(Lcom/daaw/i54;Lcom/daaw/d34;IZLjava/lang/Object;Lcom/daaw/l64;Lcom/daaw/l64;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, v8}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget v3, v0, Lcom/daaw/d34;->c:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1

    :catch_0
    :cond_5
    return-object v9
.end method


# virtual methods
.method public final A()V
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v1

    iget-boolean v2, v0, Lcom/daaw/u68;->P:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    invoke-interface {v1}, Lcom/daaw/nr8;->zzp()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v14, 0x1

    :goto_1
    iget-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v2, v1, Lcom/daaw/q88;->g:Z

    if-eq v14, v2, :cond_2

    new-instance v2, Lcom/daaw/q88;

    move-object v5, v2

    iget-object v6, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v7, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v8, v1, Lcom/daaw/q88;->c:J

    iget-wide v10, v1, Lcom/daaw/q88;->d:J

    iget v12, v1, Lcom/daaw/q88;->e:I

    iget-object v13, v1, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    iget-object v15, v1, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    iget-object v3, v1, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    move-object/from16 v16, v3

    iget-object v3, v1, Lcom/daaw/q88;->j:Ljava/util/List;

    move-object/from16 v17, v3

    iget-object v3, v1, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    move-object/from16 v18, v3

    iget-boolean v3, v1, Lcom/daaw/q88;->l:Z

    move/from16 v19, v3

    iget v3, v1, Lcom/daaw/q88;->m:I

    move/from16 v20, v3

    iget-object v3, v1, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    move-object/from16 v21, v3

    iget-wide v3, v1, Lcom/daaw/q88;->p:J

    move-wide/from16 v22, v3

    iget-wide v3, v1, Lcom/daaw/q88;->q:J

    move-wide/from16 v24, v3

    iget-wide v3, v1, Lcom/daaw/q88;->r:J

    move-wide/from16 v26, v3

    iget-boolean v1, v1, Lcom/daaw/q88;->o:Z

    move/from16 v28, v1

    invoke-direct/range {v5 .. v28}, Lcom/daaw/q88;-><init>(Lcom/daaw/l64;Lcom/daaw/pr8;JJILcom/daaw/vu7;ZLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;Lcom/daaw/pr8;ZILcom/daaw/pp3;JJJZ)V

    iput-object v2, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_2
    return-void
.end method

.method public final B(Lcom/daaw/au8;Lcom/daaw/fw8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    iget-object v1, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    iget-object p2, p2, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/d78;->b([Lcom/daaw/i98;Lcom/daaw/au8;[Lcom/daaw/tv8;)V

    return-void
.end method

.method public final C()V
    .locals 11

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lcom/daaw/j78;->d:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    invoke-interface {v1}, Lcom/daaw/nr8;->zzd()J

    move-result-wide v4

    move-wide v6, v4

    goto :goto_0

    :cond_1
    move-wide v6, v2

    :goto_0
    const/4 v10, 0x0

    cmp-long v1, v6, v2

    if-eqz v1, :cond_2

    invoke-virtual {p0, v6, v7}, Lcom/daaw/u68;->q(J)V

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->r:J

    cmp-long v2, v6, v0

    if-eqz v2, :cond_b

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v4, v0, Lcom/daaw/q88;->c:J

    const/4 v8, 0x1

    const/4 v9, 0x5

    move-object v0, p0

    move-wide v2, v6

    invoke-virtual/range {v0 .. v9}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    goto/16 :goto_5

    :cond_2
    iget-object v1, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    iget-object v2, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lcom/daaw/is7;->a(Z)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/u68;->X:J

    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v3, v0, Lcom/daaw/q88;->r:J

    iget-object v0, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/u68;->Z:Z

    if-eqz v0, :cond_5

    const-wide/16 v5, -0x1

    add-long/2addr v3, v5

    iput-boolean v10, p0, Lcom/daaw/u68;->Z:Z

    :cond_5
    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v5, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v5, v0}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v0

    iget v5, p0, Lcom/daaw/u68;->Y:I

    iget-object v6, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x0

    if-lez v5, :cond_6

    :goto_2
    iget-object v7, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    add-int/lit8 v8, v5, -0x1

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/e68;

    goto :goto_3

    :cond_6
    move-object v7, v6

    :goto_3
    if-eqz v7, :cond_8

    if-ltz v0, :cond_7

    if-nez v0, :cond_8

    const-wide/16 v7, 0x0

    cmp-long v9, v3, v7

    if-gez v9, :cond_8

    :cond_7
    add-int/lit8 v5, v5, -0x1

    if-lez v5, :cond_6

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_9

    iget-object v0, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/e68;

    :cond_9
    iput v5, p0, Lcom/daaw/u68;->Y:I

    :cond_a
    :goto_4
    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iput-wide v1, v0, Lcom/daaw/q88;->r:J

    :cond_b
    :goto_5
    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v0}, Lcom/daaw/j78;->c()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/daaw/q88;->p:J

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {p0}, Lcom/daaw/u68;->c0()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/q88;->q:J

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v1, v0, Lcom/daaw/q88;->l:Z

    if-eqz v1, :cond_c

    iget v1, v0, Lcom/daaw/q88;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_c

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {p0, v1, v0}, Lcom/daaw/u68;->K(Lcom/daaw/l64;Lcom/daaw/pr8;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    iget v1, v1, Lcom/daaw/pp3;->a:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_c

    iget-object v1, p0, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    iget-object v2, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v3, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v3, v3, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-wide v4, v0, Lcom/daaw/q88;->r:J

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/daaw/u68;->b0(Lcom/daaw/l64;Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/daaw/u68;->c0()J

    move-result-wide v4

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/daaw/zo7;->a(JJ)F

    move-result v0

    iget-object v1, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v1}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v1

    iget v1, v1, Lcom/daaw/pp3;->a:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    iget-object v2, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    new-instance v3, Lcom/daaw/pp3;

    iget v2, v2, Lcom/daaw/pp3;->b:F

    invoke-direct {v3, v0, v2}, Lcom/daaw/pp3;-><init>(FF)V

    invoke-virtual {v1, v3}, Lcom/daaw/is7;->l(Lcom/daaw/pp3;)V

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    iget-object v1, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v1}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v1

    iget v1, v1, Lcom/daaw/pp3;->a:F

    invoke-virtual {p0, v0, v1, v10, v10}, Lcom/daaw/u68;->l(Lcom/daaw/pp3;FZZ)V

    :cond_c
    return-void
.end method

.method public final D(Lcom/daaw/l64;Lcom/daaw/pr8;Lcom/daaw/l64;Lcom/daaw/pr8;J)V
    .locals 5

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u68;->K(Lcom/daaw/l64;Lcom/daaw/pr8;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/daaw/md3;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/pp3;->d:Lcom/daaw/pp3;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object p1, p1, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    :goto_0
    iget-object p2, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {p2}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/pp3;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {p2, p1}, Lcom/daaw/is7;->l(Lcom/daaw/pp3;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget v0, v0, Lcom/daaw/d34;->c:I

    iget-object v1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object v0, p0, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    iget-object v1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-object v1, v1, Lcom/daaw/i54;->i:Lcom/daaw/ht2;

    sget v4, Lcom/daaw/it5;->a:I

    invoke-virtual {v0, v1}, Lcom/daaw/zo7;->d(Lcom/daaw/ht2;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p5, v0

    if-eqz v4, :cond_3

    iget-object p3, p0, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    iget-object p2, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, p5, p6}, Lcom/daaw/u68;->b0(Lcom/daaw/l64;Ljava/lang/Object;J)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, Lcom/daaw/zo7;->e(J)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-object p1, p1, Lcom/daaw/i54;->a:Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/daaw/l64;->o()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p4, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object p4, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p3, p2, p4}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object p2

    iget p2, p2, Lcom/daaw/d34;->c:I

    iget-object p4, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    invoke-virtual {p3, p2, p4, v2, v3}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/i54;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :goto_1
    invoke-static {p2, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/zo7;->e(J)V

    :cond_5
    return-void
.end method

.method public final declared-synchronized E(Lcom/daaw/iz6;J)V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    move-object v3, p1

    check-cast v3, Lcom/daaw/m58;

    iget-object v3, v3, Lcom/daaw/m58;->p:Lcom/daaw/u68;

    iget-boolean v3, v3, Lcom/daaw/u68;->L:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-lez v5, :cond_0

    :try_start_1
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 p2, 0x1

    const/4 v2, 0x1

    :goto_1
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final F()Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/j78;->d()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final H()Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v1, v1, Lcom/daaw/m78;->e:J

    iget-boolean v0, v0, Lcom/daaw/j78;->d:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v5

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v5, v0, Lcom/daaw/q88;->r:J

    cmp-long v0, v5, v1

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/u68;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v4

    :cond_1
    const/4 v3, 0x1

    :cond_2
    :goto_0
    return v3
.end method

.method public final J()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v1, v0, Lcom/daaw/q88;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/daaw/q88;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K(Lcom/daaw/l64;Lcom/daaw/pr8;)Z
    .locals 4

    invoke-virtual {p2}, Lcom/daaw/md3;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p1, p2, v0}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object p2

    iget p2, p2, Lcom/daaw/d34;->c:I

    iget-object v0, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, p2, v0, v2, v3}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object p1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    invoke-virtual {p1}, Lcom/daaw/i54;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-boolean p2, p1, Lcom/daaw/i54;->g:Z

    if-eqz p2, :cond_1

    iget-wide p1, p1, Lcom/daaw/i54;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final P()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u68;->y:Landroid/os/Looper;

    return-object v0
.end method

.method public final synthetic R()Ljava/lang/Boolean;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/u68;->L:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final U()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->a(I)Lcom/daaw/sy4;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final V(Lcom/daaw/l64;IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    new-instance v1, Lcom/daaw/r68;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/daaw/r68;-><init>(Lcom/daaw/l64;IJ)V

    const/4 p1, 0x3

    invoke-interface {v0, p1, v1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final W(ZI)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/vz4;->f(III)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->a(I)Lcom/daaw/sy4;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final declared-synchronized Y()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/u68;->L:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/u68;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->i(I)Z

    new-instance v0, Lcom/daaw/m58;

    invoke-direct {v0, p0}, Lcom/daaw/m58;-><init>(Lcom/daaw/u68;)V

    iget-wide v1, p0, Lcom/daaw/u68;->H:J

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/u68;->E(Lcom/daaw/iz6;J)V

    iget-boolean v0, p0, Lcom/daaw/u68;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final Z(Ljava/util/List;IJLcom/daaw/wt8;)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    new-instance v9, Lcom/daaw/y58;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, p5

    move v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v8}, Lcom/daaw/y58;-><init>(Ljava/util/List;Lcom/daaw/wt8;IJLcom/daaw/v58;[B)V

    const/16 p1, 0x11

    invoke-interface {v0, p1, v9}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final bridge synthetic a(Lcom/daaw/vt8;)V
    .locals 2

    check-cast p1, Lcom/daaw/nr8;

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final b(Lcom/daaw/pp3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0x10

    invoke-interface {v0, v1, p1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final b0(Lcom/daaw/l64;Ljava/lang/Object;J)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p1, p2, v0}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object p2

    iget p2, p2, Lcom/daaw/d34;->c:I

    iget-object v0, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object p1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-wide v0, p1, Lcom/daaw/i54;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/i54;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-boolean p2, p1, Lcom/daaw/i54;->g:Z

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p1, p1, Lcom/daaw/i54;->e:J

    invoke-static {p1, p2}, Lcom/daaw/it5;->d0(J)J

    move-result-wide p1

    iget-object v0, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-wide v0, v0, Lcom/daaw/i54;->d:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Lcom/daaw/it5;->f0(J)J

    move-result-wide p1

    sub-long/2addr p1, p3

    return-wide p1

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final declared-synchronized c(Lcom/daaw/z88;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/u68;->L:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/u68;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0xe

    invoke-interface {v0, v1, p1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Ignoring messages sent after release."

    invoke-static {v0, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/z88;->h(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->p:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/u68;->d0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lcom/daaw/nr8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final d0(J)J
    .locals 7

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-wide v3, p0, Lcom/daaw/u68;->X:J

    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v5

    sub-long/2addr v3, v5

    sub-long/2addr p1, v3

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e(Lcom/daaw/i98;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0, p1}, Lcom/daaw/is7;->b(Lcom/daaw/i98;)V

    invoke-static {p1}, Lcom/daaw/u68;->N(Lcom/daaw/i98;)V

    invoke-interface {p1}, Lcom/daaw/i98;->zzn()V

    iget p1, p0, Lcom/daaw/u68;->V:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/u68;->V:I

    return-void
.end method

.method public final e0(Lcom/daaw/pr8;JZ)J
    .locals 7

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/u68;->f0(Lcom/daaw/pr8;JZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v0, v0

    const/4 v0, 0x2

    new-array v0, v0, [Z

    invoke-virtual {p0, v0}, Lcom/daaw/u68;->g([Z)V

    return-void
.end method

.method public final f0(Lcom/daaw/pr8;JZZ)J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/u68;->z()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/u68;->O:Z

    const/4 v1, 0x2

    if-nez p5, :cond_0

    iget-object p5, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget p5, p5, Lcom/daaw/q88;->e:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, Lcom/daaw/u68;->w(I)V

    :cond_1
    iget-object p5, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p5}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object p5

    move-object v2, p5

    :goto_0
    if-eqz v2, :cond_3

    iget-object v3, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v3, v3, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {p1, v3}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne p5, v2, :cond_4

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/daaw/j78;->e()J

    move-result-wide p4

    add-long/2addr p4, p2

    const-wide/16 v3, 0x0

    cmp-long p1, p4, v3

    if-gez p1, :cond_7

    :cond_4
    iget-object p1, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length p4, p1

    const/4 p4, 0x0

    :goto_2
    if-ge p4, v1, :cond_5

    aget-object p5, p1, p4

    invoke-virtual {p0, p5}, Lcom/daaw/u68;->e(Lcom/daaw/i98;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    :goto_3
    iget-object p1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object p1

    if-eq p1, v2, :cond_6

    iget-object p1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p1}, Lcom/daaw/s78;->d()Lcom/daaw/j78;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p1, v2}, Lcom/daaw/s78;->p(Lcom/daaw/j78;)Z

    const-wide p4, 0xe8d4a51000L

    invoke-virtual {v2, p4, p5}, Lcom/daaw/j78;->p(J)V

    invoke-virtual {p0}, Lcom/daaw/u68;->f()V

    :cond_7
    iget-object p1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    if-eqz v2, :cond_a

    invoke-virtual {p1, v2}, Lcom/daaw/s78;->p(Lcom/daaw/j78;)Z

    iget-boolean p1, v2, Lcom/daaw/j78;->d:Z

    if-nez p1, :cond_8

    iget-object p1, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/m78;->b(J)Lcom/daaw/m78;

    move-result-object p1

    iput-object p1, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    goto :goto_4

    :cond_8
    iget-boolean p1, v2, Lcom/daaw/j78;->e:Z

    if-eqz p1, :cond_9

    iget-object p1, v2, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    invoke-interface {p1, p2, p3}, Lcom/daaw/nr8;->b(J)J

    move-result-wide p2

    iget-object p1, v2, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    iget-wide p4, p0, Lcom/daaw/u68;->B:J

    sub-long p4, p2, p4

    invoke-interface {p1, p4, p5, v0}, Lcom/daaw/nr8;->e(JZ)V

    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lcom/daaw/u68;->q(J)V

    invoke-virtual {p0}, Lcom/daaw/u68;->m()V

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, Lcom/daaw/s78;->l()V

    invoke-virtual {p0, p2, p3}, Lcom/daaw/u68;->q(J)V

    :goto_5
    invoke-virtual {p0, v0}, Lcom/daaw/u68;->i(Z)V

    iget-object p1, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {p1, v1}, Lcom/daaw/vz4;->i(I)Z

    return-wide p2
.end method

.method public final g([Z)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-object v5, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v5, v5

    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    invoke-virtual {v2, v4}, Lcom/daaw/fw8;->b(I)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, Lcom/daaw/u68;->q:Ljava/util/Set;

    iget-object v6, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v6, v6, v4

    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v5, v5, v4

    invoke-interface {v5}, Lcom/daaw/i98;->zzA()V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v6, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v6, v6

    const/4 v6, 0x1

    if-ge v4, v5, :cond_7

    invoke-virtual {v2, v4}, Lcom/daaw/fw8;->b(I)Z

    move-result v7

    if-eqz v7, :cond_6

    aget-boolean v7, p1, v4

    iget-object v8, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v8, v8, v4

    invoke-static {v8}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v9, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v9}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v9

    iget-object v10, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v10}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v10

    if-ne v9, v10, :cond_3

    const/16 v16, 0x1

    goto :goto_2

    :cond_3
    const/16 v16, 0x0

    :goto_2
    invoke-virtual {v9}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v10

    iget-object v11, v10, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object v11, v11, v4

    iget-object v10, v10, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    aget-object v10, v10, v4

    invoke-static {v10}, Lcom/daaw/u68;->L(Lcom/daaw/tv8;)[Lcom/daaw/f92;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->J()Z

    move-result v10

    if-eqz v10, :cond_4

    iget-object v10, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v10, v10, Lcom/daaw/q88;->e:I

    const/4 v13, 0x3

    if-ne v10, v13, :cond_4

    const/16 v21, 0x1

    goto :goto_3

    :cond_4
    const/16 v21, 0x0

    :goto_3
    if-nez v7, :cond_5

    if-eqz v21, :cond_5

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    iget v7, v0, Lcom/daaw/u68;->V:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/daaw/u68;->V:I

    iget-object v6, v0, Lcom/daaw/u68;->q:Ljava/util/Set;

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v6, v9, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v6, v6, v4

    iget-wide v13, v0, Lcom/daaw/u68;->X:J

    invoke-virtual {v9}, Lcom/daaw/j78;->f()J

    move-result-wide v17

    invoke-virtual {v9}, Lcom/daaw/j78;->e()J

    move-result-wide v19

    move-object v9, v8

    move-object v10, v11

    move-object v11, v12

    move-object v12, v6

    invoke-interface/range {v9 .. v20}, Lcom/daaw/i98;->n(Lcom/daaw/x98;[Lcom/daaw/f92;Lcom/daaw/mt8;JZZJJ)V

    new-instance v6, Lcom/daaw/s58;

    invoke-direct {v6, v0}, Lcom/daaw/s58;-><init>(Lcom/daaw/u68;)V

    const/16 v7, 0xb

    invoke-interface {v8, v7, v6}, Lcom/daaw/w88;->h(ILjava/lang/Object;)V

    iget-object v6, v0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v6, v8}, Lcom/daaw/is7;->c(Lcom/daaw/i98;)V

    if-eqz v21, :cond_6

    invoke-interface {v8}, Lcom/daaw/i98;->zzE()V

    :cond_6
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_7
    iput-boolean v6, v1, Lcom/daaw/j78;->g:Z

    return-void
.end method

.method public final g0(Lcom/daaw/l64;)Landroid/util/Pair;
    .locals 9

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/q88;->h()Lcom/daaw/pr8;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/u68;->R:Z

    invoke-virtual {p1, v0}, Lcom/daaw/l64;->g(Z)I

    move-result v6

    iget-object v4, p0, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-object v5, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, p1, v4, v1, v2}, Lcom/daaw/s78;->k(Lcom/daaw/l64;Ljava/lang/Object;J)Lcom/daaw/pr8;

    move-result-object v3

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/daaw/md3;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v3, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p1, v0, v4}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget p1, v3, Lcom/daaw/md3;->c:I

    iget-object v0, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    iget v4, v3, Lcom/daaw/md3;->b:I

    invoke-virtual {v0, v4}, Lcom/daaw/d34;->e(I)I

    move-result v0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {p1}, Lcom/daaw/d34;->i()J

    goto :goto_0

    :cond_1
    move-wide v1, v4

    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/io/IOException;I)V
    .locals 1

    invoke-static {p1, p2}, Lcom/daaw/vu7;->c(Ljava/io/IOException;I)Lcom/daaw/vu7;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object p2, p2, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {p1, p2}, Lcom/daaw/vu7;->a(Lcom/daaw/md3;)Lcom/daaw/vu7;

    move-result-object p1

    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    const-string v0, "Playback error"

    invoke-static {p2, v0, p1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p2}, Lcom/daaw/u68;->y(ZZ)V

    iget-object p2, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {p2, p1}, Lcom/daaw/q88;->d(Lcom/daaw/vu7;)Lcom/daaw/q88;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 53

    move-object/from16 v11, p0

    move-object/from16 v1, p1

    const/4 v13, 0x0

    const/4 v14, 0x1

    :try_start_0
    iget v2, v1, Landroid/os/Message;->what:I

    const/4 v15, 0x0

    const/4 v10, -0x1

    const/4 v7, 0x4

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x2

    packed-switch v2, :pswitch_data_0

    const/4 v1, 0x0

    return v1

    :pswitch_0
    invoke-virtual {v11, v14}, Lcom/daaw/u68;->t(Z)V

    goto/16 :goto_4c

    :pswitch_1
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-ne v1, v14, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, v11, Lcom/daaw/u68;->U:Z

    if-eq v1, v2, :cond_6f

    iput-boolean v1, v11, Lcom/daaw/u68;->U:Z

    if-nez v1, :cond_6f

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v1, v1, Lcom/daaw/q88;->o:Z

    if-eqz v1, :cond_6f

    iget-object v1, v11, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {v1, v8}, Lcom/daaw/vz4;->i(I)Z

    goto/16 :goto_4c

    :pswitch_2
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, v11, Lcom/daaw/u68;->M:Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->p()V

    iget-boolean v1, v11, Lcom/daaw/u68;->N:Z

    if-eqz v1, :cond_6f

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-eq v1, v2, :cond_6f

    invoke-virtual {v11, v14}, Lcom/daaw/u68;->t(Z)V

    :cond_2
    :goto_2
    invoke-virtual {v11, v13}, Lcom/daaw/u68;->i(Z)V

    goto/16 :goto_4c

    :pswitch_3
    iget-object v1, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v1}, Lcom/daaw/n88;->b()Lcom/daaw/l64;

    move-result-object v1

    invoke-virtual {v11, v1, v14}, Lcom/daaw/u68;->j(Lcom/daaw/l64;Z)V

    goto/16 :goto_4c

    :pswitch_4
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/wt8;

    iget-object v2, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v2, v14}, Lcom/daaw/o68;->a(I)V

    iget-object v2, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v2, v1}, Lcom/daaw/n88;->n(Lcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object v1

    :goto_3
    invoke-virtual {v11, v1, v13}, Lcom/daaw/u68;->j(Lcom/daaw/l64;Z)V

    goto/16 :goto_4c

    :pswitch_5
    iget v2, v1, Landroid/os/Message;->arg1:I

    iget v3, v1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/wt8;

    iget-object v4, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v4, v14}, Lcom/daaw/o68;->a(I)V

    iget-object v4, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v4, v2, v3, v1}, Lcom/daaw/n88;->l(IILcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object v1

    goto :goto_3

    :pswitch_6
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/b68;

    iget-object v2, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v2, v14}, Lcom/daaw/o68;->a(I)V

    iget-object v2, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    iget v1, v1, Lcom/daaw/b68;->a:I

    invoke-virtual {v2, v13, v13, v13, v15}, Lcom/daaw/n88;->k(IIILcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object v1

    goto :goto_3

    :pswitch_7
    iget-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/y58;

    iget v1, v1, Landroid/os/Message;->arg1:I

    iget-object v3, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v3, v14}, Lcom/daaw/o68;->a(I)V

    iget-object v3, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    if-ne v1, v10, :cond_3

    invoke-virtual {v3}, Lcom/daaw/n88;->a()I

    move-result v1

    :cond_3
    invoke-static {v2}, Lcom/daaw/y58;->c(Lcom/daaw/y58;)Ljava/util/List;

    move-result-object v4

    invoke-static {v2}, Lcom/daaw/y58;->d(Lcom/daaw/y58;)Lcom/daaw/wt8;

    move-result-object v2

    invoke-virtual {v3, v1, v4, v2}, Lcom/daaw/n88;->j(ILjava/util/List;Lcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object v1

    goto :goto_3

    :pswitch_8
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/y58;

    iget-object v2, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v2, v14}, Lcom/daaw/o68;->a(I)V

    invoke-static {v1}, Lcom/daaw/y58;->a(Lcom/daaw/y58;)I

    move-result v2

    if-eq v2, v10, :cond_4

    new-instance v2, Lcom/daaw/r68;

    new-instance v3, Lcom/daaw/c98;

    invoke-static {v1}, Lcom/daaw/y58;->c(Lcom/daaw/y58;)Ljava/util/List;

    move-result-object v4

    invoke-static {v1}, Lcom/daaw/y58;->d(Lcom/daaw/y58;)Lcom/daaw/wt8;

    move-result-object v5

    invoke-direct {v3, v4, v5, v15}, Lcom/daaw/c98;-><init>(Ljava/util/Collection;Lcom/daaw/wt8;[B)V

    invoke-static {v1}, Lcom/daaw/y58;->a(Lcom/daaw/y58;)I

    move-result v4

    invoke-static {v1}, Lcom/daaw/y58;->b(Lcom/daaw/y58;)J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/daaw/r68;-><init>(Lcom/daaw/l64;IJ)V

    iput-object v2, v11, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    :cond_4
    iget-object v2, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-static {v1}, Lcom/daaw/y58;->c(Lcom/daaw/y58;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1}, Lcom/daaw/y58;->d(Lcom/daaw/y58;)Lcom/daaw/wt8;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/daaw/n88;->m(Ljava/util/List;Lcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object v1

    goto/16 :goto_3

    :pswitch_9
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/pp3;

    invoke-virtual {v11, v1, v13}, Lcom/daaw/u68;->k(Lcom/daaw/pp3;Z)V

    goto/16 :goto_4c

    :pswitch_a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/z88;

    invoke-virtual {v1}, Lcom/daaw/z88;->b()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-nez v3, :cond_5

    const-string v2, "TAG"

    const-string v3, "Trying to send message on a dead thread."

    invoke-static {v2, v3}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lcom/daaw/z88;->h(Z)V

    goto/16 :goto_4c

    :cond_5
    iget-object v3, v11, Lcom/daaw/u68;->E:Lcom/daaw/xp4;

    invoke-interface {v3, v2, v15}, Lcom/daaw/xp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/vz4;

    move-result-object v2

    new-instance v3, Lcom/daaw/p58;

    invoke-direct {v3, v11, v1}, Lcom/daaw/p58;-><init>(Lcom/daaw/u68;Lcom/daaw/z88;)V

    invoke-interface {v2, v3}, Lcom/daaw/vz4;->b(Ljava/lang/Runnable;)Z

    goto/16 :goto_4c

    :pswitch_b
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/z88;

    invoke-virtual {v11, v1}, Lcom/daaw/u68;->u(Lcom/daaw/z88;)V

    goto/16 :goto_4c

    :pswitch_c
    iget v2, v1, Landroid/os/Message;->arg1:I

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v3, v11, Lcom/daaw/u68;->S:Z

    if-eq v3, v2, :cond_8

    iput-boolean v2, v11, Lcom/daaw/u68;->S:Z

    if-nez v2, :cond_8

    iget-object v2, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v3, v2

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v8, :cond_8

    aget-object v4, v2, v3

    invoke-static {v4}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, v11, Lcom/daaw/u68;->q:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Lcom/daaw/i98;->zzA()V

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_6f

    monitor-enter p0
    :try_end_0
    .catch Lcom/daaw/vu7; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/daaw/s56; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v1, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto/16 :goto_4c

    :catchall_0
    move-exception v0

    move-object v1, v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :pswitch_d
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    iput-boolean v1, v11, Lcom/daaw/u68;->R:Z

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v3, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v2, v3, v1}, Lcom/daaw/s78;->t(Lcom/daaw/l64;Z)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v11, v14}, Lcom/daaw/u68;->t(Z)V

    goto/16 :goto_2

    :pswitch_e
    iget v1, v1, Landroid/os/Message;->arg1:I

    iput v1, v11, Lcom/daaw/u68;->Q:I

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v3, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v2, v3, v1}, Lcom/daaw/s78;->s(Lcom/daaw/l64;I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v11, v14}, Lcom/daaw/u68;->t(Z)V

    goto/16 :goto_2

    :pswitch_f
    iget-object v1, v11, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v1}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v1

    iget v1, v1, Lcom/daaw/pp3;->a:F

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    iget-object v3, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v3}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v3

    const/4 v4, 0x1

    :goto_7
    if-eqz v2, :cond_6f

    iget-boolean v5, v2, Lcom/daaw/j78;->d:Z

    if-eqz v5, :cond_6f

    iget-object v5, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v5, v5, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v2, v1, v5}, Lcom/daaw/j78;->j(FLcom/daaw/l64;)Lcom/daaw/fw8;

    move-result-object v5

    invoke-virtual {v2}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v6

    if-eqz v6, :cond_d

    iget-object v9, v6, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v9, v9

    iget-object v10, v5, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v10, v10

    if-eq v9, v10, :cond_a

    goto :goto_a

    :cond_a
    const/4 v9, 0x0

    :goto_8
    iget-object v10, v5, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v10, v10

    if-ge v9, v10, :cond_b

    invoke-virtual {v5, v6, v9}, Lcom/daaw/fw8;->a(Lcom/daaw/fw8;I)Z

    move-result v10

    if-eqz v10, :cond_d

    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_b
    if-ne v2, v3, :cond_c

    const/4 v5, 0x0

    goto :goto_9

    :cond_c
    const/4 v5, 0x1

    :goto_9
    and-int/2addr v4, v5

    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    goto :goto_7

    :cond_d
    :goto_a
    if-eqz v4, :cond_13

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v10

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1, v10}, Lcom/daaw/s78;->p(Lcom/daaw/j78;)Z

    move-result v19

    iget-object v1, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v1, v1

    new-array v9, v8, [Z

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v1, v1, Lcom/daaw/q88;->r:J

    move-object v15, v10

    move-object/from16 v16, v5

    move-wide/from16 v17, v1

    move-object/from16 v20, v9

    invoke-virtual/range {v15 .. v20}, Lcom/daaw/j78;->b(Lcom/daaw/fw8;JZ[Z)J

    move-result-wide v5

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v2, v1, Lcom/daaw/q88;->e:I

    if-eq v2, v7, :cond_e

    iget-wide v1, v1, Lcom/daaw/q88;->r:J

    cmp-long v3, v5, v1

    if-eqz v3, :cond_e

    const/4 v15, 0x1

    goto :goto_b

    :cond_e
    const/4 v15, 0x0

    :goto_b
    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v3, v1, Lcom/daaw/q88;->c:J

    iget-wide v7, v1, Lcom/daaw/q88;->d:J

    const/16 v18, 0x5

    move-object/from16 v1, p0

    move-wide/from16 v19, v3

    move-wide v3, v5

    move-wide v12, v5

    move-wide/from16 v5, v19

    const/4 v14, 0x2

    move-object/from16 v17, v9

    move v9, v15

    move-object/from16 v22, v10

    move/from16 v10, v18

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    if-eqz v15, :cond_f

    invoke-virtual {v11, v12, v13}, Lcom/daaw/u68;->q(J)V

    :cond_f
    iget-object v1, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v1, v1

    new-array v1, v14, [Z

    const/4 v2, 0x0

    :goto_c
    iget-object v3, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v4, v3

    if-ge v2, v14, :cond_12

    aget-object v3, v3, v2

    invoke-static {v3}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v4

    aput-boolean v4, v1, v2

    move-object/from16 v5, v22

    iget-object v6, v5, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v6, v6, v2

    if-eqz v4, :cond_11

    invoke-interface {v3}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v4

    if-eq v6, v4, :cond_10

    invoke-virtual {v11, v3}, Lcom/daaw/u68;->e(Lcom/daaw/i98;)V

    goto :goto_d

    :cond_10
    aget-boolean v4, v17, v2

    if-eqz v4, :cond_11

    iget-wide v6, v11, Lcom/daaw/u68;->X:J

    invoke-interface {v3, v6, v7}, Lcom/daaw/i98;->b(J)V

    :cond_11
    :goto_d
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v22, v5

    goto :goto_c

    :cond_12
    invoke-virtual {v11, v1}, Lcom/daaw/u68;->g([Z)V

    goto :goto_e

    :cond_13
    const/4 v14, 0x2

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1, v2}, Lcom/daaw/s78;->p(Lcom/daaw/j78;)Z

    iget-boolean v1, v2, Lcom/daaw/j78;->d:Z

    if-eqz v1, :cond_14

    iget-object v1, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v3, v1, Lcom/daaw/m78;->b:J

    iget-wide v6, v11, Lcom/daaw/u68;->X:J

    invoke-virtual {v2}, Lcom/daaw/j78;->e()J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    const/4 v1, 0x0

    invoke-virtual {v2, v5, v3, v4, v1}, Lcom/daaw/j78;->a(Lcom/daaw/fw8;JZ)J

    :cond_14
    :goto_e
    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Lcom/daaw/u68;->i(Z)V

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v1, Lcom/daaw/q88;->e:I

    const/4 v12, 0x4

    if-eq v1, v12, :cond_6f

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->m()V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->C()V

    iget-object v1, v11, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {v1, v14}, Lcom/daaw/vz4;->i(I)Z

    goto/16 :goto_4c

    :pswitch_10
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/nr8;

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2, v1}, Lcom/daaw/s78;->o(Lcom/daaw/nr8;)Z

    move-result v1

    if-eqz v1, :cond_6f

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-wide v2, v11, Lcom/daaw/u68;->X:J

    invoke-virtual {v1, v2, v3}, Lcom/daaw/s78;->n(J)V

    :cond_15
    :goto_f
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->m()V

    goto/16 :goto_4c

    :pswitch_11
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/nr8;

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2, v1}, Lcom/daaw/s78;->o(Lcom/daaw/nr8;)Z

    move-result v1

    if-eqz v1, :cond_6f

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v1

    iget-object v2, v11, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v2}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v2

    iget v2, v2, Lcom/daaw/pp3;->a:F

    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v3, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/j78;->l(FLcom/daaw/l64;)V

    invoke-virtual {v1}, Lcom/daaw/j78;->h()Lcom/daaw/au8;

    move-result-object v2

    invoke-virtual {v1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v3

    invoke-virtual {v11, v2, v3}, Lcom/daaw/u68;->B(Lcom/daaw/au8;Lcom/daaw/fw8;)V

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-ne v1, v2, :cond_15

    iget-object v2, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v2, v2, Lcom/daaw/m78;->b:J

    invoke-virtual {v11, v2, v3}, Lcom/daaw/u68;->q(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->f()V

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v3, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v1, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v7, v1, Lcom/daaw/m78;->b:J

    iget-wide v5, v2, Lcom/daaw/q88;->c:J

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v7

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    goto :goto_f

    :pswitch_12
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v11, v2, v1, v2, v1}, Lcom/daaw/u68;->o(ZZZZ)V

    iget-object v1, v11, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    invoke-interface {v1}, Lcom/daaw/d78;->zzc()V

    invoke-virtual {v11, v2}, Lcom/daaw/u68;->w(I)V

    iget-object v1, v11, Lcom/daaw/u68;->x:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    monitor-enter p0
    :try_end_2
    .catch Lcom/daaw/vu7; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/daaw/s56; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iput-boolean v2, v11, Lcom/daaw/u68;->L:Z

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return v2

    :catchall_1
    move-exception v0

    move-object v1, v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v1

    :pswitch_13
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v11, v1, v2}, Lcom/daaw/u68;->y(ZZ)V

    goto/16 :goto_4c

    :pswitch_14
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/aa8;

    iput-object v1, v11, Lcom/daaw/u68;->I:Lcom/daaw/aa8;

    goto/16 :goto_4c

    :pswitch_15
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/pp3;

    iget-object v2, v11, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v2, v1}, Lcom/daaw/is7;->l(Lcom/daaw/pp3;)V

    iget-object v1, v11, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v1}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v11, v1, v2}, Lcom/daaw/u68;->k(Lcom/daaw/pp3;Z)V

    goto/16 :goto_4c

    :pswitch_16
    const/4 v12, 0x4

    const/4 v14, 0x2

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/r68;

    iget-object v2, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/o68;->a(I)V

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    const/16 v23, 0x1

    iget v3, v11, Lcom/daaw/u68;->Q:I

    iget-boolean v4, v11, Lcom/daaw/u68;->R:Z

    iget-object v7, v11, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-object v8, v11, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    move-object/from16 v21, v2

    move-object/from16 v22, v1

    move/from16 v24, v3

    move/from16 v25, v4

    move-object/from16 v26, v7

    move-object/from16 v27, v8

    invoke-static/range {v21 .. v27}, Lcom/daaw/u68;->h0(Lcom/daaw/l64;Lcom/daaw/r68;ZIZLcom/daaw/i54;Lcom/daaw/d34;)Landroid/util/Pair;

    move-result-object v2

    if-nez v2, :cond_16

    iget-object v7, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v7, v7, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v11, v7}, Lcom/daaw/u68;->g0(Lcom/daaw/l64;)Landroid/util/Pair;

    move-result-object v7

    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Lcom/daaw/pr8;

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    iget-object v7, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v7, v7, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v7}, Lcom/daaw/l64;->o()Z

    move-result v7

    const/4 v10, 0x1

    xor-int/2addr v7, v10

    move-wide v13, v5

    move v9, v7

    move-wide/from16 v3, v17

    goto :goto_12

    :cond_16
    iget-object v7, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v8, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-wide v13, v1, Lcom/daaw/r68;->c:J

    cmp-long v8, v13, v5

    if-nez v8, :cond_17

    move-wide v13, v5

    goto :goto_10

    :cond_17
    move-wide v13, v9

    :goto_10
    iget-object v8, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v15, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v15, v15, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v8, v15, v7, v9, v10}, Lcom/daaw/s78;->k(Lcom/daaw/l64;Ljava/lang/Object;J)Lcom/daaw/pr8;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/md3;->b()Z

    move-result v8

    if-eqz v8, :cond_19

    iget-object v5, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v5, v5, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v6, v7, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v8, v11, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {v5, v6, v8}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v5, v11, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    iget v6, v7, Lcom/daaw/md3;->b:I

    invoke-virtual {v5, v6}, Lcom/daaw/d34;->e(I)I

    move-result v5

    iget v6, v7, Lcom/daaw/md3;->c:I

    if-ne v5, v6, :cond_18

    iget-object v5, v11, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {v5}, Lcom/daaw/d34;->i()J

    :cond_18
    move-object v8, v7

    const-wide/16 v3, 0x0

    const/4 v9, 0x1

    goto :goto_12

    :cond_19
    iget-wide v3, v1, Lcom/daaw/r68;->c:J
    :try_end_4
    .catch Lcom/daaw/vu7; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lcom/daaw/s56; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    cmp-long v8, v3, v5

    if-nez v8, :cond_1a

    const/4 v3, 0x1

    goto :goto_11

    :cond_1a
    const/4 v3, 0x0

    :goto_11
    move-object v8, v7

    move-wide/from16 v51, v9

    move v9, v3

    move-wide/from16 v3, v51

    :goto_12
    :try_start_5
    iget-object v5, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v5, v5, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v5}, Lcom/daaw/l64;->o()Z

    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v5, :cond_1b

    :try_start_6
    iput-object v1, v11, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    goto :goto_13

    :catchall_2
    move-exception v0

    move-object v1, v0

    move-wide/from16 v18, v13

    goto/16 :goto_1a

    :cond_1b
    if-nez v2, :cond_1d

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v1, Lcom/daaw/q88;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1c

    invoke-virtual {v11, v12}, Lcom/daaw/u68;->w(I)V

    :cond_1c
    const/4 v1, 0x0

    invoke-virtual {v11, v1, v2, v1, v2}, Lcom/daaw/u68;->o(ZZZZ)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_13
    move-wide/from16 v18, v13

    move-wide v12, v3

    goto/16 :goto_18

    :cond_1d
    :try_start_7
    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v8, v1}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-eqz v1, :cond_1e

    :try_start_8
    iget-boolean v2, v1, Lcom/daaw/j78;->d:Z

    if-eqz v2, :cond_1e

    const-wide/16 v5, 0x0

    cmp-long v2, v3, v5

    if-eqz v2, :cond_1e

    iget-object v1, v1, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    iget-object v2, v11, Lcom/daaw/u68;->I:Lcom/daaw/aa8;

    invoke-interface {v1, v3, v4, v2}, Lcom/daaw/nr8;->h(JLcom/daaw/aa8;)J

    move-result-wide v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_14

    :cond_1e
    move-wide v1, v3

    :goto_14
    :try_start_9
    invoke-static {v1, v2}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v5

    iget-object v7, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-wide/from16 v18, v13

    :try_start_a
    iget-wide v12, v7, Lcom/daaw/q88;->r:J

    invoke-static {v12, v13}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v12

    cmp-long v7, v5, v12

    if-nez v7, :cond_21

    iget-object v5, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v6, v5, Lcom/daaw/q88;->e:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1f

    const/4 v12, 0x3

    if-ne v6, v12, :cond_21

    :cond_1f
    iget-wide v12, v5, Lcom/daaw/q88;->r:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    const/4 v10, 0x2

    move-object/from16 v1, p0

    move-object v2, v8

    move-wide v3, v12

    move-wide/from16 v5, v18

    move-wide v7, v12

    :try_start_b
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    :goto_15
    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;
    :try_end_b
    .catch Lcom/daaw/vu7; {:try_start_b .. :try_end_b} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_b .. :try_end_b} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_b .. :try_end_b} :catch_3
    .catch Lcom/daaw/s56; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_0

    goto/16 :goto_4c

    :cond_20
    move-wide/from16 v18, v13

    move-wide v1, v3

    :cond_21
    :try_start_c
    iget-object v5, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v5, v5, Lcom/daaw/q88;->e:I

    const/4 v6, 0x4

    if-ne v5, v6, :cond_22

    const/4 v5, 0x1

    goto :goto_16

    :cond_22
    const/4 v5, 0x0

    :goto_16
    invoke-virtual {v11, v8, v1, v2, v5}, Lcom/daaw/u68;->e0(Lcom/daaw/pr8;JZ)J

    move-result-wide v12
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    cmp-long v1, v3, v12

    if-eqz v1, :cond_23

    const/4 v1, 0x1

    goto :goto_17

    :cond_23
    const/4 v1, 0x0

    :goto_17
    or-int/2addr v9, v1

    :try_start_d
    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v4, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v5, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v8

    move-wide/from16 v6, v18

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/u68;->D(Lcom/daaw/l64;Lcom/daaw/pr8;Lcom/daaw/l64;Lcom/daaw/pr8;J)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :goto_18
    const/4 v10, 0x2

    move-object/from16 v1, p0

    move-object v2, v8

    move-wide v3, v12

    move-wide/from16 v5, v18

    move-wide v7, v12

    :try_start_e
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    goto :goto_15

    :catchall_3
    move-exception v0

    move-object v1, v0

    move-wide/from16 v51, v12

    move-object v12, v1

    move v13, v9

    move-wide/from16 v9, v51

    goto :goto_1b

    :catchall_4
    move-exception v0

    goto :goto_19

    :catchall_5
    move-exception v0

    move-wide/from16 v18, v13

    :goto_19
    move-object v1, v0

    :goto_1a
    move-object v12, v1

    move v13, v9

    move-wide v9, v3

    :goto_1b
    const/4 v14, 0x2

    move-object/from16 v1, p0

    move-object v2, v8

    move-wide v3, v9

    move-wide/from16 v5, v18

    move-wide v7, v9

    move v9, v13

    move v10, v14

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    throw v12

    :pswitch_17
    const/4 v12, 0x3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v13

    iget-object v1, v11, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/daaw/vz4;->zze(I)V

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_41

    iget-object v1, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v1}, Lcom/daaw/n88;->i()Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_2a

    :cond_24
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-wide v2, v11, Lcom/daaw/u68;->X:J

    invoke-virtual {v1, v2, v3}, Lcom/daaw/s78;->n(J)V

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->q()Z

    move-result v1

    if-eqz v1, :cond_26

    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-wide v2, v11, Lcom/daaw/u68;->X:J

    iget-object v4, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/s78;->i(JLcom/daaw/q88;)Lcom/daaw/m78;

    move-result-object v1

    if-eqz v1, :cond_26

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v3, v11, Lcom/daaw/u68;->r:[Lcom/daaw/l98;

    iget-object v4, v11, Lcom/daaw/u68;->s:Lcom/daaw/zv8;

    iget-object v7, v11, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    invoke-interface {v7}, Lcom/daaw/d78;->zzi()Lcom/daaw/nw8;

    move-result-object v25

    iget-object v7, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    iget-object v8, v11, Lcom/daaw/u68;->t:Lcom/daaw/fw8;

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move-object/from16 v26, v7

    move-object/from16 v27, v1

    move-object/from16 v28, v8

    invoke-virtual/range {v22 .. v28}, Lcom/daaw/s78;->u([Lcom/daaw/l98;Lcom/daaw/zv8;Lcom/daaw/nw8;Lcom/daaw/n88;Lcom/daaw/m78;Lcom/daaw/fw8;)Lcom/daaw/j78;

    move-result-object v2

    iget-object v3, v2, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    iget-wide v7, v1, Lcom/daaw/m78;->b:J

    invoke-interface {v3, v11, v7, v8}, Lcom/daaw/nr8;->g(Lcom/daaw/mr8;J)V

    iget-object v3, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v3}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v3

    if-ne v3, v2, :cond_25

    iget-wide v1, v1, Lcom/daaw/m78;->b:J

    invoke-virtual {v11, v1, v2}, Lcom/daaw/u68;->q(J)V

    :cond_25
    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lcom/daaw/u68;->i(Z)V

    :cond_26
    iget-boolean v1, v11, Lcom/daaw/u68;->P:Z

    if-eqz v1, :cond_27

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->F()Z

    move-result v1

    iput-boolean v1, v11, Lcom/daaw/u68;->P:Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->A()V

    goto :goto_1c

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->m()V

    :goto_1c
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    if-nez v1, :cond_29

    :cond_28
    :goto_1d
    move-wide/from16 v22, v13

    move-wide v12, v5

    goto/16 :goto_24

    :cond_29
    invoke-virtual {v1}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-eqz v2, :cond_32

    iget-boolean v2, v11, Lcom/daaw/u68;->N:Z

    if-eqz v2, :cond_2a

    goto/16 :goto_21

    :cond_2a
    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v2

    iget-boolean v3, v2, Lcom/daaw/j78;->d:Z

    if-eqz v3, :cond_28

    const/4 v3, 0x0

    :goto_1e
    iget-object v4, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v7, v4

    const/4 v7, 0x2

    if-ge v3, v7, :cond_2c

    aget-object v4, v4, v3

    iget-object v7, v2, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v7, v7, v3

    invoke-interface {v4}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v8

    if-ne v8, v7, :cond_28

    if-eqz v7, :cond_2b

    invoke-interface {v4}, Lcom/daaw/i98;->j()Z

    move-result v4

    if-nez v4, :cond_2b

    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    iget-object v1, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-boolean v1, v1, Lcom/daaw/m78;->f:Z

    goto :goto_1d

    :cond_2b
    add-int/lit8 v3, v3, 0x1

    goto :goto_1e

    :cond_2c
    invoke-virtual {v1}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    iget-boolean v2, v2, Lcom/daaw/j78;->d:Z

    if-nez v2, :cond_2d

    iget-wide v2, v11, Lcom/daaw/u68;->X:J

    invoke-virtual {v1}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/j78;->f()J

    move-result-wide v7

    cmp-long v4, v2, v7

    if-ltz v4, :cond_28

    :cond_2d
    invoke-virtual {v1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v8

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->e()Lcom/daaw/j78;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v7

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v4, v2, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v2, v9, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v3, v2, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    iget-object v1, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v2, v1, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v1, p0

    move-object/from16 v20, v2

    move-object v2, v4

    move-wide/from16 v22, v13

    move-wide v12, v5

    move-object/from16 v5, v20

    move-object v14, v7

    move-wide/from16 v6, v18

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/u68;->D(Lcom/daaw/l64;Lcom/daaw/pr8;Lcom/daaw/l64;Lcom/daaw/pr8;J)V

    iget-boolean v1, v9, Lcom/daaw/j78;->d:Z

    if-eqz v1, :cond_2f

    iget-object v1, v9, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    invoke-interface {v1}, Lcom/daaw/nr8;->zzd()J

    move-result-wide v1

    cmp-long v3, v1, v12

    if-eqz v3, :cond_2f

    invoke-virtual {v9}, Lcom/daaw/j78;->f()J

    move-result-wide v1

    iget-object v3, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v4, v3

    const/4 v4, 0x0

    :goto_1f
    const/4 v5, 0x2

    if-ge v4, v5, :cond_36

    aget-object v5, v3, v4

    invoke-interface {v5}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v6

    if-eqz v6, :cond_2e

    invoke-static {v5, v1, v2}, Lcom/daaw/u68;->O(Lcom/daaw/i98;J)V

    :cond_2e
    add-int/lit8 v4, v4, 0x1

    goto :goto_1f

    :cond_2f
    const/4 v1, 0x0

    :goto_20
    iget-object v2, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v2, v2

    const/4 v2, 0x2

    if-ge v1, v2, :cond_36

    invoke-virtual {v8, v1}, Lcom/daaw/fw8;->b(I)Z

    move-result v2

    invoke-virtual {v14, v1}, Lcom/daaw/fw8;->b(I)Z

    move-result v3

    if-eqz v2, :cond_31

    iget-object v2, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lcom/daaw/i98;->g()Z

    move-result v2

    if-nez v2, :cond_31

    iget-object v2, v11, Lcom/daaw/u68;->r:[Lcom/daaw/l98;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lcom/daaw/l98;->zzb()I

    iget-object v2, v8, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object v2, v2, v1

    iget-object v4, v14, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object v4, v4, v1

    if-eqz v3, :cond_30

    invoke-virtual {v4, v2}, Lcom/daaw/x98;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_31

    :cond_30
    iget-object v2, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v2, v2, v1

    invoke-virtual {v9}, Lcom/daaw/j78;->f()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/daaw/u68;->O(Lcom/daaw/i98;J)V

    :cond_31
    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_32
    :goto_21
    move-wide/from16 v22, v13

    move-wide v12, v5

    iget-object v2, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-boolean v2, v2, Lcom/daaw/m78;->i:Z

    if-nez v2, :cond_33

    iget-boolean v2, v11, Lcom/daaw/u68;->N:Z

    if-eqz v2, :cond_36

    :cond_33
    const/4 v2, 0x0

    :goto_22
    iget-object v3, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v4, v3

    const/4 v4, 0x2

    if-ge v2, v4, :cond_36

    aget-object v3, v3, v2

    iget-object v4, v1, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v4, v4, v2

    if-eqz v4, :cond_35

    invoke-interface {v3}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v5

    if-ne v5, v4, :cond_35

    invoke-interface {v3}, Lcom/daaw/i98;->j()Z

    move-result v4

    if-eqz v4, :cond_35

    iget-object v4, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v4, v4, Lcom/daaw/m78;->e:J

    cmp-long v6, v4, v12

    if-eqz v6, :cond_34

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-eqz v8, :cond_34

    invoke-virtual {v1}, Lcom/daaw/j78;->e()J

    move-result-wide v6

    add-long/2addr v4, v6

    move-wide v5, v4

    goto :goto_23

    :cond_34
    move-wide v5, v12

    :goto_23
    invoke-static {v3, v5, v6}, Lcom/daaw/u68;->O(Lcom/daaw/i98;J)V

    :cond_35
    add-int/lit8 v2, v2, 0x1

    goto :goto_22

    :cond_36
    :goto_24
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    if-eqz v1, :cond_3d

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-eq v2, v1, :cond_3d

    iget-boolean v1, v1, Lcom/daaw/j78;->g:Z

    if-eqz v1, :cond_37

    goto :goto_27

    :cond_37
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_25
    iget-object v5, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v6, v5

    const/4 v6, 0x2

    if-ge v3, v6, :cond_3c

    aget-object v5, v5, v3

    invoke-static {v5}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v6

    if-eqz v6, :cond_3b

    invoke-interface {v5}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v6

    iget-object v7, v1, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v7, v7, v3

    invoke-virtual {v2, v3}, Lcom/daaw/fw8;->b(I)Z

    move-result v8

    if-eqz v8, :cond_38

    if-ne v6, v7, :cond_38

    goto :goto_26

    :cond_38
    invoke-interface {v5}, Lcom/daaw/i98;->g()Z

    move-result v6

    if-nez v6, :cond_39

    iget-object v6, v2, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    aget-object v6, v6, v3

    invoke-static {v6}, Lcom/daaw/u68;->L(Lcom/daaw/tv8;)[Lcom/daaw/f92;

    move-result-object v25

    iget-object v6, v1, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v26, v6, v3

    invoke-virtual {v1}, Lcom/daaw/j78;->f()J

    move-result-wide v27

    invoke-virtual {v1}, Lcom/daaw/j78;->e()J

    move-result-wide v29

    move-object/from16 v24, v5

    invoke-interface/range {v24 .. v30}, Lcom/daaw/i98;->f([Lcom/daaw/f92;Lcom/daaw/mt8;JJ)V

    goto :goto_26

    :cond_39
    invoke-interface {v5}, Lcom/daaw/i98;->zzM()Z

    move-result v6

    if-eqz v6, :cond_3a

    invoke-virtual {v11, v5}, Lcom/daaw/u68;->e(Lcom/daaw/i98;)V

    goto :goto_26

    :cond_3a
    const/4 v4, 0x1

    :cond_3b
    :goto_26
    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    :cond_3c
    if-nez v4, :cond_3d

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->f()V

    :cond_3d
    :goto_27
    const/4 v1, 0x0

    :goto_28
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->J()Z

    move-result v2

    if-eqz v2, :cond_40

    iget-boolean v2, v11, Lcom/daaw/u68;->N:Z

    if-nez v2, :cond_40

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-eqz v2, :cond_40

    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    if-eqz v2, :cond_40

    iget-wide v3, v11, Lcom/daaw/u68;->X:J

    invoke-virtual {v2}, Lcom/daaw/j78;->f()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-ltz v7, :cond_40

    iget-boolean v2, v2, Lcom/daaw/j78;->g:Z

    if-eqz v2, :cond_40

    if-eqz v1, :cond_3e

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->n()V

    :cond_3e
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->d()Lcom/daaw/j78;

    move-result-object v1
    :try_end_e
    .catch Lcom/daaw/vu7; {:try_start_e .. :try_end_e} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_e .. :try_end_e} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_e .. :try_end_e} :catch_3
    .catch Lcom/daaw/s56; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_0

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_f
    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v2, v2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v3, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v3, v3, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    iget-object v3, v3, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3f

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v3, v2, Lcom/daaw/md3;->b:I

    if-ne v3, v10, :cond_3f

    iget-object v3, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v3, v3, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    iget v4, v3, Lcom/daaw/md3;->b:I

    if-ne v4, v10, :cond_3f

    iget v2, v2, Lcom/daaw/md3;->e:I

    iget v3, v3, Lcom/daaw/md3;->e:I

    if-eq v2, v3, :cond_3f

    const/4 v2, 0x1

    goto :goto_29

    :cond_3f
    const/4 v2, 0x0

    :goto_29
    iget-object v1, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v3, v1, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    iget-wide v7, v1, Lcom/daaw/m78;->b:J

    iget-wide v5, v1, Lcom/daaw/m78;->c:J

    const/4 v1, 0x1

    xor-int/lit8 v9, v2, 0x1

    const/4 v14, 0x0

    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v7

    const/4 v15, 0x3

    const/16 v19, -0x1

    move v10, v14

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->p()V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->C()V

    const/4 v1, 0x1

    const/4 v10, -0x1

    const/4 v15, 0x0

    goto/16 :goto_28

    :cond_40
    const/4 v15, 0x3

    goto :goto_2b

    :cond_41
    :goto_2a
    move-wide/from16 v22, v13

    const/4 v15, 0x3

    move-wide v12, v5

    :goto_2b
    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v1, Lcom/daaw/q88;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6f

    const/4 v2, 0x4

    if-ne v1, v2, :cond_42

    goto/16 :goto_4c

    :cond_42
    iget-object v1, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v1

    const-wide/16 v2, 0xa

    move-wide/from16 v4, v22

    if-nez v1, :cond_43

    invoke-virtual {v11, v4, v5, v2, v3}, Lcom/daaw/u68;->s(JJ)V

    goto/16 :goto_4c

    :cond_43
    sget v6, Lcom/daaw/it5;->a:I

    const-string v6, "doSomeWork"

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->C()V

    iget-boolean v6, v1, Lcom/daaw/j78;->d:Z

    const-wide/16 v7, 0x3e8

    if-eqz v6, :cond_4c

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    mul-long v9, v9, v7

    iget-object v6, v1, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    iget-object v14, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v2, v14, Lcom/daaw/q88;->r:J

    iget-wide v7, v11, Lcom/daaw/u68;->B:J

    sub-long/2addr v2, v7

    const/4 v7, 0x0

    invoke-interface {v6, v2, v3, v7}, Lcom/daaw/nr8;->e(JZ)V

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v6, 0x0

    :goto_2c
    iget-object v7, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v8, v7

    const/4 v8, 0x2

    if-ge v6, v8, :cond_4d

    aget-object v7, v7, v6

    invoke-static {v7}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v8

    if-nez v8, :cond_44

    goto :goto_33

    :cond_44
    iget-wide v12, v11, Lcom/daaw/u68;->X:J

    invoke-interface {v7, v12, v13, v9, v10}, Lcom/daaw/i98;->i(JJ)V

    if-eqz v3, :cond_45

    invoke-interface {v7}, Lcom/daaw/i98;->zzM()Z

    move-result v3

    if-eqz v3, :cond_45

    const/4 v3, 0x1

    goto :goto_2d

    :cond_45
    const/4 v3, 0x0

    :goto_2d
    iget-object v8, v1, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v8, v8, v6

    invoke-interface {v7}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v12

    if-eq v8, v12, :cond_46

    const/4 v8, 0x1

    goto :goto_2e

    :cond_46
    const/4 v8, 0x0

    :goto_2e
    if-nez v8, :cond_47

    invoke-interface {v7}, Lcom/daaw/i98;->j()Z

    move-result v12

    if-eqz v12, :cond_47

    const/4 v12, 0x1

    goto :goto_2f

    :cond_47
    const/4 v12, 0x0

    :goto_2f
    if-nez v8, :cond_49

    if-nez v12, :cond_49

    invoke-interface {v7}, Lcom/daaw/i98;->zzN()Z

    move-result v8

    if-nez v8, :cond_49

    invoke-interface {v7}, Lcom/daaw/i98;->zzM()Z

    move-result v8

    if-eqz v8, :cond_48

    goto :goto_30

    :cond_48
    const/4 v8, 0x0

    goto :goto_31

    :cond_49
    :goto_30
    const/4 v8, 0x1

    :goto_31
    if-eqz v2, :cond_4a

    if-eqz v8, :cond_4a

    const/4 v2, 0x1

    goto :goto_32

    :cond_4a
    const/4 v2, 0x0

    :goto_32
    if-nez v8, :cond_4b

    invoke-interface {v7}, Lcom/daaw/i98;->zzr()V

    :cond_4b
    :goto_33
    add-int/lit8 v6, v6, 0x1

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2c

    :cond_4c
    iget-object v2, v1, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    invoke-interface {v2}, Lcom/daaw/nr8;->zzk()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    :cond_4d
    iget-object v6, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v6, v6, Lcom/daaw/m78;->e:J

    if-eqz v3, :cond_51

    iget-boolean v3, v1, Lcom/daaw/j78;->d:Z

    if-eqz v3, :cond_51

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v6, v8

    if-eqz v3, :cond_4e

    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v8, v3, Lcom/daaw/q88;->r:J

    cmp-long v3, v6, v8

    if-gtz v3, :cond_51

    :cond_4e
    iget-boolean v3, v11, Lcom/daaw/u68;->N:Z

    if-eqz v3, :cond_4f

    const/4 v3, 0x0

    iput-boolean v3, v11, Lcom/daaw/u68;->N:Z

    iget-object v6, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v6, v6, Lcom/daaw/q88;->m:I

    const/4 v7, 0x5

    invoke-virtual {v11, v3, v6, v3, v7}, Lcom/daaw/u68;->v(ZIZI)V

    :cond_4f
    iget-object v3, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-boolean v3, v3, Lcom/daaw/m78;->i:Z

    if-eqz v3, :cond_51

    const/4 v3, 0x4

    invoke-virtual {v11, v3}, Lcom/daaw/u68;->w(I)V

    :cond_50
    :goto_34
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->z()V

    goto/16 :goto_3d

    :cond_51
    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v6, v3, Lcom/daaw/q88;->e:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_58

    iget v6, v11, Lcom/daaw/u68;->V:I

    if-nez v6, :cond_52

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->H()Z

    move-result v3

    if-eqz v3, :cond_58

    goto/16 :goto_38

    :cond_52
    if-nez v2, :cond_53

    goto/16 :goto_39

    :cond_53
    iget-boolean v6, v3, Lcom/daaw/q88;->g:Z

    if-eqz v6, :cond_57

    iget-object v3, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v6, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v6}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v6

    iget-object v6, v6, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v6, v6, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {v11, v3, v6}, Lcom/daaw/u68;->K(Lcom/daaw/l64;Lcom/daaw/pr8;)Z

    move-result v3

    if-eqz v3, :cond_54

    iget-object v3, v11, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    invoke-virtual {v3}, Lcom/daaw/zo7;->b()J

    move-result-wide v6

    move-wide/from16 v31, v6

    goto :goto_35

    :cond_54
    const-wide v31, -0x7fffffffffffffffL    # -4.9E-324

    :goto_35
    iget-object v3, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v3}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/j78;->r()Z

    move-result v6

    if-eqz v6, :cond_55

    iget-object v6, v3, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-boolean v6, v6, Lcom/daaw/m78;->i:Z

    if-eqz v6, :cond_55

    const/4 v6, 0x1

    goto :goto_36

    :cond_55
    const/4 v6, 0x0

    :goto_36
    iget-object v7, v3, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v7, v7, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {v7}, Lcom/daaw/md3;->b()Z

    move-result v7

    if-eqz v7, :cond_56

    iget-boolean v3, v3, Lcom/daaw/j78;->d:Z

    if-nez v3, :cond_56

    const/4 v3, 0x1

    goto :goto_37

    :cond_56
    const/4 v3, 0x0

    :goto_37
    if-nez v6, :cond_57

    if-nez v3, :cond_57

    iget-object v3, v11, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->c0()J

    move-result-wide v27

    iget-object v6, v11, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v6}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v6

    iget v6, v6, Lcom/daaw/pp3;->a:F

    iget-boolean v7, v11, Lcom/daaw/u68;->O:Z

    move-object/from16 v26, v3

    move/from16 v29, v6

    move/from16 v30, v7

    invoke-interface/range {v26 .. v32}, Lcom/daaw/d78;->a(JFZJ)Z

    move-result v3

    if-eqz v3, :cond_58

    :cond_57
    :goto_38
    invoke-virtual {v11, v15}, Lcom/daaw/u68;->w(I)V

    const/4 v2, 0x0

    iput-object v2, v11, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->J()Z

    move-result v2

    if-eqz v2, :cond_5c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->x()V

    goto :goto_3d

    :cond_58
    :goto_39
    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v3, v3, Lcom/daaw/q88;->e:I

    if-ne v3, v15, :cond_5c

    iget v3, v11, Lcom/daaw/u68;->V:I

    if-nez v3, :cond_59

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->H()Z

    move-result v2

    if-nez v2, :cond_5c

    goto :goto_3a

    :cond_59
    if-nez v2, :cond_5c

    :goto_3a
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->J()Z

    move-result v2

    iput-boolean v2, v11, Lcom/daaw/u68;->O:Z

    const/4 v2, 0x2

    invoke-virtual {v11, v2}, Lcom/daaw/u68;->w(I)V

    iget-boolean v2, v11, Lcom/daaw/u68;->O:Z

    if-eqz v2, :cond_50

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    :goto_3b
    if-eqz v2, :cond_5b

    invoke-virtual {v2}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v6, v3

    const/4 v7, 0x0

    :goto_3c
    if-ge v7, v6, :cond_5a

    aget-object v8, v3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3c

    :cond_5a
    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    goto :goto_3b

    :cond_5b
    iget-object v2, v11, Lcom/daaw/u68;->d0:Lcom/daaw/zo7;

    invoke-virtual {v2}, Lcom/daaw/zo7;->c()V

    goto/16 :goto_34

    :cond_5c
    :goto_3d
    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v2, v2, Lcom/daaw/q88;->e:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_61

    const/4 v2, 0x0

    :goto_3e
    iget-object v6, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v7, v6

    if-ge v2, v3, :cond_5e

    aget-object v3, v6, v2

    invoke-static {v3}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v3

    if-eqz v3, :cond_5d

    iget-object v3, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v3, v3, v2

    invoke-interface {v3}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v3

    iget-object v6, v1, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v6, v6, v2

    if-ne v3, v6, :cond_5d

    iget-object v3, v11, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v3, v3, v2

    invoke-interface {v3}, Lcom/daaw/i98;->zzr()V

    :cond_5d
    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x2

    goto :goto_3e

    :cond_5e
    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v2, v1, Lcom/daaw/q88;->g:Z

    if-nez v2, :cond_61

    iget-wide v1, v1, Lcom/daaw/q88;->q:J

    const-wide/32 v6, 0x7a120

    cmp-long v3, v1, v6

    if-gez v3, :cond_61

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->F()Z

    move-result v1

    if-eqz v1, :cond_61

    iget-wide v1, v11, Lcom/daaw/u68;->b0:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v6

    if-nez v3, :cond_5f

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    :goto_3f
    iput-wide v1, v11, Lcom/daaw/u68;->b0:J

    goto :goto_40

    :cond_5f
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v6, v11, Lcom/daaw/u68;->b0:J

    sub-long/2addr v1, v6

    const-wide/16 v6, 0xfa0

    cmp-long v3, v1, v6

    if-gez v3, :cond_60

    goto :goto_40

    :cond_60
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Playback stuck buffering and not loading"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_61
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_3f

    :goto_40
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->J()Z

    move-result v1

    if-eqz v1, :cond_62

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v1, Lcom/daaw/q88;->e:I

    if-ne v1, v15, :cond_62

    const/4 v1, 0x1

    goto :goto_41

    :cond_62
    const/4 v1, 0x0

    :goto_41
    iget-boolean v2, v11, Lcom/daaw/u68;->U:Z

    if-eqz v2, :cond_63

    iget-boolean v2, v11, Lcom/daaw/u68;->T:Z

    if-eqz v2, :cond_63

    if-eqz v1, :cond_63

    const/4 v2, 0x1

    goto :goto_42

    :cond_63
    const/4 v2, 0x0

    :goto_42
    iget-object v3, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-boolean v6, v3, Lcom/daaw/q88;->o:Z

    if-eq v6, v2, :cond_64

    new-instance v6, Lcom/daaw/q88;

    iget-object v7, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v8, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v9, v3, Lcom/daaw/q88;->c:J

    iget-wide v12, v3, Lcom/daaw/q88;->d:J

    iget v14, v3, Lcom/daaw/q88;->e:I

    iget-object v15, v3, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    move-wide/from16 v48, v4

    iget-boolean v4, v3, Lcom/daaw/q88;->g:Z

    iget-object v5, v3, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    move/from16 v18, v1

    iget-object v1, v3, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    move/from16 v50, v2

    iget-object v2, v3, Lcom/daaw/q88;->j:Ljava/util/List;

    move-object/from16 v36, v2

    iget-object v2, v3, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    move-object/from16 v37, v2

    iget-boolean v2, v3, Lcom/daaw/q88;->l:Z

    move/from16 v38, v2

    iget v2, v3, Lcom/daaw/q88;->m:I

    move/from16 v39, v2

    iget-object v2, v3, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    move-object/from16 v35, v1

    move-object/from16 v40, v2

    iget-wide v1, v3, Lcom/daaw/q88;->p:J

    move-wide/from16 v41, v1

    iget-wide v1, v3, Lcom/daaw/q88;->q:J

    move-wide/from16 v43, v1

    iget-wide v1, v3, Lcom/daaw/q88;->r:J

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-wide/from16 v27, v9

    move-wide/from16 v29, v12

    move/from16 v31, v14

    move-object/from16 v32, v15

    move/from16 v33, v4

    move-object/from16 v34, v5

    move-wide/from16 v45, v1

    move/from16 v47, v50

    invoke-direct/range {v24 .. v47}, Lcom/daaw/q88;-><init>(Lcom/daaw/l64;Lcom/daaw/pr8;JJILcom/daaw/vu7;ZLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;Lcom/daaw/pr8;ZILcom/daaw/pp3;JJJZ)V

    iput-object v6, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    goto :goto_43

    :cond_64
    move/from16 v18, v1

    move/from16 v50, v2

    move-wide/from16 v48, v4

    :goto_43
    const/4 v1, 0x0

    iput-boolean v1, v11, Lcom/daaw/u68;->T:Z

    if-nez v50, :cond_68

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v1, Lcom/daaw/q88;->e:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_65

    goto :goto_45

    :cond_65
    if-nez v18, :cond_67

    const/4 v2, 0x2

    if-ne v1, v2, :cond_66

    goto :goto_44

    :cond_66
    const/4 v2, 0x3

    if-ne v1, v2, :cond_68

    iget v1, v11, Lcom/daaw/u68;->V:I

    if-eqz v1, :cond_68

    move-wide/from16 v1, v48

    const-wide/16 v3, 0x3e8

    invoke-virtual {v11, v1, v2, v3, v4}, Lcom/daaw/u68;->s(JJ)V

    goto :goto_45

    :cond_67
    :goto_44
    move-wide/from16 v1, v48

    const-wide/16 v3, 0xa

    invoke-virtual {v11, v1, v2, v3, v4}, Lcom/daaw/u68;->s(JJ)V

    :cond_68
    :goto_45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_4c

    :pswitch_18
    iget v2, v1, Landroid/os/Message;->arg1:I

    if-eqz v2, :cond_69

    const/4 v2, 0x1

    goto :goto_46

    :cond_69
    const/4 v2, 0x0

    :goto_46
    iget v1, v1, Landroid/os/Message;->arg2:I

    const/4 v3, 0x1

    invoke-virtual {v11, v2, v1, v3, v3}, Lcom/daaw/u68;->v(ZIZI)V

    goto/16 :goto_4c

    :pswitch_19
    const/4 v2, 0x4

    iget-object v1, v11, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/daaw/o68;->a(I)V

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v1, v1, v3}, Lcom/daaw/u68;->o(ZZZZ)V

    iget-object v1, v11, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    invoke-interface {v1}, Lcom/daaw/d78;->zzb()V

    iget-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v1

    const/4 v3, 0x1

    if-eq v3, v1, :cond_6a

    const/4 v7, 0x2

    goto :goto_47

    :cond_6a
    const/4 v7, 0x4

    :goto_47
    invoke-virtual {v11, v7}, Lcom/daaw/u68;->w(I)V

    iget-object v1, v11, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    iget-object v2, v11, Lcom/daaw/u68;->v:Lcom/daaw/mw8;

    invoke-virtual {v1, v2}, Lcom/daaw/n88;->f(Lcom/daaw/qz6;)V

    iget-object v1, v11, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/daaw/vz4;->i(I)Z
    :try_end_f
    .catch Lcom/daaw/vu7; {:try_start_f .. :try_end_f} :catch_5
    .catch Lcom/daaw/fn8; {:try_start_f .. :try_end_f} :catch_4
    .catch Lcom/daaw/dl3; {:try_start_f .. :try_end_f} :catch_3
    .catch Lcom/daaw/s56; {:try_start_f .. :try_end_f} :catch_2
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_0

    goto :goto_4c

    :catch_0
    move-exception v0

    move-object v1, v0

    instance-of v2, v1, Ljava/lang/IllegalStateException;

    const/16 v3, 0x3ec

    if-nez v2, :cond_6c

    instance-of v2, v1, Ljava/lang/IllegalArgumentException;

    if-eqz v2, :cond_6b

    goto :goto_48

    :cond_6b
    const/16 v12, 0x3e8

    goto :goto_49

    :cond_6c
    :goto_48
    const/16 v12, 0x3ec

    :goto_49
    invoke-static {v1, v12}, Lcom/daaw/vu7;->d(Ljava/lang/RuntimeException;I)Lcom/daaw/vu7;

    move-result-object v1

    const-string v2, "ExoPlayerImplInternal"

    const-string v3, "Playback error"

    invoke-static {v2, v3, v1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v11, v3, v2}, Lcom/daaw/u68;->y(ZZ)V

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v2, v1}, Lcom/daaw/q88;->d(Lcom/daaw/vu7;)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    goto :goto_4c

    :catch_1
    move-exception v0

    move-object v1, v0

    const/16 v2, 0x7d0

    goto :goto_4b

    :catch_2
    move-exception v0

    move-object v1, v0

    iget v2, v1, Lcom/daaw/s56;->p:I

    goto :goto_4b

    :catch_3
    move-exception v0

    move-object v1, v0

    iget v2, v1, Lcom/daaw/dl3;->q:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6e

    iget-boolean v2, v1, Lcom/daaw/dl3;->p:Z

    if-eq v3, v2, :cond_6d

    const/16 v12, 0xbbb

    goto :goto_4a

    :cond_6d
    const/16 v12, 0xbb9

    goto :goto_4a

    :cond_6e
    const/16 v12, 0x3e8

    :goto_4a
    invoke-virtual {v11, v1, v12}, Lcom/daaw/u68;->h(Ljava/io/IOException;I)V

    goto :goto_4c

    :catch_4
    move-exception v0

    move-object v1, v0

    iget v2, v1, Lcom/daaw/fn8;->p:I

    :goto_4b
    invoke-virtual {v11, v1, v2}, Lcom/daaw/u68;->h(Ljava/io/IOException;I)V

    :cond_6f
    :goto_4c
    const/4 v3, 0x1

    goto :goto_4d

    :catch_5
    move-exception v0

    move-object v1, v0

    iget v2, v1, Lcom/daaw/vu7;->s:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_70

    iget-object v2, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v2

    if-eqz v2, :cond_70

    iget-object v2, v2, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v2, v2, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {v1, v2}, Lcom/daaw/vu7;->a(Lcom/daaw/md3;)Lcom/daaw/vu7;

    move-result-object v1

    :cond_70
    iget-boolean v2, v1, Lcom/daaw/vu7;->y:Z

    if-eqz v2, :cond_71

    iget-object v2, v11, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    if-nez v2, :cond_71

    const-string v2, "ExoPlayerImplInternal"

    const-string v3, "Recoverable renderer error"

    invoke-static {v2, v3, v1}, Lcom/daaw/s95;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v1, v11, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    iget-object v2, v11, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v3, 0x19

    invoke-interface {v2, v3, v1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/daaw/vz4;->d(Lcom/daaw/sy4;)Z

    goto :goto_4c

    :cond_71
    iget-object v2, v11, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    if-eqz v2, :cond_72

    const/4 v3, 0x1

    :try_start_10
    new-array v4, v3, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Throwable;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const-class v3, Ljava/lang/Throwable;

    const-string v6, "addSuppressed"

    invoke-virtual {v3, v6, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    aput-object v1, v6, v5

    invoke-virtual {v3, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    :catch_6
    iget-object v1, v11, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    :cond_72
    const-string v2, "ExoPlayerImplInternal"

    const-string v3, "Playback error"

    invoke-static {v2, v3, v1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v11, v3, v2}, Lcom/daaw/u68;->y(ZZ)V

    iget-object v2, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v2, v1}, Lcom/daaw/q88;->d(Lcom/daaw/vu7;)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :goto_4d
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->n()V

    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Z)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v1, v1, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    :goto_0
    iget-object v2, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    invoke-virtual {v2, v1}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v3, v1}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_1
    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    if-nez v0, :cond_2

    iget-wide v3, v1, Lcom/daaw/q88;->r:J

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/j78;->c()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Lcom/daaw/q88;->p:J

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {p0}, Lcom/daaw/u68;->c0()J

    move-result-wide v3

    iput-wide v3, v1, Lcom/daaw/q88;->q:J

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    if-eqz v0, :cond_4

    iget-boolean p1, v0, Lcom/daaw/j78;->d:Z

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lcom/daaw/j78;->h()Lcom/daaw/au8;

    move-result-object p1

    invoke-virtual {v0}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/u68;->B(Lcom/daaw/au8;Lcom/daaw/fw8;)V

    :cond_4
    return-void
.end method

.method public final i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-wide/from16 v5, p4

    iget-boolean v1, v0, Lcom/daaw/u68;->Z:Z

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v7, v1, Lcom/daaw/q88;->r:J

    cmp-long v1, p2, v7

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2, v1}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, v0, Lcom/daaw/u68;->Z:Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->p()V

    iget-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v7, v1, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    iget-object v8, v1, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    iget-object v1, v1, Lcom/daaw/q88;->j:Ljava/util/List;

    iget-object v9, v0, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v9}, Lcom/daaw/n88;->i()Z

    move-result v9

    if-eqz v9, :cond_a

    iget-object v1, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v7, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/j78;->h()Lcom/daaw/au8;

    move-result-object v7

    :goto_2
    if-nez v1, :cond_3

    iget-object v8, v0, Lcom/daaw/u68;->t:Lcom/daaw/fw8;

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v8

    :goto_3
    iget-object v9, v8, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    new-instance v10, Lcom/daaw/v17;

    invoke-direct {v10}, Lcom/daaw/v17;-><init>()V

    array-length v11, v9

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_4
    if-ge v12, v11, :cond_6

    aget-object v14, v9, v12

    if-eqz v14, :cond_5

    invoke-interface {v14, v3}, Lcom/daaw/xv8;->b(I)Lcom/daaw/f92;

    move-result-object v14

    iget-object v14, v14, Lcom/daaw/f92;->j:Lcom/google/android/gms/internal/ads/zzbq;

    if-nez v14, :cond_4

    new-instance v14, Lcom/google/android/gms/internal/ads/zzbq;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    new-array v15, v3, [Lcom/google/android/gms/internal/ads/zzbp;

    invoke-direct {v14, v4, v5, v15}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(J[Lcom/google/android/gms/internal/ads/zzbp;)V

    invoke-virtual {v10, v14}, Lcom/daaw/v17;->f(Ljava/lang/Object;)Lcom/daaw/v17;

    goto :goto_5

    :cond_4
    invoke-virtual {v10, v14}, Lcom/daaw/v17;->f(Ljava/lang/Object;)Lcom/daaw/v17;

    const/4 v13, 0x1

    :cond_5
    :goto_5
    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v5, p4

    goto :goto_4

    :cond_6
    if-eqz v13, :cond_7

    invoke-virtual {v10}, Lcom/daaw/v17;->h()Lcom/daaw/y17;

    move-result-object v3

    goto :goto_6

    :cond_7
    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v3

    :goto_6
    if-eqz v1, :cond_8

    iget-object v4, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v5, v4, Lcom/daaw/m78;->c:J

    move-wide/from16 v9, p4

    cmp-long v11, v5, v9

    if-eqz v11, :cond_9

    invoke-virtual {v4, v9, v10}, Lcom/daaw/m78;->a(J)Lcom/daaw/m78;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    goto :goto_7

    :cond_8
    move-wide/from16 v9, p4

    :cond_9
    :goto_7
    move-object v13, v3

    goto :goto_8

    :cond_a
    move-wide v9, v5

    iget-object v3, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v3, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2, v3}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    sget-object v1, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    iget-object v3, v0, Lcom/daaw/u68;->t:Lcom/daaw/fw8;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v4

    move-object v11, v1

    move-object v12, v3

    move-object v13, v4

    goto :goto_9

    :cond_b
    move-object v13, v1

    :goto_8
    move-object v11, v7

    move-object v12, v8

    :goto_9
    if-eqz p8, :cond_c

    iget-object v1, v0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    move/from16 v3, p9

    invoke-virtual {v1, v3}, Lcom/daaw/o68;->d(I)V

    :cond_c
    iget-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->c0()J

    move-result-wide v14

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide v9, v14

    invoke-virtual/range {v1 .. v13}, Lcom/daaw/q88;->b(Lcom/daaw/pr8;JJJJLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;)Lcom/daaw/q88;

    move-result-object v1

    return-object v1
.end method

.method public final j(Lcom/daaw/l64;Z)V
    .locals 28

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    iget-object v0, v11, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v8, v11, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    iget-object v9, v11, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget v4, v11, Lcom/daaw/u68;->Q:I

    iget-boolean v10, v11, Lcom/daaw/u68;->R:Z

    iget-object v13, v11, Lcom/daaw/u68;->z:Lcom/daaw/i54;

    iget-object v14, v11, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v1

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/q88;->h()Lcom/daaw/pr8;

    move-result-object v0

    move-object v8, v0

    move-object v15, v11

    move-wide/from16 v13, v16

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v9, -0x1

    const-wide/16 v10, 0x0

    goto/16 :goto_12

    :cond_0
    iget-object v1, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v15, v1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-static {v0, v14}, Lcom/daaw/u68;->I(Lcom/daaw/q88;Lcom/daaw/d34;)Z

    move-result v19

    iget-object v2, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2}, Lcom/daaw/md3;->b()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v19, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v5, v0, Lcom/daaw/q88;->r:J

    goto :goto_1

    :cond_2
    :goto_0
    iget-wide v5, v0, Lcom/daaw/q88;->c:J

    :goto_1
    move-wide/from16 v23, v5

    if-eqz v8, :cond_6

    const/4 v5, 0x1

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v2, v8

    const/4 v11, 0x1

    move v3, v5

    const/4 v7, -0x1

    move v5, v10

    move-object v11, v6

    move-object v6, v13

    move-object/from16 v21, v9

    const/4 v9, -0x1

    move-object v7, v14

    invoke-static/range {v1 .. v7}, Lcom/daaw/u68;->h0(Lcom/daaw/l64;Lcom/daaw/r68;ZIZLcom/daaw/i54;Lcom/daaw/d34;)Landroid/util/Pair;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v12, v10}, Lcom/daaw/l64;->g(Z)I

    move-result v1

    move v5, v1

    move-wide/from16 v1, v23

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_4

    :cond_3
    iget-wide v2, v8, Lcom/daaw/r68;->c:J

    cmp-long v4, v2, v16

    if-nez v4, :cond_4

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v12, v1, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget v5, v1, Lcom/daaw/d34;->c:I

    move-wide/from16 v1, v23

    const/4 v3, 0x0

    goto :goto_2

    :cond_4
    iget-object v15, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v5, -0x1

    :goto_2
    iget v4, v0, Lcom/daaw/q88;->e:I

    const/4 v6, 0x4

    if-ne v4, v6, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    move v6, v3

    const/4 v3, 0x0

    :goto_4
    move v10, v4

    move v4, v5

    move/from16 v22, v6

    const-wide/16 v7, 0x0

    :goto_5
    move-object/from16 v27, v15

    move v15, v3

    move-object/from16 v3, v27

    goto/16 :goto_a

    :cond_6
    move-object v11, v1

    move-object/from16 v21, v9

    const/4 v9, -0x1

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v12, v10}, Lcom/daaw/l64;->g(Z)I

    move-result v1

    :goto_6
    move v4, v1

    move-object v3, v15

    move-wide/from16 v1, v23

    const-wide/16 v7, 0x0

    :goto_7
    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    goto/16 :goto_a

    :cond_7
    invoke-virtual {v12, v15}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v9, :cond_9

    iget-object v6, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    move-object v1, v13

    move-object v2, v14

    move v3, v4

    move v4, v10

    move-object v5, v15

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v7}, Lcom/daaw/u68;->S(Lcom/daaw/i54;Lcom/daaw/d34;IZLjava/lang/Object;Lcom/daaw/l64;Lcom/daaw/l64;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {v12, v10}, Lcom/daaw/l64;->g(Z)I

    move-result v1

    const/4 v3, 0x1

    goto :goto_8

    :cond_8
    invoke-virtual {v12, v1, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget v1, v1, Lcom/daaw/d34;->c:I

    const/4 v3, 0x0

    :goto_8
    move v4, v1

    move-wide/from16 v1, v23

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/16 v22, 0x0

    goto :goto_5

    :cond_9
    cmp-long v1, v23, v16

    if-nez v1, :cond_a

    invoke-virtual {v12, v15, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget v1, v1, Lcom/daaw/d34;->c:I

    goto :goto_6

    :cond_a
    if-eqz v19, :cond_c

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v2, v11, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget v2, v14, Lcom/daaw/d34;->c:I

    const-wide/16 v7, 0x0

    invoke-virtual {v1, v2, v13, v7, v8}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v1

    iget v1, v1, Lcom/daaw/i54;->m:I

    iget-object v2, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v3, v11, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v2

    if-ne v1, v2, :cond_b

    invoke-virtual {v12, v15, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget v4, v1, Lcom/daaw/d34;->c:I

    move-object/from16 v1, p1

    move-object v2, v13

    move-object v3, v14

    move-wide/from16 v5, v23

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v15, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_9

    :cond_b
    move-wide/from16 v1, v23

    :goto_9
    move-object v3, v15

    const/4 v4, -0x1

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x1

    goto :goto_a

    :cond_c
    const-wide/16 v7, 0x0

    move-object v3, v15

    move-wide/from16 v1, v23

    const/4 v4, -0x1

    goto/16 :goto_7

    :goto_a
    if-eq v4, v9, :cond_d

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v1, p1

    move-object v2, v13

    move-object v3, v14

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    move-wide v4, v1

    move-wide/from16 v1, v16

    goto :goto_b

    :cond_d
    move-wide v4, v1

    :goto_b
    move-object/from16 v6, v21

    invoke-virtual {v6, v12, v3, v4, v5}, Lcom/daaw/s78;->k(Lcom/daaw/l64;Ljava/lang/Object;J)Lcom/daaw/pr8;

    move-result-object v6

    iget v13, v6, Lcom/daaw/md3;->e:I

    if-eq v13, v9, :cond_f

    iget v7, v11, Lcom/daaw/md3;->e:I

    if-eq v7, v9, :cond_e

    if-lt v13, v7, :cond_e

    goto :goto_c

    :cond_e
    const/4 v7, 0x0

    goto :goto_d

    :cond_f
    :goto_c
    const/4 v7, 0x1

    :goto_d
    iget-object v8, v11, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v11}, Lcom/daaw/md3;->b()Z

    move-result v8

    if-nez v8, :cond_10

    invoke-virtual {v6}, Lcom/daaw/md3;->b()Z

    move-result v8

    if-nez v8, :cond_10

    if-eqz v7, :cond_10

    const/4 v7, 0x1

    goto :goto_e

    :cond_10
    const/4 v7, 0x0

    :goto_e
    invoke-virtual {v12, v3, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v3

    if-nez v19, :cond_13

    cmp-long v8, v23, v1

    if-nez v8, :cond_13

    iget-object v8, v11, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v13, v6, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v8, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_f

    :cond_11
    invoke-virtual {v11}, Lcom/daaw/md3;->b()Z

    move-result v8

    if-eqz v8, :cond_12

    iget v8, v11, Lcom/daaw/md3;->b:I

    invoke-virtual {v3, v8}, Lcom/daaw/d34;->l(I)Z

    :cond_12
    invoke-virtual {v6}, Lcom/daaw/md3;->b()Z

    move-result v8

    if-eqz v8, :cond_13

    iget v8, v6, Lcom/daaw/md3;->b:I

    invoke-virtual {v3, v8}, Lcom/daaw/d34;->l(I)Z

    :cond_13
    :goto_f
    const/4 v3, 0x1

    if-eq v3, v7, :cond_14

    goto :goto_10

    :cond_14
    move-object v6, v11

    :goto_10
    invoke-virtual {v6}, Lcom/daaw/md3;->b()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v6, v11}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    iget-wide v4, v0, Lcom/daaw/q88;->r:J

    goto :goto_11

    :cond_15
    iget-object v0, v6, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v12, v0, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget v0, v6, Lcom/daaw/md3;->c:I

    iget v4, v6, Lcom/daaw/md3;->b:I

    invoke-virtual {v14, v4}, Lcom/daaw/d34;->e(I)I

    move-result v4

    if-ne v0, v4, :cond_16

    invoke-virtual {v14}, Lcom/daaw/d34;->i()J

    :cond_16
    const-wide/16 v4, 0x0

    :cond_17
    :goto_11
    move-wide v13, v1

    move-object v8, v6

    move v2, v10

    move v3, v15

    move/from16 v7, v22

    move-object/from16 v15, p0

    move-wide v10, v4

    const/4 v5, 0x1

    :goto_12
    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0, v8}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->r:J

    cmp-long v4, v10, v0

    if-eqz v4, :cond_18

    goto :goto_13

    :cond_18
    const/16 v19, 0x0

    goto :goto_14

    :cond_19
    :goto_13
    const/16 v19, 0x1

    :goto_14
    const/16 v20, 0x3

    if-eqz v3, :cond_1b

    :try_start_0
    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v0, v0, Lcom/daaw/q88;->e:I

    if-eq v0, v5, :cond_1a

    const/4 v3, 0x4

    invoke-virtual {v15, v3}, Lcom/daaw/u68;->w(I)V

    goto :goto_15

    :cond_1a
    const/4 v3, 0x4

    :goto_15
    const/4 v4, 0x0

    invoke-virtual {v15, v4, v4, v4, v5}, Lcom/daaw/u68;->o(ZZZZ)V

    goto :goto_17

    :catchall_0
    move-exception v0

    move-wide/from16 v25, v13

    :goto_16
    const/4 v9, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    goto/16 :goto_20

    :cond_1b
    const/4 v3, 0x4

    const/4 v4, 0x0

    :goto_17
    if-nez v19, :cond_22

    iget-object v1, v15, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-wide v3, v15, Lcom/daaw/u68;->X:J

    invoke-virtual {v1}, Lcom/daaw/s78;->h()Lcom/daaw/j78;

    move-result-object v0

    const-wide/high16 v21, -0x8000000000000000L

    if-nez v0, :cond_1c

    move-wide/from16 v25, v13

    const-wide/16 v5, 0x0

    goto :goto_1a

    :cond_1c
    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v23

    iget-boolean v2, v0, Lcom/daaw/j78;->d:Z

    if-nez v2, :cond_1d

    move-wide/from16 v25, v13

    move-wide/from16 v5, v23

    goto :goto_1a

    :cond_1d
    move-wide/from16 v5, v23

    const/4 v2, 0x0

    :goto_18
    iget-object v9, v15, Lcom/daaw/u68;->p:[Lcom/daaw/i98;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-wide/from16 v25, v13

    :try_start_1
    array-length v13, v9

    const/4 v13, 0x2

    if-ge v2, v13, :cond_21

    aget-object v9, v9, v2

    invoke-static {v9}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v9

    if-eqz v9, :cond_20

    iget-object v9, v15, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v9, v9, v2

    invoke-interface {v9}, Lcom/daaw/i98;->zzm()Lcom/daaw/mt8;

    move-result-object v9

    iget-object v13, v0, Lcom/daaw/j78;->c:[Lcom/daaw/mt8;

    aget-object v13, v13, v2

    if-eq v9, v13, :cond_1e

    goto :goto_19

    :cond_1e
    iget-object v9, v15, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    aget-object v9, v9, v2

    invoke-interface {v9}, Lcom/daaw/i98;->zzf()J

    move-result-wide v13

    cmp-long v9, v13, v21

    if-nez v9, :cond_1f

    move-wide/from16 v5, v21

    goto :goto_1a

    :cond_1f
    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_20
    :goto_19
    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v13, v25

    goto :goto_18

    :cond_21
    :goto_1a
    move-object/from16 v2, p1

    const/4 v9, 0x4

    const/4 v13, 0x0

    const/4 v9, 0x1

    const/4 v14, 0x0

    :try_start_2
    invoke-virtual/range {v1 .. v6}, Lcom/daaw/s78;->r(Lcom/daaw/l64;JJ)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-virtual {v15, v13}, Lcom/daaw/u68;->t(Z)V

    goto :goto_1c

    :catchall_1
    move-exception v0

    goto :goto_16

    :cond_22
    move-wide/from16 v25, v13

    const/4 v9, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, v15, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    :goto_1b
    if-eqz v0, :cond_24

    iget-object v1, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v1, v1, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    invoke-virtual {v1, v8}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    iget-object v1, v15, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    iget-object v3, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    invoke-virtual {v1, v12, v3}, Lcom/daaw/s78;->j(Lcom/daaw/l64;Lcom/daaw/m78;)Lcom/daaw/m78;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    invoke-virtual {v0}, Lcom/daaw/j78;->q()V

    :cond_23
    invoke-virtual {v0}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v0

    goto :goto_1b

    :cond_24
    invoke-virtual {v15, v8, v10, v11, v2}, Lcom/daaw/u68;->e0(Lcom/daaw/pr8;JZ)J

    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-wide v10, v0

    :cond_25
    :goto_1c
    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v4, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v5, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    if-eq v9, v7, :cond_26

    move-wide/from16 v6, v16

    goto :goto_1d

    :cond_26
    move-wide v6, v10

    :goto_1d
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/u68;->D(Lcom/daaw/l64;Lcom/daaw/pr8;Lcom/daaw/l64;Lcom/daaw/pr8;J)V

    if-nez v19, :cond_27

    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->c:J

    cmp-long v2, v25, v0

    if-eqz v2, :cond_2a

    :cond_27
    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v1, v1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    if-eqz v19, :cond_28

    if-eqz p2, :cond_28

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v2

    if-nez v2, :cond_28

    iget-object v2, v15, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/d34;->f:Z

    if-nez v0, :cond_28

    goto :goto_1e

    :cond_28
    const/4 v9, 0x0

    :goto_1e
    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v5, v0, Lcom/daaw/q88;->d:J

    invoke-virtual {v12, v1}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_29

    const/16 v18, 0x4

    goto :goto_1f

    :cond_29
    const/16 v18, 0x3

    :goto_1f
    move-object/from16 v1, p0

    move-object v2, v8

    move-wide v3, v10

    move-wide v7, v5

    move-wide/from16 v5, v25

    move/from16 v10, v18

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v0

    iput-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_2a
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->p()V

    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v15, v12, v0}, Lcom/daaw/u68;->r(Lcom/daaw/l64;Lcom/daaw/l64;)V

    iget-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v0, v12}, Lcom/daaw/q88;->f(Lcom/daaw/l64;)Lcom/daaw/q88;

    move-result-object v0

    iput-object v0, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-nez v0, :cond_2b

    iput-object v14, v15, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    :cond_2b
    invoke-virtual {v15, v13}, Lcom/daaw/u68;->i(Z)V

    return-void

    :catchall_2
    move-exception v0

    :goto_20
    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v4, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v5, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    if-eq v9, v7, :cond_2c

    move-wide/from16 v6, v16

    goto :goto_21

    :cond_2c
    move-wide v6, v10

    :goto_21
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/u68;->D(Lcom/daaw/l64;Lcom/daaw/pr8;Lcom/daaw/l64;Lcom/daaw/pr8;J)V

    if-nez v19, :cond_2d

    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v1, v1, Lcom/daaw/q88;->c:J

    cmp-long v3, v25, v1

    if-eqz v3, :cond_30

    :cond_2d
    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v2, v2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    if-eqz v19, :cond_2e

    if-eqz p2, :cond_2e

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v3

    if-nez v3, :cond_2e

    iget-object v3, v15, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v1

    iget-boolean v1, v1, Lcom/daaw/d34;->f:Z

    if-nez v1, :cond_2e

    goto :goto_22

    :cond_2e
    const/4 v9, 0x0

    :goto_22
    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v5, v1, Lcom/daaw/q88;->d:J

    invoke-virtual {v12, v2}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2f

    const/16 v18, 0x4

    goto :goto_23

    :cond_2f
    const/16 v18, 0x3

    :goto_23
    move-object/from16 v1, p0

    move-object v2, v8

    move-wide v3, v10

    move-wide v7, v5

    move-wide/from16 v5, v25

    move/from16 v10, v18

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_30
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/u68;->p()V

    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v15, v12, v1}, Lcom/daaw/u68;->r(Lcom/daaw/l64;Lcom/daaw/l64;)V

    iget-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v1, v12}, Lcom/daaw/q88;->f(Lcom/daaw/l64;)Lcom/daaw/q88;

    move-result-object v1

    iput-object v1, v15, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_31

    iput-object v14, v15, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    :cond_31
    invoke-virtual {v15, v13}, Lcom/daaw/u68;->i(Z)V

    goto :goto_25

    :goto_24
    throw v0

    :goto_25
    goto :goto_24
.end method

.method public final k(Lcom/daaw/pp3;Z)V
    .locals 2

    iget v0, p1, Lcom/daaw/pp3;->a:F

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/daaw/u68;->l(Lcom/daaw/pp3;FZZ)V

    return-void
.end method

.method public final l(Lcom/daaw/pp3;FZZ)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    iget-object v1, v0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/o68;->a(I)V

    :cond_0
    iget-object v14, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    new-instance v13, Lcom/daaw/q88;

    move-object v1, v13

    iget-object v2, v14, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v3, v14, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v4, v14, Lcom/daaw/q88;->c:J

    iget-wide v6, v14, Lcom/daaw/q88;->d:J

    iget v8, v14, Lcom/daaw/q88;->e:I

    iget-object v9, v14, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    iget-boolean v10, v14, Lcom/daaw/q88;->g:Z

    iget-object v11, v14, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    iget-object v12, v14, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    move-object/from16 p3, v13

    iget-object v13, v14, Lcom/daaw/q88;->j:Ljava/util/List;

    move-object/from16 v25, p3

    iget-object v15, v14, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    move-object v0, v14

    move-object v14, v15

    iget-boolean v15, v0, Lcom/daaw/q88;->l:Z

    move-object/from16 p3, v1

    iget v1, v0, Lcom/daaw/q88;->m:I

    move/from16 v16, v1

    move-object/from16 p4, v2

    iget-wide v1, v0, Lcom/daaw/q88;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/daaw/q88;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/daaw/q88;->r:J

    move-wide/from16 v22, v1

    iget-boolean v0, v0, Lcom/daaw/q88;->o:Z

    move/from16 v24, v0

    move-object/from16 v17, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-direct/range {v1 .. v24}, Lcom/daaw/q88;-><init>(Lcom/daaw/l64;Lcom/daaw/pr8;JJILcom/daaw/vu7;ZLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;Lcom/daaw/pr8;ZILcom/daaw/pp3;JJJZ)V

    move-object/from16 v0, p0

    move-object/from16 v1, v25

    iput-object v1, v0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_1
    move-object/from16 v1, p1

    iget v2, v1, Lcom/daaw/pp3;->a:F

    iget-object v2, v0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v4

    iget-object v4, v4, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v5, v4

    :goto_1
    if-ge v3, v5, :cond_2

    aget-object v6, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object v2

    goto :goto_0

    :cond_3
    iget-object v2, v0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v4, v2

    :goto_2
    const/4 v4, 0x2

    if-ge v3, v4, :cond_5

    aget-object v4, v2, v3

    if-eqz v4, :cond_4

    iget v5, v1, Lcom/daaw/pp3;->a:F

    move/from16 v6, p2

    invoke-interface {v4, v6, v5}, Lcom/daaw/i98;->e(FF)V

    goto :goto_3

    :cond_4
    move/from16 v6, p2

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final m()V
    .locals 12

    invoke-virtual {p0}, Lcom/daaw/u68;->F()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/j78;->d()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/daaw/u68;->d0(J)J

    move-result-wide v2

    iget-object v4, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v4}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v4

    if-ne v0, v4, :cond_1

    iget-wide v4, p0, Lcom/daaw/u68;->X:J

    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v6

    goto :goto_0

    :cond_1
    iget-wide v4, p0, Lcom/daaw/u68;->X:J

    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget-object v0, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-wide v6, v0, Lcom/daaw/m78;->b:J

    :goto_0
    sub-long/2addr v4, v6

    move-wide v10, v4

    iget-object v4, p0, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    iget-object v0, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    iget v9, v0, Lcom/daaw/pp3;->a:F

    move-wide v5, v10

    move-wide v7, v2

    invoke-interface/range {v4 .. v9}, Lcom/daaw/d78;->c(JJF)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/32 v4, 0x7a120

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    iget-wide v4, p0, Lcom/daaw/u68;->B:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_2

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/j78;->a:Lcom/daaw/nr8;

    iget-object v4, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v4, v4, Lcom/daaw/q88;->r:J

    invoke-interface {v0, v4, v5, v1}, Lcom/daaw/nr8;->e(JZ)V

    iget-object v4, p0, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    iget-object v0, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0}, Lcom/daaw/is7;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    iget v9, v0, Lcom/daaw/pp3;->a:F

    move-wide v5, v10

    move-wide v7, v2

    invoke-interface/range {v4 .. v9}, Lcom/daaw/d78;->c(JJF)Z

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v0

    :goto_1
    iput-boolean v1, p0, Lcom/daaw/u68;->P:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->f()Lcom/daaw/j78;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/u68;->X:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/j78;->k(J)V

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/u68;->A()V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {v0, v1}, Lcom/daaw/o68;->c(Lcom/daaw/q88;)V

    iget-object v0, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-static {v0}, Lcom/daaw/o68;->e(Lcom/daaw/o68;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/u68;->c0:Lcom/daaw/x38;

    iget-object v1, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    iget-object v0, v0, Lcom/daaw/x38;->a:Lcom/daaw/j58;

    invoke-virtual {v0, v1}, Lcom/daaw/j58;->u(Lcom/daaw/o68;)V

    new-instance v0, Lcom/daaw/o68;

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-direct {v0, v1}, Lcom/daaw/o68;-><init>(Lcom/daaw/q88;)V

    iput-object v0, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    :cond_0
    return-void
.end method

.method public final o(ZZZZ)V
    .locals 29

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Lcom/daaw/vz4;->zze(I)V

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/daaw/u68;->a0:Lcom/daaw/vu7;

    const/4 v4, 0x0

    iput-boolean v4, v1, Lcom/daaw/u68;->O:Z

    iget-object v0, v1, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0}, Lcom/daaw/is7;->f()V

    const-wide v5, 0xe8d4a51000L

    iput-wide v5, v1, Lcom/daaw/u68;->X:J

    iget-object v5, v1, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v0, v5

    const/4 v6, 0x0

    :goto_0
    const-string v7, "ExoPlayerImplInternal"

    if-ge v6, v2, :cond_0

    aget-object v0, v5, v6

    :try_start_0
    invoke-virtual {v1, v0}, Lcom/daaw/u68;->e(Lcom/daaw/i98;)V
    :try_end_0
    .catch Lcom/daaw/vu7; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    const-string v8, "Disable failed."

    invoke-static {v7, v8, v0}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    iget-object v5, v1, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v0, v5

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v2, :cond_2

    aget-object v0, v5, v6

    iget-object v8, v1, Lcom/daaw/u68;->q:Ljava/util/Set;

    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    :try_start_1
    invoke-interface {v0}, Lcom/daaw/i98;->zzA()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v8, v0

    const-string v0, "Reset failed."

    invoke-static {v7, v0, v8}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_2
    iput v4, v1, Lcom/daaw/u68;->V:I

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v2, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v5, v0, Lcom/daaw/q88;->r:J

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v7, v1, Lcom/daaw/u68;->A:Lcom/daaw/d34;

    invoke-static {v0, v7}, Lcom/daaw/u68;->I(Lcom/daaw/q88;Lcom/daaw/d34;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v7, v0, Lcom/daaw/q88;->r:J

    goto :goto_6

    :cond_4
    :goto_5
    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v7, v0, Lcom/daaw/q88;->c:J

    :goto_6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p2, :cond_6

    iput-object v3, v1, Lcom/daaw/u68;->W:Lcom/daaw/r68;

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1, v0}, Lcom/daaw/u68;->g0(Lcom/daaw/l64;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/pr8;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2, v0}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    move-object/from16 v18, v2

    move-wide/from16 v26, v5

    move-wide v8, v9

    goto :goto_8

    :cond_5
    move-object/from16 v18, v2

    move-wide/from16 v26, v5

    move-wide v8, v9

    goto :goto_7

    :cond_6
    move-object/from16 v18, v2

    move-wide/from16 v26, v5

    move-wide v8, v7

    :goto_7
    const/4 v0, 0x0

    :goto_8
    iget-object v2, v1, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v2}, Lcom/daaw/s78;->l()V

    iput-boolean v4, v1, Lcom/daaw/u68;->P:Z

    new-instance v2, Lcom/daaw/q88;

    iget-object v4, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-object v6, v4, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget v12, v4, Lcom/daaw/q88;->e:I

    if-eqz p4, :cond_7

    goto :goto_9

    :cond_7
    iget-object v3, v4, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    :goto_9
    move-object v13, v3

    if-eqz v0, :cond_8

    sget-object v3, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    goto :goto_a

    :cond_8
    iget-object v3, v4, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    :goto_a
    move-object v15, v3

    if-eqz v0, :cond_9

    iget-object v3, v1, Lcom/daaw/u68;->t:Lcom/daaw/fw8;

    goto :goto_b

    :cond_9
    iget-object v3, v4, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    :goto_b
    move-object/from16 v16, v3

    if-eqz v0, :cond_a

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v0

    goto :goto_c

    :cond_a
    iget-object v0, v4, Lcom/daaw/q88;->j:Ljava/util/List;

    :goto_c
    move-object/from16 v17, v0

    iget-object v0, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    const/4 v14, 0x0

    iget-boolean v3, v0, Lcom/daaw/q88;->l:Z

    move/from16 v19, v3

    iget v3, v0, Lcom/daaw/q88;->m:I

    move/from16 v20, v3

    iget-object v0, v0, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    move-object/from16 v21, v0

    const-wide/16 v24, 0x0

    const/16 v28, 0x0

    move-object v5, v2

    move-object/from16 v7, v18

    move-wide/from16 v10, v26

    move-wide/from16 v22, v26

    invoke-direct/range {v5 .. v28}, Lcom/daaw/q88;-><init>(Lcom/daaw/l64;Lcom/daaw/pr8;JJILcom/daaw/vu7;ZLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;Lcom/daaw/pr8;ZILcom/daaw/pp3;JJJZ)V

    iput-object v2, v1, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    if-eqz p3, :cond_b

    iget-object v0, v1, Lcom/daaw/u68;->G:Lcom/daaw/n88;

    invoke-virtual {v0}, Lcom/daaw/n88;->g()V

    :cond_b
    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-boolean v0, v0, Lcom/daaw/m78;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/u68;->M:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/u68;->N:Z

    return-void
.end method

.method public final q(J)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, 0xe8d4a51000L

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/j78;->e()J

    move-result-wide v0

    :goto_0
    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/u68;->X:J

    iget-object v0, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/is7;->d(J)V

    iget-object p1, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length p2, p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    aget-object v1, p1, v0

    invoke-static {v1}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcom/daaw/u68;->X:J

    invoke-interface {v1, v2, v3}, Lcom/daaw/i98;->b(J)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p1}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object p1

    :goto_2
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object p1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final r(Lcom/daaw/l64;Lcom/daaw/l64;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/daaw/l64;->o()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-gez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/daaw/u68;->D:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e68;

    iget-object p1, p1, Lcom/daaw/e68;->p:Ljava/lang/Object;

    sget p1, Lcom/daaw/it5;->a:I

    const/4 p1, 0x0

    throw p1
.end method

.method public final s(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    add-long/2addr p1, p3

    const/4 p3, 0x2

    invoke-interface {v0, p3, p1, p2}, Lcom/daaw/vz4;->g(IJ)Z

    return-void
.end method

.method public final t(Z)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {v0}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/j78;->f:Lcom/daaw/m78;

    iget-object v0, v0, Lcom/daaw/m78;->a:Lcom/daaw/pr8;

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v3, v1, Lcom/daaw/q88;->r:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/u68;->f0(Lcom/daaw/pr8;JZZ)J

    move-result-wide v3

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v1, v1, Lcom/daaw/q88;->r:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_0

    iget-object v1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget-wide v5, v1, Lcom/daaw/q88;->c:J

    iget-wide v7, v1, Lcom/daaw/q88;->d:J

    const/4 v10, 0x5

    move-object v1, p0

    move-object v2, v0

    move v9, p1

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/u68;->i0(Lcom/daaw/pr8;JJJZI)Lcom/daaw/q88;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_0
    return-void
.end method

.method public final u(Lcom/daaw/z88;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/z88;->b()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/u68;->y:Landroid/os/Looper;

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lcom/daaw/u68;->M(Lcom/daaw/z88;)V

    iget-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget p1, p1, Lcom/daaw/q88;->e:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v0, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {p1, v1}, Lcom/daaw/vz4;->i(I)Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0xf

    invoke-interface {v0, v1, p1}, Lcom/daaw/vz4;->c(ILjava/lang/Object;)Lcom/daaw/sy4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sy4;->zza()V

    return-void
.end method

.method public final v(ZIZI)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {v0, p3}, Lcom/daaw/o68;->a(I)V

    iget-object p3, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {p3, p4}, Lcom/daaw/o68;->b(I)V

    iget-object p3, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/q88;->c(ZI)Lcom/daaw/q88;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/u68;->O:Z

    iget-object p2, p0, Lcom/daaw/u68;->F:Lcom/daaw/s78;

    invoke-virtual {p2}, Lcom/daaw/s78;->g()Lcom/daaw/j78;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/daaw/j78;->i()Lcom/daaw/fw8;

    move-result-object p3

    iget-object p3, p3, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    array-length p4, p3

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p4, :cond_0

    aget-object v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/daaw/j78;->g()Lcom/daaw/j78;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/u68;->J()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/u68;->z()V

    invoke-virtual {p0}, Lcom/daaw/u68;->C()V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget p1, p1, Lcom/daaw/q88;->e:I

    const/4 p2, 0x3

    const/4 p3, 0x2

    if-ne p1, p2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/u68;->x()V

    iget-object p1, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {p1, p3}, Lcom/daaw/vz4;->i(I)Z

    return-void

    :cond_3
    if-ne p1, p3, :cond_4

    iget-object p1, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    invoke-interface {p1, p3}, Lcom/daaw/vz4;->i(I)Z

    :cond_4
    return-void
.end method

.method public final w(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    iget v1, v0, Lcom/daaw/q88;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/daaw/u68;->b0:J

    :cond_0
    invoke-virtual {v0, p1}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/u68;->J:Lcom/daaw/q88;

    :cond_1
    return-void
.end method

.method public final x()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/u68;->O:Z

    iget-object v1, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v1}, Lcom/daaw/is7;->e()V

    iget-object v1, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v2, v1

    :goto_0
    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    aget-object v2, v1, v0

    invoke-static {v2}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/daaw/i98;->zzE()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final y(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/daaw/u68;->S:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lcom/daaw/u68;->o(ZZZZ)V

    iget-object p1, p0, Lcom/daaw/u68;->K:Lcom/daaw/o68;

    invoke-virtual {p1, p2}, Lcom/daaw/o68;->a(I)V

    iget-object p1, p0, Lcom/daaw/u68;->u:Lcom/daaw/d78;

    invoke-interface {p1}, Lcom/daaw/d78;->zzd()V

    invoke-virtual {p0, v1}, Lcom/daaw/u68;->w(I)V

    return-void
.end method

.method public final z()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/u68;->C:Lcom/daaw/is7;

    invoke-virtual {v0}, Lcom/daaw/is7;->f()V

    iget-object v0, p0, Lcom/daaw/u68;->p:[Lcom/daaw/i98;

    array-length v1, v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-static {v2}, Lcom/daaw/u68;->G(Lcom/daaw/i98;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lcom/daaw/u68;->N(Lcom/daaw/i98;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final zzh()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0x16

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->i(I)Z

    return-void
.end method

.method public final zzj()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u68;->w:Lcom/daaw/vz4;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->i(I)Z

    return-void
.end method
