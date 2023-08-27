.class Lcom/daaw/avee/Common/OnSwipeTouchDisallowParentListener;
.super Ljava/lang/Object;
.source "OnSwipeTouchDisallowListener.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field disallowParent:Landroid/view/ViewParent;


# direct methods
.method public constructor <init>(Landroid/view/ViewParent;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/daaw/avee/Common/OnSwipeTouchDisallowParentListener;->disallowParent:Landroid/view/ViewParent;

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/Common/OnSwipeTouchDisallowParentListener;->disallowParent:Landroid/view/ViewParent;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
