.class public final Lcom/daaw/s1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final e:Lcom/daaw/e00;

.field public static final f:I


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/t1;

.field public final c:Lcom/daaw/rv0;

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/s1$a;

    invoke-direct {v0}, Lcom/daaw/s1$a;-><init>()V

    sput-object v0, Lcom/daaw/s1;->e:Lcom/daaw/e00;

    const-string v0, "ID3"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/s1;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/daaw/s1;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/s1;->a:J

    new-instance p1, Lcom/daaw/t1;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lcom/daaw/t1;-><init>(Z)V

    iput-object p1, p0, Lcom/daaw/s1;->b:Lcom/daaw/t1;

    new-instance p1, Lcom/daaw/rv0;

    const/16 p2, 0xc8

    invoke-direct {p1, p2}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/s1;->c:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 10

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    new-instance v2, Lcom/daaw/qv0;

    iget-object v3, v0, Lcom/daaw/rv0;->a:[B

    invoke-direct {v2, v3}, Lcom/daaw/qv0;-><init>([B)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-object v5, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v5, v3, v1}, Lcom/daaw/a00;->k([BII)V

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v0}, Lcom/daaw/rv0;->A()I

    move-result v5

    sget v6, Lcom/daaw/s1;->f:I

    if-eq v5, v6, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    invoke-interface {p1, v4}, Lcom/daaw/a00;->g(I)V

    move v5, v4

    :goto_1
    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_2
    iget-object v7, v0, Lcom/daaw/rv0;->a:[B

    const/4 v8, 0x2

    invoke-interface {p1, v7, v3, v8}, Lcom/daaw/a00;->k([BII)V

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result v7

    const v8, 0xfff6

    and-int/2addr v7, v8

    const v8, 0xfff0

    if-eq v7, v8, :cond_1

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    add-int/lit8 v5, v5, 0x1

    sub-int v1, v5, v4

    const/16 v6, 0x2000

    if-lt v1, v6, :cond_0

    return v3

    :cond_0
    invoke-interface {p1, v5}, Lcom/daaw/a00;->g(I)V

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    add-int/2addr v1, v7

    const/4 v8, 0x4

    if-lt v1, v8, :cond_2

    const/16 v9, 0xbc

    if-le v6, v9, :cond_2

    return v7

    :cond_2
    iget-object v7, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v7, v3, v8}, Lcom/daaw/a00;->k([BII)V

    const/16 v7, 0xe

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->m(I)V

    const/16 v7, 0xd

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v7

    const/4 v8, 0x6

    if-gt v7, v8, :cond_3

    return v3

    :cond_3
    add-int/lit8 v8, v7, -0x6

    invoke-interface {p1, v8}, Lcom/daaw/a00;->g(I)V

    add-int/2addr v6, v7

    goto :goto_2

    :cond_4
    const/4 v5, 0x3

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {v0}, Lcom/daaw/rv0;->w()I

    move-result v5

    add-int/lit8 v6, v5, 0xa

    add-int/2addr v4, v6

    invoke-interface {p1, v5}, Lcom/daaw/a00;->g(I)V

    goto :goto_0
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 3

    iget-object p2, p0, Lcom/daaw/s1;->c:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    const/4 v0, 0x0

    const/16 v1, 0xc8

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/a00;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lcom/daaw/s1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object p2, p0, Lcom/daaw/s1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, p1}, Lcom/daaw/rv0;->I(I)V

    iget-boolean p1, p0, Lcom/daaw/s1;->d:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/s1;->b:Lcom/daaw/t1;

    iget-wide v1, p0, Lcom/daaw/s1;->a:J

    const/4 p2, 0x1

    invoke-virtual {p1, v1, v2, p2}, Lcom/daaw/t1;->e(JZ)V

    iput-boolean p2, p0, Lcom/daaw/s1;->d:Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/s1;->b:Lcom/daaw/t1;

    iget-object p2, p0, Lcom/daaw/s1;->c:Lcom/daaw/rv0;

    invoke-virtual {p1, p2}, Lcom/daaw/t1;->a(Lcom/daaw/rv0;)V

    return v0
.end method

.method public f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/s1;->d:Z

    iget-object p1, p0, Lcom/daaw/s1;->b:Lcom/daaw/t1;

    invoke-virtual {p1}, Lcom/daaw/t1;->b()V

    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/s1;->b:Lcom/daaw/t1;

    new-instance v1, Lcom/daaw/eo1$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/daaw/eo1$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/t1;->d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    return-void
.end method
