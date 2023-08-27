.class public Lcom/daaw/avee/comp/LibraryQueueUI/MyView;
.super Landroid/view/View;
.source "MyView.java"


# instance fields
.field private onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;

    return-void
.end method


# virtual methods
.method protected onSizeChanged(IIII)V
    .locals 10

    .line 29
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 31
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move v4, p1

    move v5, p2

    .line 32
    invoke-interface/range {v0 .. v9}, Landroid/view/View$OnLayoutChangeListener;->onLayoutChange(Landroid/view/View;IIIIIIII)V

    :cond_0
    return-void
.end method

.method public setOnSizeChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->onSizeChangedListener:Landroid/view/View$OnLayoutChangeListener;

    return-void
.end method
