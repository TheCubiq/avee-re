.class public final Lcom/daaw/q13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Landroid/webkit/ValueCallback;

.field public final synthetic q:Lcom/daaw/i13;

.field public final synthetic r:Landroid/webkit/WebView;

.field public final synthetic s:Z

.field public final synthetic t:Lcom/daaw/s13;


# direct methods
.method public constructor <init>(Lcom/daaw/s13;Lcom/daaw/i13;Landroid/webkit/WebView;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/q13;->t:Lcom/daaw/s13;

    iput-object p2, p0, Lcom/daaw/q13;->q:Lcom/daaw/i13;

    iput-object p3, p0, Lcom/daaw/q13;->r:Landroid/webkit/WebView;

    iput-boolean p4, p0, Lcom/daaw/q13;->s:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/daaw/p13;

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/daaw/p13;-><init>(Lcom/daaw/q13;Lcom/daaw/i13;Landroid/webkit/WebView;Z)V

    iput-object p1, p0, Lcom/daaw/q13;->p:Landroid/webkit/ValueCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/q13;->r:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/q13;->r:Landroid/webkit/WebView;

    const-string v1, "(function() { return  {text:document.body.innerText}})();"

    iget-object v2, p0, Lcom/daaw/q13;->p:Landroid/webkit/ValueCallback;

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    iget-object v0, p0, Lcom/daaw/q13;->p:Landroid/webkit/ValueCallback;

    const-string v1, ""

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
