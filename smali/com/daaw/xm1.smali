.class public final Lcom/daaw/xm1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:[Lcom/daaw/c41;

.field public final c:Lcom/daaw/um1;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Lcom/daaw/c41;[Lcom/google/android/exoplayer2/trackselection/c;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    new-instance v0, Lcom/daaw/um1;

    invoke-direct {v0, p2}, Lcom/daaw/um1;-><init>([Lcom/google/android/exoplayer2/trackselection/c;)V

    iput-object v0, p0, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    iput-object p3, p0, Lcom/daaw/xm1;->d:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lcom/daaw/xm1;->a:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/xm1;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p1, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    iget v1, v1, Lcom/daaw/um1;->a:I

    iget-object v2, p0, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    iget v2, v2, Lcom/daaw/um1;->a:I

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    iget v2, v2, Lcom/daaw/um1;->a:I

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, p1, v1}, Lcom/daaw/xm1;->b(Lcom/daaw/xm1;I)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v0
.end method

.method public b(Lcom/daaw/xm1;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object v1, v1, p2

    iget-object v2, p1, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v1, p2}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v1

    iget-object p1, p1, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {p1, p2}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public c(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
