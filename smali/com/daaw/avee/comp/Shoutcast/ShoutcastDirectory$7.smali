.class Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;
.super Ljava/lang/Object;
.source "ShoutcastDirectory.java"

# interfaces
.implements Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->downloadResponseToFile(Lcom/daaw/avee/Common/TaskLimiter;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Action2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

.field final synthetic val$onDone:Lcom/daaw/avee/Common/Action2;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Lcom/daaw/avee/Common/Action2;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;->this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;->val$onDone:Lcom/daaw/avee/Common/Action2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostExecute(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 386
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 390
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;->val$onDone:Lcom/daaw/avee/Common/Action2;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Lcom/daaw/avee/Common/Action2;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
