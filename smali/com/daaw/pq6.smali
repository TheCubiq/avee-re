.class public final Lcom/daaw/pq6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/webkit/WebView;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/qq6;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/pq6;->p:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/daaw/pq6;->q:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pq6;->p:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/daaw/pq6;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
