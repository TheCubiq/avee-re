.class public Lcom/daaw/rp;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/tm;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Lcom/daaw/hn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn1<",
            "Lcom/daaw/lm;",
            "[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/daaw/i41;

.field public final b:Lcom/daaw/hn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn1<",
            "Lcom/daaw/lm;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/tm;

    invoke-direct {v0}, Lcom/daaw/tm;-><init>()V

    sput-object v0, Lcom/daaw/rp;->c:Lcom/daaw/tm;

    const-string v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    invoke-static {v0, v1}, Lcom/daaw/rp;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/rp;->d:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string v1, "IayrSTFL9eJ69YeSUO2"

    invoke-static {v0, v1}, Lcom/daaw/rp;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/rp;->e:Ljava/lang/String;

    sget-object v0, Lcom/daaw/qp;->a:Lcom/daaw/qp;

    sput-object v0, Lcom/daaw/rp;->f:Lcom/daaw/hn1;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/i41;Lcom/daaw/hn1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i41;",
            "Lcom/daaw/hn1<",
            "Lcom/daaw/lm;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rp;->a:Lcom/daaw/i41;

    iput-object p2, p0, Lcom/daaw/rp;->b:Lcom/daaw/hn1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/lm;)[B
    .locals 0

    invoke-static {p0}, Lcom/daaw/rp;->d(Lcom/daaw/lm;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/daaw/zb1;Lcom/daaw/fu0;)Lcom/daaw/rp;
    .locals 4

    invoke-static {p0}, Lcom/daaw/xn1;->f(Landroid/content/Context;)V

    invoke-static {}, Lcom/daaw/xn1;->c()Lcom/daaw/xn1;

    move-result-object p0

    new-instance v0, Lcom/daaw/ed;

    sget-object v1, Lcom/daaw/rp;->d:Ljava/lang/String;

    sget-object v2, Lcom/daaw/rp;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/daaw/ed;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/xn1;->g(Lcom/daaw/lt;)Lcom/daaw/tn1;

    move-result-object p0

    const-class v0, Lcom/daaw/lm;

    const-string v1, "json"

    invoke-static {v1}, Lcom/daaw/bx;->b(Ljava/lang/String;)Lcom/daaw/bx;

    move-result-object v1

    sget-object v2, Lcom/daaw/rp;->f:Lcom/daaw/hn1;

    const-string v3, "FIREBASE_CRASHLYTICS_REPORT"

    invoke-interface {p0, v3, v0, v1, v2}, Lcom/daaw/tn1;->a(Ljava/lang/String;Ljava/lang/Class;Lcom/daaw/bx;Lcom/daaw/hn1;)Lcom/daaw/qn1;

    move-result-object p0

    new-instance v0, Lcom/daaw/i41;

    invoke-interface {p1}, Lcom/daaw/zb1;->b()Lcom/daaw/tb1;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/i41;-><init>(Lcom/daaw/qn1;Lcom/daaw/tb1;Lcom/daaw/fu0;)V

    new-instance p0, Lcom/daaw/rp;

    invoke-direct {p0, v0, v2}, Lcom/daaw/rp;-><init>(Lcom/daaw/i41;Lcom/daaw/hn1;)V

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/lm;)[B
    .locals 1

    sget-object v0, Lcom/daaw/rp;->c:Lcom/daaw/tm;

    invoke-virtual {v0, p0}, Lcom/daaw/tm;->E(Lcom/daaw/lm;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method public c(Lcom/daaw/zm;Z)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zm;",
            "Z)",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/zm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/rp;->a:Lcom/daaw/i41;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/i41;->i(Lcom/daaw/zm;Z)Lcom/daaw/tj1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
