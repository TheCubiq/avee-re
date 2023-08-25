.class public final Lcom/daaw/zq6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Landroid/webkit/WebView;

.field public final synthetic q:Lcom/daaw/ar6;


# direct methods
.method public constructor <init>(Lcom/daaw/ar6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zq6;->q:Lcom/daaw/ar6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ar6;->l(Lcom/daaw/ar6;)Landroid/webkit/WebView;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zq6;->p:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zq6;->p:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method
