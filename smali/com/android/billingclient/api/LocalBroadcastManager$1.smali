.class Lcom/android/billingclient/api/LocalBroadcastManager$1;
.super Landroid/os/Handler;
.source "LocalBroadcastManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/LocalBroadcastManager;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/billingclient/api/LocalBroadcastManager;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/LocalBroadcastManager;Landroid/os/Looper;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/android/billingclient/api/LocalBroadcastManager$1;->this$0:Lcom/android/billingclient/api/LocalBroadcastManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 112
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 117
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 114
    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/LocalBroadcastManager$1;->this$0:Lcom/android/billingclient/api/LocalBroadcastManager;

    invoke-static {p1}, Lcom/android/billingclient/api/LocalBroadcastManager;->access$000(Lcom/android/billingclient/api/LocalBroadcastManager;)V

    :goto_0
    return-void
.end method
