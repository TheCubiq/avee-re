.class public abstract Lcom/daaw/nl1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nl1$b;,
        Lcom/daaw/nl1$c;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/nl1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nl1$a;

    invoke-direct {v0}, Lcom/daaw/nl1$a;-><init>()V

    sput-object v0, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nl1;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract b(Ljava/lang/Object;)I
.end method

.method public c(Z)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nl1;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/nl1;->n()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    return p1
.end method

.method public final d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object p2

    iget p2, p2, Lcom/daaw/nl1$b;->c:I

    invoke-virtual {p0, p2, p3}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v0

    iget v0, v0, Lcom/daaw/nl1$c;->g:I

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, p2, p4, p5}, Lcom/daaw/nl1;->e(IIZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    invoke-virtual {p0, p1, p3}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object p1

    iget p1, p1, Lcom/daaw/nl1$c;->f:I

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public e(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p3}, Lcom/daaw/nl1;->c(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Lcom/daaw/nl1;->a(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    add-int/2addr p1, v0

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    :cond_3
    invoke-virtual {p0, p3}, Lcom/daaw/nl1;->c(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    goto :goto_1

    :cond_4
    add-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public final f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;
.end method

.method public abstract h()I
.end method

.method public final i(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJ)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl1$c;",
            "Lcom/daaw/nl1$b;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/nl1;->j(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJJ)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl1$c;",
            "Lcom/daaw/nl1$b;",
            "IJJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/nl1;->n()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Lcom/daaw/s6;->c(III)I

    const/4 v5, 0x0

    move-object v2, p0

    move v3, p3

    move-object v4, p1

    move-wide v6, p6

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/nl1;->m(ILcom/daaw/nl1$c;ZJ)Lcom/daaw/nl1$c;

    const-wide p6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    invoke-virtual {p1}, Lcom/daaw/nl1$c;->b()J

    move-result-wide p4

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget p3, p1, Lcom/daaw/nl1$c;->f:I

    invoke-virtual {p1}, Lcom/daaw/nl1$c;->d()J

    move-result-wide v0

    add-long/2addr v0, p4

    :goto_0
    invoke-virtual {p0, p3, p2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/nl1$b;->i()J

    move-result-wide p4

    cmp-long v2, p4, p6

    if-eqz v2, :cond_1

    cmp-long v2, v0, p4

    if-ltz v2, :cond_1

    iget v2, p1, Lcom/daaw/nl1$c;->g:I

    if-ge p3, v2, :cond_1

    sub-long/2addr v0, p4

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/nl1;->l(ILcom/daaw/nl1$c;Z)Lcom/daaw/nl1$c;

    move-result-object p1

    return-object p1
.end method

.method public final l(ILcom/daaw/nl1$c;Z)Lcom/daaw/nl1$c;
    .locals 6

    const-wide/16 v4, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/nl1;->m(ILcom/daaw/nl1$c;ZJ)Lcom/daaw/nl1$c;

    move-result-object p1

    return-object p1
.end method

.method public abstract m(ILcom/daaw/nl1$c;ZJ)Lcom/daaw/nl1$c;
.end method

.method public abstract n()I
.end method

.method public final o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/nl1;->n()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)Z
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/nl1;->d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
