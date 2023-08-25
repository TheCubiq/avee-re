.class public final Lcom/daaw/kq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o7;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kq$g;,
        Lcom/daaw/kq$f;,
        Lcom/daaw/kq$d;,
        Lcom/daaw/kq$c;,
        Lcom/daaw/kq$e;
    }
.end annotation


# static fields
.field public static Z:Z

.field public static a0:Z


# instance fields
.field public A:J

.field public B:Ljava/nio/ByteBuffer;

.field public C:I

.field public D:I

.field public E:J

.field public F:J

.field public G:I

.field public H:J

.field public I:J

.field public J:I

.field public K:I

.field public L:J

.field public M:F

.field public N:[Lcom/daaw/m7;

.field public O:[Ljava/nio/ByteBuffer;

.field public P:Ljava/nio/ByteBuffer;

.field public Q:Ljava/nio/ByteBuffer;

.field public R:[B

.field public S:I

.field public T:I

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Z

.field public Y:J

.field public final a:Lcom/daaw/g7;

.field public final b:Lcom/daaw/kq$c;

.field public final c:Z

.field public final d:Lcom/daaw/ue;

.field public final e:Lcom/daaw/co1;

.field public final f:[Lcom/daaw/m7;

.field public final g:[Lcom/daaw/m7;

.field public final h:Landroid/os/ConditionVariable;

.field public final i:Lcom/daaw/r7;

.field public final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/kq$f;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lcom/daaw/o7$c;

.field public l:Landroid/media/AudioTrack;

.field public m:Landroid/media/AudioTrack;

.field public n:Z

.field public o:Z

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Lcom/daaw/f7;

.field public u:Z

.field public v:Z

.field public w:I

.field public x:Lcom/daaw/zw0;

.field public y:Lcom/daaw/zw0;

.field public z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/g7;Lcom/daaw/kq$c;Z)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kq;->a:Lcom/daaw/g7;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/kq$c;

    iput-object p1, p0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    iput-boolean p3, p0, Lcom/daaw/kq;->c:Z

    new-instance p1, Landroid/os/ConditionVariable;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lcom/daaw/kq;->h:Landroid/os/ConditionVariable;

    new-instance p1, Lcom/daaw/r7;

    new-instance v0, Lcom/daaw/kq$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/kq$g;-><init>(Lcom/daaw/kq;Lcom/daaw/kq$a;)V

    invoke-direct {p1, v0}, Lcom/daaw/r7;-><init>(Lcom/daaw/r7$a;)V

    iput-object p1, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    new-instance p1, Lcom/daaw/ue;

    invoke-direct {p1}, Lcom/daaw/ue;-><init>()V

    iput-object p1, p0, Lcom/daaw/kq;->d:Lcom/daaw/ue;

    new-instance v0, Lcom/daaw/co1;

    invoke-direct {v0}, Lcom/daaw/co1;-><init>()V

    iput-object v0, p0, Lcom/daaw/kq;->e:Lcom/daaw/co1;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x3

    new-array v2, v2, [Lcom/daaw/m7;

    new-instance v3, Lcom/daaw/w41;

    invoke-direct {v3}, Lcom/daaw/w41;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    aput-object p1, v2, p3

    const/4 p1, 0x2

    aput-object v0, v2, p1

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-interface {p2}, Lcom/daaw/kq$c;->d()[Lcom/daaw/m7;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lcom/daaw/m7;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/m7;

    iput-object p1, p0, Lcom/daaw/kq;->f:[Lcom/daaw/m7;

    new-array p1, p3, [Lcom/daaw/m7;

    new-instance p2, Lcom/daaw/p20;

    invoke-direct {p2}, Lcom/daaw/p20;-><init>()V

    aput-object p2, p1, v4

    iput-object p1, p0, Lcom/daaw/kq;->g:[Lcom/daaw/m7;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/kq;->M:F

    iput v4, p0, Lcom/daaw/kq;->K:I

    sget-object p1, Lcom/daaw/f7;->e:Lcom/daaw/f7;

    iput-object p1, p0, Lcom/daaw/kq;->t:Lcom/daaw/f7;

    iput v4, p0, Lcom/daaw/kq;->W:I

    sget-object p1, Lcom/daaw/zw0;->e:Lcom/daaw/zw0;

    iput-object p1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/kq;->T:I

    new-array p1, v4, [Lcom/daaw/m7;

    iput-object p1, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    new-array p1, v4, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/kq;->O:[Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/g7;[Lcom/daaw/m7;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/kq;-><init>(Lcom/daaw/g7;[Lcom/daaw/m7;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/g7;[Lcom/daaw/m7;Z)V
    .locals 1

    new-instance v0, Lcom/daaw/kq$d;

    invoke-direct {v0, p2}, Lcom/daaw/kq$d;-><init>([Lcom/daaw/m7;)V

    invoke-direct {p0, p1, v0, p3}, Lcom/daaw/kq;-><init>(Lcom/daaw/g7;Lcom/daaw/kq$c;Z)V

    return-void
.end method

.method public static G(ILjava/nio/ByteBuffer;)I
    .locals 2

    const/4 v0, 0x7

    if-eq p0, v0, :cond_5

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x5

    if-ne p0, v0, :cond_1

    invoke-static {}, Lcom/daaw/u;->b()I

    move-result p0

    return p0

    :cond_1
    const/4 v0, 0x6

    if-ne p0, v0, :cond_2

    invoke-static {p1}, Lcom/daaw/u;->h(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :cond_2
    const/16 v0, 0xe

    if-ne p0, v0, :cond_4

    invoke-static {p1}, Lcom/daaw/u;->a(Ljava/nio/ByteBuffer;)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_3

    const/4 p0, 0x0

    goto :goto_0

    :cond_3
    invoke-static {p1, p0}, Lcom/daaw/u;->i(Ljava/nio/ByteBuffer;I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x10

    :goto_0
    return p0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-static {p1}, Lcom/daaw/dv;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method public static R(Landroid/media/AudioTrack;F)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method public static S(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method public static V(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/daaw/kq;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/kq;->Y:J

    return-wide v0
.end method

.method public static synthetic g(Lcom/daaw/kq;)Landroid/os/ConditionVariable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kq;->h:Landroid/os/ConditionVariable;

    return-object p0
.end method

.method public static synthetic v(Lcom/daaw/kq;)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kq;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic w(Lcom/daaw/kq;)J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kq;->I()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic x(Lcom/daaw/kq;)Lcom/daaw/o7$c;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kq;->k:Lcom/daaw/o7$c;

    return-object p0
.end method


# virtual methods
.method public final A()Landroid/media/AudioTrack;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/kq;->X:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->t:Lcom/daaw/f7;

    invoke-virtual {v0}, Lcom/daaw/f7;->a()Landroid/media/AudioAttributes;

    move-result-object v0

    :goto_0
    move-object v2, v0

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    iget v1, p0, Lcom/daaw/kq;->r:I

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    iget v1, p0, Lcom/daaw/kq;->s:I

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    iget v1, p0, Lcom/daaw/kq;->q:I

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    iget v0, p0, Lcom/daaw/kq;->W:I

    if-eqz v0, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_1
    new-instance v0, Landroid/media/AudioTrack;

    iget v4, p0, Lcom/daaw/kq;->w:I

    const/4 v5, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v0
.end method

.method public final B()Z
    .locals 9

    iget v0, p0, Lcom/daaw/kq;->T:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/daaw/kq;->u:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    array-length v0, v0

    :goto_0
    iput v0, p0, Lcom/daaw/kq;->T:I

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget v4, p0, Lcom/daaw/kq;->T:I

    iget-object v5, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_4

    aget-object v4, v5, v4

    if-eqz v0, :cond_2

    invoke-interface {v4}, Lcom/daaw/m7;->k()V

    :cond_2
    invoke-virtual {p0, v7, v8}, Lcom/daaw/kq;->O(J)V

    invoke-interface {v4}, Lcom/daaw/m7;->c()Z

    move-result v0

    if-nez v0, :cond_3

    return v3

    :cond_3
    iget v0, p0, Lcom/daaw/kq;->T:I

    add-int/2addr v0, v2

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, v7, v8}, Lcom/daaw/kq;->U(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    return v3

    :cond_5
    iput v1, p0, Lcom/daaw/kq;->T:I

    return v2
.end method

.method public final C(J)J
    .locals 2

    iget v0, p0, Lcom/daaw/kq;->q:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final D()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/m7;->flush()V

    iget-object v2, p0, Lcom/daaw/kq;->O:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lcom/daaw/m7;->f()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final E(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/kq;->q:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final F()[Lcom/daaw/m7;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kq;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->g:[Lcom/daaw/m7;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->f:[Lcom/daaw/m7;

    :goto_0
    return-object v0
.end method

.method public final H()J
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/kq;->n:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/kq;->E:J

    iget v2, p0, Lcom/daaw/kq;->D:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/daaw/kq;->F:J

    :goto_0
    return-wide v0
.end method

.method public final I()J
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/kq;->n:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/kq;->H:J

    iget v2, p0, Lcom/daaw/kq;->G:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/daaw/kq;->I:J

    :goto_0
    return-wide v0
.end method

.method public final J()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/kq;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    invoke-virtual {p0}, Lcom/daaw/kq;->K()Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    sget-boolean v1, Lcom/daaw/kq;->Z:Z

    if-eqz v1, :cond_1

    sget v1, Lcom/daaw/sq1;->a:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/kq;->l:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/kq;->P()V

    :cond_0
    iget-object v1, p0, Lcom/daaw/kq;->l:Landroid/media/AudioTrack;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/kq;->L(I)Landroid/media/AudioTrack;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/kq;->l:Landroid/media/AudioTrack;

    :cond_1
    iget v1, p0, Lcom/daaw/kq;->W:I

    if-eq v1, v0, :cond_2

    iput v0, p0, Lcom/daaw/kq;->W:I

    iget-object v1, p0, Lcom/daaw/kq;->k:Lcom/daaw/o7$c;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lcom/daaw/o7$c;->a(I)V

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/kq;->v:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    iget-object v1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    invoke-interface {v0, v1}, Lcom/daaw/kq$c;->b(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    move-result-object v0

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/daaw/zw0;->e:Lcom/daaw/zw0;

    :goto_0
    iput-object v0, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    invoke-virtual {p0}, Lcom/daaw/kq;->T()V

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    iget-object v1, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iget v2, p0, Lcom/daaw/kq;->s:I

    iget v3, p0, Lcom/daaw/kq;->G:I

    iget v4, p0, Lcom/daaw/kq;->w:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/r7;->s(Landroid/media/AudioTrack;III)V

    invoke-virtual {p0}, Lcom/daaw/kq;->Q()V

    return-void
.end method

.method public final K()Landroid/media/AudioTrack;
    .locals 9

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/kq;->A()Landroid/media/AudioTrack;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->t:Lcom/daaw/f7;

    iget v0, v0, Lcom/daaw/f7;->c:I

    invoke-static {v0}, Lcom/daaw/sq1;->A(I)I

    move-result v2

    iget v0, p0, Lcom/daaw/kq;->W:I

    if-nez v0, :cond_1

    new-instance v0, Landroid/media/AudioTrack;

    iget v3, p0, Lcom/daaw/kq;->q:I

    iget v4, p0, Lcom/daaw/kq;->r:I

    iget v5, p0, Lcom/daaw/kq;->s:I

    iget v6, p0, Lcom/daaw/kq;->w:I

    const/4 v7, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/media/AudioTrack;

    iget v3, p0, Lcom/daaw/kq;->q:I

    iget v4, p0, Lcom/daaw/kq;->r:I

    iget v5, p0, Lcom/daaw/kq;->s:I

    iget v6, p0, Lcom/daaw/kq;->w:I

    const/4 v7, 0x1

    iget v8, p0, Lcom/daaw/kq;->W:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    :goto_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    return-object v0

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Lcom/daaw/o7$b;

    iget v2, p0, Lcom/daaw/kq;->q:I

    iget v3, p0, Lcom/daaw/kq;->r:I

    iget v4, p0, Lcom/daaw/kq;->w:I

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/o7$b;-><init>(IIII)V

    throw v0
.end method

.method public final L(I)Landroid/media/AudioTrack;
    .locals 9

    new-instance v8, Landroid/media/AudioTrack;

    const/4 v1, 0x3

    const/16 v2, 0xfa0

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v8

    move v7, p1

    invoke-direct/range {v0 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    return-object v8
.end method

.method public final M(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/kq;->p:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final N()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final O(J)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_5

    if-lez v1, :cond_0

    iget-object v2, p0, Lcom/daaw/kq;->O:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/daaw/m7;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lcom/daaw/kq;->U(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    aget-object v3, v3, v1

    invoke-interface {v3, v2}, Lcom/daaw/m7;->g(Ljava/nio/ByteBuffer;)V

    invoke-interface {v3}, Lcom/daaw/m7;->f()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/kq;->O:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final P()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/kq;->l:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/kq;->l:Landroid/media/AudioTrack;

    new-instance v1, Lcom/daaw/kq$b;

    invoke-direct {v1, p0, v0}, Lcom/daaw/kq$b;-><init>(Lcom/daaw/kq;Landroid/media/AudioTrack;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final Q()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/kq;->M:F

    invoke-static {v0, v1}, Lcom/daaw/kq;->R(Landroid/media/AudioTrack;F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/kq;->M:F

    invoke-static {v0, v1}, Lcom/daaw/kq;->S(Landroid/media/AudioTrack;F)V

    :goto_0
    return-void
.end method

.method public final T()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/kq;->F()[Lcom/daaw/m7;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-interface {v4}, Lcom/daaw/m7;->d()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Lcom/daaw/m7;->flush()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Lcom/daaw/m7;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/m7;

    iput-object v0, p0, Lcom/daaw/kq;->N:[Lcom/daaw/m7;

    new-array v0, v1, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/kq;->O:[Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/daaw/kq;->D()V

    return-void
.end method

.method public final U(Ljava/nio/ByteBuffer;J)V
    .locals 12

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    sget v0, Lcom/daaw/sq1;->a:I

    if-ge v0, v2, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget-object v4, p0, Lcom/daaw/kq;->R:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Lcom/daaw/kq;->R:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    iget-object v5, p0, Lcom/daaw/kq;->R:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v3, p0, Lcom/daaw/kq;->S:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    sget v4, Lcom/daaw/sq1;->a:I

    if-ge v4, v2, :cond_6

    iget-object p2, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    iget-wide v1, p0, Lcom/daaw/kq;->H:J

    invoke-virtual {p2, v1, v2}, Lcom/daaw/r7;->c(J)I

    move-result p2

    if-lez p2, :cond_9

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/daaw/kq;->R:[B

    iget v2, p0, Lcom/daaw/kq;->S:I

    invoke-virtual {p3, v1, v2, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result v3

    if-lez v3, :cond_9

    iget p2, p0, Lcom/daaw/kq;->S:I

    add-int/2addr p2, v3

    iput p2, p0, Lcom/daaw/kq;->S:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p2

    add-int/2addr p2, v3

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_3

    :cond_6
    iget-boolean v2, p0, Lcom/daaw/kq;->X:Z

    if-eqz v2, :cond_8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p2, v4

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Lcom/daaw/s6;->f(Z)V

    iget-object v7, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    move-object v6, p0

    move-object v8, p1

    move v9, v0

    move-wide v10, p2

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/kq;->W(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    move-result v3

    goto :goto_3

    :cond_8
    iget-object p2, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-static {p2, p1, v0}, Lcom/daaw/kq;->V(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result v3

    :cond_9
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/kq;->Y:J

    if-ltz v3, :cond_d

    iget-boolean p1, p0, Lcom/daaw/kq;->n:Z

    if-eqz p1, :cond_a

    iget-wide p2, p0, Lcom/daaw/kq;->H:J

    int-to-long v1, v3

    add-long/2addr p2, v1

    iput-wide p2, p0, Lcom/daaw/kq;->H:J

    :cond_a
    if-ne v3, v0, :cond_c

    if-nez p1, :cond_b

    iget-wide p1, p0, Lcom/daaw/kq;->I:J

    iget p3, p0, Lcom/daaw/kq;->J:I

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/kq;->I:J

    :cond_b
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    :cond_c
    return-void

    :cond_d
    new-instance p1, Lcom/daaw/o7$d;

    invoke-direct {p1, v3}, Lcom/daaw/o7$d;-><init>(I)V

    throw p1
.end method

.method public final W(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    const v1, 0x55550001

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_0
    iget v0, p0, Lcom/daaw/kq;->C:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    const/4 v2, 0x4

    invoke-virtual {v0, v2, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    const/16 v2, 0x8

    const-wide/16 v3, 0x3e8

    mul-long p4, p4, v3

    invoke-virtual {v0, v2, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p4, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    invoke-virtual {p4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput p3, p0, Lcom/daaw/kq;->C:I

    :cond_1
    iget-object p4, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p4

    if-lez p4, :cond_3

    iget-object p5, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p5

    if-gez p5, :cond_2

    iput v1, p0, Lcom/daaw/kq;->C:I

    return p5

    :cond_2
    if-ge p5, p4, :cond_3

    return v1

    :cond_3
    invoke-static {p1, p2, p3}, Lcom/daaw/kq;->V(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p1

    if-gez p1, :cond_4

    iput v1, p0, Lcom/daaw/kq;->C:I

    return p1

    :cond_4
    iget p2, p0, Lcom/daaw/kq;->C:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/kq;->C:I

    return p1
.end method

.method public a()V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/kq;->e()V

    invoke-virtual {p0}, Lcom/daaw/kq;->P()V

    iget-object v0, p0, Lcom/daaw/kq;->f:[Lcom/daaw/m7;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lcom/daaw/m7;->e()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->g:[Lcom/daaw/m7;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lcom/daaw/m7;->e()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput v2, p0, Lcom/daaw/kq;->W:I

    iput-boolean v2, p0, Lcom/daaw/kq;->V:Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kq;->V:Z

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {v0}, Lcom/daaw/r7;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/kq;->U:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/kq;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/kq;->E:J

    iput-wide v0, p0, Lcom/daaw/kq;->F:J

    iput-wide v0, p0, Lcom/daaw/kq;->H:J

    iput-wide v0, p0, Lcom/daaw/kq;->I:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/kq;->J:I

    iget-object v3, p0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iput-object v3, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    iput-object v4, p0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/kq$f;

    invoke-static {v3}, Lcom/daaw/kq$f;->a(Lcom/daaw/kq$f;)Lcom/daaw/zw0;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->clear()V

    iput-wide v0, p0, Lcom/daaw/kq;->z:J

    iput-wide v0, p0, Lcom/daaw/kq;->A:J

    iput-object v4, p0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    iput-object v4, p0, Lcom/daaw/kq;->Q:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/daaw/kq;->D()V

    iput-boolean v2, p0, Lcom/daaw/kq;->U:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/kq;->T:I

    iput-object v4, p0, Lcom/daaw/kq;->B:Ljava/nio/ByteBuffer;

    iput v2, p0, Lcom/daaw/kq;->C:I

    iput v2, p0, Lcom/daaw/kq;->K:I

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {v0}, Lcom/daaw/r7;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_2
    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iput-object v4, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {v1}, Lcom/daaw/r7;->q()V

    iget-object v1, p0, Lcom/daaw/kq;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->close()V

    new-instance v1, Lcom/daaw/kq$a;

    invoke-direct {v1, p0, v0}, Lcom/daaw/kq$a;-><init>(Lcom/daaw/kq;Landroid/media/AudioTrack;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_3
    return-void
.end method

.method public f(Lcom/daaw/zw0;)Lcom/daaw/zw0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/kq;->v:Z

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/zw0;->e:Lcom/daaw/zw0;

    iput-object p1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/kq$f;

    invoke-static {v0}, Lcom/daaw/kq$f;->a(Lcom/daaw/kq$f;)Lcom/daaw/zw0;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    :goto_0
    invoke-virtual {p1, v0}, Lcom/daaw/zw0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    invoke-interface {v0, p1}, Lcom/daaw/kq$c;->b(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    return-object p1
.end method

.method public h()Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    return-object v0
.end method

.method public i(IIII[III)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p4

    move/from16 v2, p3

    iput v2, v1, Lcom/daaw/kq;->p:I

    invoke-static/range {p1 .. p1}, Lcom/daaw/sq1;->I(I)Z

    move-result v3

    iput-boolean v3, v1, Lcom/daaw/kq;->n:Z

    iget-boolean v3, v1, Lcom/daaw/kq;->c:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v1, v3}, Lcom/daaw/kq;->t(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static/range {p1 .. p1}, Lcom/daaw/sq1;->H(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, v1, Lcom/daaw/kq;->o:Z

    iget-boolean v3, v1, Lcom/daaw/kq;->n:Z

    if-eqz v3, :cond_1

    invoke-static/range {p1 .. p2}, Lcom/daaw/sq1;->y(II)I

    move-result v3

    iput v3, v1, Lcom/daaw/kq;->D:I

    :cond_1
    iget-boolean v3, v1, Lcom/daaw/kq;->n:Z

    const/4 v6, 0x4

    if-eqz v3, :cond_2

    move/from16 v3, p1

    if-eq v3, v6, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    move/from16 v3, p1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_4

    iget-boolean v8, v1, Lcom/daaw/kq;->o:Z

    if-nez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    iput-boolean v8, v1, Lcom/daaw/kq;->v:Z

    if-eqz v7, :cond_6

    iget-object v8, v1, Lcom/daaw/kq;->e:Lcom/daaw/co1;

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual {v8, v9, v10}, Lcom/daaw/co1;->a(II)V

    iget-object v8, v1, Lcom/daaw/kq;->d:Lcom/daaw/ue;

    move-object/from16 v9, p5

    invoke-virtual {v8, v9}, Lcom/daaw/ue;->a([I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->F()[Lcom/daaw/m7;

    move-result-object v8

    array-length v9, v8

    move v10, v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v2, p2

    :goto_3
    if-ge v11, v9, :cond_7

    aget-object v13, v8, v11

    :try_start_0
    invoke-interface {v13, v10, v2, v3}, Lcom/daaw/m7;->l(III)Z

    move-result v14
    :try_end_0
    .catch Lcom/daaw/m7$a; {:try_start_0 .. :try_end_0} :catch_0

    or-int/2addr v12, v14

    invoke-interface {v13}, Lcom/daaw/m7;->d()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v13}, Lcom/daaw/m7;->h()I

    move-result v2

    invoke-interface {v13}, Lcom/daaw/m7;->i()I

    move-result v3

    invoke-interface {v13}, Lcom/daaw/m7;->j()I

    move-result v10

    move/from16 v16, v10

    move v10, v3

    move/from16 v3, v16

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v2, v0

    new-instance v0, Lcom/daaw/o7$a;

    invoke-direct {v0, v2}, Lcom/daaw/o7$a;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    move v10, v2

    const/4 v12, 0x0

    move/from16 v2, p2

    :cond_7
    const/16 v8, 0xfc

    const/16 v9, 0xc

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lcom/daaw/o7$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported channel count: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/daaw/o7$a;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget v6, Lcom/daaw/dd;->a:I

    goto :goto_4

    :pswitch_1
    const/16 v6, 0x4fc

    goto :goto_4

    :pswitch_2
    const/16 v6, 0xfc

    goto :goto_4

    :pswitch_3
    const/16 v6, 0xdc

    goto :goto_4

    :pswitch_4
    const/16 v6, 0xcc

    goto :goto_4

    :pswitch_5
    const/16 v6, 0x1c

    goto :goto_4

    :pswitch_6
    const/16 v6, 0xc

    :goto_4
    :pswitch_7
    sget v11, Lcom/daaw/sq1;->a:I

    const/16 v13, 0x17

    const/4 v14, 0x7

    const/4 v15, 0x5

    if-gt v11, v13, :cond_9

    sget-object v13, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v5, "foster"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object v5, Lcom/daaw/sq1;->c:Ljava/lang/String;

    const-string v13, "NVIDIA"

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, 0x3

    if-eq v2, v5, :cond_a

    if-eq v2, v15, :cond_a

    if-eq v2, v14, :cond_8

    goto :goto_5

    :cond_8
    sget v8, Lcom/daaw/dd;->a:I

    goto :goto_6

    :cond_9
    :goto_5
    move v8, v6

    :cond_a
    :goto_6
    const/16 v5, 0x19

    if-gt v11, v5, :cond_b

    sget-object v5, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v6, "fugu"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-boolean v5, v1, Lcom/daaw/kq;->n:Z

    if-nez v5, :cond_b

    if-ne v2, v4, :cond_b

    goto :goto_7

    :cond_b
    move v9, v8

    :goto_7
    if-nez v12, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->N()Z

    move-result v5

    if-eqz v5, :cond_c

    iget v5, v1, Lcom/daaw/kq;->s:I

    if-ne v5, v3, :cond_c

    iget v5, v1, Lcom/daaw/kq;->q:I

    if-ne v5, v10, :cond_c

    iget v5, v1, Lcom/daaw/kq;->r:I

    if-ne v5, v9, :cond_c

    return-void

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->e()V

    iput-boolean v7, v1, Lcom/daaw/kq;->u:Z

    iput v10, v1, Lcom/daaw/kq;->q:I

    iput v9, v1, Lcom/daaw/kq;->r:I

    iput v3, v1, Lcom/daaw/kq;->s:I

    iget-boolean v5, v1, Lcom/daaw/kq;->n:Z

    if-eqz v5, :cond_d

    invoke-static {v3, v2}, Lcom/daaw/sq1;->y(II)I

    move-result v2

    goto :goto_8

    :cond_d
    const/4 v2, -0x1

    :goto_8
    iput v2, v1, Lcom/daaw/kq;->G:I

    if-eqz v0, :cond_e

    :goto_9
    iput v0, v1, Lcom/daaw/kq;->w:I

    goto :goto_c

    :cond_e
    iget-boolean v0, v1, Lcom/daaw/kq;->n:Z

    if-eqz v0, :cond_10

    iget v0, v1, Lcom/daaw/kq;->s:I

    invoke-static {v10, v9, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_f

    goto :goto_a

    :cond_f
    const/4 v4, 0x0

    :goto_a
    invoke-static {v4}, Lcom/daaw/s6;->f(Z)V

    mul-int/lit8 v2, v0, 0x4

    const-wide/32 v3, 0x3d090

    invoke-virtual {v1, v3, v4}, Lcom/daaw/kq;->C(J)J

    move-result-wide v3

    long-to-int v4, v3

    iget v3, v1, Lcom/daaw/kq;->G:I

    mul-int v4, v4, v3

    int-to-long v5, v0

    const-wide/32 v7, 0xb71b0

    invoke-virtual {v1, v7, v8}, Lcom/daaw/kq;->C(J)J

    move-result-wide v7

    iget v0, v1, Lcom/daaw/kq;->G:I

    int-to-long v9, v0

    mul-long v7, v7, v9

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    long-to-int v0, v5

    invoke-static {v2, v4, v0}, Lcom/daaw/sq1;->l(III)I

    move-result v0

    goto :goto_9

    :cond_10
    iget v0, v1, Lcom/daaw/kq;->s:I

    if-eq v0, v15, :cond_13

    const/4 v2, 0x6

    if-ne v0, v2, :cond_11

    goto :goto_b

    :cond_11
    if-ne v0, v14, :cond_12

    const v0, 0xc000

    goto :goto_9

    :cond_12
    const v0, 0x48000

    goto :goto_9

    :cond_13
    :goto_b
    const/16 v0, 0x5000

    goto :goto_9

    :goto_c
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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

.method public j()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/kq;->U:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/kq;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {p0}, Lcom/daaw/kq;->I()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r7;->g(J)V

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/kq;->C:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/kq;->U:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public k()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {p0}, Lcom/daaw/kq;->I()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r7;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(Z)J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/kq;->K:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {v0, p1}, Lcom/daaw/r7;->d(Z)J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/daaw/kq;->I()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/daaw/kq;->E(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/kq;->L:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/kq;->z(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/kq;->y(J)J

    move-result-wide v0

    add-long/2addr v2, v0

    return-wide v2

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public m()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kq;->X:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/kq;->X:Z

    iput v0, p0, Lcom/daaw/kq;->W:I

    invoke-virtual {p0}, Lcom/daaw/kq;->e()V

    :cond_0
    return-void
.end method

.method public n(Lcom/daaw/f7;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq;->t:Lcom/daaw/f7;

    invoke-virtual {v0, p1}, Lcom/daaw/f7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/daaw/kq;->t:Lcom/daaw/f7;

    iget-boolean p1, p0, Lcom/daaw/kq;->X:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/kq;->e()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/kq;->W:I

    return-void
.end method

.method public o()V
    .locals 2

    iget v0, p0, Lcom/daaw/kq;->K:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/kq;->K:I

    :cond_0
    return-void
.end method

.method public p(F)V
    .locals 1

    iget v0, p0, Lcom/daaw/kq;->M:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/kq;->M:F

    invoke-virtual {p0}, Lcom/daaw/kq;->Q()V

    :cond_0
    return-void
.end method

.method public q(Ljava/nio/ByteBuffer;J)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    iget-object v4, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    invoke-static {v4}, Lcom/daaw/s6;->a(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->N()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->J()V

    iget-boolean v4, v0, Lcom/daaw/kq;->V:Z

    if-eqz v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->s()V

    :cond_2
    iget-object v4, v0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->I()J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Lcom/daaw/r7;->k(J)Z

    move-result v4

    if-nez v4, :cond_3

    return v5

    :cond_3
    iget-object v4, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    const/4 v7, 0x0

    if-nez v4, :cond_c

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v4

    if-nez v4, :cond_4

    return v6

    :cond_4
    iget-boolean v4, v0, Lcom/daaw/kq;->n:Z

    if-nez v4, :cond_5

    iget v4, v0, Lcom/daaw/kq;->J:I

    if-nez v4, :cond_5

    iget v4, v0, Lcom/daaw/kq;->s:I

    invoke-static {v4, v1}, Lcom/daaw/kq;->G(ILjava/nio/ByteBuffer;)I

    move-result v4

    iput v4, v0, Lcom/daaw/kq;->J:I

    if-nez v4, :cond_5

    return v6

    :cond_5
    iget-object v4, v0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    const-wide/16 v8, 0x0

    if-eqz v4, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->B()Z

    move-result v4

    if-nez v4, :cond_6

    return v5

    :cond_6
    iget-object v4, v0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    iput-object v7, v0, Lcom/daaw/kq;->x:Lcom/daaw/zw0;

    iget-object v10, v0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    invoke-interface {v10, v4}, Lcom/daaw/kq$c;->b(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    move-result-object v12

    iget-object v4, v0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    new-instance v10, Lcom/daaw/kq$f;

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->I()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lcom/daaw/kq;->E(J)J

    move-result-wide v15

    const/16 v17, 0x0

    move-object v11, v10

    invoke-direct/range {v11 .. v17}, Lcom/daaw/kq$f;-><init>(Lcom/daaw/zw0;JJLcom/daaw/kq$a;)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->T()V

    :cond_7
    iget v4, v0, Lcom/daaw/kq;->K:I

    if-nez v4, :cond_8

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/daaw/kq;->L:J

    const/4 v4, 0x1

    iput v4, v0, Lcom/daaw/kq;->K:I

    goto :goto_2

    :cond_8
    const/4 v4, 0x1

    iget-wide v5, v0, Lcom/daaw/kq;->L:J

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->H()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Lcom/daaw/kq;->M(J)J

    move-result-wide v8

    add-long/2addr v5, v8

    iget v8, v0, Lcom/daaw/kq;->K:I

    const/4 v9, 0x2

    if-ne v8, v4, :cond_9

    sub-long v10, v5, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    const-wide/32 v12, 0x30d40

    cmp-long v4, v10, v12

    if-lez v4, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Discontinuity detected [expected "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", got "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "]"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput v9, v0, Lcom/daaw/kq;->K:I

    :cond_9
    iget v4, v0, Lcom/daaw/kq;->K:I

    if-ne v4, v9, :cond_a

    iget-wide v8, v0, Lcom/daaw/kq;->L:J

    sub-long v5, v2, v5

    add-long/2addr v8, v5

    iput-wide v8, v0, Lcom/daaw/kq;->L:J

    const/4 v4, 0x1

    iput v4, v0, Lcom/daaw/kq;->K:I

    iget-object v4, v0, Lcom/daaw/kq;->k:Lcom/daaw/o7$c;

    if-eqz v4, :cond_a

    invoke-interface {v4}, Lcom/daaw/o7$c;->c()V

    :cond_a
    :goto_2
    iget-boolean v4, v0, Lcom/daaw/kq;->n:Z

    if-eqz v4, :cond_b

    iget-wide v4, v0, Lcom/daaw/kq;->E:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v6

    int-to-long v8, v6

    add-long/2addr v4, v8

    iput-wide v4, v0, Lcom/daaw/kq;->E:J

    goto :goto_3

    :cond_b
    iget-wide v4, v0, Lcom/daaw/kq;->F:J

    iget v6, v0, Lcom/daaw/kq;->J:I

    int-to-long v8, v6

    add-long/2addr v4, v8

    iput-wide v4, v0, Lcom/daaw/kq;->F:J

    :goto_3
    iput-object v1, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    :cond_c
    iget-boolean v1, v0, Lcom/daaw/kq;->u:Z

    if-eqz v1, :cond_d

    invoke-virtual {v0, v2, v3}, Lcom/daaw/kq;->O(J)V

    goto :goto_4

    :cond_d
    iget-object v1, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/kq;->U(Ljava/nio/ByteBuffer;J)V

    :goto_4
    iget-object v1, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_e

    iput-object v7, v0, Lcom/daaw/kq;->P:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    return v1

    :cond_e
    const/4 v1, 0x1

    iget-object v2, v0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->I()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/r7;->j(J)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kq;->e()V

    return v1

    :cond_f
    const/4 v1, 0x0

    return v1
.end method

.method public r(I)V
    .locals 3

    sget v0, Lcom/daaw/sq1;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-boolean v0, p0, Lcom/daaw/kq;->X:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/kq;->W:I

    if-eq v0, p1, :cond_2

    :cond_1
    iput-boolean v1, p0, Lcom/daaw/kq;->X:Z

    iput p1, p0, Lcom/daaw/kq;->W:I

    invoke-virtual {p0}, Lcom/daaw/kq;->e()V

    :cond_2
    return-void
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/kq;->V:Z

    invoke-virtual {p0}, Lcom/daaw/kq;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->i:Lcom/daaw/r7;

    invoke-virtual {v0}, Lcom/daaw/r7;->t()V

    iget-object v0, p0, Lcom/daaw/kq;->m:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public t(I)Z
    .locals 3

    invoke-static {p1}, Lcom/daaw/sq1;->I(I)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    :cond_2
    iget-object v0, p0, Lcom/daaw/kq;->a:Lcom/daaw/g7;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lcom/daaw/g7;->c(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public u(Lcom/daaw/o7$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kq;->k:Lcom/daaw/o7$c;

    return-void
.end method

.method public final y(J)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    invoke-interface {v0}, Lcom/daaw/kq$c;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/kq;->E(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final z(J)J
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/kq$f;

    invoke-static {v1}, Lcom/daaw/kq$f;->b(Lcom/daaw/kq$f;)J

    move-result-wide v1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    iget-object v0, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/kq$f;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/daaw/kq$f;->a(Lcom/daaw/kq$f;)Lcom/daaw/zw0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    invoke-static {v0}, Lcom/daaw/kq$f;->b(Lcom/daaw/kq$f;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/kq;->A:J

    invoke-static {v0}, Lcom/daaw/kq$f;->c(Lcom/daaw/kq$f;)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/kq;->L:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/kq;->z:J

    :cond_1
    iget-object v0, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    iget v0, v0, Lcom/daaw/zw0;->a:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/kq;->z:J

    add-long/2addr p1, v0

    iget-wide v0, p0, Lcom/daaw/kq;->A:J

    sub-long/2addr p1, v0

    return-wide p1

    :cond_2
    iget-object v0, p0, Lcom/daaw/kq;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lcom/daaw/kq;->z:J

    iget-object v2, p0, Lcom/daaw/kq;->b:Lcom/daaw/kq$c;

    iget-wide v3, p0, Lcom/daaw/kq;->A:J

    sub-long/2addr p1, v3

    invoke-interface {v2, p1, p2}, Lcom/daaw/kq$c;->a(J)J

    move-result-wide p1

    :goto_1
    add-long/2addr v0, p1

    return-wide v0

    :cond_3
    iget-wide v0, p0, Lcom/daaw/kq;->z:J

    iget-wide v2, p0, Lcom/daaw/kq;->A:J

    sub-long/2addr p1, v2

    iget-object v2, p0, Lcom/daaw/kq;->y:Lcom/daaw/zw0;

    iget v2, v2, Lcom/daaw/zw0;->a:F

    invoke-static {p1, p2, v2}, Lcom/daaw/sq1;->w(JF)J

    move-result-wide p1

    goto :goto_1
.end method
