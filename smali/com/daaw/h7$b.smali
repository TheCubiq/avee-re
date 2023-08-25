.class public final Lcom/daaw/h7$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/h7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/h7;


# direct methods
.method public constructor <init>(Lcom/daaw/h7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h7$b;->a:Lcom/daaw/h7;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h7;Lcom/daaw/h7$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/h7$b;-><init>(Lcom/daaw/h7;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p2}, Lcom/daaw/g7;->b(Landroid/content/Intent;)Lcom/daaw/g7;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/h7$b;->a:Lcom/daaw/h7;

    iget-object p2, p2, Lcom/daaw/h7;->d:Lcom/daaw/g7;

    invoke-virtual {p1, p2}, Lcom/daaw/g7;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/h7$b;->a:Lcom/daaw/h7;

    iput-object p1, p2, Lcom/daaw/h7;->d:Lcom/daaw/g7;

    invoke-static {p2}, Lcom/daaw/h7;->a(Lcom/daaw/h7;)Lcom/daaw/h7$c;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/daaw/h7$c;->a(Lcom/daaw/g7;)V

    :cond_0
    return-void
.end method
