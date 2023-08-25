.class public Lcom/daaw/a7;
.super Lcom/daaw/z6;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/a7$a;
    }
.end annotation


# instance fields
.field public j:[Lcom/daaw/qc0;

.field public k:[Lcom/daaw/le0;

.field public l:I


# direct methods
.method public constructor <init>([Lcom/daaw/le0;Z)V
    .locals 1

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, p1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/a7;->l([Lcom/daaw/le0;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/z6;->g:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    array-length v4, v3

    if-ge v0, v4, :cond_1

    aget-object v4, v3, v0

    if-eqz v4, :cond_0

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/daaw/le0;->a()V

    :cond_0
    iget-object v3, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    aput-object v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/a7;->j:[Lcom/daaw/qc0;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    aget-object v0, v0, v2

    invoke-interface {v0}, Lcom/daaw/qc0;->a()V

    :cond_2
    iget-object v0, p0, Lcom/daaw/a7;->j:[Lcom/daaw/qc0;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public c(F)Lcom/daaw/qc0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    array-length v1, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int p1, v1

    array-length v0, v0

    rem-int/2addr p1, v0

    iget v0, p0, Lcom/daaw/a7;->l:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/a7;->j:[Lcom/daaw/qc0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public g()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    array-length v0, v0

    return v0
.end method

.method public j(I)Lcom/daaw/le0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public k(ILcom/daaw/le0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    aput-object p2, v0, p1

    invoke-virtual {p0, p1}, Lcom/daaw/a7;->m(I)V

    return-void
.end method

.method public final l([Lcom/daaw/le0;)V
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/a7;->l:I

    iput-object p1, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    array-length v0, p1

    new-array v0, v0, [Lcom/daaw/qc0;

    iput-object v0, p0, Lcom/daaw/a7;->j:[Lcom/daaw/qc0;

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iput v0, p0, Lcom/daaw/a7;->l:I

    :cond_0
    iget-object v1, p0, Lcom/daaw/a7;->j:[Lcom/daaw/qc0;

    new-instance v2, Lcom/daaw/a7$a;

    invoke-direct {v2, p0, v0}, Lcom/daaw/a7$a;-><init>(Lcom/daaw/a7;I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7;->k:[Lcom/daaw/le0;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/a7;->l:I

    return-void
.end method
