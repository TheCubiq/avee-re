.class Lcom/daaw/avee/Design/SleepTimerDesign$5;
.super Ljava/lang/Object;
.source "SleepTimerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/util/Date;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SleepTimerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SleepTimerDesign;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/daaw/avee/Design/SleepTimerDesign$5;->this$0:Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Boolean;)V
    .locals 1

    .line 93
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 96
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->configure(ZILjava/util/Date;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 90
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/util/Date;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/SleepTimerDesign$5;->invoke(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Boolean;)V

    return-void
.end method
