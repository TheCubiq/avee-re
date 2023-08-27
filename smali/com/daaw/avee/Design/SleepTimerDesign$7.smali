.class Lcom/daaw/avee/Design/SleepTimerDesign$7;
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
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$7;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Integer;
    .locals 1

    .line 113
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 116
    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->getRemainingSeconds()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 110
    invoke-virtual {p0}, Lcom/daaw/avee/Design/SleepTimerDesign$7;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
