.class public final Lcom/daaw/wq8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/or8;


# instance fields
.field public final a:Lcom/daaw/vq8;

.field public final b:Lcom/daaw/m36;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/q09;)V
    .locals 1

    new-instance v0, Lcom/daaw/sb6;

    invoke-direct {v0, p1}, Lcom/daaw/sb6;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/wq8;->b:Lcom/daaw/m36;

    new-instance p1, Lcom/daaw/vq8;

    invoke-direct {p1, p2}, Lcom/daaw/vq8;-><init>(Lcom/daaw/q09;)V

    iput-object p1, p0, Lcom/daaw/wq8;->a:Lcom/daaw/vq8;

    invoke-virtual {p1, v0}, Lcom/daaw/vq8;->a(Lcom/daaw/m36;)V

    return-void
.end method
