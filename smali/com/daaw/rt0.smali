.class public Lcom/daaw/rt0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final d:Lcom/daaw/e00;


# instance fields
.field public a:Lcom/daaw/d00;

.field public b:Lcom/daaw/rg1;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/rt0$a;

    invoke-direct {v0}, Lcom/daaw/rt0$a;-><init>()V

    sput-object v0, Lcom/daaw/rt0;->d:Lcom/daaw/e00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/daaw/rv0;)Lcom/daaw/rv0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/rt0;->e(Lcom/daaw/a00;)Z

    move-result p1
    :try_end_0
    .catch Lcom/daaw/tv0; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 4

    iget-object v0, p0, Lcom/daaw/rt0;->b:Lcom/daaw/rg1;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/rt0;->e(Lcom/daaw/a00;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Failed to determine bitstream type"

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/rt0;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/rt0;->a:Lcom/daaw/d00;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/rt0;->a:Lcom/daaw/d00;

    invoke-interface {v1}, Lcom/daaw/d00;->n()V

    iget-object v1, p0, Lcom/daaw/rt0;->b:Lcom/daaw/rg1;

    iget-object v3, p0, Lcom/daaw/rt0;->a:Lcom/daaw/d00;

    invoke-virtual {v1, v3, v0}, Lcom/daaw/rg1;->c(Lcom/daaw/d00;Lcom/daaw/sm1;)V

    iput-boolean v2, p0, Lcom/daaw/rt0;->c:Z

    :cond_2
    iget-object v0, p0, Lcom/daaw/rt0;->b:Lcom/daaw/rg1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/rg1;->f(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result p1

    return p1
.end method

.method public final e(Lcom/daaw/a00;)Z
    .locals 5

    new-instance v0, Lcom/daaw/tt0;

    invoke-direct {v0}, Lcom/daaw/tt0;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/tt0;->a(Lcom/daaw/a00;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/daaw/tt0;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lcom/daaw/tt0;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lcom/daaw/rv0;

    invoke-direct {v2, v0}, Lcom/daaw/rv0;-><init>(I)V

    iget-object v4, v2, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v4, v3, v0}, Lcom/daaw/a00;->k([BII)V

    invoke-static {v2}, Lcom/daaw/rt0;->b(Lcom/daaw/rv0;)Lcom/daaw/rv0;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/n20;->o(Lcom/daaw/rv0;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcom/daaw/n20;

    invoke-direct {p1}, Lcom/daaw/n20;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/daaw/rt0;->b:Lcom/daaw/rg1;

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lcom/daaw/rt0;->b(Lcom/daaw/rv0;)Lcom/daaw/rv0;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yv1;->p(Lcom/daaw/rv0;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/daaw/yv1;

    invoke-direct {p1}, Lcom/daaw/yv1;-><init>()V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lcom/daaw/rt0;->b(Lcom/daaw/rv0;)Lcom/daaw/rv0;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/xu0;->n(Lcom/daaw/rv0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/daaw/xu0;

    invoke-direct {p1}, Lcom/daaw/xu0;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method

.method public f(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rt0;->b:Lcom/daaw/rg1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/rg1;->k(JJ)V

    :cond_0
    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rt0;->a:Lcom/daaw/d00;

    return-void
.end method
