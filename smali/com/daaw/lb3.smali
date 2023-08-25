.class public final Lcom/daaw/lb3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:separate_url_generation:enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lb3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:invoke_leibniz:enabled"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lb3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:google_ad_request_domains"

    const-string v1, "googleads.g.doubleclick.net;pubads.g.doubleclick.net"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lb3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:url_cache:max_size"

    const-wide/16 v1, 0xc8

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lb3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:use_request_id_as_url_cache_key:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lb3;->e:Lcom/daaw/ma3;

    return-void
.end method
