.class public final Lcom/daaw/ye7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/sc7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/vd7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ye7;->a:Landroid/content/Context;

    new-instance p1, Lcom/daaw/sc7;

    invoke-direct {p1, p0, p2, p3}, Lcom/daaw/sc7;-><init>(Lcom/daaw/ye7;Landroid/os/Handler;Lcom/daaw/vd7;)V

    iput-object p1, p0, Lcom/daaw/ye7;->b:Lcom/daaw/sc7;

    return-void
.end method
