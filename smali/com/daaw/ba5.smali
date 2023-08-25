.class public final synthetic Lcom/daaw/ba5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic p:Lcom/daaw/ha5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ha5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ba5;->p:Lcom/daaw/ha5;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ba5;->p:Lcom/daaw/ha5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ha5;->h(Landroid/view/View;Landroid/view/MotionEvent;)Z

    const/4 p1, 0x0

    return p1
.end method
