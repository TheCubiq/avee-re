.class public final Lcom/daaw/qp2;
.super Landroid/os/Handler;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/rp2;


# direct methods
.method public constructor <init>(Lcom/daaw/rp2;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qp2;->a:Lcom/daaw/rp2;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qp2;->a:Lcom/daaw/rp2;

    invoke-virtual {v0, p1}, Lcom/daaw/rp2;->b(Landroid/os/Message;)V

    return-void
.end method
