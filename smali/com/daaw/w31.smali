.class public Lcom/daaw/w31;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:[Lcom/daaw/le0;

.field public c:Lcom/daaw/qr1;

.field public d:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/daaw/qc0;

.field public f:I

.field public g:[Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lcom/daaw/le0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v3, v1, v2

    iput-object v1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/w31;->g:[Z

    invoke-virtual {p0}, Lcom/daaw/w31;->h()V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/qc0;",
            "Lcom/daaw/qr1;",
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/qc0;",
            "Lcom/daaw/qr1;",
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lcom/daaw/le0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v4, 0x1

    aput-object v3, v1, v4

    iput-object v1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/w31;->g:[Z

    iput p1, p0, Lcom/daaw/w31;->a:I

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/daaw/qc0;->d()Lcom/daaw/le0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    aput-object v3, p1, v4

    iput-object p3, p0, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    iput-object p4, p0, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    iput p5, p0, Lcom/daaw/w31;->f:I

    iget-object p1, p0, Lcom/daaw/w31;->g:[Z

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/daaw/qc0;->g()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    aput-boolean p3, p1, v2

    iget-object p1, p0, Lcom/daaw/w31;->g:[Z

    aget-boolean p3, p1, v2

    aput-boolean p3, p1, v4

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p2, Lcom/daaw/z6;->i:Lcom/daaw/qc0;

    :goto_2
    iput-object p2, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/daaw/qc0;",
            "Lcom/daaw/qr1;",
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    return-void
.end method

.method public constructor <init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/daaw/qc0;",
            "Lcom/daaw/qr1;",
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lcom/daaw/le0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v4, 0x1

    aput-object v3, v1, v4

    iput-object v1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/w31;->g:[Z

    iput p1, p0, Lcom/daaw/w31;->a:I

    aget-object p1, p2, v2

    if-eqz p1, :cond_0

    aget-object p1, p2, v2

    invoke-interface {p1}, Lcom/daaw/qc0;->d()Lcom/daaw/le0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    aget-object v0, p2, v4

    if-eqz v0, :cond_1

    aget-object v0, p2, v4

    invoke-interface {v0}, Lcom/daaw/qc0;->d()Lcom/daaw/le0;

    move-result-object v3

    :cond_1
    aput-object v3, p1, v4

    iput-object p3, p0, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    iput-object p4, p0, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    iput p5, p0, Lcom/daaw/w31;->f:I

    iget-object p1, p0, Lcom/daaw/w31;->g:[Z

    aget-object p3, p2, v2

    if-eqz p3, :cond_2

    aget-object p3, p2, v2

    invoke-interface {p3}, Lcom/daaw/qc0;->g()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    aput-boolean p3, p1, v2

    iget-object p1, p0, Lcom/daaw/w31;->g:[Z

    aget-object p3, p2, v4

    if-eqz p3, :cond_3

    aget-object p3, p2, v4

    invoke-interface {p3}, Lcom/daaw/qc0;->g()Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    goto :goto_2

    :cond_3
    const/4 p3, 0x0

    :goto_2
    aput-boolean p3, p1, v4

    aget-object p1, p2, v2

    if-eqz p1, :cond_4

    aget-object p1, p2, v2

    goto :goto_3

    :cond_4
    sget-object p1, Lcom/daaw/z6;->i:Lcom/daaw/qc0;

    :goto_3
    iput-object p1, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public a(Lcom/daaw/w31;)V
    .locals 4

    iget v0, p1, Lcom/daaw/w31;->a:I

    iput v0, p0, Lcom/daaw/w31;->a:I

    iget-object v0, p1, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    iput-object v0, p0, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    iget-object v0, p1, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    iput-object v0, p0, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    iget-object v3, p1, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    aget-object v3, v3, v1

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget v1, p1, Lcom/daaw/w31;->f:I

    iput v1, p0, Lcom/daaw/w31;->f:I

    :goto_1
    iget-object v1, p0, Lcom/daaw/w31;->g:[Z

    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p1, Lcom/daaw/w31;->g:[Z

    aget-boolean v2, v2, v0

    aput-boolean v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p1, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    iput-object p1, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    return-void
.end method

.method public b(Lcom/daaw/w31;)Z
    .locals 4

    iget v0, p1, Lcom/daaw/w31;->a:I

    iget v1, p0, Lcom/daaw/w31;->a:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget v0, p1, Lcom/daaw/w31;->f:I

    iget v1, p0, Lcom/daaw/w31;->f:I

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    iget-object v0, p1, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    iget-object v1, p0, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    invoke-static {v0, v1}, Lcom/daaw/br1;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p1, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    iget-object v1, p0, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    invoke-static {v0, v1}, Lcom/daaw/br1;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    array-length v3, v1

    if-ge v0, v3, :cond_5

    aget-object v1, v1, v0

    iget-object v3, p1, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    aget-object v3, v3, v0

    invoke-static {v1, v3}, Lcom/daaw/br1;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public c(I)Lcom/daaw/le0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    array-length v0, v0

    return v0
.end method

.method public e(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->g:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public f()Lcom/daaw/qc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/daaw/w31;->f:I

    return v0
.end method

.method public h()V
    .locals 5

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    iput-object v0, p0, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/w31;->a:I

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/w31;->b:[Lcom/daaw/le0;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aput-object v0, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lcom/daaw/w31;->g:[Z

    array-length v3, v2

    if-ge v0, v3, :cond_1

    aput-boolean v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/daaw/z6;->i:Lcom/daaw/qc0;

    iput-object v0, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/w31;->f:I

    return-void
.end method

.method public i(F)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    invoke-interface {v0, p1}, Lcom/daaw/qc0;->e(F)F

    move-result p1

    return p1
.end method

.method public j(F)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    invoke-interface {v0, p1}, Lcom/daaw/qc0;->b(F)F

    move-result p1

    return p1
.end method

.method public k()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/w31;->e:Lcom/daaw/qc0;

    invoke-interface {v0}, Lcom/daaw/qc0;->f()F

    move-result v0

    return v0
.end method
