.class public Lcom/daaw/g10$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/g10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/zj$s;",
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
.method public a(Lcom/daaw/zj$s;Lcom/daaw/zj$s;)I
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/zj$s;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/daaw/zj$s;->d()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Lcom/daaw/g10;->a(JJ)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/zj$s;

    check-cast p2, Lcom/daaw/zj$s;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/g10$d;->a(Lcom/daaw/zj$s;Lcom/daaw/zj$s;)I

    move-result p1

    return p1
.end method
