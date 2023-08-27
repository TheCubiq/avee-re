.class Lcom/daaw/avee/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 153
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity$1;->invoke(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/String;)V
    .locals 2

    .line 157
    invoke-static {}, Lcom/daaw/avee/Common/UtilsUI;->IsUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/avee/Common/Boast;

    move-result-object p1

    .line 160
    invoke-virtual {p1}, Lcom/daaw/avee/Common/Boast;->show()V

    goto :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    new-instance v1, Lcom/daaw/avee/MainActivity$1$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/MainActivity$1$1;-><init>(Lcom/daaw/avee/MainActivity$1;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
