.class Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;
.super Ljava/lang/Object;
.source "SleepTimerDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->access$000(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 93
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    const-wide/16 v3, 0x3e8

    div-long/2addr v0, v3

    long-to-int v1, v0

    invoke-static {v2, v1}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->access$102(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;I)I

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->updateTxt()V

    .line 96
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->access$300(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-static {v1}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->access$200(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v4}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
