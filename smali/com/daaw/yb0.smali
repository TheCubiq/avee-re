.class public Lcom/daaw/yb0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yb0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/lq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lq0<",
            "Lcom/daaw/o70;",
            "Lcom/daaw/o70;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/lq0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lq0<",
            "Lcom/daaw/o70;",
            "Lcom/daaw/o70;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yb0;->a:Lcom/daaw/lq0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, Lcom/daaw/o70;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yb0;->b(Lcom/daaw/o70;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/o70;II)Lcom/daaw/ip;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o70;",
            "II)",
            "Lcom/daaw/ip<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lcom/daaw/yb0;->a:Lcom/daaw/lq0;

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3, p3}, Lcom/daaw/lq0;->a(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/o70;

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/yb0;->a:Lcom/daaw/lq0;

    invoke-virtual {p2, p1, p3, p3, p1}, Lcom/daaw/lq0;->b(Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :cond_1
    :goto_0
    new-instance p2, Lcom/daaw/xb0;

    invoke-direct {p2, p1}, Lcom/daaw/xb0;-><init>(Lcom/daaw/o70;)V

    return-object p2
.end method
