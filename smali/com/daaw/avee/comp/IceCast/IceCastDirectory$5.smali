.class Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;
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

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Landroid/content/Context;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0

    .line 162
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 165
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->val$context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    iget-object v2, v2, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->access$100(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
