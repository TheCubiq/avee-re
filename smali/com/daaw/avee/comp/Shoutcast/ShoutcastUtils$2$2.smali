.class Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2$2;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;

.field final synthetic val$task:Lcom/daaw/avee/Common/VAsyncTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;Lcom/daaw/avee/Common/VAsyncTask;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2$2;->this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;

    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2$2;->val$task:Lcom/daaw/avee/Common/VAsyncTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Ljava/lang/Boolean;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2$2;->val$task:Lcom/daaw/avee/Common/VAsyncTask;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/VAsyncTask;->isCancelled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 89
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2$2;->onInvoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
