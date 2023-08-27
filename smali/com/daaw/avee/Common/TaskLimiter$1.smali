.class Lcom/daaw/avee/Common/TaskLimiter$1;
.super Ljava/lang/Object;
.source "TaskLimiter.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Common/TaskLimiter;->RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Common/TaskLimiter;

.field final synthetic val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/TaskLimiter;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/daaw/avee/Common/TaskLimiter$1;->this$0:Lcom/daaw/avee/Common/TaskLimiter;

    iput-object p2, p0, Lcom/daaw/avee/Common/TaskLimiter$1;->val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;Z)V"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter$1;->this$0:Lcom/daaw/avee/Common/TaskLimiter;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->access$002(Lcom/daaw/avee/Common/TaskLimiter;Lcom/daaw/avee/Common/IVAsyncTask;)Lcom/daaw/avee/Common/IVAsyncTask;

    .line 38
    iget-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter$1;->this$0:Lcom/daaw/avee/Common/TaskLimiter;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/TaskLimiter;->access$102(Lcom/daaw/avee/Common/TaskLimiter;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter$1;->val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/Common/VAsyncTask$ResultListener;->onResult(Ljava/lang/Object;Z)V

    return-void
.end method
