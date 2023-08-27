.class Lcom/daaw/avee/Common/VAsyncTask2$ThreadPerTaskExecutor;
.super Ljava/lang/Object;
.source "VAsyncTask2.java"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/VAsyncTask2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ThreadPerTaskExecutor"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Common/VAsyncTask2;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/VAsyncTask2;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTask2$ThreadPerTaskExecutor;->this$0:Lcom/daaw/avee/Common/VAsyncTask2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 18
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
