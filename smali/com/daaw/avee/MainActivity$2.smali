.class Lcom/daaw/avee/MainActivity$2;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4

    .line 180
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 217
    :cond_0
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick1:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 219
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 220
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 221
    iget-object v1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {v1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 203
    :cond_1
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 205
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 206
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 207
    iget-object v1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {v1}, Lcom/daaw/avee/MainActivity;->access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 184
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    iget p1, p1, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    if-ne p1, v1, :cond_3

    .line 185
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 186
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$2;->this$0:Lcom/daaw/avee/MainActivity;

    iget v1, p1, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/MainActivity;->showControls(ZI)V

    :cond_3
    :goto_0
    return v0
.end method
