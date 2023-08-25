.class public final Lcom/daaw/f84;
.super Lcom/daaw/g84;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/a74;Lcom/daaw/x33;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/g84;-><init>(Lcom/daaw/a74;Lcom/daaw/x33;Z)V

    return-void
.end method


# virtual methods
.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/g84;->G0(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
