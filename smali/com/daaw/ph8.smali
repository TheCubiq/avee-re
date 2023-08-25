.class public final Lcom/daaw/ph8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ga3;


# instance fields
.field public final synthetic a:Lcom/daaw/ia3;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/util/zzs;Lcom/daaw/ia3;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/ph8;->a:Lcom/daaw/ia3;

    iput-object p3, p0, Lcom/daaw/ph8;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/ph8;->c:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ph8;->a:Lcom/daaw/ia3;

    invoke-virtual {v0}, Lcom/daaw/ia3;->a()Lcom/daaw/eo;

    move-result-object v0

    new-instance v1, Lcom/daaw/co$a;

    invoke-direct {v1, v0}, Lcom/daaw/co$a;-><init>(Lcom/daaw/eo;)V

    invoke-virtual {v1}, Lcom/daaw/co$a;->a()Lcom/daaw/co;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/co;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/daaw/ph8;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/n08;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/daaw/ph8;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/ph8;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/co;->a(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/daaw/ph8;->a:Lcom/daaw/ia3;

    iget-object v1, p0, Lcom/daaw/ph8;->b:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/daaw/ia3;->f(Landroid/app/Activity;)V

    return-void
.end method
