.class Lcom/daaw/avee/comp/IceCast/DownloadTask$2;
.super Ljava/lang/Object;
.source "DownloadTask.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


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
        "Lcom/daaw/avee/Common/Action1<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/DownloadTask;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask$2;->this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Ljava/lang/Integer;)V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/DownloadTask$2;->this$0:Lcom/daaw/avee/comp/IceCast/DownloadTask;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->access$000(Lcom/daaw/avee/comp/IceCast/DownloadTask;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 54
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask$2;->onInvoke(Ljava/lang/Integer;)V

    return-void
.end method
