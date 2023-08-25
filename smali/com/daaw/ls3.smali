.class public final Lcom/daaw/ls3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ny8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ny8;

    invoke-direct {v0}, Lcom/daaw/ny8;-><init>()V

    iput-object v0, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/ls3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    invoke-virtual {v0, p1}, Lcom/daaw/ny8;->a(I)Lcom/daaw/ny8;

    return-object p0
.end method

.method public final b(Lcom/daaw/lu3;)Lcom/daaw/ls3;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    invoke-static {p1}, Lcom/daaw/lu3;->a(Lcom/daaw/lu3;)Lcom/daaw/r32;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/r32;->b()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lcom/daaw/r32;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/daaw/ny8;->a(I)Lcom/daaw/ny8;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final varargs c([I)Lcom/daaw/ls3;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x15

    if-ge v1, v2, :cond_0

    aget v2, p1, v1

    invoke-virtual {v0, v2}, Lcom/daaw/ny8;->a(I)Lcom/daaw/ny8;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final d(IZ)Lcom/daaw/ls3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/ny8;->a(I)Lcom/daaw/ny8;

    :cond_0
    return-object p0
.end method

.method public final e()Lcom/daaw/lu3;
    .locals 3

    new-instance v0, Lcom/daaw/lu3;

    iget-object v1, p0, Lcom/daaw/ls3;->a:Lcom/daaw/ny8;

    invoke-virtual {v1}, Lcom/daaw/ny8;->b()Lcom/daaw/r32;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/lu3;-><init>(Lcom/daaw/r32;Lcom/daaw/nt3;)V

    return-object v0
.end method
