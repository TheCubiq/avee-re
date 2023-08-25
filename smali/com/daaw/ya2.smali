.class public final Lcom/daaw/ya2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final d:Lcom/daaw/q09;


# instance fields
.field public a:Lcom/daaw/m09;

.field public b:Lcom/daaw/gb2;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/xa2;->b:Lcom/daaw/xa2;

    sput-object v0, Lcom/daaw/ya2;->d:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/ya2;->b(Lcom/daaw/k09;)Z

    move-result p1
    :try_end_0
    .catch Lcom/daaw/dl3; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/k09;)Z
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "streamReader"
        }
        result = true
    .end annotation

    new-instance v0, Lcom/daaw/ab2;

    invoke-direct {v0}, Lcom/daaw/ab2;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ab2;->b(Lcom/daaw/k09;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/daaw/ab2;->a:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lcom/daaw/ab2;->e:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lcom/daaw/ik5;

    invoke-direct {v2, v0}, Lcom/daaw/ik5;-><init>(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v4

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v4, v3, v0, v3}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v2, v3}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v2}, Lcom/daaw/ik5;->i()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    invoke-virtual {v2}, Lcom/daaw/ik5;->s()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    invoke-virtual {v2}, Lcom/daaw/ik5;->A()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    new-instance p1, Lcom/daaw/wa2;

    invoke-direct {p1}, Lcom/daaw/wa2;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/daaw/ya2;->b:Lcom/daaw/gb2;

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v3}, Lcom/daaw/ik5;->f(I)V

    :try_start_0
    invoke-static {v1, v2, v1}, Lcom/daaw/s42;->d(ILcom/daaw/ik5;Z)Z

    move-result p1
    :try_end_0
    .catch Lcom/daaw/dl3; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    new-instance p1, Lcom/daaw/ib2;

    invoke-direct {p1}, Lcom/daaw/ib2;-><init>()V

    goto :goto_0

    :catch_0
    nop

    :cond_2
    invoke-virtual {v2, v3}, Lcom/daaw/ik5;->f(I)V

    invoke-static {v2}, Lcom/daaw/cb2;->j(Lcom/daaw/ik5;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/daaw/cb2;

    invoke-direct {p1}, Lcom/daaw/cb2;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ya2;->a:Lcom/daaw/m09;

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 4

    iget-object v0, p0, Lcom/daaw/ya2;->a:Lcom/daaw/m09;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ya2;->b:Lcom/daaw/gb2;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/ya2;->b(Lcom/daaw/k09;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Failed to determine bitstream type"

    invoke-static {p2, p1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/ya2;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ya2;->a:Lcom/daaw/m09;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ya2;->a:Lcom/daaw/m09;

    invoke-interface {v1}, Lcom/daaw/m09;->zzC()V

    iget-object v1, p0, Lcom/daaw/ya2;->b:Lcom/daaw/gb2;

    iget-object v3, p0, Lcom/daaw/ya2;->a:Lcom/daaw/m09;

    invoke-virtual {v1, v3, v0}, Lcom/daaw/gb2;->g(Lcom/daaw/m09;Lcom/daaw/m42;)V

    iput-boolean v2, p0, Lcom/daaw/ya2;->c:Z

    :cond_2
    iget-object v0, p0, Lcom/daaw/ya2;->b:Lcom/daaw/gb2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/gb2;->d(Lcom/daaw/k09;Lcom/daaw/f42;)I

    move-result p1

    return p1
.end method

.method public final f(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ya2;->b:Lcom/daaw/gb2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/gb2;->i(JJ)V

    :cond_0
    return-void
.end method
