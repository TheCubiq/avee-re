.class public final Lcom/daaw/yd1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/yd1$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/yd1$c;Lcom/daaw/yd1$c;)I
    .locals 0

    iget p1, p1, Lcom/daaw/yd1$c;->a:I

    iget p2, p2, Lcom/daaw/yd1$c;->a:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/yd1$c;

    check-cast p2, Lcom/daaw/yd1$c;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yd1$a;->a(Lcom/daaw/yd1$c;Lcom/daaw/yd1$c;)I

    move-result p1

    return p1
.end method
