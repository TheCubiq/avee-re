.class public Lcom/daaw/hj0$l;
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
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$l;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hj0$l;->b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p3, Lcom/daaw/j5;->V:I

    if-ne p1, p3, :cond_1

    iget-object p1, p0, Lcom/daaw/hj0$l;->a:Lcom/daaw/hj0;

    invoke-static {p1, p2}, Lcom/daaw/hj0;->k(Lcom/daaw/hj0;Ljava/lang/Integer;)Lcom/daaw/lo1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/daaw/hj0$l;->a:Lcom/daaw/hj0;

    invoke-static {p2, p1}, Lcom/daaw/hj0;->l(Lcom/daaw/hj0;Lcom/daaw/lo1;)Lcom/daaw/lo1;

    :cond_0
    iget-object p1, p0, Lcom/daaw/hj0$l;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->A()V

    iget-object p1, p0, Lcom/daaw/hj0$l;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->B()V

    :cond_1
    return-void
.end method
