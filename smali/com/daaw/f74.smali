.class public final Lcom/daaw/f74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Lcom/daaw/h74;


# direct methods
.method public constructor <init>(Lcom/daaw/h74;Ljava/util/List;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f74;->d:Lcom/daaw/h74;

    iput-object p2, p0, Lcom/daaw/f74;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/f74;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/f74;->c:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lcom/daaw/f74;->d:Lcom/daaw/h74;

    iget-object v1, p0, Lcom/daaw/f74;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/f74;->b:Ljava/lang/String;

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/h74;->W(Lcom/daaw/h74;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/f74;->c:Landroid/net/Uri;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to parse gmsg params for: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void
.end method
