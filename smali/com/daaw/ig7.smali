.class public final synthetic Lcom/daaw/ig7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sd7;


# static fields
.field public static final synthetic a:Lcom/daaw/ig7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ig7;

    invoke-direct {v0}, Lcom/daaw/ig7;-><init>()V

    sput-object v0, Lcom/daaw/ig7;->a:Lcom/daaw/ig7;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;
    .locals 6

    sget v0, Lcom/daaw/jg7;->f:I

    move-object v0, p1

    check-cast v0, Lcom/daaw/ef7;

    invoke-virtual {v0}, Lcom/daaw/ef7;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/daaw/ef7;

    invoke-virtual {v0}, Lcom/daaw/ef7;->d()Lcom/daaw/yq7;

    move-result-object v0

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/zh7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/zh7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zh7;->L()I

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Lcom/daaw/yf7;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/daaw/yf7;-><init>(Lcom/daaw/xf7;)V

    invoke-virtual {v0}, Lcom/daaw/zh7;->Q()Lcom/daaw/yq7;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/yq7;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/daaw/yf7;->a(I)Lcom/daaw/yf7;

    invoke-virtual {v0}, Lcom/daaw/zh7;->P()Lcom/daaw/ii7;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/ii7;->L()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/daaw/yf7;->b(I)Lcom/daaw/yf7;

    move-object v3, p1

    check-cast v3, Lcom/daaw/ef7;

    invoke-virtual {v3}, Lcom/daaw/ef7;->c()Lcom/daaw/zn7;

    move-result-object v3

    sget-object v4, Lcom/daaw/zn7;->q:Lcom/daaw/zn7;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    sget-object v3, Lcom/daaw/cg7;->c:Lcom/daaw/cg7;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v3}, Lcom/daaw/zn7;->zza()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v3, Lcom/daaw/cg7;->e:Lcom/daaw/cg7;

    goto :goto_0

    :cond_2
    sget-object v3, Lcom/daaw/cg7;->d:Lcom/daaw/cg7;

    goto :goto_0

    :cond_3
    sget-object v3, Lcom/daaw/cg7;->b:Lcom/daaw/cg7;

    :goto_0
    invoke-virtual {v1, v3}, Lcom/daaw/yf7;->c(Lcom/daaw/cg7;)Lcom/daaw/yf7;

    invoke-virtual {v1}, Lcom/daaw/yf7;->d()Lcom/daaw/eg7;

    move-result-object v1

    new-instance v3, Lcom/daaw/rf7;

    invoke-direct {v3, v2}, Lcom/daaw/rf7;-><init>(Lcom/daaw/qf7;)V

    invoke-virtual {v3, v1}, Lcom/daaw/rf7;->c(Lcom/daaw/eg7;)Lcom/daaw/rf7;

    invoke-virtual {v0}, Lcom/daaw/zh7;->Q()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->j()[B

    move-result-object v0

    invoke-static {v0, p2}, Lcom/daaw/eq7;->b([BLcom/daaw/x97;)Lcom/daaw/eq7;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/daaw/rf7;->a(Lcom/daaw/eq7;)Lcom/daaw/rf7;

    check-cast p1, Lcom/daaw/ef7;

    invoke-virtual {p1}, Lcom/daaw/ef7;->e()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/daaw/rf7;->b(Ljava/lang/Integer;)Lcom/daaw/rf7;

    invoke-virtual {v3}, Lcom/daaw/rf7;->d()Lcom/daaw/tf7;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing AesCmacKey failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to AesCmacParameters.parseParameters"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
