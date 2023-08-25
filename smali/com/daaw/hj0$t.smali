.class public Lcom/daaw/hj0$t;
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

    iput-object p1, p0, Lcom/daaw/hj0$t;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/be0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hj0$t;->b(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/be0;)V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/be0;)V
    .locals 1
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

    iget-object v0, p0, Lcom/daaw/hj0$t;->a:Lcom/daaw/hj0;

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/hj0;->o(Lcom/daaw/hj0;Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/be0;)V

    return-void
.end method
