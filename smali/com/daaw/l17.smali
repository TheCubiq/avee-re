.class public final Lcom/daaw/l17;
.super Lcom/daaw/n17;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/n17;-><init>(Lcom/daaw/l17;)V

    return-void
.end method

.method public static final j(I)Lcom/daaw/n17;
    .locals 0

    if-gez p0, :cond_0

    invoke-static {}, Lcom/daaw/n17;->f()Lcom/daaw/n17;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    invoke-static {}, Lcom/daaw/n17;->g()Lcom/daaw/n17;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/n17;->h()Lcom/daaw/n17;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(II)Lcom/daaw/n17;
    .locals 0

    if-ge p1, p2, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    if-le p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/l17;->j(I)Lcom/daaw/n17;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;
    .locals 0

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Lcom/daaw/l17;->j(I)Lcom/daaw/n17;

    move-result-object p1

    return-object p1
.end method

.method public final d(ZZ)Lcom/daaw/n17;
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/h47;->a(ZZ)I

    move-result p1

    invoke-static {p1}, Lcom/daaw/l17;->j(I)Lcom/daaw/n17;

    move-result-object p1

    return-object p1
.end method

.method public final e(ZZ)Lcom/daaw/n17;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/daaw/h47;->a(ZZ)I

    move-result p1

    invoke-static {p1}, Lcom/daaw/l17;->j(I)Lcom/daaw/n17;

    move-result-object p1

    return-object p1
.end method
