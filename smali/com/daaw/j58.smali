.class public final Lcom/daaw/j58;
.super Lcom/daaw/gf8;
.source ""


# static fields
.field public static final synthetic j0:I


# instance fields
.field public final A:Lcom/daaw/cb8;

.field public final B:J

.field public C:I

.field public D:I

.field public E:Z

.field public F:I

.field public G:Lcom/daaw/aa8;

.field public H:Lcom/daaw/lu3;

.field public I:Lcom/daaw/gc3;

.field public J:Lcom/daaw/gc3;

.field public K:Lcom/daaw/f92;

.field public L:Lcom/daaw/f92;

.field public M:Landroid/media/AudioTrack;

.field public N:Ljava/lang/Object;

.field public O:Landroid/view/Surface;

.field public P:I

.field public Q:I

.field public R:I

.field public S:Lcom/daaw/ql7;

.field public T:Lcom/daaw/ql7;

.field public U:I

.field public V:Lcom/daaw/o98;

.field public W:F

.field public X:Z

.field public Y:Lcom/daaw/rn4;

.field public Z:Z

.field public a0:Z

.field public final b:Lcom/daaw/fw8;

.field public b0:Lcom/daaw/is8;

.field public final c:Lcom/daaw/lu3;

.field public c0:Lcom/daaw/ll4;

.field public final d:Lcom/daaw/ds4;

.field public d0:Lcom/daaw/gc3;

.field public final e:Landroid/content/Context;

.field public e0:Lcom/daaw/q88;

.field public final f:Lcom/daaw/ty3;

.field public f0:I

.field public final g:[Lcom/daaw/i98;

.field public g0:J

.field public final h:Lcom/daaw/zv8;

.field public final h0:Lcom/daaw/x38;

.field public final i:Lcom/daaw/vz4;

.field public i0:Lcom/daaw/wt8;

.field public final j:Lcom/daaw/u68;

.field public final k:Lcom/daaw/k65;

.field public final l:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final m:Lcom/daaw/d34;

.field public final n:Ljava/util/List;

.field public final o:Z

.field public final p:Lcom/daaw/or8;

.field public final q:Lcom/daaw/fb8;

.field public final r:Landroid/os/Looper;

.field public final s:Lcom/daaw/mw8;

.field public final t:Lcom/daaw/xp4;

.field public final u:Lcom/daaw/y48;

.field public final v:Lcom/daaw/d58;

.field public final w:Lcom/daaw/ye7;

.field public final x:Lcom/daaw/kj7;

.field public final y:Lcom/daaw/wa8;

.field public final z:Lcom/daaw/za8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer"

    invoke-static {v0}, Lcom/daaw/k63;->b(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d18;Lcom/daaw/ty3;)V
    .locals 42
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-direct/range {p0 .. p0}, Lcom/daaw/gf8;-><init>()V

    new-instance v3, Lcom/daaw/ds4;

    sget-object v4, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    invoke-direct {v3, v4}, Lcom/daaw/ds4;-><init>(Lcom/daaw/xp4;)V

    iput-object v3, v1, Lcom/daaw/j58;->d:Lcom/daaw/ds4;

    :try_start_0
    const-string v4, "ExoPlayerImpl"

    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/daaw/it5;->e:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Init "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " [AndroidXMedia3/1.0.0-beta02] ["

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/daaw/s95;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/daaw/d18;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/j58;->e:Landroid/content/Context;

    iget-object v5, v0, Lcom/daaw/d18;->h:Lcom/daaw/ey6;

    iget-object v6, v0, Lcom/daaw/d18;->b:Lcom/daaw/xp4;

    invoke-interface {v5, v6}, Lcom/daaw/ey6;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    iget-object v6, v0, Lcom/daaw/d18;->j:Lcom/daaw/o98;

    iput-object v6, v1, Lcom/daaw/j58;->V:Lcom/daaw/o98;

    iget v6, v0, Lcom/daaw/d18;->k:I

    iput v6, v1, Lcom/daaw/j58;->P:I

    const/4 v6, 0x0

    iput-boolean v6, v1, Lcom/daaw/j58;->X:Z

    iget-wide v7, v0, Lcom/daaw/d18;->o:J

    iput-wide v7, v1, Lcom/daaw/j58;->B:J

    new-instance v15, Lcom/daaw/y48;

    const/4 v8, 0x0

    invoke-direct {v15, v1, v8}, Lcom/daaw/y48;-><init>(Lcom/daaw/j58;Lcom/daaw/v48;)V

    iput-object v15, v1, Lcom/daaw/j58;->u:Lcom/daaw/y48;

    new-instance v7, Lcom/daaw/d58;

    invoke-direct {v7, v8}, Lcom/daaw/d58;-><init>(Lcom/daaw/a58;)V

    iput-object v7, v1, Lcom/daaw/j58;->v:Lcom/daaw/d58;

    new-instance v14, Landroid/os/Handler;

    iget-object v9, v0, Lcom/daaw/d18;->i:Landroid/os/Looper;

    invoke-direct {v14, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v9, v0, Lcom/daaw/d18;->c:Lcom/daaw/iz6;

    check-cast v9, Lcom/daaw/gz7;

    iget-object v9, v9, Lcom/daaw/gz7;->p:Lcom/daaw/g64;

    move-object v10, v14

    move-object v11, v15

    move-object v12, v15

    move-object v13, v15

    move-object/from16 v26, v14

    move-object v14, v15

    invoke-virtual/range {v9 .. v14}, Lcom/daaw/g64;->a(Landroid/os/Handler;Lcom/daaw/wy8;Lcom/daaw/fj8;Lcom/daaw/du8;Lcom/daaw/kq8;)[Lcom/daaw/i98;

    move-result-object v9

    iput-object v9, v1, Lcom/daaw/j58;->g:[Lcom/daaw/i98;

    array-length v10, v9

    iget-object v10, v0, Lcom/daaw/d18;->e:Lcom/daaw/iz6;

    invoke-interface {v10}, Lcom/daaw/iz6;->zza()Ljava/lang/Object;

    move-result-object v10

    move-object v14, v10

    check-cast v14, Lcom/daaw/zv8;

    iput-object v14, v1, Lcom/daaw/j58;->h:Lcom/daaw/zv8;

    iget-object v10, v0, Lcom/daaw/d18;->d:Lcom/daaw/iz6;

    check-cast v10, Lcom/daaw/j08;

    iget-object v10, v10, Lcom/daaw/j08;->p:Landroid/content/Context;

    invoke-static {v10}, Lcom/daaw/d18;->a(Landroid/content/Context;)Lcom/daaw/or8;

    move-result-object v10

    iput-object v10, v1, Lcom/daaw/j58;->p:Lcom/daaw/or8;

    iget-object v10, v0, Lcom/daaw/d18;->g:Lcom/daaw/iz6;

    check-cast v10, Lcom/daaw/x08;

    iget-object v10, v10, Lcom/daaw/x08;->p:Landroid/content/Context;

    invoke-static {v10}, Lcom/daaw/qw8;->d(Landroid/content/Context;)Lcom/daaw/qw8;

    move-result-object v13

    iput-object v13, v1, Lcom/daaw/j58;->s:Lcom/daaw/mw8;

    iget-boolean v10, v0, Lcom/daaw/d18;->l:Z

    iput-boolean v10, v1, Lcom/daaw/j58;->o:Z

    iget-object v10, v0, Lcom/daaw/d18;->m:Lcom/daaw/aa8;

    iput-object v10, v1, Lcom/daaw/j58;->G:Lcom/daaw/aa8;

    iget-object v12, v0, Lcom/daaw/d18;->i:Landroid/os/Looper;

    iput-object v12, v1, Lcom/daaw/j58;->r:Landroid/os/Looper;

    iget-object v11, v0, Lcom/daaw/d18;->b:Lcom/daaw/xp4;

    iput-object v11, v1, Lcom/daaw/j58;->t:Lcom/daaw/xp4;

    iput-object v2, v1, Lcom/daaw/j58;->f:Lcom/daaw/ty3;

    new-instance v10, Lcom/daaw/k65;

    new-instance v8, Lcom/daaw/u38;

    invoke-direct {v8, v1}, Lcom/daaw/u38;-><init>(Lcom/daaw/j58;)V

    invoke-direct {v10, v12, v11, v8}, Lcom/daaw/k65;-><init>(Landroid/os/Looper;Lcom/daaw/xp4;Lcom/daaw/e45;)V

    iput-object v10, v1, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Lcom/daaw/j58;->l:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v1, Lcom/daaw/j58;->n:Ljava/util/List;

    new-instance v6, Lcom/daaw/wt8;

    move-object/from16 v17, v7

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lcom/daaw/wt8;-><init>(I)V

    iput-object v6, v1, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    new-instance v6, Lcom/daaw/fw8;

    array-length v7, v9

    const/4 v7, 0x2

    move-object/from16 v18, v8

    new-array v8, v7, [Lcom/daaw/x98;

    move-object/from16 v19, v10

    new-array v10, v7, [Lcom/daaw/tv8;

    sget-object v7, Lcom/daaw/ni4;->b:Lcom/daaw/ni4;

    move-object/from16 v21, v15

    const/4 v15, 0x0

    invoke-direct {v6, v8, v10, v7, v15}, Lcom/daaw/fw8;-><init>([Lcom/daaw/x98;[Lcom/daaw/tv8;Lcom/daaw/ni4;Ljava/lang/Object;)V

    iput-object v6, v1, Lcom/daaw/j58;->b:Lcom/daaw/fw8;

    new-instance v7, Lcom/daaw/d34;

    invoke-direct {v7}, Lcom/daaw/d34;-><init>()V

    iput-object v7, v1, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    new-instance v7, Lcom/daaw/ls3;

    invoke-direct {v7}, Lcom/daaw/ls3;-><init>()V

    const/16 v15, 0x15

    new-array v8, v15, [I

    const/4 v10, 0x1

    const/16 v22, 0x0

    aput v10, v8, v22

    const/16 v20, 0x2

    aput v20, v8, v10

    const/4 v10, 0x3

    aput v10, v8, v20

    const/16 v23, 0xd

    aput v23, v8, v10

    const/16 v24, 0xe

    const/4 v15, 0x4

    aput v24, v8, v15

    const/16 v25, 0xf

    const/4 v15, 0x5

    aput v25, v8, v15

    const/16 v29, 0x10

    move-object/from16 v30, v3

    const/4 v3, 0x6

    aput v29, v8, v3

    const/16 v31, 0x11

    const/4 v3, 0x7

    aput v31, v8, v3

    const/16 v32, 0x12

    const/16 v3, 0x8

    aput v32, v8, v3

    const/16 v33, 0x13

    const/16 v3, 0x9

    aput v33, v8, v3

    const/16 v10, 0x1f

    const/16 v3, 0xa

    aput v10, v8, v3

    const/16 v34, 0xb

    const/16 v35, 0x14

    aput v35, v8, v34

    const/16 v34, 0xc

    const/16 v36, 0x1e

    aput v36, v8, v34

    const/16 v27, 0x15

    aput v27, v8, v23

    const/16 v23, 0x16

    aput v23, v8, v24

    const/16 v23, 0x17

    aput v23, v8, v25

    const/16 v23, 0x18

    aput v23, v8, v29

    const/16 v23, 0x19

    aput v23, v8, v31

    const/16 v23, 0x1a

    aput v23, v8, v32

    const/16 v23, 0x1b

    aput v23, v8, v33

    const/16 v23, 0x1c

    aput v23, v8, v35

    invoke-virtual {v7, v8}, Lcom/daaw/ls3;->c([I)Lcom/daaw/ls3;

    invoke-virtual {v14}, Lcom/daaw/zv8;->c()Z

    const/16 v8, 0x1d

    const/4 v15, 0x1

    invoke-virtual {v7, v8, v15}, Lcom/daaw/ls3;->d(IZ)Lcom/daaw/ls3;

    invoke-virtual {v7}, Lcom/daaw/ls3;->e()Lcom/daaw/lu3;

    move-result-object v7

    iput-object v7, v1, Lcom/daaw/j58;->c:Lcom/daaw/lu3;

    new-instance v8, Lcom/daaw/ls3;

    invoke-direct {v8}, Lcom/daaw/ls3;-><init>()V

    invoke-virtual {v8, v7}, Lcom/daaw/ls3;->b(Lcom/daaw/lu3;)Lcom/daaw/ls3;

    const/4 v7, 0x4

    invoke-virtual {v8, v7}, Lcom/daaw/ls3;->a(I)Lcom/daaw/ls3;

    invoke-virtual {v8, v3}, Lcom/daaw/ls3;->a(I)Lcom/daaw/ls3;

    invoke-virtual {v8}, Lcom/daaw/ls3;->e()Lcom/daaw/lu3;

    move-result-object v8

    iput-object v8, v1, Lcom/daaw/j58;->H:Lcom/daaw/lu3;

    const/4 v8, 0x0

    invoke-interface {v11, v12, v8}, Lcom/daaw/xp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/vz4;

    move-result-object v7

    iput-object v7, v1, Lcom/daaw/j58;->i:Lcom/daaw/vz4;

    new-instance v7, Lcom/daaw/x38;

    invoke-direct {v7, v1}, Lcom/daaw/x38;-><init>(Lcom/daaw/j58;)V

    iput-object v7, v1, Lcom/daaw/j58;->h0:Lcom/daaw/x38;

    invoke-static {v6}, Lcom/daaw/q88;->g(Lcom/daaw/fw8;)Lcom/daaw/q88;

    move-result-object v8

    iput-object v8, v1, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-interface {v5, v2, v12}, Lcom/daaw/fb8;->R(Lcom/daaw/ty3;Landroid/os/Looper;)V

    sget v2, Lcom/daaw/it5;->a:I

    if-ge v2, v10, :cond_0

    new-instance v8, Lcom/daaw/lh8;

    invoke-direct {v8}, Lcom/daaw/lh8;-><init>()V

    :goto_0
    move-object/from16 v24, v8

    goto :goto_1

    :cond_0
    iget-boolean v8, v0, Lcom/daaw/d18;->p:Z

    invoke-static {v4, v1, v8}, Lcom/daaw/d48;->a(Landroid/content/Context;Lcom/daaw/j58;Z)Lcom/daaw/lh8;

    move-result-object v8

    goto :goto_0

    :goto_1
    new-instance v10, Lcom/daaw/u68;

    iget-object v8, v0, Lcom/daaw/d18;->f:Lcom/daaw/iz6;

    invoke-interface {v8}, Lcom/daaw/iz6;->zza()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v8

    check-cast v22, Lcom/daaw/d78;

    iget-object v8, v1, Lcom/daaw/j58;->G:Lcom/daaw/aa8;

    iget-object v3, v0, Lcom/daaw/d18;->r:Lcom/daaw/zo7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 p2, v2

    :try_start_1
    iget-wide v1, v0, Lcom/daaw/d18;->n:J

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v25, 0x0

    move-object/from16 v28, v7

    move-object/from16 v37, v17

    const/16 v17, 0x4

    move-object v7, v10

    move-object/from16 v16, v8

    move-object/from16 v34, v18

    const/4 v0, 0x0

    move-object v8, v9

    move-object v9, v14

    move-object v0, v10

    move-object/from16 v15, v19

    move-object v10, v6

    move-object v6, v11

    move-object/from16 v11, v22

    move-object/from16 v35, v12

    move-object v12, v13

    move-object/from16 v38, v13

    move/from16 v13, v31

    move-object/from16 v39, v14

    move/from16 v14, v32

    move-object/from16 v41, v15

    move-object/from16 v40, v21

    move-object v15, v5

    move-object/from16 v17, v3

    move-wide/from16 v18, v1

    move/from16 v20, v33

    move-object/from16 v21, v35

    move-object/from16 v22, v6

    move-object/from16 v23, v28

    invoke-direct/range {v7 .. v25}, Lcom/daaw/u68;-><init>([Lcom/daaw/i98;Lcom/daaw/zv8;Lcom/daaw/fw8;Lcom/daaw/d78;Lcom/daaw/mw8;IZLcom/daaw/fb8;Lcom/daaw/aa8;Lcom/daaw/zo7;JZLandroid/os/Looper;Lcom/daaw/xp4;Lcom/daaw/x38;Lcom/daaw/lh8;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v1, p0

    :try_start_2
    iput-object v0, v1, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Lcom/daaw/j58;->W:F

    sget-object v0, Lcom/daaw/gc3;->v:Lcom/daaw/gc3;

    iput-object v0, v1, Lcom/daaw/j58;->I:Lcom/daaw/gc3;

    iput-object v0, v1, Lcom/daaw/j58;->J:Lcom/daaw/gc3;

    iput-object v0, v1, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    const/4 v0, -0x1

    iput v0, v1, Lcom/daaw/j58;->f0:I

    move/from16 v0, p2

    const/16 v2, 0x15

    if-ge v0, v2, :cond_3

    iget-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    :cond_1
    iget-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    if-nez v0, :cond_2

    new-instance v0, Landroid/media/AudioTrack;

    const/4 v7, 0x3

    const/16 v8, 0xfa0

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v13}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    :cond_2
    iget-object v0, v1, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    :goto_2
    iput v0, v1, Lcom/daaw/j58;->U:I

    goto :goto_3

    :cond_3
    invoke-static {v4}, Lcom/daaw/it5;->S(Landroid/content/Context;)I

    move-result v0

    goto :goto_2

    :goto_3
    sget-object v0, Lcom/daaw/rn4;->b:Lcom/daaw/rn4;

    iput-object v0, v1, Lcom/daaw/j58;->Y:Lcom/daaw/rn4;

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/daaw/j58;->Z:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v41

    :try_start_3
    invoke-virtual {v2, v5}, Lcom/daaw/k65;->b(Ljava/lang/Object;)V

    new-instance v2, Landroid/os/Handler;

    move-object/from16 v3, v35

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v3, v38

    invoke-interface {v3, v2, v5}, Lcom/daaw/mw8;->c(Landroid/os/Handler;Lcom/daaw/lw8;)V

    move-object/from16 v3, v34

    move-object/from16 v2, v40

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/daaw/ye7;

    move-object/from16 v4, p1

    iget-object v5, v4, Lcom/daaw/d18;->a:Landroid/content/Context;

    move-object/from16 v6, v26

    invoke-direct {v3, v5, v6, v2}, Lcom/daaw/ye7;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/vd7;)V

    iput-object v3, v1, Lcom/daaw/j58;->w:Lcom/daaw/ye7;

    new-instance v3, Lcom/daaw/kj7;

    iget-object v5, v4, Lcom/daaw/d18;->a:Landroid/content/Context;

    invoke-direct {v3, v5, v6, v2}, Lcom/daaw/kj7;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/hi7;)V

    iput-object v3, v1, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    const/4 v3, 0x0

    invoke-static {v3, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v3, Lcom/daaw/wa8;

    iget-object v5, v4, Lcom/daaw/d18;->a:Landroid/content/Context;

    invoke-direct {v3, v5, v6, v2}, Lcom/daaw/wa8;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/la8;)V

    iput-object v3, v1, Lcom/daaw/j58;->y:Lcom/daaw/wa8;

    iget-object v2, v1, Lcom/daaw/j58;->V:Lcom/daaw/o98;

    iget v2, v2, Lcom/daaw/o98;->a:I

    const/4 v2, 0x3

    invoke-virtual {v3, v2}, Lcom/daaw/wa8;->f(I)V

    new-instance v5, Lcom/daaw/za8;

    iget-object v6, v4, Lcom/daaw/d18;->a:Landroid/content/Context;

    invoke-direct {v5, v6}, Lcom/daaw/za8;-><init>(Landroid/content/Context;)V

    iput-object v5, v1, Lcom/daaw/j58;->z:Lcom/daaw/za8;

    new-instance v5, Lcom/daaw/cb8;

    iget-object v4, v4, Lcom/daaw/d18;->a:Landroid/content/Context;

    invoke-direct {v5, v4}, Lcom/daaw/cb8;-><init>(Landroid/content/Context;)V

    iput-object v5, v1, Lcom/daaw/j58;->A:Lcom/daaw/cb8;

    invoke-static {v3}, Lcom/daaw/j58;->M(Lcom/daaw/wa8;)Lcom/daaw/is8;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/j58;->b0:Lcom/daaw/is8;

    sget-object v3, Lcom/daaw/ll4;->e:Lcom/daaw/ll4;

    iput-object v3, v1, Lcom/daaw/j58;->c0:Lcom/daaw/ll4;

    iget-object v3, v1, Lcom/daaw/j58;->V:Lcom/daaw/o98;

    move-object/from16 v10, v39

    invoke-virtual {v10, v3}, Lcom/daaw/zv8;->b(Lcom/daaw/o98;)V

    iget v3, v1, Lcom/daaw/j58;->U:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0xa

    invoke-virtual {v1, v0, v4, v3}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    iget v3, v1, Lcom/daaw/j58;->U:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x2

    invoke-virtual {v1, v5, v4, v3}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    iget-object v3, v1, Lcom/daaw/j58;->V:Lcom/daaw/o98;

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    iget v2, v1, Lcom/daaw/j58;->P:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v5, v3, v2}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    invoke-virtual {v1, v5, v3, v2}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    iget-boolean v2, v1, Lcom/daaw/j58;->X:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    invoke-virtual {v1, v0, v3, v2}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    move-object/from16 v0, v37

    const/4 v2, 0x7

    invoke-virtual {v1, v5, v2, v0}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    const/16 v2, 0x8

    const/4 v3, 0x6

    invoke-virtual {v1, v3, v2, v0}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual/range {v30 .. v30}, Lcom/daaw/ds4;->e()Z

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_4
    iget-object v2, v1, Lcom/daaw/j58;->d:Lcom/daaw/ds4;

    invoke-virtual {v2}, Lcom/daaw/ds4;->e()Z

    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method

.method public static bridge synthetic F(Lcom/daaw/j58;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/j58;->X:Z

    return p0
.end method

.method public static H(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    return v0
.end method

.method public static J(Lcom/daaw/q88;)J
    .locals 7

    new-instance v0, Lcom/daaw/i54;

    invoke-direct {v0}, Lcom/daaw/i54;-><init>()V

    new-instance v1, Lcom/daaw/d34;

    invoke-direct {v1}, Lcom/daaw/d34;-><init>()V

    iget-object v2, p0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v3, p0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v3, v3, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-wide v2, p0, Lcom/daaw/q88;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    iget-object p0, p0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget v1, v1, Lcom/daaw/d34;->c:I

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object p0

    iget-wide v0, p0, Lcom/daaw/i54;->k:J

    :cond_0
    return-wide v2
.end method

.method public static M(Lcom/daaw/wa8;)Lcom/daaw/is8;
    .locals 3

    new-instance v0, Lcom/daaw/is8;

    invoke-virtual {p0}, Lcom/daaw/wa8;->b()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/wa8;->a()I

    move-result p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0}, Lcom/daaw/is8;-><init>(III)V

    return-object v0
.end method

.method public static Y(Lcom/daaw/q88;)Z
    .locals 2

    iget v0, p0, Lcom/daaw/q88;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/daaw/q88;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lcom/daaw/q88;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic Z(ZI)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/j58;->H(ZI)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic c(Lcom/daaw/j58;)Lcom/daaw/wa8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j58;->y:Lcom/daaw/wa8;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/j58;)Lcom/daaw/fb8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    return-object p0
.end method

.method public static bridge synthetic d0(Lcom/daaw/j58;)Lcom/daaw/is8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j58;->b0:Lcom/daaw/is8;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/j58;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j58;->N:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic e0(Lcom/daaw/wa8;)Lcom/daaw/is8;
    .locals 0

    invoke-static {p0}, Lcom/daaw/j58;->M(Lcom/daaw/wa8;)Lcom/daaw/is8;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/j58;Lcom/daaw/ql7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->T:Lcom/daaw/ql7;

    return-void
.end method

.method public static bridge synthetic f0(Lcom/daaw/j58;)Lcom/daaw/k65;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/j58;Lcom/daaw/f92;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->L:Lcom/daaw/f92;

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/j58;Lcom/daaw/is8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->b0:Lcom/daaw/is8;

    return-void
.end method

.method public static bridge synthetic i(Lcom/daaw/j58;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/j58;->X:Z

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/j58;Lcom/daaw/ql7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->S:Lcom/daaw/ql7;

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/j58;Lcom/daaw/f92;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->K:Lcom/daaw/f92;

    return-void
.end method

.method public static bridge synthetic l(Lcom/daaw/j58;Lcom/daaw/ll4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j58;->c0:Lcom/daaw/ll4;

    return-void
.end method

.method public static bridge synthetic m(Lcom/daaw/j58;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/j58;->P(II)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/daaw/j58;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/j58;->R()V

    return-void
.end method

.method public static bridge synthetic o(Lcom/daaw/j58;Landroid/graphics/SurfaceTexture;)V
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v0}, Lcom/daaw/j58;->S(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/j58;->O:Landroid/view/Surface;

    return-void
.end method

.method public static bridge synthetic p(Lcom/daaw/j58;Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/j58;->S(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic q(Lcom/daaw/j58;ZII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/j58;->U(ZII)V

    return-void
.end method

.method public static bridge synthetic r(Lcom/daaw/j58;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/j58;->W()V

    return-void
.end method

.method public static synthetic w(Lcom/daaw/q88;Lcom/daaw/mv3;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/j58;->Y(Lcom/daaw/q88;)Z

    move-result p0

    invoke-interface {p1, p0}, Lcom/daaw/mv3;->t(Z)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/rr8;)V
    .locals 12

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->G()I

    invoke-virtual {p0}, Lcom/daaw/j58;->zzl()J

    iget v1, p0, Lcom/daaw/j58;->C:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/j58;->C:I

    iget-object v1, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v4, v1, -0x1

    :goto_0
    if-ltz v4, :cond_0

    iget-object v5, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    invoke-virtual {v4, v3, v1}, Lcom/daaw/wt8;->h(II)Lcom/daaw/wt8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    new-instance v4, Lcom/daaw/h88;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/rr8;

    iget-boolean v7, p0, Lcom/daaw/j58;->o:Z

    invoke-direct {v4, v6, v7}, Lcom/daaw/h88;-><init>(Lcom/daaw/rr8;Z)V

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    new-instance v7, Lcom/daaw/g58;

    iget-object v8, v4, Lcom/daaw/h88;->b:Ljava/lang/Object;

    iget-object v4, v4, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v4}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v4

    invoke-direct {v7, v8, v4}, Lcom/daaw/g58;-><init>(Ljava/lang/Object;Lcom/daaw/l64;)V

    invoke-interface {v6, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v3, v1}, Lcom/daaw/wt8;->g(II)Lcom/daaw/wt8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    new-instance v0, Lcom/daaw/c98;

    iget-object v1, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    iget-object v4, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    const/4 v6, 0x0

    invoke-direct {v0, v1, v4, v6}, Lcom/daaw/c98;-><init>(Ljava/util/Collection;Lcom/daaw/wt8;[B)V

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/daaw/l64;->c()I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lcom/daaw/na2;

    invoke-direct {v1, v0, v4, v6, v7}, Lcom/daaw/na2;-><init>(Lcom/daaw/l64;IJ)V

    throw v1

    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Lcom/daaw/l64;->g(Z)I

    move-result v1

    iget-object v8, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-virtual {p0, v0, v1, v6, v7}, Lcom/daaw/j58;->L(Lcom/daaw/l64;IJ)Landroid/util/Pair;

    move-result-object v9

    invoke-virtual {p0, v8, v0, v9}, Lcom/daaw/j58;->N(Lcom/daaw/q88;Lcom/daaw/l64;Landroid/util/Pair;)Lcom/daaw/q88;

    move-result-object v8

    iget v9, v8, Lcom/daaw/q88;->e:I

    const/4 v10, 0x4

    if-eq v1, v4, :cond_7

    if-eq v9, v2, :cond_7

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0}, Lcom/daaw/l64;->c()I

    move-result v0

    if-lt v1, v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v9, 0x2

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v9, 0x4

    :cond_7
    :goto_4
    invoke-virtual {v8, v9}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object v10

    iget-object v4, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-static {v6, v7}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v7

    iget-object v9, p0, Lcom/daaw/j58;->i0:Lcom/daaw/wt8;

    move v6, v1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/u68;->Z(Ljava/util/List;IJLcom/daaw/wt8;)V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, v10, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v1, v1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x4

    invoke-virtual {p0, v10}, Lcom/daaw/j58;->I(Lcom/daaw/q88;)J

    move-result-wide v7

    const/4 v9, -0x1

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, v10

    move v10, v11

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    return-void
.end method

.method public final B(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    invoke-virtual {p0}, Lcom/daaw/j58;->zzh()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/kj7;->b(ZI)I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/j58;->H(ZI)I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/j58;->U(ZII)V

    return-void
.end method

.method public final C(Landroid/view/Surface;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0, p1}, Lcom/daaw/j58;->S(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    invoke-virtual {p0, p1, p1}, Lcom/daaw/j58;->P(II)V

    return-void
.end method

.method public final D(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lcom/daaw/it5;->A(FFF)F

    move-result p1

    iget v0, p0, Lcom/daaw/j58;->W:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/j58;->W:F

    invoke-virtual {p0}, Lcom/daaw/j58;->R()V

    iget-object v0, p0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v1, Lcom/daaw/o38;

    invoke-direct {v1, p1}, Lcom/daaw/o38;-><init>(F)V

    const/16 p1, 0x16

    invoke-virtual {v0, p1, v1}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    invoke-virtual {v0}, Lcom/daaw/k65;->c()V

    return-void
.end method

.method public final E()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    invoke-virtual {p0}, Lcom/daaw/j58;->zzq()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/kj7;->b(ZI)I

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/j58;->T(ZLcom/daaw/vu7;)V

    new-instance v0, Lcom/daaw/rn4;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v2, v2, Lcom/daaw/q88;->r:J

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/rn4;-><init>(Ljava/util/List;J)V

    iput-object v0, p0, Lcom/daaw/j58;->Y:Lcom/daaw/rn4;

    return-void
.end method

.method public final G()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/j58;->f0:I

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget v0, v0, Lcom/daaw/d34;->c:I

    return v0
.end method

.method public final I(Lcom/daaw/q88;)J
    .locals 4

    iget-object v0, p1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/j58;->g0:J

    invoke-static {v0, v1}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lcom/daaw/q88;->r:J

    return-wide v0

    :cond_1
    iget-object v0, p1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v1, p1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v2, p1, Lcom/daaw/q88;->r:J

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/j58;->K(Lcom/daaw/l64;Lcom/daaw/pr8;J)J

    return-wide v2
.end method

.method public final K(Lcom/daaw/l64;Lcom/daaw/pr8;J)J
    .locals 1

    iget-object p2, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {p1, p2, v0}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    return-wide p3
.end method

.method public final L(Lcom/daaw/l64;IJ)Landroid/util/Pair;
    .locals 6

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iput p2, p0, Lcom/daaw/j58;->f0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, p1

    if-nez v0, :cond_0

    move-wide p3, v1

    :cond_0
    iput-wide p3, p0, Lcom/daaw/j58;->g0:J

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    invoke-virtual {p1}, Lcom/daaw/l64;->c()I

    move-result v0

    if-lt p2, v0, :cond_3

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/l64;->g(Z)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {p1, p2, p3, v1, v2}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object p3

    iget-wide p3, p3, Lcom/daaw/i54;->k:J

    invoke-static {v1, v2}, Lcom/daaw/it5;->j0(J)J

    move-result-wide p3

    :cond_3
    move v3, p2

    iget-object v1, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    iget-object v2, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-static {p3, p4}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/l64;->l(Lcom/daaw/i54;Lcom/daaw/d34;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final N(Lcom/daaw/q88;Lcom/daaw/l64;Landroid/util/Pair;)Lcom/daaw/q88;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/l64;->o()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-static {v3}, Lcom/daaw/uo4;->d(Z)V

    move-object/from16 v3, p1

    iget-object v6, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual/range {p1 .. p2}, Lcom/daaw/q88;->f(Lcom/daaw/l64;)Lcom/daaw/q88;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/l64;->o()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lcom/daaw/q88;->h()Lcom/daaw/pr8;

    move-result-object v1

    iget-wide v2, v0, Lcom/daaw/j58;->g0:J

    invoke-static {v2, v3}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    sget-object v17, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    iget-object v2, v0, Lcom/daaw/j58;->b:Lcom/daaw/fw8;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v19

    move-object v8, v1

    move-wide v9, v13

    move-wide v11, v13

    move-object/from16 v18, v2

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/q88;->b(Lcom/daaw/pr8;JJJJLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;)Lcom/daaw/q88;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object v1

    iget-wide v2, v1, Lcom/daaw/q88;->r:J

    iput-wide v2, v1, Lcom/daaw/q88;->p:J

    return-object v1

    :cond_2
    iget-object v3, v7, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v3, v3, Lcom/daaw/md3;->a:Ljava/lang/Object;

    sget v8, Lcom/daaw/it5;->a:I

    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v8, v5

    if-eqz v8, :cond_3

    new-instance v9, Lcom/daaw/pr8;

    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v9, v10}, Lcom/daaw/pr8;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v9, v7, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    :goto_2
    move-object v15, v9

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/j58;->zzk()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v9

    invoke-virtual {v6}, Lcom/daaw/l64;->o()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v6, v3, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    :cond_4
    if-nez v8, :cond_a

    cmp-long v2, v13, v9

    if-gez v2, :cond_5

    goto/16 :goto_5

    :cond_5
    cmp-long v2, v13, v9

    if-nez v2, :cond_8

    iget-object v2, v7, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget-object v2, v2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    iget-object v3, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    move-result-object v2

    iget v2, v2, Lcom/daaw/d34;->c:I

    iget-object v3, v15, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v4, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v3, v4}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v3

    iget v3, v3, Lcom/daaw/d34;->c:I

    if-eq v2, v3, :cond_e

    :cond_6
    iget-object v2, v15, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v3, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    invoke-virtual {v15}, Lcom/daaw/md3;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    iget v2, v15, Lcom/daaw/md3;->b:I

    iget v3, v15, Lcom/daaw/md3;->c:I

    invoke-virtual {v1, v2, v3}, Lcom/daaw/d34;->g(II)J

    move-result-wide v1

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    iget-wide v1, v1, Lcom/daaw/d34;->d:J

    :goto_3
    iget-wide v9, v7, Lcom/daaw/q88;->r:J

    iget-wide v11, v7, Lcom/daaw/q88;->r:J

    iget-wide v13, v7, Lcom/daaw/q88;->d:J

    iget-wide v3, v7, Lcom/daaw/q88;->r:J

    sub-long v3, v1, v3

    iget-object v5, v7, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    iget-object v6, v7, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    iget-object v8, v7, Lcom/daaw/q88;->j:Ljava/util/List;

    move-object/from16 v19, v8

    move-object v8, v15

    move-object v0, v15

    move-wide v15, v3

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/q88;->b(Lcom/daaw/pr8;JJJJLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;)Lcom/daaw/q88;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object v7

    goto :goto_4

    :cond_8
    move-object v0, v15

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    const-wide/16 v1, 0x0

    iget-wide v3, v7, Lcom/daaw/q88;->q:J

    sub-long v5, v13, v9

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    iget-wide v1, v7, Lcom/daaw/q88;->p:J

    iget-object v3, v7, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget-object v4, v7, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v3, v4}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    add-long v1, v13, v15

    :cond_9
    iget-object v3, v7, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    iget-object v4, v7, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    iget-object v5, v7, Lcom/daaw/q88;->j:Ljava/util/List;

    move-object v8, v0

    move-wide v9, v13

    move-wide v11, v13

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/q88;->b(Lcom/daaw/pr8;JJJJLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;)Lcom/daaw/q88;

    move-result-object v7

    :goto_4
    iput-wide v1, v7, Lcom/daaw/q88;->p:J

    move-object/from16 v0, p0

    goto :goto_9

    :cond_a
    :goto_5
    move-object v0, v15

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    if-eqz v8, :cond_b

    sget-object v1, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    goto :goto_6

    :cond_b
    iget-object v1, v7, Lcom/daaw/q88;->h:Lcom/daaw/au8;

    :goto_6
    move-object/from16 v17, v1

    move-object v1, v0

    move-object/from16 v0, p0

    if-eqz v8, :cond_c

    iget-object v2, v0, Lcom/daaw/j58;->b:Lcom/daaw/fw8;

    goto :goto_7

    :cond_c
    iget-object v2, v7, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    :goto_7
    move-object/from16 v18, v2

    if-eqz v8, :cond_d

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v2

    goto :goto_8

    :cond_d
    iget-object v2, v7, Lcom/daaw/q88;->j:Ljava/util/List;

    :goto_8
    move-object/from16 v19, v2

    const-wide/16 v15, 0x0

    move-object v8, v1

    move-wide v9, v13

    move-wide v11, v13

    move-wide v2, v13

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/q88;->b(Lcom/daaw/pr8;JJJJLcom/daaw/au8;Lcom/daaw/fw8;Ljava/util/List;)Lcom/daaw/q88;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object v7

    iput-wide v2, v7, Lcom/daaw/q88;->p:J

    :cond_e
    :goto_9
    return-object v7
.end method

.method public final O(Lcom/daaw/w88;)Lcom/daaw/z88;
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/j58;->G()I

    move-result v0

    new-instance v8, Lcom/daaw/z88;

    iget-object v2, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    iget-object v1, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v4, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_0
    iget-object v6, p0, Lcom/daaw/j58;->t:Lcom/daaw/xp4;

    invoke-virtual {v2}, Lcom/daaw/u68;->P()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lcom/daaw/z88;-><init>(Lcom/daaw/t88;Lcom/daaw/w88;Lcom/daaw/l64;ILcom/daaw/xp4;Landroid/os/Looper;)V

    return-object v8
.end method

.method public final P(II)V
    .locals 2

    iget v0, p0, Lcom/daaw/j58;->Q:I

    if-ne p1, v0, :cond_1

    iget v0, p0, Lcom/daaw/j58;->R:I

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p1, p0, Lcom/daaw/j58;->Q:I

    iput p2, p0, Lcom/daaw/j58;->R:I

    iget-object v0, p0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v1, Lcom/daaw/j18;

    invoke-direct {v1, p1, p2}, Lcom/daaw/j18;-><init>(II)V

    const/16 p1, 0x18

    invoke-virtual {v0, p1, v1}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    invoke-virtual {v0}, Lcom/daaw/k65;->c()V

    return-void
.end method

.method public final Q(IILjava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/j58;->g:[Lcom/daaw/i98;

    array-length v1, v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-interface {v2}, Lcom/daaw/i98;->zzb()I

    move-result v3

    if-ne v3, p1, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/j58;->O(Lcom/daaw/w88;)Lcom/daaw/z88;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/daaw/z88;->f(I)Lcom/daaw/z88;

    invoke-virtual {v2, p3}, Lcom/daaw/z88;->e(Ljava/lang/Object;)Lcom/daaw/z88;

    invoke-virtual {v2}, Lcom/daaw/z88;->d()Lcom/daaw/z88;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final R()V
    .locals 3

    iget v0, p0, Lcom/daaw/j58;->W:F

    iget-object v1, p0, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    invoke-virtual {v1}, Lcom/daaw/kj7;->a()F

    move-result v1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/j58;->Q(IILjava/lang/Object;)V

    return-void
.end method

.method public final S(Ljava/lang/Object;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/j58;->g:[Lcom/daaw/i98;

    array-length v2, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    aget-object v6, v1, v3

    invoke-interface {v6}, Lcom/daaw/i98;->zzb()I

    move-result v7

    if-ne v7, v4, :cond_0

    invoke-virtual {p0, v6}, Lcom/daaw/j58;->O(Lcom/daaw/w88;)Lcom/daaw/z88;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/daaw/z88;->f(I)Lcom/daaw/z88;

    invoke-virtual {v4, p1}, Lcom/daaw/z88;->e(Ljava/lang/Object;)Lcom/daaw/z88;

    invoke-virtual {v4}, Lcom/daaw/z88;->d()Lcom/daaw/z88;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/j58;->N:Ljava/lang/Object;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/z88;

    iget-wide v3, p0, Lcom/daaw/j58;->B:J

    invoke-virtual {v1, v3, v4}, Lcom/daaw/z88;->i(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_2

    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    const/4 v5, 0x0

    :goto_2
    iget-object v0, p0, Lcom/daaw/j58;->N:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/j58;->O:Landroid/view/Surface;

    if-ne v0, v1, :cond_4

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/j58;->O:Landroid/view/Surface;

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :cond_4
    :goto_3
    iput-object p1, p0, Lcom/daaw/j58;->N:Ljava/lang/Object;

    if-eqz v5, :cond_5

    new-instance p1, Lcom/daaw/x68;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lcom/daaw/x68;-><init>(I)V

    const/16 v0, 0x3eb

    invoke-static {p1, v0}, Lcom/daaw/vu7;->d(Ljava/lang/RuntimeException;I)Lcom/daaw/vu7;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lcom/daaw/j58;->T(ZLcom/daaw/vu7;)V

    :cond_5
    return-void
.end method

.method public final T(ZLcom/daaw/vu7;)V
    .locals 12

    iget-object p1, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, p1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {p1, v0}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object p1

    iget-wide v0, p1, Lcom/daaw/q88;->r:J

    iput-wide v0, p1, Lcom/daaw/q88;->p:J

    const-wide/16 v0, 0x0

    iput-wide v0, p1, Lcom/daaw/q88;->q:J

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/daaw/q88;->d(Lcom/daaw/vu7;)Lcom/daaw/q88;

    move-result-object p1

    :cond_0
    move-object v2, p1

    iget p1, p0, Lcom/daaw/j58;->C:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/j58;->C:I

    iget-object p1, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-virtual {p1}, Lcom/daaw/u68;->X()V

    iget-object p1, v2, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object p1, p1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {p1}, Lcom/daaw/l64;->o()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x4

    invoke-virtual {p0, v2}, Lcom/daaw/j58;->I(Lcom/daaw/q88;)J

    move-result-wide v8

    const/4 v10, -0x1

    const/4 v11, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    return-void
.end method

.method public final U(ZII)V
    .locals 11

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-boolean v4, v0, Lcom/daaw/q88;->l:Z

    if-ne v4, v3, :cond_2

    iget v4, v0, Lcom/daaw/q88;->m:I

    if-ne v4, v2, :cond_2

    return-void

    :cond_2
    iget v4, p0, Lcom/daaw/j58;->C:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/daaw/j58;->C:I

    invoke-virtual {v0, v3, v2}, Lcom/daaw/q88;->c(ZI)Lcom/daaw/q88;

    move-result-object v1

    iget-object v0, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-virtual {v0, v3, v2}, Lcom/daaw/u68;->W(ZI)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    move v3, p3

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    return-void
.end method

.method public final V(Lcom/daaw/q88;IIZZIJIZ)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    iget-object v3, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iput-object v1, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v4, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v5, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v4, v5}, Lcom/daaw/l64;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    iget-object v6, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v7, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v7}, Lcom/daaw/l64;->o()Z

    move-result v8

    const/4 v10, 0x3

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, -0x1

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    if-eqz v8, :cond_0

    invoke-virtual {v6}, Lcom/daaw/l64;->o()Z

    move-result v8

    if-eqz v8, :cond_0

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v15}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v7}, Lcom/daaw/l64;->o()Z

    move-result v8

    invoke-virtual {v6}, Lcom/daaw/l64;->o()Z

    move-result v9

    if-eq v8, v9, :cond_1

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    iget-object v8, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v8, v8, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v9, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v6, v8, v9}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v8

    iget v8, v8, Lcom/daaw/d34;->c:I

    iget-object v9, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v6, v8, v9, v11, v12}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v6

    iget-object v6, v6, Lcom/daaw/i54;->a:Ljava/lang/Object;

    iget-object v8, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v8, v8, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v9, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v7, v8, v9}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v8

    iget v8, v8, Lcom/daaw/d34;->c:I

    iget-object v9, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v7, v8, v9, v11, v12}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v7

    iget-object v7, v7, Lcom/daaw/i54;->a:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    if-eqz p5, :cond_2

    if-nez v2, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_3

    if-ne v2, v5, :cond_3

    const/4 v6, 0x2

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    const/4 v6, 0x3

    :goto_0
    new-instance v7, Landroid/util/Pair;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v6, v7

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p5, :cond_6

    if-nez v2, :cond_6

    iget-object v6, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v6, v6, Lcom/daaw/md3;->d:J

    iget-object v8, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v8, v8, Lcom/daaw/md3;->d:J

    cmp-long v16, v6, v8

    if-gez v16, :cond_6

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v15}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v8, v0, Lcom/daaw/j58;->I:Lcom/daaw/gc3;

    if-eqz v7, :cond_8

    iget-object v15, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v15}, Lcom/daaw/l64;->o()Z

    move-result v15

    if-nez v15, :cond_7

    iget-object v15, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v9, v1, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v9, v9, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v10, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v15, v9, v10}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v9

    iget v9, v9, Lcom/daaw/d34;->c:I

    iget-object v10, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v15, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v10, v9, v15, v11, v12}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v9

    iget-object v9, v9, Lcom/daaw/i54;->b:Lcom/daaw/f53;

    goto :goto_2

    :cond_7
    const/4 v9, 0x0

    :goto_2
    sget-object v10, Lcom/daaw/gc3;->v:Lcom/daaw/gc3;

    iput-object v10, v0, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    goto :goto_3

    :cond_8
    const/4 v9, 0x0

    :goto_3
    if-nez v7, :cond_9

    iget-object v10, v3, Lcom/daaw/q88;->j:Ljava/util/List;

    iget-object v15, v1, Lcom/daaw/q88;->j:Ljava/util/List;

    invoke-virtual {v10, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_9
    iget-object v8, v0, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    invoke-virtual {v8}, Lcom/daaw/gc3;->a()Lcom/daaw/x93;

    move-result-object v8

    iget-object v10, v1, Lcom/daaw/q88;->j:Ljava/util/List;

    const/4 v15, 0x0

    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v14

    if-ge v15, v14, :cond_b

    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/ads/zzbq;

    :goto_5
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzbq;->a()I

    move-result v5

    if-ge v13, v5, :cond_a

    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzbq;->b(I)Lcom/google/android/gms/internal/ads/zzbp;

    move-result-object v5

    invoke-interface {v5, v8}, Lcom/google/android/gms/internal/ads/zzbp;->f(Lcom/daaw/x93;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_a
    add-int/lit8 v15, v15, 0x1

    const/4 v5, 0x1

    const/4 v13, 0x0

    goto :goto_4

    :cond_b
    invoke-virtual {v8}, Lcom/daaw/x93;->L()Lcom/daaw/gc3;

    move-result-object v5

    iput-object v5, v0, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/j58;->zzn()Lcom/daaw/l64;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/l64;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v0, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    goto :goto_6

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/j58;->zzf()I

    move-result v8

    iget-object v10, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v5, v8, v10, v11, v12}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v5

    iget-object v5, v5, Lcom/daaw/i54;->b:Lcom/daaw/f53;

    iget-object v8, v0, Lcom/daaw/j58;->d0:Lcom/daaw/gc3;

    invoke-virtual {v8}, Lcom/daaw/gc3;->a()Lcom/daaw/x93;

    move-result-object v8

    iget-object v5, v5, Lcom/daaw/f53;->e:Lcom/daaw/gc3;

    invoke-virtual {v8, v5}, Lcom/daaw/x93;->r(Lcom/daaw/gc3;)Lcom/daaw/x93;

    invoke-virtual {v8}, Lcom/daaw/x93;->L()Lcom/daaw/gc3;

    move-result-object v8

    :cond_d
    :goto_6
    iget-object v5, v0, Lcom/daaw/j58;->I:Lcom/daaw/gc3;

    invoke-virtual {v8, v5}, Lcom/daaw/gc3;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v10, 0x1

    xor-int/2addr v5, v10

    iput-object v8, v0, Lcom/daaw/j58;->I:Lcom/daaw/gc3;

    iget-boolean v8, v3, Lcom/daaw/q88;->l:Z

    iget-boolean v10, v1, Lcom/daaw/q88;->l:Z

    if-eq v8, v10, :cond_e

    const/4 v10, 0x1

    goto :goto_7

    :cond_e
    const/4 v10, 0x0

    :goto_7
    iget v8, v3, Lcom/daaw/q88;->e:I

    iget v13, v1, Lcom/daaw/q88;->e:I

    if-eq v8, v13, :cond_f

    const/4 v8, 0x1

    goto :goto_8

    :cond_f
    const/4 v8, 0x0

    :goto_8
    if-nez v8, :cond_10

    if-eqz v10, :cond_11

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/j58;->W()V

    :cond_11
    iget-boolean v13, v3, Lcom/daaw/q88;->g:Z

    iget-boolean v14, v1, Lcom/daaw/q88;->g:Z

    if-eq v13, v14, :cond_12

    const/4 v13, 0x1

    goto :goto_9

    :cond_12
    const/4 v13, 0x0

    :goto_9
    if-eqz v4, :cond_13

    iget-object v4, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v14, Lcom/daaw/m18;

    move/from16 v15, p2

    invoke-direct {v14, v1, v15}, Lcom/daaw/m18;-><init>(Lcom/daaw/q88;I)V

    const/4 v15, 0x0

    invoke-virtual {v4, v15, v14}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_13
    if-eqz p5, :cond_1b

    new-instance v4, Lcom/daaw/d34;

    invoke-direct {v4}, Lcom/daaw/d34;-><init>()V

    iget-object v14, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v14}, Lcom/daaw/l64;->o()Z

    move-result v14

    if-nez v14, :cond_14

    iget-object v14, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v14, v14, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v15, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v15, v14, v4}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget v15, v4, Lcom/daaw/d34;->c:I

    iget-object v11, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v11, v14}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v11

    iget-object v12, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    move/from16 p2, v11

    iget-object v11, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    move/from16 v17, v13

    move-object/from16 p5, v14

    const-wide/16 v13, 0x0

    invoke-virtual {v12, v15, v11, v13, v14}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v11

    iget-object v11, v11, Lcom/daaw/i54;->a:Ljava/lang/Object;

    iget-object v12, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    iget-object v12, v12, Lcom/daaw/i54;->b:Lcom/daaw/f53;

    move/from16 v23, p2

    move-object/from16 v22, p5

    move-object/from16 v19, v11

    move-object/from16 v21, v12

    move/from16 v20, v15

    goto :goto_a

    :cond_14
    move/from16 v17, v13

    move/from16 v20, p9

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, -0x1

    :goto_a
    if-nez v2, :cond_17

    iget-object v11, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v11}, Lcom/daaw/md3;->b()Z

    move-result v11

    if-eqz v11, :cond_15

    iget-object v11, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v12, v11, Lcom/daaw/md3;->b:I

    iget v11, v11, Lcom/daaw/md3;->c:I

    invoke-virtual {v4, v12, v11}, Lcom/daaw/d34;->g(II)J

    move-result-wide v11

    goto :goto_b

    :cond_15
    iget-object v11, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v11, v11, Lcom/daaw/md3;->e:I

    const/4 v12, -0x1

    if-eq v11, v12, :cond_16

    iget-object v4, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-static {v4}, Lcom/daaw/j58;->J(Lcom/daaw/q88;)J

    move-result-wide v11

    goto :goto_c

    :cond_16
    iget-wide v11, v4, Lcom/daaw/d34;->d:J

    goto :goto_c

    :cond_17
    iget-object v4, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v4}, Lcom/daaw/md3;->b()Z

    move-result v4

    iget-wide v11, v3, Lcom/daaw/q88;->r:J

    if-eqz v4, :cond_18

    :goto_b
    invoke-static {v3}, Lcom/daaw/j58;->J(Lcom/daaw/q88;)J

    move-result-wide v13

    goto :goto_d

    :cond_18
    :goto_c
    move-wide v13, v11

    :goto_d
    new-instance v4, Lcom/daaw/nx3;

    invoke-static {v11, v12}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v24

    iget-object v11, v3, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-static {v13, v14}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v26

    iget v12, v11, Lcom/daaw/md3;->b:I

    iget v11, v11, Lcom/daaw/md3;->c:I

    move-object/from16 v18, v4

    move/from16 v28, v12

    move/from16 v29, v11

    invoke-direct/range {v18 .. v29}, Lcom/daaw/nx3;-><init>(Ljava/lang/Object;ILcom/daaw/f53;Ljava/lang/Object;IJJII)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/j58;->zzf()I

    move-result v11

    iget-object v12, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v12, v12, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v12}, Lcom/daaw/l64;->o()Z

    move-result v12

    if-nez v12, :cond_19

    iget-object v12, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v13, v12, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v13, v13, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v12, v12, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v14, v0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v12, v13, v14}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v12, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v12, v12, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v12, v13}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v12

    iget-object v14, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v14, v14, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v15, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    move/from16 p2, v12

    move-object/from16 v16, v13

    const-wide/16 v12, 0x0

    invoke-virtual {v14, v11, v15, v12, v13}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v12

    iget-object v12, v12, Lcom/daaw/i54;->a:Ljava/lang/Object;

    iget-object v13, v0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    iget-object v13, v13, Lcom/daaw/i54;->b:Lcom/daaw/f53;

    move/from16 v33, p2

    move-object/from16 v29, v12

    move-object/from16 v31, v13

    move-object/from16 v32, v16

    goto :goto_e

    :cond_19
    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, -0x1

    :goto_e
    invoke-static/range {p7 .. p8}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v34

    new-instance v12, Lcom/daaw/nx3;

    iget-object v13, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v13, v13, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v13}, Lcom/daaw/md3;->b()Z

    move-result v13

    if-eqz v13, :cond_1a

    iget-object v13, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-static {v13}, Lcom/daaw/j58;->J(Lcom/daaw/q88;)J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v13

    move-wide/from16 v36, v13

    goto :goto_f

    :cond_1a
    move-wide/from16 v36, v34

    :goto_f
    iget-object v13, v0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v13, v13, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v14, v13, Lcom/daaw/md3;->b:I

    iget v13, v13, Lcom/daaw/md3;->c:I

    move-object/from16 v28, v12

    move/from16 v30, v11

    move/from16 v38, v14

    move/from16 v39, v13

    invoke-direct/range {v28 .. v39}, Lcom/daaw/nx3;-><init>(Ljava/lang/Object;ILcom/daaw/f53;Ljava/lang/Object;IJJII)V

    iget-object v11, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v13, Lcom/daaw/e28;

    invoke-direct {v13, v2, v4, v12}, Lcom/daaw/e28;-><init>(ILcom/daaw/nx3;Lcom/daaw/nx3;)V

    const/16 v2, 0xb

    invoke-virtual {v11, v2, v13}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    goto :goto_10

    :cond_1b
    move/from16 v17, v13

    :goto_10
    if-eqz v7, :cond_1c

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/h28;

    invoke-direct {v4, v9, v6}, Lcom/daaw/h28;-><init>(Lcom/daaw/f53;I)V

    const/4 v6, 0x1

    invoke-virtual {v2, v6, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_1c
    iget-object v2, v3, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    iget-object v4, v1, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    if-eq v2, v4, :cond_1d

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/k28;

    invoke-direct {v4, v1}, Lcom/daaw/k28;-><init>(Lcom/daaw/q88;)V

    const/16 v6, 0xa

    invoke-virtual {v2, v6, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    iget-object v2, v1, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/n28;

    invoke-direct {v4, v1}, Lcom/daaw/n28;-><init>(Lcom/daaw/q88;)V

    invoke-virtual {v2, v6, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_1d
    iget-object v2, v3, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    iget-object v4, v1, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    if-eq v2, v4, :cond_1e

    iget-object v2, v0, Lcom/daaw/j58;->h:Lcom/daaw/zv8;

    iget-object v4, v4, Lcom/daaw/fw8;->e:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lcom/daaw/zv8;->e(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/q28;

    invoke-direct {v4, v1}, Lcom/daaw/q28;-><init>(Lcom/daaw/q88;)V

    const/4 v6, 0x2

    invoke-virtual {v2, v6, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_1e
    if-eqz v5, :cond_1f

    iget-object v2, v0, Lcom/daaw/j58;->I:Lcom/daaw/gc3;

    iget-object v4, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v5, Lcom/daaw/t28;

    invoke-direct {v5, v2}, Lcom/daaw/t28;-><init>(Lcom/daaw/gc3;)V

    const/16 v2, 0xe

    invoke-virtual {v4, v2, v5}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_1f
    if-eqz v17, :cond_20

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/w28;

    invoke-direct {v4, v1}, Lcom/daaw/w28;-><init>(Lcom/daaw/q88;)V

    const/4 v5, 0x3

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_20
    if-nez v8, :cond_21

    if-eqz v10, :cond_22

    :cond_21
    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/i38;

    invoke-direct {v4, v1}, Lcom/daaw/i38;-><init>(Lcom/daaw/q88;)V

    const/4 v5, -0x1

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_22
    if-eqz v8, :cond_23

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/l38;

    invoke-direct {v4, v1}, Lcom/daaw/l38;-><init>(Lcom/daaw/q88;)V

    const/4 v5, 0x4

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_23
    if-eqz v10, :cond_24

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/p18;

    move/from16 v5, p3

    invoke-direct {v4, v1, v5}, Lcom/daaw/p18;-><init>(Lcom/daaw/q88;I)V

    const/4 v5, 0x5

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_24
    iget v2, v3, Lcom/daaw/q88;->m:I

    iget v4, v1, Lcom/daaw/q88;->m:I

    if-eq v2, v4, :cond_25

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/s18;

    invoke-direct {v4, v1}, Lcom/daaw/s18;-><init>(Lcom/daaw/q88;)V

    const/4 v5, 0x6

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_25
    invoke-static {v3}, Lcom/daaw/j58;->Y(Lcom/daaw/q88;)Z

    move-result v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/j58;->Y(Lcom/daaw/q88;)Z

    move-result v4

    if-eq v2, v4, :cond_26

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/v18;

    invoke-direct {v4, v1}, Lcom/daaw/v18;-><init>(Lcom/daaw/q88;)V

    const/4 v5, 0x7

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_26
    iget-object v2, v3, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    iget-object v4, v1, Lcom/daaw/q88;->n:Lcom/daaw/pp3;

    invoke-virtual {v2, v4}, Lcom/daaw/pp3;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/y18;

    invoke-direct {v4, v1}, Lcom/daaw/y18;-><init>(Lcom/daaw/q88;)V

    const/16 v5, 0xc

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_27
    if-eqz p4, :cond_28

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    sget-object v4, Lcom/daaw/b28;->a:Lcom/daaw/b28;

    const/4 v5, -0x1

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_28
    iget-object v2, v0, Lcom/daaw/j58;->H:Lcom/daaw/lu3;

    iget-object v4, v0, Lcom/daaw/j58;->f:Lcom/daaw/ty3;

    iget-object v5, v0, Lcom/daaw/j58;->c:Lcom/daaw/lu3;

    invoke-static {v4, v5}, Lcom/daaw/it5;->g(Lcom/daaw/ty3;Lcom/daaw/lu3;)Lcom/daaw/lu3;

    move-result-object v4

    iput-object v4, v0, Lcom/daaw/j58;->H:Lcom/daaw/lu3;

    invoke-virtual {v4, v2}, Lcom/daaw/lu3;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    new-instance v4, Lcom/daaw/r38;

    invoke-direct {v4, v0}, Lcom/daaw/r38;-><init>(Lcom/daaw/j58;)V

    const/16 v5, 0xd

    invoke-virtual {v2, v5, v4}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    :cond_29
    iget-object v2, v0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    invoke-virtual {v2}, Lcom/daaw/k65;->c()V

    iget-boolean v2, v3, Lcom/daaw/q88;->o:Z

    iget-boolean v3, v1, Lcom/daaw/q88;->o:Z

    if-eq v2, v3, :cond_2a

    iget-object v2, v0, Lcom/daaw/j58;->l:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/yv7;

    iget-boolean v4, v1, Lcom/daaw/q88;->o:Z

    invoke-interface {v3, v4}, Lcom/daaw/yv7;->zza(Z)V

    goto :goto_11

    :cond_2a
    return-void
.end method

.method public final W()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->zzh()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-boolean v0, v0, Lcom/daaw/q88;->o:Z

    invoke-virtual {p0}, Lcom/daaw/j58;->zzq()Z

    invoke-virtual {p0}, Lcom/daaw/j58;->zzq()Z

    return-void
.end method

.method public final X()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/j58;->d:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/j58;->r:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/j58;->r:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    invoke-static {v1, v0}, Lcom/daaw/it5;->i(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/j58;->Z:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/daaw/j58;->a0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v3, "ExoPlayerImpl"

    invoke-static {v3, v0, v1}, Lcom/daaw/s95;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Lcom/daaw/j58;->a0:Z

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method

.method public final a(IJ)V
    .locals 14

    move-object v11, p0

    move v0, p1

    move-wide/from16 v1, p2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v3, v11, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    invoke-interface {v3}, Lcom/daaw/fb8;->zzx()V

    iget-object v3, v11, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v3, v3, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    if-ltz v0, :cond_3

    invoke-virtual {v3}, Lcom/daaw/l64;->o()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/daaw/l64;->c()I

    move-result v4

    if-ge v0, v4, :cond_3

    :cond_0
    iget v4, v11, Lcom/daaw/j58;->C:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v11, Lcom/daaw/j58;->C:I

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v1, "seekTo ignored because an ad is playing"

    invoke-static {v0, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/o68;

    iget-object v1, v11, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-direct {v0, v1}, Lcom/daaw/o68;-><init>(Lcom/daaw/q88;)V

    invoke-virtual {v0, v5}, Lcom/daaw/o68;->a(I)V

    iget-object v1, v11, Lcom/daaw/j58;->h0:Lcom/daaw/x38;

    iget-object v1, v1, Lcom/daaw/x38;->a:Lcom/daaw/j58;

    invoke-virtual {v1, v0}, Lcom/daaw/j58;->u(Lcom/daaw/o68;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/j58;->zzh()I

    move-result v4

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x2

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/j58;->zzf()I

    move-result v9

    iget-object v4, v11, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-virtual {v4, v5}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object v4

    invoke-virtual {p0, v3, p1, v1, v2}, Lcom/daaw/j58;->L(Lcom/daaw/l64;IJ)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {p0, v4, v3, v5}, Lcom/daaw/j58;->N(Lcom/daaw/q88;Lcom/daaw/l64;Landroid/util/Pair;)Lcom/daaw/q88;

    move-result-object v4

    iget-object v5, v11, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-static/range {p2 .. p3}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v1

    invoke-virtual {v5, v3, p1, v1, v2}, Lcom/daaw/u68;->V(Lcom/daaw/l64;IJ)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-virtual {p0, v4}, Lcom/daaw/j58;->I(Lcom/daaw/q88;)J

    move-result-wide v12

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-wide v7, v12

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    return-void

    :cond_3
    new-instance v4, Lcom/daaw/na2;

    invoke-direct {v4, v3, p1, v1, v2}, Lcom/daaw/na2;-><init>(Lcom/daaw/l64;IJ)V

    throw v4
.end method

.method public final a0()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->g:[Lcom/daaw/i98;

    array-length v0, v0

    const/4 v0, 0x2

    return v0
.end method

.method public final b()Lcom/daaw/vu7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->f:Lcom/daaw/vu7;

    return-object v0
.end method

.method public final b0()J
    .locals 8

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v1, v0}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->p:J

    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/j58;->c0()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/j58;->g0:J

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget-wide v1, v1, Lcom/daaw/md3;->d:J

    iget-object v3, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v3, v3, Lcom/daaw/md3;->d:J

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v3

    if-eqz v7, :cond_3

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {p0}, Lcom/daaw/j58;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v0, v1, v2, v5, v6}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/i54;->l:J

    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    goto :goto_2

    :cond_3
    iget-wide v0, v0, Lcom/daaw/q88;->p:J

    iget-object v2, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    invoke-virtual {v2}, Lcom/daaw/md3;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    iget v1, v1, Lcom/daaw/md3;->b:I

    invoke-virtual {v0, v1}, Lcom/daaw/d34;->h(I)J

    goto :goto_1

    :cond_4
    move-wide v5, v0

    :goto_1
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->k:Lcom/daaw/pr8;

    invoke-virtual {p0, v1, v0, v5, v6}, Lcom/daaw/j58;->K(Lcom/daaw/l64;Lcom/daaw/pr8;J)J

    invoke-static {v5, v6}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    :goto_2
    return-wide v0
.end method

.method public final c0()J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    invoke-interface {p0}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/i54;->l:J

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v2, v1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v0, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    iget v2, v1, Lcom/daaw/md3;->b:I

    iget v1, v1, Lcom/daaw/md3;->c:I

    invoke-virtual {v0, v2, v1}, Lcom/daaw/d34;->g(II)J

    move-result-wide v0

    goto :goto_0
.end method

.method public final s(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Lcom/daaw/fb8;->j(Lcom/daaw/ob8;)V

    return-void
.end method

.method public final synthetic t(Lcom/daaw/o68;)V
    .locals 11

    iget v1, p0, Lcom/daaw/j58;->C:I

    iget v2, p1, Lcom/daaw/o68;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/j58;->C:I

    iget-boolean v2, p1, Lcom/daaw/o68;->d:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget v2, p1, Lcom/daaw/o68;->e:I

    iput v2, p0, Lcom/daaw/j58;->D:I

    iput-boolean v3, p0, Lcom/daaw/j58;->E:Z

    :cond_0
    iget-boolean v2, p1, Lcom/daaw/o68;->f:Z

    if-eqz v2, :cond_1

    iget v2, p1, Lcom/daaw/o68;->g:I

    iput v2, p0, Lcom/daaw/j58;->F:I

    :cond_1
    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-object v1, v1, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v2, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v2}, Lcom/daaw/l64;->o()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/j58;->f0:I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/daaw/j58;->g0:J

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_4

    move-object v2, v1

    check-cast v2, Lcom/daaw/c98;

    invoke-virtual {v2}, Lcom/daaw/c98;->y()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v5, v6, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, Lcom/daaw/uo4;->f(Z)V

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Lcom/daaw/j58;->n:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/g58;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/l64;

    invoke-static {v6, v7}, Lcom/daaw/g58;->a(Lcom/daaw/g58;Lcom/daaw/l64;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget-boolean v2, p0, Lcom/daaw/j58;->E:Z

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_a

    iget-object v2, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v7, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v7, v7, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2, v7}, Lcom/daaw/md3;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-wide v7, v2, Lcom/daaw/q88;->d:J

    iget-object v2, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v9, v2, Lcom/daaw/q88;->r:J

    cmp-long v2, v7, v9

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-object v2, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v2}, Lcom/daaw/md3;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-object v5, v2, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-wide v6, v2, Lcom/daaw/q88;->d:J

    invoke-virtual {p0, v1, v5, v6, v7}, Lcom/daaw/j58;->K(Lcom/daaw/l64;Lcom/daaw/pr8;J)J

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v1, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    iget-wide v6, v1, Lcom/daaw/q88;->d:J

    :goto_4
    move v5, v3

    move-wide v7, v6

    goto :goto_5

    :cond_9
    move-wide v7, v5

    move v5, v3

    goto :goto_5

    :cond_a
    move-wide v7, v5

    const/4 v5, 0x0

    :goto_5
    iput-boolean v4, p0, Lcom/daaw/j58;->E:Z

    iget-object v1, p1, Lcom/daaw/o68;->b:Lcom/daaw/q88;

    const/4 v2, 0x1

    iget v3, p0, Lcom/daaw/j58;->F:I

    const/4 v4, 0x0

    iget v6, p0, Lcom/daaw/j58;->D:I

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    :cond_b
    return-void
.end method

.method public final synthetic u(Lcom/daaw/o68;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/j58;->i:Lcom/daaw/vz4;

    new-instance v1, Lcom/daaw/a48;

    invoke-direct {v1, p0, p1}, Lcom/daaw/a48;-><init>(Lcom/daaw/j58;Lcom/daaw/o68;)V

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic v(Lcom/daaw/mv3;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j58;->H:Lcom/daaw/lu3;

    invoke-interface {p1, v0}, Lcom/daaw/mv3;->G(Lcom/daaw/lu3;)V

    return-void
.end method

.method public final x()V
    .locals 15

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzq()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Lcom/daaw/kj7;->b(ZI)I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/j58;->H(ZI)I

    move-result v3

    invoke-virtual {p0, v0, v1, v3}, Lcom/daaw/j58;->U(ZII)V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget v1, v0, Lcom/daaw/q88;->e:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/q88;->d(Lcom/daaw/vu7;)Lcom/daaw/q88;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v1}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    :goto_0
    invoke-virtual {v0, v2}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object v5

    iget v0, p0, Lcom/daaw/j58;->C:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/daaw/j58;->C:I

    iget-object v0, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-virtual {v0}, Lcom/daaw/u68;->U()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v4, p0

    invoke-virtual/range {v4 .. v14}, Lcom/daaw/j58;->V(Lcom/daaw/q88;IIZZIJIZ)V

    return-void
.end method

.method public final y()V
    .locals 5

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/it5;->e:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/k63;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Release "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " [AndroidXMedia3/1.0.0-beta02] ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    invoke-static {v1, v0}, Lcom/daaw/s95;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    sget v0, Lcom/daaw/it5;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Lcom/daaw/j58;->M:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lcom/daaw/j58;->y:Lcom/daaw/wa8;

    invoke-virtual {v0}, Lcom/daaw/wa8;->e()V

    iget-object v0, p0, Lcom/daaw/j58;->x:Lcom/daaw/kj7;

    invoke-virtual {v0}, Lcom/daaw/kj7;->d()V

    iget-object v0, p0, Lcom/daaw/j58;->j:Lcom/daaw/u68;

    invoke-virtual {v0}, Lcom/daaw/u68;->Y()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    const/16 v2, 0xa

    sget-object v3, Lcom/daaw/g18;->a:Lcom/daaw/g18;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    invoke-virtual {v0}, Lcom/daaw/k65;->c()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/j58;->k:Lcom/daaw/k65;

    invoke-virtual {v0}, Lcom/daaw/k65;->e()V

    iget-object v0, p0, Lcom/daaw/j58;->i:Lcom/daaw/vz4;

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->e(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/j58;->s:Lcom/daaw/mw8;

    iget-object v2, p0, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    invoke-interface {v0, v2}, Lcom/daaw/mw8;->b(Lcom/daaw/lw8;)V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/daaw/q88;->e(I)Lcom/daaw/q88;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v2, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0, v2}, Lcom/daaw/q88;->a(Lcom/daaw/pr8;)Lcom/daaw/q88;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v2, v0, Lcom/daaw/q88;->r:J

    iput-wide v2, v0, Lcom/daaw/q88;->p:J

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/daaw/q88;->q:J

    iget-object v0, p0, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    invoke-interface {v0}, Lcom/daaw/fb8;->o()V

    iget-object v0, p0, Lcom/daaw/j58;->h:Lcom/daaw/zv8;

    invoke-virtual {v0}, Lcom/daaw/zv8;->a()V

    iget-object v0, p0, Lcom/daaw/j58;->O:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Lcom/daaw/j58;->O:Landroid/view/Surface;

    :cond_2
    sget-object v0, Lcom/daaw/rn4;->b:Lcom/daaw/rn4;

    iput-object v0, p0, Lcom/daaw/j58;->Y:Lcom/daaw/rn4;

    return-void
.end method

.method public final z(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j58;->q:Lcom/daaw/fb8;

    invoke-interface {v0, p1}, Lcom/daaw/fb8;->h(Lcom/daaw/ob8;)V

    return-void
.end method

.method public final zzd()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v0, v0, Lcom/daaw/md3;->b:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final zze()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget v0, v0, Lcom/daaw/md3;->c:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final zzf()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->G()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final zzg()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget v0, v0, Lcom/daaw/q88;->e:I

    return v0
.end method

.method public final zzi()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget v0, v0, Lcom/daaw/q88;->m:I

    return v0
.end method

.method public final zzj()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    const/4 v0, 0x0

    return v0
.end method

.method public final zzk()J
    .locals 8

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    invoke-virtual {p0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v1, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/j58;->m:Lcom/daaw/d34;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v1, v0, Lcom/daaw/q88;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v3

    if-nez v7, :cond_0

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    invoke-virtual {p0}, Lcom/daaw/j58;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    invoke-virtual {v0, v1, v2, v5, v6}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/i54;->k:J

    invoke-static {v5, v6}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {v5, v6}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v2, v2, Lcom/daaw/q88;->c:J

    invoke-static {v2, v3}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/j58;->zzl()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    invoke-virtual {p0, v0}, Lcom/daaw/j58;->I(Lcom/daaw/q88;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-wide v0, v0, Lcom/daaw/q88;->q:J

    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()Lcom/daaw/l64;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->a:Lcom/daaw/l64;

    return-object v0
.end method

.method public final zzo()Lcom/daaw/ni4;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->i:Lcom/daaw/fw8;

    iget-object v0, v0, Lcom/daaw/fw8;->d:Lcom/daaw/ni4;

    return-object v0
.end method

.method public final zzq()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-boolean v0, v0, Lcom/daaw/q88;->l:Z

    return v0
.end method

.method public final zzr()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    const/4 v0, 0x0

    return v0
.end method

.method public final zzs()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j58;->X()V

    iget-object v0, p0, Lcom/daaw/j58;->e0:Lcom/daaw/q88;

    iget-object v0, v0, Lcom/daaw/q88;->b:Lcom/daaw/pr8;

    invoke-virtual {v0}, Lcom/daaw/md3;->b()Z

    move-result v0

    return v0
.end method
