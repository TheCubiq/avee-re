.class public final synthetic Lcom/daaw/b4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ii0$a;


# instance fields
.field public final synthetic p:Lcom/daaw/c4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b4;->p:Lcom/daaw/c4;

    return-void
.end method


# virtual methods
.method public final k(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b4;->p:Lcom/daaw/c4;

    invoke-virtual {v0, p1}, Lcom/daaw/c4;->k(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
