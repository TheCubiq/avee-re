.class public Lcom/daaw/hj0$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Ljava/util/List<",
        "Lcom/daaw/tx0;",
        ">;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/be0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$r;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/be0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hj0$r;->b(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/be0;)V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/be0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/be0;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, -0x1

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/daaw/l01;->E(Ljava/util/List;IILcom/daaw/be0;)V

    :cond_0
    return-void
.end method
