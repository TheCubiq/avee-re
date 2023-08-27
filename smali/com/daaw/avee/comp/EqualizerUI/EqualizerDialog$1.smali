.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 73
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$000(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/ScrollView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->requestDisallowInterceptTouchEvent(Z)V

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$100(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->requestDisallowInterceptTouchEvent(Z)V

    .line 83
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
