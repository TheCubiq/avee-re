.class public final Lcom/daaw/oa3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:afs:csa_send_tcf_data"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/oa3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:afs:csa_tcf_data_to_collect"

    const-string v1, "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/oa3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:afs:csa_webview_custom_domain_param_key"

    const-string v1, "csa_customDomain"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/oa3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:afs:csa_webview_static_file_path"

    const-string v1, "/afs/ads/i/webview.html"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/oa3;->d:Lcom/daaw/ma3;

    return-void
.end method
