.class Lcom/daaw/avee/MainActivity$1$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity$1;->invoke(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/MainActivity$1;

.field final synthetic val$textMsg:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity$1;Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$1$1;->this$1:Lcom/daaw/avee/MainActivity$1;

    iput-object p2, p0, Lcom/daaw/avee/MainActivity$1$1;->val$textMsg:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$1$1;->this$1:Lcom/daaw/avee/MainActivity$1;

    iget-object v0, v0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$1$1;->this$1:Lcom/daaw/avee/MainActivity$1;

    iget-object v0, v0, Lcom/daaw/avee/MainActivity$1;->this$0:Lcom/daaw/avee/MainActivity;

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$1$1;->val$textMsg:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/avee/Common/Boast;

    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lcom/daaw/avee/Common/Boast;->show()V

    :cond_0
    return-void
.end method
