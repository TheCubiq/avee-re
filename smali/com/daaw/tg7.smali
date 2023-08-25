.class public final Lcom/daaw/tg7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/tg7;

.field public static final c:Lcom/daaw/tg7;

.field public static final d:Lcom/daaw/tg7;

.field public static final e:Lcom/daaw/tg7;

.field public static final f:Lcom/daaw/tg7;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/tg7;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lcom/daaw/tg7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/tg7;->b:Lcom/daaw/tg7;

    new-instance v0, Lcom/daaw/tg7;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lcom/daaw/tg7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/tg7;->c:Lcom/daaw/tg7;

    new-instance v0, Lcom/daaw/tg7;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lcom/daaw/tg7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/tg7;->d:Lcom/daaw/tg7;

    new-instance v0, Lcom/daaw/tg7;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lcom/daaw/tg7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/tg7;->e:Lcom/daaw/tg7;

    new-instance v0, Lcom/daaw/tg7;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lcom/daaw/tg7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/tg7;->f:Lcom/daaw/tg7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tg7;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg7;->a:Ljava/lang/String;

    return-object v0
.end method
