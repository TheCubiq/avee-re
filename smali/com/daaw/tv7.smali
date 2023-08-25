.class public abstract Lcom/daaw/tv7;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)I
.end method

.method public abstract b(Ljava/lang/Object;)I
.end method

.method public abstract c(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract f()Ljava/lang/Object;
.end method

.method public abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract h(Ljava/lang/Object;II)V
.end method

.method public abstract i(Ljava/lang/Object;IJ)V
.end method

.method public abstract j(Ljava/lang/Object;ILjava/lang/Object;)V
.end method

.method public abstract k(Ljava/lang/Object;ILcom/daaw/yq7;)V
.end method

.method public abstract l(Ljava/lang/Object;IJ)V
.end method

.method public abstract m(Ljava/lang/Object;)V
.end method

.method public abstract n(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract o(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public final p(Ljava/lang/Object;Lcom/daaw/iu7;)Z
    .locals 6

    invoke-interface {p2}, Lcom/daaw/iu7;->zzd()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    invoke-interface {p2}, Lcom/daaw/iu7;->zzf()I

    move-result p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/daaw/tv7;->h(Ljava/lang/Object;II)V

    return v2

    :cond_0
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/tv7;->f()Ljava/lang/Object;

    move-result-object v0

    shl-int/lit8 v4, v1, 0x3

    or-int/2addr v3, v4

    :cond_3
    invoke-interface {p2}, Lcom/daaw/iu7;->zzc()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    invoke-virtual {p0, v0, p2}, Lcom/daaw/tv7;->p(Ljava/lang/Object;Lcom/daaw/iu7;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_4
    invoke-interface {p2}, Lcom/daaw/iu7;->zzd()I

    move-result p2

    if-ne v3, p2, :cond_5

    invoke-virtual {p0, v0}, Lcom/daaw/tv7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/tv7;->j(Ljava/lang/Object;ILjava/lang/Object;)V

    return v2

    :cond_5
    invoke-static {}, Lcom/daaw/xs7;->b()Lcom/daaw/xs7;

    move-result-object p1

    throw p1

    :cond_6
    invoke-interface {p2}, Lcom/daaw/iu7;->zzp()Lcom/daaw/yq7;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/daaw/tv7;->k(Ljava/lang/Object;ILcom/daaw/yq7;)V

    return v2

    :cond_7
    invoke-interface {p2}, Lcom/daaw/iu7;->zzk()J

    move-result-wide v3

    invoke-virtual {p0, p1, v1, v3, v4}, Lcom/daaw/tv7;->i(Ljava/lang/Object;IJ)V

    return v2

    :cond_8
    invoke-interface {p2}, Lcom/daaw/iu7;->zzl()J

    move-result-wide v3

    invoke-virtual {p0, p1, v1, v3, v4}, Lcom/daaw/tv7;->l(Ljava/lang/Object;IJ)V

    return v2
.end method

.method public abstract q(Lcom/daaw/iu7;)Z
.end method

.method public abstract r(Ljava/lang/Object;Lcom/daaw/rr7;)V
.end method
