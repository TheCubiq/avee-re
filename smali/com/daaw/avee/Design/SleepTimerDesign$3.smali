.class Lcom/daaw/avee/Design/SleepTimerDesign$3;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$3;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 1

    .line 67
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;-><init>()V

    .line 68
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->enabled:Z

    .line 69
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->minutes:I

    .line 70
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->playLastSongToEnd:Z

    .line 72
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 77
    iget-boolean p2, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->enabled:Z

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/MainActivity;->updateSleepTimerIndicatorTh(ZZ)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 62
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/SleepTimerDesign$3;->invoke(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
