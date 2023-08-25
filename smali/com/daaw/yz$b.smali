.class public final Lcom/daaw/yz$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/u20$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/u20$b<",
        "Lcom/daaw/me1<",
        "Lcom/daaw/y;",
        ">;",
        "Lcom/daaw/y;",
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
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/me1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yz$b;->c(Lcom/daaw/me1;I)Lcom/daaw/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/me1;

    invoke-virtual {p0, p1}, Lcom/daaw/yz$b;->d(Lcom/daaw/me1;)I

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/me1;I)Lcom/daaw/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/me1<",
            "Lcom/daaw/y;",
            ">;I)",
            "Lcom/daaw/y;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/daaw/me1;->n(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/y;

    return-object p1
.end method

.method public d(Lcom/daaw/me1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/me1<",
            "Lcom/daaw/y;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/me1;->m()I

    move-result p1

    return p1
.end method
