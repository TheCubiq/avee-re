.class public final Lcom/daaw/o03;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/r03;


# direct methods
.method public constructor <init>(Lcom/daaw/r03;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o03;->a:Lcom/daaw/r03;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/o03;->a:Lcom/daaw/r03;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Lcom/daaw/r03;->b(Lcom/daaw/r03;I)V

    return-void
.end method
