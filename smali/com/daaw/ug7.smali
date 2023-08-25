.class public final Lcom/daaw/ug7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/ug7;

.field public static final c:Lcom/daaw/ug7;

.field public static final d:Lcom/daaw/ug7;

.field public static final e:Lcom/daaw/ug7;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ug7;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lcom/daaw/ug7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/ug7;->b:Lcom/daaw/ug7;

    new-instance v0, Lcom/daaw/ug7;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lcom/daaw/ug7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/ug7;->c:Lcom/daaw/ug7;

    new-instance v0, Lcom/daaw/ug7;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lcom/daaw/ug7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/ug7;->d:Lcom/daaw/ug7;

    new-instance v0, Lcom/daaw/ug7;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lcom/daaw/ug7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/ug7;->e:Lcom/daaw/ug7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ug7;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ug7;->a:Ljava/lang/String;

    return-object v0
.end method
