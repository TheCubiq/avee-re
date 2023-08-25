.class public final Lcom/daaw/b00;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo0;
.implements Lcom/daaw/d00;
.implements Lcom/daaw/jk0$a;
.implements Lcom/daaw/jk0$d;
.implements Lcom/daaw/b81$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/b00$d;,
        Lcom/daaw/b00$c;,
        Lcom/daaw/b00$f;,
        Lcom/daaw/b00$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qo0;",
        "Lcom/daaw/d00;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/b00$c;",
        ">;",
        "Lcom/daaw/jk0$d;",
        "Lcom/daaw/b81$b;"
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public final B:Ljava/lang/Runnable;

.field public final C:Landroid/os/Handler;

.field public D:Lcom/daaw/qo0$a;

.field public E:Lcom/daaw/da1;

.field public F:[Lcom/daaw/b81;

.field public G:[I

.field public H:Z

.field public I:Z

.field public J:I

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:I

.field public O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public P:J

.field public Q:[Z

.field public R:[Z

.field public S:[Z

.field public T:Z

.field public U:J

.field public V:J

.field public W:J

.field public X:Z

.field public Y:I

.field public Z:Z

.field public a0:Z

.field public final p:Landroid/net/Uri;

.field public final q:Lcom/daaw/mp;

.field public final r:I

.field public final s:Lcom/daaw/cp0$a;

.field public final t:Lcom/daaw/b00$e;

.field public final u:Lcom/daaw/l2;

.field public final v:Ljava/lang/String;

.field public final w:J

.field public final x:Lcom/daaw/jk0;

.field public final y:Lcom/daaw/b00$d;

.field public final z:Lcom/daaw/bj;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/mp;[Lcom/daaw/zz;ILcom/daaw/cp0$a;Lcom/daaw/b00$e;Lcom/daaw/l2;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b00;->p:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/b00;->q:Lcom/daaw/mp;

    iput p4, p0, Lcom/daaw/b00;->r:I

    iput-object p5, p0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    iput-object p6, p0, Lcom/daaw/b00;->t:Lcom/daaw/b00$e;

    iput-object p7, p0, Lcom/daaw/b00;->u:Lcom/daaw/l2;

    iput-object p8, p0, Lcom/daaw/b00;->v:Ljava/lang/String;

    int-to-long p1, p9

    iput-wide p1, p0, Lcom/daaw/b00;->w:J

    new-instance p1, Lcom/daaw/jk0;

    const-string p2, "Loader:ExtractorMediaPeriod"

    invoke-direct {p1, p2}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    new-instance p1, Lcom/daaw/b00$d;

    invoke-direct {p1, p3, p0}, Lcom/daaw/b00$d;-><init>([Lcom/daaw/zz;Lcom/daaw/d00;)V

    iput-object p1, p0, Lcom/daaw/b00;->y:Lcom/daaw/b00$d;

    new-instance p1, Lcom/daaw/bj;

    invoke-direct {p1}, Lcom/daaw/bj;-><init>()V

    iput-object p1, p0, Lcom/daaw/b00;->z:Lcom/daaw/bj;

    new-instance p1, Lcom/daaw/b00$a;

    invoke-direct {p1, p0}, Lcom/daaw/b00$a;-><init>(Lcom/daaw/b00;)V

    iput-object p1, p0, Lcom/daaw/b00;->A:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/b00$b;

    invoke-direct {p1, p0}, Lcom/daaw/b00$b;-><init>(Lcom/daaw/b00;)V

    iput-object p1, p0, Lcom/daaw/b00;->B:Ljava/lang/Runnable;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lcom/daaw/b00;->G:[I

    new-array p1, p1, [Lcom/daaw/b81;

    iput-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/b00;->W:J

    const-wide/16 p6, -0x1

    iput-wide p6, p0, Lcom/daaw/b00;->U:J

    iput-wide p1, p0, Lcom/daaw/b00;->P:J

    const/4 p1, -0x1

    if-ne p4, p1, :cond_0

    const/4 p4, 0x3

    :cond_0
    iput p4, p0, Lcom/daaw/b00;->J:I

    invoke-virtual {p5}, Lcom/daaw/cp0$a;->q()V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/b00;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b00;->w:J

    return-wide v0
.end method

.method public static F(Ljava/io/IOException;)Z
    .locals 0

    instance-of p0, p0, Lcom/daaw/qp1;

    return p0
.end method

.method public static synthetic u(Lcom/daaw/b00;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/b00;->I()V

    return-void
.end method

.method public static synthetic v(Lcom/daaw/b00;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/b00;->a0:Z

    return p0
.end method

.method public static synthetic w(Lcom/daaw/b00;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b00;->B:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic x(Lcom/daaw/b00;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic y(Lcom/daaw/b00;)Lcom/daaw/qo0$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    return-object p0
.end method

.method public static synthetic z(Lcom/daaw/b00;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b00;->v:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final B(Lcom/daaw/b00$c;I)Z
    .locals 6

    iget-wide v0, p0, Lcom/daaw/b00;->U:J

    const/4 v2, 0x1

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_3

    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/da1;->h()J

    move-result-wide v0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean p2, p0, Lcom/daaw/b00;->I:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b00;->U()Z

    move-result p2

    if-nez p2, :cond_1

    iput-boolean v2, p0, Lcom/daaw/b00;->X:Z

    return v0

    :cond_1
    iget-boolean p2, p0, Lcom/daaw/b00;->I:Z

    iput-boolean p2, p0, Lcom/daaw/b00;->L:Z

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/daaw/b00;->V:J

    iput v0, p0, Lcom/daaw/b00;->Y:I

    iget-object p2, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, p2

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v5, p2, v0

    invoke-virtual {v5}, Lcom/daaw/b81;->C()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v3, v4, v3, v4}, Lcom/daaw/b00$c;->g(JJ)V

    return v2

    :cond_3
    :goto_1
    iput p2, p0, Lcom/daaw/b00;->Y:I

    return v2
.end method

.method public final C(Lcom/daaw/b00$c;)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/b00;->U:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {p1}, Lcom/daaw/b00$c;->f(Lcom/daaw/b00$c;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/b00;->U:J

    :cond_0
    return-void
.end method

.method public final D()I
    .locals 5

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/daaw/b81;->t()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final E()J
    .locals 7

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    const-wide/high16 v2, -0x8000000000000000L

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lcom/daaw/b81;->q()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final G()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/b00;->W:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/b00;->U()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/b00;->Z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/b81;->u()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I()V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/b00;->a0:Z

    if-nez v0, :cond_7

    iget-boolean v0, p0, Lcom/daaw/b00;->I:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/daaw/b00;->H:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/b00;->z:Lcom/daaw/bj;

    invoke-virtual {v0}, Lcom/daaw/bj;->b()Z

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v0, v0

    new-array v1, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/daaw/b00;->R:[Z

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/daaw/b00;->Q:[Z

    new-array v3, v0, [Z

    iput-object v3, p0, Lcom/daaw/b00;->S:[Z

    iget-object v3, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v3}, Lcom/daaw/da1;->h()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/daaw/b00;->P:J

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v0, :cond_5

    iget-object v5, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    new-instance v6, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v7, v4, [Lcom/google/android/exoplayer2/Format;

    aput-object v5, v7, v2

    invoke-direct {v6, v7}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v6, v1, v3

    iget-object v5, v5, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v5}, Lcom/daaw/hq0;->m(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {v5}, Lcom/daaw/hq0;->k(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :cond_4
    :goto_2
    iget-object v5, p0, Lcom/daaw/b00;->R:[Z

    aput-boolean v4, v5, v3

    iget-boolean v5, p0, Lcom/daaw/b00;->T:Z

    or-int/2addr v4, v5

    iput-boolean v4, p0, Lcom/daaw/b00;->T:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    new-instance v0, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    iput-object v0, p0, Lcom/daaw/b00;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget v0, p0, Lcom/daaw/b00;->r:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    iget-wide v0, p0, Lcom/daaw/b00;->U:J

    const-wide/16 v2, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_6

    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v0}, Lcom/daaw/da1;->h()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v0, v2

    if-nez v5, :cond_6

    const/4 v0, 0x6

    iput v0, p0, Lcom/daaw/b00;->J:I

    :cond_6
    iput-boolean v4, p0, Lcom/daaw/b00;->I:Z

    iget-object v0, p0, Lcom/daaw/b00;->t:Lcom/daaw/b00$e;

    iget-wide v1, p0, Lcom/daaw/b00;->P:J

    iget-object v3, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v3}, Lcom/daaw/da1;->e()Z

    move-result v3

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/b00$e;->b(JZ)V

    iget-object v0, p0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    invoke-interface {v0, p0}, Lcom/daaw/qo0$a;->j(Lcom/daaw/qo0;)V

    :cond_7
    :goto_3
    return-void
.end method

.method public final J(I)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/b00;->S:[Z

    aget-boolean v0, v0, p1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b00;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    iget-object v2, p0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    iget-object v0, v4, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/hq0;->g(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-wide v7, p0, Lcom/daaw/b00;->V:J

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/cp0$a;->c(ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;J)V

    iget-object v0, p0, Lcom/daaw/b00;->S:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    :cond_0
    return-void
.end method

.method public final K(I)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/b00;->X:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/b00;->R:[Z

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/b81;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/b00;->W:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/b00;->X:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/b00;->L:Z

    iput-wide v0, p0, Lcom/daaw/b00;->V:J

    iput p1, p0, Lcom/daaw/b00;->Y:I

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    :goto_0
    if-ge p1, v1, :cond_1

    aget-object v2, v0, p1

    invoke-virtual {v2}, Lcom/daaw/b81;->C()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public L()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    iget v1, p0, Lcom/daaw/b00;->J:I

    invoke-virtual {v0, v1}, Lcom/daaw/jk0;->h(I)V

    return-void
.end method

.method public M(Lcom/daaw/b00$c;JJZ)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v12, p2

    move-wide/from16 v14, p4

    iget-object v1, v0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->c(Lcom/daaw/b00$c;)Lcom/daaw/pp;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->d(Lcom/daaw/b00$c;)J

    move-result-wide v8

    iget-wide v10, v0, Lcom/daaw/b00;->P:J

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->e(Lcom/daaw/b00$c;)J

    move-result-wide v16

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v17}, Lcom/daaw/cp0$a;->e(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    if-nez p6, :cond_1

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/b00;->C(Lcom/daaw/b00$c;)V

    iget-object v1, v0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lcom/daaw/b81;->C()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lcom/daaw/b00;->N:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    invoke-interface {v1, v0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :cond_1
    return-void
.end method

.method public N(Lcom/daaw/b00$c;JJ)V
    .locals 22

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/daaw/b00;->P:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/b00;->E()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x2710

    add-long/2addr v1, v3

    :goto_0
    iput-wide v1, v0, Lcom/daaw/b00;->P:J

    iget-object v3, v0, Lcom/daaw/b00;->t:Lcom/daaw/b00$e;

    iget-object v4, v0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v4}, Lcom/daaw/da1;->e()Z

    move-result v4

    invoke-interface {v3, v1, v2, v4}, Lcom/daaw/b00$e;->b(JZ)V

    :cond_1
    iget-object v5, v0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->c(Lcom/daaw/b00$c;)Lcom/daaw/pp;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->d(Lcom/daaw/b00$c;)J

    move-result-wide v12

    iget-wide v14, v0, Lcom/daaw/b00;->P:J

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->e(Lcom/daaw/b00$c;)J

    move-result-wide v20

    move-wide/from16 v16, p2

    move-wide/from16 v18, p4

    invoke-virtual/range {v5 .. v21}, Lcom/daaw/cp0$a;->h(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/b00;->C(Lcom/daaw/b00$c;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/b00;->Z:Z

    iget-object v1, v0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    invoke-interface {v1, v0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method

.method public O(Lcom/daaw/b00$c;JJLjava/io/IOException;)I
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v12, p2

    move-wide/from16 v14, p4

    move-object/from16 v18, p6

    invoke-static/range {p6 .. p6}, Lcom/daaw/b00;->F(Ljava/io/IOException;)Z

    move-result v20

    move/from16 v19, v20

    iget-object v1, v0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->c(Lcom/daaw/b00$c;)Lcom/daaw/pp;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->d(Lcom/daaw/b00$c;)J

    move-result-wide v8

    iget-wide v10, v0, Lcom/daaw/b00;->P:J

    invoke-static/range {p1 .. p1}, Lcom/daaw/b00$c;->e(Lcom/daaw/b00$c;)J

    move-result-wide v16

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v19}, Lcom/daaw/cp0$a;->k(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJLjava/io/IOException;Z)V

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/b00;->C(Lcom/daaw/b00$c;)V

    if-eqz v20, :cond_0

    const/4 v1, 0x3

    return v1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/b00;->D()I

    move-result v1

    iget v2, v0, Lcom/daaw/b00;->Y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-le v1, v2, :cond_1

    move-object/from16 v2, p1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0, v2, v1}, Lcom/daaw/b00;->B(Lcom/daaw/b00$c;I)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    const/4 v3, 0x2

    :goto_1
    return v3
.end method

.method public P(ILcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/b00;->U()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v2, v0, p1

    iget-boolean v6, p0, Lcom/daaw/b00;->Z:Z

    iget-wide v7, p0, Lcom/daaw/b00;->V:J

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/b81;->y(Lcom/daaw/k30;Lcom/daaw/gq;ZZJ)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/b00;->J(I)V

    goto :goto_0

    :cond_1
    if-ne p2, v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/daaw/b00;->K(I)V

    :cond_2
    :goto_0
    return p2
.end method

.method public Q()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/b00;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/b81;->k()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {v0, p0}, Lcom/daaw/jk0;->j(Lcom/daaw/jk0$d;)V

    iget-object v0, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/b00;->a0:Z

    iget-object v0, p0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->r()V

    return-void
.end method

.method public final R(J)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_3

    iget-object v4, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v4, v4, v2

    invoke-virtual {v4}, Lcom/daaw/b81;->E()V

    invoke-virtual {v4, p1, p2, v3, v1}, Lcom/daaw/b81;->f(JZZ)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/daaw/b00;->R:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/b00;->T:Z

    if-nez v3, :cond_2

    :cond_1
    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public S(IJ)I
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/b00;->U()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lcom/daaw/b00;->Z:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/daaw/b81;->q()J

    move-result-wide v2

    cmp-long v4, p2, v2

    if-lez v4, :cond_1

    invoke-virtual {v0}, Lcom/daaw/b81;->g()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    invoke-virtual {v0, p2, p3, v2, v2}, Lcom/daaw/b81;->f(JZZ)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    if-lez v1, :cond_3

    invoke-virtual {p0, p1}, Lcom/daaw/b00;->J(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/b00;->K(I)V

    :goto_1
    return v1
.end method

.method public final T()V
    .locals 21

    move-object/from16 v6, p0

    new-instance v7, Lcom/daaw/b00$c;

    iget-object v2, v6, Lcom/daaw/b00;->p:Landroid/net/Uri;

    iget-object v3, v6, Lcom/daaw/b00;->q:Lcom/daaw/mp;

    iget-object v4, v6, Lcom/daaw/b00;->y:Lcom/daaw/b00$d;

    iget-object v5, v6, Lcom/daaw/b00;->z:Lcom/daaw/bj;

    move-object v0, v7

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/b00$c;-><init>(Lcom/daaw/b00;Landroid/net/Uri;Lcom/daaw/mp;Lcom/daaw/b00$d;Lcom/daaw/bj;)V

    iget-boolean v0, v6, Lcom/daaw/b00;->I:Z

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/b00;->G()Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-wide v0, v6, Lcom/daaw/b00;->P:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, v6, Lcom/daaw/b00;->W:J

    cmp-long v8, v4, v0

    if-ltz v8, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, v6, Lcom/daaw/b00;->Z:Z

    iput-wide v2, v6, Lcom/daaw/b00;->W:J

    return-void

    :cond_0
    iget-object v0, v6, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    iget-wide v4, v6, Lcom/daaw/b00;->W:J

    invoke-interface {v0, v4, v5}, Lcom/daaw/da1;->g(J)Lcom/daaw/da1$a;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/da1$a;->a:Lcom/daaw/fa1;

    iget-wide v0, v0, Lcom/daaw/fa1;->b:J

    iget-wide v4, v6, Lcom/daaw/b00;->W:J

    invoke-virtual {v7, v0, v1, v4, v5}, Lcom/daaw/b00$c;->g(JJ)V

    iput-wide v2, v6, Lcom/daaw/b00;->W:J

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/b00;->D()I

    move-result v0

    iput v0, v6, Lcom/daaw/b00;->Y:I

    iget-object v0, v6, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    iget v1, v6, Lcom/daaw/b00;->J:I

    invoke-virtual {v0, v7, v6, v1}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide v19

    iget-object v8, v6, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-static {v7}, Lcom/daaw/b00$c;->c(Lcom/daaw/b00$c;)Lcom/daaw/pp;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v7}, Lcom/daaw/b00$c;->d(Lcom/daaw/b00$c;)J

    move-result-wide v15

    iget-wide v0, v6, Lcom/daaw/b00;->P:J

    move-wide/from16 v17, v0

    invoke-virtual/range {v8 .. v20}, Lcom/daaw/cp0$a;->n(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    return-void
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/b00;->L:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b00;->G()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public a(II)Lcom/daaw/sm1;
    .locals 3

    iget-object p2, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length p2, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    iget-object v1, p0, Lcom/daaw/b00;->G:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/b81;

    iget-object v1, p0, Lcom/daaw/b00;->u:Lcom/daaw/l2;

    invoke-direct {v0, v1}, Lcom/daaw/b81;-><init>(Lcom/daaw/l2;)V

    invoke-virtual {v0, p0}, Lcom/daaw/b81;->H(Lcom/daaw/b81$b;)V

    iget-object v1, p0, Lcom/daaw/b00;->G:[I

    add-int/lit8 v2, p2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/b00;->G:[I

    aput p1, v1, p2

    iget-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/b81;

    iput-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aput-object v0, p1, p2

    return-object v0
.end method

.method public b()J
    .locals 2

    iget v0, p0, Lcom/daaw/b00;->N:I

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/b00;->f()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public c(J)Z
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/b00;->Z:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/b00;->X:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/b00;->I:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/b00;->N:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/b00;->z:Lcom/daaw/bj;

    invoke-virtual {p1}, Lcom/daaw/bj;->c()Z

    move-result p1

    iget-object p2, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {p2}, Lcom/daaw/jk0;->g()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b00;->T()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lcom/daaw/da1;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    iget-object p1, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/b00;->A:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 9

    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v0}, Lcom/daaw/da1;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/da1;->g(J)Lcom/daaw/da1$a;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/da1$a;->a:Lcom/daaw/fa1;

    iget-wide v5, v1, Lcom/daaw/fa1;->a:J

    iget-object v0, v0, Lcom/daaw/da1$a;->b:Lcom/daaw/fa1;

    iget-wide v7, v0, Lcom/daaw/fa1;->a:J

    move-wide v2, p1

    move-object v4, p3

    invoke-static/range {v2 .. v8}, Lcom/daaw/sq1;->S(JLcom/daaw/ea1;JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()J
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/b00;->Z:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/b00;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/b00;->W:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/b00;->T:Z

    if-eqz v0, :cond_3

    const-wide v3, 0x7fffffffffffffffL

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_4

    iget-object v6, p0, Lcom/daaw/b00;->R:[Z

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lcom/daaw/b81;->q()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/b00;->E()J

    move-result-wide v3

    :cond_4
    cmp-long v0, v3, v1

    if-nez v0, :cond_5

    iget-wide v3, p0, Lcom/daaw/b00;->V:J

    :cond_5
    return-wide v3
.end method

.method public g(J)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/b81;->C()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00;->y:Lcom/daaw/b00$d;

    invoke-virtual {v0}, Lcom/daaw/b00$d;->a()V

    return-void
.end method

.method public i([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJ)J
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/b00;->I:Z

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget v0, p0, Lcom/daaw/b00;->N:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    const/4 v4, 0x1

    if-ge v2, v3, :cond_2

    aget-object v3, p3, v2

    if-eqz v3, :cond_1

    aget-object v3, p1, v2

    if-eqz v3, :cond_0

    aget-boolean v3, p2, v2

    if-nez v3, :cond_1

    :cond_0
    aget-object v3, p3, v2

    check-cast v3, Lcom/daaw/b00$f;

    invoke-static {v3}, Lcom/daaw/b00$f;->b(Lcom/daaw/b00$f;)I

    move-result v3

    iget-object v5, p0, Lcom/daaw/b00;->Q:[Z

    aget-boolean v5, v5, v3

    invoke-static {v5}, Lcom/daaw/s6;->f(Z)V

    iget v5, p0, Lcom/daaw/b00;->N:I

    sub-int/2addr v5, v4

    iput v5, p0, Lcom/daaw/b00;->N:I

    iget-object v4, p0, Lcom/daaw/b00;->Q:[Z

    aput-boolean v1, v4, v3

    const/4 v3, 0x0

    aput-object v3, p3, v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lcom/daaw/b00;->K:Z

    if-eqz p2, :cond_3

    if-nez v0, :cond_4

    goto :goto_1

    :cond_3
    const-wide/16 v2, 0x0

    cmp-long p2, p5, v2

    if-eqz p2, :cond_4

    :goto_1
    const/4 p2, 0x1

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    :goto_2
    const/4 v0, 0x0

    :goto_3
    array-length v2, p1

    if-ge v0, v2, :cond_9

    aget-object v2, p3, v0

    if-nez v2, :cond_8

    aget-object v2, p1, v0

    if-eqz v2, :cond_8

    aget-object v2, p1, v0

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v3

    if-ne v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    invoke-interface {v2, v1}, Lcom/google/android/exoplayer2/trackselection/c;->f(I)I

    move-result v3

    if-nez v3, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    iget-object v3, p0, Lcom/daaw/b00;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/b00;->Q:[Z

    aget-boolean v3, v3, v2

    xor-int/2addr v3, v4

    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    iget v3, p0, Lcom/daaw/b00;->N:I

    add-int/2addr v3, v4

    iput v3, p0, Lcom/daaw/b00;->N:I

    iget-object v3, p0, Lcom/daaw/b00;->Q:[Z

    aput-boolean v4, v3, v2

    new-instance v3, Lcom/daaw/b00$f;

    invoke-direct {v3, p0, v2}, Lcom/daaw/b00$f;-><init>(Lcom/daaw/b00;I)V

    aput-object v3, p3, v0

    aput-boolean v4, p4, v0

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object p2, p2, v2

    invoke-virtual {p2}, Lcom/daaw/b81;->E()V

    invoke-virtual {p2, p5, p6, v4, v4}, Lcom/daaw/b81;->f(JZZ)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_7

    invoke-virtual {p2}, Lcom/daaw/b81;->r()I

    move-result p2

    if-eqz p2, :cond_7

    const/4 p2, 0x1

    goto :goto_6

    :cond_7
    const/4 p2, 0x0

    :cond_8
    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_9
    iget p1, p0, Lcom/daaw/b00;->N:I

    if-nez p1, :cond_c

    iput-boolean v1, p0, Lcom/daaw/b00;->X:Z

    iput-boolean v1, p0, Lcom/daaw/b00;->L:Z

    iget-object p1, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {p1}, Lcom/daaw/jk0;->g()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length p2, p1

    :goto_7
    if-ge v1, p2, :cond_a

    aget-object p3, p1, v1

    invoke-virtual {p3}, Lcom/daaw/b81;->k()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_a
    iget-object p1, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {p1}, Lcom/daaw/jk0;->f()V

    goto :goto_a

    :cond_b
    iget-object p1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length p2, p1

    :goto_8
    if-ge v1, p2, :cond_e

    aget-object p3, p1, v1

    invoke-virtual {p3}, Lcom/daaw/b81;->C()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p0, p5, p6}, Lcom/daaw/b00;->m(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v1, p1, :cond_e

    aget-object p1, p3, v1

    if-eqz p1, :cond_d

    aput-boolean v4, p4, v1

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    iput-boolean v4, p0, Lcom/daaw/b00;->K:Z

    return-wide p5
.end method

.method public j(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/b00;->A:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/b00$c;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/b00;->M(Lcom/daaw/b00$c;JJZ)V

    return-void
.end method

.method public l()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/b00;->L()V

    return-void
.end method

.method public m(J)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/b00;->E:Lcom/daaw/da1;

    invoke-interface {v0}, Lcom/daaw/da1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    iput-wide p1, p0, Lcom/daaw/b00;->V:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/b00;->L:Z

    invoke-virtual {p0}, Lcom/daaw/b00;->G()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b00;->R(J)Z

    move-result v1

    if-eqz v1, :cond_1

    return-wide p1

    :cond_1
    iput-boolean v0, p0, Lcom/daaw/b00;->X:Z

    iput-wide p1, p0, Lcom/daaw/b00;->W:J

    iput-boolean v0, p0, Lcom/daaw/b00;->Z:Z

    iget-object v1, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {v1}, Lcom/daaw/jk0;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/daaw/b00;->x:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->f()V

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v2, v1

    :goto_1
    if-ge v0, v2, :cond_3

    aget-object v3, v1, v0

    invoke-virtual {v3}, Lcom/daaw/b81;->C()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-wide p1
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/b00;->H:Z

    iget-object v0, p0, Lcom/daaw/b00;->C:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/b00;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/b00$c;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/b00;->N(Lcom/daaw/b00$c;JJ)V

    return-void
.end method

.method public p(Lcom/daaw/qo0$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b00;->D:Lcom/daaw/qo0$a;

    iget-object p1, p0, Lcom/daaw/b00;->z:Lcom/daaw/bj;

    invoke-virtual {p1}, Lcom/daaw/bj;->c()Z

    invoke-virtual {p0}, Lcom/daaw/b00;->T()V

    return-void
.end method

.method public q()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/b00;->M:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b00;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/b00;->M:Z

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/b00;->L:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/b00;->Z:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b00;->D()I

    move-result v0

    iget v1, p0, Lcom/daaw/b00;->Y:I

    if-le v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/b00;->L:Z

    iget-wide v0, p0, Lcom/daaw/b00;->V:J

    return-wide v0

    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/b00$c;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/b00;->O(Lcom/daaw/b00$c;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b00;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/b00;->F:[Lcom/daaw/b81;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/daaw/b00;->Q:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lcom/daaw/b81;->j(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
