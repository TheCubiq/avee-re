.class public final Lcom/daaw/av8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(Lcom/daaw/f92;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Lcom/daaw/f92;->d:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput-boolean v0, p0, Lcom/daaw/av8;->p:Z

    invoke-static {p2, v1}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/av8;->q:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/av8;)I
    .locals 3

    invoke-static {}, Lcom/daaw/n17;->i()Lcom/daaw/n17;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/av8;->q:Z

    iget-boolean v2, p1, Lcom/daaw/av8;->q:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/av8;->p:Z

    iget-boolean p1, p1, Lcom/daaw/av8;->p:Z

    invoke-virtual {v0, v1, p1}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/n17;->a()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/av8;

    invoke-virtual {p0, p1}, Lcom/daaw/av8;->a(Lcom/daaw/av8;)I

    move-result p1

    return p1
.end method
