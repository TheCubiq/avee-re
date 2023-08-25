.class public final Lcom/daaw/t20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final p:Lcom/daaw/e00;

.field public static final q:I


# instance fields
.field public final a:Lcom/daaw/rv0;

.field public final b:Lcom/daaw/rv0;

.field public final c:Lcom/daaw/rv0;

.field public final d:Lcom/daaw/rv0;

.field public final e:Lcom/daaw/j91;

.field public f:Lcom/daaw/d00;

.field public g:I

.field public h:J

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:Z

.field public n:Lcom/daaw/p7;

.field public o:Lcom/daaw/ss1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t20$a;

    invoke-direct {v0}, Lcom/daaw/t20$a;-><init>()V

    sput-object v0, Lcom/daaw/t20;->p:Lcom/daaw/e00;

    const-string v0, "FLV"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/t20;->q:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/rv0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/rv0;

    invoke-direct {v0}, Lcom/daaw/rv0;-><init>()V

    iput-object v0, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/j91;

    invoke-direct {v0}, Lcom/daaw/j91;-><init>()V

    iput-object v0, p0, Lcom/daaw/t20;->e:Lcom/daaw/j91;

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/t20;->g:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/t20;->h:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/t20;->m:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    new-instance v3, Lcom/daaw/da1$b;

    invoke-direct {v3, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {v0, v3}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/t20;->m:Z

    :cond_0
    iget-wide v3, p0, Lcom/daaw/t20;->h:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/t20;->e:Lcom/daaw/j91;

    invoke-virtual {v0}, Lcom/daaw/j91;->d()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/t20;->l:J

    neg-long v0, v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    iput-wide v0, p0, Lcom/daaw/t20;->h:J

    :cond_2
    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->A()I

    move-result v0

    sget v2, Lcom/daaw/t20;->q:I

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v2, 0x2

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    invoke-interface {p1, v0}, Lcom/daaw/a00;->g(I)V

    iget-object v0, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object p1, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object p1, p0, Lcom/daaw/t20;->a:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 2

    :cond_0
    :goto_0
    iget p2, p0, Lcom/daaw/t20;->g:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/t20;->h(Lcom/daaw/a00;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/t20;->j(Lcom/daaw/a00;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/t20;->k(Lcom/daaw/a00;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/t20;->g(Lcom/daaw/a00;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1
.end method

.method public final e(Lcom/daaw/a00;)Lcom/daaw/rv0;
    .locals 4

    iget v0, p0, Lcom/daaw/t20;->k:I

    iget-object v1, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    invoke-virtual {v1}, Lcom/daaw/rv0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iget v3, p0, Lcom/daaw/t20;->k:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rv0;->H([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    invoke-virtual {v0, v2}, Lcom/daaw/rv0;->J(I)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    iget v1, p0, Lcom/daaw/t20;->k:I

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->I(I)V

    iget-object v0, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    iget v1, p0, Lcom/daaw/t20;->k:I

    invoke-interface {p1, v0, v2, v1}, Lcom/daaw/a00;->f([BII)V

    iget-object p1, p0, Lcom/daaw/t20;->d:Lcom/daaw/rv0;

    return-object p1
.end method

.method public f(JJ)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/t20;->g:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/t20;->h:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/t20;->i:I

    return-void
.end method

.method public final g(Lcom/daaw/a00;)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object p1, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->K(I)V

    iget-object p1, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    and-int/lit8 v4, p1, 0x4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    and-int/2addr p1, v3

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Lcom/daaw/t20;->n:Lcom/daaw/p7;

    if-nez p1, :cond_3

    new-instance p1, Lcom/daaw/p7;

    iget-object v4, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    const/16 v5, 0x8

    invoke-interface {v4, v5, v3}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v4

    invoke-direct {p1, v4}, Lcom/daaw/p7;-><init>(Lcom/daaw/sm1;)V

    iput-object p1, p0, Lcom/daaw/t20;->n:Lcom/daaw/p7;

    :cond_3
    const/4 p1, 0x2

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/t20;->o:Lcom/daaw/ss1;

    if-nez v1, :cond_4

    new-instance v1, Lcom/daaw/ss1;

    iget-object v4, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    invoke-interface {v4, v2, p1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/daaw/ss1;-><init>(Lcom/daaw/sm1;)V

    iput-object v1, p0, Lcom/daaw/t20;->o:Lcom/daaw/ss1;

    :cond_4
    iget-object v1, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    invoke-interface {v1}, Lcom/daaw/d00;->n()V

    iget-object v1, p0, Lcom/daaw/t20;->b:Lcom/daaw/rv0;

    invoke-virtual {v1}, Lcom/daaw/rv0;->i()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/t20;->i:I

    iput p1, p0, Lcom/daaw/t20;->g:I

    return v3
.end method

.method public final h(Lcom/daaw/a00;)Z
    .locals 6

    iget v0, p0, Lcom/daaw/t20;->j:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/t20;->n:Lcom/daaw/p7;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/t20;->b()V

    iget-object v0, p0, Lcom/daaw/t20;->n:Lcom/daaw/p7;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/t20;->e(Lcom/daaw/a00;)Lcom/daaw/rv0;

    move-result-object p1

    iget-wide v2, p0, Lcom/daaw/t20;->h:J

    iget-wide v4, p0, Lcom/daaw/t20;->l:J

    add-long/2addr v2, v4

    invoke-virtual {v0, p1, v2, v3}, Lcom/daaw/nj1;->a(Lcom/daaw/rv0;J)V

    goto :goto_1

    :cond_0
    const/16 v2, 0x9

    if-ne v0, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/t20;->o:Lcom/daaw/ss1;

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/t20;->b()V

    iget-object v0, p0, Lcom/daaw/t20;->o:Lcom/daaw/ss1;

    goto :goto_0

    :cond_1
    const/16 v2, 0x12

    if-ne v0, v2, :cond_2

    iget-boolean v0, p0, Lcom/daaw/t20;->m:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/t20;->e:Lcom/daaw/j91;

    invoke-virtual {p0, p1}, Lcom/daaw/t20;->e(Lcom/daaw/a00;)Lcom/daaw/rv0;

    move-result-object p1

    iget-wide v2, p0, Lcom/daaw/t20;->l:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/daaw/nj1;->a(Lcom/daaw/rv0;J)V

    iget-object p1, p0, Lcom/daaw/t20;->e:Lcom/daaw/j91;

    invoke-virtual {p1}, Lcom/daaw/j91;->d()J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v2, v4

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    new-instance v0, Lcom/daaw/da1$b;

    invoke-direct {v0, v2, v3}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    iput-boolean v1, p0, Lcom/daaw/t20;->m:Z

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/daaw/t20;->k:I

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    const/4 v1, 0x0

    :cond_3
    :goto_1
    const/4 p1, 0x4

    iput p1, p0, Lcom/daaw/t20;->i:I

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/t20;->g:I

    return v1
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t20;->f:Lcom/daaw/d00;

    return-void
.end method

.method public final j(Lcom/daaw/a00;)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    iput p1, p0, Lcom/daaw/t20;->j:I

    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->A()I

    move-result p1

    iput p1, p0, Lcom/daaw/t20;->k:I

    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->A()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/daaw/t20;->l:J

    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    iget-wide v4, p0, Lcom/daaw/t20;->l:J

    or-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    iput-wide v0, p0, Lcom/daaw/t20;->l:J

    iget-object p1, p0, Lcom/daaw/t20;->c:Lcom/daaw/rv0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->K(I)V

    const/4 p1, 0x4

    iput p1, p0, Lcom/daaw/t20;->g:I

    return v3
.end method

.method public final k(Lcom/daaw/a00;)V
    .locals 1

    iget v0, p0, Lcom/daaw/t20;->i:I

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/t20;->i:I

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/t20;->g:I

    return-void
.end method
