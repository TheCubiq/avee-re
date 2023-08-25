.class public final synthetic Lcom/daaw/cv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c15;


# instance fields
.field public final synthetic a:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cv5;->a:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 1

    iget-object p3, p0, Lcom/daaw/cv5;->a:Lcom/daaw/tq5;

    :try_start_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    invoke-virtual {v0, p1}, Lcom/daaw/oj6;->A(Z)V

    iget-object p1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/oj6;

    invoke-virtual {p1, p2}, Lcom/daaw/oj6;->E(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/b15;

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/daaw/b15;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
