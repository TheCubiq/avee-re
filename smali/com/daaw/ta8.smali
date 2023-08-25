.class public final Lcom/daaw/ta8;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/wa8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wa8;Lcom/daaw/qa8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ta8;->a:Lcom/daaw/wa8;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ta8;->a:Lcom/daaw/wa8;

    invoke-static {p1}, Lcom/daaw/wa8;->c(Lcom/daaw/wa8;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Lcom/daaw/oa8;

    invoke-direct {v0, p1}, Lcom/daaw/oa8;-><init>(Lcom/daaw/wa8;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
