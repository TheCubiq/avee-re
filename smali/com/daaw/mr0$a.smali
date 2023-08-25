.class public final Lcom/daaw/mr0$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mr0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/mr0;


# direct methods
.method public constructor <init>(Lcom/daaw/mr0;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mr0$a;->a:Lcom/daaw/mr0;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr0$a;->a:Lcom/daaw/mr0;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {v0, p1}, Lcom/daaw/mr0;->a(Landroid/content/Intent;)V

    return-void
.end method
