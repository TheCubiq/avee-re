.class public final Lcom/daaw/o08;
.super Lcom/daaw/do;
.source ""


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lcom/daaw/ia3;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/do;-><init>()V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/daaw/o08;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/ComponentName;Lcom/daaw/bo;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/o08;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ia3;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/daaw/ia3;->c(Lcom/daaw/bo;)V

    :cond_0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/o08;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ia3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ia3;->d()V

    :cond_0
    return-void
.end method
