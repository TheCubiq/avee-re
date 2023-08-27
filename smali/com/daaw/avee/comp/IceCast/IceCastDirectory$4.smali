.class Lcom/daaw/avee/comp/IceCast/IceCastDirectory$4;
.super Ljava/lang/Object;
.source "IceCastDirectory.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->getCachedEntries()Lcom/daaw/avee/Common/VAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$TaskListener<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$4;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0

    .line 154
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$4;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TV;>;)TV;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
