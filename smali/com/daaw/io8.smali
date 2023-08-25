.class public final Lcom/daaw/io8;
.super Landroid/os/Handler;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/so8;


# direct methods
.method public constructor <init>(Lcom/daaw/so8;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io8;->a:Lcom/daaw/so8;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/io8;->a:Lcom/daaw/so8;

    invoke-static {v0, p1}, Lcom/daaw/so8;->a(Lcom/daaw/so8;Landroid/os/Message;)V

    return-void
.end method
