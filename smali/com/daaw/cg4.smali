.class public final Lcom/daaw/cg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kf4;


# instance fields
.field public final a:Lcom/daaw/dh5;


# direct methods
.method public constructor <init>(Lcom/daaw/dh5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cg4;->a:Lcom/daaw/dh5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 2

    const-string v0, "test_mode_enabled"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/cg4;->a:Lcom/daaw/dh5;

    const-string v1, "true"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/dh5;->m(Z)V

    return-void
.end method
