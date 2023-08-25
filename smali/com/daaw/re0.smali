.class public final Lcom/daaw/re0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/rv0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/a00;Lcom/daaw/qe0$b;)Lcom/google/android/exoplayer2/metadata/Metadata;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    iget-object v3, v3, Lcom/daaw/rv0;->a:[B

    const/16 v4, 0xa

    invoke-interface {p1, v3, v0, v4}, Lcom/daaw/a00;->k([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    invoke-virtual {v3, v0}, Lcom/daaw/rv0;->J(I)V

    iget-object v3, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    invoke-virtual {v3}, Lcom/daaw/rv0;->A()I

    move-result v3

    sget v5, Lcom/daaw/qe0;->c:I

    if-eq v3, v5, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    const/4 v5, 0x3

    invoke-virtual {v3, v5}, Lcom/daaw/rv0;->K(I)V

    iget-object v3, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    invoke-virtual {v3}, Lcom/daaw/rv0;->w()I

    move-result v3

    add-int/lit8 v5, v3, 0xa

    if-nez v1, :cond_1

    new-array v1, v5, [B

    iget-object v6, p0, Lcom/daaw/re0;->a:Lcom/daaw/rv0;

    iget-object v6, v6, Lcom/daaw/rv0;->a:[B

    invoke-static {v6, v0, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {p1, v1, v4, v3}, Lcom/daaw/a00;->k([BII)V

    new-instance v3, Lcom/daaw/qe0;

    invoke-direct {v3, p2}, Lcom/daaw/qe0;-><init>(Lcom/daaw/qe0$b;)V

    invoke-virtual {v3, v1, v5}, Lcom/daaw/qe0;->c([BI)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v3}, Lcom/daaw/a00;->g(I)V

    :goto_1
    add-int/2addr v2, v5

    goto :goto_0

    :catch_0
    :goto_2
    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    invoke-interface {p1, v2}, Lcom/daaw/a00;->g(I)V

    return-object v1
.end method
