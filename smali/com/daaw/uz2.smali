.class public final Lcom/daaw/uz2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/xb;

.field public static final b:Lcom/daaw/xb;

.field public static final c:Lcom/daaw/xb;

.field public static final d:Lcom/daaw/xb;

.field public static final e:Lcom/daaw/xb;

.field public static final f:Lcom/daaw/xb;

.field public static final g:Lcom/daaw/xb;

.field public static final h:Lcom/daaw/xb;

.field public static final i:Lcom/daaw/xb;

.field public static final j:Lcom/daaw/xb;

.field public static final k:Lcom/daaw/xb;

.field public static final l:Lcom/daaw/xb;

.field public static final m:Lcom/daaw/xb;

.field public static final n:Lcom/daaw/xb;

.field public static final o:Lcom/daaw/xb;

.field public static final p:Lcom/daaw/xb;

.field public static final q:Lcom/daaw/xb;

.field public static final r:Lcom/daaw/xb;

.field public static final s:Lcom/daaw/xb;

.field public static final t:Lcom/daaw/xb;

.field public static final u:Lcom/daaw/xb;

.field public static final v:Lcom/daaw/xb;

.field public static final w:Lcom/daaw/xb;

.field public static final x:Lcom/daaw/xb;

.field public static final y:Lcom/daaw/xb;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "Google Play In-app Billing API version is less than 3"

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->a:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "Google Play In-app Billing API version is less than 9"

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->b:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v1, "Billing service unavailable on device."

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->c:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "Client is already in the process of connecting to billing service."

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->d:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "The list of SKUs can\'t be empty."

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->e:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "SKU type can\'t be empty."

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->f:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "Product type can\'t be empty."

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->g:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v2, -0x2

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support extra params."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->h:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Invalid purchase token."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->i:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "An internal error occurred."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->j:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "SKU can\'t be null."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->k:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Service connection is disconnected."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    const/4 v3, -0x3

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Timeout communicating with service."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->n:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support subscriptions."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->o:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support subscriptions update."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->p:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support get purchase history."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->q:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support price change confirmation."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->r:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Play Store version installed does not support cross selling products."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->s:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support multi-item purchases."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->t:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support offer_id_token."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->u:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support ProductDetails."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->v:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v3, "Client does not support in-app messages."

    invoke-virtual {v0, v3}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->w:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v2, "Client does not support alternative billing."

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->x:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    const-string v1, "Unknown feature"

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    sput-object v0, Lcom/daaw/uz2;->y:Lcom/daaw/xb;

    return-void
.end method
