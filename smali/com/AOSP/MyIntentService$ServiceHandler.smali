.class public final Lcom/AOSP/MyIntentService$ServiceHandler;
.super Landroid/os/Handler;
.source "MyIntentService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/AOSP/MyIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "ServiceHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/AOSP/MyIntentService;


# direct methods
.method public constructor <init>(Lcom/AOSP/MyIntentService;Landroid/os/Looper;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/AOSP/MyIntentService$ServiceHandler;->this$0:Lcom/AOSP/MyIntentService;

    .line 59
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/AOSP/MyIntentService$ServiceHandler;->this$0:Lcom/AOSP/MyIntentService;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {v0, p1}, Lcom/AOSP/MyIntentService;->onHandleIntent(Landroid/content/Intent;)V

    return-void
.end method
