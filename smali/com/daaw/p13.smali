.class public final synthetic Lcom/daaw/p13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lcom/daaw/q13;

.field public final synthetic b:Lcom/daaw/i13;

.field public final synthetic c:Landroid/webkit/WebView;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/q13;Lcom/daaw/i13;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p13;->a:Lcom/daaw/q13;

    iput-object p2, p0, Lcom/daaw/p13;->b:Lcom/daaw/i13;

    iput-object p3, p0, Lcom/daaw/p13;->c:Landroid/webkit/WebView;

    iput-boolean p4, p0, Lcom/daaw/p13;->d:Z

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/p13;->a:Lcom/daaw/q13;

    iget-object v1, p0, Lcom/daaw/p13;->b:Lcom/daaw/i13;

    iget-object v2, p0, Lcom/daaw/p13;->c:Landroid/webkit/WebView;

    iget-boolean v3, p0, Lcom/daaw/p13;->d:Z

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/q13;->t:Lcom/daaw/s13;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/daaw/s13;->d(Lcom/daaw/i13;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void
.end method
