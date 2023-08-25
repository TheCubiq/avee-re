.class public final Lcom/daaw/za3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;

.field public static final f:Lcom/daaw/ma3;

.field public static final g:Lcom/daaw/ma3;

.field public static final h:Lcom/daaw/ma3;

.field public static final i:Lcom/daaw/ma3;

.field public static final j:Lcom/daaw/ma3;

.field public static final k:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "gads:gma_attestation:click:macro_string"

    const-string v1, "@click_attok@"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:query_param"

    const-string v1, "attok"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:timeout"

    const-wide/16 v1, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:enable"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:enable_dynamite_version"

    const-wide/32 v2, 0xcbe6c14

    invoke-static {v0, v2, v3}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->e:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:qualification:enable"

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->f:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:image_hash"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->g:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:impression:enable"

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->h:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:request:enable_javascript"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->i:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:request:enable"

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->j:Lcom/daaw/ma3;

    const-string v0, "gads:gma_attestation:click:report_error"

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/za3;->k:Lcom/daaw/ma3;

    return-void
.end method
