.class Lcom/daaw/avee/comp/SleepTimer/SleepTimer$1;
.super Ljava/util/TimerTask;
.source "SleepTimer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->configure(ZILjava/util/Date;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimer;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimer;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    invoke-static {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->access$000(Lcom/daaw/avee/comp/SleepTimer/SleepTimer;)V

    return-void
.end method
