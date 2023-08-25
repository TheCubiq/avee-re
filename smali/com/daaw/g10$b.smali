.class public Lcom/daaw/g10$b;
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
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/zj$s;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/daaw/zj$s;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/zj$s;

    check-cast p2, Lcom/daaw/zj$s;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/g10$b;->a(Lcom/daaw/zj$s;Lcom/daaw/zj$s;)I

    move-result p1

    return p1
.end method
