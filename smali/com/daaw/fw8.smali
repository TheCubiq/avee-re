.class public final Lcom/daaw/fw8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:[Lcom/daaw/x98;

.field public final c:[Lcom/daaw/tv8;

.field public final d:Lcom/daaw/ni4;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Lcom/daaw/x98;[Lcom/daaw/tv8;Lcom/daaw/ni4;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    invoke-virtual {p2}, [Lcom/daaw/tv8;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lcom/daaw/tv8;

    iput-object p2, p0, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    iput-object p3, p0, Lcom/daaw/fw8;->d:Lcom/daaw/ni4;

    iput-object p4, p0, Lcom/daaw/fw8;->e:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lcom/daaw/fw8;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fw8;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object v1, v1, p2

    iget-object v2, p1, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    aget-object v1, v1, p2

    iget-object p1, p1, Lcom/daaw/fw8;->c:[Lcom/daaw/tv8;

    aget-object p1, p1, p2

    invoke-static {v1, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final b(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fw8;->b:[Lcom/daaw/x98;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
