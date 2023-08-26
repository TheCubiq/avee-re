.class Lcom/daaw/avee/Design/SleepTimerDesign$6;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/SleepTimerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$6;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;
    .locals 1

    .line 103
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;-><init>()V

    return-object v0

    .line 106
    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getConfig()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 100
    invoke-virtual {p0}, Lcom/daaw/avee/Design/SleepTimerDesign$6;->invoke()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    move-result-object v0

    return-object v0
.end method
