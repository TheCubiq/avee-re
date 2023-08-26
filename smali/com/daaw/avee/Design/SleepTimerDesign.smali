.class public Lcom/daaw/avee/Design/SleepTimerDesign;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    .line 32
    sget-object v0, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$1;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 52
    sget-object v0, Lcom/daaw/avee/MainActivity;->onMainUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$2;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 62
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerConfigChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$3;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 82
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerFire:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$4;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 90
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUISubmit:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$5;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 100
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$6;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 110
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestRemainingSeconds:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/SleepTimerDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SleepTimerDesign$7;-><init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 121
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepAtTime:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;

    iget-object v2, p0, Lcom/daaw/avee/Design/SleepTimerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic lambda$new$0()Lcom/daaw/avee/Common/Tuple2;
    .locals 3

    .line 123
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 124
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 126
    :cond_0
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getSleepAtTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getConfig()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
