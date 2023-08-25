.class public Lcom/daaw/y60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/y60$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0<",
        "Lcom/daaw/r60;",
        "Lcom/daaw/r60;",
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
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, Lcom/daaw/r60;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/y60;->b(Lcom/daaw/r60;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/r60;II)Lcom/daaw/ip;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/r60;",
            "II)",
            "Lcom/daaw/ip<",
            "Lcom/daaw/r60;",
            ">;"
        }
    .end annotation

    new-instance p2, Lcom/daaw/y60$a;

    invoke-direct {p2, p1}, Lcom/daaw/y60$a;-><init>(Lcom/daaw/r60;)V

    return-object p2
.end method
