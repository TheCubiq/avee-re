.class Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$2;
.super Ljava/lang/Object;
.source "SleepTimerDialog.java"

# interfaces
.implements Lcom/shawnlin/numberpicker/NumberPicker$OnValueChangeListener;


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

    .line 158
    iput-object p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$2;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Lcom/shawnlin/numberpicker/NumberPicker;II)V
    .locals 0

    .line 161
    iget-object p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$2;->this$0:Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p2}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->configure(ZZ)V

    return-void
.end method
