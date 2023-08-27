.class Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;
.super Ljava/lang/Object;
.source "VAsyncTaskResultConvert.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "TFromResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

.field final synthetic val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/VAsyncTaskResultConvert;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;->this$0:Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

    iput-object p2, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;->val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFromResult;Z)V"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;->val$listener:Lcom/daaw/avee/Common/VAsyncTask$ResultListener;

    iget-object v1, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;->this$0:Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

    invoke-static {v1}, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->access$000(Lcom/daaw/avee/Common/VAsyncTaskResultConvert;)Lcom/daaw/avee/Common/Func/Func1;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/Common/VAsyncTask$ResultListener;->onResult(Ljava/lang/Object;Z)V

    return-void
.end method
