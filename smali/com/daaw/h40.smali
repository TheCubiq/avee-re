.class public Lcom/daaw/h40;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/h40$a;,
        Lcom/daaw/h40$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:[Lcom/daaw/h40$a;

.field public d:[[Lcom/daaw/je0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/h40;->a:I

    iput v0, p0, Lcom/daaw/h40;->b:I

    new-array v0, v0, [Lcom/daaw/h40$a;

    iput-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const-class v1, Lcom/daaw/je0;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Lcom/daaw/je0;

    iput-object v0, p0, Lcom/daaw/h40;->d:[[Lcom/daaw/je0;

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/daaw/h40;->d(I)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static synthetic a(Lcom/daaw/h40;)[Lcom/daaw/h40$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    return-object p0
.end method


# virtual methods
.method public b([F)V
    .locals 4

    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/daaw/h40;->e(I)V

    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v0, v1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-lez v0, :cond_0

    iget-object v2, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    add-int/lit8 v3, v0, -0x1

    aget-object v3, v2, v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/h40$a;->a:[F

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public c(IIILcom/daaw/je0;)Lcom/daaw/je0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-eqz p4, :cond_0

    instance-of v0, p4, Lcom/daaw/h40$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/daaw/h40$b;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/daaw/h40$b;->a(Lcom/daaw/h40;III)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p4

    :cond_0
    new-instance p4, Lcom/daaw/h40$b;

    invoke-direct {p4, p0, p1, p2, p3}, Lcom/daaw/h40$b;-><init>(Lcom/daaw/h40;III)V

    return-object p4
.end method

.method public d(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v0, v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-array p1, p1, [Lcom/daaw/h40$a;

    iput-object p1, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    new-instance v2, Lcom/daaw/h40$a;

    invoke-direct {v2, p0}, Lcom/daaw/h40$a;-><init>(Lcom/daaw/h40;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/h40;->a:I

    iput p1, p0, Lcom/daaw/h40;->a:I

    iput p1, p0, Lcom/daaw/h40;->b:I

    invoke-virtual {p0, v0}, Lcom/daaw/h40;->e(I)V

    iget-object v0, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v0, v0

    iget v1, p0, Lcom/daaw/h40;->a:I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    aput v1, v2, v3

    aput v0, v2, p1

    const-class p1, Lcom/daaw/je0;

    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Lcom/daaw/je0;

    iput-object p1, p0, Lcom/daaw/h40;->d:[[Lcom/daaw/je0;

    return-void
.end method

.method public e(I)V
    .locals 4

    iget v0, p0, Lcom/daaw/h40;->a:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/h40;->a:I

    mul-int/lit8 v0, p1, 0x64

    iput v0, p0, Lcom/daaw/h40;->b:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/h40;->c:[Lcom/daaw/h40$a;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    new-array v3, p1, [F

    iput-object v3, v2, Lcom/daaw/h40$a;->a:[F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length v1, v2

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    aput p1, v2, v3

    aput v1, v2, v0

    const-class p1, Lcom/daaw/je0;

    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Lcom/daaw/je0;

    iput-object p1, p0, Lcom/daaw/h40;->d:[[Lcom/daaw/je0;

    return-void
.end method
