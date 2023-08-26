.class Lcom/daaw/avee/comp/IceCast/DownloadTask$1;
.super Ljava/lang/Object;
.source "DownloadTask.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/DownloadTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/DownloadTask;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask$1;->this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Ljava/lang/Boolean;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask$1;->this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->isCancelled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/daaw/avee/comp/IceCast/DownloadTask$1;->onInvoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
