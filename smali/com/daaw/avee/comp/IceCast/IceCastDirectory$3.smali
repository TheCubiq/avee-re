.class Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;
.super Ljava/lang/Object;
.source "IceCastDirectory.java"

# interfaces
.implements Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->Refresh(Lcom/daaw/avee/Common/Action1;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

.field final synthetic val$onDone:Lcom/daaw/avee/Common/Action1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;->val$onDone:Lcom/daaw/avee/Common/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostExecute(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 138
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->access$002(J)J

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;->val$onDone:Lcom/daaw/avee/Common/Action1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
