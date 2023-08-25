.class public final Lcom/daaw/ev;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sm1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JIIILcom/daaw/sm1$a;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/daaw/a00;IZ)I
    .locals 0

    invoke-interface {p1, p2}, Lcom/daaw/a00;->a(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return p1
.end method

.method public c(Lcom/daaw/rv0;I)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/daaw/rv0;->K(I)V

    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/Format;)V
    .locals 0

    return-void
.end method
