.class public Lcom/daaw/o01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ce0;


# instance fields
.field public a:I

.field public b:Lcom/daaw/ce0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/o01;->b:Lcom/daaw/ce0$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/o01;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/o01;->a:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/o01;->a:I

    return-void
.end method

.method public c(Ljava/util/List;IIZI)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZI)Z"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/o01;->a:I

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/l01;->f(ILjava/util/List;IIZ)I

    move-result p2

    iput p2, p0, Lcom/daaw/o01;->a:I

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-gez p2, :cond_0

    invoke-static {p2, p1, p3}, Lcom/daaw/l01;->i(ILjava/util/List;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lcom/daaw/o01;->a:I

    if-gez p2, :cond_1

    iput p4, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    :cond_1
    iget p2, p0, Lcom/daaw/o01;->a:I

    if-lt p2, p5, :cond_2

    sub-int/2addr p5, v0

    iput p5, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    :cond_2
    iget-object p2, p0, Lcom/daaw/o01;->b:Lcom/daaw/ce0$a;

    if-eqz p2, :cond_3

    invoke-interface {p2, p0, v0, p1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_3
    return p1
.end method

.method public d(I)I
    .locals 0

    return p1
.end method

.method public e(I)Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/o01;->h(Z)I

    move-result v1

    iput v1, p0, Lcom/daaw/o01;->a:I

    if-lt v1, p1, :cond_0

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/o01;->a:I

    :cond_0
    return v0
.end method

.method public f(II)I
    .locals 0

    return p1
.end method

.method public g()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/o01;->m(Z)I

    move-result v1

    iput v1, p0, Lcom/daaw/o01;->a:I

    if-gez v1, :cond_0

    iput v0, p0, Lcom/daaw/o01;->a:I

    :cond_0
    return-void
.end method

.method public h(Z)I
    .locals 0

    iget p1, p0, Lcom/daaw/o01;->a:I

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public i(Z)I
    .locals 0

    iget p1, p0, Lcom/daaw/o01;->a:I

    return p1
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/o01;->a:I

    return-void
.end method

.method public k(IIIZI)Z
    .locals 1

    iget v0, p0, Lcom/daaw/o01;->a:I

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/l01;->h(IIIIZ)I

    move-result p2

    iput p2, p0, Lcom/daaw/o01;->a:I

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-gez p2, :cond_0

    sub-int/2addr p1, p4

    iput p1, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lcom/daaw/o01;->a:I

    if-gez p2, :cond_1

    iput p3, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    :cond_1
    iget p2, p0, Lcom/daaw/o01;->a:I

    if-lt p2, p5, :cond_2

    sub-int/2addr p5, p4

    iput p5, p0, Lcom/daaw/o01;->a:I

    const/4 p1, 0x1

    :cond_2
    iget-object p2, p0, Lcom/daaw/o01;->b:Lcom/daaw/ce0$a;

    if-eqz p2, :cond_3

    invoke-interface {p2, p0, p4, p1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_3
    return p1
.end method

.method public l(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/o01;->a:I

    return-void
.end method

.method public m(Z)I
    .locals 0

    iget p1, p0, Lcom/daaw/o01;->a:I

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public n(ILcom/daaw/ce0$a;)V
    .locals 1

    iput-object p2, p0, Lcom/daaw/o01;->b:Lcom/daaw/ce0$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/o01;->a:I

    invoke-virtual {p0, p1}, Lcom/daaw/o01;->b(I)V

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    invoke-interface {p2, p0, v0, p1}, Lcom/daaw/ce0$a;->a(Lcom/daaw/ce0;ZZ)V

    :cond_0
    return-void
.end method
