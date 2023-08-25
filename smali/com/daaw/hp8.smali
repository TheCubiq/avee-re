.class public abstract Lcom/daaw/hp8;
.super Lcom/daaw/nk7;
.source ""


# static fields
.field public static final P0:[B


# instance fields
.field public A0:I

.field public final B:Lcom/daaw/ap8;

.field public B0:Z

.field public final C:Lcom/daaw/jp8;

.field public C0:Z

.field public final D:F

.field public D0:Z

.field public final E:Lcom/daaw/ma7;

.field public E0:J

.field public final F:Lcom/daaw/ma7;

.field public F0:J

.field public final G:Lcom/daaw/ma7;

.field public G0:Z

.field public final H:Lcom/daaw/vo8;

.field public H0:Z

.field public final I:Lcom/daaw/zp5;

.field public I0:Z

.field public final J:Ljava/util/ArrayList;

.field public J0:Lcom/daaw/ql7;

.field public final K:Landroid/media/MediaCodec$BufferInfo;

.field public K0:J

.field public final L:[J

.field public L0:J

.field public final M:[J

.field public M0:I

.field public final N:[J

.field public N0:Lcom/daaw/xn8;

.field public O:Lcom/daaw/f92;

.field public O0:Lcom/daaw/xn8;

.field public P:Lcom/daaw/f92;

.field public Q:Landroid/media/MediaCrypto;

.field public R:Z

.field public S:J

.field public T:F

.field public U:F

.field public V:Lcom/daaw/bp8;

.field public W:Lcom/daaw/f92;

.field public X:Landroid/media/MediaFormat;

.field public Y:Z

.field public Z:F

.field public a0:Ljava/util/ArrayDeque;

.field public b0:Lcom/daaw/gp8;

.field public c0:Lcom/daaw/ep8;

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:Lcom/daaw/wo8;

.field public o0:J

.field public p0:I

.field public q0:I

.field public r0:Ljava/nio/ByteBuffer;

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public w0:Z

.field public x0:Z

.field public y0:I

.field public z0:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/hp8;->P0:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILcom/daaw/ap8;Lcom/daaw/jp8;ZF)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/nk7;-><init>(I)V

    iput-object p2, p0, Lcom/daaw/hp8;->B:Lcom/daaw/ap8;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/hp8;->C:Lcom/daaw/jp8;

    iput p5, p0, Lcom/daaw/hp8;->D:F

    new-instance p1, Lcom/daaw/ma7;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Lcom/daaw/ma7;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/hp8;->E:Lcom/daaw/ma7;

    new-instance p1, Lcom/daaw/ma7;

    invoke-direct {p1, p2, p2}, Lcom/daaw/ma7;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    new-instance p1, Lcom/daaw/ma7;

    const/4 p3, 0x2

    invoke-direct {p1, p3, p2}, Lcom/daaw/ma7;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    new-instance p1, Lcom/daaw/vo8;

    invoke-direct {p1}, Lcom/daaw/vo8;-><init>()V

    iput-object p1, p0, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    new-instance p3, Lcom/daaw/zp5;

    const/16 p4, 0xa

    invoke-direct {p3, p4}, Lcom/daaw/zp5;-><init>(I)V

    iput-object p3, p0, Lcom/daaw/hp8;->I:Lcom/daaw/zp5;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/daaw/hp8;->T:F

    iput p3, p0, Lcom/daaw/hp8;->U:F

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/hp8;->S:J

    new-array p3, p4, [J

    iput-object p3, p0, Lcom/daaw/hp8;->L:[J

    new-array p3, p4, [J

    iput-object p3, p0, Lcom/daaw/hp8;->M:[J

    new-array p3, p4, [J

    iput-object p3, p0, Lcom/daaw/hp8;->N:[J

    iput-wide v0, p0, Lcom/daaw/hp8;->K0:J

    iput-wide v0, p0, Lcom/daaw/hp8;->L0:J

    invoke-virtual {p1, p2}, Lcom/daaw/ma7;->i(I)V

    iget-object p1, p1, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/daaw/hp8;->Z:F

    iput p2, p0, Lcom/daaw/hp8;->d0:I

    iput p2, p0, Lcom/daaw/hp8;->y0:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/hp8;->p0:I

    iput p1, p0, Lcom/daaw/hp8;->q0:I

    iput-wide v0, p0, Lcom/daaw/hp8;->o0:J

    iput-wide v0, p0, Lcom/daaw/hp8;->E0:J

    iput-wide v0, p0, Lcom/daaw/hp8;->F0:J

    iput p2, p0, Lcom/daaw/hp8;->z0:I

    iput p2, p0, Lcom/daaw/hp8;->A0:I

    return-void
.end method

.method private final X()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v0}, Lcom/daaw/bp8;->zzi()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/daaw/hp8;->m0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/daaw/hp8;->m0()V

    throw v0
.end method

.method public static r0(Lcom/daaw/f92;)Z
    .locals 0

    iget p0, p0, Lcom/daaw/f92;->E:I

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public A()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->I()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lcom/daaw/hp8;->O0:Lcom/daaw/xn8;

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lcom/daaw/hp8;->O0:Lcom/daaw/xn8;

    throw v1
.end method

.method public final D([Lcom/daaw/f92;JJ)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/hp8;->L0:J

    const/4 p1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-wide v0, p0, Lcom/daaw/hp8;->K0:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/uo4;->f(Z)V

    iput-wide p2, p0, Lcom/daaw/hp8;->K0:J

    iput-wide p4, p0, Lcom/daaw/hp8;->L0:J

    return-void

    :cond_1
    iget v0, p0, Lcom/daaw/hp8;->M0:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget-object p1, p0, Lcom/daaw/hp8;->M:[J

    const/16 v0, 0x9

    aget-wide v0, p1, v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many stream changes, so dropping offset: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MediaCodecRenderer"

    invoke-static {v0, p1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/hp8;->M0:I

    :goto_1
    iget-object p1, p0, Lcom/daaw/hp8;->L:[J

    iget v0, p0, Lcom/daaw/hp8;->M0:I

    add-int/lit8 v0, v0, -0x1

    aput-wide p2, p1, v0

    iget-object p1, p0, Lcom/daaw/hp8;->M:[J

    aput-wide p4, p1, v0

    iget-object p1, p0, Lcom/daaw/hp8;->N:[J

    iget-wide p2, p0, Lcom/daaw/hp8;->E0:J

    aput-wide p2, p1, v0

    return-void
.end method

.method public abstract E(FLcom/daaw/f92;[Lcom/daaw/f92;)F
.end method

.method public abstract F(Lcom/daaw/jp8;Lcom/daaw/f92;)I
.end method

.method public abstract G(Lcom/daaw/ep8;Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;
.end method

.method public H(Lcom/daaw/a78;)Lcom/daaw/tm7;
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/hp8;->I0:Z

    iget-object v4, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v4, Lcom/daaw/f92;->l:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_16

    iget-object p1, p1, Lcom/daaw/a78;->b:Lcom/daaw/xn8;

    iput-object p1, p0, Lcom/daaw/hp8;->O0:Lcom/daaw/xn8;

    iput-object v4, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    iget-boolean v1, p0, Lcom/daaw/hp8;->u0:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/daaw/hp8;->w0:Z

    return-object v3

    :cond_0
    iget-object v1, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-nez v1, :cond_1

    iput-object v3, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lcom/daaw/hp8;->j0()V

    return-object v3

    :cond_1
    iget-object v3, p0, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    iget-object v5, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    iget-object v6, p0, Lcom/daaw/hp8;->N0:Lcom/daaw/xn8;

    const/16 v7, 0x17

    if-ne v6, p1, :cond_13

    if-eq p1, v6, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    sget v6, Lcom/daaw/it5;->a:I

    if-lt v6, v7, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v6, 0x1

    :goto_2
    invoke-static {v6}, Lcom/daaw/uo4;->f(Z)V

    invoke-virtual {p0, v3, v5, v4}, Lcom/daaw/hp8;->G(Lcom/daaw/ep8;Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;

    move-result-object v6

    iget v7, v6, Lcom/daaw/tm7;->d:I

    const/4 v8, 0x3

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eqz v7, :cond_f

    if-eq v7, v0, :cond_a

    if-eq v7, v10, :cond_6

    invoke-virtual {p0, v4}, Lcom/daaw/hp8;->V(Lcom/daaw/f92;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    iput-object v4, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Lcom/daaw/hp8;->Q()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    :cond_6
    invoke-virtual {p0, v4}, Lcom/daaw/hp8;->V(Lcom/daaw/f92;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    iput-boolean v0, p0, Lcom/daaw/hp8;->x0:Z

    iput v0, p0, Lcom/daaw/hp8;->y0:I

    iget v7, p0, Lcom/daaw/hp8;->d0:I

    if-eq v7, v10, :cond_9

    if-ne v7, v0, :cond_8

    iget v7, v4, Lcom/daaw/f92;->q:I

    iget v9, v5, Lcom/daaw/f92;->q:I

    if-ne v7, v9, :cond_8

    iget v7, v4, Lcom/daaw/f92;->r:I

    iget v9, v5, Lcom/daaw/f92;->r:I

    if-ne v7, v9, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :cond_9
    :goto_3
    iput-boolean v0, p0, Lcom/daaw/hp8;->k0:Z

    iput-object v4, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Lcom/daaw/hp8;->Q()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    :cond_a
    invoke-virtual {p0, v4}, Lcom/daaw/hp8;->V(Lcom/daaw/f92;)Z

    move-result v7

    if-nez v7, :cond_b

    :goto_4
    const/16 v10, 0x10

    goto :goto_7

    :cond_b
    iput-object v4, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lcom/daaw/hp8;->Q()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    :cond_c
    iget-boolean p1, p0, Lcom/daaw/hp8;->B0:Z

    if-eqz p1, :cond_10

    iput v0, p0, Lcom/daaw/hp8;->z0:I

    iget-boolean p1, p0, Lcom/daaw/hp8;->f0:Z

    if-nez p1, :cond_e

    iget-boolean p1, p0, Lcom/daaw/hp8;->h0:Z

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    iput v0, p0, Lcom/daaw/hp8;->A0:I

    goto :goto_6

    :cond_e
    :goto_5
    iput v8, p0, Lcom/daaw/hp8;->A0:I

    goto :goto_7

    :cond_f
    invoke-virtual {p0}, Lcom/daaw/hp8;->J()V

    :cond_10
    :goto_6
    const/4 v10, 0x0

    :goto_7
    iget p1, v6, Lcom/daaw/tm7;->d:I

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-ne p1, v1, :cond_11

    iget p1, p0, Lcom/daaw/hp8;->A0:I

    if-ne p1, v8, :cond_12

    :cond_11
    new-instance p1, Lcom/daaw/tm7;

    iget-object v2, v3, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const/4 v0, 0x0

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    move v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/daaw/tm7;-><init>(Ljava/lang/String;Lcom/daaw/f92;Lcom/daaw/f92;II)V

    return-object p1

    :cond_12
    return-object v6

    :cond_13
    if-eqz p1, :cond_15

    if-nez v6, :cond_14

    goto :goto_8

    :cond_14
    sget-object p1, Lcom/daaw/ak8;->a:Ljava/util/UUID;

    invoke-virtual {p1, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    sget v0, Lcom/daaw/it5;->a:I

    if-lt v0, v7, :cond_15

    sget-object v0, Lcom/daaw/ak8;->e:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    :cond_15
    :goto_8
    invoke-virtual {p0}, Lcom/daaw/hp8;->J()V

    new-instance p1, Lcom/daaw/tm7;

    iget-object v2, v3, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v6, 0x80

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/tm7;-><init>(Ljava/lang/String;Lcom/daaw/f92;Lcom/daaw/f92;II)V

    return-object p1

    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v4, v2, v0}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object p1

    throw p1
.end method

.method public final I()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/hp8;->w0:Z

    iget-object v1, p0, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v1}, Lcom/daaw/i37;->b()V

    iget-object v1, p0, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/i37;->b()V

    iput-boolean v0, p0, Lcom/daaw/hp8;->v0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->u0:Z

    return-void
.end method

.method public final J()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/hp8;->B0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/hp8;->z0:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/hp8;->A0:I

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->j0()V

    return-void
.end method

.method public abstract K(Lcom/daaw/ep8;Lcom/daaw/f92;Landroid/media/MediaCrypto;F)Lcom/daaw/zo8;
.end method

.method public abstract L(Lcom/daaw/jp8;Lcom/daaw/f92;Z)Ljava/util/List;
.end method

.method public abstract M(Ljava/lang/Exception;)V
.end method

.method public abstract N(Ljava/lang/String;Lcom/daaw/zo8;JJ)V
.end method

.method public abstract O(Ljava/lang/String;)V
.end method

.method public final P()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    throw v0
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/4 v2, 0x0

    const/16 v3, 0x1776

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0
.end method

.method public final Q()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/hp8;->B0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lcom/daaw/hp8;->z0:I

    iget-boolean v0, p0, Lcom/daaw/hp8;->f0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/hp8;->h0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/hp8;->A0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/hp8;->A0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/hp8;->P()V

    :goto_1
    return v1
.end method

.method public final R()Z
    .locals 15

    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    const/4 v1, 0x0

    if-eqz v0, :cond_1f

    iget v2, p0, Lcom/daaw/hp8;->z0:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1f

    iget-boolean v2, p0, Lcom/daaw/hp8;->G0:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v2, p0, Lcom/daaw/hp8;->p0:I

    if-gez v2, :cond_2

    invoke-interface {v0}, Lcom/daaw/bp8;->zza()I

    move-result v0

    iput v0, p0, Lcom/daaw/hp8;->p0:I

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v4, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v4, v0}, Lcom/daaw/bp8;->zzf(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v2, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v0}, Lcom/daaw/i37;->b()V

    :cond_2
    iget v0, p0, Lcom/daaw/hp8;->z0:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Lcom/daaw/hp8;->m0:Z

    if-nez v0, :cond_3

    iput-boolean v2, p0, Lcom/daaw/hp8;->C0:Z

    iget-object v4, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget v5, p0, Lcom/daaw/hp8;->p0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lcom/daaw/bp8;->b(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/hp8;->u0()V

    :cond_3
    iput v3, p0, Lcom/daaw/hp8;->z0:I

    return v1

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/hp8;->k0:Z

    if-eqz v0, :cond_5

    iput-boolean v1, p0, Lcom/daaw/hp8;->k0:Z

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/daaw/hp8;->P0:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget v4, p0, Lcom/daaw/hp8;->p0:I

    const/4 v5, 0x0

    const/16 v6, 0x26

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/daaw/bp8;->b(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/hp8;->u0()V

    iput-boolean v2, p0, Lcom/daaw/hp8;->B0:Z

    return v2

    :cond_5
    iget v0, p0, Lcom/daaw/hp8;->y0:I

    if-ne v0, v2, :cond_7

    const/4 v0, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    iget-object v4, v4, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_6

    iget-object v4, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    iget-object v4, v4, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v5, v5, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    iput v3, p0, Lcom/daaw/hp8;->y0:I

    :cond_7
    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/nk7;->u()Lcom/daaw/a78;

    move-result-object v4

    :try_start_0
    iget-object v5, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {p0, v4, v5, v1}, Lcom/daaw/nk7;->r(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result v5
    :try_end_0
    .catch Lcom/daaw/j97; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {p0}, Lcom/daaw/nk7;->j()Z

    move-result v6

    if-eqz v6, :cond_8

    iget-wide v6, p0, Lcom/daaw/hp8;->E0:J

    iput-wide v6, p0, Lcom/daaw/hp8;->F0:J

    :cond_8
    const/4 v6, -0x3

    if-ne v5, v6, :cond_9

    return v1

    :cond_9
    const/4 v7, -0x5

    if-ne v5, v7, :cond_b

    iget v0, p0, Lcom/daaw/hp8;->y0:I

    if-ne v0, v3, :cond_a

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v0}, Lcom/daaw/i37;->b()V

    iput v2, p0, Lcom/daaw/hp8;->y0:I

    :cond_a
    invoke-virtual {p0, v4}, Lcom/daaw/hp8;->H(Lcom/daaw/a78;)Lcom/daaw/tm7;

    return v2

    :cond_b
    iget-object v4, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v4}, Lcom/daaw/i37;->g()Z

    move-result v5

    if-eqz v5, :cond_f

    iget v0, p0, Lcom/daaw/hp8;->y0:I

    if-ne v0, v3, :cond_c

    invoke-virtual {v4}, Lcom/daaw/i37;->b()V

    iput v2, p0, Lcom/daaw/hp8;->y0:I

    :cond_c
    iput-boolean v2, p0, Lcom/daaw/hp8;->G0:Z

    iget-boolean v0, p0, Lcom/daaw/hp8;->B0:Z

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lcom/daaw/hp8;->t0()V

    return v1

    :cond_d
    :try_start_1
    iget-boolean v0, p0, Lcom/daaw/hp8;->m0:Z

    if-nez v0, :cond_e

    iput-boolean v2, p0, Lcom/daaw/hp8;->C0:Z

    iget-object v3, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget v4, p0, Lcom/daaw/hp8;->p0:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x4

    invoke-interface/range {v3 .. v9}, Lcom/daaw/bp8;->b(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/hp8;->u0()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_e
    return v1

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/it5;->V(I)I

    move-result v3

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0

    :cond_f
    iget-boolean v5, p0, Lcom/daaw/hp8;->B0:Z

    if-nez v5, :cond_11

    invoke-virtual {v4}, Lcom/daaw/i37;->h()Z

    move-result v5

    if-nez v5, :cond_11

    invoke-virtual {v4}, Lcom/daaw/i37;->b()V

    iget v0, p0, Lcom/daaw/hp8;->y0:I

    if-ne v0, v3, :cond_10

    iput v2, p0, Lcom/daaw/hp8;->y0:I

    :cond_10
    return v2

    :cond_11
    invoke-virtual {v4}, Lcom/daaw/ma7;->k()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v4, v4, Lcom/daaw/ma7;->b:Lcom/daaw/d77;

    invoke-virtual {v4, v0}, Lcom/daaw/d77;->b(I)V

    :cond_12
    iget-boolean v0, p0, Lcom/daaw/hp8;->e0:Z

    if-eqz v0, :cond_19

    if-nez v3, :cond_19

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    sget-object v4, Lcom/daaw/c42;->a:[B

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_1
    add-int/lit8 v8, v5, 0x1

    if-ge v8, v4, :cond_17

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    const/4 v10, 0x3

    if-ne v7, v10, :cond_14

    if-ne v9, v2, :cond_15

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    and-int/lit8 v9, v9, 0x1f

    const/4 v10, 0x7

    if-ne v9, v10, :cond_13

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v7

    add-int/2addr v5, v6

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_3

    :cond_13
    const/4 v9, 0x1

    goto :goto_2

    :cond_14
    if-nez v9, :cond_15

    add-int/lit8 v7, v7, 0x1

    :cond_15
    :goto_2
    if-eqz v9, :cond_16

    const/4 v7, 0x0

    :cond_16
    move v5, v8

    goto :goto_1

    :cond_17
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_3
    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-nez v0, :cond_18

    return v2

    :cond_18
    iput-boolean v1, p0, Lcom/daaw/hp8;->e0:Z

    :cond_19
    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-wide v4, v0, Lcom/daaw/ma7;->e:J

    iget-object v6, p0, Lcom/daaw/hp8;->n0:Lcom/daaw/wo8;

    if-eqz v6, :cond_1a

    iget-object v4, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {v6, v4, v0}, Lcom/daaw/wo8;->b(Lcom/daaw/f92;Lcom/daaw/ma7;)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/hp8;->E0:J

    iget-object v0, p0, Lcom/daaw/hp8;->n0:Lcom/daaw/wo8;

    iget-object v8, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {v0, v8}, Lcom/daaw/wo8;->a(Lcom/daaw/f92;)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/daaw/hp8;->E0:J

    :cond_1a
    move-wide v12, v4

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v0}, Lcom/daaw/i37;->f()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    iget-boolean v0, p0, Lcom/daaw/hp8;->I0:Z

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/daaw/hp8;->I:Lcom/daaw/zp5;

    iget-object v4, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {v0, v12, v13, v4}, Lcom/daaw/zp5;->d(JLjava/lang/Object;)V

    iput-boolean v1, p0, Lcom/daaw/hp8;->I0:Z

    :cond_1c
    iget-wide v4, p0, Lcom/daaw/hp8;->E0:J

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/hp8;->E0:J

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v0}, Lcom/daaw/ma7;->j()V

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {v0}, Lcom/daaw/i37;->e()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-virtual {p0, v0}, Lcom/daaw/hp8;->i0(Lcom/daaw/ma7;)V

    :cond_1d
    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    invoke-virtual {p0, v0}, Lcom/daaw/hp8;->Z(Lcom/daaw/ma7;)V

    if-eqz v3, :cond_1e

    :try_start_2
    iget-object v8, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget v9, p0, Lcom/daaw/hp8;->p0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v11, v0, Lcom/daaw/ma7;->b:Lcom/daaw/d77;

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lcom/daaw/bp8;->d(IILcom/daaw/d77;JI)V

    goto :goto_4

    :cond_1e
    iget-object v8, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget v9, p0, Lcom/daaw/hp8;->p0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    iget-object v0, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v11

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lcom/daaw/bp8;->b(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_4
    invoke-virtual {p0}, Lcom/daaw/hp8;->u0()V

    iput-boolean v2, p0, Lcom/daaw/hp8;->B0:Z

    iput v1, p0, Lcom/daaw/hp8;->y0:I

    iget-object v0, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v1, v0, Lcom/daaw/ql7;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/ql7;->c:I

    return v2

    :catch_1
    move-exception v0

    iget-object v2, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/it5;->V(I)I

    move-result v3

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/daaw/hp8;->M(Ljava/lang/Exception;)V

    invoke-virtual {p0, v1}, Lcom/daaw/hp8;->T(I)Z

    invoke-direct {p0}, Lcom/daaw/hp8;->X()V

    return v2

    :cond_1f
    :goto_5
    return v1
.end method

.method public final S()Z
    .locals 1

    iget v0, p0, Lcom/daaw/hp8;->q0:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final T(I)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/nk7;->u()Lcom/daaw/a78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hp8;->E:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/i37;->b()V

    iget-object v1, p0, Lcom/daaw/hp8;->E:Lcom/daaw/ma7;

    or-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/nk7;->r(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, -0x5

    if-ne p1, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/hp8;->H(Lcom/daaw/a78;)Lcom/daaw/tm7;

    return v1

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/hp8;->E:Lcom/daaw/ma7;

    invoke-virtual {p1}, Lcom/daaw/i37;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lcom/daaw/hp8;->G0:Z

    invoke-virtual {p0}, Lcom/daaw/hp8;->t0()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final U(J)Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/hp8;->S:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lcom/daaw/hp8;->S:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final V(Lcom/daaw/f92;)Z
    .locals 4

    sget v0, Lcom/daaw/it5;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/daaw/hp8;->A0:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    invoke-virtual {p0}, Lcom/daaw/nk7;->m()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/daaw/hp8;->U:F

    invoke-virtual {p0}, Lcom/daaw/nk7;->p()[Lcom/daaw/f92;

    move-result-object v2

    invoke-virtual {p0, v0, p1, v2}, Lcom/daaw/hp8;->E(FLcom/daaw/f92;[Lcom/daaw/f92;)F

    move-result p1

    iget v0, p0, Lcom/daaw/hp8;->Z:F

    cmpl-float v2, v0, p1

    if-nez v2, :cond_2

    return v1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, p1, v2

    if-nez v3, :cond_3

    invoke-virtual {p0}, Lcom/daaw/hp8;->J()V

    const/4 p1, 0x0

    return p1

    :cond_3
    cmpl-float v0, v0, v2

    if-nez v0, :cond_5

    iget v0, p0, Lcom/daaw/hp8;->D:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "operating-rate"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v2, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v2, v0}, Lcom/daaw/bp8;->o(Landroid/os/Bundle;)V

    iput p1, p0, Lcom/daaw/hp8;->Z:F

    :cond_6
    :goto_1
    return v1
.end method

.method public abstract W(Lcom/daaw/f92;Landroid/media/MediaFormat;)V
.end method

.method public abstract Y()V
.end method

.method public abstract Z(Lcom/daaw/ma7;)V
.end method

.method public a0()V
    .locals 0

    return-void
.end method

.method public abstract b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z
.end method

.method public final c(Lcom/daaw/f92;)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/hp8;->C:Lcom/daaw/jp8;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/hp8;->F(Lcom/daaw/jp8;Lcom/daaw/f92;)I

    move-result p1
    :try_end_0
    .catch Lcom/daaw/qp8; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    const/16 v2, 0xfa2

    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object p1

    throw p1
.end method

.method public c0(Lcom/daaw/f92;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final d0()F
    .locals 1

    iget v0, p0, Lcom/daaw/hp8;->T:F

    return v0
.end method

.method public e(FF)V
    .locals 0

    iput p1, p0, Lcom/daaw/hp8;->T:F

    iput p2, p0, Lcom/daaw/hp8;->U:F

    iget-object p1, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    invoke-virtual {p0, p1}, Lcom/daaw/hp8;->V(Lcom/daaw/f92;)Z

    return-void
.end method

.method public final e0()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hp8;->L0:J

    return-wide v0
.end method

.method public final f0()Lcom/daaw/bp8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    return-object v0
.end method

.method public g0(Ljava/lang/Throwable;Lcom/daaw/ep8;)Lcom/daaw/cp8;
    .locals 1

    new-instance v0, Lcom/daaw/cp8;

    invoke-direct {v0, p1, p2}, Lcom/daaw/cp8;-><init>(Ljava/lang/Throwable;Lcom/daaw/ep8;)V

    return-object v0
.end method

.method public final h0()Lcom/daaw/ep8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    return-object v0
.end method

.method public final i(JJ)V
    .locals 23

    move-object/from16 v15, p0

    const/4 v14, 0x1

    const/4 v13, 0x0

    :try_start_0
    iget-boolean v0, v15, Lcom/daaw/hp8;->H0:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->a0()V

    return-void

    :cond_0
    iget-object v0, v15, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/4 v11, 0x2

    if-nez v0, :cond_2

    invoke-virtual {v15, v11}, Lcom/daaw/hp8;->T(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->j0()V

    iget-boolean v0, v15, Lcom/daaw/hp8;->u0:Z

    if-eqz v0, :cond_10

    const-string v0, "bypassRender"

    sget v1, Lcom/daaw/it5;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-boolean v0, v15, Lcom/daaw/hp8;->H0:Z

    xor-int/2addr v0, v14

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/vo8;->q()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v7, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/daaw/hp8;->q0:I

    invoke-virtual {v0}, Lcom/daaw/vo8;->m()I

    move-result v10

    iget-wide v11, v0, Lcom/daaw/ma7;->e:J

    invoke-virtual {v0}, Lcom/daaw/i37;->f()Z

    move-result v16

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0}, Lcom/daaw/i37;->g()Z

    move-result v0

    iget-object v4, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_b

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v17, v4

    move-wide/from16 v4, p3

    move/from16 v13, v16

    move v14, v0

    move-object/from16 v15, v17

    :try_start_1
    invoke-virtual/range {v1 .. v15}, Lcom/daaw/hp8;->b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_4

    move-object/from16 v15, p0

    :try_start_2
    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/vo8;->n()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lcom/daaw/hp8;->k0(J)V

    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/i37;->b()V

    goto :goto_2

    :cond_4
    move-object/from16 v15, p0

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_5

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    const/16 v19, 0x0

    goto/16 :goto_10

    :cond_5
    :goto_2
    iget-boolean v0, v15, Lcom/daaw/hp8;->G0:Z

    const/4 v14, 0x1

    if-eqz v0, :cond_6

    iput-boolean v14, v15, Lcom/daaw/hp8;->H0:Z

    const/4 v13, 0x0

    goto/16 :goto_5

    :cond_6
    iget-boolean v0, v15, Lcom/daaw/hp8;->v0:Z

    if-eqz v0, :cond_7

    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v0, v1}, Lcom/daaw/vo8;->p(Lcom/daaw/ma7;)Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    const/4 v13, 0x0

    iput-boolean v13, v15, Lcom/daaw/hp8;->v0:Z

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    :goto_3
    iget-boolean v0, v15, Lcom/daaw/hp8;->w0:Z

    if-eqz v0, :cond_8

    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/vo8;->q()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->I()V

    iput-boolean v13, v15, Lcom/daaw/hp8;->w0:Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->j0()V

    iget-boolean v0, v15, Lcom/daaw/hp8;->u0:Z

    if-eqz v0, :cond_f

    :cond_8
    iget-boolean v0, v15, Lcom/daaw/hp8;->G0:Z

    xor-int/2addr v0, v14

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->u()Lcom/daaw/a78;

    move-result-object v0

    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/i37;->b()V

    :cond_9
    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/i37;->b()V

    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v15, v0, v1, v13}, Lcom/daaw/nk7;->r(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result v1

    const/4 v2, -0x5

    if-eq v1, v2, :cond_d

    const/4 v2, -0x4

    if-eq v1, v2, :cond_a

    goto :goto_4

    :cond_a
    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/i37;->g()Z

    move-result v1

    if-eqz v1, :cond_b

    iput-boolean v14, v15, Lcom/daaw/hp8;->G0:Z

    goto :goto_4

    :cond_b
    iget-boolean v1, v15, Lcom/daaw/hp8;->I0:Z

    if-eqz v1, :cond_c

    iget-object v1, v15, Lcom/daaw/hp8;->O:Lcom/daaw/f92;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_b

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    iput-object v1, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;

    const/4 v2, 0x0

    invoke-virtual {v15, v1, v2}, Lcom/daaw/hp8;->W(Lcom/daaw/f92;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/daaw/hp8;->I0:Z

    :cond_c
    iget-object v1, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1}, Lcom/daaw/ma7;->j()V

    iget-object v1, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    iget-object v2, v15, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {v1, v2}, Lcom/daaw/vo8;->p(Lcom/daaw/ma7;)Z

    move-result v1

    if-nez v1, :cond_9

    iput-boolean v14, v15, Lcom/daaw/hp8;->v0:Z

    goto :goto_4

    :cond_d
    invoke-virtual {v15, v0}, Lcom/daaw/hp8;->H(Lcom/daaw/a78;)Lcom/daaw/tm7;

    :goto_4
    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/vo8;->q()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {v0}, Lcom/daaw/ma7;->j()V

    :cond_e
    iget-object v0, v15, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0}, Lcom/daaw/vo8;->q()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/daaw/hp8;->G0:Z

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/daaw/hp8;->w0:Z

    if-eqz v0, :cond_f

    goto/16 :goto_1

    :cond_f
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    move-object v1, v15

    const/4 v2, 0x1

    const/16 v19, 0x0

    goto/16 :goto_15

    :cond_10
    iget-object v0, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_b

    if-eqz v0, :cond_28

    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const-string v0, "drainAndFeed"

    sget v1, Lcom/daaw/it5;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->S()Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_8

    if-nez v0, :cond_20

    :try_start_5
    iget-boolean v0, v15, Lcom/daaw/hp8;->i0:Z

    if-eqz v0, :cond_12

    iget-boolean v0, v15, Lcom/daaw/hp8;->C0:Z
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_b

    if-eqz v0, :cond_12

    :try_start_6
    iget-object v0, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget-object v1, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lcom/daaw/bp8;->h(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_8

    :catch_1
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->t0()V

    iget-boolean v0, v15, Lcom/daaw/hp8;->H0:Z

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->l0()V

    :cond_11
    :goto_7
    move-wide v2, v9

    move-object v1, v15

    const/16 v19, 0x0

    goto/16 :goto_13

    :cond_12
    iget-object v0, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget-object v1, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lcom/daaw/bp8;->h(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_8
    if-gez v0, :cond_16

    const/4 v1, -0x2

    if-ne v0, v1, :cond_14

    iput-boolean v14, v15, Lcom/daaw/hp8;->D0:Z

    iget-object v0, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v0}, Lcom/daaw/bp8;->zzc()Landroid/media/MediaFormat;

    move-result-object v0

    iget v1, v15, Lcom/daaw/hp8;->d0:I

    if-eqz v1, :cond_13

    const-string v1, "width"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_13

    const-string v1, "height"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v2, :cond_13

    iput-boolean v14, v15, Lcom/daaw/hp8;->l0:Z

    goto :goto_a

    :cond_13
    iput-object v0, v15, Lcom/daaw/hp8;->X:Landroid/media/MediaFormat;

    iput-boolean v14, v15, Lcom/daaw/hp8;->Y:Z

    goto :goto_a

    :cond_14
    iget-boolean v0, v15, Lcom/daaw/hp8;->m0:Z

    if-eqz v0, :cond_11

    iget-boolean v0, v15, Lcom/daaw/hp8;->G0:Z

    if-nez v0, :cond_15

    iget v0, v15, Lcom/daaw/hp8;->z0:I

    if-ne v0, v11, :cond_11

    :cond_15
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->t0()V

    goto :goto_7

    :cond_16
    iget-boolean v1, v15, Lcom/daaw/hp8;->l0:Z

    if-eqz v1, :cond_17

    iput-boolean v13, v15, Lcom/daaw/hp8;->l0:Z

    iget-object v1, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v1, v0, v13}, Lcom/daaw/bp8;->g(IZ)V

    :goto_a
    move-wide v2, v9

    move-object v1, v15

    const/16 v16, 0x2

    const/16 v19, 0x0

    goto/16 :goto_12

    :cond_17
    iget-object v1, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_18

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_18

    goto :goto_9

    :cond_18
    iput v0, v15, Lcom/daaw/hp8;->q0:I

    iget-object v1, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v1, v0}, Lcom/daaw/bp8;->c(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lcom/daaw/hp8;->r0:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_19

    iget-object v1, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lcom/daaw/hp8;->r0:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_19
    iget-boolean v0, v15, Lcom/daaw/hp8;->j0:Z

    if-eqz v0, :cond_1a

    iget-object v0, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1a

    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_1a

    iget-wide v1, v15, Lcom/daaw/hp8;->E0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1a

    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_1a
    iget-object v0, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v2, v15, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v2, :cond_1c

    iget-object v4, v15, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-nez v6, :cond_1b

    iget-object v0, v15, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_c

    :cond_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_1c
    const/4 v0, 0x0

    :goto_c
    iput-boolean v0, v15, Lcom/daaw/hp8;->s0:Z

    iget-wide v0, v15, Lcom/daaw/hp8;->F0:J

    iget-object v2, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1d

    const/4 v0, 0x1

    goto :goto_d

    :cond_1d
    const/4 v0, 0x0

    :goto_d
    iput-boolean v0, v15, Lcom/daaw/hp8;->t0:Z

    iget-object v0, v15, Lcom/daaw/hp8;->I:Lcom/daaw/zp5;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/zp5;->c(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f92;

    if-nez v0, :cond_1e

    iget-boolean v1, v15, Lcom/daaw/hp8;->Y:Z

    if-eqz v1, :cond_1e

    iget-object v0, v15, Lcom/daaw/hp8;->I:Lcom/daaw/zp5;

    invoke-virtual {v0}, Lcom/daaw/zp5;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f92;

    :cond_1e
    if-eqz v0, :cond_1f

    iput-object v0, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;

    goto :goto_e

    :cond_1f
    iget-boolean v0, v15, Lcom/daaw/hp8;->Y:Z

    if-eqz v0, :cond_20

    iget-object v0, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;

    if-eqz v0, :cond_20

    :goto_e
    iget-object v0, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;

    iget-object v1, v15, Lcom/daaw/hp8;->X:Landroid/media/MediaFormat;

    invoke-virtual {v15, v0, v1}, Lcom/daaw/hp8;->W(Lcom/daaw/f92;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/daaw/hp8;->Y:Z
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_b

    :cond_20
    :try_start_8
    iget-boolean v0, v15, Lcom/daaw/hp8;->i0:Z
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_8

    if-eqz v0, :cond_22

    :try_start_9
    iget-boolean v0, v15, Lcom/daaw/hp8;->C0:Z
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_5

    if-eqz v0, :cond_22

    :try_start_a
    iget-object v6, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget-object v7, v15, Lcom/daaw/hp8;->r0:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/daaw/hp8;->q0:I

    iget-object v0, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/16 v16, 0x1

    iget-wide v4, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v0, v15, Lcom/daaw/hp8;->s0:Z

    iget-boolean v2, v15, Lcom/daaw/hp8;->t0:Z

    iget-object v3, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_2

    move-object/from16 v1, p0

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-wide/from16 v2, p1

    move-wide/from16 v19, v4

    move-wide/from16 v4, p3

    move-wide/from16 v21, v9

    move v9, v12

    move/from16 v10, v16

    const/16 v16, 0x2

    move-wide/from16 v11, v19

    const/16 v19, 0x0

    move v13, v0

    move/from16 v14, v17

    move-object/from16 v15, v18

    :try_start_b
    invoke-virtual/range {v1 .. v15}, Lcom/daaw/hp8;->b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z

    move-result v0
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_11

    :catch_2
    move-wide/from16 v21, v9

    const/16 v19, 0x0

    :catch_3
    :try_start_c
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->t0()V
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_4

    move-object/from16 v15, p0

    :try_start_d
    iget-boolean v0, v15, Lcom/daaw/hp8;->H0:Z

    if-eqz v0, :cond_21

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->l0()V

    :cond_21
    move-object v1, v15

    :goto_f
    move-wide/from16 v2, v21

    goto :goto_13

    :catch_4
    move-exception v0

    const/4 v2, 0x1

    :goto_10
    move-object/from16 v1, p0

    goto/16 :goto_17

    :catch_5
    move-exception v0

    const/16 v19, 0x0

    goto/16 :goto_14

    :cond_22
    move-wide/from16 v21, v9

    const/16 v16, 0x2

    const/16 v19, 0x0

    iget-object v6, v15, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iget-object v7, v15, Lcom/daaw/hp8;->r0:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/daaw/hp8;->q0:I

    iget-object v0, v15, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v10, 0x1

    iget-wide v11, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v13, v15, Lcom/daaw/hp8;->s0:Z

    iget-boolean v14, v15, Lcom/daaw/hp8;->t0:Z

    iget-object v0, v15, Lcom/daaw/hp8;->P:Lcom/daaw/f92;
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_7

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object v15, v0

    :try_start_e
    invoke-virtual/range {v1 .. v15}, Lcom/daaw/hp8;->b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z

    move-result v0
    :try_end_e
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_6

    :goto_11
    if-eqz v0, :cond_25

    move-object/from16 v1, p0

    :try_start_f
    iget-object v0, v1, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v2, v3}, Lcom/daaw/hp8;->k0(J)V

    iget-object v0, v1, Lcom/daaw/hp8;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->v0()V

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->t0()V

    goto :goto_f

    :cond_23
    move-wide/from16 v2, v21

    :goto_12
    invoke-virtual {v1, v2, v3}, Lcom/daaw/hp8;->U(J)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_13

    :cond_24
    move-object v15, v1

    move-wide v9, v2

    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_6

    :cond_25
    move-object/from16 v1, p0

    goto :goto_f

    :cond_26
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->R()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual {v1, v2, v3}, Lcom/daaw/hp8;->U(J)Z

    move-result v0

    if-nez v0, :cond_26

    :cond_27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x1

    goto :goto_15

    :catch_6
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_16

    :catch_7
    move-exception v0

    :goto_14
    move-object v1, v15

    goto :goto_16

    :catch_8
    move-exception v0

    move-object v1, v15

    const/16 v19, 0x0

    goto :goto_16

    :cond_28
    move-object v1, v15

    const/16 v19, 0x0

    iget-object v0, v1, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v2, v0, Lcom/daaw/ql7;->d:I

    invoke-virtual/range {p0 .. p2}, Lcom/daaw/nk7;->t(J)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/daaw/ql7;->d:I
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_a

    const/4 v2, 0x1

    :try_start_10
    invoke-virtual {v1, v2}, Lcom/daaw/hp8;->T(I)Z

    :goto_15
    iget-object v0, v1, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v0}, Lcom/daaw/ql7;->a()V
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_9

    return-void

    :catch_9
    move-exception v0

    goto :goto_17

    :catch_a
    move-exception v0

    :goto_16
    const/4 v2, 0x1

    goto :goto_17

    :catch_b
    move-exception v0

    move-object v1, v15

    const/4 v2, 0x1

    const/16 v19, 0x0

    :goto_17
    sget v3, Lcom/daaw/it5;->a:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_29

    instance-of v5, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v5, :cond_29

    goto :goto_18

    :cond_29
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v5

    array-length v6, v5

    if-lez v6, :cond_2c

    aget-object v5, v5, v19

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "android.media.MediaCodec"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2c

    :goto_18
    invoke-virtual {v1, v0}, Lcom/daaw/hp8;->M(Ljava/lang/Exception;)V

    if-lt v3, v4, :cond_2a

    instance-of v3, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_2a

    move-object v3, v0

    check-cast v3, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result v3

    if-eqz v3, :cond_2a

    const/4 v14, 0x1

    goto :goto_19

    :cond_2a
    const/4 v14, 0x0

    :goto_19
    if-eqz v14, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hp8;->l0()V

    :cond_2b
    iget-object v2, v1, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/hp8;->g0(Ljava/lang/Throwable;Lcom/daaw/ep8;)Lcom/daaw/cp8;

    move-result-object v0

    iget-object v2, v1, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/16 v3, 0xfa3

    invoke-virtual {v1, v0, v2, v14, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0

    :cond_2c
    goto :goto_1b

    :goto_1a
    throw v0

    :goto_1b
    goto :goto_1a
.end method

.method public i0(Lcom/daaw/ma7;)V
    .locals 0

    return-void
.end method

.method public final j0()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-nez v0, :cond_d

    iget-boolean v0, p0, Lcom/daaw/hp8;->u0:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v1, p0, Lcom/daaw/hp8;->O0:Lcom/daaw/xn8;

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/hp8;->c0(Lcom/daaw/f92;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual {p0}, Lcom/daaw/hp8;->I()V

    iget-object v0, v0, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v1, "audio/mp4a-latm"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-string v1, "audio/mpeg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "audio/opus"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {v0, v2}, Lcom/daaw/vo8;->o(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/daaw/vo8;->o(I)V

    :goto_0
    iput-boolean v2, p0, Lcom/daaw/hp8;->u0:Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/hp8;->O0:Lcom/daaw/xn8;

    iput-object v0, p0, Lcom/daaw/hp8;->N0:Lcom/daaw/xn8;

    iget-object v1, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    iget-object v2, v1, Lcom/daaw/f92;->l:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    sget-boolean v3, Lcom/daaw/zn8;->a:Z

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/xn8;->a()Lcom/daaw/fn8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    iget v3, v0, Lcom/daaw/fn8;->p:I

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0

    :cond_4
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;
    :try_end_0
    .catch Lcom/daaw/gp8; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v3, 0x0

    if-nez v0, :cond_6

    :try_start_1
    iget-object v0, p0, Lcom/daaw/hp8;->C:Lcom/daaw/jp8;

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/hp8;->L(Lcom/daaw/jp8;Lcom/daaw/f92;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ep8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_5
    iput-object v3, p0, Lcom/daaw/hp8;->b0:Lcom/daaw/gp8;
    :try_end_1
    .catch Lcom/daaw/qp8; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/daaw/gp8; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Lcom/daaw/gp8;

    iget-object v3, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const v4, -0xc34e

    invoke-direct {v1, v3, v0, v2, v4}, Lcom/daaw/gp8;-><init>(Lcom/daaw/f92;Ljava/lang/Throwable;ZI)V

    throw v1

    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ep8;

    :goto_3
    iget-object v1, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ep8;

    invoke-virtual {p0, v1}, Lcom/daaw/hp8;->q0(Lcom/daaw/ep8;)Z

    move-result v4
    :try_end_2
    .catch Lcom/daaw/gp8; {:try_start_2 .. :try_end_2} :catch_3

    if-nez v4, :cond_7

    return-void

    :cond_7
    :try_start_3
    invoke-virtual {p0, v1, v3}, Lcom/daaw/hp8;->s0(Lcom/daaw/ep8;Landroid/media/MediaCrypto;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    const-string v5, "MediaCodecRenderer"

    if-ne v1, v0, :cond_8

    :try_start_4
    const-string v4, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    invoke-static {v5, v4}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v6, 0x32

    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/hp8;->s0(Lcom/daaw/ep8;Landroid/media/MediaCrypto;)V

    goto :goto_3

    :cond_8
    throw v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v4

    :try_start_5
    const-string v6, "Failed to initialize decoder: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lcom/daaw/s95;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v5, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v5, Lcom/daaw/gp8;

    iget-object v6, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-direct {v5, v6, v4, v2, v1}, Lcom/daaw/gp8;-><init>(Lcom/daaw/f92;Ljava/lang/Throwable;ZLcom/daaw/ep8;)V

    invoke-virtual {p0, v5}, Lcom/daaw/hp8;->M(Ljava/lang/Exception;)V

    iget-object v1, p0, Lcom/daaw/hp8;->b0:Lcom/daaw/gp8;

    if-nez v1, :cond_9

    iput-object v5, p0, Lcom/daaw/hp8;->b0:Lcom/daaw/gp8;

    goto :goto_4

    :cond_9
    invoke-static {v1, v5}, Lcom/daaw/gp8;->a(Lcom/daaw/gp8;Lcom/daaw/gp8;)Lcom/daaw/gp8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/hp8;->b0:Lcom/daaw/gp8;

    :goto_4
    iget-object v1, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lcom/daaw/hp8;->b0:Lcom/daaw/gp8;

    throw v0

    :cond_b
    iput-object v3, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    return-void

    :cond_c
    new-instance v0, Lcom/daaw/gp8;

    iget-object v1, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const v4, -0xc34f

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/daaw/gp8;-><init>(Lcom/daaw/f92;Ljava/lang/Throwable;ZI)V

    throw v0
    :try_end_5
    .catch Lcom/daaw/gp8; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    move-exception v0

    iget-object v1, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/16 v3, 0xfa1

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0

    :cond_d
    :goto_5
    return-void
.end method

.method public k0(J)V
    .locals 6

    :goto_0
    iget v0, p0, Lcom/daaw/hp8;->M0:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/hp8;->N:[J

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    cmp-long v1, p1, v3

    if-ltz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/hp8;->L:[J

    aget-wide v3, v1, v2

    iput-wide v3, p0, Lcom/daaw/hp8;->K0:J

    iget-object v3, p0, Lcom/daaw/hp8;->M:[J

    aget-wide v4, v3, v2

    iput-wide v4, p0, Lcom/daaw/hp8;->L0:J

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/hp8;->M0:I

    const/4 v3, 0x1

    invoke-static {v1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/daaw/hp8;->M:[J

    iget v1, p0, Lcom/daaw/hp8;->M0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/daaw/hp8;->N:[J

    iget v1, p0, Lcom/daaw/hp8;->M0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lcom/daaw/hp8;->Y()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l0()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/daaw/bp8;->zzl()V

    iget-object v1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v2, v1, Lcom/daaw/ql7;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/daaw/ql7;->b:I

    iget-object v1, p0, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    iget-object v1, v1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/daaw/hp8;->O(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iput-object v0, p0, Lcom/daaw/hp8;->Q:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/daaw/hp8;->N0:Lcom/daaw/xn8;

    invoke-virtual {p0}, Lcom/daaw/hp8;->n0()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    iput-object v0, p0, Lcom/daaw/hp8;->Q:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/daaw/hp8;->N0:Lcom/daaw/xn8;

    invoke-virtual {p0}, Lcom/daaw/hp8;->n0()V

    throw v1
.end method

.method public m0()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/hp8;->u0()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->v0()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/hp8;->o0:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/hp8;->C0:Z

    iput-boolean v2, p0, Lcom/daaw/hp8;->B0:Z

    iput-boolean v2, p0, Lcom/daaw/hp8;->k0:Z

    iput-boolean v2, p0, Lcom/daaw/hp8;->l0:Z

    iput-boolean v2, p0, Lcom/daaw/hp8;->s0:Z

    iput-boolean v2, p0, Lcom/daaw/hp8;->t0:Z

    iget-object v3, p0, Lcom/daaw/hp8;->J:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-wide v0, p0, Lcom/daaw/hp8;->E0:J

    iput-wide v0, p0, Lcom/daaw/hp8;->F0:J

    iget-object v0, p0, Lcom/daaw/hp8;->n0:Lcom/daaw/wo8;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wo8;->c()V

    :cond_0
    iput v2, p0, Lcom/daaw/hp8;->z0:I

    iput v2, p0, Lcom/daaw/hp8;->A0:I

    iget-boolean v0, p0, Lcom/daaw/hp8;->x0:Z

    iput v0, p0, Lcom/daaw/hp8;->y0:I

    return-void
.end method

.method public final n0()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/hp8;->m0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hp8;->n0:Lcom/daaw/wo8;

    iput-object v0, p0, Lcom/daaw/hp8;->a0:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    iput-object v0, p0, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    iput-object v0, p0, Lcom/daaw/hp8;->X:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/hp8;->Y:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->D0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/hp8;->Z:F

    iput v0, p0, Lcom/daaw/hp8;->d0:I

    iput-boolean v0, p0, Lcom/daaw/hp8;->e0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->f0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->g0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->h0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->i0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->j0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->m0:Z

    iput-boolean v0, p0, Lcom/daaw/hp8;->x0:Z

    iput v0, p0, Lcom/daaw/hp8;->y0:I

    iput-boolean v0, p0, Lcom/daaw/hp8;->R:Z

    return-void
.end method

.method public final o0()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hp8;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/hp8;->j0()V

    :cond_0
    return v0
.end method

.method public final p0()Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/daaw/hp8;->A0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lcom/daaw/hp8;->f0:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lcom/daaw/hp8;->g0:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/daaw/hp8;->D0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lcom/daaw/hp8;->h0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/daaw/hp8;->C0:Z

    if-nez v2, :cond_5

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lcom/daaw/uo4;->f(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->P()V
    :try_end_0
    .catch Lcom/daaw/vu7; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lcom/daaw/s95;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V

    return v3

    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/daaw/hp8;->X()V

    return v1

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V

    return v3
.end method

.method public q0(Lcom/daaw/ep8;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final s0(Lcom/daaw/ep8;Landroid/media/MediaCrypto;)V
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "createCodec:"

    iget-object v2, v0, Lcom/daaw/ep8;->a:Ljava/lang/String;

    sget v3, Lcom/daaw/it5;->a:I

    const/high16 v4, -0x40800000    # -1.0f

    const/16 v5, 0x17

    if-ge v3, v5, :cond_0

    const/high16 v6, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    iget v6, v8, Lcom/daaw/hp8;->U:F

    iget-object v7, v8, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->p()[Lcom/daaw/f92;

    move-result-object v9

    invoke-virtual {v8, v6, v7, v9}, Lcom/daaw/hp8;->E(FLcom/daaw/f92;[Lcom/daaw/f92;)F

    move-result v6

    :goto_0
    iget v7, v8, Lcom/daaw/hp8;->D:F

    cmpg-float v7, v6, v7

    if-gtz v7, :cond_1

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v9, v8, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/4 v10, 0x0

    invoke-virtual {v8, v0, v9, v10, v4}, Lcom/daaw/hp8;->K(Lcom/daaw/ep8;Lcom/daaw/f92;Landroid/media/MediaCrypto;F)Lcom/daaw/zo8;

    move-result-object v9

    const/16 v11, 0x1f

    if-lt v3, v11, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->w()Lcom/daaw/lh8;

    move-result-object v12

    invoke-static {v9, v12}, Lcom/daaw/fp8;->a(Lcom/daaw/zo8;Lcom/daaw/lh8;)V

    :cond_2
    :try_start_0
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v12, 0x0

    if-lt v3, v5, :cond_3

    if-lt v3, v11, :cond_3

    iget-object v1, v9, Lcom/daaw/zo8;->c:Lcom/daaw/f92;

    iget-object v1, v1, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/ak3;->b(Ljava/lang/String;)I

    move-result v1

    const-string v10, "DMCodecAdapterFactory"

    invoke-static {v1}, Lcom/daaw/it5;->o(I)Ljava/lang/String;

    move-result-object v11

    const-string v13, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-virtual {v13, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/daaw/s95;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/daaw/eo8;

    invoke-direct {v10, v1, v12}, Lcom/daaw/eo8;-><init>(IZ)V

    invoke-virtual {v10, v9}, Lcom/daaw/eo8;->c(Lcom/daaw/zo8;)Lcom/daaw/go8;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_3
    :try_start_1
    iget-object v11, v9, Lcom/daaw/zo8;->a:Lcom/daaw/ep8;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v11, v11, Lcom/daaw/ep8;->a:Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-static {v11}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v11, "configureCodec"

    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v11, v9, Lcom/daaw/zo8;->b:Landroid/media/MediaFormat;

    iget-object v13, v9, Lcom/daaw/zo8;->d:Landroid/view/Surface;

    invoke-virtual {v1, v11, v13, v10, v12}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v11, "startCodec"

    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    new-instance v11, Lcom/daaw/jq8;

    invoke-direct {v11, v1, v10}, Lcom/daaw/jq8;-><init>(Landroid/media/MediaCodec;Lcom/daaw/iq8;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v11

    :goto_2
    :try_start_4
    iput-object v1, v8, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iput-object v0, v8, Lcom/daaw/hp8;->c0:Lcom/daaw/ep8;

    iput v4, v8, Lcom/daaw/hp8;->Z:F

    iget-object v1, v8, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    iput-object v1, v8, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    const-string v1, "OMX.Exynos.avc.dec.secure"

    const/16 v4, 0x19

    if-gt v3, v4, :cond_5

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_5

    sget-object v15, Lcom/daaw/it5;->d:Ljava/lang/String;

    const-string v12, "SM-T585"

    invoke-virtual {v15, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "SM-A510"

    invoke-virtual {v15, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "SM-A520"

    invoke-virtual {v15, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "SM-J700"

    invoke-virtual {v15, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    :cond_4
    const/4 v12, 0x2

    goto :goto_3

    :cond_5
    const/16 v12, 0x18

    if-ge v3, v12, :cond_8

    const-string v12, "OMX.Nvidia.h264.decode"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    const-string v12, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    :cond_6
    sget-object v12, Lcom/daaw/it5;->b:Ljava/lang/String;

    const-string v15, "flounder"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    const-string v15, "flounder_lte"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    const-string v15, "grouper"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    const-string v15, "tilapia"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    :cond_7
    const/4 v12, 0x1

    goto :goto_3

    :cond_8
    const/4 v12, 0x0

    :goto_3
    iput v12, v8, Lcom/daaw/hp8;->d0:I

    iget-object v12, v8, Lcom/daaw/hp8;->W:Lcom/daaw/f92;

    const/16 v15, 0x15

    if-ge v3, v15, :cond_9

    iget-object v12, v12, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_9

    const-string v12, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/4 v12, 0x1

    goto :goto_4

    :cond_9
    const/4 v12, 0x0

    :goto_4
    iput-boolean v12, v8, Lcom/daaw/hp8;->e0:Z

    const/16 v12, 0x13

    if-ne v3, v12, :cond_b

    sget-object v14, Lcom/daaw/it5;->d:Ljava/lang/String;

    const-string v13, "SM-G800"

    invoke-virtual {v14, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_b

    const-string v13, "OMX.Exynos.avc.dec"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    const/4 v1, 0x1

    goto :goto_5

    :cond_b
    const/4 v1, 0x0

    :goto_5
    iput-boolean v1, v8, Lcom/daaw/hp8;->f0:Z

    const/16 v1, 0x1d

    if-ne v3, v1, :cond_c

    const-string v13, "c2.android.aac.decoder"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/4 v13, 0x1

    goto :goto_6

    :cond_c
    const/4 v13, 0x0

    :goto_6
    iput-boolean v13, v8, Lcom/daaw/hp8;->g0:Z

    if-gt v3, v5, :cond_e

    const-string v5, "OMX.google.vorbis.decoder"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    const/4 v5, 0x1

    goto :goto_9

    :cond_e
    :goto_8
    if-gt v3, v12, :cond_10

    sget-object v5, Lcom/daaw/it5;->b:Ljava/lang/String;

    const-string v12, "hb2000"

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    const-string v12, "stvm8"

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    :cond_f
    const-string v5, "OMX.amlogic.avc.decoder.awesome"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "OMX.amlogic.avc.decoder.awesome.secure"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_7

    :cond_10
    const/4 v5, 0x0

    :goto_9
    iput-boolean v5, v8, Lcom/daaw/hp8;->h0:Z

    if-ne v3, v15, :cond_11

    const-string v5, "OMX.google.aac.decoder"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    const/4 v5, 0x1

    goto :goto_a

    :cond_11
    const/4 v5, 0x0

    :goto_a
    iput-boolean v5, v8, Lcom/daaw/hp8;->i0:Z

    if-ge v3, v15, :cond_13

    const-string v5, "OMX.SEC.mp3.dec"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    sget-object v5, Lcom/daaw/it5;->c:Ljava/lang/String;

    const-string v12, "samsung"

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    sget-object v5, Lcom/daaw/it5;->b:Ljava/lang/String;

    const-string v12, "baffin"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    const-string v12, "grand"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    const-string v12, "fortuna"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    const-string v12, "gprimelte"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    const-string v12, "j2y18lte"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    const-string v12, "ms01"

    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    :cond_12
    const/4 v5, 0x1

    goto :goto_b

    :cond_13
    const/4 v5, 0x0

    :goto_b
    iput-boolean v5, v8, Lcom/daaw/hp8;->j0:Z

    iget-object v5, v0, Lcom/daaw/ep8;->a:Ljava/lang/String;

    if-gt v3, v4, :cond_15

    const-string v4, "OMX.rk.video_decoder.avc"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    const/4 v12, 0x1

    goto :goto_e

    :cond_15
    :goto_d
    if-gt v3, v1, :cond_16

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_16
    sget-object v1, Lcom/daaw/it5;->c:Ljava/lang/String;

    const-string v3, "Amazon"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, Lcom/daaw/it5;->d:Ljava/lang/String;

    const-string v3, "AFTS"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-boolean v1, v0, Lcom/daaw/ep8;->f:Z

    if-eqz v1, :cond_17

    goto :goto_c

    :cond_17
    const/4 v12, 0x0

    :goto_e
    iput-boolean v12, v8, Lcom/daaw/hp8;->m0:Z

    iget-object v1, v8, Lcom/daaw/hp8;->V:Lcom/daaw/bp8;

    invoke-interface {v1}, Lcom/daaw/bp8;->zzr()Z

    iget-object v0, v0, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const-string v1, "c2.android.mp3.decoder"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v0, Lcom/daaw/wo8;

    invoke-direct {v0}, Lcom/daaw/wo8;-><init>()V

    iput-object v0, v8, Lcom/daaw/hp8;->n0:Lcom/daaw/wo8;

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/nk7;->m()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_19

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v3, 0x3e8

    add-long/2addr v0, v3

    iput-wide v0, v8, Lcom/daaw/hp8;->o0:J

    :cond_19
    iget-object v0, v8, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget v1, v0, Lcom/daaw/ql7;->a:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, v0, Lcom/daaw/ql7;->a:I

    sub-long v6, v10, v6

    move-object/from16 v1, p0

    move-object v3, v9

    move-wide v4, v10

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/hp8;->N(Ljava/lang/String;Lcom/daaw/zo8;JJ)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_f

    :catch_1
    move-exception v0

    :goto_f
    move-object v10, v1

    goto :goto_10

    :catch_2
    move-exception v0

    goto :goto_10

    :catch_3
    move-exception v0

    :goto_10
    if-eqz v10, :cond_1a

    :try_start_5
    invoke-virtual {v10}, Landroid/media/MediaCodec;->release()V

    :cond_1a
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_12

    :goto_11
    throw v0

    :goto_12
    goto :goto_11
.end method

.method public final t0()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget v0, p0, Lcom/daaw/hp8;->A0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lcom/daaw/hp8;->H0:Z

    invoke-virtual {p0}, Lcom/daaw/hp8;->a0()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->l0()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->j0()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/daaw/hp8;->X()V

    invoke-virtual {p0}, Lcom/daaw/hp8;->P()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/daaw/hp8;->X()V

    return-void
.end method

.method public final u0()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/hp8;->p0:I

    iget-object v0, p0, Lcom/daaw/hp8;->F:Lcom/daaw/ma7;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final v0()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/hp8;->q0:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hp8;->r0:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public x()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/hp8;->K0:J

    iput-wide v0, p0, Lcom/daaw/hp8;->L0:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/hp8;->M0:I

    invoke-virtual {p0}, Lcom/daaw/hp8;->p0()Z

    return-void
.end method

.method public y(ZZ)V
    .locals 0

    new-instance p1, Lcom/daaw/ql7;

    invoke-direct {p1}, Lcom/daaw/ql7;-><init>()V

    iput-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    return-void
.end method

.method public z(JZ)V
    .locals 2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/hp8;->G0:Z

    iput-boolean p1, p0, Lcom/daaw/hp8;->H0:Z

    iget-boolean p2, p0, Lcom/daaw/hp8;->u0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/hp8;->H:Lcom/daaw/vo8;

    invoke-virtual {p2}, Lcom/daaw/i37;->b()V

    iget-object p2, p0, Lcom/daaw/hp8;->G:Lcom/daaw/ma7;

    invoke-virtual {p2}, Lcom/daaw/i37;->b()V

    iput-boolean p1, p0, Lcom/daaw/hp8;->v0:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->o0()Z

    :goto_0
    iget-object p2, p0, Lcom/daaw/hp8;->I:Lcom/daaw/zp5;

    invoke-virtual {p2}, Lcom/daaw/zp5;->a()I

    move-result p3

    if-lez p3, :cond_1

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/daaw/hp8;->I0:Z

    :cond_1
    invoke-virtual {p2}, Lcom/daaw/zp5;->e()V

    iget p2, p0, Lcom/daaw/hp8;->M0:I

    if-eqz p2, :cond_2

    add-int/lit8 p2, p2, -0x1

    iget-object p3, p0, Lcom/daaw/hp8;->M:[J

    aget-wide v0, p3, p2

    iput-wide v0, p0, Lcom/daaw/hp8;->L0:J

    iget-object p3, p0, Lcom/daaw/hp8;->L:[J

    aget-wide p2, p3, p2

    iput-wide p2, p0, Lcom/daaw/hp8;->K0:J

    iput p1, p0, Lcom/daaw/hp8;->M0:I

    :cond_2
    return-void
.end method

.method public zzM()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/hp8;->H0:Z

    return v0
.end method

.method public zzN()Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/hp8;->O:Lcom/daaw/f92;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/nk7;->o()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/hp8;->S()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v3, p0, Lcom/daaw/hp8;->o0:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/daaw/hp8;->o0:J

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final zze()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
