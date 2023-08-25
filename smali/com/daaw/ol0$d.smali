.class public Lcom/daaw/ol0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ol0;-><init>(Lcom/daaw/az0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        "Lcom/daaw/tx0$b;",
        "Lcom/daaw/hx0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ol0;


# direct methods
.method public constructor <init>(Lcom/daaw/ol0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ol0$d;->a:Lcom/daaw/ol0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/tx0;

    check-cast p2, Lcom/daaw/vd0;

    check-cast p3, Lcom/daaw/tx0$b;

    check-cast p4, Lcom/daaw/hx0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/ol0$d;->b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V

    return-void
.end method

.method public b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/ol0$d;->a:Lcom/daaw/ol0;

    iget-object p2, p2, Lcom/daaw/ol0;->c:Lcom/daaw/tx0;

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Lcom/daaw/tx0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    iget-object p2, p0, Lcom/daaw/ol0$d;->a:Lcom/daaw/ol0;

    iput-object p1, p2, Lcom/daaw/ol0;->c:Lcom/daaw/tx0;

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lcom/daaw/ol0;->h(Lcom/daaw/ol0;Z)Z

    iget-object p2, p0, Lcom/daaw/ol0$d;->a:Lcom/daaw/ol0;

    invoke-static {p2, p1}, Lcom/daaw/ol0;->j(Lcom/daaw/ol0;Z)Z

    iget-object p1, p0, Lcom/daaw/ol0$d;->a:Lcom/daaw/ol0;

    invoke-static {p1}, Lcom/daaw/ol0;->a(Lcom/daaw/ol0;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_2

    const/4 p2, 0x2

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->q(II)V

    :cond_2
    return-void
.end method
