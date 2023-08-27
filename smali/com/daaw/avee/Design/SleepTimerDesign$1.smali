.class Lcom/daaw/avee/Design/SleepTimerDesign$1;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$1;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V
    .locals 3

    .line 35
    invoke-virtual {p2}, Lcom/daaw/avee/ContextData;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 38
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 39
    invoke-static {p2}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->createAndShowSleepTimerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0xa

    if-ne p1, p2, :cond_3

    .line 42
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    .line 45
    :cond_2
    invoke-virtual {p1}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getConfig()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    move-result-object p2

    const/4 v0, 0x0

    .line 46
    iget v1, p2, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->minutes:I

    invoke-virtual {p1}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getSleepAtTime()Ljava/util/Date;

    move-result-object v2

    iget-boolean p2, p2, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->playLastSongToEnd:Z

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->configure(ZILjava/util/Date;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 32
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/SleepTimerDesign$1;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V

    return-void
.end method
