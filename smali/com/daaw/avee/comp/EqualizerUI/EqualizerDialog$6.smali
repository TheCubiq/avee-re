.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$900(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 221
    check-cast p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;->invoke(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V

    return-void
.end method
