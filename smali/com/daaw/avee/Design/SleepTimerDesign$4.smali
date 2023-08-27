.class Lcom/daaw/avee/Design/SleepTimerDesign$4;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/SleepTimerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$4;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 2

    .line 86
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
