.class public final Lcom/daaw/rb0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$a;
.implements Lcom/daaw/jk0$d;
.implements Lcom/daaw/gb1;
.implements Lcom/daaw/d00;
.implements Lcom/daaw/b81$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/rb0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/ef;",
        ">;",
        "Lcom/daaw/jk0$d;",
        "Lcom/daaw/gb1;",
        "Lcom/daaw/d00;",
        "Lcom/daaw/b81$b;"
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public final B:Landroid/os/Handler;

.field public final C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/qb0;",
            ">;"
        }
    .end annotation
.end field

.field public D:[Lcom/daaw/b81;

.field public E:[I

.field public F:Z

.field public G:I

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public L:I

.field public M:Lcom/google/android/exoplayer2/Format;

.field public N:Z

.field public O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public P:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public Q:[I

.field public R:I

.field public S:Z

.field public T:[Z

.field public U:[Z

.field public V:J

.field public W:J

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:J

.field public final p:I

.field public final q:Lcom/daaw/rb0$c;

.field public final r:Lcom/daaw/eb0;

.field public final s:Lcom/daaw/l2;

.field public final t:Lcom/google/android/exoplayer2/Format;

.field public final u:I

.field public final v:Lcom/daaw/jk0;

.field public final w:Lcom/daaw/cp0$a;

.field public final x:Lcom/daaw/eb0$b;

.field public final y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/jb0;",
            ">;"
        }
    .end annotation
.end field

.field public final z:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(ILcom/daaw/rb0$c;Lcom/daaw/eb0;Lcom/daaw/l2;JLcom/google/android/exoplayer2/Format;ILcom/daaw/cp0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/rb0;->p:I

    iput-object p2, p0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    iput-object p3, p0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    iput-object p4, p0, Lcom/daaw/rb0;->s:Lcom/daaw/l2;

    iput-object p7, p0, Lcom/daaw/rb0;->t:Lcom/google/android/exoplayer2/Format;

    iput p8, p0, Lcom/daaw/rb0;->u:I

    iput-object p9, p0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    new-instance p1, Lcom/daaw/jk0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    new-instance p1, Lcom/daaw/eb0$b;

    invoke-direct {p1}, Lcom/daaw/eb0$b;-><init>()V

    iput-object p1, p0, Lcom/daaw/rb0;->x:Lcom/daaw/eb0$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lcom/daaw/rb0;->E:[I

    const/4 p2, -0x1

    iput p2, p0, Lcom/daaw/rb0;->G:I

    iput p2, p0, Lcom/daaw/rb0;->I:I

    new-array p2, p1, [Lcom/daaw/b81;

    iput-object p2, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    new-array p2, p1, [Z

    iput-object p2, p0, Lcom/daaw/rb0;->U:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/rb0;->T:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/rb0;->C:Ljava/util/ArrayList;

    new-instance p1, Lcom/daaw/rb0$a;

    invoke-direct {p1, p0}, Lcom/daaw/rb0$a;-><init>(Lcom/daaw/rb0;)V

    iput-object p1, p0, Lcom/daaw/rb0;->z:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/rb0$b;

    invoke-direct {p1, p0}, Lcom/daaw/rb0$b;-><init>(Lcom/daaw/rb0;)V

    iput-object p1, p0, Lcom/daaw/rb0;->A:Ljava/lang/Runnable;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/daaw/rb0;->B:Landroid/os/Handler;

    iput-wide p5, p0, Lcom/daaw/rb0;->V:J

    iput-wide p5, p0, Lcom/daaw/rb0;->W:J

    return-void
.end method

.method public static A(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Z)Lcom/google/android/exoplayer2/Format;
    .locals 9

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget p2, p0, Lcom/google/android/exoplayer2/Format;->q:I

    move v4, p2

    goto :goto_0

    :cond_1
    const/4 p2, -0x1

    const/4 v4, -0x1

    :goto_0
    iget-object p2, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {p2}, Lcom/daaw/hq0;->g(Ljava/lang/String;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/hq0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    iget-object p2, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    :cond_2
    move-object v2, p2

    iget-object v1, p0, Lcom/google/android/exoplayer2/Format;->p:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/exoplayer2/Format;->y:I

    iget v6, p0, Lcom/google/android/exoplayer2/Format;->z:I

    iget v7, p0, Lcom/google/android/exoplayer2/Format;->M:I

    iget-object v8, p0, Lcom/google/android/exoplayer2/Format;->N:Ljava/lang/String;

    move-object v0, p1

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/exoplayer2/Format;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p0

    return-object p0
.end method

.method public static C(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)Z
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/hq0;->g(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    invoke-static {v1}, Lcom/daaw/hq0;->g(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v4

    :cond_2
    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    iget p0, p0, Lcom/google/android/exoplayer2/Format;->O:I

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->O:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    return v3
.end method

.method public static F(Lcom/daaw/ef;)Z
    .locals 0

    instance-of p0, p0, Lcom/daaw/jb0;

    return p0
.end method

.method public static synthetic u(Lcom/daaw/rb0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb0;->J()V

    return-void
.end method

.method public static synthetic v(Lcom/daaw/rb0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb0;->P()V

    return-void
.end method

.method public static z(II)Lcom/daaw/ev;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    new-instance p0, Lcom/daaw/ev;

    invoke-direct {p0}, Lcom/daaw/ev;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final B(Lcom/daaw/jb0;)Z
    .locals 4

    iget p1, p1, Lcom/daaw/jb0;->j:I

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/daaw/rb0;->T:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lcom/daaw/b81;->v()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final D()Lcom/daaw/jb0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/jb0;

    return-object v0
.end method

.method public E(IZZ)V
    .locals 4

    const/4 v0, 0x0

    if-nez p3, :cond_0

    iput-boolean v0, p0, Lcom/daaw/rb0;->F:Z

    iput-boolean v0, p0, Lcom/daaw/rb0;->H:Z

    :cond_0
    iget-object p3, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p3, v2

    invoke-virtual {v3, p1}, Lcom/daaw/b81;->I(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length p2, p1

    :goto_1
    if-ge v0, p2, :cond_2

    aget-object p3, p1, v0

    invoke-virtual {p3}, Lcom/daaw/b81;->J()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final G()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/rb0;->W:J

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

    iget-boolean v0, p0, Lcom/daaw/rb0;->Z:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/b81;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final I()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget v0, v0, Lcom/google/android/exoplayer2/source/TrackGroupArray;->p:I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/rb0;->Q:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v5, v2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/daaw/rb0;->C(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/daaw/rb0;->Q:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/rb0;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/qb0;

    invoke-virtual {v1}, Lcom/daaw/qb0;->b()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final J()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/rb0;->N:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/rb0;->Q:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/daaw/rb0;->J:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rb0;->I()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/rb0;->x()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/rb0;->K:Z

    iget-object v0, p0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {v0}, Lcom/daaw/rb0$c;->a()V

    :cond_4
    :goto_1
    return-void
.end method

.method public K()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->a()V

    iget-object v0, p0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v0}, Lcom/daaw/eb0;->e()V

    return-void
.end method

.method public L(Lcom/daaw/ef;JJZ)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v13, p2

    move-wide/from16 v15, p4

    iget-object v2, v0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    iget-object v3, v1, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v4, v1, Lcom/daaw/ef;->b:I

    iget v5, v0, Lcom/daaw/rb0;->p:I

    iget-object v6, v1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iget v7, v1, Lcom/daaw/ef;->d:I

    iget-object v8, v1, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iget-wide v9, v1, Lcom/daaw/ef;->f:J

    iget-wide v11, v1, Lcom/daaw/ef;->g:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ef;->c()J

    move-result-wide v17

    invoke-virtual/range {v2 .. v18}, Lcom/daaw/cp0$a;->e(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    if-nez p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb0;->T()V

    iget v1, v0, Lcom/daaw/rb0;->L:I

    if-lez v1, :cond_0

    iget-object v1, v0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {v1, v0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :cond_0
    return-void
.end method

.method public M(Lcom/daaw/ef;JJ)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v13, p2

    move-wide/from16 v15, p4

    iget-object v2, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v2, v1}, Lcom/daaw/eb0;->g(Lcom/daaw/ef;)V

    iget-object v2, v0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    iget-object v3, v1, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v4, v1, Lcom/daaw/ef;->b:I

    iget v5, v0, Lcom/daaw/rb0;->p:I

    iget-object v6, v1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iget v7, v1, Lcom/daaw/ef;->d:I

    iget-object v8, v1, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iget-wide v9, v1, Lcom/daaw/ef;->f:J

    iget-wide v11, v1, Lcom/daaw/ef;->g:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ef;->c()J

    move-result-wide v17

    invoke-virtual/range {v2 .. v18}, Lcom/daaw/cp0$a;->h(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    iget-boolean v1, v0, Lcom/daaw/rb0;->K:Z

    if-nez v1, :cond_0

    iget-wide v1, v0, Lcom/daaw/rb0;->V:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rb0;->c(J)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {v1, v0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :goto_0
    return-void
.end method

.method public N(Lcom/daaw/ef;JJLjava/io/IOException;)I
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p6

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ef;->c()J

    move-result-wide v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/rb0;->F(Lcom/daaw/ef;)Z

    move-result v4

    const/16 v21, 0x0

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iget-object v3, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v3, v1, v2, v15}, Lcom/daaw/eb0;->h(Lcom/daaw/ef;ZLjava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v4, :cond_3

    iget-object v2, v0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/jb0;

    if-ne v2, v1, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    iget-object v2, v0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, v0, Lcom/daaw/rb0;->V:J

    iput-wide v2, v0, Lcom/daaw/rb0;->W:J

    :cond_3
    const/16 v22, 0x1

    goto :goto_3

    :cond_4
    const/16 v22, 0x0

    :goto_3
    iget-object v2, v0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    iget-object v3, v1, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v4, v1, Lcom/daaw/ef;->b:I

    iget v5, v0, Lcom/daaw/rb0;->p:I

    iget-object v6, v1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iget v7, v1, Lcom/daaw/ef;->d:I

    iget-object v8, v1, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iget-wide v9, v1, Lcom/daaw/ef;->f:J

    iget-wide v11, v1, Lcom/daaw/ef;->g:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ef;->c()J

    move-result-wide v17

    move-wide/from16 v13, p2

    move-object v1, v15

    move-wide/from16 v15, p4

    move-object/from16 v19, p6

    move/from16 v20, v22

    invoke-virtual/range {v2 .. v20}, Lcom/daaw/cp0$a;->k(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJLjava/io/IOException;Z)V

    if-eqz v22, :cond_6

    iget-boolean v1, v0, Lcom/daaw/rb0;->K:Z

    if-nez v1, :cond_5

    iget-wide v1, v0, Lcom/daaw/rb0;->V:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rb0;->c(J)Z

    goto :goto_4

    :cond_5
    iget-object v1, v0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {v1, v0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :goto_4
    const/4 v1, 0x2

    return v1

    :cond_6
    instance-of v1, v1, Lcom/daaw/tv0;

    if-eqz v1, :cond_7

    const/16 v21, 0x3

    :cond_7
    return v21
.end method

.method public O(Lcom/daaw/ib0$a;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/eb0;->i(Lcom/daaw/ib0$a;Z)Z

    move-result p1

    return p1
.end method

.method public final P()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/rb0;->J:Z

    invoke-virtual {p0}, Lcom/daaw/rb0;->J()V

    return-void
.end method

.method public Q(Lcom/google/android/exoplayer2/source/TrackGroupArray;ILcom/google/android/exoplayer2/source/TrackGroupArray;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/rb0;->K:Z

    iput-object p1, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput-object p3, p0, Lcom/daaw/rb0;->P:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput p2, p0, Lcom/daaw/rb0;->R:I

    iget-object p1, p0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {p1}, Lcom/daaw/rb0$c;->a()V

    return-void
.end method

.method public R(ILcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/jb0;

    invoke-virtual {p0, v2}, Lcom/daaw/rb0;->B(Lcom/daaw/jb0;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-lez v1, :cond_2

    iget-object v2, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-static {v2, v0, v1}, Lcom/daaw/sq1;->R(Ljava/util/List;II)V

    :cond_2
    iget-object v1, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/jb0;

    iget-object v8, v0, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iget-object v1, p0, Lcom/daaw/rb0;->M:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v8, v1}, Lcom/google/android/exoplayer2/Format;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    iget v2, p0, Lcom/daaw/rb0;->p:I

    iget v4, v0, Lcom/daaw/ef;->d:I

    iget-object v5, v0, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iget-wide v6, v0, Lcom/daaw/ef;->f:J

    move-object v3, v8

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/cp0$a;->c(ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;J)V

    :cond_3
    iput-object v8, p0, Lcom/daaw/rb0;->M:Lcom/google/android/exoplayer2/Format;

    :cond_4
    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object v1, v0, p1

    iget-boolean v5, p0, Lcom/daaw/rb0;->Z:Z

    iget-wide v6, p0, Lcom/daaw/rb0;->V:J

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/b81;->y(Lcom/daaw/k30;Lcom/daaw/gq;ZZJ)I

    move-result p1

    return p1
.end method

.method public S()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/rb0;->K:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/b81;->k()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {v0, p0}, Lcom/daaw/jk0;->j(Lcom/daaw/jk0$d;)V

    iget-object v0, p0, Lcom/daaw/rb0;->B:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/rb0;->N:Z

    iget-object v0, p0, Lcom/daaw/rb0;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final T()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, Lcom/daaw/rb0;->X:Z

    invoke-virtual {v4, v5}, Lcom/daaw/b81;->D(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lcom/daaw/rb0;->X:Z

    return-void
.end method

.method public final U(J)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_3

    iget-object v4, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

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

    iget-object v3, p0, Lcom/daaw/rb0;->U:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_1

    iget-boolean v3, p0, Lcom/daaw/rb0;->S:Z

    if-nez v3, :cond_2

    :cond_1
    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public V(JZ)Z
    .locals 2

    iput-wide p1, p0, Lcom/daaw/rb0;->V:J

    iget-boolean v0, p0, Lcom/daaw/rb0;->J:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/rb0;->U(J)Z

    move-result p3

    if-eqz p3, :cond_0

    return v1

    :cond_0
    iput-wide p1, p0, Lcom/daaw/rb0;->W:J

    iput-boolean v1, p0, Lcom/daaw/rb0;->Z:Z

    iget-object p1, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {p1}, Lcom/daaw/jk0;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {p1}, Lcom/daaw/jk0;->f()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rb0;->T()V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public W([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJZ)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v10, p5

    iget-boolean v3, v0, Lcom/daaw/rb0;->K:Z

    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    iget v3, v0, Lcom/daaw/rb0;->L:I

    const/4 v12, 0x0

    const/4 v4, 0x0

    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v13, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    aget-object v5, v1, v4

    if-eqz v5, :cond_0

    aget-boolean v5, p2, v4

    if-nez v5, :cond_1

    :cond_0
    iget v5, v0, Lcom/daaw/rb0;->L:I

    sub-int/2addr v5, v13

    iput v5, v0, Lcom/daaw/rb0;->L:I

    aget-object v5, v2, v4

    check-cast v5, Lcom/daaw/qb0;

    invoke-virtual {v5}, Lcom/daaw/qb0;->e()V

    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    iget-boolean v4, v0, Lcom/daaw/rb0;->Y:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Lcom/daaw/rb0;->V:J

    cmp-long v5, v10, v3

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    :goto_2
    iget-object v4, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v4}, Lcom/daaw/eb0;->d()Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v4

    move v14, v3

    move-object v15, v4

    const/4 v3, 0x0

    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    aget-object v5, v2, v3

    if-nez v5, :cond_9

    aget-object v5, v1, v3

    if-eqz v5, :cond_9

    iget v5, v0, Lcom/daaw/rb0;->L:I

    add-int/2addr v5, v13

    iput v5, v0, Lcom/daaw/rb0;->L:I

    aget-object v5, v1, v3

    iget-object v7, v0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-interface {v5}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v7

    iget v8, v0, Lcom/daaw/rb0;->R:I

    if-ne v7, v8, :cond_6

    iget-object v8, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v8, v5}, Lcom/daaw/eb0;->l(Lcom/google/android/exoplayer2/trackselection/c;)V

    move-object v15, v5

    :cond_6
    new-instance v5, Lcom/daaw/qb0;

    invoke-direct {v5, v0, v7}, Lcom/daaw/qb0;-><init>(Lcom/daaw/rb0;I)V

    aput-object v5, v2, v3

    aput-boolean v13, p4, v3

    iget-object v5, v0, Lcom/daaw/rb0;->Q:[I

    if-eqz v5, :cond_7

    aget-object v5, v2, v3

    check-cast v5, Lcom/daaw/qb0;

    invoke-virtual {v5}, Lcom/daaw/qb0;->b()V

    :cond_7
    iget-boolean v5, v0, Lcom/daaw/rb0;->J:Z

    if-eqz v5, :cond_9

    if-nez v14, :cond_9

    iget-object v5, v0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    iget-object v8, v0, Lcom/daaw/rb0;->Q:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    invoke-virtual {v5}, Lcom/daaw/b81;->E()V

    invoke-virtual {v5, v10, v11, v13, v13}, Lcom/daaw/b81;->f(JZZ)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_8

    invoke-virtual {v5}, Lcom/daaw/b81;->r()I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    goto :goto_4

    :cond_8
    const/4 v5, 0x0

    :goto_4
    move v14, v5

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    iget v1, v0, Lcom/daaw/rb0;->L:I

    if-nez v1, :cond_d

    iget-object v1, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v1}, Lcom/daaw/eb0;->j()V

    iput-object v6, v0, Lcom/daaw/rb0;->M:Lcom/google/android/exoplayer2/Format;

    iget-object v1, v0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {v1}, Lcom/daaw/jk0;->g()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lcom/daaw/rb0;->J:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v3, v1

    :goto_5
    if-ge v12, v3, :cond_b

    aget-object v4, v1, v12

    invoke-virtual {v4}, Lcom/daaw/b81;->k()V

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_b
    iget-object v1, v0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {v1}, Lcom/daaw/jk0;->f()V

    goto :goto_a

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb0;->T()V

    goto :goto_a

    :cond_d
    iget-object v1, v0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v15, v4}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-boolean v1, v0, Lcom/daaw/rb0;->Y:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v10, v3

    if-gez v1, :cond_e

    neg-long v3, v10

    :cond_e
    move-wide v6, v3

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, v15

    move-wide/from16 v4, p5

    invoke-interface/range {v3 .. v9}, Lcom/google/android/exoplayer2/trackselection/c;->n(JJJ)V

    iget-object v1, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v1}, Lcom/daaw/eb0;->c()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb0;->D()Lcom/daaw/jb0;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/source/TrackGroup;->b(Lcom/google/android/exoplayer2/Format;)I

    move-result v1

    invoke-interface {v15}, Lcom/google/android/exoplayer2/trackselection/c;->j()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_6

    :cond_f
    const/4 v1, 0x0

    goto :goto_7

    :cond_10
    :goto_6
    const/4 v1, 0x1

    :goto_7
    if-eqz v1, :cond_11

    iput-boolean v13, v0, Lcom/daaw/rb0;->X:Z

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_8

    :cond_11
    move/from16 v1, p7

    :goto_8
    if-eqz v14, :cond_13

    invoke-virtual {v0, v10, v11, v1}, Lcom/daaw/rb0;->V(JZ)Z

    :goto_9
    array-length v1, v2

    if-ge v12, v1, :cond_13

    aget-object v1, v2, v12

    if-eqz v1, :cond_12

    aput-boolean v13, p4, v12

    :cond_12
    add-int/lit8 v12, v12, 0x1

    goto :goto_9

    :cond_13
    :goto_a
    invoke-virtual {v0, v2}, Lcom/daaw/rb0;->b0([Lcom/daaw/d81;)V

    iput-boolean v13, v0, Lcom/daaw/rb0;->Y:Z

    return v14
.end method

.method public X(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v0, p1}, Lcom/daaw/eb0;->n(Z)V

    return-void
.end method

.method public Y(J)V
    .locals 4

    iput-wide p1, p0, Lcom/daaw/rb0;->b0:J

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lcom/daaw/b81;->G(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Z(IJ)I
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lcom/daaw/rb0;->Z:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/b81;->q()J

    move-result-wide v2

    cmp-long v0, p2, v2

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/b81;->g()I

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0, v0}, Lcom/daaw/b81;->f(JZZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p1

    :goto_0
    return v1
.end method

.method public a(II)Lcom/daaw/sm1;
    .locals 8

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne p2, v5, :cond_3

    iget v6, p0, Lcom/daaw/rb0;->G:I

    if-eq v6, v3, :cond_2

    iget-boolean v1, p0, Lcom/daaw/rb0;->F:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/rb0;->E:[I

    aget v1, v1, v6

    if-ne v1, p1, :cond_0

    aget-object p1, v0, v6

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/daaw/rb0;->z(II)Lcom/daaw/ev;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    iput-boolean v5, p0, Lcom/daaw/rb0;->F:Z

    iget-object p2, p0, Lcom/daaw/rb0;->E:[I

    aput p1, p2, v6

    aget-object p1, v0, v6

    return-object p1

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/rb0;->a0:Z

    if-eqz v0, :cond_a

    invoke-static {p1, p2}, Lcom/daaw/rb0;->z(II)Lcom/daaw/ev;

    move-result-object p1

    return-object p1

    :cond_3
    if-ne p2, v4, :cond_7

    iget v6, p0, Lcom/daaw/rb0;->I:I

    if-eq v6, v3, :cond_6

    iget-boolean v1, p0, Lcom/daaw/rb0;->H:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/daaw/rb0;->E:[I

    aget v1, v1, v6

    if-ne v1, p1, :cond_4

    aget-object p1, v0, v6

    goto :goto_1

    :cond_4
    invoke-static {p1, p2}, Lcom/daaw/rb0;->z(II)Lcom/daaw/ev;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_5
    iput-boolean v5, p0, Lcom/daaw/rb0;->H:Z

    iget-object p2, p0, Lcom/daaw/rb0;->E:[I

    aput p1, p2, v6

    aget-object p1, v0, v6

    return-object p1

    :cond_6
    iget-boolean v0, p0, Lcom/daaw/rb0;->a0:Z

    if-eqz v0, :cond_a

    invoke-static {p1, p2}, Lcom/daaw/rb0;->z(II)Lcom/daaw/ev;

    move-result-object p1

    return-object p1

    :cond_7
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v1, :cond_9

    iget-object v3, p0, Lcom/daaw/rb0;->E:[I

    aget v3, v3, v0

    if-ne v3, p1, :cond_8

    iget-object p1, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object p1, p1, v0

    return-object p1

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    iget-boolean v0, p0, Lcom/daaw/rb0;->a0:Z

    if-eqz v0, :cond_a

    invoke-static {p1, p2}, Lcom/daaw/rb0;->z(II)Lcom/daaw/ev;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance v0, Lcom/daaw/b81;

    iget-object v3, p0, Lcom/daaw/rb0;->s:Lcom/daaw/l2;

    invoke-direct {v0, v3}, Lcom/daaw/b81;-><init>(Lcom/daaw/l2;)V

    iget-wide v6, p0, Lcom/daaw/rb0;->b0:J

    invoke-virtual {v0, v6, v7}, Lcom/daaw/b81;->G(J)V

    invoke-virtual {v0, p0}, Lcom/daaw/b81;->H(Lcom/daaw/b81$b;)V

    iget-object v3, p0, Lcom/daaw/rb0;->E:[I

    add-int/lit8 v6, v1, 0x1

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/rb0;->E:[I

    aput p1, v3, v1

    iget-object p1, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/b81;

    iput-object p1, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aput-object v0, p1, v1

    iget-object p1, p0, Lcom/daaw/rb0;->U:[Z

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rb0;->U:[Z

    if-eq p2, v5, :cond_b

    if-ne p2, v4, :cond_c

    :cond_b
    const/4 v2, 0x1

    :cond_c
    aput-boolean v2, p1, v1

    iget-boolean v2, p0, Lcom/daaw/rb0;->S:Z

    aget-boolean p1, p1, v1

    or-int/2addr p1, v2

    iput-boolean p1, p0, Lcom/daaw/rb0;->S:Z

    if-ne p2, v5, :cond_d

    iput-boolean v5, p0, Lcom/daaw/rb0;->F:Z

    iput v1, p0, Lcom/daaw/rb0;->G:I

    goto :goto_3

    :cond_d
    if-ne p2, v4, :cond_e

    iput-boolean v5, p0, Lcom/daaw/rb0;->H:Z

    iput v1, p0, Lcom/daaw/rb0;->I:I

    :cond_e
    :goto_3
    iget-object p1, p0, Lcom/daaw/rb0;->T:[Z

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rb0;->T:[Z

    return-object v0
.end method

.method public a0(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rb0;->Q:[I

    aget p1, v0, p1

    iget-object v0, p0, Lcom/daaw/rb0;->T:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/rb0;->T:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/rb0;->W:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/rb0;->Z:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rb0;->D()Lcom/daaw/jb0;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/ef;->g:J

    :goto_0
    return-wide v0
.end method

.method public final b0([Lcom/daaw/d81;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/rb0;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/daaw/rb0;->C:Ljava/util/ArrayList;

    check-cast v2, Lcom/daaw/qb0;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(J)Z
    .locals 18

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/daaw/rb0;->Z:Z

    const/4 v2, 0x0

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    invoke-virtual {v1}, Lcom/daaw/jk0;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb0;->G()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iget-wide v3, v0, Lcom/daaw/rb0;->W:J

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb0;->D()Lcom/daaw/jb0;

    move-result-object v1

    iget-wide v3, v1, Lcom/daaw/ef;->g:J

    :goto_0
    move-object v6, v1

    move-wide v9, v3

    iget-object v5, v0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    iget-object v11, v0, Lcom/daaw/rb0;->x:Lcom/daaw/eb0$b;

    move-wide/from16 v7, p1

    invoke-virtual/range {v5 .. v11}, Lcom/daaw/eb0;->b(Lcom/daaw/jb0;JJLcom/daaw/eb0$b;)V

    iget-object v1, v0, Lcom/daaw/rb0;->x:Lcom/daaw/eb0$b;

    iget-boolean v3, v1, Lcom/daaw/eb0$b;->b:Z

    iget-object v4, v1, Lcom/daaw/eb0$b;->a:Lcom/daaw/ef;

    iget-object v5, v1, Lcom/daaw/eb0$b;->c:Lcom/daaw/ib0$a;

    invoke-virtual {v1}, Lcom/daaw/eb0$b;->a()V

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v1, 0x1

    if-eqz v3, :cond_2

    iput-wide v6, v0, Lcom/daaw/rb0;->W:J

    iput-boolean v1, v0, Lcom/daaw/rb0;->Z:Z

    return v1

    :cond_2
    if-nez v4, :cond_4

    if-eqz v5, :cond_3

    iget-object v1, v0, Lcom/daaw/rb0;->q:Lcom/daaw/rb0$c;

    invoke-interface {v1, v5}, Lcom/daaw/rb0$c;->k(Lcom/daaw/ib0$a;)V

    :cond_3
    return v2

    :cond_4
    invoke-static {v4}, Lcom/daaw/rb0;->F(Lcom/daaw/ef;)Z

    move-result v2

    if-eqz v2, :cond_5

    iput-wide v6, v0, Lcom/daaw/rb0;->W:J

    move-object v2, v4

    check-cast v2, Lcom/daaw/jb0;

    invoke-virtual {v2, v0}, Lcom/daaw/jb0;->h(Lcom/daaw/rb0;)V

    iget-object v3, v0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v2, v0, Lcom/daaw/rb0;->v:Lcom/daaw/jk0;

    iget v3, v0, Lcom/daaw/rb0;->u:I

    invoke-virtual {v2, v4, v0, v3}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide v16

    iget-object v5, v0, Lcom/daaw/rb0;->w:Lcom/daaw/cp0$a;

    iget-object v6, v4, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v7, v4, Lcom/daaw/ef;->b:I

    iget v8, v0, Lcom/daaw/rb0;->p:I

    iget-object v9, v4, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iget v10, v4, Lcom/daaw/ef;->d:I

    iget-object v11, v4, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iget-wide v12, v4, Lcom/daaw/ef;->f:J

    iget-wide v14, v4, Lcom/daaw/ef;->g:J

    invoke-virtual/range {v5 .. v17}, Lcom/daaw/cp0$a;->n(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    return v1

    :cond_6
    :goto_1
    return v2
.end method

.method public d(Lcom/daaw/da1;)V
    .locals 0

    return-void
.end method

.method public f()J
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/rb0;->Z:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rb0;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/rb0;->W:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lcom/daaw/rb0;->V:J

    invoke-virtual {p0}, Lcom/daaw/rb0;->D()Lcom/daaw/jb0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/jb0;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lcom/daaw/rb0;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/jb0;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lcom/daaw/ef;->g:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-boolean v2, p0, Lcom/daaw/rb0;->J:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lcom/daaw/b81;->q()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public g(J)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb0;->T()V

    return-void
.end method

.method public j(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/rb0;->B:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/rb0;->z:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/ef;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/rb0;->L(Lcom/daaw/ef;JJZ)V

    return-void
.end method

.method public l()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb0;->K()V

    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/rb0;->a0:Z

    iget-object v0, p0, Lcom/daaw/rb0;->B:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/rb0;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/ef;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/rb0;->M(Lcom/daaw/ef;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/ef;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/rb0;->N(Lcom/daaw/ef;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/rb0;->J:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/daaw/rb0;->T:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lcom/daaw/b81;->j(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public w(I)I
    .locals 4

    iget-object v0, p0, Lcom/daaw/rb0;->Q:[I

    aget v0, v0, p1

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/rb0;->P:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v3, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v3, p1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x3

    :goto_0
    return v1

    :cond_1
    iget-object p1, p0, Lcom/daaw/rb0;->T:[Z

    aget-boolean v2, p1, v0

    if-eqz v2, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return v0
.end method

.method public final x()V
    .locals 14

    iget-object v0, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    array-length v0, v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    :goto_0
    const/4 v6, 0x3

    const/4 v7, 0x1

    if-ge v3, v0, :cond_5

    iget-object v8, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object v8, v8, v3

    invoke-virtual {v8}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v8

    iget-object v8, v8, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v8}, Lcom/daaw/hq0;->m(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v8}, Lcom/daaw/hq0;->k(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x2

    goto :goto_1

    :cond_1
    invoke-static {v8}, Lcom/daaw/hq0;->l(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    if-le v6, v4, :cond_3

    move v5, v3

    move v4, v6

    goto :goto_2

    :cond_3
    if-ne v6, v4, :cond_4

    if-eq v5, v1, :cond_4

    const/4 v5, -0x1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    iget-object v3, p0, Lcom/daaw/rb0;->r:Lcom/daaw/eb0;

    invoke-virtual {v3}, Lcom/daaw/eb0;->c()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v3

    iget v8, v3, Lcom/google/android/exoplayer2/source/TrackGroup;->p:I

    iput v1, p0, Lcom/daaw/rb0;->R:I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/rb0;->Q:[I

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_6

    iget-object v9, p0, Lcom/daaw/rb0;->Q:[I

    aput v1, v9, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    new-array v1, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_a

    iget-object v10, p0, Lcom/daaw/rb0;->D:[Lcom/daaw/b81;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lcom/daaw/b81;->s()Lcom/google/android/exoplayer2/Format;

    move-result-object v10

    if-ne v9, v5, :cond_8

    new-array v11, v8, [Lcom/google/android/exoplayer2/Format;

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v8, :cond_7

    invoke-virtual {v3, v12}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v13

    invoke-static {v13, v10, v7}, Lcom/daaw/rb0;->A(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Z)Lcom/google/android/exoplayer2/Format;

    move-result-object v13

    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_7
    new-instance v10, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v10, v11}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v10, v1, v9

    iput v9, p0, Lcom/daaw/rb0;->R:I

    goto :goto_7

    :cond_8
    if-ne v4, v6, :cond_9

    iget-object v11, v10, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v11}, Lcom/daaw/hq0;->k(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    iget-object v11, p0, Lcom/daaw/rb0;->t:Lcom/google/android/exoplayer2/Format;

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    :goto_6
    new-instance v12, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v13, v7, [Lcom/google/android/exoplayer2/Format;

    invoke-static {v11, v10, v2}, Lcom/daaw/rb0;->A(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Z)Lcom/google/android/exoplayer2/Format;

    move-result-object v10

    aput-object v10, v13, v2

    invoke-direct {v12, v13}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v12, v1, v9

    :goto_7
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_a
    new-instance v0, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    iput-object v0, p0, Lcom/daaw/rb0;->O:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v0, p0, Lcom/daaw/rb0;->P:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    if-nez v0, :cond_b

    const/4 v2, 0x1

    :cond_b
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    sget-object v0, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput-object v0, p0, Lcom/daaw/rb0;->P:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-void
.end method

.method public y()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/rb0;->K:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/rb0;->V:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/rb0;->c(J)Z

    :cond_0
    return-void
.end method
