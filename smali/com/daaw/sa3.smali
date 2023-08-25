.class public final Lcom/daaw/sa3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;

.field public static final f:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "gads:content_age_weight"

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:enable_content_fetching"

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:fingerprint_number"

    const-wide/16 v3, 0xa

    invoke-static {v0, v3, v4}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:content_length_weight"

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:min_content_len"

    const-wide/16 v1, 0xb

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->e:Lcom/daaw/ma3;

    const-string v0, "gads:sleep_sec"

    invoke-static {v0, v3, v4}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/sa3;->f:Lcom/daaw/ma3;

    return-void
.end method
