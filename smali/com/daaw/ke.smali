.class public final Lcom/daaw/ke;
.super Lcom/daaw/ln;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ln;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/ke;",
        ">;"
    }
.end annotation


# instance fields
.field public final D:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/daaw/ln;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZI)V

    iput p11, p0, Lcom/daaw/ke;->D:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ke;)I
    .locals 1

    iget p1, p1, Lcom/daaw/ke;->D:I

    iget v0, p0, Lcom/daaw/ke;->D:I

    if-ge p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/ke;

    invoke-virtual {p0, p1}, Lcom/daaw/ke;->a(Lcom/daaw/ke;)I

    move-result p1

    return p1
.end method
