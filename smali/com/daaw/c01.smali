.class public final Lcom/daaw/c01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/c01$b;
    }
.end annotation


# static fields
.field public static final h:Lcom/daaw/e00;


# instance fields
.field public final a:Lcom/daaw/ol1;

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/c01$b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/rv0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lcom/daaw/d00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/c01$a;

    invoke-direct {v0}, Lcom/daaw/c01$a;-><init>()V

    sput-object v0, Lcom/daaw/c01;->h:Lcom/daaw/e00;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/daaw/ol1;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ol1;-><init>(J)V

    invoke-direct {p0, v0}, Lcom/daaw/c01;-><init>(Lcom/daaw/ol1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ol1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c01;->a:Lcom/daaw/ol1;

    new-instance p1, Lcom/daaw/rv0;

    const/16 v0, 0x1000

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/c01;->b:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 9

    const/16 v0, 0xe

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2, v0}, Lcom/daaw/a00;->k([BII)V

    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v0, v5

    const/4 v5, 0x3

    aget-byte v7, v1, v5

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v0, v7

    const/16 v7, 0x1ba

    if-eq v7, v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x4

    aget-byte v7, v1, v0

    and-int/lit16 v7, v7, 0xc4

    const/16 v8, 0x44

    if-eq v7, v8, :cond_1

    return v2

    :cond_1
    const/4 v7, 0x6

    aget-byte v7, v1, v7

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_2

    return v2

    :cond_2
    aget-byte v7, v1, v6

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_3

    return v2

    :cond_3
    const/16 v0, 0x9

    aget-byte v0, v1, v0

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_4

    return v2

    :cond_4
    const/16 v0, 0xc

    aget-byte v0, v1, v0

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_5

    return v2

    :cond_5
    const/16 v0, 0xd

    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x7

    invoke-interface {p1, v0}, Lcom/daaw/a00;->g(I)V

    invoke-interface {p1, v1, v2, v5}, Lcom/daaw/a00;->k([BII)V

    aget-byte p1, v1, v2

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr p1, v0

    aget-byte v0, v1, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    if-ne v3, p1, :cond_6

    const/4 v2, 0x1

    :cond_6
    return v2
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 9

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result p2

    const/4 v1, -0x1

    if-nez p2, :cond_0

    return v1

    :cond_0
    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->i()I

    move-result p2

    const/16 v3, 0x1b9

    if-ne p2, v3, :cond_1

    return v1

    :cond_1
    const/16 v1, 0x1ba

    if-ne p2, v1, :cond_2

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    const/16 v1, 0xa

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/a00;->k([BII)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    const/16 v1, 0x9

    invoke-virtual {p2, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    and-int/lit8 p2, p2, 0x7

    add-int/lit8 p2, p2, 0xe

    :goto_0
    invoke-interface {p1, p2}, Lcom/daaw/a00;->j(I)V

    return v0

    :cond_2
    const/16 v1, 0x1bb

    const/4 v3, 0x2

    const/4 v4, 0x6

    if-ne p2, v1, :cond_3

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, p2, v0, v3}, Lcom/daaw/a00;->k([BII)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->D()I

    move-result p2

    add-int/2addr p2, v4

    goto :goto_0

    :cond_3
    and-int/lit16 v1, p2, -0x100

    shr-int/lit8 v1, v1, 0x8

    if-eq v1, v2, :cond_4

    invoke-interface {p1, v2}, Lcom/daaw/a00;->j(I)V

    return v0

    :cond_4
    and-int/lit16 p2, p2, 0xff

    iget-object v1, p0, Lcom/daaw/c01;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/c01$b;

    iget-boolean v5, p0, Lcom/daaw/c01;->d:Z

    if-nez v5, :cond_b

    if-nez v1, :cond_8

    const/4 v5, 0x0

    iget-boolean v6, p0, Lcom/daaw/c01;->e:Z

    if-nez v6, :cond_5

    const/16 v7, 0xbd

    if-ne p2, v7, :cond_5

    new-instance v5, Lcom/daaw/t;

    invoke-direct {v5}, Lcom/daaw/t;-><init>()V

    :goto_1
    iput-boolean v2, p0, Lcom/daaw/c01;->e:Z

    goto :goto_2

    :cond_5
    if-nez v6, :cond_6

    and-int/lit16 v6, p2, 0xe0

    const/16 v7, 0xc0

    if-ne v6, v7, :cond_6

    new-instance v5, Lcom/daaw/zq0;

    invoke-direct {v5}, Lcom/daaw/zq0;-><init>()V

    goto :goto_1

    :cond_6
    iget-boolean v6, p0, Lcom/daaw/c01;->f:Z

    if-nez v6, :cond_7

    and-int/lit16 v6, p2, 0xf0

    const/16 v7, 0xe0

    if-ne v6, v7, :cond_7

    new-instance v5, Lcom/daaw/m80;

    invoke-direct {v5}, Lcom/daaw/m80;-><init>()V

    iput-boolean v2, p0, Lcom/daaw/c01;->f:Z

    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    new-instance v1, Lcom/daaw/eo1$d;

    const/16 v6, 0x100

    invoke-direct {v1, p2, v6}, Lcom/daaw/eo1$d;-><init>(II)V

    iget-object v6, p0, Lcom/daaw/c01;->g:Lcom/daaw/d00;

    invoke-interface {v5, v6, v1}, Lcom/daaw/wv;->d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V

    new-instance v1, Lcom/daaw/c01$b;

    iget-object v6, p0, Lcom/daaw/c01;->a:Lcom/daaw/ol1;

    invoke-direct {v1, v5, v6}, Lcom/daaw/c01$b;-><init>(Lcom/daaw/wv;Lcom/daaw/ol1;)V

    iget-object v5, p0, Lcom/daaw/c01;->b:Landroid/util/SparseArray;

    invoke-virtual {v5, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_8
    iget-boolean p2, p0, Lcom/daaw/c01;->e:Z

    if-eqz p2, :cond_9

    iget-boolean p2, p0, Lcom/daaw/c01;->f:Z

    if-nez p2, :cond_a

    :cond_9
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v5

    const-wide/32 v7, 0x100000

    cmp-long p2, v5, v7

    if-lez p2, :cond_b

    :cond_a
    iput-boolean v2, p0, Lcom/daaw/c01;->d:Z

    iget-object p2, p0, Lcom/daaw/c01;->g:Lcom/daaw/d00;

    invoke-interface {p2}, Lcom/daaw/d00;->n()V

    :cond_b
    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, p2, v0, v3}, Lcom/daaw/a00;->k([BII)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object p2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->D()I

    move-result p2

    add-int/2addr p2, v4

    if-nez v1, :cond_c

    invoke-interface {p1, p2}, Lcom/daaw/a00;->j(I)V

    goto :goto_3

    :cond_c
    iget-object v2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {v2, p2}, Lcom/daaw/rv0;->G(I)V

    iget-object v2, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v2, v0, p2}, Lcom/daaw/a00;->f([BII)V

    iget-object p1, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p1, v4}, Lcom/daaw/rv0;->J(I)V

    iget-object p1, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {v1, p1}, Lcom/daaw/c01$b;->a(Lcom/daaw/rv0;)V

    iget-object p1, p0, Lcom/daaw/c01;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/rv0;->I(I)V

    :goto_3
    return v0
.end method

.method public f(JJ)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/c01;->a:Lcom/daaw/ol1;

    invoke-virtual {p1}, Lcom/daaw/ol1;->g()V

    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/daaw/c01;->b:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Lcom/daaw/c01;->b:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/c01$b;

    invoke-virtual {p2}, Lcom/daaw/c01$b;->d()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/c01;->g:Lcom/daaw/d00;

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    return-void
.end method
