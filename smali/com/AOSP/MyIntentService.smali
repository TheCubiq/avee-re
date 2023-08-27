.class public abstract Lcom/AOSP/MyIntentService;
.super Landroid/app/Service;
.source "MyIntentService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/AOSP/MyIntentService$ServiceHandler;
    }
.end annotation


# instance fields
.field private mName:Ljava/lang/String;

.field private mRedelivery:Z

.field protected volatile mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

.field private volatile mServiceLooper:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/AOSP/MyIntentService;->mName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    .line 105
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 106
    new-instance v0, Landroid/os/HandlerThread;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IntentService["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/AOSP/MyIntentService;->mName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 109
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/AOSP/MyIntentService;->mServiceLooper:Landroid/os/Looper;

    .line 110
    new-instance v0, Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/AOSP/MyIntentService;->mServiceLooper:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;-><init>(Lcom/AOSP/MyIntentService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/AOSP/MyIntentService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/AOSP/MyIntentService;->mServiceLooper:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    return-void
.end method

.method protected abstract onHandleIntent(Landroid/content/Intent;)V
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/AOSP/MyIntentService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    invoke-virtual {v0}, Lcom/AOSP/MyIntentService$ServiceHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 116
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 117
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 118
    iget-object p1, p0, Lcom/AOSP/MyIntentService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    invoke-virtual {p1, v0}, Lcom/AOSP/MyIntentService$ServiceHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 130
    invoke-virtual {p0, p1, p3}, Lcom/AOSP/MyIntentService;->onStart(Landroid/content/Intent;I)V

    .line 131
    iget-boolean p1, p0, Lcom/AOSP/MyIntentService;->mRedelivery:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    return p1
.end method

.method public setIntentRedelivery(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lcom/AOSP/MyIntentService;->mRedelivery:Z

    return-void
.end method
