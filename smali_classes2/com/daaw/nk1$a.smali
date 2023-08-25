.class public Lcom/daaw/nk1$a;
.super Lcom/daaw/kk1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nk1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nk1;


# direct methods
.method public constructor <init>(Lcom/daaw/nk1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nk1$a;->a:Lcom/daaw/nk1;

    invoke-direct {p0}, Lcom/daaw/kk1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/nk1$a;->a:Lcom/daaw/nk1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/daaw/nk1;->a(Lcom/daaw/nk1;Z)Z

    iget-object p1, p0, Lcom/daaw/nk1$a;->a:Lcom/daaw/nk1;

    invoke-static {p1}, Lcom/daaw/nk1;->b(Lcom/daaw/nk1;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/nk1$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/nk1$b;->a()V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/nk1$a;->a:Lcom/daaw/nk1;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/daaw/nk1;->a(Lcom/daaw/nk1;Z)Z

    iget-object p1, p0, Lcom/daaw/nk1$a;->a:Lcom/daaw/nk1;

    invoke-static {p1}, Lcom/daaw/nk1;->b(Lcom/daaw/nk1;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/nk1$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/nk1$b;->a()V

    :cond_1
    return-void
.end method
