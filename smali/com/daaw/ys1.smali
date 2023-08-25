.class public final synthetic Lcom/daaw/ys1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Lcom/daaw/xs1$u;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/xs1$u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ys1;->a:Lcom/daaw/xs1$u;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ys1;->a:Lcom/daaw/xs1$u;

    invoke-interface {v0, p1, p2}, Lcom/daaw/xs1$u;->onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
