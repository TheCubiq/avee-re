.class public Lcom/daaw/gl1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/gl1;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/gl1;


# direct methods
.method public constructor <init>(Lcom/daaw/gl1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gl1$a;->p:Lcom/daaw/gl1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 0

    iget p1, p1, Landroid/os/Message;->what:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gl1$a;->p:Lcom/daaw/gl1;

    invoke-static {p1}, Lcom/daaw/gr1;->k(Landroid/widget/PopupWindow;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
