.class public Lcom/daaw/n30$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n30;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/yj;",
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/n30;


# direct methods
.method public constructor <init>(Lcom/daaw/n30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n30$a;->a:Lcom/daaw/n30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/n30$a;->b(Lcom/daaw/yj;)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/yj;)Lcom/daaw/er0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            ")",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation

    sget-object p1, Lcom/daaw/dj0;->v:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/er0;

    invoke-direct {v0}, Lcom/daaw/er0;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/er0;

    return-object p1
.end method
