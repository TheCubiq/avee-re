.class public final Lcom/daaw/sl8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rj8;


# static fields
.field public static final W:Ljava/lang/Object;

.field public static X:Ljava/util/concurrent/ExecutorService;

.field public static Y:I


# instance fields
.field public A:Z

.field public B:Z

.field public C:J

.field public D:F

.field public E:[Lcom/daaw/hi8;

.field public F:[Ljava/nio/ByteBuffer;

.field public G:Ljava/nio/ByteBuffer;

.field public H:I

.field public I:Ljava/nio/ByteBuffer;

.field public J:[B

.field public K:I

.field public L:I

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Lcom/daaw/sc8;

.field public S:J

.field public T:Z

.field public U:Z

.field public final V:Lcom/daaw/yk8;

.field public final a:Lcom/daaw/bi8;

.field public final b:Lcom/daaw/mk8;

.field public final c:Lcom/daaw/an8;

.field public final d:[Lcom/daaw/hi8;

.field public final e:[Lcom/daaw/hi8;

.field public final f:Lcom/daaw/ds4;

.field public final g:Lcom/daaw/ik8;

.field public final h:Ljava/util/ArrayDeque;

.field public i:Lcom/daaw/ol8;

.field public final j:Lcom/daaw/el8;

.field public final k:Lcom/daaw/el8;

.field public final l:Lcom/daaw/sk8;

.field public m:Lcom/daaw/lh8;

.field public n:Lcom/daaw/lj8;

.field public o:Lcom/daaw/wk8;

.field public p:Lcom/daaw/wk8;

.field public q:Landroid/media/AudioTrack;

.field public r:Lcom/daaw/o98;

.field public s:Lcom/daaw/cl8;

.field public t:Lcom/daaw/cl8;

.field public final u:Lcom/daaw/pp3;

.field public v:J

.field public w:J

.field public x:J

.field public y:J

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/sl8;->W:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/uk8;Lcom/daaw/ql8;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/uk8;->a(Lcom/daaw/uk8;)Lcom/daaw/bi8;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/sl8;->a:Lcom/daaw/bi8;

    invoke-static {p1}, Lcom/daaw/uk8;->e(Lcom/daaw/uk8;)Lcom/daaw/yk8;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/sl8;->V:Lcom/daaw/yk8;

    sget v0, Lcom/daaw/it5;->a:I

    iget-object p1, p1, Lcom/daaw/uk8;->b:Lcom/daaw/sk8;

    iput-object p1, p0, Lcom/daaw/sl8;->l:Lcom/daaw/sk8;

    new-instance p1, Lcom/daaw/ds4;

    sget-object v0, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    invoke-direct {p1, v0}, Lcom/daaw/ds4;-><init>(Lcom/daaw/xp4;)V

    iput-object p1, p0, Lcom/daaw/sl8;->f:Lcom/daaw/ds4;

    invoke-virtual {p1}, Lcom/daaw/ds4;->e()Z

    new-instance p1, Lcom/daaw/ik8;

    new-instance v0, Lcom/daaw/il8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/il8;-><init>(Lcom/daaw/sl8;Lcom/daaw/gl8;)V

    invoke-direct {p1, v0}, Lcom/daaw/ik8;-><init>(Lcom/daaw/xj8;)V

    iput-object p1, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    new-instance p1, Lcom/daaw/mk8;

    invoke-direct {p1}, Lcom/daaw/mk8;-><init>()V

    iput-object p1, p0, Lcom/daaw/sl8;->b:Lcom/daaw/mk8;

    new-instance v0, Lcom/daaw/an8;

    invoke-direct {v0}, Lcom/daaw/an8;-><init>()V

    iput-object v0, p0, Lcom/daaw/sl8;->c:Lcom/daaw/an8;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x3

    new-array v2, v2, [Lcom/daaw/kk8;

    new-instance v3, Lcom/daaw/gm8;

    invoke-direct {v3}, Lcom/daaw/gm8;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const/4 p1, 0x2

    aput-object v0, v2, p1

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lcom/daaw/yk8;->e()[Lcom/daaw/hi8;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-array p1, v4, [Lcom/daaw/hi8;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/hi8;

    iput-object p1, p0, Lcom/daaw/sl8;->d:[Lcom/daaw/hi8;

    new-array p1, v3, [Lcom/daaw/hi8;

    new-instance p2, Lcom/daaw/yl8;

    invoke-direct {p2}, Lcom/daaw/yl8;-><init>()V

    aput-object p2, p1, v4

    iput-object p1, p0, Lcom/daaw/sl8;->e:[Lcom/daaw/hi8;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/sl8;->D:F

    sget-object p1, Lcom/daaw/o98;->c:Lcom/daaw/o98;

    iput-object p1, p0, Lcom/daaw/sl8;->r:Lcom/daaw/o98;

    iput v4, p0, Lcom/daaw/sl8;->Q:I

    new-instance p1, Lcom/daaw/sc8;

    const/4 p2, 0x0

    invoke-direct {p1, v4, p2}, Lcom/daaw/sc8;-><init>(IF)V

    iput-object p1, p0, Lcom/daaw/sl8;->R:Lcom/daaw/sc8;

    new-instance p1, Lcom/daaw/cl8;

    sget-object p2, Lcom/daaw/pp3;->d:Lcom/daaw/pp3;

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v5 .. v12}, Lcom/daaw/cl8;-><init>(Lcom/daaw/pp3;ZJJLcom/daaw/al8;)V

    iput-object p1, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iput-object p2, p0, Lcom/daaw/sl8;->u:Lcom/daaw/pp3;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/sl8;->L:I

    new-array p1, v4, [Lcom/daaw/hi8;

    iput-object p1, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    new-array p1, v4, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/sl8;->F:[Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/daaw/el8;

    const-wide/16 v0, 0x64

    invoke-direct {p1, v0, v1}, Lcom/daaw/el8;-><init>(J)V

    iput-object p1, p0, Lcom/daaw/sl8;->j:Lcom/daaw/el8;

    new-instance p1, Lcom/daaw/el8;

    invoke-direct {p1, v0, v1}, Lcom/daaw/el8;-><init>(J)V

    iput-object p1, p0, Lcom/daaw/sl8;->k:Lcom/daaw/el8;

    return-void
.end method

.method public static F(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic H(Lcom/daaw/sl8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/sl8;->S:J

    return-wide v0
.end method

.method public static bridge synthetic I(Lcom/daaw/sl8;)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/sl8;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic J(Lcom/daaw/sl8;)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic K(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/daaw/sl8;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    return-object p0
.end method

.method public static bridge synthetic p(Lcom/daaw/sl8;)Lcom/daaw/lj8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    return-object p0
.end method

.method public static synthetic q(Landroid/media/AudioTrack;Lcom/daaw/ds4;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {p1}, Lcom/daaw/ds4;->e()Z

    sget-object p0, Lcom/daaw/sl8;->W:Ljava/lang/Object;

    monitor-enter p0

    :try_start_1
    sget p1, Lcom/daaw/sl8;->Y:I

    add-int/lit8 p1, p1, -0x1

    sput p1, Lcom/daaw/sl8;->Y:I

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p0

    invoke-virtual {p1}, Lcom/daaw/ds4;->e()Z

    sget-object p1, Lcom/daaw/sl8;->W:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    sget v1, Lcom/daaw/sl8;->Y:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lcom/daaw/sl8;->Y:I

    if-nez v1, :cond_1

    sget-object v1, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    :cond_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p0

    :catchall_2
    move-exception p0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0
.end method

.method public static bridge synthetic r(Lcom/daaw/sl8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/sl8;->O:Z

    return p0
.end method


# virtual methods
.method public final A(Lcom/daaw/pp3;Z)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    invoke-virtual {p1, v1}, Lcom/daaw/pp3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v0, v0, Lcom/daaw/cl8;->b:Z

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lcom/daaw/cl8;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/daaw/cl8;-><init>(Lcom/daaw/pp3;ZJJLcom/daaw/al8;)V

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v0, p0, Lcom/daaw/sl8;->s:Lcom/daaw/cl8;

    return-void

    :cond_2
    iput-object v0, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    return-void
.end method

.method public final B()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/sl8;->D:F

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/sl8;->D:F

    invoke-virtual {v0, v1, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method public final C(Ljava/nio/ByteBuffer;J)V
    .locals 7

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    const/16 p3, 0x15

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    if-ne p2, p1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lcom/daaw/uo4;->d(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    sget p2, Lcom/daaw/it5;->a:I

    if-ge p2, p3, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    iget-object v2, p0, Lcom/daaw/sl8;->J:[B

    if-eqz v2, :cond_3

    array-length v2, v2

    if-ge v2, p2, :cond_4

    :cond_3
    new-array v2, p2, [B

    iput-object v2, p0, Lcom/daaw/sl8;->J:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/sl8;->J:[B

    invoke-virtual {p1, v3, v1, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v1, p0, Lcom/daaw/sl8;->K:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    sget v2, Lcom/daaw/it5;->a:I

    if-ge v2, p3, :cond_7

    iget-object p3, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    iget-wide v3, p0, Lcom/daaw/sl8;->x:J

    invoke-virtual {p3, v3, v4}, Lcom/daaw/ik8;->a(J)I

    move-result p3

    if-lez p3, :cond_6

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v3, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v4, p0, Lcom/daaw/sl8;->J:[B

    iget v5, p0, Lcom/daaw/sl8;->K:I

    invoke-virtual {v3, v4, v5, p3}, Landroid/media/AudioTrack;->write([BII)I

    move-result p3

    if-lez p3, :cond_8

    iget v3, p0, Lcom/daaw/sl8;->K:I

    add-int/2addr v3, p3

    iput v3, p0, Lcom/daaw/sl8;->K:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_2

    :cond_6
    const/4 p3, 0x0

    goto :goto_2

    :cond_7
    iget-object p3, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {p3, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p3

    :cond_8
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/daaw/sl8;->S:J

    const-wide/16 v3, 0x0

    if-gez p3, :cond_e

    const/16 p1, 0x18

    if-lt v2, p1, :cond_9

    const/4 p1, -0x6

    if-eq p3, p1, :cond_a

    :cond_9
    const/16 p1, -0x20

    if-ne p3, p1, :cond_b

    :cond_a
    iget-wide p1, p0, Lcom/daaw/sl8;->y:J

    cmp-long v2, p1, v3

    if-lez v2, :cond_b

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    :goto_3
    new-instance p1, Lcom/daaw/pj8;

    iget-object p2, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object p2, p2, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    invoke-direct {p1, p3, p2, v0}, Lcom/daaw/pj8;-><init>(ILcom/daaw/f92;Z)V

    iget-object p2, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    if-eqz p2, :cond_c

    invoke-interface {p2, p1}, Lcom/daaw/lj8;->a(Ljava/lang/Exception;)V

    :cond_c
    iget-boolean p2, p1, Lcom/daaw/pj8;->q:Z

    if-nez p2, :cond_d

    iget-object p2, p0, Lcom/daaw/sl8;->k:Lcom/daaw/el8;

    invoke-virtual {p2, p1}, Lcom/daaw/el8;->b(Ljava/lang/Exception;)V

    return-void

    :cond_d
    throw p1

    :cond_e
    iget-object v2, p0, Lcom/daaw/sl8;->k:Lcom/daaw/el8;

    invoke-virtual {v2}, Lcom/daaw/el8;->a()V

    iget-object v2, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-static {v2}, Lcom/daaw/sl8;->F(Landroid/media/AudioTrack;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-wide v5, p0, Lcom/daaw/sl8;->y:J

    cmp-long v2, v5, v3

    if-lez v2, :cond_f

    iput-boolean v1, p0, Lcom/daaw/sl8;->U:Z

    :cond_f
    iget-boolean v2, p0, Lcom/daaw/sl8;->O:Z

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    if-eqz v2, :cond_10

    if-ge p3, p2, :cond_10

    iget-boolean v3, p0, Lcom/daaw/sl8;->U:Z

    if-nez v3, :cond_10

    check-cast v2, Lcom/daaw/cm8;

    iget-object v2, v2, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {v2}, Lcom/daaw/em8;->w0(Lcom/daaw/em8;)Lcom/daaw/f98;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-static {v2}, Lcom/daaw/em8;->w0(Lcom/daaw/em8;)Lcom/daaw/f98;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/f98;->zza()V

    :cond_10
    iget-object v2, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v2, v2, Lcom/daaw/wk8;->c:I

    if-nez v2, :cond_11

    iget-wide v3, p0, Lcom/daaw/sl8;->x:J

    int-to-long v5, p3

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/daaw/sl8;->x:J

    :cond_11
    if-ne p3, p2, :cond_14

    if-eqz v2, :cond_13

    iget-object p2, p0, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_12

    goto :goto_4

    :cond_12
    const/4 v0, 0x0

    :goto_4
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-wide p1, p0, Lcom/daaw/sl8;->y:J

    iget p3, p0, Lcom/daaw/sl8;->z:I

    int-to-long v0, p3

    iget p3, p0, Lcom/daaw/sl8;->H:I

    int-to-long v2, p3

    mul-long v0, v0, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/sl8;->y:J

    :cond_13
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    :cond_14
    return-void
.end method

.method public final D()Z
    .locals 9

    iget v0, p0, Lcom/daaw/sl8;->L:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput v3, p0, Lcom/daaw/sl8;->L:I

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget v4, p0, Lcom/daaw/sl8;->L:I

    iget-object v5, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Lcom/daaw/hi8;->zzd()V

    :cond_1
    invoke-virtual {p0, v7, v8}, Lcom/daaw/sl8;->z(J)V

    invoke-interface {v4}, Lcom/daaw/hi8;->zzh()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    iget v0, p0, Lcom/daaw/sl8;->L:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/sl8;->L:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0, v7, v8}, Lcom/daaw/sl8;->C(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    return v3

    :cond_4
    iput v1, p0, Lcom/daaw/sl8;->L:I

    return v2
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object v0, v0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget-object v0, v0, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object v0, v0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget v0, v0, Lcom/daaw/f92;->A:I

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lcom/daaw/f92;)I
    .locals 3

    iget-object v0, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    iget v0, p1, Lcom/daaw/f92;->A:I

    invoke-static {v0}, Lcom/daaw/it5;->v(I)Z

    move-result v0

    iget p1, p1, Lcom/daaw/f92;->A:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid PCM encoding: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DefaultAudioSink"

    invoke-static {v0, p1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    if-eq p1, v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/sl8;->T:Z

    if-nez v0, :cond_3

    sget v0, Lcom/daaw/it5;->a:I

    :cond_3
    iget-object v0, p0, Lcom/daaw/sl8;->a:Lcom/daaw/bi8;

    invoke-virtual {v0, p1}, Lcom/daaw/bi8;->a(Lcom/daaw/f92;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1
.end method

.method public final b()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/sl8;->M:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/sl8;->zzt()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final c(Ljava/nio/ByteBuffer;JI)Z
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v5, p4

    iget-object v0, v1, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    iget-object v0, v1, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    const/4 v8, 0x0

    if-eqz v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->D()Z

    move-result v0

    if-nez v0, :cond_2

    return v6

    :cond_2
    iget-object v0, v1, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    iget-object v9, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v10, v9, Lcom/daaw/wk8;->c:I

    iget v11, v0, Lcom/daaw/wk8;->c:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/daaw/wk8;->g:I

    iget v11, v0, Lcom/daaw/wk8;->g:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/daaw/wk8;->e:I

    iget v11, v0, Lcom/daaw/wk8;->e:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/daaw/wk8;->f:I

    iget v11, v0, Lcom/daaw/wk8;->f:I

    if-ne v10, v11, :cond_4

    iget v9, v9, Lcom/daaw/wk8;->d:I

    iget v10, v0, Lcom/daaw/wk8;->d:I

    if-ne v9, v10, :cond_4

    iput-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iput-object v8, v1, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-static {v0}, Lcom/daaw/sl8;->F(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v9, 0x3

    if-ne v0, v9, :cond_3

    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    :cond_3
    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v9, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object v9, v9, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget v10, v9, Lcom/daaw/f92;->B:I

    iget v9, v9, Lcom/daaw/f92;->C:I

    invoke-virtual {v0, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v7, v1, Lcom/daaw/sl8;->U:Z

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->y()V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->zzt()Z

    move-result v0

    if-eqz v0, :cond_5

    return v6

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->zze()V

    :cond_6
    :goto_2
    invoke-virtual {v1, v3, v4}, Lcom/daaw/sl8;->w(J)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    const/16 v9, 0x1f

    if-nez v0, :cond_10

    :try_start_0
    iget-object v0, v1, Lcom/daaw/sl8;->f:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->d()Z

    move-result v0
    :try_end_0
    .catch Lcom/daaw/jj8; {:try_start_0 .. :try_end_0} :catch_3

    if-nez v0, :cond_8

    return v6

    :cond_8
    :try_start_1
    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;
    :try_end_1
    .catch Lcom/daaw/jj8; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    invoke-virtual {v1, v0}, Lcom/daaw/sl8;->u(Lcom/daaw/wk8;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_2
    .catch Lcom/daaw/jj8; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v11, v0

    :try_start_3
    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v12, v0, Lcom/daaw/wk8;->h:I

    const v13, 0xf4240

    if-le v12, v13, :cond_d

    new-instance v12, Lcom/daaw/wk8;

    iget-object v15, v0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget v13, v0, Lcom/daaw/wk8;->b:I

    iget v14, v0, Lcom/daaw/wk8;->c:I

    iget v8, v0, Lcom/daaw/wk8;->d:I

    iget v6, v0, Lcom/daaw/wk8;->e:I

    iget v7, v0, Lcom/daaw/wk8;->f:I

    iget v10, v0, Lcom/daaw/wk8;->g:I

    const v22, 0xf4240

    iget-object v0, v0, Lcom/daaw/wk8;->i:[Lcom/daaw/hi8;

    move/from16 v17, v14

    move-object v14, v12

    move/from16 v16, v13

    move/from16 v18, v8

    move/from16 v19, v6

    move/from16 v20, v7

    move/from16 v21, v10

    move-object/from16 v23, v0

    invoke-direct/range {v14 .. v23}, Lcom/daaw/wk8;-><init>(Lcom/daaw/f92;IIIIIII[Lcom/daaw/hi8;)V
    :try_end_3
    .catch Lcom/daaw/jj8; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    invoke-virtual {v1, v12}, Lcom/daaw/sl8;->u(Lcom/daaw/wk8;)Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v12, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;
    :try_end_4
    .catch Lcom/daaw/jj8; {:try_start_4 .. :try_end_4} :catch_1

    :goto_3
    :try_start_5
    iput-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-static {v0}, Lcom/daaw/sl8;->F(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v6, v1, Lcom/daaw/sl8;->i:Lcom/daaw/ol8;

    if-nez v6, :cond_9

    new-instance v6, Lcom/daaw/ol8;

    invoke-direct {v6, v1}, Lcom/daaw/ol8;-><init>(Lcom/daaw/sl8;)V

    iput-object v6, v1, Lcom/daaw/sl8;->i:Lcom/daaw/ol8;

    :cond_9
    iget-object v6, v1, Lcom/daaw/sl8;->i:Lcom/daaw/ol8;

    invoke-virtual {v6, v0}, Lcom/daaw/ol8;->a(Landroid/media/AudioTrack;)V

    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v6, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object v6, v6, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget v7, v6, Lcom/daaw/f92;->B:I

    iget v6, v6, Lcom/daaw/f92;->C:I

    invoke-virtual {v0, v7, v6}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_a
    sget v0, Lcom/daaw/it5;->a:I

    if-lt v0, v9, :cond_b

    iget-object v0, v1, Lcom/daaw/sl8;->m:Lcom/daaw/lh8;

    if-eqz v0, :cond_b

    iget-object v6, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-static {v6, v0}, Lcom/daaw/qk8;->a(Landroid/media/AudioTrack;Lcom/daaw/lh8;)V

    :cond_b
    iget-object v0, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iput v0, v1, Lcom/daaw/sl8;->Q:I

    iget-object v10, v1, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    iget-object v11, v1, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v6, v0, Lcom/daaw/wk8;->c:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_c

    const/4 v12, 0x1

    goto :goto_4

    :cond_c
    const/4 v12, 0x0

    :goto_4
    iget v13, v0, Lcom/daaw/wk8;->g:I

    iget v14, v0, Lcom/daaw/wk8;->d:I

    iget v15, v0, Lcom/daaw/wk8;->h:I

    invoke-virtual/range {v10 .. v15}, Lcom/daaw/ik8;->e(Landroid/media/AudioTrack;ZIII)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->B()V

    iget-object v0, v1, Lcom/daaw/sl8;->R:Lcom/daaw/sc8;

    iget v0, v0, Lcom/daaw/sc8;->a:I

    const/4 v6, 0x1

    iput-boolean v6, v1, Lcom/daaw/sl8;->B:Z
    :try_end_5
    .catch Lcom/daaw/jj8; {:try_start_5 .. :try_end_5} :catch_3

    const/4 v6, 0x0

    goto :goto_5

    :catch_1
    move-exception v0

    const/4 v2, 0x1

    :try_start_6
    new-array v3, v2, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-class v2, Ljava/lang/Throwable;

    const-string v5, "addSuppressed"

    invoke-virtual {v2, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v0, v5, v4

    invoke-virtual {v2, v11, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :catch_2
    :cond_d
    :try_start_7
    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    invoke-virtual {v0}, Lcom/daaw/wk8;->c()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/daaw/sl8;->T:Z

    :cond_e
    throw v11
    :try_end_7
    .catch Lcom/daaw/jj8; {:try_start_7 .. :try_end_7} :catch_3

    :catch_3
    move-exception v0

    iget-boolean v2, v0, Lcom/daaw/jj8;->q:Z

    if-nez v2, :cond_f

    iget-object v2, v1, Lcom/daaw/sl8;->j:Lcom/daaw/el8;

    invoke-virtual {v2, v0}, Lcom/daaw/el8;->b(Ljava/lang/Exception;)V

    const/4 v6, 0x0

    return v6

    :cond_f
    throw v0

    :cond_10
    :goto_5
    iget-object v0, v1, Lcom/daaw/sl8;->j:Lcom/daaw/el8;

    invoke-virtual {v0}, Lcom/daaw/el8;->a()V

    iget-boolean v0, v1, Lcom/daaw/sl8;->B:Z

    const-wide/16 v7, 0x0

    if-eqz v0, :cond_11

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    iput-wide v10, v1, Lcom/daaw/sl8;->C:J

    iput-boolean v6, v1, Lcom/daaw/sl8;->A:Z

    iput-boolean v6, v1, Lcom/daaw/sl8;->B:Z

    invoke-virtual {v1, v3, v4}, Lcom/daaw/sl8;->w(J)V

    iget-boolean v0, v1, Lcom/daaw/sl8;->O:Z

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->zzh()V

    :cond_11
    iget-object v0, v1, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v10

    invoke-virtual {v0, v10, v11}, Lcom/daaw/ik8;->j(J)Z

    move-result v0

    if-nez v0, :cond_12

    const/4 v6, 0x0

    return v6

    :cond_12
    iget-object v0, v1, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_25

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v6, :cond_13

    const/4 v0, 0x1

    goto :goto_6

    :cond_13
    const/4 v0, 0x0

    :goto_6
    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_14

    const/4 v6, 0x1

    return v6

    :cond_14
    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v6, v0, Lcom/daaw/wk8;->c:I

    if-eqz v6, :cond_1e

    iget v6, v1, Lcom/daaw/sl8;->z:I

    if-nez v6, :cond_1e

    iget v0, v0, Lcom/daaw/wk8;->g:I

    const/16 v6, 0x400

    const/4 v10, -0x2

    const/16 v11, 0x10

    const/4 v12, -0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected audio encoding: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_1
    sget v0, Lcom/daaw/fz8;->b:I

    new-array v0, v11, [B

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v6

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v6, Lcom/daaw/cj5;

    invoke-direct {v6, v0, v11}, Lcom/daaw/cj5;-><init>([BI)V

    invoke-static {v6}, Lcom/daaw/fz8;->a(Lcom/daaw/cj5;)Lcom/daaw/ez8;

    move-result-object v0

    iget v0, v0, Lcom/daaw/ez8;->c:I

    goto/16 :goto_a

    :pswitch_2
    const/16 v0, 0x200

    goto :goto_a

    :pswitch_3
    sget v0, Lcom/daaw/cz8;->g:I

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    add-int/lit8 v6, v6, -0xa

    move v9, v0

    :goto_7
    if-gt v9, v6, :cond_16

    add-int/lit8 v13, v9, 0x4

    invoke-static {v2, v13}, Lcom/daaw/it5;->U(Ljava/nio/ByteBuffer;I)I

    move-result v13

    and-int/2addr v13, v10

    const v14, -0x78d9046

    if-ne v13, v14, :cond_15

    sub-int/2addr v9, v0

    goto :goto_8

    :cond_15
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_16
    const/4 v9, -0x1

    :goto_8
    if-ne v9, v12, :cond_17

    const/4 v0, 0x0

    goto :goto_a

    :cond_17
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr v0, v9

    add-int/lit8 v0, v0, 0x7

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v6

    add-int/2addr v6, v9

    and-int/lit16 v0, v0, 0xff

    const/16 v9, 0xbb

    if-ne v0, v9, :cond_18

    const/16 v0, 0x9

    goto :goto_9

    :cond_18
    const/16 v0, 0x8

    :goto_9
    const/16 v9, 0x28

    add-int/2addr v6, v0

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    shr-int/lit8 v0, v0, 0x4

    and-int/lit8 v0, v0, 0x7

    shl-int v0, v9, v0

    mul-int/lit8 v0, v0, 0x10

    goto :goto_a

    :pswitch_4
    const/16 v0, 0x800

    goto :goto_a

    :pswitch_5
    const/16 v0, 0x400

    goto :goto_a

    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-static {v2, v0}, Lcom/daaw/it5;->U(Ljava/nio/ByteBuffer;I)I

    move-result v0

    invoke-static {v0}, Lcom/daaw/z32;->c(I)I

    move-result v0

    if-eq v0, v12, :cond_19

    :goto_a
    const/4 v10, 0x1

    goto :goto_e

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_7
    sget v0, Lcom/daaw/g09;->d:I

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    if-eq v6, v10, :cond_1c

    if-eq v6, v12, :cond_1b

    if-eq v6, v9, :cond_1a

    add-int/lit8 v6, v0, 0x4

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    const/4 v9, 0x1

    and-int/2addr v6, v9

    shl-int/lit8 v6, v6, 0x6

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xfc

    const/4 v9, 0x2

    goto :goto_c

    :cond_1a
    const/4 v9, 0x2

    add-int/lit8 v6, v0, 0x5

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    and-int/lit8 v6, v6, 0x7

    shl-int/lit8 v6, v6, 0x4

    add-int/lit8 v0, v0, 0x6

    goto :goto_b

    :cond_1b
    const/4 v9, 0x2

    add-int/lit8 v6, v0, 0x4

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    and-int/lit8 v6, v6, 0x7

    shl-int/lit8 v6, v6, 0x4

    add-int/lit8 v0, v0, 0x7

    :goto_b
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit8 v0, v0, 0x3c

    :goto_c
    shr-int/2addr v0, v9

    or-int/2addr v0, v6

    const/4 v10, 0x1

    goto :goto_d

    :cond_1c
    const/4 v9, 0x2

    add-int/lit8 v6, v0, 0x5

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    const/4 v10, 0x1

    and-int/2addr v6, v10

    shl-int/lit8 v6, v6, 0x6

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xfc

    shr-int/2addr v0, v9

    or-int/2addr v0, v6

    :goto_d
    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, 0x20

    goto :goto_e

    :pswitch_8
    const/4 v10, 0x1

    invoke-static/range {p1 .. p1}, Lcom/daaw/cz8;->a(Ljava/nio/ByteBuffer;)I

    move-result v0

    :goto_e
    iput v0, v1, Lcom/daaw/sl8;->z:I

    if-eqz v0, :cond_1d

    goto :goto_f

    :cond_1d
    return v10

    :cond_1e
    :goto_f
    iget-object v0, v1, Lcom/daaw/sl8;->s:Lcom/daaw/cl8;

    if-eqz v0, :cond_20

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->D()Z

    move-result v0

    if-nez v0, :cond_1f

    const/4 v6, 0x0

    return v6

    :cond_1f
    invoke-virtual {v1, v3, v4}, Lcom/daaw/sl8;->w(J)V

    const/4 v6, 0x0

    iput-object v6, v1, Lcom/daaw/sl8;->s:Lcom/daaw/cl8;

    :cond_20
    iget-wide v9, v1, Lcom/daaw/sl8;->C:J

    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->s()J

    move-result-wide v11

    iget-object v6, v1, Lcom/daaw/sl8;->c:Lcom/daaw/an8;

    invoke-virtual {v6}, Lcom/daaw/an8;->i()J

    move-result-wide v13

    sub-long/2addr v11, v13

    const-wide/32 v13, 0xf4240

    mul-long v11, v11, v13

    iget-object v0, v0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iget v0, v0, Lcom/daaw/f92;->z:I

    int-to-long v13, v0

    div-long/2addr v11, v13

    add-long/2addr v9, v11

    iget-boolean v0, v1, Lcom/daaw/sl8;->A:Z

    if-nez v0, :cond_21

    sub-long v11, v9, v3

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    const-wide/32 v13, 0x30d40

    cmp-long v0, v11, v13

    if-lez v0, :cond_21

    iget-object v0, v1, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    new-instance v6, Lcom/daaw/nj8;

    invoke-direct {v6, v3, v4, v9, v10}, Lcom/daaw/nj8;-><init>(JJ)V

    invoke-interface {v0, v6}, Lcom/daaw/lj8;->a(Ljava/lang/Exception;)V

    const/4 v6, 0x1

    iput-boolean v6, v1, Lcom/daaw/sl8;->A:Z

    :cond_21
    iget-boolean v0, v1, Lcom/daaw/sl8;->A:Z

    if-eqz v0, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->D()Z

    move-result v0

    const/4 v6, 0x0

    if-nez v0, :cond_22

    return v6

    :cond_22
    sub-long v9, v3, v9

    iget-wide v11, v1, Lcom/daaw/sl8;->C:J

    add-long/2addr v11, v9

    iput-wide v11, v1, Lcom/daaw/sl8;->C:J

    iput-boolean v6, v1, Lcom/daaw/sl8;->A:Z

    invoke-virtual {v1, v3, v4}, Lcom/daaw/sl8;->w(J)V

    iget-object v0, v1, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    if-eqz v0, :cond_23

    cmp-long v6, v9, v7

    if-eqz v6, :cond_23

    check-cast v0, Lcom/daaw/cm8;

    iget-object v0, v0, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-virtual {v0}, Lcom/daaw/em8;->X()V

    :cond_23
    iget-object v0, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v0, v0, Lcom/daaw/wk8;->c:I

    if-nez v0, :cond_24

    iget-wide v6, v1, Lcom/daaw/sl8;->v:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    int-to-long v8, v0

    add-long/2addr v6, v8

    iput-wide v6, v1, Lcom/daaw/sl8;->v:J

    goto :goto_10

    :cond_24
    iget-wide v6, v1, Lcom/daaw/sl8;->w:J

    iget v0, v1, Lcom/daaw/sl8;->z:I

    int-to-long v8, v0

    int-to-long v10, v5

    mul-long v8, v8, v10

    add-long/2addr v6, v8

    iput-wide v6, v1, Lcom/daaw/sl8;->w:J

    :goto_10
    iput-object v2, v1, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    iput v5, v1, Lcom/daaw/sl8;->H:I

    :cond_25
    invoke-virtual {v1, v3, v4}, Lcom/daaw/sl8;->z(J)V

    iget-object v0, v1, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_26

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    iput v2, v1, Lcom/daaw/sl8;->H:I

    const/4 v3, 0x1

    return v3

    :cond_26
    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v0, v1, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/daaw/ik8;->i(J)Z

    move-result v0

    if-eqz v0, :cond_27

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->zze()V

    return v3

    :cond_27
    return v2

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_8
    .end packed-switch
.end method

.method public final d(Lcom/daaw/lh8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sl8;->m:Lcom/daaw/lh8;

    return-void
.end method

.method public final e(Z)J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/daaw/sl8;->B:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {v0, p1}, Lcom/daaw/ik8;->b(Z)J

    move-result-wide v0

    iget-object p1, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/daaw/wk8;->a(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :goto_0
    iget-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/cl8;

    iget-wide v2, p1, Lcom/daaw/cl8;->d:J

    cmp-long p1, v0, v2

    if-ltz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/cl8;

    iput-object p1, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iget-wide v2, p1, Lcom/daaw/cl8;->d:J

    sub-long v2, v0, v2

    iget-object p1, p1, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    sget-object v4, Lcom/daaw/pp3;->d:Lcom/daaw/pp3;

    invoke-virtual {p1, v4}, Lcom/daaw/pp3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iget-wide v0, p1, Lcom/daaw/cl8;->c:J

    add-long/2addr v0, v2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/sl8;->V:Lcom/daaw/yk8;

    invoke-virtual {p1, v2, v3}, Lcom/daaw/yk8;->a(J)J

    move-result-wide v0

    iget-object p1, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iget-wide v2, p1, Lcom/daaw/cl8;->c:J

    add-long/2addr v0, v2

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/cl8;

    iget-wide v2, p1, Lcom/daaw/cl8;->d:J

    iget-object v4, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iget-object v4, v4, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    iget v4, v4, Lcom/daaw/pp3;->a:F

    sub-long/2addr v2, v0

    invoke-static {v2, v3, v4}, Lcom/daaw/it5;->c0(JF)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/daaw/cl8;->c:J

    sub-long v0, v2, v0

    :goto_1
    iget-object p1, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object v2, p0, Lcom/daaw/sl8;->V:Lcom/daaw/yk8;

    invoke-virtual {v2}, Lcom/daaw/yk8;->b()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/daaw/wk8;->a(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_4
    :goto_2
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public final f(Lcom/daaw/f92;I[I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v3, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_4

    iget v0, v3, Lcom/daaw/f92;->A:I

    invoke-static {v0}, Lcom/daaw/it5;->v(I)Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    iget v0, v3, Lcom/daaw/f92;->A:I

    iget v6, v3, Lcom/daaw/f92;->y:I

    invoke-static {v0, v6}, Lcom/daaw/it5;->Y(II)I

    move-result v0

    iget-object v6, v1, Lcom/daaw/sl8;->d:[Lcom/daaw/hi8;

    iget-object v7, v1, Lcom/daaw/sl8;->c:Lcom/daaw/an8;

    iget v8, v3, Lcom/daaw/f92;->B:I

    iget v9, v3, Lcom/daaw/f92;->C:I

    invoke-virtual {v7, v8, v9}, Lcom/daaw/an8;->k(II)V

    sget v7, Lcom/daaw/it5;->a:I

    const/16 v8, 0x15

    if-ge v7, v8, :cond_0

    iget v7, v3, Lcom/daaw/f92;->y:I

    const/16 v8, 0x8

    if-ne v7, v8, :cond_0

    if-nez p3, :cond_0

    const/4 v7, 0x6

    new-array v8, v7, [I

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_1

    aput v9, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p3

    :cond_1
    iget-object v7, v1, Lcom/daaw/sl8;->b:Lcom/daaw/mk8;

    invoke-virtual {v7, v8}, Lcom/daaw/mk8;->i([I)V

    new-instance v7, Lcom/daaw/di8;

    iget v8, v3, Lcom/daaw/f92;->z:I

    iget v9, v3, Lcom/daaw/f92;->y:I

    iget v10, v3, Lcom/daaw/f92;->A:I

    invoke-direct {v7, v8, v9, v10}, Lcom/daaw/di8;-><init>(III)V

    array-length v8, v6

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    aget-object v10, v6, v9

    :try_start_0
    invoke-interface {v10, v7}, Lcom/daaw/hi8;->a(Lcom/daaw/di8;)Lcom/daaw/di8;

    move-result-object v11

    invoke-interface {v10}, Lcom/daaw/hi8;->zzg()Z

    move-result v10
    :try_end_0
    .catch Lcom/daaw/fi8; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v4, v10, :cond_2

    move-object v7, v11

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v2, Lcom/daaw/hj8;

    invoke-direct {v2, v0, v3}, Lcom/daaw/hj8;-><init>(Ljava/lang/Throwable;Lcom/daaw/f92;)V

    throw v2

    :cond_3
    iget v8, v7, Lcom/daaw/di8;->c:I

    iget v9, v7, Lcom/daaw/di8;->a:I

    iget v7, v7, Lcom/daaw/di8;->b:I

    invoke-static {v7}, Lcom/daaw/it5;->T(I)I

    move-result v10

    invoke-static {v8, v7}, Lcom/daaw/it5;->Y(II)I

    move-result v7

    move-object v11, v6

    move v6, v7

    move v7, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    move v10, v8

    move/from16 v8, v16

    goto :goto_2

    :cond_4
    new-array v0, v5, [Lcom/daaw/hi8;

    iget v6, v3, Lcom/daaw/f92;->z:I

    sget v7, Lcom/daaw/it5;->a:I

    iget-object v7, v1, Lcom/daaw/sl8;->a:Lcom/daaw/bi8;

    invoke-virtual {v7, v3}, Lcom/daaw/bi8;->a(Lcom/daaw/f92;)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_c

    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v9, 0x2

    move-object v11, v0

    move v10, v8

    const/4 v0, -0x1

    move v8, v7

    move v7, v6

    const/4 v6, -0x1

    :goto_2
    invoke-static {v7, v8, v10}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v12

    const/4 v13, -0x2

    if-eq v12, v13, :cond_5

    const/4 v13, 0x1

    goto :goto_3

    :cond_5
    const/4 v13, 0x0

    :goto_3
    invoke-static {v13}, Lcom/daaw/uo4;->f(Z)V

    const v13, 0x3d090

    if-eqz v9, :cond_8

    const-wide/32 v14, 0xf4240

    if-eq v9, v4, :cond_7

    const/4 v4, 0x5

    if-ne v10, v4, :cond_6

    const v13, 0x7a120

    const/4 v10, 0x5

    goto :goto_4

    :cond_6
    move v4, v10

    :goto_4
    int-to-long v2, v13

    invoke-static {v10}, Lcom/daaw/wl8;->b(I)I

    move-result v10

    move/from16 p3, v6

    int-to-long v5, v10

    mul-long v2, v2, v5

    div-long/2addr v2, v14

    invoke-static {v2, v3}, Lcom/daaw/i47;->a(J)I

    move-result v2

    move/from16 v6, p3

    move v10, v4

    goto :goto_5

    :cond_7
    move/from16 p3, v6

    invoke-static {v10}, Lcom/daaw/wl8;->b(I)I

    move-result v2

    int-to-long v2, v2

    const-wide/32 v4, 0x2faf080

    mul-long v2, v2, v4

    div-long/2addr v2, v14

    invoke-static {v2, v3}, Lcom/daaw/i47;->a(J)I

    move-result v2

    goto :goto_5

    :cond_8
    move/from16 p3, v6

    mul-int/lit8 v2, v12, 0x4

    invoke-static {v13, v7, v6}, Lcom/daaw/wl8;->a(III)I

    move-result v3

    const v4, 0xb71b0

    invoke-static {v4, v7, v6}, Lcom/daaw/wl8;->a(III)I

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/daaw/it5;->P(III)I

    move-result v2

    :goto_5
    int-to-double v2, v2

    double-to-int v2, v2

    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v6

    const/4 v3, -0x1

    add-int/2addr v2, v3

    div-int/2addr v2, v6

    mul-int v12, v2, v6

    const-string v2, ") for: "

    if-eqz v10, :cond_b

    if-eqz v8, :cond_a

    const/4 v3, 0x0

    iput-boolean v3, v1, Lcom/daaw/sl8;->T:Z

    new-instance v13, Lcom/daaw/wk8;

    move-object v2, v13

    move-object/from16 v3, p1

    move v4, v0

    move v5, v9

    move v9, v10

    move v10, v12

    invoke-direct/range {v2 .. v11}, Lcom/daaw/wk8;-><init>(Lcom/daaw/f92;IIIIIII[Lcom/daaw/hi8;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_9

    iput-object v13, v1, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    return-void

    :cond_9
    iput-object v13, v1, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    return-void

    :cond_a
    new-instance v0, Lcom/daaw/hj8;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid output channel config (mode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-direct {v0, v2, v3}, Lcom/daaw/hj8;-><init>(Ljava/lang/String;Lcom/daaw/f92;)V

    throw v0

    :cond_b
    move-object/from16 v3, p1

    new-instance v0, Lcom/daaw/hj8;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Invalid output encoding (mode="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/daaw/hj8;-><init>(Ljava/lang/String;Lcom/daaw/f92;)V

    throw v0

    :cond_c
    new-instance v0, Lcom/daaw/hj8;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/daaw/hj8;-><init>(Ljava/lang/String;Lcom/daaw/f92;)V

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method public final g(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/sl8;->Q:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lcom/daaw/sl8;->Q:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/sl8;->P:Z

    invoke-virtual {p0}, Lcom/daaw/sl8;->zze()V

    :cond_1
    return-void
.end method

.method public final h(Lcom/daaw/f92;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/sl8;->a(Lcom/daaw/f92;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Lcom/daaw/sc8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/sl8;->R:Lcom/daaw/sc8;

    invoke-virtual {v0, p1}, Lcom/daaw/sc8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lcom/daaw/sc8;->a:I

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/sl8;->R:Lcom/daaw/sc8;

    iget v0, v0, Lcom/daaw/sc8;->a:I

    :cond_1
    iput-object p1, p0, Lcom/daaw/sl8;->R:Lcom/daaw/sc8;

    return-void
.end method

.method public final j(F)V
    .locals 1

    iget v0, p0, Lcom/daaw/sl8;->D:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/sl8;->D:F

    invoke-virtual {p0}, Lcom/daaw/sl8;->B()V

    :cond_0
    return-void
.end method

.method public final k(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/sl8;->A(Lcom/daaw/pp3;Z)V

    return-void
.end method

.method public final l(Lcom/daaw/o98;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/sl8;->r:Lcom/daaw/o98;

    invoke-virtual {v0, p1}, Lcom/daaw/o98;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/daaw/sl8;->r:Lcom/daaw/o98;

    invoke-virtual {p0}, Lcom/daaw/sl8;->zze()V

    return-void
.end method

.method public final m(Lcom/daaw/lj8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    return-void
.end method

.method public final n(Lcom/daaw/pp3;)V
    .locals 4

    new-instance v0, Lcom/daaw/pp3;

    iget v1, p1, Lcom/daaw/pp3;->a:F

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v1, v2, v3}, Lcom/daaw/it5;->A(FFF)F

    move-result v1

    iget p1, p1, Lcom/daaw/pp3;->b:F

    invoke-static {p1, v2, v3}, Lcom/daaw/it5;->A(FFF)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/pp3;-><init>(FF)V

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object p1

    iget-boolean p1, p1, Lcom/daaw/cl8;->b:Z

    invoke-virtual {p0, v0, p1}, Lcom/daaw/sl8;->A(Lcom/daaw/pp3;Z)V

    return-void
.end method

.method public final s()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v1, v0, Lcom/daaw/wk8;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lcom/daaw/sl8;->v:J

    iget v0, v0, Lcom/daaw/wk8;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/daaw/sl8;->w:J

    :goto_0
    return-wide v1
.end method

.method public final t()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget v1, v0, Lcom/daaw/wk8;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lcom/daaw/sl8;->x:J

    iget v0, v0, Lcom/daaw/wk8;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/daaw/sl8;->y:J

    :goto_0
    return-wide v1
.end method

.method public final u(Lcom/daaw/wk8;)Landroid/media/AudioTrack;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sl8;->r:Lcom/daaw/o98;

    iget v2, p0, Lcom/daaw/sl8;->Q:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/wk8;->b(ZLcom/daaw/o98;I)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Lcom/daaw/jj8; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lcom/daaw/lj8;->a(Ljava/lang/Exception;)V

    :goto_0
    throw p1
.end method

.method public final v()Lcom/daaw/cl8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sl8;->s:Lcom/daaw/cl8;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cl8;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    :goto_0
    return-object v0
.end method

.method public final w(J)V
    .locals 12

    invoke-virtual {p0}, Lcom/daaw/sl8;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->V:Lcom/daaw/yk8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    invoke-virtual {v0, v1}, Lcom/daaw/yk8;->c(Lcom/daaw/pp3;)Lcom/daaw/pp3;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/pp3;->d:Lcom/daaw/pp3;

    :goto_0
    move-object v3, v1

    invoke-virtual {p0}, Lcom/daaw/sl8;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/sl8;->V:Lcom/daaw/yk8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v2

    iget-boolean v2, v2, Lcom/daaw/cl8;->b:Z

    invoke-virtual {v0, v2}, Lcom/daaw/yk8;->d(Z)Z

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v10, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    new-instance v11, Lcom/daaw/cl8;

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object p1, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v7

    invoke-virtual {p1, v7, v8}, Lcom/daaw/wk8;->a(J)J

    move-result-wide v7

    const/4 v9, 0x0

    move-object v2, v11

    move v4, v0

    invoke-direct/range {v2 .. v9}, Lcom/daaw/cl8;-><init>(Lcom/daaw/pp3;ZJJLcom/daaw/al8;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iget-object p1, p1, Lcom/daaw/wk8;->i:[Lcom/daaw/hi8;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    :goto_2
    if-ge v1, v2, :cond_3

    aget-object v3, p1, v1

    invoke-interface {v3}, Lcom/daaw/hi8;->zzg()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    invoke-interface {v3}, Lcom/daaw/hi8;->zzc()V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array v1, p1, [Lcom/daaw/hi8;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lcom/daaw/hi8;

    iput-object p2, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    new-array p1, p1, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/sl8;->F:[Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/daaw/sl8;->x()V

    iget-object p1, p0, Lcom/daaw/sl8;->n:Lcom/daaw/lj8;

    if-eqz p1, :cond_4

    check-cast p1, Lcom/daaw/cm8;

    iget-object p1, p1, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {p1}, Lcom/daaw/em8;->x0(Lcom/daaw/em8;)Lcom/daaw/dj8;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/dj8;->s(Z)V

    :cond_4
    return-void
.end method

.method public final x()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/hi8;->zzc()V

    iget-object v2, p0, Lcom/daaw/sl8;->F:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lcom/daaw/hi8;->zzb()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/sl8;->N:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sl8;->N:Z

    iget-object v0, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik8;->c(J)V

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    :cond_0
    return-void
.end method

.method public final z(J)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Lcom/daaw/sl8;->F:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    if-nez v2, :cond_1

    sget-object v2, Lcom/daaw/hi8;->a:Ljava/nio/ByteBuffer;

    :cond_1
    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lcom/daaw/sl8;->C(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/daaw/sl8;->E:[Lcom/daaw/hi8;

    aget-object v3, v3, v1

    iget v4, p0, Lcom/daaw/sl8;->L:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Lcom/daaw/hi8;->b(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Lcom/daaw/hi8;->zzb()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/sl8;->F:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final zzc()Lcom/daaw/pp3;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    return-object v0
.end method

.method public final zze()V
    .locals 12

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/sl8;->v:J

    iput-wide v0, p0, Lcom/daaw/sl8;->w:J

    iput-wide v0, p0, Lcom/daaw/sl8;->x:J

    iput-wide v0, p0, Lcom/daaw/sl8;->y:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/sl8;->U:Z

    iput v2, p0, Lcom/daaw/sl8;->z:I

    new-instance v11, Lcom/daaw/cl8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v3

    iget-object v4, v3, Lcom/daaw/cl8;->a:Lcom/daaw/pp3;

    invoke-virtual {p0}, Lcom/daaw/sl8;->v()Lcom/daaw/cl8;

    move-result-object v3

    iget-boolean v5, v3, Lcom/daaw/cl8;->b:Z

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lcom/daaw/cl8;-><init>(Lcom/daaw/pp3;ZJJLcom/daaw/al8;)V

    iput-object v11, p0, Lcom/daaw/sl8;->t:Lcom/daaw/cl8;

    iput-wide v0, p0, Lcom/daaw/sl8;->C:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/sl8;->s:Lcom/daaw/cl8;

    iget-object v1, p0, Lcom/daaw/sl8;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    iput-object v0, p0, Lcom/daaw/sl8;->G:Ljava/nio/ByteBuffer;

    iput v2, p0, Lcom/daaw/sl8;->H:I

    iput-object v0, p0, Lcom/daaw/sl8;->I:Ljava/nio/ByteBuffer;

    iput-boolean v2, p0, Lcom/daaw/sl8;->N:Z

    iput-boolean v2, p0, Lcom/daaw/sl8;->M:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/sl8;->L:I

    iget-object v1, p0, Lcom/daaw/sl8;->c:Lcom/daaw/an8;

    invoke-virtual {v1}, Lcom/daaw/an8;->j()V

    invoke-virtual {p0}, Lcom/daaw/sl8;->x()V

    iget-object v1, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {v1}, Lcom/daaw/ik8;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v1, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-static {v1}, Lcom/daaw/sl8;->F(Landroid/media/AudioTrack;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/sl8;->i:Lcom/daaw/ol8;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v1, v3}, Lcom/daaw/ol8;->b(Landroid/media/AudioTrack;)V

    :cond_1
    sget v1, Lcom/daaw/it5;->a:I

    const/16 v3, 0x15

    if-ge v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/daaw/sl8;->P:Z

    if-nez v1, :cond_2

    iput v2, p0, Lcom/daaw/sl8;->Q:I

    :cond_2
    iget-object v1, p0, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    if-eqz v1, :cond_3

    iput-object v1, p0, Lcom/daaw/sl8;->p:Lcom/daaw/wk8;

    iput-object v0, p0, Lcom/daaw/sl8;->o:Lcom/daaw/wk8;

    :cond_3
    iget-object v1, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {v1}, Lcom/daaw/ik8;->d()V

    iget-object v1, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    iget-object v2, p0, Lcom/daaw/sl8;->f:Lcom/daaw/ds4;

    invoke-virtual {v2}, Lcom/daaw/ds4;->c()Z

    sget-object v3, Lcom/daaw/sl8;->W:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-object v4, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    if-nez v4, :cond_4

    const-string v4, "ExoPlayer:AudioTrackReleaseThread"

    invoke-static {v4}, Lcom/daaw/it5;->q(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    sput-object v4, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    :cond_4
    sget v4, Lcom/daaw/sl8;->Y:I

    add-int/lit8 v4, v4, 0x1

    sput v4, Lcom/daaw/sl8;->Y:I

    sget-object v4, Lcom/daaw/sl8;->X:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lcom/daaw/ok8;

    invoke-direct {v5, v1, v2}, Lcom/daaw/ok8;-><init>(Landroid/media/AudioTrack;Lcom/daaw/ds4;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/daaw/sl8;->k:Lcom/daaw/el8;

    invoke-virtual {v0}, Lcom/daaw/el8;->a()V

    iget-object v0, p0, Lcom/daaw/sl8;->j:Lcom/daaw/el8;

    invoke-virtual {v0}, Lcom/daaw/el8;->a()V

    return-void
.end method

.method public final zzf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sl8;->A:Z

    return-void
.end method

.method public final zzg()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sl8;->O:Z

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {v0}, Lcom/daaw/ik8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public final zzh()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sl8;->O:Z

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {v0}, Lcom/daaw/ik8;->f()V

    iget-object v0, p0, Lcom/daaw/sl8;->q:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public final zzi()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/sl8;->M:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/sl8;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/sl8;->y()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sl8;->M:Z

    :cond_0
    return-void
.end method

.method public final zzj()V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/sl8;->zze()V

    iget-object v0, p0, Lcom/daaw/sl8;->d:[Lcom/daaw/hi8;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lcom/daaw/hi8;->zzf()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/sl8;->e:[Lcom/daaw/hi8;

    array-length v1, v0

    const/4 v1, 0x0

    :goto_1
    if-gtz v1, :cond_1

    aget-object v3, v0, v1

    invoke-interface {v3}, Lcom/daaw/hi8;->zzf()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Lcom/daaw/sl8;->O:Z

    iput-boolean v2, p0, Lcom/daaw/sl8;->T:Z

    return-void
.end method

.method public final zzt()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/sl8;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sl8;->g:Lcom/daaw/ik8;

    invoke-virtual {p0}, Lcom/daaw/sl8;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik8;->g(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
