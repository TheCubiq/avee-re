.class public final Lcom/daaw/vq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;
.implements Lcom/daaw/da1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vq0$b;
    }
.end annotation


# static fields
.field public static final t:Lcom/daaw/e00;

.field public static final u:I


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/rv0;

.field public final c:Lcom/daaw/rv0;

.field public final d:Lcom/daaw/rv0;

.field public final e:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/b7$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:I

.field public h:J

.field public i:I

.field public j:Lcom/daaw/rv0;

.field public k:I

.field public l:I

.field public m:I

.field public n:Lcom/daaw/d00;

.field public o:[Lcom/daaw/vq0$b;

.field public p:[[J

.field public q:I

.field public r:J

.field public s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vq0$a;

    invoke-direct {v0}, Lcom/daaw/vq0$a;-><init>()V

    sput-object v0, Lcom/daaw/vq0;->t:Lcom/daaw/e00;

    const-string v0, "qt  "

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/vq0;->u:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/vq0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/vq0;->a:I

    new-instance p1, Lcom/daaw/rv0;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/daaw/rv0;

    sget-object v0, Lcom/daaw/sr0;->a:[B

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/vq0;->b:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/vq0;->c:Lcom/daaw/rv0;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/vq0;->k:I

    return-void
.end method

.method public static j([Lcom/daaw/vq0$b;)[[J
    .locals 15

    array-length v0, p0

    new-array v0, v0, [[J

    array-length v1, p0

    new-array v1, v1, [I

    array-length v2, p0

    new-array v2, v2, [J

    array-length v3, p0

    new-array v3, v3, [Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v6, p0

    if-ge v5, v6, :cond_0

    aget-object v6, p0, v5

    iget-object v6, v6, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget v6, v6, Lcom/daaw/tm1;->a:I

    new-array v6, v6, [J

    aput-object v6, v0, v5

    aget-object v6, p0, v5

    iget-object v6, v6, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget-object v6, v6, Lcom/daaw/tm1;->e:[J

    aget-wide v7, v6, v4

    aput-wide v7, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    :goto_1
    array-length v8, p0

    if-ge v7, v8, :cond_4

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_2
    array-length v12, p0

    if-ge v11, v12, :cond_2

    aget-boolean v12, v3, v11

    if-nez v12, :cond_1

    aget-wide v12, v2, v11

    cmp-long v14, v12, v8

    if-gtz v14, :cond_1

    aget-wide v8, v2, v11

    move v10, v11

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    aget v8, v1, v10

    aget-object v9, v0, v10

    aput-wide v5, v9, v8

    aget-object v9, p0, v10

    iget-object v9, v9, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget-object v9, v9, Lcom/daaw/tm1;->c:[I

    aget v9, v9, v8

    int-to-long v11, v9

    add-long/2addr v5, v11

    const/4 v9, 0x1

    add-int/2addr v8, v9

    aput v8, v1, v10

    aget-object v11, v0, v10

    array-length v11, v11

    if-ge v8, v11, :cond_3

    aget-object v9, p0, v10

    iget-object v9, v9, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget-object v9, v9, Lcom/daaw/tm1;->e:[J

    aget-wide v8, v9, v8

    aput-wide v8, v2, v10

    goto :goto_1

    :cond_3
    aput-boolean v9, v3, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public static l(Lcom/daaw/tm1;J)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tm1;->a(J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tm1;->b(J)I

    move-result v0

    :cond_0
    return v0
.end method

.method public static n(Lcom/daaw/tm1;JJ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vq0;->l(Lcom/daaw/tm1;J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return-wide p3

    :cond_0
    iget-object p0, p0, Lcom/daaw/tm1;->b:[J

    aget-wide p1, p0, p1

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static p(Lcom/daaw/rv0;)Z
    .locals 3

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    sget v1, Lcom/daaw/vq0;->u:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rv0;->a()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    sget v1, Lcom/daaw/vq0;->u:I

    if-ne v0, v1, :cond_1

    return v2

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static u(I)Z
    .locals 1

    sget v0, Lcom/daaw/b7;->C:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->E:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->F:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->G:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->H:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->Q:I

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static v(I)Z
    .locals 1

    sget v0, Lcom/daaw/b7;->S:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->D:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->T:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->U:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->n0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->o0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->p0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->R:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->q0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->r0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->s0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->t0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->u0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->P:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->b:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->B0:I

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    invoke-static {p1}, Lcom/daaw/be1;->d(Lcom/daaw/a00;)Z

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 2

    :cond_0
    iget v0, p0, Lcom/daaw/vq0;->f:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/vq0;->t(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/daaw/vq0;->s(Lcom/daaw/a00;Lcom/daaw/iy0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/vq0;->r(Lcom/daaw/a00;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f(JJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vq0;->i:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/vq0;->k:I

    iput v0, p0, Lcom/daaw/vq0;->l:I

    iput v0, p0, Lcom/daaw/vq0;->m:I

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vq0;->k()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p3, p4}, Lcom/daaw/vq0;->w(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public g(J)Lcom/daaw/da1$a;
    .locals 12

    iget-object v0, p0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    array-length v1, v0

    if-nez v1, :cond_0

    new-instance p1, Lcom/daaw/da1$a;

    sget-object p2, Lcom/daaw/fa1;->c:Lcom/daaw/fa1;

    invoke-direct {p1, p2}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1

    :cond_0
    const-wide/16 v1, -0x1

    iget v3, p0, Lcom/daaw/vq0;->q:I

    const/4 v4, -0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v3, v4, :cond_3

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    invoke-static {v0, p1, p2}, Lcom/daaw/vq0;->l(Lcom/daaw/tm1;J)I

    move-result v3

    if-ne v3, v4, :cond_1

    new-instance p1, Lcom/daaw/da1$a;

    sget-object p2, Lcom/daaw/fa1;->c:Lcom/daaw/fa1;

    invoke-direct {p1, p2}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1

    :cond_1
    iget-object v7, v0, Lcom/daaw/tm1;->e:[J

    aget-wide v8, v7, v3

    iget-object v7, v0, Lcom/daaw/tm1;->b:[J

    aget-wide v10, v7, v3

    cmp-long v7, v8, p1

    if-gez v7, :cond_2

    iget v7, v0, Lcom/daaw/tm1;->a:I

    add-int/lit8 v7, v7, -0x1

    if-ge v3, v7, :cond_2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/tm1;->b(J)I

    move-result p1

    if-eq p1, v4, :cond_2

    if-eq p1, v3, :cond_2

    iget-object p2, v0, Lcom/daaw/tm1;->e:[J

    aget-wide v1, p2, p1

    iget-object p2, v0, Lcom/daaw/tm1;->b:[J

    aget-wide p1, p2, p1

    goto :goto_0

    :cond_2
    move-wide p1, v1

    move-wide v1, v5

    :goto_0
    move-wide v3, p1

    move-wide p1, v8

    goto :goto_1

    :cond_3
    const-wide v10, 0x7fffffffffffffffL

    move-wide v3, v1

    move-wide v1, v5

    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget-object v7, p0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    array-length v8, v7

    if-ge v0, v8, :cond_6

    iget v8, p0, Lcom/daaw/vq0;->q:I

    if-eq v0, v8, :cond_5

    aget-object v7, v7, v0

    iget-object v7, v7, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    invoke-static {v7, p1, p2, v10, v11}, Lcom/daaw/vq0;->n(Lcom/daaw/tm1;JJ)J

    move-result-wide v8

    cmp-long v10, v1, v5

    if-eqz v10, :cond_4

    invoke-static {v7, v1, v2, v3, v4}, Lcom/daaw/vq0;->n(Lcom/daaw/tm1;JJ)J

    move-result-wide v3

    :cond_4
    move-wide v10, v8

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/daaw/fa1;

    invoke-direct {v0, p1, p2, v10, v11}, Lcom/daaw/fa1;-><init>(JJ)V

    cmp-long p1, v1, v5

    if-nez p1, :cond_7

    new-instance p1, Lcom/daaw/da1$a;

    invoke-direct {p1, v0}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1

    :cond_7
    new-instance p1, Lcom/daaw/fa1;

    invoke-direct {p1, v1, v2, v3, v4}, Lcom/daaw/fa1;-><init>(JJ)V

    new-instance p2, Lcom/daaw/da1$a;

    invoke-direct {p2, v0, p1}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;Lcom/daaw/fa1;)V

    return-object p2
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/vq0;->r:J

    return-wide v0
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vq0;->n:Lcom/daaw/d00;

    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vq0;->f:I

    iput v0, p0, Lcom/daaw/vq0;->i:I

    return-void
.end method

.method public final m(J)I
    .locals 20

    move-object/from16 v0, p0

    const/4 v2, -0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x1

    const-wide v11, 0x7fffffffffffffffL

    const/4 v13, 0x1

    const-wide v14, 0x7fffffffffffffffL

    :goto_0
    iget-object v1, v0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    array-length v3, v1

    if-ge v7, v3, :cond_7

    aget-object v1, v1, v7

    iget v3, v1, Lcom/daaw/vq0$b;->d:I

    iget-object v1, v1, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget v4, v1, Lcom/daaw/tm1;->a:I

    if-ne v3, v4, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, v1, Lcom/daaw/tm1;->b:[J

    aget-wide v4, v1, v3

    iget-object v1, v0, Lcom/daaw/vq0;->p:[[J

    aget-object v1, v1, v7

    aget-wide v16, v1, v3

    sub-long v4, v4, p1

    const-wide/16 v18, 0x0

    cmp-long v1, v4, v18

    if-ltz v1, :cond_2

    const-wide/32 v18, 0x40000

    cmp-long v1, v4, v18

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-nez v1, :cond_3

    if-nez v13, :cond_4

    :cond_3
    if-ne v1, v13, :cond_5

    cmp-long v3, v4, v14

    if-gez v3, :cond_5

    :cond_4
    move v13, v1

    move-wide v14, v4

    move v6, v7

    move-wide/from16 v11, v16

    :cond_5
    cmp-long v3, v16, v8

    if-gez v3, :cond_6

    move v10, v1

    move v2, v7

    move-wide/from16 v8, v16

    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_7
    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v8, v3

    if-eqz v1, :cond_8

    if-eqz v10, :cond_8

    const-wide/32 v3, 0xa00000

    add-long/2addr v8, v3

    cmp-long v1, v11, v8

    if-gez v1, :cond_9

    :cond_8
    move v2, v6

    :cond_9
    return v2
.end method

.method public final o(J)V
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    iget-wide v2, v0, Lcom/daaw/b7$a;->Q0:J

    cmp-long v0, v2, p1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    iget v2, v0, Lcom/daaw/b7;->a:I

    sget v3, Lcom/daaw/b7;->C:I

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/vq0;->q(Lcom/daaw/b7$a;)V

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iput v1, p0, Lcom/daaw/vq0;->f:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/b7$a;

    invoke-virtual {v1, v0}, Lcom/daaw/b7$a;->d(Lcom/daaw/b7$a;)V

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/daaw/vq0;->f:I

    if-eq p1, v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/vq0;->k()V

    :cond_3
    return-void
.end method

.method public final q(Lcom/daaw/b7$a;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/daaw/y50;

    invoke-direct {v3}, Lcom/daaw/y50;-><init>()V

    sget v4, Lcom/daaw/b7;->B0:I

    invoke-virtual {v1, v4}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-boolean v5, v0, Lcom/daaw/vq0;->s:Z

    invoke-static {v4, v5}, Lcom/daaw/c7;->v(Lcom/daaw/b7$b;Z)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v4}, Lcom/daaw/y50;->c(Lcom/google/android/exoplayer2/metadata/Metadata;)Z

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :cond_1
    :goto_0
    const/4 v9, 0x0

    const/4 v10, -0x1

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iget-object v13, v1, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v9, v13, :cond_b

    iget-object v13, v1, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/daaw/b7$a;

    iget v14, v13, Lcom/daaw/b7;->a:I

    sget v15, Lcom/daaw/b7;->E:I

    if-eq v14, v15, :cond_2

    goto :goto_3

    :cond_2
    sget v14, Lcom/daaw/b7;->D:I

    invoke-virtual {v1, v14}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v15

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v18, 0x0

    iget v14, v0, Lcom/daaw/vq0;->a:I

    const/4 v5, 0x1

    and-int/2addr v14, v5

    if-eqz v14, :cond_3

    const/16 v19, 0x1

    goto :goto_2

    :cond_3
    const/16 v19, 0x0

    :goto_2
    iget-boolean v14, v0, Lcom/daaw/vq0;->s:Z

    move/from16 v20, v14

    move-object v14, v13

    invoke-static/range {v14 .. v20}, Lcom/daaw/c7;->u(Lcom/daaw/b7$a;Lcom/daaw/b7$b;JLcom/google/android/exoplayer2/drm/DrmInitData;ZZ)Lcom/daaw/nm1;

    move-result-object v14

    if-nez v14, :cond_4

    goto :goto_3

    :cond_4
    sget v15, Lcom/daaw/b7;->F:I

    invoke-virtual {v13, v15}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v13

    sget v15, Lcom/daaw/b7;->G:I

    invoke-virtual {v13, v15}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v13

    sget v15, Lcom/daaw/b7;->H:I

    invoke-virtual {v13, v15}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v13

    invoke-static {v14, v13, v3}, Lcom/daaw/c7;->q(Lcom/daaw/nm1;Lcom/daaw/b7$a;Lcom/daaw/y50;)Lcom/daaw/tm1;

    move-result-object v13

    iget v15, v13, Lcom/daaw/tm1;->a:I

    if-nez v15, :cond_5

    :goto_3
    const/4 v5, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_6

    :cond_5
    new-instance v15, Lcom/daaw/vq0$b;

    iget-object v8, v0, Lcom/daaw/vq0;->n:Lcom/daaw/d00;

    iget v6, v14, Lcom/daaw/nm1;->b:I

    invoke-interface {v8, v9, v6}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v6

    invoke-direct {v15, v14, v13, v6}, Lcom/daaw/vq0$b;-><init>(Lcom/daaw/nm1;Lcom/daaw/tm1;Lcom/daaw/sm1;)V

    iget v6, v13, Lcom/daaw/tm1;->d:I

    add-int/lit8 v6, v6, 0x1e

    iget-object v7, v14, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v7, v6}, Lcom/google/android/exoplayer2/Format;->h(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    iget v7, v14, Lcom/daaw/nm1;->b:I

    if-ne v7, v5, :cond_7

    invoke-virtual {v3}, Lcom/daaw/y50;->a()Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, v3, Lcom/daaw/y50;->a:I

    iget v7, v3, Lcom/daaw/y50;->b:I

    invoke-virtual {v6, v5, v7}, Lcom/google/android/exoplayer2/Format;->c(II)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    :cond_6
    if-eqz v4, :cond_7

    invoke-virtual {v6, v4}, Lcom/google/android/exoplayer2/Format;->i(Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    :cond_7
    iget-object v5, v15, Lcom/daaw/vq0$b;->c:Lcom/daaw/sm1;

    invoke-interface {v5, v6}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-wide v5, v14, Lcom/daaw/nm1;->e:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v17, v5, v7

    if-eqz v17, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v5, v13, Lcom/daaw/tm1;->g:J

    :goto_4
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iget v5, v14, Lcom/daaw/nm1;->b:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_9

    const/4 v5, -0x1

    if-ne v10, v5, :cond_a

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    move v10, v6

    goto :goto_5

    :cond_9
    const/4 v5, -0x1

    :cond_a
    :goto_5
    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    :cond_b
    iput v10, v0, Lcom/daaw/vq0;->q:I

    iput-wide v11, v0, Lcom/daaw/vq0;->r:J

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/daaw/vq0$b;

    invoke-interface {v2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/daaw/vq0$b;

    iput-object v1, v0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    invoke-static {v1}, Lcom/daaw/vq0;->j([Lcom/daaw/vq0$b;)[[J

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/vq0;->p:[[J

    iget-object v1, v0, Lcom/daaw/vq0;->n:Lcom/daaw/d00;

    invoke-interface {v1}, Lcom/daaw/d00;->n()V

    iget-object v1, v0, Lcom/daaw/vq0;->n:Lcom/daaw/d00;

    invoke-interface {v1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    return-void
.end method

.method public final r(Lcom/daaw/a00;)Z
    .locals 8

    iget v0, p0, Lcom/daaw/vq0;->i:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v0, v3, v2, v1}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v3

    :cond_0
    iput v2, p0, Lcom/daaw/vq0;->i:I

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->z()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/vq0;->h:J

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->i()I

    move-result v0

    iput v0, p0, Lcom/daaw/vq0;->g:I

    :cond_1
    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v0, v2, v2}, Lcom/daaw/a00;->f([BII)V

    iget v0, p0, Lcom/daaw/vq0;->i:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/vq0;->i:I

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->C()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, Lcom/daaw/vq0;->h:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    iget-wide v4, v0, Lcom/daaw/b7$a;->Q0:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Lcom/daaw/vq0;->i:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    iget v0, p0, Lcom/daaw/vq0;->i:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_a

    iget v0, p0, Lcom/daaw/vq0;->g:I

    invoke-static {v0}, Lcom/daaw/vq0;->u(I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    add-long/2addr v2, v4

    iget p1, p0, Lcom/daaw/vq0;->i:I

    int-to-long v4, p1

    sub-long/2addr v2, v4

    iget-object p1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/b7$a;

    iget v4, p0, Lcom/daaw/vq0;->g:I

    invoke-direct {v0, v4, v2, v3}, Lcom/daaw/b7$a;-><init>(IJ)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    iget p1, p0, Lcom/daaw/vq0;->i:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_5

    invoke-virtual {p0, v2, v3}, Lcom/daaw/vq0;->o(J)V

    goto :goto_5

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/vq0;->k()V

    goto :goto_5

    :cond_6
    iget p1, p0, Lcom/daaw/vq0;->g:I

    invoke-static {p1}, Lcom/daaw/vq0;->v(I)Z

    move-result p1

    if-eqz p1, :cond_9

    iget p1, p0, Lcom/daaw/vq0;->i:I

    if-ne p1, v2, :cond_7

    const/4 p1, 0x1

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    const-wide/32 v6, 0x7fffffff

    cmp-long p1, v4, v6

    if-gtz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_3

    :cond_8
    const/4 p1, 0x0

    :goto_3
    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    new-instance p1, Lcom/daaw/rv0;

    iget-wide v4, p0, Lcom/daaw/vq0;->h:J

    long-to-int v0, v4

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/vq0;->j:Lcom/daaw/rv0;

    iget-object v0, p0, Lcom/daaw/vq0;->d:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    iget-object p1, p1, Lcom/daaw/rv0;->a:[B

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_9
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/vq0;->j:Lcom/daaw/rv0;

    :goto_4
    iput v1, p0, Lcom/daaw/vq0;->f:I

    :goto_5
    return v1

    :cond_a
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Atom size less than header length (unsupported)."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method

.method public final s(Lcom/daaw/a00;Lcom/daaw/iy0;)Z
    .locals 9

    iget-wide v0, p0, Lcom/daaw/vq0;->h:J

    iget v2, p0, Lcom/daaw/vq0;->i:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    add-long/2addr v2, v0

    iget-object v4, p0, Lcom/daaw/vq0;->j:Lcom/daaw/rv0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    iget-object p2, v4, Lcom/daaw/rv0;->a:[B

    iget v4, p0, Lcom/daaw/vq0;->i:I

    long-to-int v1, v0

    invoke-interface {p1, p2, v4, v1}, Lcom/daaw/a00;->f([BII)V

    iget p1, p0, Lcom/daaw/vq0;->g:I

    sget p2, Lcom/daaw/b7;->b:I

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/daaw/vq0;->j:Lcom/daaw/rv0;

    invoke-static {p1}, Lcom/daaw/vq0;->p(Lcom/daaw/rv0;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/vq0;->s:Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/vq0;->e:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/b7$a;

    new-instance p2, Lcom/daaw/b7$b;

    iget v0, p0, Lcom/daaw/vq0;->g:I

    iget-object v1, p0, Lcom/daaw/vq0;->j:Lcom/daaw/rv0;

    invoke-direct {p2, v0, v1}, Lcom/daaw/b7$b;-><init>(ILcom/daaw/rv0;)V

    invoke-virtual {p1, p2}, Lcom/daaw/b7$a;->e(Lcom/daaw/b7$b;)V

    goto :goto_0

    :cond_1
    const-wide/32 v7, 0x40000

    cmp-long v4, v0, v7

    if-gez v4, :cond_3

    long-to-int p2, v0

    invoke-interface {p1, p2}, Lcom/daaw/a00;->j(I)V

    :cond_2
    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v7

    add-long/2addr v7, v0

    iput-wide v7, p2, Lcom/daaw/iy0;->a:J

    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p0, v2, v3}, Lcom/daaw/vq0;->o(J)V

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/daaw/vq0;->f:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    return v5
.end method

.method public final t(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 13

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget v2, p0, Lcom/daaw/vq0;->k:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/vq0;->m(J)I

    move-result v2

    iput v2, p0, Lcom/daaw/vq0;->k:I

    if-ne v2, v3, :cond_0

    return v3

    :cond_0
    iget-object v2, p0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    iget v4, p0, Lcom/daaw/vq0;->k:I

    aget-object v2, v2, v4

    iget-object v4, v2, Lcom/daaw/vq0$b;->c:Lcom/daaw/sm1;

    iget v5, v2, Lcom/daaw/vq0$b;->d:I

    iget-object v6, v2, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget-object v7, v6, Lcom/daaw/tm1;->b:[J

    aget-wide v8, v7, v5

    iget-object v6, v6, Lcom/daaw/tm1;->c:[I

    aget v6, v6, v5

    sub-long v0, v8, v0

    iget v7, p0, Lcom/daaw/vq0;->l:I

    int-to-long v10, v7

    add-long/2addr v0, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    cmp-long v7, v0, v10

    if-ltz v7, :cond_6

    const-wide/32 v10, 0x40000

    cmp-long v7, v0, v10

    if-ltz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object p2, v2, Lcom/daaw/vq0$b;->a:Lcom/daaw/nm1;

    iget p2, p2, Lcom/daaw/nm1;->g:I

    if-ne p2, v12, :cond_2

    const-wide/16 v7, 0x8

    add-long/2addr v0, v7

    add-int/lit8 v6, v6, -0x8

    :cond_2
    long-to-int p2, v0

    invoke-interface {p1, p2}, Lcom/daaw/a00;->j(I)V

    iget-object p2, v2, Lcom/daaw/vq0$b;->a:Lcom/daaw/nm1;

    iget p2, p2, Lcom/daaw/nm1;->j:I

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object v1, p0, Lcom/daaw/vq0;->c:Lcom/daaw/rv0;

    iget-object v1, v1, Lcom/daaw/rv0;->a:[B

    aput-byte v0, v1, v0

    aput-byte v0, v1, v12

    const/4 v7, 0x2

    aput-byte v0, v1, v7

    rsub-int/lit8 v1, p2, 0x4

    :goto_0
    iget v7, p0, Lcom/daaw/vq0;->l:I

    if-ge v7, v6, :cond_5

    iget v7, p0, Lcom/daaw/vq0;->m:I

    if-nez v7, :cond_3

    iget-object v7, p0, Lcom/daaw/vq0;->c:Lcom/daaw/rv0;

    iget-object v7, v7, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v7, v1, p2}, Lcom/daaw/a00;->f([BII)V

    iget-object v7, p0, Lcom/daaw/vq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v7, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object v7, p0, Lcom/daaw/vq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v7}, Lcom/daaw/rv0;->B()I

    move-result v7

    iput v7, p0, Lcom/daaw/vq0;->m:I

    iget-object v7, p0, Lcom/daaw/vq0;->b:Lcom/daaw/rv0;

    invoke-virtual {v7, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object v7, p0, Lcom/daaw/vq0;->b:Lcom/daaw/rv0;

    const/4 v8, 0x4

    invoke-interface {v4, v7, v8}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget v7, p0, Lcom/daaw/vq0;->l:I

    add-int/2addr v7, v8

    iput v7, p0, Lcom/daaw/vq0;->l:I

    add-int/2addr v6, v1

    goto :goto_0

    :cond_3
    invoke-interface {v4, p1, v7, v0}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result v7

    iget v8, p0, Lcom/daaw/vq0;->l:I

    add-int/2addr v8, v7

    iput v8, p0, Lcom/daaw/vq0;->l:I

    iget v8, p0, Lcom/daaw/vq0;->m:I

    sub-int/2addr v8, v7

    iput v8, p0, Lcom/daaw/vq0;->m:I

    goto :goto_0

    :cond_4
    :goto_1
    iget p2, p0, Lcom/daaw/vq0;->l:I

    if-ge p2, v6, :cond_5

    sub-int p2, v6, p2

    invoke-interface {v4, p1, p2, v0}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result p2

    iget v1, p0, Lcom/daaw/vq0;->l:I

    add-int/2addr v1, p2

    iput v1, p0, Lcom/daaw/vq0;->l:I

    iget v1, p0, Lcom/daaw/vq0;->m:I

    sub-int/2addr v1, p2

    iput v1, p0, Lcom/daaw/vq0;->m:I

    goto :goto_1

    :cond_5
    move v8, v6

    iget-object p1, v2, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iget-object p2, p1, Lcom/daaw/tm1;->e:[J

    aget-wide v6, p2, v5

    iget-object p1, p1, Lcom/daaw/tm1;->f:[I

    aget p1, p1, v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v5, v6

    move v7, p1

    invoke-interface/range {v4 .. v10}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget p1, v2, Lcom/daaw/vq0$b;->d:I

    add-int/2addr p1, v12

    iput p1, v2, Lcom/daaw/vq0$b;->d:I

    iput v3, p0, Lcom/daaw/vq0;->k:I

    iput v0, p0, Lcom/daaw/vq0;->l:I

    iput v0, p0, Lcom/daaw/vq0;->m:I

    return v0

    :cond_6
    :goto_2
    iput-wide v8, p2, Lcom/daaw/iy0;->a:J

    return v12
.end method

.method public final w(J)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/vq0;->o:[Lcom/daaw/vq0$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    invoke-virtual {v4, p1, p2}, Lcom/daaw/tm1;->a(J)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    invoke-virtual {v4, p1, p2}, Lcom/daaw/tm1;->b(J)I

    move-result v5

    :cond_0
    iput v5, v3, Lcom/daaw/vq0$b;->d:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
